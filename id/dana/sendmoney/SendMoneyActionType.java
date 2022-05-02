package id.dana.sendmoney;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SendMoneyActionType {
    public static final String HIDDEN_SENDMONEY_SUMMARY = "hiddenSendMoneySummary";
    public static final String SEARCH_CONTACT = "searchContact";
    public static final String SEND_MONEY_BANK = "bank";
    public static final String SEND_MONEY_CHAT = "chat";
    public static final String SEND_MONEY_EXTERNAL = "external";
    public static final String SEND_MONEY_OUTLET = "outlet";
    public static final String SEND_MONEY_PHONE_NUMBER = "phonenumber";
    public static final String SHOW_SENDMONEY_BANK_SUMMARY = "showSendMoneyBankSummary";
    public static final String SHOW_SENDMONEY_CONTACT_SUMMARY = "showSendMoneyContactSummary";
    public static final String SHOW_SENDMONEY_LINK_SUMMARY = "showSendMoneySummary";
}
