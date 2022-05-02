package id.dana.lib.analytics.thirdparty;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ThirdParty {
    public static final int MIXPANEL = 1;
}
