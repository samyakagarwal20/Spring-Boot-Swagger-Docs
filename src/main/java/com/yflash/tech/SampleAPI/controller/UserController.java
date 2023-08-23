package com.yflash.tech.SampleAPI.controller;

import com.yflash.tech.SampleAPI.entity.UserEntity;
import com.yflash.tech.SampleAPI.model.in.DeleteUserRequest;
import com.yflash.tech.SampleAPI.model.in.GetUserRequest;
import com.yflash.tech.SampleAPI.model.in.PostUserRequest;
import com.yflash.tech.SampleAPI.model.in.PutUserRequest;
import com.yflash.tech.SampleAPI.model.out.User;
import com.yflash.tech.SampleAPI.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LogManager.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping(value = "/get-all-users", produces = "application/json")
    ResponseEntity<List<UserEntity>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/get-user-by-id", produces = "application/json", consumes = "application/json")
    ResponseEntity<User> getUserById(@RequestBody GetUserRequest userRequest) {
        return new ResponseEntity<>(userService.getUserById(userRequest.getId()), HttpStatus.OK);
    }

    @PostMapping(value = "/add-user", produces = "application/json", consumes = "application/json")
    public ResponseEntity<User> addUserDetails(@RequestBody PostUserRequest userRequest) {
        return new ResponseEntity<>(userService.addUserDetails(userRequest), HttpStatus.OK);
    }

    @PutMapping(value = "/update-user-details", produces = "application/json", consumes = "application/json")
    public ResponseEntity<User> updateUserDetails(@RequestBody PutUserRequest userRequest) {
        return new ResponseEntity<>(userService.updateUserDetails(userRequest), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete-user", produces = "text/plain", consumes = "application/json")
    public ResponseEntity<String> deleteUserDetails(@RequestBody DeleteUserRequest userRequest) {
        String serviceResponse = userService.deleteUserDetails(userRequest.getId());
        if(serviceResponse == null)
            return new ResponseEntity<>("Data doesn't exists for this id", HttpStatus.NOT_FOUND);
        return new ResponseEntity<>("Data for id " + serviceResponse + " is deleted successfully!", HttpStatus.OK);
    }

}
