package id.dana.plugin.bca.oneklik.registration;

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
import com.bca.xco.widget.BCARegistrasiXCOWidget;
import com.google.common.base.Ascii;
import id.dana.plugin.bca.base.BCAOneKlikBaseActivity;
import id.dana.plugin.bca.oneklik.registration.model.RegistrationBcaXCOModel;
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

public class RegistrationBcaOneKlikActivity extends BCAOneKlikBaseActivity {
    public static final String NO_DATA = "001";
    public static final String ON_BACKPRESSED = "003";
    public static final String ON_PERMISSION_DENIED = "004";
    public static final int REQUEST_READ_PHONE_STATE = 601;
    public static final String TOKEN_EXPIRED = "002";
    public static final int getMax = 209;
    /* access modifiers changed from: private */
    public static final String getMin = RegistrationBcaOneKlikActivity.class.getSimpleName();
    public static final byte[] length = {65, -27, -86, -46, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    private RegistrationBcaXCOModel FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public boolean IsOverlapping = false;
    private RelativeLayout equals;
    private BCARegistrasiXCOWidget isInside;
    private TextView toDoubleRange;
    private TextView toFloatRange;
    private RelativeLayout toIntRange;

    static {
        AppCompatDelegate.getMin(true);
    }

    public static Intent generateIntent(Context context, RegistrationBcaXCOModel registrationBcaXCOModel) {
        LocationBridgeExtension.setMin(getMin, "generating intent");
        Intent intent = new Intent(context, RegistrationBcaOneKlikActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("RegistrationBcaXCOModel", registrationBcaXCOModel);
        intent.putExtras(bundle);
        return intent;
    }

    private void getMin() {
        int length2;
        int min;
        LocationBridgeExtension.setMin(getMin, "setupBCA");
        if ("PROD".equals(this.FastBitmap$CoordinateSystem.isInside)) {
            this.isInside = new BCARegistrasiXCOWidget((Context) this, "PRODUCTION");
        } else {
            this.isInside = new BCARegistrasiXCOWidget((Context) this, "DEV");
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(379937688, oncanceled);
            onCancelLoad.getMin(379937688, oncanceled);
        }
        LocationBridgeExtension.setMin(getMin, "setListenerBca");
        this.isInside.setListener(new getChildTop() {
            public final void getMax(String str) {
                LocationBridgeExtension.setMin(RegistrationBcaOneKlikActivity.getMin, "onBCATokenExpired");
                if (!RegistrationBcaOneKlikActivity.this.isFinishing()) {
                    Intent intent = new Intent();
                    intent.putExtra("tokenStatus", str);
                    intent.putExtra("error", "002");
                    intent.putExtra("deviceId", setWrapMode.getMax(RegistrationBcaOneKlikActivity.this));
                    intent.putExtra("userAgent", setWrapMode.setMin(RegistrationBcaOneKlikActivity.this));
                    RegistrationBcaOneKlikActivity.this.setResult(0, intent);
                    RegistrationBcaOneKlikActivity.this.finish();
                }
            }

            public final void getMin() {
                LocationBridgeExtension.setMin(RegistrationBcaOneKlikActivity.getMin, "onBCACloseWidget");
                RegistrationBcaOneKlikActivity.this.finish();
            }

            public final void getMin(String str) {
                LocationBridgeExtension.setMin(RegistrationBcaOneKlikActivity.getMin, "onBCARegistered");
                Intent intent = new Intent();
                intent.putExtra("xcoId", str);
                intent.putExtra("hasBeenRegistered", true);
                intent.putExtra("deviceId", setWrapMode.getMax(RegistrationBcaOneKlikActivity.this));
                intent.putExtra("userAgent", setWrapMode.setMin(RegistrationBcaOneKlikActivity.this));
                RegistrationBcaOneKlikActivity.this.setResult(-1, intent);
                RegistrationBcaOneKlikActivity.this.finish();
            }

            public final void length(String str, String str2, String str3, String str4) {
                LocationBridgeExtension.setMin(RegistrationBcaOneKlikActivity.getMin, "onBCASuccess");
                Intent intent = new Intent();
                intent.putExtra("xcoId", str);
                intent.putExtra("credentialType", str2);
                intent.putExtra("credentialNo", str3);
                intent.putExtra("maxLimit", str4);
                intent.putExtra("deviceId", setWrapMode.getMax(RegistrationBcaOneKlikActivity.this));
                intent.putExtra("userAgent", setWrapMode.setMin(RegistrationBcaOneKlikActivity.this));
                RegistrationBcaOneKlikActivity.this.setResult(-1, intent);
                boolean unused = RegistrationBcaOneKlikActivity.this.IsOverlapping = true;
            }
        });
        this.equals.addView(this.isInside);
    }

    private void setMax() {
        LocationBridgeExtension.setMin(getMin, "initViews");
        this.toIntRange = (RelativeLayout) findViewById(PdfViewerActivity.AnonymousClass1.getMax.length);
        this.toFloatRange = (TextView) findViewById(PdfViewerActivity.AnonymousClass1.getMax.getMax);
        this.toDoubleRange = (TextView) findViewById(PdfViewerActivity.AnonymousClass1.getMax.setMax);
        this.equals = (RelativeLayout) findViewById(PdfViewerActivity.AnonymousClass1.getMax.getMin);
        LocationBridgeExtension.setMin(getMin, "setupToolbar");
        this.toIntRange.setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 10.0f), 0, 0, 0);
        ViewCompat.getMax((View) this.toIntRange, (float) getResources().getDimensionPixelSize(PdfViewerActivity.AnonymousClass1.length.getMin));
        this.toFloatRange.setBackground(IntRange.length((Context) this, PdfViewerActivity.AnonymousClass1.setMax.bca_oneklik_arrow_left));
        this.toFloatRange.setVisibility(0);
        this.toFloatRange.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                RegistrationBcaOneKlikActivity.this.onBackPressed();
            }
        });
        this.toDoubleRange.setText(PdfViewerActivity.AnonymousClass1.getMin.bca_oneklik_add_card);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(short r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 165
            int r7 = 176 - r7
            int r5 = r5 * 45
            int r5 = 101 - r5
            byte[] r0 = length
            int r6 = r6 * 175
            int r6 = 178 - r6
            byte[] r1 = new byte[r7]
            r2 = -1
            int r7 = r7 + r2
            if (r0 != 0) goto L_0x001a
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r7
            r7 = r6
            goto L_0x0033
        L_0x001a:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            int r6 = r6 + 1
            if (r2 != r7) goto L_0x002a
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x002a:
            byte r3 = r0[r6]
            r4 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r4
        L_0x0033:
            int r5 = r5 + r6
            int r5 = r5 + -2
            r6 = r7
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.plugin.bca.oneklik.registration.RegistrationBcaOneKlikActivity.setMin(short, byte, byte):java.lang.String");
    }

    public void onBackPressed() {
        if (!this.IsOverlapping) {
            Intent intent = new Intent();
            intent.putExtra("error", "003");
            setResult(0, intent);
        }
        finish();
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = length;
        String min2 = setMin((byte) bArr[8], (byte) bArr[85], (byte) bArr[8]);
        byte[] bArr2 = length;
        String min3 = setMin((byte) bArr2[85], (byte) bArr2[8], (byte) bArr2[85]);
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
            onCancelLoad.setMax(-47841858, oncanceled);
            onCancelLoad.getMin(-47841858, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -47841858 == (max = dispatchOnCancelled.getMax(applicationContext2, -47841858)))) {
            onCanceled oncanceled2 = new onCanceled(-47841858, max, 512);
            onCancelLoad.setMax(-47841858, oncanceled2);
            onCancelLoad.getMin(-47841858, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-47841858, oncanceled3);
            onCancelLoad.getMin(-47841858, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(PdfViewerActivity.AnonymousClass1.setMin.activity_bca_xco);
        setMax();
        if (getIntent().hasExtra("RegistrationBcaXCOModel")) {
            this.FastBitmap$CoordinateSystem = (RegistrationBcaXCOModel) getIntent().getParcelableExtra("RegistrationBcaXCOModel");
            getMin();
            if (FontRes.length((Context) this, "android.permission.READ_PHONE_STATE") != 0) {
                FontRes.getMin(this, new String[]{"android.permission.READ_PHONE_STATE"}, 601);
            }
            LocationBridgeExtension.setMin(getMin, "opening widget registration");
            this.isInside.openWidget(this.FastBitmap$CoordinateSystem.getMax, this.FastBitmap$CoordinateSystem.setMax, this.FastBitmap$CoordinateSystem.getMin, this.FastBitmap$CoordinateSystem.setMin, this.FastBitmap$CoordinateSystem.length);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("error", "001");
        setResult(0, intent);
        finish();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2030658842 == (max = dispatchOnCancelled.getMax(applicationContext, -2030658842)))) {
            onCanceled oncanceled = new onCanceled(-2030658842, max, 512);
            onCancelLoad.setMax(-2030658842, oncanceled);
            onCancelLoad.getMin(-2030658842, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-2030658842, oncanceled2);
            onCancelLoad.getMin(-2030658842, oncanceled2);
        }
        if (i == 601) {
            if (iArr.length == 0 || iArr[0] == -1) {
                Intent intent = new Intent();
                intent.putExtra("error", "004");
                setResult(0, intent);
                finish();
            }
        }
    }
}
