package com.micetechnologies.applications.appname.api.V1.controller;

import com.micetechnologies.applications.appname.api.BaseAPITest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by jgonzalez on 9/11/15.
 */

public abstract class BaseControllerTest extends BaseAPITest {
    protected MockMvc mockMvc;
    protected final String VERSION_V1 = "/v1";
}
