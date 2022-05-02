package id.dana.lib.drawbitmap;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface DrawBitmapResultType {
    public static final String GENERAL_ERROR = "GENERAL_ERROR";
    public static final String OUT_OF_MEMORY = "OUT_OF_MEMORY";
    public static final String RUN_OUT_OF_STORAGE = "RUN_OUT_OF_STORAGE";
    public static final String SUCCESS = "";
}
