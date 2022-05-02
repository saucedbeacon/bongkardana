package id.dana.tncsummary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.danah5.DanaH5;
import id.dana.richview.WebProgressView;
import java.util.Random;
import o.CornerMarkingDataProvider;
import o.PrepareException;
import o.Timer;
import o.WheelView;
import o.dispatchOnCancelled;
import o.from;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.startBeaconDiscovery;
import o.stopIgnoring;
import o.writeObject;

public class TncSummaryActivity extends BaseActivity {
    public static final int DIALOG_TNC_REQUEST_CODE = CornerMarkingDataProvider.AnonymousClass2.setMax();
    public static final int getMax = 101;
    public static final byte[] getMin = {Ascii.EM, 17, 91, -121, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    @BindView(2131362073)
    Button btnDialogTncAgree;
    @BindView(2131362225)
    CheckBox cbDialogTnc;
    @BindView(2131362522)
    ConstraintLayout clContainer;
    @BindView(2131364232)
    ProgressBar pbDialogTnc;
    private writeObject setMax;
    @BindView(2131365206)
    TextView tvDialogTncAgreement;
    @BindView(2131365207)
    TextView tvDialogTncError;
    @BindView(2131366034)
    WebProgressView wpvDialogTnc;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(int r5, short r6, int r7) {
        /*
            int r6 = r6 * 45
            int r6 = r6 + 56
            byte[] r0 = getMin
            int r5 = r5 * 165
            int r5 = 176 - r5
            int r7 = r7 * 175
            int r7 = 179 - r7
            byte[] r1 = new byte[r5]
            r2 = -1
            int r5 = r5 + r2
            if (r0 != 0) goto L_0x001a
            r6 = r5
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r7
            goto L_0x0032
        L_0x001a:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r5) goto L_0x0028
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0028:
            byte r3 = r0[r7]
            r4 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r7
            r7 = r4
        L_0x0032:
            int r7 = r7 + r5
            int r5 = r0 + 1
            int r7 = r7 + -2
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.tncsummary.TncSummaryActivity.setMin(int, short, int):java.lang.String");
    }

    public void configToolbar() {
    }

    public int getLayout() {
        return R.layout.activity_dialog_tnc;
    }

    public void onBackPressed() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && -1459123849 != (max = dispatchOnCancelled.getMax(applicationContext, -1459123849))) {
            onCanceled oncanceled = new onCanceled(-1459123849, max, 512);
            onCancelLoad.setMax(-1459123849, oncanceled);
            onCancelLoad.getMin(-1459123849, oncanceled);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = getMin;
        byte b = (byte) bArr[85];
        String min2 = setMin((byte) bArr[8], b, (byte) b);
        byte[] bArr2 = getMin;
        byte b2 = (byte) bArr2[8];
        String min3 = setMin((byte) bArr2[85], b2, (byte) b2);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(1383558274, oncanceled);
            onCancelLoad.getMin(1383558274, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1383558274, oncanceled2);
            onCancelLoad.getMin(1383558274, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1383558274, oncanceled3);
            onCancelLoad.getMin(1383558274, oncanceled3);
        }
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        startBeaconDiscovery.length(this);
    }

    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @OnClick({2131362073})
    public void onDialogTncAgree() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1348288693, oncanceled);
            onCancelLoad.getMin(-1348288693, oncanceled);
        }
        setResult(-1, new Intent());
        finish();
    }

    @OnCheckedChanged({2131362225})
    public void onCheckboxChanged(boolean z) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1259248577, oncanceled);
            onCancelLoad.getMin(1259248577, oncanceled);
        }
        this.btnDialogTncAgree.setEnabled(z);
    }

    public void init() {
        if (this.setMax == null) {
            Timer.TimeoutListener.getMin getmin = new Timer.TimeoutListener.getMin((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                getmin.getMax = applicationComponent;
                stopIgnoring.setMin(getmin.getMax, PrepareException.AnonymousClass1.class);
                this.setMax = new Timer.TimeoutListener(getmin.getMax, (byte) 0);
            } else {
                throw null;
            }
        }
        this.setMax.setMax(this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = (float) displayMetrics.heightPixels;
        float f2 = (float) displayMetrics.widthPixels;
        if (this.clContainer != null) {
            from from = new from();
            from.setMax(this.clContainer);
            int id2 = this.clContainer.getId();
            StringBuilder sb = new StringBuilder("H,");
            sb.append(f2);
            sb.append(":");
            sb.append(f);
            from.length(id2).setMin.onNavigationEvent = sb.toString();
            from.setMin(this.clContainer);
        }
        if (WheelView.OnWheelViewListener.getMin()) {
            this.wpvDialogTnc.loadUrl(isShowMenu.setMin("https://a.m.dana.id/resource/htmls/tnc/skywalker_id_ID.html"));
        } else {
            this.wpvDialogTnc.loadUrl(isShowMenu.setMin("https://a.m.dana.id/resource/htmls/tnc/skywalker_en_US.html"));
        }
        this.wpvDialogTnc.setScrollbarFadingEnabled(false);
        this.wpvDialogTnc.setWebProgressViewListener(new WebProgressView.setMax() {
            public final void getMax() {
                TncSummaryActivity.access$000(TncSummaryActivity.this);
            }

            public final void setMin() {
                TncSummaryActivity.access$100(TncSummaryActivity.this);
            }
        });
    }

    static /* synthetic */ void access$000(TncSummaryActivity tncSummaryActivity) {
        ProgressBar progressBar = tncSummaryActivity.pbDialogTnc;
        if (progressBar != null && tncSummaryActivity.cbDialogTnc != null && tncSummaryActivity.tvDialogTncAgreement != null) {
            progressBar.setVisibility(8);
            tncSummaryActivity.cbDialogTnc.setVisibility(0);
            tncSummaryActivity.cbDialogTnc.setEnabled(true);
            tncSummaryActivity.tvDialogTncAgreement.setTextColor(-16777216);
            TextView textView = tncSummaryActivity.tvDialogTncAgreement;
            AnonymousClass4 r1 = new ClickableSpan() {
                public final void onClick(@NonNull View view) {
                    DanaH5.startContainerFullUrl(isShowMenu.setMin("/m/standalone/tnc"));
                }
            };
            String string = tncSummaryActivity.getString(R.string.tnc_checkbox_description);
            String string2 = tncSummaryActivity.getString(R.string.i_agree_check_box_clickable);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && string.toLowerCase().contains(string2.toLowerCase())) {
                SpannableString spannableString = new SpannableString(string);
                int indexOf = string.toLowerCase().indexOf(string2.toLowerCase());
                spannableString.setSpan(r1, indexOf, string2.length() + indexOf, 33);
                spannableString.setSpan(new ForegroundColorSpan(-15692055), indexOf, string2.length() + indexOf, 33);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(spannableString);
            }
        }
    }

    static /* synthetic */ void access$100(TncSummaryActivity tncSummaryActivity) {
        WebProgressView webProgressView = tncSummaryActivity.wpvDialogTnc;
        if (webProgressView != null && tncSummaryActivity.tvDialogTncError != null) {
            webProgressView.setVisibility(8);
            tncSummaryActivity.tvDialogTncError.setVisibility(0);
        }
    }
}
