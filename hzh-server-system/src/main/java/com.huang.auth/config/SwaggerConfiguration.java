package com.huang.auth.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.models.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: SwaggerConfiguration
 * @Date: 2021
 * @Version: 1.0
 * @Description: TODO()
 */
@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfiguration {



    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                //.enable(true)
                .apiInfo(apiInfo())
                //分组名称
                .groupName("默认接口")
                .select()
                //这里指定Controller扫描包路径com.huang.log\controller
                .apis(RequestHandlerSelectors.basePackage("com.huang.auth.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }


    /**
     * @Description: 构建 api文档的信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 设置页面标题
                .title("使用knife4j构建的api接口文档")
                // 设置作者
                .contact(String.valueOf(new Contact()))
                // 描述
                .description("接口文档")
                .termsOfServiceUrl("http://localhost:9102/")
                // 定义版本号
                .version("1.0")
                // 定义版本号
                .contact("522610395@qq.com")
                .build();
    }



/*    @Bean
    public Docket createRestApi() {
        return (
                new Docket(DocumentationType.SWAGGER_2)).
                enable(this.isEnable)
                .apiInfo(this.apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage(this.scanPackage))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return (new ApiInfoBuilder())
                .title(this.swaggerTitle)
                .description(this.swaggerDescription)
                .termsOfServiceUrl(this.termsOfServiceUrl)
                .version(this.version).build();
    }*/
}
