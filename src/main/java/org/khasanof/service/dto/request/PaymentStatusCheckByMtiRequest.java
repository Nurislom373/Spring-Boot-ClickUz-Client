package org.khasanof.service.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.request
 * @since 12/29/2024 8:19 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentStatusCheckByMtiRequest {

    @JsonProperty("service_id")
    private Integer serviceId;

    @JsonProperty("merchant_trans_id")
    private String merchantTransId;
}
