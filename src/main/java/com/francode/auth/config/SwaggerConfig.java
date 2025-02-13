package com.francode.auth.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API AUTH")
                        .version("1.0.0")
                        .description("Documentation API AUTH")
                        .contact(new Contact()
                                .name("Francode")
                                .url("https://github.com/francotaype/")
                                .email("francotaypedev@gmail.com")
                        )
                );

    }
}
