package org.khasanof.service.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.khasanof.service.dto.BaseResponse;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto.response
 * @since 12/29/2024 8:31 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CreateCardTokenResponse extends BaseResponse {

    @JsonProperty("card_token")
    private String cardToken;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("temporary")
    private Integer temporary;
}
