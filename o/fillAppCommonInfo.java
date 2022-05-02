package o;

import id.dana.model.SelectedPayerModule;
import o.CameraView;

public final class fillAppCommonInfo implements getAdapterPosition<CameraView.length> {
    private final SelectedPayerModule getMin;

    private fillAppCommonInfo(SelectedPayerModule selectedPayerModule) {
        this.getMin = selectedPayerModule;
    }

    public static fillAppCommonInfo setMax(SelectedPayerModule selectedPayerModule) {
        return new fillAppCommonInfo(selectedPayerModule);
    }

    public final /* synthetic */ Object get() {
        CameraView.length min = this.getMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
