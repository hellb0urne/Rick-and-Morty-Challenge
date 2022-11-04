package com.example.demo.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Location {

    private String id;
    private String name;
    private String type;
    private String dimension;
    private ArrayList<String> residents;

}
