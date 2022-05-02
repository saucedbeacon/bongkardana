package id.dana.domain.sendmoney;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface TransferScenario {
    public static final String DEEP_CONTACT = "contactDeepLink";
    public static final String DEEP_LINK_MONEY = "moneyDeepLink";
    public static final String DEEP_LINK_MONEY_CONTACT = "moneyContactDeepLink";
    public static final String PROFILE_QR = "profileQR";
    public static final String REQUEST_MONEY = "requestMoneyQR";
    public static final String REQUEST_MONEY_BANK_QR = "requestMoneyBankQR";
    public static final String SEND_MONEY = "sendMoney";
    public static final String SPLIT_BILL = "splitBill";
}
