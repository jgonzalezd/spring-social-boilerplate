package com.micetechnologies.applications.appname.api.v1.representation.common;

import java.io.Serializable;

/**
 * Created by jgonzalez on 9/9/15.
 */
public class FieldKey implements Serializable {
    private String name;
    private Class<?> type;
    private boolean nullable;

    public FieldKey(String name, Class<?> type, boolean nullable){
        this.name = name;
        this.type = type;
        this.nullable = nullable;
    }

    public FieldKey(String name, Class<?> type){
        this(name, type, true);
    }

    public String getKey(){
        return this.name;
    }

    public Class<?> getType(){
        return this.type;
    }

    public boolean isNullable(){
        return this.nullable;
    }


}
