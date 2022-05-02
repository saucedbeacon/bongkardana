package id.dana.myprofile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MyProfileBundleKey {
    public static final String HIGHLIGHT_AUTO_ROUTING_FEATURE = "highlightAutoRoutingFeature";
    public static final String SETTING_MODEL = "settingModel";
    public static final String SHOW_ALWAYS_ASK_PIN_SUCCESS_DIALOG = "alwaysAskPinSuccessDialog";
}
