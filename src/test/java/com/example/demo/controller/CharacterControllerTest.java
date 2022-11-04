package com.example.demo.controller;

import com.example.demo.dto.RootObjectSchema;
import com.example.demo.service.IServiceCharacter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CharacterControllerTest {


    @Mock
    private IServiceCharacter characterService;
    @InjectMocks
    private CharacterController characterController;

    @Test
    void getUser() {
        final var character = new RootObjectSchema();
        Mockito.when(this.characterService.characterId(ArgumentMatchers.anyInt())).thenReturn(character);
        Assertions.assertNotNull(this.characterController.getCharacter(1));
    }
}