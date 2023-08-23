package com.yflash.tech.SampleAPI.service;

import com.yflash.tech.SampleAPI.entity.UserEntity;
import com.yflash.tech.SampleAPI.model.in.DeleteUserRequest;
import com.yflash.tech.SampleAPI.model.in.PostUserRequest;
import com.yflash.tech.SampleAPI.model.in.PutUserRequest;
import com.yflash.tech.SampleAPI.model.out.User;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();
    User getUserById(Integer id);
    User addUserDetails(PostUserRequest userRequest);
    User updateUserDetails(PutUserRequest userRequest);
    String deleteUserDetails(Integer id);
}
