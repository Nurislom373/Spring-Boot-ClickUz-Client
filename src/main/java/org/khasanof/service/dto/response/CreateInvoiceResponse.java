package org.khasanof.service.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.khasanof.service.dto.BaseResponse;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.response
 * @since 12/29/2024 7:37 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CreateInvoiceResponse extends BaseResponse {

    @JsonProperty("invoice_id")
    private Long invoiceId;
}
