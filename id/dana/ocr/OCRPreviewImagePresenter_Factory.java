package id.dana.ocr;

import id.dana.ocr.OCRPreviewImageContract;
import o.IRedDotManager;
import o.b;
import o.getAdapterPosition;
import o.getScheme;

public final class OCRPreviewImagePresenter_Factory implements getAdapterPosition<OCRPreviewImagePresenter> {
    private final b.C0007b<getScheme> length;
    private final b.C0007b<IRedDotManager> setMax;
    private final b.C0007b<OCRPreviewImageContract.View> setMin;

    private OCRPreviewImagePresenter_Factory(b.C0007b<OCRPreviewImageContract.View> bVar, b.C0007b<getScheme> bVar2, b.C0007b<IRedDotManager> bVar3) {
        this.setMin = bVar;
        this.length = bVar2;
        this.setMax = bVar3;
    }

    public static OCRPreviewImagePresenter_Factory setMax(b.C0007b<OCRPreviewImageContract.View> bVar, b.C0007b<getScheme> bVar2, b.C0007b<IRedDotManager> bVar3) {
        return new OCRPreviewImagePresenter_Factory(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new OCRPreviewImagePresenter(this.setMin.get(), this.length.get(), this.setMax.get());
    }
}
