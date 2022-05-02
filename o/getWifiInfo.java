package o;

import android.view.View;
import id.dana.onboarding.splash.SplashActivity;

public final class getWifiInfo implements View.OnClickListener {
    private final SplashActivity length;

    public getWifiInfo(SplashActivity splashActivity) {
        this.length = splashActivity;
    }

    public final void onClick(View view) {
        SplashActivity.toIntRange(this.length);
    }
}
