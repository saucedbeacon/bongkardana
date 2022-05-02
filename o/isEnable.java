package o;

import id.dana.di.modules.PushNotificationModule;
import o.sortChildDrawingOrder;

public final class isEnable implements getAdapterPosition<sortChildDrawingOrder.length> {
    private final PushNotificationModule getMin;

    private isEnable(PushNotificationModule pushNotificationModule) {
        this.getMin = pushNotificationModule;
    }

    public static isEnable getMax(PushNotificationModule pushNotificationModule) {
        return new isEnable(pushNotificationModule);
    }

    public final /* synthetic */ Object get() {
        sortChildDrawingOrder.length max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
