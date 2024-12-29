package org.khasanof.service.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.khasanof.service.dto.BaseResponse;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.response
 * @since 12/29/2024 8:16 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentStatusCheckResponse extends BaseResponse {

    @JsonProperty("payment_id")
    private Long paymentId;

    @JsonProperty("payment_status")
    private Integer paymentStatus;
}
