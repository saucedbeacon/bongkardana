package o;

import android.app.Activity;
import android.content.Context;
import id.dana.lazada.LazadaGuideActivity;
import id.dana.notification.NotificationData;

public final class TinyAppConstants extends isNfcEnable {
    public TinyAppConstants(Context context, NotificationData notificationData) {
        super(context, notificationData);
    }

    public final void setMax() {
        ChoosePhoneContactBridgeExtension.setMax(this.getMax, this.length, LazadaGuideActivity.createPendingIntent(this.getMax), false);
    }

    public final void setMax(Activity activity) {
        activity.startActivity(LazadaGuideActivity.createIntent(activity));
    }
}
