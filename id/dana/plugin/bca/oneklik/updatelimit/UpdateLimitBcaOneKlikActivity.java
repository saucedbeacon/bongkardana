package id.dana.plugin.bca.oneklik.updatelimit;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.ViewCompat;
import com.bca.xco.widget.BCAEditXCOWidget;
import com.google.common.base.Ascii;
import id.dana.plugin.bca.base.BCAOneKlikBaseActivity;
import id.dana.plugin.bca.oneklik.updatelimit.model.UpdateLimitBcaXCOModel;
import java.util.Random;
import o.FontRes;
import o.IntRange;
import o.LocationBridgeExtension;
import o.PdfViewerActivity;
import o.dispatchOnCancelled;
import o.getChildTop;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.setWrapMode;

public class UpdateLimitBcaOneKlikActivity extends BCAOneKlikBaseActivity {
    public static final String NO_DATA = "001";
    public static final String ON_BACKPRESSED = "003";
    public static final String ON_PERMISSION_DENIED = "004";
    public static final int REQUEST_READ_PHONE_STATE = 602;
    public static final String TOKEN_EXPIRED = "002";
    public static final int getMax = 74;
    /* access modifiers changed from: private */
    public static final String getMin = UpdateLimitBcaOneKlikActivity.class.getSimpleName();
    public static final byte[] length = {62, 4, -94, -28, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    private BCAEditXCOWidget FastBitmap$CoordinateSystem;
    private TextView IsOverlapping;
    private TextView equals;
    private UpdateLimitBcaXCOModel hashCode;
    /* access modifiers changed from: private */
    public boolean isInside = false;
    private RelativeLayout toFloatRange;
    private RelativeLayout toIntRange;

    static {
        AppCompatDelegate.getMin(true);
    }

    public static Intent generateIntent(Context context, UpdateLimitBcaXCOModel updateLimitBcaXCOModel) {
        LocationBridgeExtension.setMin(getMin, "generating intent");
        Intent intent = new Intent(context, UpdateLimitBcaOneKlikActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("UpdateLimitBcaXCOModel", updateLimitBcaXCOModel);
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(int r6, byte r7, short r8) {
        /*
            int r6 = r6 * 165
            int r6 = 176 - r6
            int r8 = r8 * 45
            int r8 = r8 + 56
            byte[] r0 = length
            int r7 = r7 * 175
            int r7 = 179 - r7
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r4 = r8
            r3 = 0
            r8 = r7
            r7 = r6
            goto L_0x002e
        L_0x001a:
            r3 = 0
        L_0x001b:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0026:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x002e:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + -2
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.plugin.bca.oneklik.updatelimit.UpdateLimitBcaOneKlikActivity.getMax(int, byte, short):java.lang.String");
    }

    private void getMax() {
        int length2;
        int min;
        LocationBridgeExtension.setMin(getMin, "initViews");
        this.toIntRange = (RelativeLayout) findViewById(PdfViewerActivity.AnonymousClass1.getMax.length);
        this.equals = (TextView) findViewById(PdfViewerActivity.AnonymousClass1.getMax.getMax);
        this.IsOverlapping = (TextView) findViewById(PdfViewerActivity.AnonymousClass1.getMax.setMax);
        this.toFloatRange = (RelativeLayout) findViewById(PdfViewerActivity.AnonymousClass1.getMax.getMin);
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-658066568, oncanceled);
            onCancelLoad.getMin(-658066568, oncanceled);
        }
        LocationBridgeExtension.setMin(getMin, "initToolbar");
        this.toIntRange.setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 10.0f), 0, 0, 0);
        ViewCompat.getMax((View) this.toIntRange, (float) getResources().getDimensionPixelSize(PdfViewerActivity.AnonymousClass1.length.getMin));
        this.equals.setBackground(IntRange.length((Context) this, PdfViewerActivity.AnonymousClass1.setMax.bca_oneklik_arrow_left));
        this.equals.setVisibility(0);
        this.equals.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                UpdateLimitBcaOneKlikActivity.this.onBackPressed();
            }
        });
        this.IsOverlapping.setText(PdfViewerActivity.AnonymousClass1.getMin.bca_oneklik_change_limit);
    }

    private void setMax() {
        LocationBridgeExtension.setMin(getMin, "initBCA");
        if ("PROD".equals(this.hashCode.equals)) {
            this.FastBitmap$CoordinateSystem = new BCAEditXCOWidget((Context) this, "PRODUCTION");
        } else {
            this.FastBitmap$CoordinateSystem = new BCAEditXCOWidget((Context) this, "DEV");
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1238490570, oncanceled);
            onCancelLoad.getMin(-1238490570, oncanceled);
        }
        LocationBridgeExtension.setMin(getMin, "setListenerBca");
        this.FastBitmap$CoordinateSystem.setListener(new getChildTop() {
            public final void getMax(String str) {
                LocationBridgeExtension.setMin(UpdateLimitBcaOneKlikActivity.getMin, "onBCATokenExpired");
                if (!UpdateLimitBcaOneKlikActivity.this.isFinishing()) {
                    Intent intent = new Intent();
                    intent.putExtra("tokenStatus", str);
                    intent.putExtra("error", "002");
                    intent.putExtra("deviceId", setWrapMode.getMax(UpdateLimitBcaOneKlikActivity.this));
                    intent.putExtra("userAgent", setWrapMode.setMin(UpdateLimitBcaOneKlikActivity.this));
                    UpdateLimitBcaOneKlikActivity.this.setResult(0, intent);
                    UpdateLimitBcaOneKlikActivity.this.finish();
                }
            }

            public final void getMin() {
                LocationBridgeExtension.setMin(UpdateLimitBcaOneKlikActivity.getMin, "onBCACloseWidget");
                UpdateLimitBcaOneKlikActivity.this.finish();
            }

            public final void getMin(String str) {
                LocationBridgeExtension.setMin(UpdateLimitBcaOneKlikActivity.getMin, "onBCARegistered");
            }

            public final void length(String str, String str2, String str3, String str4) {
                LocationBridgeExtension.setMin(UpdateLimitBcaOneKlikActivity.getMin, "onBCASuccess");
                Intent intent = new Intent();
                intent.putExtra("xcoId", str);
                intent.putExtra("credentialType", str2);
                intent.putExtra("credentialNo", str3);
                intent.putExtra("maxLimit", str4);
                intent.putExtra("deviceId", setWrapMode.getMax(UpdateLimitBcaOneKlikActivity.this));
                intent.putExtra("userAgent", setWrapMode.setMin(UpdateLimitBcaOneKlikActivity.this));
                UpdateLimitBcaOneKlikActivity.this.setResult(-1, intent);
                boolean unused = UpdateLimitBcaOneKlikActivity.this.isInside = true;
            }
        });
        this.toFloatRange.addView(this.FastBitmap$CoordinateSystem);
    }

    public void onBackPressed() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1679190341, oncanceled);
            onCancelLoad.getMin(-1679190341, oncanceled);
        }
        if (!this.isInside) {
            Intent intent = new Intent();
            intent.putExtra("error", "003");
            setResult(0, intent);
        }
        finish();
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int length3;
        byte[] bArr = length;
        byte b = (byte) bArr[96];
        String max = getMax((byte) bArr[8], b, (byte) b);
        byte[] bArr2 = length;
        byte b2 = (byte) bArr2[8];
        String max2 = getMax((byte) bArr2[96], b2, (byte) b2);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length4 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length4) {
            onCanceled oncanceled = new onCanceled(nextInt, length4, 1);
            onCancelLoad.setMax(-2037866914, oncanceled);
            onCancelLoad.getMin(-2037866914, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-2037866914, oncanceled2);
            onCancelLoad.getMin(-2037866914, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-2037866914, oncanceled3);
            onCancelLoad.getMin(-2037866914, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(PdfViewerActivity.AnonymousClass1.setMin.activity_bca_xco);
        getMax();
        if (getIntent().hasExtra("UpdateLimitBcaXCOModel")) {
            this.hashCode = (UpdateLimitBcaXCOModel) getIntent().getParcelableExtra("UpdateLimitBcaXCOModel");
            setMax();
            if (FontRes.length((Context) this, "android.permission.READ_PHONE_STATE") != 0) {
                FontRes.getMin(this, new String[]{"android.permission.READ_PHONE_STATE"}, 602);
            }
            LocationBridgeExtension.setMin(getMin, "opening widget registration");
            this.FastBitmap$CoordinateSystem.openWidget(this.hashCode.setMin, this.hashCode.getMax, this.hashCode.getMin, this.hashCode.length, this.hashCode.setMax, this.hashCode.toFloatRange);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("error", "001");
        setResult(0, intent);
        finish();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(2123000326, oncanceled);
            onCancelLoad.getMin(2123000326, oncanceled);
        }
        if (i == 602) {
            if (iArr.length == 0 || iArr[0] == -1) {
                Intent intent = new Intent();
                intent.putExtra("error", "004");
                setResult(0, intent);
                finish();
            }
        }
    }
}
