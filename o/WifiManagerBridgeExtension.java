package o;

import id.dana.onboarding.splash.SplashActivity;
import kotlin.jvm.functions.Function1;

public final class WifiManagerBridgeExtension implements Function1 {
    private final SplashActivity getMax;

    public WifiManagerBridgeExtension(SplashActivity splashActivity) {
        this.getMax = splashActivity;
    }

    public final Object invoke(Object obj) {
        return this.getMax.equals();
    }
}
