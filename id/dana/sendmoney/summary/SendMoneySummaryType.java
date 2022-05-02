package id.dana.sendmoney.summary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SendMoneySummaryType {
    public static final String NORMAL = "normal";
    public static final String PROFILE = "profile";
    public static final String REQUEST_MONEY = "request_money";
}
