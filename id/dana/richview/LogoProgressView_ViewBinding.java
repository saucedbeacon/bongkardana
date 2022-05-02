package id.dana.richview;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class LogoProgressView_ViewBinding implements Unbinder {
    private LogoProgressView getMax;

    @UiThread
    public LogoProgressView_ViewBinding(LogoProgressView logoProgressView, View view) {
        this.getMax = logoProgressView;
        logoProgressView.loadingImage = (AppCompatImageView) drawDividersHorizontal.setMin(view, R.id.f46072131363152, "field 'loadingImage'", AppCompatImageView.class);
        logoProgressView.outerLoadingImage = (AppCompatImageView) drawDividersHorizontal.setMin(view, R.id.f46062131363151, "field 'outerLoadingImage'", AppCompatImageView.class);
    }

    @CallSuper
    public final void setMax() {
        LogoProgressView logoProgressView = this.getMax;
        if (logoProgressView != null) {
            this.getMax = null;
            logoProgressView.loadingImage = null;
            logoProgressView.outerLoadingImage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
