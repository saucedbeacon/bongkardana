package o;

import id.dana.notification.NotificationActivity;

public final class TinyAppHostApduService implements RedDotManager {
    private final String getMin;
    private final NotificationActivity setMin;

    public TinyAppHostApduService(NotificationActivity notificationActivity, String str) {
        this.setMin = notificationActivity;
        this.getMin = str;
    }

    public final void accept(Object obj) {
        NotificationActivity.getMax(this.setMin, this.getMin, (Boolean) obj);
    }
}
