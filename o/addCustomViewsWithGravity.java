package o;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.bca.xco.widget.BCAXCOModule;
import com.bca.xco.widget.comp.XTextView;
import java.util.List;
import o.getChildVerticalGravity;

public final class addCustomViewsWithGravity extends Fragment {
    public boolean IsOverlapping;
    private WebView equals;
    public getWrapper getMax;
    public BCAXCOModule getMin;
    public boolean isInside;
    Context length;
    public List<getWrapper> setMax;
    public int setMin = 0;
    ProgressDialog toFloatRange;
    public String toIntRange;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        getActivity().getWindow().setSoftInputMode(48);
        View inflate = layoutInflater.inflate(getChildVerticalGravity.setMin.xco_fragment_screen_term_condition, viewGroup, false);
        this.length = inflate.getContext();
        ((XTextView) inflate.findViewById(getChildVerticalGravity.setMax.getCause)).a(this.length, 1);
        ((ImageView) inflate.findViewById(getChildVerticalGravity.setMax.toFloatRange)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                try {
                    addCustomViewsWithGravity.this.getMin.b(3);
                    new setMax(addCustomViewsWithGravity.this, (byte) 0).execute(new Void[0]);
                } catch (Exception unused) {
                    addCustomViewsWithGravity.this.getMin.a(addCustomViewsWithGravity.this.length.getString(getChildVerticalGravity.IsOverlapping.xco_error_unknown));
                }
            }
        });
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        inflate.setOnKeyListener(new View.OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 4) {
                    try {
                        addCustomViewsWithGravity.this.getMin.b(3);
                        new setMax(addCustomViewsWithGravity.this, (byte) 0).execute(new Void[0]);
                    } catch (Exception unused) {
                        addCustomViewsWithGravity.this.getMin.a(addCustomViewsWithGravity.this.length.getString(getChildVerticalGravity.IsOverlapping.xco_error_unknown));
                    }
                }
                return false;
            }
        });
        WebView webView = (WebView) inflate.findViewById(getChildVerticalGravity.setMax.ICustomTabsCallback);
        this.equals = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.equals.setScrollBarStyle(33554432);
        this.toFloatRange = ProgressDialog.show(this.length, "BCA", "Loading...");
        this.equals.setWebViewClient(new WebViewClient() {
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }

            public final void onPageFinished(WebView webView, String str) {
                if (addCustomViewsWithGravity.this.toFloatRange.isShowing()) {
                    addCustomViewsWithGravity.this.toFloatRange.dismiss();
                }
            }

            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                addCustomViewsWithGravity.this.getMin.c("Error loading page");
            }
        });
        this.equals.loadUrl("https://www.bca.co.id/oneklik/tc?type=mobile_apps");
        return inflate;
    }

    class setMax extends AsyncTask<Void, Void, Boolean> {
        private ProgressDialog getMin;

        private setMax() {
        }

        /* synthetic */ setMax(addCustomViewsWithGravity addcustomviewswithgravity, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return getMin();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            super.onPostExecute((Boolean) obj);
            addCustomViewsWithGravity.this.getMin.b(addCustomViewsWithGravity.this.setMax, addCustomViewsWithGravity.this.getMax, addCustomViewsWithGravity.this.setMin, addCustomViewsWithGravity.this.toIntRange, addCustomViewsWithGravity.this.isInside, addCustomViewsWithGravity.this.IsOverlapping);
            if (this.getMin.isShowing()) {
                this.getMin.dismiss();
            }
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(addCustomViewsWithGravity.this.length);
            this.getMin = progressDialog;
            progressDialog.setMessage(addCustomViewsWithGravity.this.length.getString(getChildVerticalGravity.IsOverlapping.xco_please_wait));
            this.getMin.setCancelable(false);
            this.getMin.show();
        }

        private static Boolean getMin() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            return Boolean.TRUE;
        }
    }
}
