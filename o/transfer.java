package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import java.net.URI;
import java.net.URISyntaxException;
import org.json.JSONObject;

public final class transfer {
    public static transfer setMax;
    /* access modifiers changed from: private */
    public boolean IsOverlapping;
    private getMax equals = null;
    public String getMax;
    public boolean getMin;
    /* access modifiers changed from: private */
    public boolean isInside = false;
    /* access modifiers changed from: package-private */
    public boolean length;
    Dialog setMin;

    public interface setMax {
        void getMax(String str);

        void length(String str);

        void setMin(String str);
    }

    public final boolean getMin(Context context) {
        boolean max = setMax(this.equals, context, (setMax) null);
        if (max) {
            this.equals = null;
        }
        return max;
    }

    public final boolean getMax(JSONObject jSONObject, String str, Context context, setMax setmax) {
        return setMax(new getMax(this, jSONObject, str, (byte) 0), context, setmax);
    }

    private boolean setMax(getMax getmax, Context context, setMax setmax) {
        if (this.getMin || this.isInside) {
            if (setmax != null) {
                setmax.getMax(getmax.setMin);
            }
            return false;
        }
        this.getMin = false;
        this.IsOverlapping = false;
        if (!(context == null || getmax == null)) {
            if (getmax.length(context)) {
                if (!TextUtils.isEmpty(getmax.getMax)) {
                    setMin(getmax, context, setmax);
                } else {
                    this.isInside = true;
                    new getMin(getmax, context, setmax).execute(new Void[0]);
                }
                return true;
            } else if (setmax != null) {
                setmax.getMax(getmax.setMin);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void setMin(final getMax getmax, Context context, final setMax setmax) {
        if (context != null && getmax != null) {
            final WebView webView = new WebView(context);
            webView.getSettings().setJavaScriptEnabled(true);
            if (Build.VERSION.SDK_INT >= 19) {
                webView.setLayerType(2, (Paint) null);
            }
            this.length = false;
            if (!TextUtils.isEmpty(getmax.getMax)) {
                webView.loadDataWithBaseURL((String) null, getmax.getMax, "text/html", getTabbarModel.ENC, (String) null);
                webView.setWebViewClient(new WebViewClient() {
                    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        boolean max = transfer.this.setMax(str);
                        if (!max) {
                            webView.loadUrl(str);
                        } else if (transfer.this.setMin != null) {
                            transfer.this.setMin.dismiss();
                        }
                        return max;
                    }

                    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        super.onPageStarted(webView, str, bitmap);
                    }

                    public final void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        boolean unused = transfer.this.length = true;
                    }

                    public final void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        transfer transfer = transfer.this;
                        getMax getmax = getmax;
                        setMax setmax = setmax;
                        WebView webView2 = webView;
                        if (transfer.length || Branch.setMin() == null || Branch.setMin().IsOverlapping == null) {
                            transfer.getMin = false;
                            if (setmax != null) {
                                setmax.getMax(getmax.setMin);
                                return;
                            }
                            return;
                        }
                        Activity activity = Branch.setMin().IsOverlapping.get();
                        if (activity != null) {
                            Context applicationContext = activity.getApplicationContext();
                            String str2 = getmax.getMin;
                            startTinyAppAndCloseCurrent.length(applicationContext);
                            startTinyAppAndCloseCurrent.getMin("bnc_branch_view_use_".concat(String.valueOf(str2)), startTinyAppAndCloseCurrent.length("bnc_branch_view_use_".concat(String.valueOf(str2)), 0) + 1);
                            transfer.getMax = activity.getClass().getName();
                            RelativeLayout relativeLayout = new RelativeLayout(activity);
                            relativeLayout.setVisibility(8);
                            relativeLayout.addView(webView2, new RelativeLayout.LayoutParams(-1, -1));
                            relativeLayout.setBackgroundColor(0);
                            if (transfer.setMin == null || !transfer.setMin.isShowing()) {
                                transfer.setMin = new Dialog(activity, 16973834);
                                transfer.setMin.setContentView(relativeLayout);
                                relativeLayout.setVisibility(0);
                                webView2.setVisibility(0);
                                transfer.setMin.show();
                                transfer.getMax((View) relativeLayout);
                                transfer.getMax((View) webView2);
                                transfer.getMin = true;
                                transfer.setMin.setOnDismissListener(new DialogInterface.OnDismissListener(setmax, getmax) {
                                    final /* synthetic */ setMax getMin;
                                    final /* synthetic */ getMax length;

                                    {
                                        this.getMin = r2;
                                        this.length = r3;
                                    }

                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        boolean unused = transfer.this.getMin = false;
                                        transfer.this.setMin = null;
                                        if (this.getMin == null) {
                                            return;
                                        }
                                        if (transfer.this.IsOverlapping) {
                                            this.getMin.setMin(this.length.setMin);
                                        } else {
                                            this.getMin.length(this.length.setMin);
                                        }
                                    }
                                });
                            } else if (setmax != null) {
                                setmax.getMax(getmax.setMin);
                            }
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean setMax(String str) {
        try {
            URI uri = new URI(str);
            if (!uri.getScheme().equalsIgnoreCase("branch-cta")) {
                return false;
            }
            if (uri.getHost().equalsIgnoreCase("accept")) {
                this.IsOverlapping = true;
            } else if (!uri.getHost().equalsIgnoreCase("cancel")) {
                return false;
            } else {
                this.IsOverlapping = false;
            }
            return true;
        } catch (URISyntaxException unused) {
            return false;
        }
    }

    static void getMax(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setStartOffset(10);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }

    public final boolean setMin(JSONObject jSONObject, String str) {
        Activity activity;
        getMax getmax = new getMax(this, jSONObject, str, (byte) 0);
        if (Branch.setMin().IsOverlapping == null || (activity = Branch.setMin().IsOverlapping.get()) == null || !getmax.length(activity)) {
            return false;
        }
        this.equals = new getMax(this, jSONObject, str, (byte) 0);
        return true;
    }

    public final boolean setMax(Context context) {
        getMax getmax = this.equals;
        return getmax != null && getmax.length(context);
    }

    class getMin extends AsyncTask<Void, Void, Boolean> {
        private static int[] getMin = {159680803, 1368262398, -425980382, 630914032, 157006706, -503887105, -1106989362, 1881466680, -738458022, -1673303037, 1505237528, 1212577960, 1398141254, 57442042, 49918857, -603447745, -2089481332, -271915180};
        private static int isInside = 1;
        private static int toIntRange;
        private final Context length;
        private final getMax setMax;
        private final setMax setMin;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            int i = isInside + 17;
            toIntRange = i % 128;
            int i2 = i % 2;
            Boolean min = setMin();
            int i3 = isInside + 103;
            toIntRange = i3 % 128;
            int i4 = i3 % 2;
            return min;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
            super.onPostExecute(bool);
            if ((bool.booleanValue() ? '(' : 'c') != 'c') {
                try {
                    int i = isInside + 5;
                    toIntRange = i % 128;
                    if (!(i % 2 == 0)) {
                        transfer.this.setMin(this.setMax, this.length, this.setMin);
                        Object obj2 = null;
                        super.hashCode();
                    } else {
                        transfer.this.setMin(this.setMax, this.length, this.setMin);
                    }
                    int i2 = toIntRange + 75;
                    isInside = i2 % 128;
                    int i3 = i2 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } else if (this.setMin != null) {
                int i4 = isInside + 23;
                toIntRange = i4 % 128;
                int i5 = i4 % 2;
                try {
                    this.setMin.getMax(this.setMax.setMin);
                } catch (Exception e2) {
                    throw e2;
                }
            }
            boolean unused = transfer.this.isInside = false;
        }

        public getMin(getMax getmax, Context context, setMax setmax) {
            this.setMax = getmax;
            this.length = context;
            this.setMin = setmax;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Boolean setMin() {
            /*
                r13 = this;
                r0 = 1
                r1 = 200(0xc8, float:2.8E-43)
                r2 = -1
                r3 = 0
                java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x0095 }
                o.transfer$getMax r5 = r13.setMax     // Catch:{ Exception -> 0x0095 }
                java.lang.String r5 = r5.setMax     // Catch:{ Exception -> 0x0095 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0095 }
                java.net.URLConnection r4 = r4.openConnection()     // Catch:{ Exception -> 0x0095 }
                java.lang.Object r4 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r4)     // Catch:{ Exception -> 0x0095 }
                java.net.URLConnection r4 = (java.net.URLConnection) r4     // Catch:{ Exception -> 0x0095 }
                java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x0095 }
                java.lang.String r5 = "GET"
                r4.setRequestMethod(r5)     // Catch:{ Exception -> 0x0095 }
                r4.connect()     // Catch:{ Exception -> 0x0095 }
                int r5 = r4.getResponseCode()     // Catch:{ Exception -> 0x0095 }
                if (r5 != r1) goto L_0x0096
                java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0094 }
                r6.<init>()     // Catch:{ Exception -> 0x0094 }
                java.io.InputStream r4 = r4.getInputStream()     // Catch:{ Exception -> 0x0094 }
                r7 = 1024(0x400, float:1.435E-42)
                byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0094 }
            L_0x0035:
                int r8 = r4.read(r7)     // Catch:{ Exception -> 0x0094 }
                r9 = 50
                if (r8 == r2) goto L_0x0040
                r10 = 50
                goto L_0x0042
            L_0x0040:
                r10 = 69
            L_0x0042:
                r11 = 2
                if (r10 == r9) goto L_0x0087
                o.transfer$getMax r2 = r13.setMax     // Catch:{ Exception -> 0x0094 }
                long r7 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ Exception -> 0x0094 }
                r9 = 0
                int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                int r7 = 6 - r12
                r8 = 4
                int[] r8 = new int[r8]     // Catch:{ Exception -> 0x0094 }
                r9 = -745622900(0xffffffffd38eb28c, float:-1.22576175E12)
                r8[r3] = r9     // Catch:{ Exception -> 0x0094 }
                r9 = 1231341422(0x4964c76e, float:937078.9)
                r8[r0] = r9     // Catch:{ Exception -> 0x0094 }
                r9 = -406330047(0xffffffffe7c7e541, float:-1.8879598E24)
                r8[r11] = r9     // Catch:{ Exception -> 0x0094 }
                r9 = 3
                r10 = 14771777(0xe16641, float:2.0699668E-38)
                r8[r9] = r10     // Catch:{ Exception -> 0x0094 }
                java.lang.String r7 = getMax(r7, r8)     // Catch:{ Exception -> 0x0094 }
                java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x0094 }
                java.lang.String r7 = r6.toString(r7)     // Catch:{ Exception -> 0x0094 }
                r2.getMax = r7     // Catch:{ Exception -> 0x0094 }
                r6.close()     // Catch:{ Exception -> 0x0094 }
                r4.close()     // Catch:{ Exception -> 0x0094 }
                int r2 = isInside
                int r2 = r2 + 55
                int r4 = r2 % 128
                toIntRange = r4
                int r2 = r2 % r11
                goto L_0x0096
            L_0x0087:
                int r9 = isInside
                int r9 = r9 + 97
                int r10 = r9 % 128
                toIntRange = r10
                int r9 = r9 % r11
                r6.write(r7, r3, r8)     // Catch:{ Exception -> 0x0094 }
                goto L_0x0035
            L_0x0094:
                r2 = r5
            L_0x0095:
                r5 = r2
            L_0x0096:
                r2 = 30
                if (r5 != r1) goto L_0x009d
                r1 = 30
                goto L_0x009f
            L_0x009d:
                r1 = 80
            L_0x009f:
                if (r1 == r2) goto L_0x00a2
                r0 = 0
            L_0x00a2:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.transfer.getMin.setMin():java.lang.Boolean");
        }

        private static String getMax(int i, int[] iArr) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[(iArr.length << 1)];
            try {
                int[] iArr2 = (int[]) getMin.clone();
                int i2 = 0;
                while (true) {
                    if ((i2 < iArr.length ? 'H' : '(') != 'H') {
                        String str = new String(cArr2, 0, i);
                        try {
                            int i3 = toIntRange + 63;
                            isInside = i3 % 128;
                            int i4 = i3 % 2;
                            return str;
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        int i5 = isInside + 65;
                        toIntRange = i5 % 128;
                        int i6 = i5 % 2;
                        cArr[0] = (char) (iArr[i2] >> 16);
                        cArr[1] = (char) iArr[i2];
                        int i7 = i2 + 1;
                        cArr[2] = (char) (iArr[i7] >> 16);
                        cArr[3] = (char) iArr[i7];
                        onActivityPostResumed.getMin(cArr, iArr2, false);
                        int i8 = i2 << 1;
                        cArr2[i8] = cArr[0];
                        cArr2[i8 + 1] = cArr[1];
                        cArr2[i8 + 2] = cArr[2];
                        cArr2[i8 + 3] = cArr[3];
                        i2 += 2;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    class getMax {
        String getMax;
        String getMin;
        String setMax;
        String setMin;
        private int toIntRange;

        /* synthetic */ getMax(transfer transfer, JSONObject jSONObject, String str, byte b) {
            this(jSONObject, str);
        }

        private getMax(JSONObject jSONObject, String str) {
            this.getMin = "";
            this.setMin = "";
            this.toIntRange = 1;
            this.setMax = "";
            this.getMax = "";
            try {
                this.setMin = str;
                if (jSONObject.has(Defines.Jsonkey.BranchViewID.getKey())) {
                    this.getMin = jSONObject.getString(Defines.Jsonkey.BranchViewID.getKey());
                }
                if (jSONObject.has(Defines.Jsonkey.BranchViewNumOfUse.getKey())) {
                    this.toIntRange = jSONObject.getInt(Defines.Jsonkey.BranchViewNumOfUse.getKey());
                }
                if (jSONObject.has(Defines.Jsonkey.BranchViewUrl.getKey())) {
                    this.setMax = jSONObject.getString(Defines.Jsonkey.BranchViewUrl.getKey());
                }
                if (jSONObject.has(Defines.Jsonkey.BranchViewHtml.getKey())) {
                    this.getMax = jSONObject.getString(Defines.Jsonkey.BranchViewHtml.getKey());
                }
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: private */
        public boolean length(Context context) {
            startTinyAppAndCloseCurrent.length(context);
            int length2 = startTinyAppAndCloseCurrent.length("bnc_branch_view_use_".concat(String.valueOf(this.getMin)), 0);
            int i = this.toIntRange;
            if (i > length2 || i == -1) {
                return true;
            }
            return false;
        }
    }
}
