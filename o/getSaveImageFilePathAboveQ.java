package o;

import id.dana.di.modules.SplitBillModule;
import o.AUNoticeDialog;
import o.b;

public final class getSaveImageFilePathAboveQ implements getAdapterPosition<AUNoticeDialog.OnClickNegativeListener.setMin> {
    private final b.C0007b<setTitleTextSize> getMax;
    private final SplitBillModule getMin;

    private getSaveImageFilePathAboveQ(SplitBillModule splitBillModule, b.C0007b<setTitleTextSize> bVar) {
        this.getMin = splitBillModule;
        this.getMax = bVar;
    }

    public static getSaveImageFilePathAboveQ getMin(SplitBillModule splitBillModule, b.C0007b<setTitleTextSize> bVar) {
        return new getSaveImageFilePathAboveQ(splitBillModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AUNoticeDialog.OnClickNegativeListener.setMin min = this.getMin.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
