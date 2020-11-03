package com.acme.techfinance.ConfigApi;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ToString
@Configuration
public class Config {
@Bean(name = "techfinanceOpenApi")
    public OpenAPI techfinanceOpenApi() {

    return new OpenAPI()
            .components(new Components())
            .info(new Info().title("TechFinance Application API").description(
                    "TechFinance API implemented with Spring Boot Restful service and documented using springdoc-openapi and OpenApi 1. "
            ));
}
}
