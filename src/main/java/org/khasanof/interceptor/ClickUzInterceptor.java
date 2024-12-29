package org.khasanof.interceptor;

import org.khasanof.config.ClickUzProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

/**
 * @author Nurislom
 * @see org.khasanof.config
 * @since 12/29/2024 6:37 PM
 */
public class ClickUzInterceptor implements ClientHttpRequestInterceptor {

    public static final String AUTH_HEADER = "Auth";

    private final ClickUzProperties clickUzProperties;

    public ClickUzInterceptor(ClickUzProperties clickUzProperties) {
        this.clickUzProperties = clickUzProperties;
    }

    /**
     * Intercepts HTTP requests to add required headers before execution.
     *
     * @param request the request, containing method, URI, and headers
     * @param body the body of the request
     * @param execution the request execution
     * @return
     * @throws IOException
     */
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {

        request.getHeaders().add(AUTH_HEADER, tryGenerateAuthHeader());
        request.getHeaders().add(HttpHeaders.ACCEPT, MediaType.ALL_VALUE);
        request.getHeaders().add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);

        return execution.execute(request, body);
    }

    /**
     * Attempts to generate the "Auth" HTTP header value by delegating to {@link #generateAuthHeader()}.
     * Catches potential exceptions and converts them into unchecked exceptions.
     *
     * @return The generated "Auth" HTTP header value.
     * @throws RuntimeException If header generation fails due to an algorithm exception.
     */
    public String tryGenerateAuthHeader() {
        try {
            return generateAuthHeader();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Generates the "Auth" HTTP header value based on the given parameters.
     *
     * @return The generated "Auth" header value in the format: merchant_user_id:digest:timestamp.
     * @throws NoSuchAlgorithmException If the SHA-1 algorithm is not available.
     */
    public String generateAuthHeader() throws NoSuchAlgorithmException {
        // Generate the current UNIX timestamp (10 digits, seconds since epoch).
        long timestamp = Instant.now().getEpochSecond();
        String timestampStr = String.valueOf(timestamp);

        // Compute the digest: SHA-1 of (timestamp + secret_key).
        String digestInput = timestampStr + clickUzProperties.getSecretKey();
        String digest = sha1Hex(digestInput);

        // Construct the "Auth" header value.
        return String.format("%s:%s:%s", clickUzProperties.getMerchantUserId(), digest, timestampStr);
    }

    /**
     * Computes the SHA-1 hash of the given input string and returns it as a hexadecimal string.
     *
     * @param input The input string.
     * @return The SHA-1 hash as a hexadecimal string.
     * @throws NoSuchAlgorithmException If the SHA-1 algorithm is not available.
     */
    private String sha1Hex(String input) throws NoSuchAlgorithmException {
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        byte[] hashBytes = sha1.digest(input.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();

        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));
        }

        return hexString.toString();
    }
}
