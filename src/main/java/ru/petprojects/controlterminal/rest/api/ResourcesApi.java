package ru.petprojects.controlterminal.rest.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "resources-api", url = "localhost:9053/resources")
public interface ResourcesApi {

    @GetMapping("/count")
    ResponseEntity<Integer> getCount();

}
