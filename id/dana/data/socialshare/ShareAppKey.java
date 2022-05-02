package id.dana.data.socialshare;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ShareAppKey {
    public static final String DINGTALK = "dingtalk";
    public static final String FACEBOOK = "facebook";
    public static final String INSTAGRAM = "instagram";
    public static final String LINE = "line";
    public static final String MESSENGER = "messenger";
    public static final String SLACK = "slack";
    public static final String TELEGRAM = "telegram";
    public static final String WECHAT = "wechat";
    public static final String WHATSAPP = "whatsapp";
}
