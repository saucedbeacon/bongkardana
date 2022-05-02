package o;

import id.dana.di.modules.PlayStoreReviewModules;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.b;

public final class dispatchTouchEvent implements getAdapterPosition<PdfImageSource.setMin> {
    private final b.C0007b<PdfViewerActivity.PageAdapter.AnonymousClass1> length;
    private final PlayStoreReviewModules setMax;

    private dispatchTouchEvent(PlayStoreReviewModules playStoreReviewModules, b.C0007b<PdfViewerActivity.PageAdapter.AnonymousClass1> bVar) {
        this.setMax = playStoreReviewModules;
        this.length = bVar;
    }

    public static dispatchTouchEvent setMax(PlayStoreReviewModules playStoreReviewModules, b.C0007b<PdfViewerActivity.PageAdapter.AnonymousClass1> bVar) {
        return new dispatchTouchEvent(playStoreReviewModules, bVar);
    }

    public final /* synthetic */ Object get() {
        PdfImageSource.setMin max = this.setMax.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
