package o;

import android.view.View;
import id.dana.onboarding.splash.SplashActivity;

public final class startWifi implements View.OnClickListener {
    private final SplashActivity getMin;

    public startWifi(SplashActivity splashActivity) {
        this.getMin = splashActivity;
    }

    public final void onClick(View view) {
        this.getMin.splashPresenter.get().Mean$Arithmetic();
    }
}
