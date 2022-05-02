package o;

import id.dana.di.modules.SplitBillDetailModule;
import o.AUNoticeDialog;
import o.b;

public final class encrypt implements getAdapterPosition<AUNoticeDialog.AnonymousClass2.setMax> {
    private final SplitBillDetailModule getMin;
    private final b.C0007b<AUNoticeDialog.AnonymousClass3> length;

    public static AUNoticeDialog.AnonymousClass2.setMax setMax(SplitBillDetailModule splitBillDetailModule, AUNoticeDialog.AnonymousClass3 r1) {
        AUNoticeDialog.AnonymousClass2.setMax min = splitBillDetailModule.getMin(r1);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AUNoticeDialog.AnonymousClass2.setMax min = this.getMin.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
