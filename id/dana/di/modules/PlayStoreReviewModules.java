package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.PdfImageSource;
import o.PdfViewerActivity;

@Module
public class PlayStoreReviewModules {
    PdfImageSource.length setMin;

    @PerActivity
    @Provides
    public PdfImageSource.setMin getMax(PdfViewerActivity.PageAdapter.AnonymousClass1 r1) {
        return r1;
    }

    public PlayStoreReviewModules(PdfImageSource.length length) {
        this.setMin = length;
    }

    @PerActivity
    @Provides
    public PdfImageSource.length length() {
        return this.setMin;
    }
}
