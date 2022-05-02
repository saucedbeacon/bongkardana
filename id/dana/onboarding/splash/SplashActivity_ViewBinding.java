package id.dana.onboarding.splash;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import com.airbnb.lottie.LottieAnimationView;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;

public class SplashActivity_ViewBinding extends BaseActivity_ViewBinding {
    private SplashActivity length;

    @UiThread
    public SplashActivity_ViewBinding(SplashActivity splashActivity, View view) {
        super(splashActivity, view);
        this.length = splashActivity;
        splashActivity.versionName = (TextView) drawDividersHorizontal.setMin(view, R.id.f71242131365757, "field 'versionName'", TextView.class);
        splashActivity.lavSplash = (LottieAnimationView) drawDividersHorizontal.setMin(view, R.id.f51672131363723, "field 'lavSplash'", LottieAnimationView.class);
        splashActivity.ivSplash = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50882131363643, "field 'ivSplash'", ImageView.class);
    }

    public final void setMax() {
        SplashActivity splashActivity = this.length;
        if (splashActivity != null) {
            this.length = null;
            splashActivity.versionName = null;
            splashActivity.lavSplash = null;
            splashActivity.ivSplash = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
