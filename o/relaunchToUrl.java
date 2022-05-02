package o;

import java.util.concurrent.Callable;

final class relaunchToUrl implements Callable {
    private final handleMessage length;

    public relaunchToUrl(handleMessage handlemessage) {
        this.length = handlemessage;
    }

    public final Object call() {
        return this.length.lambda$getInterstitialBannerConfig$20();
    }
}
