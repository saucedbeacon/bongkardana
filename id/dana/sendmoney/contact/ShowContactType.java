package id.dana.sendmoney.contact;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ShowContactType {
    public static final int ALL_CONTACT = 0;
    public static final int DANA_CONTACT = 1;
    public static final int NON_DANA_CONTACT = 2;
}
