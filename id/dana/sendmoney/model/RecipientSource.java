package id.dana.sendmoney.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RecipientSource {
    public static final String ALL_CONTACTS = "All Contacts";
    public static final String DEEPLINK = "Deeplink";
    public static final String MANUAL_INPUT = "Manual Input";
    public static final String RECENT = "Recent";
}
