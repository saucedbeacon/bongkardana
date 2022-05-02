package o;

import android.app.Activity;
import id.dana.pay.PayActivity;
import id.dana.tracker.TrackerKey;

public final class excludeType {
    public excludeType(Activity activity) {
        activity.startActivity(PayActivity.createPayActivityIntent(activity, TrackerKey.SourceType.DEEP_LINK));
    }
}
