package id.dana.domain.recentrecipient;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RecipientContactType {
    public static final int BANK = 1;
    public static final int CONTACTS = 2;
}
