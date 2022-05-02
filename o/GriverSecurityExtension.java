package o;

import id.dana.di.modules.SplitBillDetailModule;
import o.AUNoticeDialog;

public final class GriverSecurityExtension implements getAdapterPosition<AUNoticeDialog.AnonymousClass2.setMin> {
    private final SplitBillDetailModule setMax;

    public static AUNoticeDialog.AnonymousClass2.setMin length(SplitBillDetailModule splitBillDetailModule) {
        AUNoticeDialog.AnonymousClass2.setMin min = splitBillDetailModule.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AUNoticeDialog.AnonymousClass2.setMin min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
