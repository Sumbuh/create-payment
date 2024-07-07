package za.co.paygenius.developer.create_payment_wrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CreatePaymentWrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreatePaymentWrapperApplication.class, args);
	}

}
