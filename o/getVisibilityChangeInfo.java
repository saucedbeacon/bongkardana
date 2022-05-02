package o;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import id.dana.home.HomeTabActivity;
import id.dana.notification.NotificationActivity;

final class getVisibilityChangeInfo implements DialogInterface.OnDismissListener {
    private final Activity length;
    private final setCanRemoveViews setMin;

    public getVisibilityChangeInfo(setCanRemoveViews setcanremoveviews, Activity activity) {
        this.setMin = setcanremoveviews;
        this.length = activity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Activity activity = this.length;
        if (activity instanceof NotificationActivity) {
            if (activity.isTaskRoot()) {
                Intent intent = new Intent(activity, HomeTabActivity.class);
                intent.setFlags(268468224);
                activity.startActivity(intent);
            }
            activity.finish();
        }
    }
}
