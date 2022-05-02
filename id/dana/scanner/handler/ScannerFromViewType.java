package id.dana.scanner.handler;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ScannerFromViewType {
    public static final String FOUR_KINGKONG = "four_kingkong";
    public static final String GN_MERCHANT = "gn_merchant";
    public static final String SPLIT_BILL = "split_bill";
}
