package com.example.demo.controller;

import com.example.demo.dto.RootObjectSchema;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/character")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<RootObjectSchema> getCharacter(@PathVariable("id") int id) {
        RootObjectSchema rootObjectSchema = userService.characterId(id);
        if (rootObjectSchema != null) {
            return new ResponseEntity<>(rootObjectSchema, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}
