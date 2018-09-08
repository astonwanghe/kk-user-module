package com.melot.kk.springcloud.user.controller;

import com.melot.kk.springcloud.user.model.UserDTO;
import com.melot.kk.springcloud.user.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController implements UserService {

    public UserDTO getUser(int userId) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setNickname("User_" + userId);
        return userDTO;
    }
}
