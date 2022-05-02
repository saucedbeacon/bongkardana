package id.dana.domain.qrbarcode;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface DecodeQrBizType {
    public static final String EMVCO_CODE = "EMVCO_CODE";
    public static final String EXTERNAL_CASH_IN_QR = "EXTERNAL_CASH_IN_QR";
    public static final String EXTERNAL_TRANSFER_QR = "EXTERNAL_TRANSFER_QR";
    public static final String GN_AC_CODE = "GN_AC_CODE";
    public static final String MERCHANT_CODE = "MERCHANT_CODE";
    public static final String PARKING_CODE = "PARKING_CODE";
    public static final String PROFILE_CODE = "PROFILE_CODE";
    public static final String SPLIT_BILL_CODE = "SPLIT_BILL_CODE";
    public static final String TRANSFER_BANK_ACCOUNT_CODE = "TRANSFER_BANK_ACCOUNT_CODE";
    public static final String TRANSFER_CODE = "TRANSFER_CODE";
    public static final String USER_BANK_ACCOUNT_CODE = "USER_BANK_ACCOUNT_CODE";
    public static final String USER_MERCHANT_CODE = "USER_MERCHANT_CODE";
}
