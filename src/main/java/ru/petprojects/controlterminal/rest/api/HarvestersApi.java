package ru.petprojects.controlterminal.rest.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "harvesters-api", url = "localhost:9053/harvesters")
public interface HarvestersApi {

    @GetMapping("/count")
    ResponseEntity<Integer> getCount();

}
