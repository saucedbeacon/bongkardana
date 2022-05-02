package id.dana.data.profilemenu;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MyProfileMenuViewType {
    public static final int AUTO_ROUTING = 15;
    public static final int AVATAR = 5;
    public static final int CHANGE_USERNAME = 16;
    public static final int DEFAULT = 2;
    public static final int DEFFERED_SHOWING = 7;
    public static final int FACE_AUTH = 9;
    public static final int FEATURE_CLICKABLE = 1;
    public static final int FEATURE_NON_CLICKABLE = 4;
    public static final int FEED_SHARING = 14;
    public static final int HEADER = 0;
    public static final int INVESTMENT = 18;
    public static final int MERCHANT_MANAGEMENT = 11;
    public static final int PAYMENT_AUTH = 6;
    public static final int PROFILE_COMPLETION = 13;
    public static final int SETTING_ACCOUNT_DEACTIVATE = 17;
    public static final int SETTING_MORE = 10;
    public static final int SETTING_STATEMENT = 12;
    public static final int SHARE_FEED = 8;
    public static final int USER_KYB = 3;
}
