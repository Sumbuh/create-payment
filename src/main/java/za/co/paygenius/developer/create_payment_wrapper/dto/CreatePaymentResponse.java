package za.co.paygenius.developer.create_payment_wrapper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentResponse {

    private boolean success;
    private String transactionDate;
    private String reference;
    private int code;
    private String message;

}
