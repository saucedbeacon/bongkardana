package o;

import id.dana.di.modules.SavingUpdateModule;
import o.CameraView;

public final class setEnds implements getAdapterPosition<CameraView.AnonymousClass1.getMin> {
    private final SavingUpdateModule setMin;

    private setEnds(SavingUpdateModule savingUpdateModule) {
        this.setMin = savingUpdateModule;
    }

    public static setEnds setMin(SavingUpdateModule savingUpdateModule) {
        return new setEnds(savingUpdateModule);
    }

    public final /* synthetic */ Object get() {
        CameraView.AnonymousClass1.getMin length = this.setMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
