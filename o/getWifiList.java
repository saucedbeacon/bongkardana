package o;

import id.dana.onboarding.splash.SplashActivity;

public final class getWifiList implements removeStateDidChangeHandler {
    private final SplashActivity getMax;

    public getWifiList(SplashActivity splashActivity) {
        this.getMax = splashActivity;
    }

    public final void getMax() {
        SplashActivity.getMax(this.getMax);
    }
}
