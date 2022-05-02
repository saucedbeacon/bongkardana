package id.dana.data.login.source;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface OsType {
    public static final int ANDROID = 1;
    public static final int IOS = 2;
}
