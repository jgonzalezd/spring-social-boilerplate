package com.micetechnologies.applications.appname.api.v1.controller;

import com.micetechnologies.applications.appname.api.v1.V1_BaseClass;
import com.micetechnologies.applications.appname.api.v1.representation.registration.RegistrationRequest;
import com.micetechnologies.applications.appname.api.v1.representation.registration.RegistrationResponse;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jgonzalez on 9/9/15.
 */
@Controller
public class Registration extends V1_BaseClass{

    @RequestMapping(value = "/"+this.VERSION +"/registration", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    RegistrationResponse create(@RequestBody RegistrationRequest request, HttpRequest httpRequest, HttpResponse httpResponse){

        return new RegistrationResponse();
    }

}
