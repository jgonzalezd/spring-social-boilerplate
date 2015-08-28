package com.micetechnologies.applications.api.user.service;

import com.micetechnologies.applications.api.user.dto.RegistrationForm;
import com.micetechnologies.applications.api.user.model.User;

/**
 * Created by jgonzalez on 8/27/15.
 */
public interface UserService {

    /**
     * Creates a new user account to the service.
     * @param userAccountData   The information of the created user account.
     * @return  The information of the created user account.
     * @throws DuplicateEmailException Thrown when the email address is found from the database.
     */
    public User registerNewUserAccount(RegistrationForm userAccountData) throws DuplicateEmailException;
}