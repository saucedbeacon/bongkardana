package id.dana.domain.verifytoken;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface TokenBizScene {
    public static final String LOGIN = "LOGIN";
    public static final String RISK_CHALLENGE = "RISK_CHALLENGE";
}
