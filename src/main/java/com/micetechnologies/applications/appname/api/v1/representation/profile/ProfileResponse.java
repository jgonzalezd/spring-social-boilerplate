package com.micetechnologies.applications.appname.api.v1.representation.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

/**
 * Created by jgonzalez on 9/10/15.
 */
@JsonRootName(value = "user")
public class ProfileResponse {

    private String name;
    private String  description;
    private String email;
    private String height;
    private List<String> interests;

    @JsonProperty(value = "name", required = true)
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @JsonProperty(value = "description", required = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty(value = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty(value = "height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty(value = "interests")
    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
