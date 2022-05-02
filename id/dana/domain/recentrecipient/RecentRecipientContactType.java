package id.dana.domain.recentrecipient;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RecentRecipientContactType {
    public static final int SEND_MONEY = 0;
    public static final int SPLIT_BILL = 1;
}
