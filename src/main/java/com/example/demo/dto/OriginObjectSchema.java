package com.example.demo.dto;
import java.io.Serializable;
import lombok.Data;

@Data
public class OriginObjectSchema implements Serializable {

    private String name;
    private String url;
    private String dimension;

}
