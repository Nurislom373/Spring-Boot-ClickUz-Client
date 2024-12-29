package org.khasanof.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.khasanof.factory.HttpRequestFactory;
import org.khasanof.result.ClientResultData;
import org.khasanof.service.ClickMerchantService;
import org.khasanof.service.ClickSenderService;
import org.khasanof.service.dto.request.*;
import org.khasanof.service.dto.response.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import static org.khasanof.util.ClickUzAPIConstants.*;

/**
 * @author Nurislom
 * @see org.khasanof.service.impl
 * @since 12/29/2024 8:50 PM
 */
@Slf4j
@Service
@ConditionalOnProperty(prefix = "click-uz", name = "simulate", havingValue = "false")
public class ClickMerchantServiceImpl implements ClickMerchantService {

    private final HttpRequestFactory httpRequestFactory;
    private final ClickSenderService clickSenderService;

    public ClickMerchantServiceImpl(HttpRequestFactory httpRequestFactory, ClickSenderService clickSenderService) {
        this.httpRequestFactory = httpRequestFactory;
        this.clickSenderService = clickSenderService;
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<CreateInvoiceResponse> createInvoice(CreateInvoiceRequest request) {
        var httpRequest = httpRequestFactory.postRequest(request, INVOICE_CREATE);
        return clickSenderService.send(httpRequest, CreateInvoiceResponse.class);
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<InvoiceStatusCheckResponse> invoiceStatusCheck(InvoiceStatusCheckRequest request) {
        var httpRequest = httpRequestFactory.getRequest(INVOICE_STATUS_CHECK, request.getServiceId(), request.getInvoiceId());
        return clickSenderService.send(httpRequest, InvoiceStatusCheckResponse.class);
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PaymentStatusCheckResponse> paymentStatusCheck(PaymentStatusCheckRequest request) {
        var httpRequest = httpRequestFactory.getRequest(PAYMENT_STATUS_CHECK, request.getServiceId(), request.getPaymentId());
        return clickSenderService.send(httpRequest, PaymentStatusCheckResponse.class);
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PaymentStatusCheckByMtiResponse> paymentStatusCheckByMti(PaymentStatusCheckByMtiRequest request) {
        var httpRequest = httpRequestFactory.getRequest(PAYMENT_STATUS_CHECK_BY_MTI, request.getServiceId(), request.getMerchantTransId());
        return clickSenderService.send(httpRequest, PaymentStatusCheckByMtiResponse.class);
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PaymentReversalResponse> paymentReversal(PaymentReversalRequest request) {
        var httpRequest = httpRequestFactory.deleteRequest(PAYMENT_REVERSAL, request.getServiceId(), request.getPaymentId());
        return clickSenderService.send(httpRequest, PaymentReversalResponse.class);
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PartialRefundResponse> partialRefund(PartialRefundRequest request) {
        var httpRequest = httpRequestFactory.deleteRequest(PARTIAL_REFUND, request.getServiceId(), request.getPaymentId(), request.getAmount());
        return clickSenderService.send(httpRequest, PartialRefundResponse.class);
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<CreateCardTokenResponse> createCardToken(CreateCardTokenRequest request) {
        var httpRequest = httpRequestFactory.postRequest(request, CREATE_CARD_TOKEN);
        return clickSenderService.send(httpRequest, CreateCardTokenResponse.class);
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<VerifyCardTokenResponse> verifyCardToken(VerifyCardTokenRequest request) {
        var httpRequest = httpRequestFactory.postRequest(request, VERIFY_CARD_TOKEN);
        return clickSenderService.send(httpRequest, VerifyCardTokenResponse.class);
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PaymentWithTokenResponse> paymentWithToken(PaymentWithTokenRequest request) {
        var httpRequest = httpRequestFactory.postRequest(request, PAYMENT_WITH_TOKEN);
        return clickSenderService.send(httpRequest, PaymentWithTokenResponse.class);
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<DeleteCardTokenResponse> deleteCardToken(DeleteCardTokenRequest request) {
        var httpRequest = httpRequestFactory.deleteRequest(DELETE_CARD_TOKEN, request.getServiceId(), request.getCardToken());
        return clickSenderService.send(httpRequest, DeleteCardTokenResponse.class);
    }
}
