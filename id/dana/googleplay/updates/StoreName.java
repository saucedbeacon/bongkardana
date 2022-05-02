package id.dana.googleplay.updates;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface StoreName {
    public static final String HUAWEI = "huaweistore";
    public static final String NINEAPPS = "9apps";
    public static final String OPPO = "oppostore";
    public static final String SAMSUNG = "samsungstore";
    public static final String VIVO = "vivostore";
    public static final String XIAOMI = "xiaomistore";
}
