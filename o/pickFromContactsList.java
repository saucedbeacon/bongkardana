package o;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import id.dana.notificationcenter.views.NotificationCenterFragment;

public final class pickFromContactsList implements SwipeRefreshLayout.setMin {
    private final NotificationCenterFragment length;

    public pickFromContactsList(NotificationCenterFragment notificationCenterFragment) {
        this.length = notificationCenterFragment;
    }

    public final void getMax() {
        NotificationCenterFragment.length(this.length);
    }
}
