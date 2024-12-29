package org.khasanof.config;

import org.khasanof.interceptor.ClickUzInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

import java.util.List;

/**
 * @author Nurislom
 * @see org.khasanof.config
 * @since 12/29/2024 6:34 PM
 */
@Configuration
public class ClickUzRestTemplateConfiguration {

    public static final String MERCHANT_REST_TEMPLATE = "clickUzMerchantRestTemplate";

    /**
     *
     * @return
     */
    @Bean(MERCHANT_REST_TEMPLATE)
    public RestTemplate clickUzMerchantRestTemplate(ClickUzProperties clickUzProperties) {
        RestTemplate restTemplate = new RestTemplate();

        restTemplate.setInterceptors(List.of(new ClickUzInterceptor(clickUzProperties)));
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory(clickUzProperties.getMerchantUrl()));

        return restTemplate;
    }
}
