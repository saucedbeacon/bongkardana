package o;

import id.dana.di.modules.SplitBillShareQRModule;
import o.PopManager;
import o.b;

public final class toggledFullscreen implements getAdapterPosition<PopManager.getMax> {
    private final b.C0007b<PopManager.AnonymousClass1> getMax;
    private final SplitBillShareQRModule getMin;

    private toggledFullscreen(SplitBillShareQRModule splitBillShareQRModule, b.C0007b<PopManager.AnonymousClass1> bVar) {
        this.getMin = splitBillShareQRModule;
        this.getMax = bVar;
    }

    public static toggledFullscreen getMin(SplitBillShareQRModule splitBillShareQRModule, b.C0007b<PopManager.AnonymousClass1> bVar) {
        return new toggledFullscreen(splitBillShareQRModule, bVar);
    }

    public final /* synthetic */ Object get() {
        PopManager.getMax max = this.getMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
