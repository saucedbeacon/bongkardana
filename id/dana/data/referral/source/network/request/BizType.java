package id.dana.data.referral.source.network.request;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface BizType {
    public static final String REFERRED = "REFERRED";
    public static final String REFERRER = "REFERRER";
}
