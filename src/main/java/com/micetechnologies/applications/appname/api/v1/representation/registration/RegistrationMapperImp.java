package com.micetechnologies.applications.appname.api.v1.representation.registration;

import com.micetechnologies.applications.appname.api.v1.mapper.RegistrationMapper;
import com.micetechnologies.applications.appname.api.v1.representation.profile.ProfileResponse;
import com.micetechnologies.applications.appname.user.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by jgonzalez on 9/11/15.
 */
@Component
public class RegistrationMapperImp implements RegistrationMapper{

    @Override
    public ProfileResponse mapUserToProfile(User user) {
        ProfileResponse response = new ProfileResponse();
        String name = (user.getLastName() == null) ? user.getFirstName() : user.getFirstName() + " " + user.getLastName();
        response.setName(name);
        response.setEmail(user.getEmail());
        return response;
    }
}
