package com.yflash.tech.SampleAPI.model.in;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteUserRequest {

    Integer id;

}
