package com.example.demo.dto;
import lombok.Data;

@Data
public class RootObjectSchema{

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private int episode_count;
    private Object location;

}
