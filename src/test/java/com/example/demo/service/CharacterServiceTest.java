package com.example.demo.service;

import com.example.demo.dto.Location;
import com.example.demo.dto.OriginObjectSchema;
import com.example.demo.dto.RickAndMortyRs;
import com.example.demo.feign.UserFeignClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.ArrayList;

class CharacterServiceTest {

    @Mock
    private UserFeignClient userFeing;
    @InjectMocks
    private CharacterServiceImpl service;

    @BeforeEach
    public void setup() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getCaracter(){
        final var arr = new ArrayList<String>();
        arr.add("resident");
        final var origin = new OriginObjectSchema();
        origin.setDimension("a");
        origin.setName("a");
        origin.setUrl("asds");
        origin.setResidents(arr);
        final var rs = new RickAndMortyRs();
        rs.setId(rs.getId());
        rs.setName(rs.getName());
        rs.setOrigin(origin);
        rs.setSpecies(rs.getSpecies());
        rs.setStatus(rs.getStatus());
        rs.setType(rs.getType());
        rs.setEpisodeCount(rs.getEpisodeCount());
        rs.setEpisode(arr);
        final var location = new Location();
        location.setDimension("d-123");
        location.setId("1");
        location.setType("");
        location.setResidents(arr);
        location.setName("name");
        Mockito.when(this.userFeing.getLocation(ArgumentMatchers.anyInt())).thenReturn(location);
        Mockito.when(this.userFeing.characaterId(ArgumentMatchers.anyInt())).thenReturn(rs);
        Assertions.assertNotNull(this.service.characterId(1));
    }

}