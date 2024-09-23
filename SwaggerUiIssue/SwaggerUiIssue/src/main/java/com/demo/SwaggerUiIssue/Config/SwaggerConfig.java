/*
package com.demo.SwaggerUiIssue.Config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springframework.context.annotation.DependsOn;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {

    @Bean
    public SwaggerUiConfigParameters swaggerUiConfigParameters(SwaggerUiConfigProperties swaggerUiConfigProperties) {
        SwaggerUiConfigParameters config = new SwaggerUiConfigParameters(swaggerUiConfigProperties);

        // Disable the "Try it out" button by setting an empty array of supported submit methods
        config.setSupportedSubmitMethods(new ArrayList<>(){{add("get");}});  // Disable for all methods
        config.setTryItOutEnabled(false);

        // Optionally, enable specific HTTP methods for "Try it out"
        // config.setSupportedSubmitMethods(new String[] {"get", "post"});

        return config;
    }

    @Bean
    @DependsOn("swaggerUiConfigParameters")  // Ensure Swagger config is created first
    public GroupedOpenApi customOpenApi() {
        return GroupedOpenApi.builder()
                .group("your-api-group")
                .pathsToMatch("/**")
                .build();
    }
}
*/
