package o;

import id.dana.model.SelectedPayerModule;
import o.CameraView;
import o.b;

public final class RVPerformanceLogHelper implements getAdapterPosition<CameraView.setMin> {
    private final SelectedPayerModule length;
    private final b.C0007b<setActivityOrFragment> setMin;

    private RVPerformanceLogHelper(SelectedPayerModule selectedPayerModule, b.C0007b<setActivityOrFragment> bVar) {
        this.length = selectedPayerModule;
        this.setMin = bVar;
    }

    public static RVPerformanceLogHelper setMax(SelectedPayerModule selectedPayerModule, b.C0007b<setActivityOrFragment> bVar) {
        return new RVPerformanceLogHelper(selectedPayerModule, bVar);
    }

    public final /* synthetic */ Object get() {
        CameraView.setMin length2 = this.length.length(this.setMin.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
