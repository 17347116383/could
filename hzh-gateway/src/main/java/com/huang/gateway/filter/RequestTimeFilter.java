package  com.huang.gateway.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;

import java.util.Map;


/**
 * @ProjectName:
 * @Package:
 * @ClassName: RequestTimeFilter
 * @Author: Administrator
 * @Description: ${description}
 * @Date:        自定义Gatewayfilter
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */

public class RequestTimeFilter implements GatewayFilter, Ordered {

         private static final Log log = LogFactory.getLog(GatewayFilter.class);
         private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";
      /**
      *自定义Gatewayfilter
      * @param exchange
      * @param chain
      * @return
      */
      public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain){

          Map<String, Object> attributes = exchange.getAttributes();
          ServerHttpRequest request = exchange.getRequest();
          ApplicationContext applicationContext = exchange.getApplicationContext();
          LocaleContext localeContext = exchange.getLocaleContext();
          ServerHttpResponse response = exchange.getResponse();
          Mono<Void> filter = chain.filter(exchange);
          String token = exchange.getRequest().getQueryParams().getFirst("token");
          exchange.getAttributes().put(REQUEST_TIME_BEGIN, System.currentTimeMillis());
        return chain.filter(exchange).then(
        Mono.fromRunnable(() -> {
        Long startTime=exchange.getAttribute(REQUEST_TIME_BEGIN);
        if(startTime!=null){
            System.out.println("----------->"+exchange.getRequest().getURI().getRawPath());
            System.out.println(System.currentTimeMillis() - startTime);
        log.info("请求路径："+exchange.getRequest().getURI().getRawPath()+"消耗时间: "+(System.currentTimeMillis() - startTime) + "ms");
        }
        })
        );

        }
        /*
        上述代码中定义了自己实现的过滤器。Ordered的int getOrder（）方法是来给过滤器定优先级的，值越大优先级越低。
        还有一个filter(ServerWebExchange exchange, GatewayFilterChain chain)方法，在该方法中，
        先记录了请求的开始时间，并保存在ServerWebExchange中，此处是一个“pre”类型的过滤器。
        然后再chain.filter()的内部类中的run()方法中相当于"post"过滤器，在此处打印了请求所消耗的时间。
       * @return
       */
       public int getOrder(){
      return 0;
        }


}
