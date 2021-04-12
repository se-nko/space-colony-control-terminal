package ru.petprojects.controlterminal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import ru.petprojects.controlterminal.rest.api.ResourcesApi;

@SpringBootApplication
@EnableFeignClients(clients = { ResourcesApi.class })
public class ControlTerminalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlTerminalApplication.class, args);
	}

}
