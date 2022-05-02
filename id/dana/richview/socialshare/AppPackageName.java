package id.dana.richview.socialshare;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface AppPackageName {
    public static final String DINGTALK = "com.alibaba.android.rimet";
    public static final String FACEBOOK = "com.facebook.katana";
    public static final String INSTAGRAM = "com.instagram.android";
    public static final String LINE = "jp.naver.line.android";
    public static final String MESSENGER = "com.facebook.orca";
    public static final String SLACK = "com.Slack";
    public static final String TELEGRAM = "org.telegram.messenger";
    public static final String WECHAT = "com.tencent.mm";
    public static final String WHATSAPP = "com.whatsapp";
}
