package o;

import id.dana.di.modules.PlayStoreReviewModules;
import o.PdfImageSource;

public final class GriverConfigConstants implements getAdapterPosition<PdfImageSource.length> {
    private final PlayStoreReviewModules getMax;

    private GriverConfigConstants(PlayStoreReviewModules playStoreReviewModules) {
        this.getMax = playStoreReviewModules;
    }

    public static GriverConfigConstants length(PlayStoreReviewModules playStoreReviewModules) {
        return new GriverConfigConstants(playStoreReviewModules);
    }

    public final /* synthetic */ Object get() {
        PdfImageSource.length length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
