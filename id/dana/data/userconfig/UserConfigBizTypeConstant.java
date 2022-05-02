package id.dana.data.userconfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface UserConfigBizTypeConstant {
    public static final String CONFIG_FRIENDSHIP_SHARE = "config_friendship_share";
    public static final String CONFIG_LAZADA_JKT_CONSENT = "config_lazada_jkt_consent";
    public static final String CONFIG_MY_FAVORITE_SERVICE = "config_my_favourite_services";
    public static final String CONFIG_RECENT_TRANSACTION = "config_recent_transaction";
    public static final String CONFIG_SECURE_RECENT_TRANSACTION = "config_secure_recent_transaction";
    public static final String CONFIG_USER_BANK_ACCOUNT_QR = "user_bank_account_qr";
    public static final String DIALOG_TNC = "config_terms_conditions";
    public static final String SHARE_FEED = "share_setting";
}
