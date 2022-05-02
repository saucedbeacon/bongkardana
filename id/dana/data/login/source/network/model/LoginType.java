package id.dana.data.login.source.network.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface LoginType {
    public static final String HOLD_LOGIN = "HOLD_LOGIN";
    public static final String NORMAL_LOGIN = "NORMAL_LOGIN";
    public static final String TRUST_RISK_LOGIN = "TRUST_RISK_LOGIN";
}
