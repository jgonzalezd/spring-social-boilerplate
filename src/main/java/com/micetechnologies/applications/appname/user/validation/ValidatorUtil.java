package com.micetechnologies.applications.appname.user.validation;

import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;

/**
 * Created by jgonzalez on 8/27/15.
 */
public class ValidatorUtil {

    public static void addValidationError(String field, ConstraintValidatorContext context) {
        context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                .addNode(field)
                .addConstraintViolation();
    }

    public static Object getFieldValue(Object object, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field f = object.getClass().getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.get(object);
    }
}
