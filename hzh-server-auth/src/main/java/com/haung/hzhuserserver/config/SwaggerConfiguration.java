package com.haung.hzhuserserver.config;
import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
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
 * @ProjectName: hzh-cloud-app
 * @Package: com.haung.hzhuserserver.config
 * @ClassName: SwaggerConfiguration
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/5/30 16:14
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfiguration {


    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .apiInfo(apiInfo())
                //分组名称
                .groupName("2.X版本")
                .select()
                //这里指定Controller扫描包路径(项目路径也行)
                .apis(RequestHandlerSelectors.basePackage("com.haung.hzhuserserver.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("文档")
                .description("测试名称")
                .termsOfServiceUrl("http://localhost:9000/")
                .contact("522610395@qq.com")
                .version("1.0")
                .build();
    }
}
