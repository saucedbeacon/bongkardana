package o;

import id.dana.contract.notification.PushNotificationModule;
import o.b;
import o.sortChildDrawingOrder;

public final class infoForAnyChild implements getAdapterPosition<sortChildDrawingOrder.getMin> {
    private final PushNotificationModule setMax;
    private final b.C0007b<isDecorView> setMin;

    private infoForAnyChild(PushNotificationModule pushNotificationModule, b.C0007b<isDecorView> bVar) {
        this.setMax = pushNotificationModule;
        this.setMin = bVar;
    }

    public static infoForAnyChild setMin(PushNotificationModule pushNotificationModule, b.C0007b<isDecorView> bVar) {
        return new infoForAnyChild(pushNotificationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        sortChildDrawingOrder.getMin min = this.setMax.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
