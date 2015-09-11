package com.micetechnologies.applications.appname.api.v1.controller;

import com.micetechnologies.applications.appname.api.v1.V1_BaseClass;
import com.micetechnologies.applications.appname.api.v1.representation.profile.ProfileResponse;
import com.micetechnologies.applications.appname.api.v1.representation.registration.RegistrationRequest;
import com.micetechnologies.applications.appname.user.dto.RegistrationForm;
import com.micetechnologies.applications.appname.user.model.User;
import com.micetechnologies.applications.appname.user.service.DuplicateEmailException;
import com.micetechnologies.applications.appname.user.service.UserService;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by jgonzalez on 9/9/15.
 */
@Controller("API")
public class RegistrationController extends V1_BaseClass{

    @Autowired
    UserService service;

    @RequestMapping(value = "/"+VERSION +"/registration", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    ProfileResponse create(@RequestBody RegistrationRequest request, HttpRequest httpRequest, HttpResponse httpResponse){
        RegistrationForm userAccountData = new RegistrationForm();
        userAccountData.setEmail(request.getEmail());
        userAccountData.setFirstName(request.getUserName());
        userAccountData.setPassword(request.getPassword());
        if(!StringUtils.isEmpty(request.getPasswordConfirmation()))
            userAccountData.setPasswordVerification(request.getPasswordConfirmation());
        else
            userAccountData.setPasswordVerification(request.getPassword());

        try {
            User newUser = service.registerNewUserAccount(userAccountData);

        } catch (DuplicateEmailException e) {
            httpResponse.setStatusCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
        return new ProfileResponse();
    }

}
