package org.khasanof.util;

/**
 * @author Nurislom
 * @see org.khasanof.util
 * @since 12/29/2024 8:53 PM
 */
public final class ClickUzAPIConstants {

    public static final String INVOICE_CREATE = "/invoice/create";

    public static final String INVOICE_STATUS_CHECK = "/invoice/status/{serviceId}/{invoiceId}";

    public static final String PAYMENT_STATUS_CHECK = "/payment/status/{service_id}/{payment_id}";

    public static final String PAYMENT_STATUS_CHECK_BY_MTI = "/payment/status_by_mti/{service_id}/{merchant_trans_id}";

    public static final String PAYMENT_REVERSAL = "/payment/reversal/{service_id}/{payment_id}";

    public static final String PARTIAL_REFUND = "/payment/partial_reversal/{service_id}/{payment_id}/{amount}";

    public static final String CREATE_CARD_TOKEN = "/card_token/request";

    public static final String VERIFY_CARD_TOKEN = "/card_token/verify";

    public static final String PAYMENT_WITH_TOKEN = "/card_token/payment";

    public static final String DELETE_CARD_TOKEN = "/card_token/{service_id}/{card_token}";
}
