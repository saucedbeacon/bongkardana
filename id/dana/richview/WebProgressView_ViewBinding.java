package id.dana.richview;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class WebProgressView_ViewBinding implements Unbinder {
    private WebProgressView length;

    @UiThread
    public WebProgressView_ViewBinding(WebProgressView webProgressView, View view) {
        this.length = webProgressView;
        webProgressView.webView = (WebView) drawDividersHorizontal.setMin(view, R.id.f73902131366025, "field 'webView'", WebView.class);
        webProgressView.pbWebView = (ProgressBar) drawDividersHorizontal.setMin(view, R.id.f56682131364240, "field 'pbWebView'", ProgressBar.class);
    }

    @CallSuper
    public final void setMax() {
        WebProgressView webProgressView = this.length;
        if (webProgressView != null) {
            this.length = null;
            webProgressView.webView = null;
            webProgressView.pbWebView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
