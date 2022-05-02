package id.dana.data.login.source;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ThirdChannel {
    public static final int FCM = 6;
    public static final int GCM = 3;
    public static final int HMS = 5;
    public static final int MIUI = 4;
}
