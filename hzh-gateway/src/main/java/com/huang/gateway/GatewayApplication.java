package com.huang.gateway;






import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;


/**
 * @ProjectName: hzh-spring-cloud
 * @Package: com.huang.gatewayjwt
 * @ClassName: GatewayJwt
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2020/3/20 23:11
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args

        //随机端口启动
        /*     SpringApplication app = new SpringApplication(GatewayApplication.class);
        app.addListeners(new PortApplicationEnvironmentPreparedEventListener());
        app.run(args);*/
        );
    }

    ////------------public static final String HELLO_FROM_FAKE_ACTUATOR_METRICS_GATEWAY_REQUESTS = "hello from fake /actuator/metrics/gateway.requests";


   /* @Bean
    public AnnotationConfigReactiveWebApplicationContext getAnnotationConfigReactiveWebApplicationContext(){
        return new AnnotationConfigReactiveWebApplicationContext();
    }
    @Bean
     public  RouteLocatorBuilder getRouteLocatorBuilder(){
        return new RouteLocatorBuilder( getAnnotationConfigReactiveWebApplicationContext() );
     }*/
    /**
     * 自定义Gatewayfilter
     * @param builder
     * @return
     */
    ////-------------------
    /* @Bean
    public RouteLocator customerRouteLocator(@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection") RouteLocatorBuilder builder) {
        Flux<Route> routes = builder.routes().build().getRoutes();
        return builder.routes().route(r -> r.path("/hzh/**")
                .filters(f -> f.filter(new RequestTimeFilter())
                        .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                .uri("http://localhost:9001/hzh/gateway")
                .order(0)
                .id("customer_filter_router")
        ).route(r -> r.path("/addUser/**")
                .filters(f -> f.filter(new RequestTimeFilter())
                        .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                .uri("http://localhost:9000/addUser/**")
                .order(0)
                .id("customer_filter_router")
        ).route(r -> r.path("/hzh/**")
                .filters(f -> f.filter(new RequestTimeFilter())
                        .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                .uri("http://localhost:9001/hzh/ribbon")
                .order(0)
                .id("customer_filter_router")
        )

                .build();
    }*/



  /*  @Bean
    public RouterFunction<ServerResponse> testFunRouterFunction() {
        RouterFunction<ServerResponse> route = RouterFunctions.route(
                RequestPredicates.path("/testfun"),
                request -> ServerResponse.ok().body(BodyInserters.fromObject("werwerwerw1231313")));
        return route;
    }

    @Bean
    public RouterFunction<ServerResponse> testWhenMetricPathIsNotMeet() {
        RouterFunction<ServerResponse> route = RouterFunctions.route(
                RequestPredicates.path("/actuator/metrics/gateway.requests"),
                request -> ServerResponse.ok().body(BodyInserters
                        .fromObject(HELLO_FROM_FAKE_ACTUATOR_METRICS_GATEWAY_REQUESTS)));
        return route;
    }*/

}
