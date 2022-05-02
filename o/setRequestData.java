package o;

import id.dana.di.modules.SavingModule;
import o.SightCameraView;
import o.b;
import o.updateScreenRotation;

public final class setRequestData implements getAdapterPosition<updateScreenRotation.setMin> {
    private final b.C0007b<SightCameraView.OnScrollListener> getMax;
    private final SavingModule setMin;

    private setRequestData(SavingModule savingModule, b.C0007b<SightCameraView.OnScrollListener> bVar) {
        this.setMin = savingModule;
        this.getMax = bVar;
    }

    public static setRequestData setMin(SavingModule savingModule, b.C0007b<SightCameraView.OnScrollListener> bVar) {
        return new setRequestData(savingModule, bVar);
    }

    public final /* synthetic */ Object get() {
        updateScreenRotation.setMin min = this.setMin.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
