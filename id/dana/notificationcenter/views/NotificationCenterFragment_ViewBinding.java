package id.dana.notificationcenter.views;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import id.dana.R;
import id.dana.base.BaseWithToolbarFragment_ViewBinding;
import o.drawDividersHorizontal;

public class NotificationCenterFragment_ViewBinding extends BaseWithToolbarFragment_ViewBinding {
    private NotificationCenterFragment length;

    @UiThread
    public NotificationCenterFragment_ViewBinding(NotificationCenterFragment notificationCenterFragment, View view) {
        super(notificationCenterFragment, view);
        this.length = notificationCenterFragment;
        notificationCenterFragment.progressBar = (ProgressBar) drawDividersHorizontal.setMin(view, R.id.f57022131364279, "field 'progressBar'", ProgressBar.class);
        notificationCenterFragment.rcNotifications = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f55972131364163, "field 'rcNotifications'", RecyclerView.class);
        notificationCenterFragment.refreshNotification = (SwipeRefreshLayout) drawDividersHorizontal.setMin(view, R.id.f57762131364354, "field 'refreshNotification'", SwipeRefreshLayout.class);
    }

    public final void setMax() {
        NotificationCenterFragment notificationCenterFragment = this.length;
        if (notificationCenterFragment != null) {
            this.length = null;
            notificationCenterFragment.progressBar = null;
            notificationCenterFragment.rcNotifications = null;
            notificationCenterFragment.refreshNotification = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
