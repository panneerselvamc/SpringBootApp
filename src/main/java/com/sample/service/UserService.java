package com.sample.service;

import com.sample.mapper.UserMapper;
import com.sample.model.User;
import com.sample.model.UserVO;
import com.sample.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    CommonUtil commonUtil;

    @Autowired
    UserMapper userMapper;
    public UserVO getIpDetails()  {
        System.out.println("SERVICE LAYER");
        User ip = commonUtil.getIPDetails("IP_DETAILS");
        UserVO vo = userMapper.toVO(ip);
        // VO can be used for Further Processing
        // VO can be used for Saving Data in DB
        // VO Can be used for further logics
        return vo;
    }
}
