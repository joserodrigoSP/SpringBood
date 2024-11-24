package com.innova.pruebas.service;

import com.innova.pruebas.document.UserDocument;
import com.innova.pruebas.Repository.UserRepository;
import com.innova.pruebas.dto.UserDto;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public UserDto findById(String id){
        UserDocument user = this.userRepository.findById(id).orElseThrow(null);
        //return dto;
        return this.toDto(user);
    }

        public UserDto toDto(UserDocument user){
                UserDto dto = new UserDto();
                dto.setId(user.getId());
                dto.setNombre(user.getNombre());
                return  dto;
        }

        public UserDocument toDocument(UserDto user){
            UserDocument dto = new UserDocument();
            dto.setNombre(user.getNombre());
            return dto;
        }

    public UserDto save(UserDto user){
        UserDocument userDocument = this.toDocument(user);
        userDocument.setFecha(new Date());
        UserDocument saveEntity = this.userRepository.save(userDocument);

        return this.toDto(saveEntity);
    }

    public UserDto update(String id, UserDto userDto){
        UserDocument userDocument = this.userRepository.findById(id).orElseThrow(null);

        userDocument.setNombre(userDto.getNombre());

        UserDocument saveDto = this.userRepository.save(userDocument);

        return this.toDto(saveDto);
    }

    public ResponseEntity<Void> delete(String id){
         userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
