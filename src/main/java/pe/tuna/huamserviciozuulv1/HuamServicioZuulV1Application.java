package pe.tuna.huamserviciozuulv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class HuamServicioZuulV1Application {

    public static void main(String[] args) {
        SpringApplication.run(HuamServicioZuulV1Application.class, args);
    }

}
