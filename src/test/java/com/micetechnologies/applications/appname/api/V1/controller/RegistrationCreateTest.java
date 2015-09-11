package com.micetechnologies.applications.appname.api.V1.controller;

import com.micetechnologies.applications.appname.api.v1.controller.RegistrationController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by jgonzalez on 9/10/15.
 */

public class RegistrationCreateTest extends BaseControllerTest {

    private String URI = VERSION_V1+"/registration";

    @Autowired
    @Qualifier("API")
    private RegistrationController controller;

    private String json;

    @Before
    public void setUp(){
        json = getFile("request/registration.json");
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void newRegistrationTest() throws Exception {
        MvcResult mvcResult = mockMvc.perform(post(URI).content(json).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn()
                ;
    }

}
