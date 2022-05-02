package o;

import id.dana.data.config.source.amcs.result.PlayStoreReviewConfig;

final class addBridgeExtensionDSL implements RedDotDrawable {
    private final onFragmentCreate length;

    public addBridgeExtensionDSL(onFragmentCreate onfragmentcreate) {
        this.length = onfragmentcreate;
    }

    public final Object apply(Object obj) {
        return this.length.onGotPlayStoreReviewFeature((PlayStoreReviewConfig) obj);
    }
}
