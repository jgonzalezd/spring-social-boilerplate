package com.micetechnologies.applications.appname.api.controller;

import com.micetechnologies.applications.appname.api.v1.controller.RegistrationController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Created by jgonzalez on 9/10/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:TestContext.xml" })
public class RegistrationCreateTest extends AbstractTransactionalJUnit4SpringContextTests {

    private final String VERSION_V1 = "/v1";

    private MockMvc mockMvc;

    private String URI = VERSION_V1+"/registration";

    @Autowired
    private RegistrationController controller;

    private String json;

    @Before
    public void setUp(){
        //json = getFile("registration.json");
    }

    @Test
    public void newRegistrationTest() throws Exception {
        /*MvcResult mvcResult = mockMvc.perform(post(URI).content(json).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andReturn()
                ;*/
    }

}
