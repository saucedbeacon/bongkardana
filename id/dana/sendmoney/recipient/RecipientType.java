package id.dana.sendmoney.recipient;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RecipientType {
    public static final String BANK = "bank";
    public static final String CONTACT = "contact";
    public static final String LINK = "link";
    public static final String OTC = "otc";
    public static final String RECENT_CONTACTS = "recentContacts";
    public static final String SCANNER = "scanner";
}
