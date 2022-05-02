package o;

import id.dana.di.modules.SplitBillHistoryModule;
import o.AUNoticeDialog;

public final class GriverEncryptProxy implements getAdapterPosition<AUNoticeDialog.AnonymousClass1.getMax> {
    private final SplitBillHistoryModule getMin;

    public static AUNoticeDialog.AnonymousClass1.getMax getMin(SplitBillHistoryModule splitBillHistoryModule) {
        AUNoticeDialog.AnonymousClass1.getMax length = splitBillHistoryModule.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AUNoticeDialog.AnonymousClass1.getMax length = this.getMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
