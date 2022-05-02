package id.dana.sendmoney.recipient;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RecipientViewType {
    public static final int BANK_SECTION_NAME = 10;
    public static final int CONTACT_SECTION_NAME = 1;
    public static final int LIST_BANK = 2;
    public static final int LIST_CONTACT = 3;
    public static final int NO_CONTACT_AVAILABLE = 19;
    public static final int NO_CONTACT_FOUND = 4;
    public static final int NO_CONTACT_PERMISSION = 5;
    public static final int NO_RECENT_BANK = 17;
    public static final int RECENT_CONTACT = 15;
    public static final int RECENT_TRANSFER = 6;
    public static final int SCANNER = 16;
    public static final int SEARCH_LIST_BANK = 24;
    public static final int SEARCH_RECENT_BANK_EMPTY = 18;
    public static final int SEARCH_SECTION_BANK = 20;
    public static final int SEARCH_SECTION_CONTACT = 21;
    public static final int SEARCH_SECTION_EMPTY = 22;
    public static final int SEARCH_SECTION_LAST_TRANSACTION = 23;
    public static final int SEARCH_SECTION_NAME = 7;
    public static final int SEE_LESS_BANK = 14;
    public static final int SEE_MORE_BANK = 13;
    public static final int SEND_NEW_ACCOUNT_NUMBER = 12;
    public static final int SEND_NEW_BANK = 9;
    public static final int SEND_NEW_CONTACT = 8;
    public static final int SEND_TO_PHONE_NUMBER = 11;
}
