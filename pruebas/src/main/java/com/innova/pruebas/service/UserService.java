package com.innova.pruebas.service;

import com.innova.pruebas.Entity.UserEntity;
import com.innova.pruebas.Repository.UserRepository;
import com.innova.pruebas.Repository.UserRepositoryOld;
import com.innova.pruebas.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<UserDto> findAll(){
        return this.userRepository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    public UserDto findById(Long id){
        UserEntity user = this.userRepository.findById(id).orElseThrow(null);
        //return dto;
        return this.toDto(user);
    }

        public UserDto toDto(UserEntity user){
                UserDto dto = new UserDto();
                dto.setId(user.getId());
                dto.setNombre(user.getNombre());
                return  dto;
        }

        public UserEntity toEntity(UserDto user){
            UserEntity dto = new UserEntity();
            dto.setNombre(user.getNombre());
            return  dto;
        }

    public UserDto save(UserDto user){
        UserEntity userEntity = this.toEntity(user);
        userEntity.setFecha(new Date());
    UserEntity saveEntity = this.userRepository.save(userEntity);

        return this.toDto(saveEntity);
    }

}
