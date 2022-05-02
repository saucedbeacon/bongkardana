package id.dana.sendmoney.recipienthome;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SendMoneyHomeMenuActionType {
    public static final String BANK = "bank";
    public static final String CHAT = "chat";
    public static final String EXTERNAL = "external";
    public static final String OUTLET = "outlet";
    public static final String PHONE_NUMBER = "phonenumber";
}
