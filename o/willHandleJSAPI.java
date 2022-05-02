package o;

import id.dana.di.modules.OCRPreviewImageModule;
import id.dana.ocr.OCRPreviewImageContract;
import id.dana.ocr.OCRPreviewImagePresenter;
import o.b;

public final class willHandleJSAPI implements getAdapterPosition<OCRPreviewImageContract.Presenter> {
    private final b.C0007b<OCRPreviewImagePresenter> length;
    private final OCRPreviewImageModule setMax;

    private willHandleJSAPI(OCRPreviewImageModule oCRPreviewImageModule, b.C0007b<OCRPreviewImagePresenter> bVar) {
        this.setMax = oCRPreviewImageModule;
        this.length = bVar;
    }

    public static willHandleJSAPI length(OCRPreviewImageModule oCRPreviewImageModule, b.C0007b<OCRPreviewImagePresenter> bVar) {
        return new willHandleJSAPI(oCRPreviewImageModule, bVar);
    }

    public final /* synthetic */ Object get() {
        OCRPreviewImageContract.Presenter length2 = this.setMax.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
