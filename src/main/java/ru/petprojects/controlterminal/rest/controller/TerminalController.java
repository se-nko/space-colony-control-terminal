package ru.petprojects.controlterminal.rest.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.petprojects.controlterminal.rest.api.ResourcesApi;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TerminalController {

    final ResourcesApi resourcesApi;

    @Value("${service.type}")
    String serviceType;

    @GetMapping(
            value = "/type",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public String getServiceType() {
        return String.format("The type of this service is - %s", serviceType);
    }

    @GetMapping("/resources-count")
    public ResponseEntity<Integer> getCount() {
        return resourcesApi.getCount();
    }
}
