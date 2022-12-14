package com.example.demo.dto;
import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;

@Data
public class OriginObjectSchema implements Serializable {

    private String name;
    private String url;
    private String dimension;
    private ArrayList<String> residents;

}
