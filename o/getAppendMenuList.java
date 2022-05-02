package o;

import id.dana.di.modules.ReferralDialogModule;
import o.MemoryWarningBridgeExtension;

public final class getAppendMenuList implements getAdapterPosition<MemoryWarningBridgeExtension.AnonymousClass1.getMin> {
    private final ReferralDialogModule setMax;

    private getAppendMenuList(ReferralDialogModule referralDialogModule) {
        this.setMax = referralDialogModule;
    }

    public static getAppendMenuList setMax(ReferralDialogModule referralDialogModule) {
        return new getAppendMenuList(referralDialogModule);
    }

    public final /* synthetic */ Object get() {
        MemoryWarningBridgeExtension.AnonymousClass1.getMin min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
