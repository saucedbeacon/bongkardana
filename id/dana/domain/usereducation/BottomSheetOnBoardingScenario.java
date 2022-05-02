package id.dana.domain.usereducation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface BottomSheetOnBoardingScenario {
    public static final String DANA_FOOD = "dana_food";
    public static final String DANA_KAGET = "dana_kaget";
    public static final String FRIENDSHIP = "friendship";
    public static final String HIDE_QUICK_ACTION = "hide_quick_action";
    public static final String HOME_PAYMENT_SETTING = "home_payment_setting";
    public static final String MY_BILLS = "my_bills";
    public static final String REQUEST_MONEY = "request_money";
    public static final String SAVING_GOAL = "saving_goal";
    public static final String SCAN_QR = "scan_qr";
    public static final String SEND_MONEY = "send_money";
    public static final String SEND_MONEY_CONTACT_REQUEST_PERMISSION = "send_money_contact_permission";
    public static final String SNAP_RECEIPT = "snap_receipt";
    public static final String SPLIT_BILL = "split_bill";
    public static final String STATEMENT = "statement";
    public static final String TOP_UP = "top_up";
    public static final String TRUSTED_DEVICE = "trusted_device";
}
