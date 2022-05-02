package o;

import android.view.View;
import id.dana.onboarding.splash.SplashActivity;

public final class WifiInfoExtension implements View.OnClickListener {
    private final SplashActivity setMin;

    public WifiInfoExtension(SplashActivity splashActivity) {
        this.setMin = splashActivity;
    }

    public final void onClick(View view) {
        SplashActivity.getMin(this.setMin);
    }
}
