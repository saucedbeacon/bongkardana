package id.dana.sendmoney;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RecipientContactType {
    public static final int ALL = 3;
    public static final int BANK = 1;
    public static final int CONTACTS = 2;
}
