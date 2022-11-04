package com.example.demo.service;

import com.example.demo.dto.RootObjectSchema;
import com.example.demo.feign.UserFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CharacterServiceImpl implements IServiceCharacter{

    private  final UserFeignClient userFeignClient;

    public RootObjectSchema characterId(int id) {
        final var response = new RootObjectSchema();
        final var rs = userFeignClient.characaterId(id);
        final var location = userFeignClient.getLocation(id);
        rs.getOrigin().setName(rs.getOrigin().getName());
        rs.getOrigin().setUrl(rs.getOrigin().getUrl());
        rs.getOrigin().setDimension(location.getDimension());
        rs.getOrigin().setResidents(location.getResidents());
        rs.setEpisodeCount(rs.getEpisode().size());
        response.setId(rs.getId());
        response.setName(rs.getName());
        response.setOrigin(rs.getOrigin());
        response.setSpecies(rs.getSpecies());
        response.setStatus(rs.getStatus());
        response.setType(rs.getType());
        response.setEpisodeCount(rs.getEpisodeCount());
        return response;
    }

}
