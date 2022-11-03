package com.example.demo.feign;

import com.example.demo.configuration.FeignClientConfig;
import com.example.demo.dto.RootObjectSchema;
import com.example.demo.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}", configuration = FeignClientConfig.class)
public interface UserFeignClient {

    @GetMapping(value = "/character/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    RootObjectSchema characaterId(@PathVariable("id") int id);

}
