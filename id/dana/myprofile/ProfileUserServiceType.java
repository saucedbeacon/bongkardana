package id.dana.myprofile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ProfileUserServiceType {
    public static final String AKULAKU = "setting_aku";
    public static final String BALANCE = "setting_balance";
    public static final String CHANGE_NAME = "setting_change_name";
    public static final String CHANGE_PIN = "setting_change_pin";
    public static final String DANA_ID = "setting_dana_id";
    public static final String HELP = "setting_help";
    public static final String INVESTMENT = "setting_investment";
    public static final String KYB = "setting_kyb";
    public static final String LOGOUT = "setting_logout";
    public static final String MY_BILLS = "setting_my_bills";
    public static final String MY_PAYMENT_CARD = "setting_my_payment_cards";
    public static final String PROMO_CODE = "setting_promo_code";
    public static final String PROMO_QUEST = "setting_promo_quest";
    public static final String REFERRAL = "setting_referral";
    public static final String SAVING = "setting_goals";
    public static final String TNC = "setting_tnc";
    public static final String TUTORIAL = "setting_tutorial";
}
