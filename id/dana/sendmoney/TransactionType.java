package id.dana.sendmoney;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface TransactionType {
    public static final String REQUEST_MONEY = "request_money";
    public static final String SEND_MONEY = "send_money";
    public static final String SEND_MONEY_TO_CASHIER = "send_money_to_cashier";
    public static final String SPLIT_BILL = "split_bill";
}
