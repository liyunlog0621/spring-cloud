package com.lyl.zuul1zuulserver;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
        import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Zuul1ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Zuul1ZuulServerApplication.class, args);
    }

}

