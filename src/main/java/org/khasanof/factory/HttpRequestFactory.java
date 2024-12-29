package org.khasanof.factory;

import org.springframework.http.RequestEntity;

/**
 * @author Nurislom
 * @see org.khasanof.factory
 * @since 12/29/2024 9:34 PM
 */
public interface HttpRequestFactory {

    /**
     *
     * @param request
     * @param uri
     * @return
     * @param <T>
     */
    <T> RequestEntity<T> postRequest(T request, String uri);

    /**
     *
     * @param uri
     * @param uriVariables
     * @return
     */
    RequestEntity<Void> getRequest(String uri, Object... uriVariables);

    /**
     *
     * @param uri
     * @param uriVariables
     * @return
     */
    RequestEntity<Void> deleteRequest(String uri, Object... uriVariables);
}
