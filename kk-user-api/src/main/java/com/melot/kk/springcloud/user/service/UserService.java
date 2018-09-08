package com.melot.kk.springcloud.user.service;

import com.melot.kk.springcloud.user.model.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
public interface UserService {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    UserDTO getUser(@RequestParam("userId") int userId);
}
