package o;

import id.dana.di.modules.SavingCreateModule;
import o.SightCameraView;
import o.b;
import o.notifyMicError;

public final class DownloadRequest implements getAdapterPosition<notifyMicError.getMin> {
    private final b.C0007b<SightCameraView.APTakePictureListener> getMin;
    private final SavingCreateModule setMin;

    private DownloadRequest(SavingCreateModule savingCreateModule, b.C0007b<SightCameraView.APTakePictureListener> bVar) {
        this.setMin = savingCreateModule;
        this.getMin = bVar;
    }

    public static DownloadRequest getMin(SavingCreateModule savingCreateModule, b.C0007b<SightCameraView.APTakePictureListener> bVar) {
        return new DownloadRequest(savingCreateModule, bVar);
    }

    public final /* synthetic */ Object get() {
        notifyMicError.getMin max = this.setMin.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
