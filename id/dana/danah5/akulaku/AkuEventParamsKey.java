package id.dana.danah5.akulaku;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface AkuEventParamsKey {
    public static final String KEY_ACTIVITY = "activity";
    public static final String KEY_AKUEVENT_SYNC_RESULT = "akuEventSyncResult";
    public static final String KEY_GUIDE_ACTION = "action";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TITLE = "title";
}
