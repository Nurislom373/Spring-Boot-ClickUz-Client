package org.khasanof.service.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.request
 * @since 12/29/2024 7:40 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceStatusCheckRequest {

    @JsonProperty("service_id")
    private Integer serviceId;

    @JsonProperty("invoice_id")
    private Long invoiceId;
}
