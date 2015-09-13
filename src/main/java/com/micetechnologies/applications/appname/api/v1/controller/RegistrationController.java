package com.micetechnologies.applications.appname.api.v1.controller;

import com.micetechnologies.applications.appname.api.v1.V1_BaseClass;
import com.micetechnologies.applications.appname.api.v1.mapper.RegistrationMapper;
import com.micetechnologies.applications.appname.api.v1.representation.profile.ProfileResponse;
import com.micetechnologies.applications.appname.api.v1.representation.registration.RegistrationRequest;
import com.micetechnologies.applications.appname.user.dto.RegistrationForm;
import com.micetechnologies.applications.appname.user.model.User;
import com.micetechnologies.applications.appname.user.service.DuplicateEmailException;
import com.micetechnologies.applications.appname.user.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
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
//@RequestMapping(value = "/v1/registration")
public class RegistrationController extends V1_BaseClass{
    @Autowired
    RegistrationMapper mapper;

    @Autowired
    UserService service;

    @RequestMapping(value = "/v1/registration", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    ProfileResponse create(@RequestBody RegistrationRequest request, HttpServletRequest httpRequest, HttpServletResponse httpResponse){
        RegistrationForm userAccountData = new RegistrationForm();
        if (request.getUser() == null) return null;
        userAccountData.setEmail(request.getUser().getEmail());
        userAccountData.setFirstName(request.getUser().getUserName());
        userAccountData.setPassword(request.getUser().getPassword());
        if(!StringUtils.isEmpty(request.getUser().getPasswordConfirmation()))
            userAccountData.setPasswordVerification(request.getUser().getPasswordConfirmation());
        else
            userAccountData.setPasswordVerification(request.getUser().getPassword());
        User newUser = null;
        try {
            newUser = service.registerNewUserAccount(userAccountData);
            if (newUser != null){
                return mapper.mapUserToProfile(newUser);
            }

        } catch (DuplicateEmailException e) {
            httpResponse.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
        return  null;
    }

}
