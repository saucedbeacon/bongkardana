package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.merchantreview.CreateReviewWorker;

public final class sendCacheMessageToRender implements getBindingAdapter<CreateReviewWorker> {
    @InjectedFieldSignature("id.dana.nearbyme.merchantreview.CreateReviewWorker.createReview")
    public static void setMax(CreateReviewWorker createReviewWorker, BridgeUtils bridgeUtils) {
        createReviewWorker.createReview = bridgeUtils;
    }
}
