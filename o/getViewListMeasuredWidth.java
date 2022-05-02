package o;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.bca.xco.widget.BCAXCOModule;
import com.bca.xco.widget.comp.XTextView;
import o.getChildVerticalGravity;

public final class getViewListMeasuredWidth extends Fragment {
    public String IsOverlapping;
    public String getMax;
    Context getMin;
    ProgressDialog length;
    public BCAXCOModule setMax;
    public int setMin = 0;
    private WebView toIntRange;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreate(bundle);
        getActivity().getWindow().setSoftInputMode(48);
        View inflate = layoutInflater.inflate(getChildVerticalGravity.setMin.xco_fragment_screen_help, viewGroup, false);
        this.getMin = inflate.getContext();
        ((XTextView) inflate.findViewById(getChildVerticalGravity.setMax.getCause)).a(this.getMin, 1);
        ((ImageView) inflate.findViewById(getChildVerticalGravity.setMax.toFloatRange)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                try {
                    getViewListMeasuredWidth.this.getFragmentManager().popBackStack();
                    getViewListMeasuredWidth.this.setMax.j();
                    getViewListMeasuredWidth.this.setMax.a(true);
                    new setMax(getViewListMeasuredWidth.this, (byte) 0).execute(new Void[0]);
                } catch (Exception unused) {
                    getViewListMeasuredWidth.this.setMax.a(getViewListMeasuredWidth.this.getMin.getString(getChildVerticalGravity.IsOverlapping.xco_error_unknown));
                }
            }
        });
        WebView webView = (WebView) inflate.findViewById(getChildVerticalGravity.setMax.ICustomTabsCallback);
        this.toIntRange = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.toIntRange.setScrollBarStyle(33554432);
        this.length = ProgressDialog.show(this.getMin, "BCA", "Loading...");
        this.toIntRange.setWebViewClient(new WebViewClient() {
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }

            public final void onPageFinished(WebView webView, String str) {
                if (getViewListMeasuredWidth.this.length.isShowing()) {
                    getViewListMeasuredWidth.this.length.dismiss();
                }
            }

            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                getViewListMeasuredWidth.this.setMax.c("Error loading page");
            }
        });
        this.toIntRange.loadUrl("https://www.bca.co.id/oneklik/tc?type=mobile_apps");
        return inflate;
    }

    class setMax extends AsyncTask<Void, Void, Boolean> {
        private ProgressDialog getMax;

        private setMax() {
        }

        /* synthetic */ setMax(getViewListMeasuredWidth getviewlistmeasuredwidth, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return setMax();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            super.onPostExecute((Boolean) obj);
            if (getViewListMeasuredWidth.this.setMin == 2) {
                getViewListMeasuredWidth.this.setMax.setToScreenFragmentTextCredentialNumber(getViewListMeasuredWidth.this.getMax);
            }
            if (this.getMax.isShowing()) {
                this.getMax.dismiss();
            }
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(getViewListMeasuredWidth.this.getMin);
            this.getMax = progressDialog;
            progressDialog.setMessage(getViewListMeasuredWidth.this.getMin.getString(getChildVerticalGravity.IsOverlapping.xco_please_wait));
            this.getMax.setCancelable(false);
            this.getMax.show();
        }

        private static Boolean setMax() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
            }
            return Boolean.TRUE;
        }
    }
}
