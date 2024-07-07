package za.co.paygenius.developer.create_payment_wrapper.config;

import com.squareup.okhttp.OkHttpClient;
import feign.Feign;
import feign.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableFeignClients(basePackages = {"za.co.momentum.investment.feign"})
public class FeignClientConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
    @Bean
    public OkHttpClient client() {
        OkHttpClient okHttpClient= new OkHttpClient();
        okHttpClient.setReadTimeout(60, TimeUnit.SECONDS);
        okHttpClient.setConnectTimeout(60, TimeUnit.SECONDS); // Increase connect timeout
        okHttpClient.setWriteTimeout(120, TimeUnit.SECONDS);
        return okHttpClient;
        // Increase write timeout
    }

//    @Bean
//    public Feign.Builder feignBuilder() {
//        return Feign.builder().client(client());
//    }
}
