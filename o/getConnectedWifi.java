package o;

import id.dana.onboarding.splash.SplashActivity;

public final class getConnectedWifi implements removeStateDidChangeHandler {
    private final SplashActivity getMax;

    public getConnectedWifi(SplashActivity splashActivity) {
        this.getMax = splashActivity;
    }

    public final void getMax() {
        SplashActivity.setMin(this.getMax);
    }
}
