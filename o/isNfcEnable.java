package o;

import android.app.Activity;
import android.content.Context;
import id.dana.notification.NotificationData;

public abstract class isNfcEnable {
    protected Context getMax;
    protected NotificationData length;

    public abstract void setMax();

    public abstract void setMax(Activity activity);

    public isNfcEnable(Context context, NotificationData notificationData) {
        this.getMax = context;
        this.length = notificationData;
    }
}
