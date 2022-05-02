package id.dana.base;

import butterknife.BindView;
import id.dana.R;
import id.dana.richview.WebProgressView;

public abstract class BaseWebViewActivity extends BaseActivity {
    @BindView(2131365990)
    WebProgressView webProgressView;

    public int getLayout() {
        return R.layout.activity_webview;
    }

    /* access modifiers changed from: protected */
    public void load(String str) {
        this.webProgressView.loadUrl(str);
    }

    /* access modifiers changed from: protected */
    public void reload() {
        this.webProgressView.reload();
    }

    /* access modifiers changed from: protected */
    public WebProgressView getWebView() {
        return this.webProgressView;
    }
}
