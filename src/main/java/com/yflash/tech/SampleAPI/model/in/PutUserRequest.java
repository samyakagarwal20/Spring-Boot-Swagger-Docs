package com.yflash.tech.SampleAPI.model.in;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PutUserRequest {
    Integer id;
    String firstName;
    String lastName;
}
