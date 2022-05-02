package o;

import id.dana.di.modules.OCRCameraModule;
import id.dana.ocr.OCRCameraContract;
import id.dana.ocr.OCRCameraPresenter;
import o.b;

public final class restore implements getAdapterPosition<OCRCameraContract.Presenter> {
    private final OCRCameraModule setMax;
    private final b.C0007b<OCRCameraPresenter> setMin;

    private restore(OCRCameraModule oCRCameraModule, b.C0007b<OCRCameraPresenter> bVar) {
        this.setMax = oCRCameraModule;
        this.setMin = bVar;
    }

    public static restore setMin(OCRCameraModule oCRCameraModule, b.C0007b<OCRCameraPresenter> bVar) {
        return new restore(oCRCameraModule, bVar);
    }

    public final /* synthetic */ Object get() {
        OCRCameraContract.Presenter min = this.setMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
