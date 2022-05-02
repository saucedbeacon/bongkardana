package id.dana.scanner.handler;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ScannerViewType {
    public static final String ACTIVITY = "ACTIVITY";
    public static final String FRAGMENT = "FRAGMENT";
}
