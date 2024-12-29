package org.khasanof.service;

import org.khasanof.result.ClientResultData;
import org.khasanof.service.dto.request.*;
import org.khasanof.service.dto.response.*;

/**
 * @author Nurislom
 * @see org.khasanof.service
 * @since 12/29/2024 6:33 PM
 */
public interface ClickMerchantService {

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<CreateInvoiceResponse> createInvoice(CreateInvoiceRequest request);

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<InvoiceStatusCheckResponse> invoiceStatusCheck(InvoiceStatusCheckRequest request);

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<PaymentStatusCheckResponse> paymentStatusCheck(PaymentStatusCheckRequest request);

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<PaymentStatusCheckByMtiResponse> paymentStatusCheckByMti(PaymentStatusCheckByMtiRequest request);

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<PaymentReversalResponse> paymentReversal(PaymentReversalRequest request);

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<PartialRefundResponse> partialRefund(PartialRefundRequest request);

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<CreateCardTokenResponse> createCardToken(CreateCardTokenRequest request);

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<VerifyCardTokenResponse> verifyCardToken(VerifyCardTokenRequest request);

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<PaymentWithTokenResponse> paymentWithToken(PaymentWithTokenRequest request);

    /**
     *
     * @param request
     * @return
     */
    ClientResultData<DeleteCardTokenResponse> deleteCardToken(DeleteCardTokenRequest request);
}
