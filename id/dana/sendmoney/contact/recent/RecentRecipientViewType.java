package id.dana.sendmoney.contact.recent;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RecentRecipientViewType {
    public static final int BANK = 4;
    public static final int CASHOUT_AGENTS = 5;
    public static final int CONTACT = 2;
    public static final int EMPTY = 1;
    public static final int LINK = 3;
    public static final int SCANNER = 0;
}
