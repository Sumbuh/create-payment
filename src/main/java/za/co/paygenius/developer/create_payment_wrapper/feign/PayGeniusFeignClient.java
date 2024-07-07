package za.co.paygenius.developer.create_payment_wrapper.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import za.co.paygenius.developer.create_payment_wrapper.dto.CreatePaymentRequest;
import za.co.paygenius.developer.create_payment_wrapper.dto.CreatePaymentResponse;

import java.util.Map;

@FeignClient(name = "paygenius-client", url = "${paygenius.feign-url}")

public interface PayGeniusFeignClient {

    @PostMapping("/create")
    CreatePaymentResponse createPayment(@RequestBody CreatePaymentRequest createPaymentRequest, @RequestHeader Map<String, String> headers);

}
