package org.khasanof.service.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.request
 * @since 12/29/2024 8:38 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentWithTokenRequest {

    @JsonProperty("service_id")
    private Integer serviceId;

    @JsonProperty("card_token")
    private String cardToken;

    @JsonProperty("amount")
    private Float amount;

    @JsonProperty("merchant_trans_id")
    private String merchantTransId;
}
