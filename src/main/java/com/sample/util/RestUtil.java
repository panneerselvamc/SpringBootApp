package com.sample.util;

import com.sample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static com.sample.util.Constant.GET_USER;

@Component
public class RestUtil {

    @Autowired
    RestTemplate restTemplate;

    public User getUserDetails(){
        ResponseEntity<User> response
                = restTemplate.getForEntity(GET_USER, User.class);
        return response.getBody();
    }
}
