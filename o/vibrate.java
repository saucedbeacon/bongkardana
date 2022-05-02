package o;

import id.dana.onboarding.splash.SplashActivity;

public final class vibrate implements RedDotManager {
    private final SplashActivity setMin;

    public vibrate(SplashActivity splashActivity) {
        this.setMin = splashActivity;
    }

    public final void accept(Object obj) {
        SplashActivity.equals(this.setMin);
    }
}
