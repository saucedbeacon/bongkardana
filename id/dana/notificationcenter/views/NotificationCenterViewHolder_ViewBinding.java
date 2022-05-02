package id.dana.notificationcenter.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class NotificationCenterViewHolder_ViewBinding implements Unbinder {
    private NotificationCenterViewHolder length;

    @UiThread
    public NotificationCenterViewHolder_ViewBinding(NotificationCenterViewHolder notificationCenterViewHolder, View view) {
        this.length = notificationCenterViewHolder;
        notificationCenterViewHolder.content = (TextView) drawDividersHorizontal.setMin(view, R.id.f56002131364166, "field 'content'", TextView.class);
        notificationCenterViewHolder.iconNotification = (ImageView) drawDividersHorizontal.setMin(view, R.id.f56012131364167, "field 'iconNotification'", ImageView.class);
        notificationCenterViewHolder.notificationBadge = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f55992131364165, "field 'notificationBadge'", LinearLayout.class);
        notificationCenterViewHolder.notificationWrapper = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f56062131364172, "field 'notificationWrapper'", RelativeLayout.class);
        notificationCenterViewHolder.time = (TextView) drawDividersHorizontal.setMin(view, R.id.f56052131364171, "field 'time'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        NotificationCenterViewHolder notificationCenterViewHolder = this.length;
        if (notificationCenterViewHolder != null) {
            this.length = null;
            notificationCenterViewHolder.content = null;
            notificationCenterViewHolder.iconNotification = null;
            notificationCenterViewHolder.notificationBadge = null;
            notificationCenterViewHolder.notificationWrapper = null;
            notificationCenterViewHolder.time = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
