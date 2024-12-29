package org.khasanof.service.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.request
 * @since 12/29/2024 8:27 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CreateCardTokenRequest {

    @JsonProperty("service_id")
    private Integer serviceId;

    @JsonProperty("card_number")
    private String cardNumber;

    @JsonProperty("expire_date")
    private String expireDate; // (MMYY)

    /**
     * temporary – create token for one time use.
     * Temporary tokens are automatically removed after payment.
     */
    @JsonProperty("temporary")
    private Integer temporary; // (0|1)
}
