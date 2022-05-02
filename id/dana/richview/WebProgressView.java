package id.dana.richview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import com.google.common.primitives.SignedBytes;
import id.dana.R;
import id.dana.base.BaseRichView;
import kotlin.text.Typography;

public class WebProgressView extends BaseRichView {
    private static short[] IsOverlapping = null;
    private static int equals = 83;
    private static int isInside = -712080768;
    private static int setMax = -83803012;
    private static int toDoubleRange = 1;
    private static byte[] toFloatRange = {-78, -76, 88, 77, SignedBytes.MAX_POWER_OF_TWO};
    private static int toIntRange;
    private final String getMax;
    private setMax getMin;
    private final String length;
    @BindView(2131364240)
    ProgressBar pbWebView;
    private length setMin;
    @BindView(2131366025)
    WebView webView;

    public interface setMax {
        void getMax();

        void setMin();
    }

    static /* synthetic */ setMax access$000(WebProgressView webProgressView) {
        setMax setmax;
        int i = toDoubleRange + 3;
        toIntRange = i % 128;
        if (i % 2 != 0) {
            try {
                setmax = webProgressView.getMin;
                int i2 = 86 / 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                setmax = webProgressView.getMin;
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i3 = toDoubleRange + 103;
        toIntRange = i3 % 128;
        if ((i3 % 2 != 0 ? '\\' : 29) != '\\') {
            return setmax;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return setmax;
    }

    public WebProgressView(@NonNull Context context) {
        super(context);
        this.length = "text/html";
        this.getMax = length(-84 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 66), Color.alpha(0) + 83803012, TextUtils.getOffsetAfter("", 0) + 712080853, (short) (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
    }

    public WebProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            this.length = "text/html";
            this.getMax = length(-84 - TextUtils.getCapsMode("", 0, 0), (byte) (-65 - TextUtils.getOffsetAfter("", 0)), 83803011 - ExpandableListView.getPackedPositionChild(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 712080852, (short) TextUtils.indexOf("", "")).intern();
        } catch (Exception e) {
            throw e;
        }
    }

    public WebProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.length = "text/html";
        this.getMax = length((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 84, (byte) (Color.argb(0, 0, 0, 0) - 65), (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 83803011, TextUtils.indexOf("", '0') + 712080854, (short) (AndroidCharacter.getMirror('0') - '0')).intern();
    }

    public WebProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.length = "text/html";
        this.getMax = length(-83 - (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), (byte) (-65 - TextUtils.getOffsetAfter("", 0)), 83803011 - TextUtils.indexOf("", '0', 0), TextUtils.indexOf("", "") + 712080853, (short) (-1 - TextUtils.lastIndexOf("", '0', 0))).intern();
    }

    public int getLayout() {
        int i = toDoubleRange + 97;
        toIntRange = i % 128;
        int i2 = i % 2;
        int i3 = toIntRange + 49;
        toDoubleRange = i3 % 128;
        int i4 = i3 % 2;
        return R.layout.view_web_progress;
    }

    public void setup() {
        this.webView.setWebViewClient(new WebViewClient() {
            public final void onPageFinished(WebView webView, String str) {
                if (WebProgressView.access$000(WebProgressView.this) != null) {
                    WebProgressView.access$000(WebProgressView.this).getMax();
                }
            }

            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (WebProgressView.access$000(WebProgressView.this) != null) {
                    WebProgressView.access$000(WebProgressView.this).setMin();
                }
            }
        });
        this.webView.setWebChromeClient(new WebChromeClient() {
            public final void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (WebProgressView.this.pbWebView != null) {
                    WebProgressView.this.pbWebView.setProgress(i);
                    if (i == 0) {
                        WebProgressView.this.pbWebView.setVisibility(0);
                    }
                    if (100 == i) {
                        WebProgressView.this.pbWebView.setVisibility(8);
                    }
                }
            }
        });
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        int[] iArr = {400, 72};
        if (i2 < 720) {
            iArr[0] = 200;
            iArr[1] = 36;
        } else {
            if (i2 > 720) {
                int i3 = toIntRange + 95;
                toDoubleRange = i3 % 128;
                int i4 = i3 % 2;
                if (!(i2 >= 1080)) {
                    int i5 = toDoubleRange + 63;
                    toIntRange = i5 % 128;
                    int i6 = i5 % 2;
                    iArr[0] = 300;
                    iArr[1] = 36;
                }
            }
            if (!(i2 < 1080)) {
                int i7 = toIntRange + 27;
                toDoubleRange = i7 % 128;
                int i8 = i7 % 2;
                iArr[0] = 400;
                iArr[1] = 72;
            }
        }
        this.webView.setInitialScale(iArr[0]);
        WebSettings settings = this.webView.getSettings();
        settings.setDefaultFontSize(iArr[1]);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        this.webView.setInitialScale(1);
        Integer.valueOf(settings.getDefaultFontSize());
    }

    public void setWebProgressViewListener(setMax setmax) {
        int i = toDoubleRange + 59;
        toIntRange = i % 128;
        int i2 = i % 2;
        this.getMin = setmax;
        int i3 = toIntRange + 5;
        toDoubleRange = i3 % 128;
        if ((i3 % 2 == 0 ? 'C' : 9) == 'C') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public WebView getWebView() {
        int i = toIntRange + 91;
        toDoubleRange = i % 128;
        int i2 = i % 2;
        WebView webView2 = this.webView;
        try {
            int i3 = toIntRange + 53;
            toDoubleRange = i3 % 128;
            if ((i3 % 2 == 0 ? '9' : 17) != '9') {
                return webView2;
            }
            Object obj = null;
            super.hashCode();
            return webView2;
        } catch (Exception e) {
            throw e;
        }
    }

    public void loadUrl(String str) {
        this.webView.loadUrl(str);
        this.setMin = new length(str);
        try {
            int i = toIntRange + 63;
            toDoubleRange = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public void loadDataWithBaseUrl(String str, String str2) {
        int i = toIntRange + 27;
        toDoubleRange = i % 128;
        int i2 = i % 2;
        if ((TextUtils.isEmpty(str) ? ']' : 31) != 31) {
            int i3 = toIntRange + 17;
            toDoubleRange = i3 % 128;
            if (i3 % 2 == 0) {
                String replace = str2.replace("\n", "<br>");
                Context context = getContext();
                Object[] objArr = new Object[0];
                objArr[1] = replace;
                str2 = context.getString(R.string.html_wrapper, objArr);
            } else {
                try {
                    str2 = getContext().getString(R.string.html_wrapper, new Object[]{str2.replace("\n", "<br>")});
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        this.webView.loadDataWithBaseURL(str, str2, "text/html", length(-84 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (-65 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 83803012, 712080853 - (Process.myTid() >> 22), (short) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), (String) null);
        this.setMin = new length(str, str2);
    }

    public void reload() {
        int i = toIntRange + 113;
        toDoubleRange = i % 128;
        int i2 = i % 2;
        if ((this.setMin != null ? Typography.greater : '#') == '>') {
            int i3 = toDoubleRange + 77;
            toIntRange = i3 % 128;
            int i4 = i3 % 2;
            if ((TextUtils.isEmpty(this.setMin.getMin) ? 23 : '!') != 23) {
                loadDataWithBaseUrl(this.setMin.getMax, this.setMin.getMin);
                return;
            }
            try {
                loadUrl(this.setMin.getMax);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public void setScrollbarFadingEnabled(boolean z) {
        int i = toDoubleRange + 65;
        toIntRange = i % 128;
        int i2 = i % 2;
        try {
            this.webView.setScrollbarFadingEnabled(z);
            int i3 = toDoubleRange + 115;
            toIntRange = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public void disableBuiltInZoom() {
        int i = toDoubleRange + 99;
        toIntRange = i % 128;
        int i2 = i % 2;
        try {
            this.webView.getSettings().setBuiltInZoomControls(true);
            this.webView.getSettings().setDisplayZoomControls(false);
            int i3 = toDoubleRange + 7;
            toIntRange = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    static class length {
        String getMax;
        String getMin;

        public length(String str) {
            this.getMax = str;
        }

        public length(String str, String str2) {
            this.getMax = str;
            this.getMin = str2;
        }
    }

    private static String length(int i, byte b, int i2, int i3, short s) {
        boolean z;
        int i4;
        int i5;
        short s2;
        StringBuilder sb = new StringBuilder();
        int i6 = i + equals;
        if (i6 == -1) {
            try {
                int i7 = toDoubleRange + 11;
                toIntRange = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } catch (Exception e) {
                throw e;
            }
        } else {
            z = false;
        }
        if (z) {
            int i9 = toIntRange + 67;
            toDoubleRange = i9 % 128;
            int i10 = i9 % 2;
            byte[] bArr = toFloatRange;
            if (bArr != null) {
                i6 = (byte) (bArr[setMax + i2] + equals);
            } else {
                i6 = (short) (IsOverlapping[setMax + i2] + equals);
            }
        }
        if ((i6 > 0 ? '@' : 'R') == '@') {
            try {
                int i11 = ((i2 + i6) - 2) + setMax;
                if (z) {
                    int i12 = toDoubleRange + 35;
                    toIntRange = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                int i14 = i11 + i4;
                char c = (char) (i3 + isInside);
                sb.append(c);
                for (int i15 = 1; i15 < i6; i15++) {
                    if (!(toFloatRange == null)) {
                        i5 = i14 - 1;
                        s2 = (byte) (toFloatRange[i14] + s);
                    } else {
                        i5 = i14 - 1;
                        s2 = (short) (IsOverlapping[i14] + s);
                    }
                    c = (char) (c + (s2 ^ b));
                    i14 = i5;
                    sb.append(c);
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return sb.toString();
    }
}
