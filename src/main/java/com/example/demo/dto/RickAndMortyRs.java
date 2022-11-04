package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class RickAndMortyRs {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    @JsonProperty("episode_count")
    private int episodeCount;
    private ArrayList<String> episode;
    private OriginObjectSchema origin;
}
