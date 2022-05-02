package id.dana.domain.featureconfig.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ExpressPayTag {
    public static final String FEATURE_SHOW_IN_P2P = "feature_show_in_p2p";
    public static final String FEATURE_SHOW_IN_QR = "feature_show_in_qr";
}
