package com.blank.practice.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 秦菊
 * @version 1.0
 * @date 2020/1/10 15:48
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI  //第三方swagger增强API注解
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("后台管理接口")
                .apiInfo(apiInfo())
                .host("localhost:8080")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.blank.practice"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("practice项目API")
                .description("swagger增强版练习项目")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }

}
