package com.micetechnologies.applications.appname.api.v1.representation.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jgonzalez on 9/9/15.
 */
public class BaseRequest implements Serializable{

    private Map<String, FieldKey> fieldKeys = new HashMap<String, FieldKey>();
    private Map<FieldKey, Object> fields = new HashMap<FieldKey, Object>();


}
