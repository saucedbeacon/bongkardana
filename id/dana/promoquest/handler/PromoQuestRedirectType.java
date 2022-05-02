package id.dana.promoquest.handler;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PromoQuestRedirectType {
    public static final String INNER_URL = "INNER_URL";
    public static final String NATIVE_PAGE = "NATIVE_PAGE";
    public static final String SERVICES = "SERVICES";
    public static final String TRANSACTION_DETAIL = "TRANSACTION_DETAIL";
    public static final String URL = "URL";
    public static final String VOUCHER_DETAIL = "VOUCHER_DETAIL";
}
