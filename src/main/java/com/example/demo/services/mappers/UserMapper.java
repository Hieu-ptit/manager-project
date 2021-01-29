package com.example.demo.services.mappers;

import com.example.demo.models.entities.UserEntity;
import com.example.demo.models.ins.UserRequest;
import com.example.demo.models.outs.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class UserMapper {

    public List<UserDto> mapToListUserDto(List<UserEntity> userEntities){
        return  userEntities.stream().map(this::mapToUserDto).collect(Collectors.toList());
    }

    public UserDto mapToUserDto(UserEntity userEntity){
        UserDto userDto = new UserDto();
        userDto.setId(userEntity.getId());
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setEmail(userEntity.getEmail());
        userDto.setCreatedAt(userEntity.getCreatedAt());
        userDto.setStatus(userEntity.isStatus());
        return userDto;
    }

    public UserEntity mapToUserEntity(UserRequest userRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userRequest.getFirstName());
        userEntity.setLastName(userRequest.getLastName());
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setCreatedAt(userRequest.getCreatedAt());
        userEntity.setStatus(userRequest.isStatus());
        return userEntity;
    }

    public UserEntity mapToUserEntity(UserRequest userRequest,int id){
        UserEntity userEntity = mapToUserEntity(userRequest);
        userEntity.setId(id);
        return userEntity;
    }
}
