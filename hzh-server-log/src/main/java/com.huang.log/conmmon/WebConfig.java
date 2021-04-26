package com.huang.log.conmmon;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.log.conmmon
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

 // @Value("${spring.jackson.time-zone}")
 // private  String jacksonTimeZone;

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedHeaders("*")
        .allowCredentials(true)
        .allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH");
  }

 /* @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/**")
        .addResourceLocations("/")
            .setCacheControl(CacheControl.noCache());



  }
*/
/*  @Override
  public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
    SimpleModule simpleModule = new SimpleModule();
    simpleModule.addSerializer(String.class, new XssJacksonSerializer());
    simpleModule.addDeserializer(String.class, new XssJacksonDeserializer());
    ObjectMapper objectMapper = Jackson2ObjectMapperBuilder.json().build();
    if (StringUtils.isNotBlank(jacksonTimeZone)) {
      objectMapper.setTimeZone(TimeZone.getTimeZone(jacksonTimeZone));
    } else {
      // 默认设置时区为东八区
      objectMapper.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    objectMapper.registerModule(simpleModule);
    converters.add(0, new MappingJackson2HttpMessageConverter(objectMapper));
  }*/

}
