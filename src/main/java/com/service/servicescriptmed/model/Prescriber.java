package com.service.servicescriptmed.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
// import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

// import org.json.simple.JSONObject;

public class Prescriber implements Serializable {
    static int count = 1;

    @JsonProperty("id")
    private int id = count++;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonIgnore
    public Boolean isIdMatched(int exId) {
        if (exId == this.id) {
            return true;
        }
        return false;
    }

    // @JsonIgnore
    // public JSONObject getDetails() {
    // // JSONObject data = new JSONObject();
    // // data.put("firstName", this.firstName);
    // // data.put("lastName", this.lastName);
    // // data.put("id", this.id);
    // return
    // }
}
