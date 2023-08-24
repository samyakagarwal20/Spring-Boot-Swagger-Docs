package com.yflash.tech.SampleAPI.model.out;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    @Schema(description = "Id of user")
    Integer id;

    @Schema(description = "User's first name")
    String firstName;

    @Schema(description = "User's last name")
    String lastName;

}
