package org.khasanof.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Nurislom
 * @see org.khasanof.config
 * @since 12/29/2024 6:30 PM
 */
@Data
@ConfigurationProperties(prefix = "click-uz")
public class ClickUzProperties {

    private String merchantUrl;
    private String merchantId;
    private String serviceId;
    private String merchantUserId;
    private String secretKey;
}
