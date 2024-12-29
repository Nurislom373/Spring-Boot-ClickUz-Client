package org.khasanof.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.khasanof.result.ClientResultData;
import org.khasanof.service.ClickMerchantService;
import org.khasanof.service.dto.request.*;
import org.khasanof.service.dto.response.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @author Nurislom
 * @see org.khasanof.service.impl
 * @since 12/29/2024 8:52 PM
 */
@Slf4j
@Service
@ConditionalOnProperty(prefix = "click-uz", name = "simulate", havingValue = "true", matchIfMissing = true)
public class ClickMerchantServiceSimulation implements ClickMerchantService {

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<CreateInvoiceResponse> createInvoice(CreateInvoiceRequest request) {
        return new ClientResultData<>(new CreateInvoiceResponse());
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<InvoiceStatusCheckResponse> invoiceStatusCheck(InvoiceStatusCheckRequest request) {
        return new ClientResultData<>(new InvoiceStatusCheckResponse());
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PaymentStatusCheckResponse> paymentStatusCheck(PaymentStatusCheckRequest request) {
        return new ClientResultData<>(new PaymentStatusCheckResponse());
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PaymentStatusCheckByMtiResponse> paymentStatusCheckByMti(PaymentStatusCheckByMtiRequest request) {
        return new ClientResultData<>(new PaymentStatusCheckByMtiResponse());
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PaymentReversalResponse> paymentReversal(PaymentReversalRequest request) {
        return new ClientResultData<>(new PaymentReversalResponse());
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PartialRefundResponse> partialRefund(PartialRefundRequest request) {
        return new ClientResultData<>(new PartialRefundResponse());
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<CreateCardTokenResponse> createCardToken(CreateCardTokenRequest request) {
        return new ClientResultData<>(new CreateCardTokenResponse());
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<VerifyCardTokenResponse> verifyCardToken(VerifyCardTokenRequest request) {
        return new ClientResultData<>(new VerifyCardTokenResponse());
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<PaymentWithTokenResponse> paymentWithToken(PaymentWithTokenRequest request) {
        return new ClientResultData<>(new PaymentWithTokenResponse());
    }

    /**
     * @param request
     * @return
     */
    @Override
    public ClientResultData<DeleteCardTokenResponse> deleteCardToken(DeleteCardTokenRequest request) {
        return new ClientResultData<>(new DeleteCardTokenResponse());
    }
}
