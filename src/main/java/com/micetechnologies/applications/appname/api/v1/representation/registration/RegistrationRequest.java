package com.micetechnologies.applications.appname.api.v1.representation.registration;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

/**
 * Created by jgonzalez on 9/9/15.
 */
@JsonRootName("user")
public class RegistrationRequest {
    private final String USER_NAME_KEY = "name";
    private final String EMAIL_KEY = "email";
    private final String PASSWORD = "password";



}
