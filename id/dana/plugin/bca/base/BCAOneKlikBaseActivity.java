package id.dana.plugin.bca.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.google.common.base.Ascii;
import java.util.Locale;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class BCAOneKlikBaseActivity extends AppCompatActivity {
    public static final byte[] setMax = {62, 4, -94, -28, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMin = 39;
    private Locale getMax;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(int r5, byte r6, short r7) {
        /*
            int r7 = r7 * 45
            int r7 = 101 - r7
            int r6 = r6 * 175
            int r6 = 179 - r6
            int r5 = r5 * 165
            int r5 = r5 + 11
            byte[] r0 = setMax
            byte[] r1 = new byte[r5]
            r2 = -1
            int r5 = r5 + r2
            if (r0 != 0) goto L_0x001b
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r7
            r7 = r6
            r6 = r5
            goto L_0x0033
        L_0x001b:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r5) goto L_0x0029
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0029:
            byte r3 = r0[r6]
            r4 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r7
            r7 = r4
        L_0x0033:
            int r0 = r0 + r5
            int r5 = r7 + 1
            int r7 = r0 + -2
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.plugin.bca.base.BCAOneKlikBaseActivity.getMin(int, byte, short):java.lang.String");
    }

    public void onCreate(@Nullable Bundle bundle) {
        Locale locale;
        int length;
        int min;
        int max;
        byte[] bArr = setMax;
        byte b = (byte) bArr[85];
        String min2 = getMin(b, (byte) b, (byte) bArr[8]);
        byte[] bArr2 = setMax;
        byte b2 = (byte) bArr2[8];
        String min3 = getMin(b2, (byte) b2, (byte) bArr2[85]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(130298366, oncanceled);
            onCancelLoad.getMin(130298366, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 130298366 == (max = dispatchOnCancelled.getMax(applicationContext2, 130298366)))) {
            onCanceled oncanceled2 = new onCanceled(130298366, max, 512);
            onCancelLoad.setMax(130298366, oncanceled2);
            onCancelLoad.getMin(130298366, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(130298366, oncanceled3);
            onCancelLoad.getMin(130298366, oncanceled3);
        }
        super.onCreate(bundle);
        Configuration configuration = getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locale = configuration.getLocales().get(0);
        } else {
            locale = configuration.locale;
        }
        this.getMax = locale;
    }

    public void onDestroy() {
        Locale locale = this.getMax;
        if (locale != null) {
            Resources resources = getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.locale = locale;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        super.onDestroy();
    }
}
