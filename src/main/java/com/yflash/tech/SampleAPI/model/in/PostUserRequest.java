package com.yflash.tech.SampleAPI.model.in;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostUserRequest {

    @NotBlank(message = "User firstName is a required field and cannot be blank")
    @Size(min = 3, max = 20, message = "firstname can have min 3 and max 20 characters")
    @Schema(description = "firstname can have min 3 and max 20 characters")
    String firstName;

    @NotBlank(message = "User lastName is a required field and cannot be blank")
    @Size(min = 3, max = 50, message = "lastname can have min 3 and max 50 characters")
    @Schema(description = "lastname can have min 3 and max 50 characters")
    String lastName;
}
