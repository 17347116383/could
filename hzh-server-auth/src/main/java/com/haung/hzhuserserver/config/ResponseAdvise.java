package com.haung.hzhuserserver.config;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.haung.hzhuserserver.config
 * @ClassName: ResponseAdvise
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/5/30 17:45
 * @Version: 1.0  E:\STSpool\hzh-cloud-app\hzh-userServer\src\main\java\com\haung\hzhuserserver
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@RestControllerAdvice(basePackages = "com.haung.hzhuserserver")
@EnableWebMvc
@Configuration
public class ResponseAdvise implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType,
                            Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object object,
                                  MethodParameter returnType,
                                  MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request,
                                  ServerHttpResponse response) {

        if (object instanceof ResponseData) {
            return object;
        }
        //转json
        return object;
       // return ResponseData.of().setData(object);
    }
}
