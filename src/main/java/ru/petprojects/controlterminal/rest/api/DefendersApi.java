package ru.petprojects.controlterminal.rest.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "defenders-api", url = "localhost:9053/defenders")
public interface DefendersApi {

    @GetMapping("/count")
    ResponseEntity<Integer> getCount();

}
