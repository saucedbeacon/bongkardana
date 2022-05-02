package o;

import id.dana.di.modules.SplitBillSectionModule;
import o.PopManager;

public final class GriverWebViewSettingExtension implements getAdapterPosition<PopManager.PopBean.setMin> {
    private final SplitBillSectionModule setMin;

    private GriverWebViewSettingExtension(SplitBillSectionModule splitBillSectionModule) {
        this.setMin = splitBillSectionModule;
    }

    public static GriverWebViewSettingExtension getMin(SplitBillSectionModule splitBillSectionModule) {
        return new GriverWebViewSettingExtension(splitBillSectionModule);
    }

    public final /* synthetic */ Object get() {
        PopManager.PopBean.setMin max = this.setMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
