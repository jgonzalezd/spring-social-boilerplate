package com.micetechnologies.applications.appname.api.v1.representation.common;

/**
 * Created by jgonzalez on 9/11/15.
 */
public class DomainException extends RuntimeException {

    private static final long serialVersionUID = 7832102037677238886L;

    /**
     * @param message
     */
    public DomainException(String message) {
        super(message);
    }

    /**
     * @param message
     * @param cause
     */
    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }

}
