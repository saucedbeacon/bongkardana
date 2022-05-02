package id.dana.ocr;

import id.dana.ocr.OCRCameraContract;
import id.dana.ocr.model.OCRRequestModel;
import o.b;
import o.getAdapterPosition;

public final class OCRCameraPresenter_Factory implements getAdapterPosition<OCRCameraPresenter> {
    private final b.C0007b<OCRRequestModel> setMax;
    private final b.C0007b<OCRCameraContract.View> setMin;

    private OCRCameraPresenter_Factory(b.C0007b<OCRCameraContract.View> bVar, b.C0007b<OCRRequestModel> bVar2) {
        this.setMin = bVar;
        this.setMax = bVar2;
    }

    public static OCRCameraPresenter_Factory length(b.C0007b<OCRCameraContract.View> bVar, b.C0007b<OCRRequestModel> bVar2) {
        return new OCRCameraPresenter_Factory(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new OCRCameraPresenter(this.setMin.get(), this.setMax.get());
    }
}
