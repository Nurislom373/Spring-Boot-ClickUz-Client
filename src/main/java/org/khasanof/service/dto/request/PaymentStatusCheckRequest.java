package org.khasanof.service.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.request
 * @since 12/29/2024 7:42 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentStatusCheckRequest {

    @JsonProperty("service_id")
    private Integer serviceId;

    @JsonProperty("payment_id")
    private Long paymentId;
}
