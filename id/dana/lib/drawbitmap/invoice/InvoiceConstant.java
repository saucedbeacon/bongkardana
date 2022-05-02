package id.dana.lib.drawbitmap.invoice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface InvoiceConstant {
    public static final String HEADER = "header";
    public static final String ORDER_DETAIL = "orderDetail";
    public static final String PAGE_TITLE = "pageTitle";
    public static final String PAYMENT_METHOD = "paymentMethod";
    public static final String PRICE_DETAIL = "priceDetail";
    public static final String SUMMARY = "summary";
    public static final String TRANSACTION_DETAIL = "transactionDetail";
}
