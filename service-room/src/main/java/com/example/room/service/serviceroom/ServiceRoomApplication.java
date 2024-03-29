package com.example.room.service.serviceroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class ServiceRoomApplication {


    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_12).groupName("Room").select()
                .apis(RequestHandlerSelectors.basePackage("com.example.room.service.serviceroom"))
                .paths(any()).build().apiInfo(new ApiInfo("Room Services",
                        "A set of services to provide data access to rooms", "1.0.0", null,
                        new Contact("Iryna Khakhuda", "https://twitter.com/fpmoles", null),null, null));
    }


    public static void main(String[] args) {
        SpringApplication.run(ServiceRoomApplication.class, args);
    }

}
