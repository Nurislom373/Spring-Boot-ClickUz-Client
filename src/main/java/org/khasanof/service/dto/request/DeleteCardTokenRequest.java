package org.khasanof.service.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.request
 * @since 12/29/2024 8:44 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DeleteCardTokenRequest {

    @JsonProperty("service_id")
    private Integer serviceId;

    @JsonProperty("card_token")
    private String cardToken;
}
