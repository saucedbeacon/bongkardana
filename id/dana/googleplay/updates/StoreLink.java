package id.dana.googleplay.updates;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface StoreLink {
    public static final String DANA_IN_9APPS = "https://dana-indonesia-s-digital-wallet.en.9apps.com/";
    public static final String DANA_IN_GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=";
}
