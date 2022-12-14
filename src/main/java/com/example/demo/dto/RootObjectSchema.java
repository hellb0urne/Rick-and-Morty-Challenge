package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({
        "id", "name", "status", "species", "type", "episodeCount", "origin"
})

public class RootObjectSchema{

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    @JsonProperty("episode_count")
    private int episodeCount;
    private OriginObjectSchema origin;

}
