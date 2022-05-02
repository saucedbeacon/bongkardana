package id.dana.sendmoney;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RecentDetailType {
    public static final String BANK = "bank";
    public static final String CASHOUT_AGENTS = "cashoutAgents";
    public static final String CONTACTS = "contacts";
    public static final String LINK = "link";
    public static final String RECENT_CONTACTS = "recentContacts";
    public static final String SCANNER = "scanner";
}
