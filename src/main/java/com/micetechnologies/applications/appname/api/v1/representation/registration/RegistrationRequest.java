package com.micetechnologies.applications.appname.api.v1.representation.registration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.micetechnologies.applications.appname.api.v1.representation.common.BaseRequest;

import java.io.Serializable;

/**
 * Created by jgonzalez on 9/9/15.
 */
@JsonRootName("user")
public class RegistrationRequest extends BaseRequest {
    private final String USER_NAME_KEY = "name";
    private final String EMAIL_KEY = "email";
    private final String PASSWORD = "password";
    private final String PASSWORD_CONFIRMATION = "password_confirmation";

    public RegistrationRequest(){
        addKey(USER_NAME_KEY,String.class,false);
        addKey(EMAIL_KEY, String.class, false);
        addKey(PASSWORD, String.class, false);
        addKey(PASSWORD_CONFIRMATION, String.class, true);
    }

    @JsonProperty(value = "name", required = true)
    public void setUserName(String userName){
        addField(USER_NAME_KEY, userName);
    }

    @JsonIgnore
    public String getUserName(){
        return (String) getField(USER_NAME_KEY);
    }

    @JsonProperty(value = "email", required = true)
    public void setEmail(String email){
        addField(EMAIL_KEY, email);
    }

    @JsonIgnore
    public String getEmail(){
        return (String) getField(EMAIL_KEY);
    }

    @JsonProperty(value = "password", required = true)
    public void setPassword(String password){
        addField(PASSWORD, password);
    }

    @JsonIgnore
    public String getPassword(){
        return (String) getField(PASSWORD);
    }

    @JsonProperty(value = "password_confirmation", required = false)
    public void setPasswordConfirmation(String passwordConfirm){
        addField(PASSWORD_CONFIRMATION, passwordConfirm);
    }

    @JsonIgnore
    public String getPasswordConfirmation(){
        return (String) getField(PASSWORD_CONFIRMATION);
    }

}
