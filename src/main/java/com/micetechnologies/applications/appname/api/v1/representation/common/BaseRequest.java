package com.micetechnologies.applications.appname.api.v1.representation.common;

import org.apache.commons.lang3.ClassUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jgonzalez on 9/9/15.
 */
public class BaseRequest implements Serializable{

    //TODO: SerialversionUID

    private Map<String, FieldKey> fieldKeys = new HashMap<String, FieldKey>();
    private Map<FieldKey, Object> fields = new HashMap<FieldKey, Object>();

    public void addKey(String name, Class<?> type) {
        FieldKey key = new FieldKey(name, type);
        fieldKeys.put(name, key);
    }

    public void addKey(String name, Class<?> type, boolean nullable) {
        FieldKey key = new FieldKey(name, type, nullable);
        fieldKeys.put(name, key);
    }

    public void addField(String name, Object value) {
        FieldKey key = findKey(name);
//        if (!key.isNullable() && null == value) {
//            throw new RequestException(name + " is not allowed to be null");
//        }
        if (null != value && !ClassUtils.isAssignable(value.getClass(), key.getType())) {
            throw new DomainException("Cannot add value of type \"" + value.getClass() + "\" to \"" + name + "\".");
        }
        fields.put(key, value);
    }

    public FieldKey findKey(String name) {
        if (!fieldKeys.containsKey(name)) {
            throw new DomainException("key \"" + name + "\" not found");
        }
        return fieldKeys.get(name);
    }

    public Object getField(String name) {
        FieldKey key = findKey(name);
        if (!containsField(key)) {
            return null;
        }
        return fields.get(key);
    }

    public boolean containsField(String name) {
        FieldKey key = findKey(name);
        return containsField(key);
    }

    public boolean containsField(FieldKey key) {
        return fields.containsKey(key);
    }


}
