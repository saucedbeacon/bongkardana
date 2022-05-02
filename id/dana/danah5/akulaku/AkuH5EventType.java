package id.dana.danah5.akulaku;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface AkuH5EventType {
    public static final int EVENT_DIALOG_FAIL = 0;
    public static final int EVENT_DIALOG_GUIDE = 1;
}
