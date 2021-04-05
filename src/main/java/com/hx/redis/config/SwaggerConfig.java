package com.hx.redis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value(value = "${ifCloseSwagger}")
    boolean ifCloseSwagger;

    //多个分组
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("1");
    }

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                //配置信息
                .apiInfo(apiInfo())
                //配置是否启用swagger
                .enable(ifCloseSwagger)
                //分组
                .groupName("hx76")
                //配置扫描指定接口
                .select()
                //扫描全部
                //any()
                //都不扫
                //none()
                //扫指定包
                //basePackage()
                //根据注解扫
                //withMethodAnnotation()
                //.apis(RequestHandlerSelectors.withMethodAnnotation())
                .build();
    }

    public ApiInfo apiInfo(){
        //作者信息
        final Contact contact = new Contact("李东伟","https://github.com/Hx76","947769582@qq.com");

        return new ApiInfo(
                "我的接口文档",
                "redis操作的接口",
                "v1.0",
                "https://github.com/Hx76",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }


}
