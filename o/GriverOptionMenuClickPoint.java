package o;

import id.dana.di.modules.UploadSnapReceiptModule;
import id.dana.ocr.UploadSnapReceiptContract;
import id.dana.ocr.UploadSnapReceiptPresenter;
import o.b;

public final class GriverOptionMenuClickPoint implements getAdapterPosition<UploadSnapReceiptContract.Presenter> {
    private final UploadSnapReceiptModule getMin;
    private final b.C0007b<UploadSnapReceiptPresenter> setMin;

    private GriverOptionMenuClickPoint(UploadSnapReceiptModule uploadSnapReceiptModule, b.C0007b<UploadSnapReceiptPresenter> bVar) {
        this.getMin = uploadSnapReceiptModule;
        this.setMin = bVar;
    }

    public static GriverOptionMenuClickPoint setMax(UploadSnapReceiptModule uploadSnapReceiptModule, b.C0007b<UploadSnapReceiptPresenter> bVar) {
        return new GriverOptionMenuClickPoint(uploadSnapReceiptModule, bVar);
    }

    public final /* synthetic */ Object get() {
        UploadSnapReceiptContract.Presenter max = this.getMin.getMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
