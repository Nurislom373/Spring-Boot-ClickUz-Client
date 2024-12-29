package org.khasanof.service;

import org.khasanof.result.ClientResultData;
import org.springframework.http.RequestEntity;

/**
 * @author Nurislom
 * @see org.khasanof.service
 * @since 12/29/2024 8:54 PM
 */
public interface ClickSenderService {

    /**
     *
     * @param request
     * @param responseType
     * @return
     * @param <T>
     * @param <R>
     */
    <T, R> ClientResultData<R> send(RequestEntity<T> request, Class<R> responseType);
}
