package com.innova.pruebas.Repository;

import com.innova.pruebas.Entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepositoryOld {

    private Map<Long, UserEntity> users = new HashMap<>();

    public List<UserEntity> findAll(){
        return  new ArrayList<>(this.users.values());
    }

    public UserEntity save(UserEntity user){
        users.put(user.getId(), user);
        return  user;
    }

    public UserEntity findById(Integer id){
        return this.users.get(id);
    }

}
