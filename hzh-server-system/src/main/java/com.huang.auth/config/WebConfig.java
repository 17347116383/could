package com.huang.auth.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
public class WebConfig  extends WebMvcConfigurationSupport {

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


 public void addResourceHandlers(ResourceHandlerRegistry registry) {
     registry.addResourceHandler("/**"). addResourceLocations("/");

     registry.addResourceHandler("service-worker.js").addResourceLocations("classpath:/META-INF/resources/");

   registry.addResourceHandler("index.html").addResourceLocations("classpath:/META-INF/resources/");
   registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
   registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/").
           setCacheControl(CacheControl.noCache());
 }
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
