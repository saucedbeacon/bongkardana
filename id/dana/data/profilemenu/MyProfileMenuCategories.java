package id.dana.data.profilemenu;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MyProfileMenuCategories {
    public static final String AKULAKU_FEATURE = "setting_aku";
    public static final String MY_BILLS_FEATURE = "setting_my_bills";
    public static final String PROFILE_FEATURES = "setting_category_features";
    public static final String PROFILE_USER_SERVICE = "setting_category_user_service";
    public static final String SETTING_CATEGORY = "setting_category_";
    public static final String SETTING_REFERRAL = "setting_referral";
    public static final String SETTING_TNC = "setting_tnc";
    public static final String SETTING_USER_KYB = "setting_kyb";
}
