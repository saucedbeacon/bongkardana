package id.dana.danah5.akulaku.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface GuideAction {
    public static final String BINDINGFLOW = "bindingFlow";
    public static final String CHECKOUT = "checkout";
    public static final String CONFIRMATION = "confirmation";
}
