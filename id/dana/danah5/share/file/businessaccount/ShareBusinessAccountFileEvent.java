package id.dana.danah5.share.file.businessaccount;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ShareBusinessAccountFileEvent {
    public static final String BUSINESS_ACCOUNT_QR = "shareBusinessAccountQR";
}
