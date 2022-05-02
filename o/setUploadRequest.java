package o;

import id.dana.di.modules.SavingTopUpHistoryModule;
import o.SightCameraView;
import o.b;
import o.isEnableFrameData;

public final class setUploadRequest implements getAdapterPosition<isEnableFrameData.getMax> {
    private final SavingTopUpHistoryModule getMin;
    private final b.C0007b<SightCameraView.TakePictureListener> length;

    private setUploadRequest(SavingTopUpHistoryModule savingTopUpHistoryModule, b.C0007b<SightCameraView.TakePictureListener> bVar) {
        this.getMin = savingTopUpHistoryModule;
        this.length = bVar;
    }

    public static setUploadRequest setMin(SavingTopUpHistoryModule savingTopUpHistoryModule, b.C0007b<SightCameraView.TakePictureListener> bVar) {
        return new setUploadRequest(savingTopUpHistoryModule, bVar);
    }

    public final /* synthetic */ Object get() {
        isEnableFrameData.getMax max = this.getMin.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
