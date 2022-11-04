package com.example.demo.controller;
import com.example.demo.dto.RootObjectSchema;
import com.example.demo.service.IServiceCharacter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/character")
@RequiredArgsConstructor
public class CharacterController {

    private final IServiceCharacter serviceCharacter;

    @GetMapping("/{id}")
    public RootObjectSchema getCharacter(@PathVariable("id") int id) {
        return serviceCharacter.characterId(id);
    }

}
