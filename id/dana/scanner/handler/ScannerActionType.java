package id.dana.scanner.handler;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ScannerActionType {
    public static final String OPEN_ACTIVITY = "open_activity";
    public static final String OPEN_H5 = "open_h5";
}
