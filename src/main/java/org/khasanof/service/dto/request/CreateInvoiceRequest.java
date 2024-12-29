package org.khasanof.service.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.request
 * @since 12/29/2024 7:33 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CreateInvoiceRequest {

    @JsonProperty("service_id")
    private Integer serviceId;

    @JsonProperty("amount")
    private Float amount;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("merchant_trans_id")
    private String merchantTransId;
}
