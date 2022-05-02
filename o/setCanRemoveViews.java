package o;

import android.app.Activity;
import id.dana.R;
import id.dana.base.BaseActivity;

public final class setCanRemoveViews {
    public setCanRemoveViews(Activity activity) {
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).showWarningDialog(activity.getString(R.string.unsupported_deeplink_msg), new getVisibilityChangeInfo(this, activity));
        }
    }
}
