package org.khasanof.service.impl;

import org.khasanof.config.ClickUzRestTemplateConfiguration;
import org.khasanof.result.ClientResultData;
import org.khasanof.service.ClickSenderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static org.khasanof.response.HttpResponseUtil.validateAndReturnResult;

/**
 * @author Nurislom
 * @see org.khasanof.service.impl
 * @since 12/29/2024 8:56 PM
 */
@Service
public class ClickSenderServiceImpl implements ClickSenderService {

    private final RestTemplate restTemplate;

    public ClickSenderServiceImpl(@Qualifier(ClickUzRestTemplateConfiguration.MERCHANT_REST_TEMPLATE) RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     *
     * @param request
     * @param responseType
     * @return
     * @param <T>
     * @param <R>
     */
    @Override
    public <T, R> ClientResultData<R> send(RequestEntity<T> request, Class<R> responseType) {
        var responseEntity = restTemplate.exchange(request, responseType);
        return validateAndReturnResult(responseEntity);
    }
}
