package com.example.demo.service;

import com.example.demo.dto.RootObjectSchema;
import com.example.demo.dto.UserDTO;
import com.example.demo.feign.UserFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {

    private  final UserFeignClient userFeignClient;

    public RootObjectSchema characterId(int id){
        return userFeignClient.characaterId(id);
    }



}
