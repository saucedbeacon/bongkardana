package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.playstorereview.PlayStoreReviewActivity;
import o.PdfImageSource;

public final class destory implements getBindingAdapter<PlayStoreReviewActivity> {
    @InjectedFieldSignature("id.dana.playstorereview.PlayStoreReviewActivity.presenter")
    public static void setMax(PlayStoreReviewActivity playStoreReviewActivity, PdfImageSource.setMin setmin) {
        playStoreReviewActivity.presenter = setmin;
    }
}
