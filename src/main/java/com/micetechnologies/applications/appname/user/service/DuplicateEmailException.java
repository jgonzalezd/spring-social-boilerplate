package com.micetechnologies.applications.appname.user.service;

/**
 * Created by jgonzalez on 8/27/15.
 */
public class DuplicateEmailException extends Exception {

    public DuplicateEmailException(String message) {
        super(message);
    }
}

