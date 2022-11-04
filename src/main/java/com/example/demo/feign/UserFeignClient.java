package com.example.demo.feign;

import com.example.demo.configuration.FeignClientConfig;
import com.example.demo.dto.Location;
import com.example.demo.dto.RickAndMortyRs;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "CHARACTER-API", url = "${external.mock.api.base-url}", configuration = FeignClientConfig.class)
public interface UserFeignClient {

    @GetMapping(value = "/character/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    RickAndMortyRs characaterId(@PathVariable("id") int id);

    @GetMapping(value = "/location/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Location getLocation(@PathVariable("id") int id);

}
