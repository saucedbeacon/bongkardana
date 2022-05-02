package id.dana.miniprogram.tnc;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.alibaba.wireless.security.SecExceptionCode;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.base.BaseActivity;
import java.util.HashMap;
import java.util.Random;
import kotlin.Metadata;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&¨\u0006\r"}, d2 = {"Lid/dana/miniprogram/tnc/AbstractTncMiniProgramDialogActivity;", "Lid/dana/base/BaseActivity;", "()V", "getLayout", "", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupBehavior", "setupContent", "showIcon", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class AbstractTncMiniProgramDialogActivity extends BaseActivity {
    public static final byte[] getMin = {55, Byte.MAX_VALUE, 56, -94, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMax = SecExceptionCode.SEC_ERROR_STA_STORE_LOW_VERSION_DATA_FILE;
    private HashMap getMax;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(short r6, int r7, short r8) {
        /*
            int r7 = r7 * 175
            int r7 = r7 + 4
            byte[] r0 = getMin
            int r6 = r6 * 45
            int r6 = r6 + 56
            int r8 = r8 * 165
            int r8 = r8 + 11
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0030
        L_0x001a:
            r3 = 0
        L_0x001b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0026:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0030:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + -2
            int r7 = r7 + 1
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.tnc.AbstractTncMiniProgramDialogActivity.setMax(short, int, short):java.lang.String");
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(1918020403, oncanceled);
            onCancelLoad.getMin(1918020403, oncanceled);
        }
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getLayout() {
        return R.layout.dialog_terms_service_mini_program;
    }

    public abstract void setupBehavior();

    public abstract void setupContent();

    public abstract void showIcon();

    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = getMin;
        String max = setMax((byte) bArr[96], (byte) bArr[8], (byte) bArr[96]);
        byte[] bArr2 = getMin;
        String max2 = setMax((byte) bArr2[8], (byte) bArr2[96], (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        int i = 1;
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(544239357, oncanceled);
            onCancelLoad.getMin(544239357, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(544239357, oncanceled2);
            onCancelLoad.getMin(544239357, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(544239357, oncanceled3);
            onCancelLoad.getMin(544239357, oncanceled3);
        }
        overridePendingTransition(17432576, 17432577);
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        super.onCreate(bundle);
    }

    public void init() {
        setupContent();
        showIcon();
        setupBehavior();
    }
}
