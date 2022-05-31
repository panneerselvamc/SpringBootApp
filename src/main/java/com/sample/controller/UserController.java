package com.sample.controller;

import com.sample.mapper.UserMapper;
import com.sample.model.UserDTO;
import com.sample.model.UserVO;
import com.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @GetMapping
    public UserDTO getUserDetails(){
       UserVO vo = userService.getUserDetails();
        UserDTO dto = userMapper.toDTO(vo);
       return dto;
    }

}
