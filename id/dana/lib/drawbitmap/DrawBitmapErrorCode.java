package id.dana.lib.drawbitmap;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface DrawBitmapErrorCode {
    public static final String GENERAL_ERROR = "001";
    public static final String OUT_OF_MEMORY = "002";
    public static final String RUN_OUT_OF_STORAGE = "003";
}
