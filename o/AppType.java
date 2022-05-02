package o;

import id.dana.di.modules.NotificationCenterModule;
import o.b;
import o.getCarrierName;

public final class AppType implements getAdapterPosition<getCarrierName.length> {
    private final NotificationCenterModule getMax;
    private final b.C0007b<getPhoneNumber> getMin;

    public static getCarrierName.length getMax(NotificationCenterModule notificationCenterModule, getPhoneNumber getphonenumber) {
        getCarrierName.length max = notificationCenterModule.setMax(getphonenumber);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getCarrierName.length max = this.getMax.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
