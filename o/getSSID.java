package o;

import android.view.View;
import id.dana.onboarding.splash.SplashActivity;

public final class getSSID implements View.OnClickListener {
    private final SplashActivity setMax;

    public getSSID(SplashActivity splashActivity) {
        this.setMax = splashActivity;
    }

    public final void onClick(View view) {
        SplashActivity.IsOverlapping(this.setMax);
    }
}
