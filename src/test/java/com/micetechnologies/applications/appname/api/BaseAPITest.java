package com.micetechnologies.applications.appname.api;

import com.micetechnologies.applications.appname.BaseTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by jgonzalez on 9/11/15.
 */

@ContextConfiguration(locations = { "classpath:TestContext-api.xml" })
public abstract class BaseAPITest extends BaseTest {
}
