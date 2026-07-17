package com.stp.shipmenttracking.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI shipmentTrackingAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Shipment Tracking Portal API")
                        .description("REST APIs for Logistics Marketplace and Real-Time Shipment Tracking")
                        .version("1.0"))
                .externalDocs(new ExternalDocumentation()
                        .description("Project Documentation"));
    }
}
