package org.khasanof.factory;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;

import java.net.URI;

/**
 * @author Nurislom
 * @see org.khasanof.factory
 * @since 12/29/2024 9:35 PM
 */
@Component
public class HttpRequestFactoryImpl implements HttpRequestFactory {

    /**
     *
     * @param request
     * @param uri
     * @return
     * @param <T>
     */
    @Override
    public <T> RequestEntity<T> postRequest(T request, String uri) {
        return RequestEntity.post(URI.create(uri))
                .body(request);
    }

    /**
     *
     * @param uri
     * @param uriVariables
     * @return
     */
    @Override
    public RequestEntity<Void> getRequest(String uri, Object... uriVariables) {
        return RequestEntity.method(HttpMethod.GET, uri, uriVariables)
                .build();
    }

    /**
     *
     * @param uri
     * @param uriVariables
     * @return
     */
    @Override
    public RequestEntity<Void> deleteRequest(String uri, Object... uriVariables) {
        return RequestEntity.delete(uri, uriVariables)
                .build();
    }
}
