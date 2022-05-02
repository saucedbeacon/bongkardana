package id.dana.base;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.richview.WebProgressView;
import o.drawDividersHorizontal;

public class BaseWebViewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BaseWebViewActivity getMin;

    @UiThread
    public BaseWebViewActivity_ViewBinding(BaseWebViewActivity baseWebViewActivity, View view) {
        super(baseWebViewActivity, view);
        this.getMin = baseWebViewActivity;
        baseWebViewActivity.webProgressView = (WebProgressView) drawDividersHorizontal.setMin(view, R.id.f73552131365990, "field 'webProgressView'", WebProgressView.class);
    }

    public void setMax() {
        BaseWebViewActivity baseWebViewActivity = this.getMin;
        if (baseWebViewActivity != null) {
            this.getMin = null;
            baseWebViewActivity.webProgressView = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
