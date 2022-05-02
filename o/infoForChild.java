package o;

import id.dana.contract.notification.PushNotificationModule;
import o.sortChildDrawingOrder;

public final class infoForChild implements getAdapterPosition<sortChildDrawingOrder.length> {
    private final PushNotificationModule setMin;

    private infoForChild(PushNotificationModule pushNotificationModule) {
        this.setMin = pushNotificationModule;
    }

    public static infoForChild setMin(PushNotificationModule pushNotificationModule) {
        return new infoForChild(pushNotificationModule);
    }

    public final /* synthetic */ Object get() {
        sortChildDrawingOrder.length min = this.setMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
