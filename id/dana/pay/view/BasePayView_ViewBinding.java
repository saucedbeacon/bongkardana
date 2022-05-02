package id.dana.pay.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class BasePayView_ViewBinding implements Unbinder {
    private BasePayView getMax;

    @UiThread
    public BasePayView_ViewBinding(BasePayView basePayView, View view) {
        this.getMax = basePayView;
        basePayView.qrView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f56552131364226, "field 'qrView'", ImageView.class);
        basePayView.refreshLabel = (TextView) drawDividersHorizontal.setMin(view, R.id.f56542131364225, "field 'refreshLabel'", TextView.class);
    }

    @CallSuper
    public void setMax() {
        BasePayView basePayView = this.getMax;
        if (basePayView != null) {
            this.getMax = null;
            basePayView.qrView = null;
            basePayView.refreshLabel = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
