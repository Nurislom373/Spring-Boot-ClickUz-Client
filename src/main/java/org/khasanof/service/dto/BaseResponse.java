package org.khasanof.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.dto
 * @since 12/29/2024 7:36 PM
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseResponse {

    @JsonProperty("error_code")
    private Integer errorCode;

    @JsonProperty("error_note")
    private String errorNote;
}
