package o;

import id.dana.di.modules.SplitBillHistoryModule;
import o.AUNoticeDialog;
import o.b;

public final class decrypt implements getAdapterPosition<AUNoticeDialog.AnonymousClass1.setMax> {
    private final SplitBillHistoryModule getMin;
    private final b.C0007b<AUNoticeDialog.OnClickPositiveListener> setMin;

    public static AUNoticeDialog.AnonymousClass1.setMax getMin(SplitBillHistoryModule splitBillHistoryModule, AUNoticeDialog.OnClickPositiveListener onClickPositiveListener) {
        AUNoticeDialog.AnonymousClass1.setMax max = splitBillHistoryModule.setMax(onClickPositiveListener);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AUNoticeDialog.AnonymousClass1.setMax max = this.getMin.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
