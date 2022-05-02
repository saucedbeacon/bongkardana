package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import id.dana.notification.DanaFirebaseMessagingService;
import id.dana.notification.NotificationActivity;
import id.dana.notification.NotificationData;

public final class MakePhoneCallBridgeExtension extends isNfcEnable {
    public MakePhoneCallBridgeExtension(Context context, NotificationData notificationData) {
        super(context, notificationData);
    }

    public final void setMax() {
        NotificationData notificationData = this.length;
        StringBuilder sb = new StringBuilder("https://m.dana.id");
        sb.append(this.length.toFloatRange);
        notificationData.isInside = sb.toString();
        Intent intent = new Intent(this.getMax, NotificationActivity.class);
        intent.setFlags(603979776);
        intent.putExtra(DanaFirebaseMessagingService.MESSAGE_DATA, this.length);
        ChoosePhoneContactBridgeExtension.setMax(this.getMax, this.length, PendingIntent.getActivity(this.getMax, 0, intent, 268435456), false);
    }

    public final void setMax(Activity activity) {
        Intent intent = new Intent(activity, NotificationActivity.class);
        NotificationData notificationData = this.length;
        StringBuilder sb = new StringBuilder("https://m.dana.id");
        sb.append(this.length.toFloatRange);
        notificationData.isInside = sb.toString();
        intent.putExtra(DanaFirebaseMessagingService.MESSAGE_DATA, this.length);
        activity.startActivity(intent);
    }
}
