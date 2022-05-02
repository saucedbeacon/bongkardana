package id.dana.promocenter.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PromoActionType {
    public static final String PRIMARY = "primary";
    public static final String SECONDARY = "secondary";
}
