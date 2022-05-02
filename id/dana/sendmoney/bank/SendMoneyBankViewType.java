package id.dana.sendmoney.bank;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SendMoneyBankViewType {
    public static final int LAYOUT_COLLAPSIBLE_BANK = 3;
    public static final int LAYOUT_OTHER_BANK = 0;
    public static final int LAYOUT_RECENT_BANK = 1;
    public static final int LAYOUT_RECENT_BANK_EMPTY = 2;
}
