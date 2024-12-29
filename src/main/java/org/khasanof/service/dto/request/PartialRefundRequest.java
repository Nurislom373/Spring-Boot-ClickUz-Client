package org.khasanof.service.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.request
 * @since 12/29/2024 8:25 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PartialRefundRequest {

    @JsonProperty("service_id")
    private Integer serviceId;

    @JsonProperty("payment_id")
    private Long paymentId;

    @JsonProperty("amount")
    private Float amount;
}
