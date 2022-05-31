package com.sample.mapper;

import com.sample.model.User;
import com.sample.model.UserDTO;
import com.sample.model.UserVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(UserVO userVO);

    UserVO toVO(UserDTO userDTO);

    UserVO toVO(User user);

}
