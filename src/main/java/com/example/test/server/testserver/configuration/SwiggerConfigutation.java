package com.example.test.server.testserver.configuration;


import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwiggerConfigutation {

	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().pathMapping("/")
				.globalOperationParameters(getHeader())
				.apiInfo(apiInfo());
	}
	

    private List<Parameter> getHeader() {
        return Arrays.asList(new ParameterBuilder()
                .required(false)
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .build());
    }


	private ApiInfo apiInfo() {
		// TODO Auto-generated method stub
		return ApiInfo.DEFAULT;
	}

}
