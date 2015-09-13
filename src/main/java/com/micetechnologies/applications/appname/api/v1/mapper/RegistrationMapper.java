package com.micetechnologies.applications.appname.api.v1.mapper;

import com.micetechnologies.applications.appname.api.v1.representation.profile.ProfileResponse;
import com.micetechnologies.applications.appname.user.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by jgonzalez on 9/11/15.
 */

public interface RegistrationMapper {
    ProfileResponse mapUserToProfile( User user);
}
