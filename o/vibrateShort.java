package o;

import android.content.DialogInterface;
import id.dana.onboarding.splash.SplashActivity;

public final class vibrateShort implements DialogInterface.OnDismissListener {
    private final SplashActivity setMin;

    public vibrateShort(SplashActivity splashActivity) {
        this.setMin = splashActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.setMin.finishAffinity();
    }
}
