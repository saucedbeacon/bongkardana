package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.iap.android.aplog.util.zip.LZMA_Base;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.appsflyer.BuildConfig;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import dagger.internal.InjectedFieldSignature;
import id.dana.onboarding.verify.VerifyNumberFragment;
import id.dana.savings.activity.SavingsActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.sqlcipher.database.SQLiteDatabase;
import o.CompassSensorService;
import o.ViewPager2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GyroscopeSensorService {
    private final int[] FastBitmap$CoordinateSystem;
    private final double[] Grayscale$Algorithm;
    public double IsOverlapping;
    public Object equals;
    public long getMax;
    public long getMin;
    private int hashCode;
    private final Object[] invokeSuspend;
    public double isInside;
    public float length;
    public int setMax;
    public int setMin;
    private int toDoubleRange;
    public float toFloatRange;
    public Object toIntRange;
    private final long[] toString;
    private final float[] values;

    public GyroscopeSensorService(Object obj) {
        this.FastBitmap$CoordinateSystem = new int[16];
        this.toString = new long[16];
        this.values = new float[16];
        this.Grayscale$Algorithm = new double[16];
        Object[] objArr = new Object[16];
        this.invokeSuspend = objArr;
        objArr[10] = obj;
        this.toDoubleRange = 0;
        this.hashCode = -1;
    }

    public GyroscopeSensorService(Object obj, int i) {
        int[] iArr = new int[16];
        this.FastBitmap$CoordinateSystem = iArr;
        this.toString = new long[16];
        this.values = new float[16];
        this.Grayscale$Algorithm = new double[16];
        Object[] objArr = new Object[16];
        this.invokeSuspend = objArr;
        objArr[10] = obj;
        iArr[11] = i;
        this.toDoubleRange = 0;
        this.hashCode = -1;
    }

    public GyroscopeSensorService(Object obj, Object obj2) {
        this.FastBitmap$CoordinateSystem = new int[16];
        this.toString = new long[16];
        this.values = new float[16];
        this.Grayscale$Algorithm = new double[16];
        Object[] objArr = new Object[16];
        this.invokeSuspend = objArr;
        objArr[10] = obj;
        objArr[11] = obj2;
        this.toDoubleRange = 0;
        this.hashCode = -1;
    }

    public GyroscopeSensorService(Object obj, Object obj2, Object obj3) {
        this.FastBitmap$CoordinateSystem = new int[16];
        this.toString = new long[16];
        this.values = new float[16];
        this.Grayscale$Algorithm = new double[16];
        Object[] objArr = new Object[16];
        this.invokeSuspend = objArr;
        objArr[10] = obj;
        objArr[11] = obj2;
        objArr[12] = obj3;
        this.toDoubleRange = 0;
        this.hashCode = -1;
    }

    public GyroscopeSensorService(Object obj, Object obj2, Object obj3, Object obj4) {
        this.FastBitmap$CoordinateSystem = new int[16];
        this.toString = new long[16];
        this.values = new float[16];
        this.Grayscale$Algorithm = new double[16];
        Object[] objArr = new Object[16];
        this.invokeSuspend = objArr;
        objArr[10] = obj;
        objArr[11] = obj2;
        objArr[12] = obj3;
        objArr[13] = obj4;
        this.toDoubleRange = 0;
        this.hashCode = -1;
    }

    public GyroscopeSensorService(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.FastBitmap$CoordinateSystem = new int[16];
        this.toString = new long[16];
        this.values = new float[16];
        this.Grayscale$Algorithm = new double[16];
        Object[] objArr = new Object[16];
        this.invokeSuspend = objArr;
        objArr[10] = obj;
        objArr[11] = obj2;
        objArr[12] = obj3;
        objArr[13] = obj4;
        objArr[14] = obj5;
        this.toDoubleRange = 0;
        this.hashCode = -1;
    }

    public int length(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.FastBitmap$CoordinateSystem;
                int i2 = this.toDoubleRange - 1;
                this.toDoubleRange = i2;
                this.setMax = iArr[i2];
                return 0;
            case 2:
                Object[] objArr = this.invokeSuspend;
                int i3 = this.toDoubleRange;
                this.toDoubleRange = i3 + 1;
                objArr[i3] = objArr[10];
                return 0;
            case 3:
                int i4 = this.toDoubleRange - this.setMin;
                this.toDoubleRange = i4;
                this.hashCode = i4;
                return 0;
            case 4:
                Object[] objArr2 = this.invokeSuspend;
                int i5 = this.hashCode;
                this.hashCode = i5 + 1;
                Object obj = objArr2[i5];
                objArr2[i5] = null;
                this.equals = obj;
                return 0;
            case 5:
                Object[] objArr3 = this.invokeSuspend;
                int i6 = this.toDoubleRange;
                this.toDoubleRange = i6 + 1;
                objArr3[i6] = this.toIntRange;
                return 0;
            case 6:
                int[] iArr2 = this.FastBitmap$CoordinateSystem;
                int i7 = this.toDoubleRange;
                int i8 = i7 + 1;
                this.toDoubleRange = i8;
                iArr2[i7] = 55;
                int i9 = i8 + 1;
                this.toDoubleRange = i9;
                iArr2[i8] = 0;
                int i10 = i9 - 1;
                this.toDoubleRange = i10;
                iArr2[i10 - 1] = iArr2[i10 - 1] / iArr2[i10];
                return 0;
            case 7:
                int i11 = this.toDoubleRange - 1;
                this.toDoubleRange = i11;
                this.invokeSuspend[i11] = null;
                return 0;
            case 8:
                Object[] objArr4 = this.invokeSuspend;
                int i12 = this.toDoubleRange;
                Object obj2 = objArr4[i12 - 1];
                objArr4[i12 - 1] = null;
                this.equals = obj2;
                return 0;
            case 9:
                int[] iArr3 = this.FastBitmap$CoordinateSystem;
                int i13 = this.toDoubleRange;
                int i14 = i13 + 1;
                this.toDoubleRange = i14;
                iArr3[i13] = 2;
                this.toDoubleRange = i14 + 1;
                iArr3[i14] = 2;
                return 0;
            case 10:
                int i15 = this.toDoubleRange - 1;
                this.toDoubleRange = i15;
                int[] iArr4 = this.FastBitmap$CoordinateSystem;
                iArr4[i15 - 1] = iArr4[i15 - 1] % iArr4[i15];
                return 0;
            case 11:
                break;
            case 12:
                int[] iArr5 = this.FastBitmap$CoordinateSystem;
                int i16 = this.toDoubleRange;
                this.toDoubleRange = i16 + 1;
                iArr5[i16] = 4;
                break;
            case 13:
                int[] iArr6 = this.FastBitmap$CoordinateSystem;
                int i17 = this.toDoubleRange;
                this.toDoubleRange = i17 + 1;
                iArr6[i17] = 41;
                return 0;
            case 14:
                int[] iArr7 = this.FastBitmap$CoordinateSystem;
                int i18 = this.toDoubleRange;
                this.toDoubleRange = i18 + 1;
                iArr7[i18] = this.setMin;
                return 0;
            case 15:
                int[] iArr8 = this.FastBitmap$CoordinateSystem;
                int i19 = this.toDoubleRange;
                this.toDoubleRange = i19 + 1;
                iArr8[i19] = 77;
                return 0;
            case 16:
                int[] iArr9 = this.FastBitmap$CoordinateSystem;
                int i20 = this.toDoubleRange;
                int i21 = i20 + 2;
                this.toDoubleRange = i21;
                iArr9[i21 - 1] = iArr9[i21 - 3];
                iArr9[i20] = iArr9[i21 - 4];
                return 0;
            case 17:
                int i22 = this.toDoubleRange - 1;
                this.toDoubleRange = i22;
                int[] iArr10 = this.FastBitmap$CoordinateSystem;
                iArr10[i22 - 1] = iArr10[i22] & iArr10[i22 - 1];
                return 0;
            case 18:
                int[] iArr11 = this.FastBitmap$CoordinateSystem;
                int i23 = this.toDoubleRange;
                int i24 = i23 + 1;
                this.toDoubleRange = i24;
                int i25 = iArr11[i24 - 2];
                iArr11[i23] = i25;
                iArr11[i24 - 2] = iArr11[i24 - 3];
                iArr11[i24 - 3] = iArr11[i24 - 4];
                iArr11[i24 - 4] = i25;
                int i26 = i24 - 1;
                this.toDoubleRange = i26;
                this.invokeSuspend[i26] = null;
                return 0;
            case 19:
                int i27 = this.toDoubleRange - 1;
                this.toDoubleRange = i27;
                int[] iArr12 = this.FastBitmap$CoordinateSystem;
                iArr12[i27 - 1] = iArr12[i27 - 1] | iArr12[i27];
                int i28 = i27 - 1;
                this.toDoubleRange = i28;
                iArr12[i28 - 1] = iArr12[i28 - 1] + iArr12[i28];
                int i29 = i28 + 1;
                this.toDoubleRange = i29;
                iArr12[i28] = iArr12[i29 - 2];
                return 0;
            case 20:
                int[] iArr13 = this.FastBitmap$CoordinateSystem;
                int i30 = this.toDoubleRange;
                int i31 = i30 + 1;
                this.toDoubleRange = i31;
                iArr13[i30] = 128;
                int i32 = i31 - 1;
                this.toDoubleRange = i32;
                iArr13[i32 - 1] = iArr13[i32 - 1] % iArr13[i32];
                return 0;
            case 21:
                int[] iArr14 = this.FastBitmap$CoordinateSystem;
                int i33 = this.hashCode;
                this.hashCode = i33 + 1;
                this.setMax = iArr14[i33];
                return 0;
            case 22:
                int i34 = this.toDoubleRange - 1;
                this.toDoubleRange = i34;
                this.setMax = this.FastBitmap$CoordinateSystem[i34] == 0 ? 1 : 0;
                return 0;
            case 23:
                int[] iArr15 = this.FastBitmap$CoordinateSystem;
                int i35 = this.toDoubleRange;
                int i36 = i35 + 1;
                this.toDoubleRange = i36;
                iArr15[i35] = 2;
                int i37 = i36 - 1;
                this.toDoubleRange = i37;
                iArr15[i37 - 1] = iArr15[i37 - 1] % iArr15[i37];
                return 0;
            case 24:
                for (int i38 = this.toDoubleRange - 1; i38 >= 0; i38--) {
                    this.invokeSuspend[i38] = null;
                }
                this.toDoubleRange = 0;
                Object[] objArr5 = this.invokeSuspend;
                this.toDoubleRange = 0 + 1;
                objArr5[0] = this.toIntRange;
                return 0;
            case 25:
                int[] iArr16 = this.FastBitmap$CoordinateSystem;
                int i39 = this.toDoubleRange;
                this.toDoubleRange = i39 + 1;
                iArr16[i39] = 23;
                return 0;
            case 26:
                int[] iArr17 = this.FastBitmap$CoordinateSystem;
                int i40 = this.toDoubleRange;
                int i41 = i40 + 1;
                this.toDoubleRange = i41;
                iArr17[i40] = 0;
                int i42 = i41 - 1;
                this.toDoubleRange = i42;
                iArr17[i42 - 1] = iArr17[i42 - 1] / iArr17[i42];
                return 0;
            case 27:
                int[] iArr18 = this.FastBitmap$CoordinateSystem;
                int i43 = this.toDoubleRange;
                this.toDoubleRange = i43 + 1;
                iArr18[i43] = 6;
                return 0;
            case 28:
                int[] iArr19 = this.FastBitmap$CoordinateSystem;
                int i44 = this.toDoubleRange;
                this.toDoubleRange = i44 + 1;
                iArr19[i44] = 36;
                return 0;
            case 29:
                Object[] objArr6 = this.invokeSuspend;
                int i45 = this.toDoubleRange;
                this.toDoubleRange = i45 + 1;
                objArr6[i45] = objArr6[11];
                return 0;
            case 30:
                Object[] objArr7 = this.invokeSuspend;
                int i46 = this.toDoubleRange;
                int i47 = i46 + 1;
                this.toDoubleRange = i47;
                objArr7[i46] = objArr7[10];
                this.toDoubleRange = i47 + 1;
                objArr7[i47] = objArr7[11];
                return 0;
            case 31:
                Object[] objArr8 = this.invokeSuspend;
                int i48 = this.toDoubleRange;
                this.toDoubleRange = i48 + 1;
                objArr8[i48] = null;
                return 0;
            case 32:
                int[] iArr20 = this.FastBitmap$CoordinateSystem;
                int i49 = this.toDoubleRange;
                int i50 = i49 + 1;
                this.toDoubleRange = i50;
                iArr20[i49] = 1;
                iArr20[i50 - 1] = -iArr20[i50 - 1];
                int i51 = i50 + 2;
                this.toDoubleRange = i51;
                iArr20[i51 - 1] = iArr20[i51 - 3];
                iArr20[i50] = iArr20[i51 - 4];
                return 0;
            case 33:
                int[] iArr21 = this.FastBitmap$CoordinateSystem;
                int i52 = this.toDoubleRange;
                iArr21[i52 - 1] = -iArr21[i52 - 1];
                return 0;
            case 34:
                int[] iArr22 = this.FastBitmap$CoordinateSystem;
                int i53 = this.toDoubleRange;
                int i54 = i53 + 2;
                this.toDoubleRange = i54;
                iArr22[i54 - 1] = iArr22[i54 - 3];
                iArr22[i53] = iArr22[i54 - 4];
                int i55 = i54 - 1;
                this.toDoubleRange = i55;
                iArr22[i55 - 1] = iArr22[i55] ^ iArr22[i55 - 1];
                return 0;
            case 35:
                int[] iArr23 = this.FastBitmap$CoordinateSystem;
                int i56 = this.toDoubleRange;
                int i57 = i56 + 1;
                this.toDoubleRange = i57;
                int i58 = iArr23[i57 - 2];
                iArr23[i56] = i58;
                iArr23[i57 - 2] = iArr23[i57 - 3];
                iArr23[i57 - 3] = iArr23[i57 - 4];
                iArr23[i57 - 4] = i58;
                int i59 = i57 - 1;
                this.toDoubleRange = i59;
                this.invokeSuspend[i59] = null;
                int i60 = i59 - 1;
                this.toDoubleRange = i60;
                iArr23[i60 - 1] = iArr23[i60] & iArr23[i60 - 1];
                return 0;
            case 36:
                int i61 = this.toDoubleRange - 1;
                this.toDoubleRange = i61;
                int[] iArr24 = this.FastBitmap$CoordinateSystem;
                iArr24[i61 - 1] = iArr24[i61] | iArr24[i61 - 1];
                return 0;
            case 37:
                int[] iArr25 = this.FastBitmap$CoordinateSystem;
                int i62 = this.toDoubleRange;
                this.toDoubleRange = i62 + 1;
                iArr25[i62] = 1;
                return 0;
            case 38:
                int i63 = this.toDoubleRange - 1;
                this.toDoubleRange = i63;
                int[] iArr26 = this.FastBitmap$CoordinateSystem;
                iArr26[i63 - 1] = iArr26[i63 - 1] << iArr26[i63];
                int i64 = i63 + 1;
                this.toDoubleRange = i64;
                int i65 = iArr26[i64 - 2];
                iArr26[i63] = i65;
                iArr26[i64 - 2] = iArr26[i64 - 3];
                iArr26[i64 - 3] = iArr26[i64 - 4];
                iArr26[i64 - 4] = i65;
                return 0;
            case 39:
                int i66 = this.toDoubleRange - 1;
                this.toDoubleRange = i66;
                this.invokeSuspend[i66] = null;
                int[] iArr27 = this.FastBitmap$CoordinateSystem;
                iArr27[i66 - 1] = -iArr27[i66 - 1];
                int i67 = i66 + 2;
                this.toDoubleRange = i67;
                iArr27[i67 - 1] = iArr27[i67 - 3];
                iArr27[i66] = iArr27[i67 - 4];
                return 0;
            case 40:
                int i68 = this.toDoubleRange - 1;
                this.toDoubleRange = i68;
                int[] iArr28 = this.FastBitmap$CoordinateSystem;
                iArr28[i68 - 1] = iArr28[i68 - 1] & iArr28[i68];
                int i69 = i68 + 1;
                this.toDoubleRange = i69;
                iArr28[i68] = -1;
                int i70 = i69 - 1;
                this.toDoubleRange = i70;
                iArr28[i70 - 1] = iArr28[i70] ^ iArr28[i70 - 1];
                return 0;
            case 41:
                int[] iArr29 = this.FastBitmap$CoordinateSystem;
                int i71 = this.toDoubleRange;
                int i72 = i71 + 1;
                this.toDoubleRange = i72;
                int i73 = iArr29[i72 - 2];
                iArr29[i71] = i73;
                iArr29[i72 - 2] = iArr29[i72 - 3];
                iArr29[i72 - 3] = iArr29[i72 - 4];
                iArr29[i72 - 4] = i73;
                return 0;
            case 42:
                int i74 = this.toDoubleRange - 1;
                this.toDoubleRange = i74;
                this.invokeSuspend[i74] = null;
                int i75 = i74 - 1;
                this.toDoubleRange = i75;
                int[] iArr30 = this.FastBitmap$CoordinateSystem;
                iArr30[i75 - 1] = iArr30[i75] | iArr30[i75 - 1];
                return 0;
            case 43:
                int i76 = this.toDoubleRange - 1;
                this.toDoubleRange = i76;
                int[] iArr31 = this.FastBitmap$CoordinateSystem;
                iArr31[i76 - 1] = iArr31[i76 - 1] & iArr31[i76];
                int i77 = i76 + 2;
                this.toDoubleRange = i77;
                iArr31[i77 - 1] = iArr31[i77 - 3];
                iArr31[i76] = iArr31[i77 - 4];
                iArr31[i77 - 1] = -iArr31[i77 - 1];
                return 0;
            case 44:
                int i78 = this.toDoubleRange - 1;
                this.toDoubleRange = i78;
                int[] iArr32 = this.FastBitmap$CoordinateSystem;
                iArr32[i78 - 1] = iArr32[i78 - 1] | iArr32[i78];
                this.toDoubleRange = i78 + 1;
                iArr32[i78] = 1;
                return 0;
            case 45:
                int i79 = this.toDoubleRange - 1;
                this.toDoubleRange = i79;
                int[] iArr33 = this.FastBitmap$CoordinateSystem;
                iArr33[i79 - 1] = iArr33[i79 - 1] << iArr33[i79];
                return 0;
            case 46:
                int[] iArr34 = this.FastBitmap$CoordinateSystem;
                int i80 = this.toDoubleRange;
                iArr34[i80 - 1] = -iArr34[i80 - 1];
                int i81 = i80 - 1;
                this.toDoubleRange = i81;
                iArr34[i81 - 1] = iArr34[i81 - 1] ^ iArr34[i81];
                int i82 = i81 - 1;
                this.toDoubleRange = i82;
                iArr34[i82 - 1] = iArr34[i82 - 1] - iArr34[i82];
                return 0;
            case 47:
                int[] iArr35 = this.FastBitmap$CoordinateSystem;
                int i83 = this.toDoubleRange;
                int i84 = i83 + 1;
                this.toDoubleRange = i84;
                iArr35[i83] = iArr35[i84 - 2];
                int i85 = i84 + 1;
                this.toDoubleRange = i85;
                iArr35[i84] = 128;
                int i86 = i85 - 1;
                this.toDoubleRange = i86;
                iArr35[i86 - 1] = iArr35[i86 - 1] % iArr35[i86];
                return 0;
            case 48:
                int i87 = this.toDoubleRange - 1;
                this.toDoubleRange = i87;
                this.setMax = this.FastBitmap$CoordinateSystem[i87] != 0 ? 1 : 0;
                return 0;
            case 49:
                int[] iArr36 = this.FastBitmap$CoordinateSystem;
                int i88 = this.toDoubleRange;
                this.toDoubleRange = i88 + 1;
                iArr36[i88] = 19;
                return 0;
            case 50:
                int[] iArr37 = this.FastBitmap$CoordinateSystem;
                int i89 = this.toDoubleRange;
                this.toDoubleRange = i89 + 1;
                iArr37[i89] = 2;
                return 0;
            case 51:
                int[] iArr38 = this.FastBitmap$CoordinateSystem;
                int i90 = this.toDoubleRange;
                int i91 = i90 + 1;
                this.toDoubleRange = i91;
                iArr38[i90] = 2;
                int i92 = i91 - 1;
                this.toDoubleRange = i92;
                iArr38[i92 - 1] = iArr38[i92 - 1] % iArr38[i92];
                int i93 = i92 - 1;
                this.toDoubleRange = i93;
                this.invokeSuspend[i93] = null;
                return 0;
            case 52:
                int[] iArr39 = this.FastBitmap$CoordinateSystem;
                int i94 = this.toDoubleRange;
                this.toDoubleRange = i94 + 1;
                iArr39[i94] = 35;
                return 0;
            case 53:
                int[] iArr40 = this.FastBitmap$CoordinateSystem;
                int i95 = this.toDoubleRange;
                iArr40[i95 - 1] = -iArr40[i95 - 1];
                int i96 = i95 + 1;
                this.toDoubleRange = i96;
                iArr40[i95] = iArr40[i96 - 2];
                return 0;
            case 54:
                int[] iArr41 = this.FastBitmap$CoordinateSystem;
                int i97 = this.toDoubleRange;
                iArr41[i97 - 1] = -iArr41[i97 - 1];
                int i98 = i97 + 1;
                this.toDoubleRange = i98;
                iArr41[i97] = -1;
                int i99 = i98 + 2;
                this.toDoubleRange = i99;
                iArr41[i99 - 1] = iArr41[i99 - 3];
                iArr41[i98] = iArr41[i99 - 4];
                return 0;
            case 55:
                int[] iArr42 = this.FastBitmap$CoordinateSystem;
                int i100 = this.toDoubleRange;
                int i101 = i100 + 1;
                this.toDoubleRange = i101;
                iArr42[i100] = -1;
                int i102 = i101 - 1;
                this.toDoubleRange = i102;
                iArr42[i102 - 1] = iArr42[i102 - 1] ^ iArr42[i102];
                int i103 = i102 - 1;
                this.toDoubleRange = i103;
                iArr42[i103 - 1] = iArr42[i103] & iArr42[i103 - 1];
                return 0;
            case 56:
                int[] iArr43 = this.FastBitmap$CoordinateSystem;
                int i104 = this.toDoubleRange;
                int i105 = i104 + 1;
                this.toDoubleRange = i105;
                int i106 = iArr43[i105 - 2];
                iArr43[i104] = i106;
                iArr43[i105 - 2] = iArr43[i105 - 3];
                iArr43[i105 - 3] = iArr43[i105 - 4];
                iArr43[i105 - 4] = i106;
                int i107 = i105 - 1;
                this.toDoubleRange = i107;
                this.invokeSuspend[i107] = null;
                int i108 = iArr43[i107 - 1];
                iArr43[i107 - 1] = iArr43[i107 - 2];
                iArr43[i107 - 2] = i108;
                return 0;
            case 57:
                int[] iArr44 = this.FastBitmap$CoordinateSystem;
                int i109 = this.toDoubleRange;
                int i110 = i109 + 1;
                this.toDoubleRange = i110;
                iArr44[i109] = -1;
                int i111 = i110 - 1;
                this.toDoubleRange = i111;
                iArr44[i111 - 1] = iArr44[i111] ^ iArr44[i111 - 1];
                return 0;
            case 58:
                int i112 = this.toDoubleRange - 1;
                this.toDoubleRange = i112;
                int[] iArr45 = this.FastBitmap$CoordinateSystem;
                iArr45[i112 - 1] = iArr45[i112 - 1] | iArr45[i112];
                int i113 = iArr45[i112 - 1];
                iArr45[i112 - 1] = iArr45[i112 - 2];
                iArr45[i112 - 2] = i113;
                int i114 = i112 - 1;
                this.toDoubleRange = i114;
                this.invokeSuspend[i114] = null;
                return 0;
            case 59:
                int i115 = this.toDoubleRange - 1;
                this.toDoubleRange = i115;
                int[] iArr46 = this.FastBitmap$CoordinateSystem;
                iArr46[i115 - 1] = iArr46[i115 - 1] - iArr46[i115];
                return 0;
            case 60:
                int[] iArr47 = this.FastBitmap$CoordinateSystem;
                int i116 = this.toDoubleRange;
                int i117 = i116 + 1;
                this.toDoubleRange = i117;
                iArr47[i116] = 1;
                iArr47[i117 - 1] = -iArr47[i117 - 1];
                int i118 = i117 + 2;
                this.toDoubleRange = i118;
                iArr47[i118 - 1] = iArr47[i118 - 3];
                iArr47[i117] = iArr47[i118 - 4];
                return 0;
            case 61:
                int i119 = this.toDoubleRange - 1;
                this.toDoubleRange = i119;
                int[] iArr48 = this.FastBitmap$CoordinateSystem;
                iArr48[i119 - 1] = iArr48[i119 - 1] + iArr48[i119];
                int i120 = i119 + 1;
                this.toDoubleRange = i120;
                iArr48[i119] = iArr48[i120 - 2];
                return 0;
            case 62:
                int[] iArr49 = this.FastBitmap$CoordinateSystem;
                int i121 = this.toDoubleRange;
                this.toDoubleRange = i121 + 1;
                iArr49[i121] = 3;
                return 0;
            case 63:
                int[] iArr50 = this.FastBitmap$CoordinateSystem;
                int i122 = this.toDoubleRange;
                this.toDoubleRange = i122 + 1;
                iArr50[i122] = 31;
                return 0;
            case 64:
                int[] iArr51 = this.FastBitmap$CoordinateSystem;
                int i123 = this.toDoubleRange;
                int i124 = i123 + 1;
                this.toDoubleRange = i124;
                iArr51[i123] = 0;
                int i125 = i124 - 1;
                this.toDoubleRange = i125;
                iArr51[i125 - 1] = iArr51[i125 - 1] / iArr51[i125];
                int i126 = i125 - 1;
                this.toDoubleRange = i126;
                this.invokeSuspend[i126] = null;
                return 0;
            case 65:
                int[] iArr52 = this.FastBitmap$CoordinateSystem;
                int i127 = this.toDoubleRange;
                int i128 = i127 + 1;
                this.toDoubleRange = i128;
                iArr52[i127] = 109;
                iArr52[i128 - 1] = -iArr52[i128 - 1];
                int i129 = i128 + 2;
                this.toDoubleRange = i129;
                iArr52[i129 - 1] = iArr52[i129 - 3];
                iArr52[i128] = iArr52[i129 - 4];
                return 0;
            case 66:
                int[] iArr53 = this.FastBitmap$CoordinateSystem;
                int i130 = this.toDoubleRange;
                iArr53[i130 - 1] = -iArr53[i130 - 1];
                int i131 = i130 - 1;
                this.toDoubleRange = i131;
                iArr53[i131 - 1] = iArr53[i131] | iArr53[i131 - 1];
                return 0;
            case 67:
                int[] iArr54 = this.FastBitmap$CoordinateSystem;
                int i132 = this.toDoubleRange;
                int i133 = i132 + 1;
                this.toDoubleRange = i133;
                iArr54[i132] = 1;
                int i134 = i133 - 1;
                this.toDoubleRange = i134;
                iArr54[i134 - 1] = iArr54[i134 - 1] << iArr54[i134];
                return 0;
            case 68:
                int[] iArr55 = this.FastBitmap$CoordinateSystem;
                int i135 = this.toDoubleRange;
                int i136 = i135 + 2;
                this.toDoubleRange = i136;
                iArr55[i136 - 1] = iArr55[i136 - 3];
                iArr55[i135] = iArr55[i136 - 4];
                int i137 = i136 - 1;
                this.toDoubleRange = i137;
                iArr55[i137 - 1] = iArr55[i137 - 1] & iArr55[i137];
                int i138 = i137 + 1;
                this.toDoubleRange = i138;
                int i139 = iArr55[i138 - 2];
                iArr55[i137] = i139;
                iArr55[i138 - 2] = iArr55[i138 - 3];
                iArr55[i138 - 3] = iArr55[i138 - 4];
                iArr55[i138 - 4] = i139;
                return 0;
            case 69:
                int i140 = this.toDoubleRange - 1;
                this.toDoubleRange = i140;
                int[] iArr56 = this.FastBitmap$CoordinateSystem;
                iArr56[i140 - 1] = iArr56[i140 - 1] + iArr56[i140];
                return 0;
            case 70:
                int[] iArr57 = this.FastBitmap$CoordinateSystem;
                int i141 = this.toDoubleRange;
                int i142 = i141 + 1;
                this.toDoubleRange = i142;
                iArr57[i141] = iArr57[i142 - 2];
                this.toDoubleRange = i142 + 1;
                iArr57[i142] = 128;
                return 0;
            case 71:
                int[] iArr58 = this.FastBitmap$CoordinateSystem;
                int i143 = this.toDoubleRange;
                int i144 = i143 + 1;
                this.toDoubleRange = i144;
                iArr58[i143] = 33;
                int i145 = i144 - 1;
                this.toDoubleRange = i145;
                iArr58[i145 - 1] = iArr58[i145 - 1] + iArr58[i145];
                return 0;
            case 72:
                int[] iArr59 = this.FastBitmap$CoordinateSystem;
                int i146 = this.toDoubleRange;
                this.toDoubleRange = i146 + 1;
                iArr59[i146] = 94;
                return 0;
            case 73:
                Object[] objArr9 = this.invokeSuspend;
                int i147 = this.toDoubleRange;
                int i148 = i147 + 1;
                this.toDoubleRange = i148;
                objArr9[i147] = objArr9[13];
                this.toDoubleRange = i148 + 1;
                objArr9[i148] = objArr9[14];
                return 0;
            case 74:
                int i149 = this.toDoubleRange - 1;
                this.toDoubleRange = i149;
                int[] iArr60 = this.FastBitmap$CoordinateSystem;
                iArr60[i149 - 1] = iArr60[i149 - 1] % iArr60[i149];
                int i150 = i149 - 1;
                this.toDoubleRange = i150;
                this.invokeSuspend[i150] = null;
                return 0;
            case 75:
                Object[] objArr10 = this.invokeSuspend;
                int i151 = this.toDoubleRange;
                int i152 = i151 + 1;
                this.toDoubleRange = i152;
                objArr10[i151] = objArr10[10];
                this.toDoubleRange = i152 + 1;
                objArr10[i152] = objArr10[13];
                return 0;
            case 76:
                Object[] objArr11 = this.invokeSuspend;
                int i153 = this.toDoubleRange;
                int i154 = i153 + 1;
                this.toDoubleRange = i154;
                objArr11[i153] = objArr11[14];
                this.toDoubleRange = i154 + 1;
                objArr11[i154] = objArr11[11];
                return 0;
            case 77:
                int[] iArr61 = this.FastBitmap$CoordinateSystem;
                int i155 = this.toDoubleRange;
                this.toDoubleRange = i155 + 1;
                iArr61[i155] = 44;
                return 0;
            case 78:
                int[] iArr62 = this.FastBitmap$CoordinateSystem;
                int i156 = this.toDoubleRange;
                this.toDoubleRange = i156 + 1;
                iArr62[i156] = 0;
                return 0;
            case 79:
                Object[] objArr12 = this.invokeSuspend;
                int i157 = this.toDoubleRange;
                this.toDoubleRange = i157 + 1;
                objArr12[i157] = objArr12[12];
                return 0;
            case 80:
                Object[] objArr13 = this.invokeSuspend;
                int i158 = this.toDoubleRange;
                this.toDoubleRange = i158 + 1;
                objArr13[i158] = objArr13[13];
                return 0;
            case 81:
                int[] iArr63 = this.FastBitmap$CoordinateSystem;
                int i159 = this.toDoubleRange;
                int i160 = i159 + 1;
                this.toDoubleRange = i160;
                iArr63[i159] = 3;
                int i161 = i160 + 1;
                this.toDoubleRange = i161;
                iArr63[i160] = 0;
                int i162 = i161 - 1;
                this.toDoubleRange = i162;
                iArr63[i162 - 1] = iArr63[i162 - 1] / iArr63[i162];
                return 0;
            case 82:
                int[] iArr64 = this.FastBitmap$CoordinateSystem;
                int i163 = this.toDoubleRange;
                this.toDoubleRange = i163 + 1;
                iArr64[i163] = 66;
                return 0;
            case 83:
                int[] iArr65 = this.FastBitmap$CoordinateSystem;
                int i164 = this.toDoubleRange;
                int i165 = i164 + 1;
                this.toDoubleRange = i165;
                iArr65[i164] = 67;
                iArr65[i165 - 1] = -iArr65[i165 - 1];
                return 0;
            case 84:
                int[] iArr66 = this.FastBitmap$CoordinateSystem;
                int i166 = this.toDoubleRange;
                int i167 = i166 + 2;
                this.toDoubleRange = i167;
                iArr66[i167 - 1] = iArr66[i167 - 3];
                iArr66[i166] = iArr66[i167 - 4];
                iArr66[i167 - 1] = -iArr66[i167 - 1];
                int i168 = i167 + 2;
                this.toDoubleRange = i168;
                iArr66[i168 - 1] = iArr66[i168 - 3];
                iArr66[i167] = iArr66[i168 - 4];
                return 0;
            case 85:
                int[] iArr67 = this.FastBitmap$CoordinateSystem;
                int i169 = this.toDoubleRange;
                this.toDoubleRange = i169 + 1;
                iArr67[i169] = -1;
                return 0;
            case 86:
                int i170 = this.toDoubleRange - 1;
                this.toDoubleRange = i170;
                int[] iArr68 = this.FastBitmap$CoordinateSystem;
                iArr68[i170 - 1] = iArr68[i170 - 1] ^ iArr68[i170];
                int i171 = i170 - 1;
                this.toDoubleRange = i171;
                iArr68[i171 - 1] = iArr68[i171 - 1] & iArr68[i171];
                int i172 = i171 + 1;
                this.toDoubleRange = i172;
                int i173 = iArr68[i172 - 2];
                iArr68[i171] = i173;
                iArr68[i172 - 2] = iArr68[i172 - 3];
                iArr68[i172 - 3] = iArr68[i172 - 4];
                iArr68[i172 - 4] = i173;
                return 0;
            case 87:
                int i174 = this.toDoubleRange - 1;
                this.toDoubleRange = i174;
                this.invokeSuspend[i174] = null;
                int[] iArr69 = this.FastBitmap$CoordinateSystem;
                int i175 = iArr69[i174 - 1];
                iArr69[i174 - 1] = iArr69[i174 - 2];
                iArr69[i174 - 2] = i175;
                return 0;
            case 88:
                int i176 = this.toDoubleRange - 1;
                this.toDoubleRange = i176;
                int[] iArr70 = this.FastBitmap$CoordinateSystem;
                iArr70[i176 - 1] = iArr70[i176 - 1] ^ iArr70[i176];
                int i177 = i176 - 1;
                this.toDoubleRange = i177;
                iArr70[i177 - 1] = iArr70[i177] & iArr70[i177 - 1];
                return 0;
            case 89:
                int i178 = this.toDoubleRange - 1;
                this.toDoubleRange = i178;
                int[] iArr71 = this.FastBitmap$CoordinateSystem;
                iArr71[i178 - 1] = iArr71[i178 - 1] | iArr71[i178];
                int i179 = i178 + 1;
                this.toDoubleRange = i179;
                int i180 = iArr71[i179 - 2];
                iArr71[i178] = i180;
                iArr71[i179 - 2] = iArr71[i179 - 3];
                iArr71[i179 - 3] = iArr71[i179 - 4];
                iArr71[i179 - 4] = i180;
                int i181 = i179 - 1;
                this.toDoubleRange = i181;
                this.invokeSuspend[i181] = null;
                return 0;
            case 90:
                int[] iArr72 = this.FastBitmap$CoordinateSystem;
                int i182 = this.toDoubleRange;
                int i183 = i182 + 2;
                this.toDoubleRange = i183;
                iArr72[i183 - 1] = iArr72[i183 - 3];
                iArr72[i182] = iArr72[i183 - 4];
                int i184 = i183 + 1;
                this.toDoubleRange = i184;
                iArr72[i183] = -1;
                int i185 = i184 - 1;
                this.toDoubleRange = i185;
                iArr72[i185 - 1] = iArr72[i185] ^ iArr72[i185 - 1];
                return 0;
            case 91:
                int i186 = this.toDoubleRange - 1;
                this.toDoubleRange = i186;
                int[] iArr73 = this.FastBitmap$CoordinateSystem;
                iArr73[i186 - 1] = iArr73[i186 - 1] ^ iArr73[i186];
                int i187 = i186 - 1;
                this.toDoubleRange = i187;
                this.invokeSuspend[i187] = null;
                int i188 = i187 - 1;
                this.toDoubleRange = i188;
                iArr73[i188 - 1] = iArr73[i188] & iArr73[i188 - 1];
                return 0;
            case 92:
                int[] iArr74 = this.FastBitmap$CoordinateSystem;
                int i189 = this.toDoubleRange;
                int i190 = i189 + 1;
                this.toDoubleRange = i190;
                iArr74[i189] = iArr74[i190 - 2];
                this.toDoubleRange = i190 + 1;
                iArr74[i190] = -1;
                return 0;
            case 93:
                int i191 = this.toDoubleRange - 1;
                this.toDoubleRange = i191;
                int[] iArr75 = this.FastBitmap$CoordinateSystem;
                iArr75[i191 - 1] = iArr75[i191] ^ iArr75[i191 - 1];
                return 0;
            case 94:
                int[] iArr76 = this.FastBitmap$CoordinateSystem;
                int i192 = this.toDoubleRange;
                int i193 = iArr76[i192 - 1];
                iArr76[i192 - 1] = iArr76[i192 - 2];
                iArr76[i192 - 2] = i193;
                return 0;
            case 95:
                int i194 = this.toDoubleRange - 1;
                this.toDoubleRange = i194;
                this.invokeSuspend[i194] = null;
                int i195 = i194 - 1;
                this.toDoubleRange = i195;
                int[] iArr77 = this.FastBitmap$CoordinateSystem;
                iArr77[i195 - 1] = iArr77[i195 - 1] - iArr77[i195];
                this.toDoubleRange = i195 + 1;
                iArr77[i195] = 1;
                return 0;
            case 96:
                int i196 = this.toDoubleRange - 1;
                this.toDoubleRange = i196;
                int[] iArr78 = this.FastBitmap$CoordinateSystem;
                iArr78[i196 - 1] = iArr78[i196 - 1] - iArr78[i196];
                int i197 = i196 + 1;
                this.toDoubleRange = i197;
                iArr78[i196] = iArr78[i197 - 2];
                return 0;
            case 97:
                Object[] objArr14 = this.invokeSuspend;
                int i198 = this.toDoubleRange;
                this.toDoubleRange = i198 + 1;
                objArr14[i198] = objArr14[14];
                return 0;
            case 98:
                int[] iArr79 = this.FastBitmap$CoordinateSystem;
                int i199 = this.toDoubleRange;
                this.toDoubleRange = i199 + 1;
                iArr79[i199] = 58;
                return 0;
            case 99:
                int[] iArr80 = this.FastBitmap$CoordinateSystem;
                int i200 = this.toDoubleRange;
                this.toDoubleRange = i200 + 1;
                iArr80[i200] = 43;
                return 0;
            case 100:
                int i201 = this.toDoubleRange - 1;
                this.toDoubleRange = i201;
                this.invokeSuspend[i201] = null;
                int[] iArr81 = this.FastBitmap$CoordinateSystem;
                int i202 = iArr81[i201 - 1];
                iArr81[i201 - 1] = iArr81[i201 - 2];
                iArr81[i201 - 2] = i202;
                this.toDoubleRange = i201 + 1;
                iArr81[i201] = -1;
                return 0;
            case 101:
                int[] iArr82 = this.FastBitmap$CoordinateSystem;
                int i203 = this.toDoubleRange;
                int i204 = iArr82[i203 - 1];
                iArr82[i203 - 1] = iArr82[i203 - 2];
                iArr82[i203 - 2] = i204;
                int i205 = i203 - 1;
                this.toDoubleRange = i205;
                this.invokeSuspend[i205] = null;
                iArr82[i205 - 1] = -iArr82[i205 - 1];
                return 0;
            case 102:
                int i206 = this.toDoubleRange - 1;
                this.toDoubleRange = i206;
                int[] iArr83 = this.FastBitmap$CoordinateSystem;
                iArr83[i206 - 1] = iArr83[i206 - 1] & iArr83[i206];
                int i207 = i206 + 1;
                this.toDoubleRange = i207;
                int i208 = iArr83[i207 - 2];
                iArr83[i206] = i208;
                iArr83[i207 - 2] = iArr83[i207 - 3];
                iArr83[i207 - 3] = iArr83[i207 - 4];
                iArr83[i207 - 4] = i208;
                return 0;
            case 103:
                int[] iArr84 = this.FastBitmap$CoordinateSystem;
                int i209 = this.toDoubleRange;
                int i210 = i209 + 1;
                this.toDoubleRange = i210;
                iArr84[i209] = iArr84[i210 - 2];
                return 0;
            case 104:
                int i211 = this.toDoubleRange - 1;
                this.toDoubleRange = i211;
                int[] iArr85 = this.FastBitmap$CoordinateSystem;
                iArr85[i211 - 1] = iArr85[i211 - 1] ^ iArr85[i211];
                int i212 = iArr85[i211 - 1];
                iArr85[i211 - 1] = iArr85[i211 - 2];
                iArr85[i211 - 2] = i212;
                int i213 = i211 - 1;
                this.toDoubleRange = i213;
                this.invokeSuspend[i213] = null;
                return 0;
            case 105:
                int i214 = this.toDoubleRange - 1;
                this.toDoubleRange = i214;
                int[] iArr86 = this.FastBitmap$CoordinateSystem;
                iArr86[i214 - 1] = iArr86[i214 - 1] - iArr86[i214];
                int i215 = i214 + 1;
                this.toDoubleRange = i215;
                iArr86[i214] = 1;
                int i216 = i215 - 1;
                this.toDoubleRange = i216;
                iArr86[i216 - 1] = iArr86[i216 - 1] - iArr86[i216];
                return 0;
            case 106:
                int[] iArr87 = this.FastBitmap$CoordinateSystem;
                int i217 = this.toDoubleRange;
                this.toDoubleRange = i217 + 1;
                iArr87[i217] = 128;
                return 0;
            case 107:
                int[] iArr88 = this.FastBitmap$CoordinateSystem;
                int i218 = this.toDoubleRange;
                int i219 = i218 + 1;
                this.toDoubleRange = i219;
                iArr88[i218] = 91;
                int i220 = i219 + 2;
                this.toDoubleRange = i220;
                iArr88[i220 - 1] = iArr88[i220 - 3];
                iArr88[i219] = iArr88[i220 - 4];
                int i221 = i220 + 2;
                this.toDoubleRange = i221;
                iArr88[i221 - 1] = iArr88[i221 - 3];
                iArr88[i220] = iArr88[i221 - 4];
                return 0;
            case 108:
                int i222 = this.toDoubleRange - 1;
                this.toDoubleRange = i222;
                int[] iArr89 = this.FastBitmap$CoordinateSystem;
                iArr89[i222 - 1] = iArr89[i222 - 1] & iArr89[i222];
                int i223 = i222 - 1;
                this.toDoubleRange = i223;
                iArr89[i223 - 1] = iArr89[i223] | iArr89[i223 - 1];
                return 0;
            case 109:
                int[] iArr90 = this.FastBitmap$CoordinateSystem;
                int i224 = this.toDoubleRange;
                int i225 = i224 + 1;
                this.toDoubleRange = i225;
                int i226 = iArr90[i225 - 2];
                iArr90[i224] = i226;
                iArr90[i225 - 2] = iArr90[i225 - 3];
                iArr90[i225 - 3] = iArr90[i225 - 4];
                iArr90[i225 - 4] = i226;
                int i227 = i225 - 1;
                this.toDoubleRange = i227;
                this.invokeSuspend[i227] = null;
                int i228 = i227 + 2;
                this.toDoubleRange = i228;
                iArr90[i228 - 1] = iArr90[i228 - 3];
                iArr90[i227] = iArr90[i228 - 4];
                return 0;
            case 110:
                int i229 = this.toDoubleRange - 1;
                this.toDoubleRange = i229;
                int[] iArr91 = this.FastBitmap$CoordinateSystem;
                iArr91[i229 - 1] = iArr91[i229 - 1] ^ iArr91[i229];
                int i230 = i229 + 1;
                this.toDoubleRange = i230;
                int i231 = iArr91[i230 - 2];
                iArr91[i229] = i231;
                iArr91[i230 - 2] = iArr91[i230 - 3];
                iArr91[i230 - 3] = iArr91[i230 - 4];
                iArr91[i230 - 4] = i231;
                return 0;
            case 111:
                int[] iArr92 = this.FastBitmap$CoordinateSystem;
                int i232 = this.toDoubleRange;
                iArr92[i232 - 1] = -iArr92[i232 - 1];
                this.toDoubleRange = i232 + 1;
                iArr92[i232] = -1;
                return 0;
            case 112:
                Object[] objArr15 = this.invokeSuspend;
                int i233 = this.toDoubleRange;
                int i234 = i233 + 1;
                this.toDoubleRange = i234;
                objArr15[i233] = objArr15[12];
                this.toDoubleRange = i234 + 1;
                objArr15[i234] = objArr15[13];
                return 0;
            case 113:
                int[] iArr93 = this.FastBitmap$CoordinateSystem;
                int i235 = this.toDoubleRange;
                this.toDoubleRange = i235 + 1;
                iArr93[i235] = 27;
                return 0;
            case 114:
                int i236 = this.toDoubleRange - 1;
                this.toDoubleRange = i236;
                int[] iArr94 = this.FastBitmap$CoordinateSystem;
                iArr94[i236 - 1] = iArr94[i236 - 1] | iArr94[i236];
                int i237 = i236 + 1;
                this.toDoubleRange = i237;
                iArr94[i236] = 1;
                int i238 = i237 - 1;
                this.toDoubleRange = i238;
                iArr94[i238 - 1] = iArr94[i238 - 1] << iArr94[i238];
                return 0;
            case 115:
                Object[] objArr16 = this.invokeSuspend;
                int i239 = this.toDoubleRange;
                int i240 = i239 + 1;
                this.toDoubleRange = i240;
                objArr16[i239] = null;
                Object obj3 = objArr16[i240 - 1];
                objArr16[i240 - 1] = null;
                this.FastBitmap$CoordinateSystem[i240 - 1] = ((int[]) obj3).length;
                return 0;
            case 116:
                int[] iArr95 = this.FastBitmap$CoordinateSystem;
                int i241 = this.toDoubleRange;
                int i242 = i241 + 1;
                this.toDoubleRange = i242;
                iArr95[i241] = -1;
                int i243 = i242 + 2;
                this.toDoubleRange = i243;
                iArr95[i243 - 1] = iArr95[i243 - 3];
                iArr95[i242] = iArr95[i243 - 4];
                int i244 = i243 - 1;
                this.toDoubleRange = i244;
                iArr95[i244 - 1] = iArr95[i244] & iArr95[i244 - 1];
                return 0;
            case 117:
                int[] iArr96 = this.FastBitmap$CoordinateSystem;
                int i245 = this.toDoubleRange;
                int i246 = i245 + 1;
                this.toDoubleRange = i246;
                iArr96[i245] = -1;
                int i247 = i246 - 1;
                this.toDoubleRange = i247;
                iArr96[i247 - 1] = iArr96[i247 - 1] ^ iArr96[i247];
                int i248 = i247 + 1;
                this.toDoubleRange = i248;
                int i249 = iArr96[i248 - 2];
                iArr96[i247] = i249;
                iArr96[i248 - 2] = iArr96[i248 - 3];
                iArr96[i248 - 3] = iArr96[i248 - 4];
                iArr96[i248 - 4] = i249;
                return 0;
            case 118:
                int i250 = this.toDoubleRange - 1;
                this.toDoubleRange = i250;
                int[] iArr97 = this.FastBitmap$CoordinateSystem;
                iArr97[i250 - 1] = iArr97[i250 - 1] | iArr97[i250];
                int i251 = i250 - 1;
                this.toDoubleRange = i251;
                iArr97[i251 - 1] = iArr97[i251] & iArr97[i251 - 1];
                return 0;
            case 119:
                int[] iArr98 = this.FastBitmap$CoordinateSystem;
                int i252 = this.toDoubleRange;
                int i253 = iArr98[i252 - 1];
                iArr98[i252 - 1] = iArr98[i252 - 2];
                iArr98[i252 - 2] = i253;
                int i254 = i252 - 1;
                this.toDoubleRange = i254;
                this.invokeSuspend[i254] = null;
                return 0;
            case 120:
                int[] iArr99 = this.FastBitmap$CoordinateSystem;
                int i255 = this.toDoubleRange;
                int i256 = i255 + 2;
                this.toDoubleRange = i256;
                iArr99[i256 - 1] = iArr99[i256 - 3];
                iArr99[i255] = iArr99[i256 - 4];
                iArr99[i256 - 1] = -iArr99[i256 - 1];
                return 0;
            case 121:
                int[] iArr100 = this.FastBitmap$CoordinateSystem;
                int i257 = this.toDoubleRange;
                int i258 = i257 + 1;
                this.toDoubleRange = i258;
                int i259 = iArr100[i258 - 2];
                iArr100[i257] = i259;
                iArr100[i258 - 2] = iArr100[i258 - 3];
                iArr100[i258 - 3] = iArr100[i258 - 4];
                iArr100[i258 - 4] = i259;
                int i260 = i258 - 1;
                this.toDoubleRange = i260;
                this.invokeSuspend[i260] = null;
                iArr100[i260 - 1] = -iArr100[i260 - 1];
                return 0;
            case 122:
                int[] iArr101 = this.FastBitmap$CoordinateSystem;
                int i261 = this.toDoubleRange;
                int i262 = i261 + 1;
                this.toDoubleRange = i262;
                iArr101[i261] = 1;
                int i263 = i262 + 2;
                this.toDoubleRange = i263;
                iArr101[i263 - 1] = iArr101[i263 - 3];
                iArr101[i262] = iArr101[i263 - 4];
                iArr101[i263 - 1] = -iArr101[i263 - 1];
                return 0;
            case 123:
                int i264 = this.toDoubleRange - 1;
                this.toDoubleRange = i264;
                int[] iArr102 = this.FastBitmap$CoordinateSystem;
                iArr102[i264 - 1] = iArr102[i264 - 1] & iArr102[i264];
                int i265 = i264 + 1;
                this.toDoubleRange = i265;
                int i266 = iArr102[i265 - 2];
                iArr102[i264] = i266;
                iArr102[i265 - 2] = iArr102[i265 - 3];
                iArr102[i265 - 3] = iArr102[i265 - 4];
                iArr102[i265 - 4] = i266;
                int i267 = i265 - 1;
                this.toDoubleRange = i267;
                this.invokeSuspend[i267] = null;
                return 0;
            case 124:
                int i268 = this.toDoubleRange - 1;
                this.toDoubleRange = i268;
                int[] iArr103 = this.FastBitmap$CoordinateSystem;
                iArr103[i268 - 1] = iArr103[i268 - 1] | iArr103[i268];
                int i269 = i268 - 1;
                this.toDoubleRange = i269;
                iArr103[i269 - 1] = iArr103[i269 - 1] + iArr103[i269];
                return 0;
            case 125:
                int i270 = this.toDoubleRange - 1;
                this.toDoubleRange = i270;
                Object[] objArr17 = this.invokeSuspend;
                Object obj4 = objArr17[i270];
                objArr17[i270] = null;
                objArr17[11] = obj4;
                return 0;
            case 126:
                int[] iArr104 = this.FastBitmap$CoordinateSystem;
                int i271 = this.toDoubleRange;
                this.toDoubleRange = i271 + 1;
                iArr104[i271] = 75;
                return 0;
            case 127:
                int[] iArr105 = this.FastBitmap$CoordinateSystem;
                int i272 = this.toDoubleRange;
                int i273 = i272 + 1;
                this.toDoubleRange = i273;
                iArr105[i272] = 41;
                int i274 = i273 + 2;
                this.toDoubleRange = i274;
                iArr105[i274 - 1] = iArr105[i274 - 3];
                iArr105[i273] = iArr105[i274 - 4];
                int i275 = i274 + 2;
                this.toDoubleRange = i275;
                iArr105[i275 - 1] = iArr105[i275 - 3];
                iArr105[i274] = iArr105[i275 - 4];
                return 0;
            case 128:
                int i276 = this.toDoubleRange - 1;
                this.toDoubleRange = i276;
                this.invokeSuspend[i276] = null;
                int[] iArr106 = this.FastBitmap$CoordinateSystem;
                int i277 = i276 + 2;
                this.toDoubleRange = i277;
                iArr106[i277 - 1] = iArr106[i277 - 3];
                iArr106[i276] = iArr106[i277 - 4];
                this.toDoubleRange = i277 + 1;
                iArr106[i277] = -1;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3:
                int i278 = this.toDoubleRange - 1;
                this.toDoubleRange = i278;
                int[] iArr107 = this.FastBitmap$CoordinateSystem;
                iArr107[i278 - 1] = iArr107[i278 - 1] & iArr107[i278];
                int i279 = i278 + 1;
                this.toDoubleRange = i279;
                iArr107[i278] = 1;
                int i280 = i279 - 1;
                this.toDoubleRange = i280;
                iArr107[i280 - 1] = iArr107[i280 - 1] << iArr107[i280];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                int[] iArr108 = this.FastBitmap$CoordinateSystem;
                int i281 = this.toDoubleRange;
                int i282 = i281 + 2;
                this.toDoubleRange = i282;
                iArr108[i282 - 1] = iArr108[i282 - 3];
                iArr108[i281] = iArr108[i282 - 4];
                int i283 = i282 - 1;
                this.toDoubleRange = i283;
                iArr108[i283 - 1] = iArr108[i283] & iArr108[i283 - 1];
                return 0;
            case 131:
                int[] iArr109 = this.FastBitmap$CoordinateSystem;
                int i284 = this.toDoubleRange;
                this.toDoubleRange = i284 + 1;
                iArr109[i284] = 9;
                return 0;
            case 132:
                int[] iArr110 = this.FastBitmap$CoordinateSystem;
                int i285 = this.toDoubleRange;
                int i286 = i285 + 1;
                this.toDoubleRange = i286;
                iArr110[i285] = 113;
                iArr110[i286 - 1] = -iArr110[i286 - 1];
                return 0;
            case 133:
                int i287 = this.toDoubleRange - 1;
                this.toDoubleRange = i287;
                this.invokeSuspend[i287] = null;
                int i288 = i287 - 1;
                this.toDoubleRange = i288;
                int[] iArr111 = this.FastBitmap$CoordinateSystem;
                iArr111[i288 - 1] = iArr111[i288 - 1] | iArr111[i288];
                int i289 = i288 - 1;
                this.toDoubleRange = i289;
                iArr111[i289 - 1] = iArr111[i289] & iArr111[i289 - 1];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                int i290 = this.toDoubleRange - 1;
                this.toDoubleRange = i290;
                int[] iArr112 = this.FastBitmap$CoordinateSystem;
                iArr112[i290 - 1] = iArr112[i290 - 1] + iArr112[i290];
                int i291 = i290 + 1;
                this.toDoubleRange = i291;
                iArr112[i290] = iArr112[i291 - 2];
                this.toDoubleRange = i291 + 1;
                iArr112[i291] = 128;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
                int[] iArr113 = this.FastBitmap$CoordinateSystem;
                int i292 = this.toDoubleRange;
                this.toDoubleRange = i292 + 1;
                iArr113[i292] = 93;
                return 0;
            case 136:
                int[] iArr114 = this.FastBitmap$CoordinateSystem;
                int i293 = this.toDoubleRange;
                this.toDoubleRange = i293 + 1;
                iArr114[i293] = 49;
                return 0;
            case 137:
                int[] iArr115 = this.FastBitmap$CoordinateSystem;
                int i294 = this.toDoubleRange;
                this.toDoubleRange = i294 + 1;
                iArr115[i294] = 13;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS:
                int[] iArr116 = this.FastBitmap$CoordinateSystem;
                int i295 = this.toDoubleRange;
                int i296 = i295 + 1;
                this.toDoubleRange = i296;
                iArr116[i295] = 2;
                int i297 = i296 + 1;
                this.toDoubleRange = i297;
                iArr116[i296] = 2;
                int i298 = i297 - 1;
                this.toDoubleRange = i298;
                iArr116[i298 - 1] = iArr116[i298 - 1] % iArr116[i298];
                return 0;
            case 139:
                int[] iArr117 = this.FastBitmap$CoordinateSystem;
                int i299 = this.toDoubleRange;
                int i300 = i299 + 1;
                this.toDoubleRange = i300;
                iArr117[i299] = 105;
                int i301 = i300 + 2;
                this.toDoubleRange = i301;
                iArr117[i301 - 1] = iArr117[i301 - 3];
                iArr117[i300] = iArr117[i301 - 4];
                return 0;
            case SavingsActivity.RV_BENEFIT_WIDTH:
                int[] iArr118 = this.FastBitmap$CoordinateSystem;
                int i302 = this.toDoubleRange;
                int i303 = i302 + 2;
                this.toDoubleRange = i303;
                iArr118[i303 - 1] = iArr118[i303 - 3];
                iArr118[i302] = iArr118[i303 - 4];
                int i304 = i303 - 1;
                this.toDoubleRange = i304;
                iArr118[i304 - 1] = iArr118[i304 - 1] | iArr118[i304];
                this.toDoubleRange = i304 + 1;
                iArr118[i304] = 1;
                return 0;
            case 141:
                int[] iArr119 = this.FastBitmap$CoordinateSystem;
                int i305 = this.toDoubleRange;
                this.toDoubleRange = i305 + 1;
                iArr119[i305] = 0;
                return 0;
            case 142:
                int i306 = this.toDoubleRange - 1;
                this.toDoubleRange = i306;
                int[] iArr120 = this.FastBitmap$CoordinateSystem;
                iArr120[i306 - 1] = iArr120[i306 - 1] / iArr120[i306];
                int i307 = i306 - 1;
                this.toDoubleRange = i307;
                this.invokeSuspend[i307] = null;
                return 0;
            case 143:
                int[] iArr121 = this.FastBitmap$CoordinateSystem;
                int i308 = this.toDoubleRange;
                int i309 = i308 + 1;
                this.toDoubleRange = i309;
                iArr121[i308] = 71;
                int i310 = i309 + 2;
                this.toDoubleRange = i310;
                iArr121[i310 - 1] = iArr121[i310 - 3];
                iArr121[i309] = iArr121[i310 - 4];
                int i311 = i310 + 2;
                this.toDoubleRange = i311;
                iArr121[i311 - 1] = iArr121[i311 - 3];
                iArr121[i310] = iArr121[i311 - 4];
                return 0;
            case 144:
                int i312 = this.toDoubleRange - 1;
                this.toDoubleRange = i312;
                int[] iArr122 = this.FastBitmap$CoordinateSystem;
                iArr122[i312 - 1] = iArr122[i312 - 1] ^ iArr122[i312];
                int i313 = i312 - 1;
                this.toDoubleRange = i313;
                iArr122[i313 - 1] = iArr122[i313 - 1] ^ iArr122[i313];
                int i314 = i313 - 1;
                this.toDoubleRange = i314;
                this.invokeSuspend[i314] = null;
                return 0;
            case 145:
                int[] iArr123 = this.FastBitmap$CoordinateSystem;
                int i315 = this.toDoubleRange;
                int i316 = i315 + 1;
                this.toDoubleRange = i316;
                iArr123[i315] = 97;
                int i317 = i316 + 2;
                this.toDoubleRange = i317;
                iArr123[i317 - 1] = iArr123[i317 - 3];
                iArr123[i316] = iArr123[i317 - 4];
                int i318 = i317 + 2;
                this.toDoubleRange = i318;
                iArr123[i318 - 1] = iArr123[i318 - 3];
                iArr123[i317] = iArr123[i318 - 4];
                return 0;
            case 146:
                int[] iArr124 = this.FastBitmap$CoordinateSystem;
                int i319 = this.toDoubleRange;
                int i320 = i319 + 1;
                this.toDoubleRange = i320;
                int i321 = iArr124[i320 - 2];
                iArr124[i319] = i321;
                iArr124[i320 - 2] = iArr124[i320 - 3];
                iArr124[i320 - 3] = iArr124[i320 - 4];
                iArr124[i320 - 4] = i321;
                int i322 = i320 - 1;
                this.toDoubleRange = i322;
                this.invokeSuspend[i322] = null;
                int i323 = i322 - 1;
                this.toDoubleRange = i323;
                iArr124[i323 - 1] = iArr124[i323] ^ iArr124[i323 - 1];
                return 0;
            case 147:
                int[] iArr125 = this.FastBitmap$CoordinateSystem;
                int i324 = this.toDoubleRange;
                this.toDoubleRange = i324 + 1;
                iArr125[i324] = 37;
                return 0;
            case 148:
                int[] iArr126 = this.FastBitmap$CoordinateSystem;
                int i325 = this.toDoubleRange;
                this.toDoubleRange = i325 + 1;
                iArr126[i325] = 67;
                return 0;
            case 149:
                int[] iArr127 = this.FastBitmap$CoordinateSystem;
                int i326 = this.toDoubleRange;
                this.toDoubleRange = i326 + 1;
                iArr127[i326] = 51;
                return 0;
            case 150:
                int[] iArr128 = this.FastBitmap$CoordinateSystem;
                int i327 = this.toDoubleRange;
                iArr128[i327 - 1] = -iArr128[i327 - 1];
                int i328 = i327 + 2;
                this.toDoubleRange = i328;
                iArr128[i328 - 1] = iArr128[i328 - 3];
                iArr128[i327] = iArr128[i328 - 4];
                return 0;
            case 151:
                int i329 = this.toDoubleRange - 1;
                this.toDoubleRange = i329;
                int[] iArr129 = this.FastBitmap$CoordinateSystem;
                iArr129[i329 - 1] = iArr129[i329 - 1] ^ iArr129[i329];
                int i330 = i329 + 1;
                this.toDoubleRange = i330;
                int i331 = iArr129[i330 - 2];
                iArr129[i329] = i331;
                iArr129[i330 - 2] = iArr129[i330 - 3];
                iArr129[i330 - 3] = iArr129[i330 - 4];
                iArr129[i330 - 4] = i331;
                int i332 = i330 - 1;
                this.toDoubleRange = i332;
                this.invokeSuspend[i332] = null;
                return 0;
            case 152:
                int[] iArr130 = this.FastBitmap$CoordinateSystem;
                int i333 = this.toDoubleRange;
                int i334 = iArr130[i333 - 1];
                iArr130[i333 - 1] = iArr130[i333 - 2];
                iArr130[i333 - 2] = i334;
                int i335 = i333 - 1;
                this.toDoubleRange = i335;
                this.invokeSuspend[i335] = null;
                int i336 = i335 - 1;
                this.toDoubleRange = i336;
                iArr130[i336 - 1] = iArr130[i336 - 1] - iArr130[i336];
                return 0;
            case 153:
                int[] iArr131 = this.FastBitmap$CoordinateSystem;
                int i337 = this.toDoubleRange;
                this.toDoubleRange = i337 + 1;
                iArr131[i337] = 79;
                return 0;
            case 154:
                int[] iArr132 = this.FastBitmap$CoordinateSystem;
                int i338 = this.toDoubleRange;
                iArr132[i338 - 1] = -iArr132[i338 - 1];
                int i339 = i338 - 1;
                this.toDoubleRange = i339;
                iArr132[i339 - 1] = iArr132[i339] & iArr132[i339 - 1];
                return 0;
            case 155:
                int i340 = this.toDoubleRange - 1;
                this.toDoubleRange = i340;
                this.invokeSuspend[i340] = null;
                int[] iArr133 = this.FastBitmap$CoordinateSystem;
                iArr133[i340 - 1] = -iArr133[i340 - 1];
                int i341 = i340 - 1;
                this.toDoubleRange = i341;
                iArr133[i341 - 1] = iArr133[i341] | iArr133[i341 - 1];
                return 0;
            case 156:
                int[] iArr134 = this.FastBitmap$CoordinateSystem;
                int i342 = this.toDoubleRange;
                Object[] objArr18 = this.invokeSuspend;
                Object obj5 = objArr18[i342 - 1];
                objArr18[i342 - 1] = null;
                iArr134[i342 - 1] = ((int[]) obj5).length;
                int i343 = i342 - 1;
                this.toDoubleRange = i343;
                objArr18[i343] = null;
                return 0;
            case 157:
                int[] iArr135 = this.FastBitmap$CoordinateSystem;
                int i344 = this.toDoubleRange;
                this.toDoubleRange = i344 + 1;
                iArr135[i344] = 42;
                return 0;
            case 158:
                int[] iArr136 = this.FastBitmap$CoordinateSystem;
                int i345 = this.toDoubleRange;
                this.toDoubleRange = i345 + 1;
                iArr136[i345] = 7;
                return 0;
            case 159:
                int[] iArr137 = this.FastBitmap$CoordinateSystem;
                int i346 = this.toDoubleRange;
                int i347 = i346 + 1;
                this.toDoubleRange = i347;
                iArr137[i346] = 87;
                int i348 = i347 + 2;
                this.toDoubleRange = i348;
                iArr137[i348 - 1] = iArr137[i348 - 3];
                iArr137[i347] = iArr137[i348 - 4];
                return 0;
            case BlobStatic.MONITOR_IMAGE_WIDTH /*160*/:
                int i349 = this.toDoubleRange - 1;
                this.toDoubleRange = i349;
                int[] iArr138 = this.FastBitmap$CoordinateSystem;
                iArr138[i349 - 1] = iArr138[i349 - 1] - iArr138[i349];
                int i350 = i349 + 1;
                this.toDoubleRange = i350;
                iArr138[i349] = iArr138[i350 - 2];
                this.toDoubleRange = i350 + 1;
                iArr138[i350] = 128;
                return 0;
            case 161:
                int[] iArr139 = this.FastBitmap$CoordinateSystem;
                int i351 = this.toDoubleRange;
                this.toDoubleRange = i351 + 1;
                iArr139[i351] = 57;
                return 0;
            case 162:
                int[] iArr140 = this.FastBitmap$CoordinateSystem;
                int i352 = this.toDoubleRange;
                int i353 = i352 + 1;
                this.toDoubleRange = i353;
                iArr140[i352] = iArr140[i353 - 2];
                int i354 = i353 + 1;
                this.toDoubleRange = i354;
                iArr140[i353] = -1;
                int i355 = i354 - 1;
                this.toDoubleRange = i355;
                iArr140[i355 - 1] = iArr140[i355] ^ iArr140[i355 - 1];
                return 0;
            case 163:
                int i356 = this.toDoubleRange - 1;
                this.toDoubleRange = i356;
                this.invokeSuspend[i356] = null;
                int i357 = i356 - 1;
                this.toDoubleRange = i357;
                int[] iArr141 = this.FastBitmap$CoordinateSystem;
                iArr141[i357 - 1] = iArr141[i357 - 1] - iArr141[i357];
                return 0;
            case 164:
                int[] iArr142 = this.FastBitmap$CoordinateSystem;
                int i358 = this.toDoubleRange;
                int i359 = i358 + 1;
                this.toDoubleRange = i359;
                iArr142[i358] = 27;
                iArr142[i359 - 1] = -iArr142[i359 - 1];
                return 0;
            case 165:
                int[] iArr143 = this.FastBitmap$CoordinateSystem;
                int i360 = this.toDoubleRange;
                int i361 = iArr143[i360 - 1];
                iArr143[i360 - 1] = iArr143[i360 - 2];
                iArr143[i360 - 2] = i361;
                this.toDoubleRange = i360 + 1;
                iArr143[i360] = -1;
                return 0;
            case 166:
                int[] iArr144 = this.FastBitmap$CoordinateSystem;
                int i362 = this.toDoubleRange;
                iArr144[i362 - 1] = -iArr144[i362 - 1];
                int i363 = i362 + 2;
                this.toDoubleRange = i363;
                iArr144[i363 - 1] = iArr144[i363 - 3];
                iArr144[i362] = iArr144[i363 - 4];
                this.toDoubleRange = i363 + 1;
                iArr144[i363] = -1;
                return 0;
            case 167:
                int i364 = this.toDoubleRange - 1;
                this.toDoubleRange = i364;
                int[] iArr145 = this.FastBitmap$CoordinateSystem;
                iArr145[i364 - 1] = iArr145[i364 - 1] ^ iArr145[i364];
                int i365 = i364 - 1;
                this.toDoubleRange = i365;
                iArr145[i365 - 1] = iArr145[i365] ^ iArr145[i365 - 1];
                return 0;
            case 168:
                int[] iArr146 = this.FastBitmap$CoordinateSystem;
                int i366 = this.toDoubleRange;
                int i367 = i366 + 1;
                this.toDoubleRange = i367;
                iArr146[i366] = 1;
                int i368 = i367 - 1;
                this.toDoubleRange = i368;
                iArr146[i368 - 1] = iArr146[i368 - 1] << iArr146[i368];
                int i369 = i368 - 1;
                this.toDoubleRange = i369;
                iArr146[i369 - 1] = iArr146[i369 - 1] + iArr146[i369];
                return 0;
            case 169:
                int[] iArr147 = this.FastBitmap$CoordinateSystem;
                int i370 = this.toDoubleRange;
                this.toDoubleRange = i370 + 1;
                iArr147[i370] = iArr147[11];
                return 0;
            case 170:
                int[] iArr148 = this.FastBitmap$CoordinateSystem;
                int i371 = this.toDoubleRange;
                this.toDoubleRange = i371 + 1;
                iArr148[i371] = 97;
                return 0;
            case 171:
                int[] iArr149 = this.FastBitmap$CoordinateSystem;
                int i372 = this.toDoubleRange;
                this.toDoubleRange = i372 + 1;
                iArr149[i372] = 11;
                return 0;
            case 172:
                int[] iArr150 = this.FastBitmap$CoordinateSystem;
                int i373 = this.toDoubleRange;
                int i374 = i373 + 1;
                this.toDoubleRange = i374;
                iArr150[i373] = 1;
                int i375 = i374 - 1;
                this.toDoubleRange = i375;
                iArr150[i375 - 1] = iArr150[i375 - 1] << iArr150[i375];
                int i376 = i375 + 1;
                this.toDoubleRange = i376;
                int i377 = iArr150[i376 - 2];
                iArr150[i375] = i377;
                iArr150[i376 - 2] = iArr150[i376 - 3];
                iArr150[i376 - 3] = iArr150[i376 - 4];
                iArr150[i376 - 4] = i377;
                return 0;
            case 173:
                int i378 = this.toDoubleRange - 1;
                this.toDoubleRange = i378;
                this.invokeSuspend[i378] = null;
                int i379 = i378 - 1;
                this.toDoubleRange = i379;
                int[] iArr151 = this.FastBitmap$CoordinateSystem;
                iArr151[i379 - 1] = iArr151[i379] ^ iArr151[i379 - 1];
                return 0;
            case 174:
                int i380 = this.toDoubleRange - 1;
                this.toDoubleRange = i380;
                int[] iArr152 = this.FastBitmap$CoordinateSystem;
                iArr152[i380 - 1] = iArr152[i380 - 1] - iArr152[i380];
                int i381 = i380 + 1;
                this.toDoubleRange = i381;
                iArr152[i380] = 1;
                int i382 = i381 + 2;
                this.toDoubleRange = i382;
                iArr152[i382 - 1] = iArr152[i382 - 3];
                iArr152[i381] = iArr152[i382 - 4];
                return 0;
            case 175:
                int[] iArr153 = this.FastBitmap$CoordinateSystem;
                int i383 = this.toDoubleRange;
                this.toDoubleRange = i383 + 1;
                iArr153[i383] = 20;
                return 0;
            case 176:
                int[] iArr154 = this.FastBitmap$CoordinateSystem;
                int i384 = this.toDoubleRange;
                this.toDoubleRange = i384 + 1;
                iArr154[i384] = 62;
                return 0;
            case 177:
                int[] iArr155 = this.FastBitmap$CoordinateSystem;
                int i385 = this.toDoubleRange;
                this.toDoubleRange = i385 + 1;
                iArr155[i385] = 89;
                return 0;
            case 178:
                int i386 = this.toDoubleRange - 1;
                this.toDoubleRange = i386;
                this.invokeSuspend[i386] = null;
                int[] iArr156 = this.FastBitmap$CoordinateSystem;
                int i387 = i386 + 2;
                this.toDoubleRange = i387;
                iArr156[i387 - 1] = iArr156[i387 - 3];
                iArr156[i386] = iArr156[i387 - 4];
                iArr156[i387 - 1] = -iArr156[i387 - 1];
                return 0;
            case 179:
                int[] iArr157 = this.FastBitmap$CoordinateSystem;
                int i388 = this.toDoubleRange;
                int i389 = i388 + 1;
                this.toDoubleRange = i389;
                iArr157[i388] = 15;
                iArr157[i389 - 1] = -iArr157[i389 - 1];
                return 0;
            case 180:
                int[] iArr158 = this.FastBitmap$CoordinateSystem;
                int i390 = this.toDoubleRange;
                int i391 = i390 + 1;
                this.toDoubleRange = i391;
                iArr158[i390] = iArr158[i391 - 2];
                iArr158[i391 - 1] = -iArr158[i391 - 1];
                return 0;
            case 181:
                int[] iArr159 = this.FastBitmap$CoordinateSystem;
                int i392 = this.toDoubleRange;
                int i393 = i392 + 1;
                this.toDoubleRange = i393;
                iArr159[i392] = -1;
                int i394 = i393 + 2;
                this.toDoubleRange = i394;
                iArr159[i394 - 1] = iArr159[i394 - 3];
                iArr159[i393] = iArr159[i394 - 4];
                this.toDoubleRange = i394 + 1;
                iArr159[i394] = -1;
                return 0;
            case 182:
                int i395 = this.toDoubleRange - 1;
                this.toDoubleRange = i395;
                int[] iArr160 = this.FastBitmap$CoordinateSystem;
                iArr160[i395 - 1] = iArr160[i395 - 1] - iArr160[i395];
                this.toDoubleRange = i395 + 1;
                iArr160[i395] = 1;
                return 0;
            case 183:
                Object[] objArr19 = this.invokeSuspend;
                int i396 = this.toDoubleRange;
                int i397 = i396 + 1;
                this.toDoubleRange = i397;
                objArr19[i396] = null;
                Object obj6 = objArr19[i397 - 1];
                objArr19[i397 - 1] = null;
                this.FastBitmap$CoordinateSystem[i397 - 1] = ((int[]) obj6).length;
                int i398 = i397 - 1;
                this.toDoubleRange = i398;
                objArr19[i398] = null;
                return 0;
            case 184:
                int[] iArr161 = this.FastBitmap$CoordinateSystem;
                int i399 = this.toDoubleRange;
                this.toDoubleRange = i399 + 1;
                iArr161[i399] = 56;
                return 0;
            case WSContextConstant.HANDSHAKE_RECEIVE_SIZE /*185*/:
                int[] iArr162 = this.FastBitmap$CoordinateSystem;
                int i400 = this.toDoubleRange;
                int i401 = i400 + 1;
                this.toDoubleRange = i401;
                iArr162[i400] = 119;
                iArr162[i401 - 1] = -iArr162[i401 - 1];
                int i402 = i401 + 2;
                this.toDoubleRange = i402;
                iArr162[i402 - 1] = iArr162[i402 - 3];
                iArr162[i401] = iArr162[i402 - 4];
                return 0;
            case 186:
                int[] iArr163 = this.FastBitmap$CoordinateSystem;
                int i403 = this.toDoubleRange;
                iArr163[i403 - 1] = -iArr163[i403 - 1];
                int i404 = i403 - 1;
                this.toDoubleRange = i404;
                iArr163[i404 - 1] = iArr163[i404 - 1] | iArr163[i404];
                this.toDoubleRange = i404 + 1;
                iArr163[i404] = 1;
                return 0;
            case 187:
                int i405 = this.toDoubleRange - 1;
                this.toDoubleRange = i405;
                int[] iArr164 = this.FastBitmap$CoordinateSystem;
                iArr164[i405 - 1] = iArr164[i405 - 1] << iArr164[i405];
                int i406 = i405 + 1;
                this.toDoubleRange = i406;
                int i407 = iArr164[i406 - 2];
                iArr164[i405] = i407;
                iArr164[i406 - 2] = iArr164[i406 - 3];
                iArr164[i406 - 3] = iArr164[i406 - 4];
                iArr164[i406 - 4] = i407;
                int i408 = i406 - 1;
                this.toDoubleRange = i408;
                this.invokeSuspend[i408] = null;
                return 0;
            case TsExtractor.TS_PACKET_SIZE:
                int[] iArr165 = this.FastBitmap$CoordinateSystem;
                int i409 = this.toDoubleRange;
                iArr165[i409 - 1] = -iArr165[i409 - 1];
                int i410 = i409 - 1;
                this.toDoubleRange = i410;
                iArr165[i410 - 1] = iArr165[i410 - 1] ^ iArr165[i410];
                iArr165[i410 - 1] = -iArr165[i410 - 1];
                return 0;
            case 189:
                int[] iArr166 = this.FastBitmap$CoordinateSystem;
                int i411 = this.toDoubleRange;
                int i412 = i411 + 1;
                this.toDoubleRange = i412;
                iArr166[i411] = 82;
                this.toDoubleRange = i412 + 1;
                iArr166[i412] = 0;
                return 0;
            case 190:
                int i413 = this.toDoubleRange - 1;
                this.toDoubleRange = i413;
                int[] iArr167 = this.FastBitmap$CoordinateSystem;
                iArr167[i413 - 1] = iArr167[i413 - 1] / iArr167[i413];
                return 0;
            case 191:
                int[] iArr168 = this.FastBitmap$CoordinateSystem;
                int i414 = this.toDoubleRange;
                int i415 = i414 + 1;
                this.toDoubleRange = i415;
                iArr168[i414] = 15;
                int i416 = i415 + 1;
                this.toDoubleRange = i416;
                iArr168[i415] = iArr168[i416 - 2];
                return 0;
            case PsExtractor.AUDIO_STREAM:
                int[] iArr169 = this.FastBitmap$CoordinateSystem;
                int i417 = this.toDoubleRange;
                int i418 = i417 + 2;
                this.toDoubleRange = i418;
                iArr169[i418 - 1] = iArr169[i418 - 3];
                iArr169[i417] = iArr169[i418 - 4];
                iArr169[i418 - 1] = -iArr169[i418 - 1];
                int i419 = i418 - 1;
                this.toDoubleRange = i419;
                iArr169[i419 - 1] = iArr169[i419] ^ iArr169[i419 - 1];
                return 0;
            case 193:
                int i420 = this.toDoubleRange - 1;
                this.toDoubleRange = i420;
                int[] iArr170 = this.FastBitmap$CoordinateSystem;
                iArr170[i420 - 1] = iArr170[i420 - 1] & iArr170[i420];
                this.toDoubleRange = i420 + 1;
                iArr170[i420] = 1;
                return 0;
            case 194:
                Object[] objArr20 = this.invokeSuspend;
                int i421 = this.toDoubleRange;
                int i422 = i421 + 1;
                this.toDoubleRange = i422;
                objArr20[i421] = objArr20[11];
                this.toDoubleRange = i422 + 1;
                objArr20[i422] = objArr20[12];
                return 0;
            case 195:
                int[] iArr171 = this.FastBitmap$CoordinateSystem;
                int i423 = this.toDoubleRange;
                int i424 = i423 + 1;
                this.toDoubleRange = i424;
                iArr171[i423] = 91;
                iArr171[i424 - 1] = -iArr171[i424 - 1];
                int i425 = i424 + 2;
                this.toDoubleRange = i425;
                iArr171[i425 - 1] = iArr171[i425 - 3];
                iArr171[i424] = iArr171[i425 - 4];
                return 0;
            case 196:
                int[] iArr172 = this.FastBitmap$CoordinateSystem;
                int i426 = this.toDoubleRange;
                int i427 = i426 + 2;
                this.toDoubleRange = i427;
                iArr172[i427 - 1] = iArr172[i427 - 3];
                iArr172[i426] = iArr172[i427 - 4];
                this.toDoubleRange = i427 + 1;
                iArr172[i427] = -1;
                return 0;
            case 197:
                int i428 = this.toDoubleRange - 1;
                this.toDoubleRange = i428;
                this.invokeSuspend[i428] = null;
                int i429 = i428 - 1;
                this.toDoubleRange = i429;
                int[] iArr173 = this.FastBitmap$CoordinateSystem;
                iArr173[i429 - 1] = iArr173[i429] & iArr173[i429 - 1];
                return 0;
            case 198:
                int[] iArr174 = this.FastBitmap$CoordinateSystem;
                int i430 = this.toDoubleRange;
                int i431 = i430 + 1;
                this.toDoubleRange = i431;
                iArr174[i430] = 1;
                int i432 = i431 - 1;
                this.toDoubleRange = i432;
                iArr174[i432 - 1] = iArr174[i432 - 1] << iArr174[i432];
                int i433 = i432 + 2;
                this.toDoubleRange = i433;
                iArr174[i433 - 1] = iArr174[i433 - 3];
                iArr174[i432] = iArr174[i433 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR /*199*/:
                int i434 = this.toDoubleRange - 1;
                this.toDoubleRange = i434;
                int[] iArr175 = this.FastBitmap$CoordinateSystem;
                iArr175[i434 - 1] = iArr175[i434 - 1] ^ iArr175[i434];
                int i435 = i434 - 1;
                this.toDoubleRange = i435;
                this.invokeSuspend[i435] = null;
                return 0;
            case 200:
                int i436 = this.toDoubleRange - 1;
                this.toDoubleRange = i436;
                int[] iArr176 = this.FastBitmap$CoordinateSystem;
                iArr176[i436 - 1] = iArr176[i436 - 1] << iArr176[i436];
                iArr176[i436 - 1] = -iArr176[i436 - 1];
                return 0;
            case 201:
                int[] iArr177 = this.FastBitmap$CoordinateSystem;
                int i437 = this.toDoubleRange;
                int i438 = i437 + 1;
                this.toDoubleRange = i438;
                iArr177[i437] = iArr177[i438 - 2];
                iArr177[i438 - 1] = -iArr177[i438 - 1];
                this.toDoubleRange = i438 + 1;
                iArr177[i438] = -1;
                return 0;
            case 202:
                int[] iArr178 = this.FastBitmap$CoordinateSystem;
                int i439 = this.toDoubleRange;
                int i440 = i439 + 1;
                this.toDoubleRange = i440;
                iArr178[i439] = 1;
                int i441 = i440 - 1;
                this.toDoubleRange = i441;
                iArr178[i441 - 1] = iArr178[i441 - 1] - iArr178[i441];
                int i442 = i441 + 1;
                this.toDoubleRange = i442;
                iArr178[i441] = iArr178[i442 - 2];
                return 0;
            case 203:
                int[] iArr179 = this.FastBitmap$CoordinateSystem;
                int i443 = this.toDoubleRange;
                int i444 = i443 + 1;
                this.toDoubleRange = i444;
                iArr179[i443] = -1;
                int i445 = i444 + 2;
                this.toDoubleRange = i445;
                iArr179[i445 - 1] = iArr179[i445 - 3];
                iArr179[i444] = iArr179[i445 - 4];
                return 0;
            case 204:
                int i446 = this.toDoubleRange - 1;
                this.toDoubleRange = i446;
                this.invokeSuspend[i446] = null;
                int[] iArr180 = this.FastBitmap$CoordinateSystem;
                int i447 = i446 + 1;
                this.toDoubleRange = i447;
                iArr180[i446] = iArr180[i447 - 2];
                return 0;
            case 205:
                int[] iArr181 = this.FastBitmap$CoordinateSystem;
                int i448 = this.toDoubleRange;
                int i449 = i448 + 1;
                this.toDoubleRange = i449;
                iArr181[i448] = 1;
                int i450 = i449 - 1;
                this.toDoubleRange = i450;
                iArr181[i450 - 1] = iArr181[i450 - 1] - iArr181[i450];
                return 0;
            case 206:
                int[] iArr182 = this.FastBitmap$CoordinateSystem;
                int i451 = this.toDoubleRange;
                int i452 = i451 + 1;
                this.toDoubleRange = i452;
                iArr182[i451] = -1;
                int i453 = i452 - 1;
                this.toDoubleRange = i453;
                iArr182[i453 - 1] = iArr182[i453 - 1] ^ iArr182[i453];
                int i454 = iArr182[i453 - 1];
                iArr182[i453 - 1] = iArr182[i453 - 2];
                iArr182[i453 - 2] = i454;
                return 0;
            case 207:
                int[] iArr183 = this.FastBitmap$CoordinateSystem;
                int i455 = this.toDoubleRange;
                iArr183[i455 - 1] = -iArr183[i455 - 1];
                int i456 = i455 + 2;
                this.toDoubleRange = i456;
                iArr183[i456 - 1] = iArr183[i456 - 3];
                iArr183[i455] = iArr183[i456 - 4];
                iArr183[i456 - 1] = -iArr183[i456 - 1];
                return 0;
            case 208:
                int i457 = this.toDoubleRange - 1;
                this.toDoubleRange = i457;
                int[] iArr184 = this.FastBitmap$CoordinateSystem;
                iArr184[i457 - 1] = iArr184[i457 - 1] << iArr184[i457];
                int i458 = i457 - 1;
                this.toDoubleRange = i458;
                iArr184[i458 - 1] = iArr184[i458 - 1] + iArr184[i458];
                return 0;
            case 209:
                int[] iArr185 = this.FastBitmap$CoordinateSystem;
                int i459 = this.toDoubleRange;
                int i460 = i459 + 2;
                this.toDoubleRange = i460;
                iArr185[i460 - 1] = iArr185[i460 - 3];
                iArr185[i459] = iArr185[i460 - 4];
                int i461 = i460 + 2;
                this.toDoubleRange = i461;
                iArr185[i461 - 1] = iArr185[i461 - 3];
                iArr185[i460] = iArr185[i461 - 4];
                this.toDoubleRange = i461 + 1;
                iArr185[i461] = -1;
                return 0;
            case 210:
                int i462 = this.toDoubleRange - 1;
                this.toDoubleRange = i462;
                int[] iArr186 = this.FastBitmap$CoordinateSystem;
                iArr186[i462 - 1] = iArr186[i462 - 1] | iArr186[i462];
                int i463 = i462 + 1;
                this.toDoubleRange = i463;
                int i464 = iArr186[i463 - 2];
                iArr186[i462] = i464;
                iArr186[i463 - 2] = iArr186[i463 - 3];
                iArr186[i463 - 3] = iArr186[i463 - 4];
                iArr186[i463 - 4] = i464;
                return 0;
            case 211:
                int i465 = this.toDoubleRange - 1;
                this.toDoubleRange = i465;
                int[] iArr187 = this.FastBitmap$CoordinateSystem;
                iArr187[i465 - 1] = iArr187[i465 - 1] << iArr187[i465];
                int i466 = i465 + 2;
                this.toDoubleRange = i466;
                iArr187[i466 - 1] = iArr187[i466 - 3];
                iArr187[i465] = iArr187[i466 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_STORE_LOW_VERSION_DATA_FILE /*212*/:
                int[] iArr188 = this.FastBitmap$CoordinateSystem;
                int i467 = this.toDoubleRange;
                int i468 = i467 + 1;
                this.toDoubleRange = i468;
                iArr188[i467] = 87;
                int i469 = i468 - 1;
                this.toDoubleRange = i469;
                iArr188[i469 - 1] = iArr188[i469 - 1] + iArr188[i469];
                return 0;
            case 213:
                int[] iArr189 = this.FastBitmap$CoordinateSystem;
                int i470 = this.toDoubleRange;
                int i471 = i470 + 1;
                this.toDoubleRange = i471;
                iArr189[i470] = 37;
                int i472 = i471 + 1;
                this.toDoubleRange = i472;
                iArr189[i471] = iArr189[i472 - 2];
                this.toDoubleRange = i472 + 1;
                iArr189[i472] = -1;
                return 0;
            case 214:
                int i473 = this.toDoubleRange - 1;
                this.toDoubleRange = i473;
                int[] iArr190 = this.FastBitmap$CoordinateSystem;
                iArr190[i473 - 1] = iArr190[i473 - 1] ^ iArr190[i473];
                int i474 = iArr190[i473 - 1];
                iArr190[i473 - 1] = iArr190[i473 - 2];
                iArr190[i473 - 2] = i474;
                return 0;
            case 215:
                int[] iArr191 = this.FastBitmap$CoordinateSystem;
                int i475 = this.toDoubleRange;
                this.toDoubleRange = i475 + 1;
                iArr191[i475] = 76;
                return 0;
            case 216:
                int[] iArr192 = this.FastBitmap$CoordinateSystem;
                int i476 = this.toDoubleRange;
                int i477 = i476 + 1;
                this.toDoubleRange = i477;
                iArr192[i476] = 73;
                iArr192[i477 - 1] = -iArr192[i477 - 1];
                return 0;
            case FileUtils.JPEG_MARKER_EOI /*217*/:
                int[] iArr193 = this.FastBitmap$CoordinateSystem;
                int i478 = this.toDoubleRange;
                iArr193[i478 - 1] = -iArr193[i478 - 1];
                int i479 = i478 + 1;
                this.toDoubleRange = i479;
                iArr193[i478] = iArr193[i479 - 2];
                this.toDoubleRange = i479 + 1;
                iArr193[i479] = -1;
                return 0;
            case 218:
                int[] iArr194 = this.FastBitmap$CoordinateSystem;
                int i480 = this.toDoubleRange;
                iArr194[i480 - 1] = -iArr194[i480 - 1];
                int i481 = i480 + 2;
                this.toDoubleRange = i481;
                iArr194[i481 - 1] = iArr194[i481 - 3];
                iArr194[i480] = iArr194[i481 - 4];
                int i482 = i481 - 1;
                this.toDoubleRange = i482;
                iArr194[i482 - 1] = iArr194[i482] & iArr194[i482 - 1];
                return 0;
            case 219:
                int i483 = this.toDoubleRange - 1;
                this.toDoubleRange = i483;
                this.invokeSuspend[i483] = null;
                int i484 = i483 - 1;
                this.toDoubleRange = i484;
                int[] iArr195 = this.FastBitmap$CoordinateSystem;
                iArr195[i484 - 1] = iArr195[i484 - 1] | iArr195[i484];
                int i485 = i484 - 1;
                this.toDoubleRange = i485;
                iArr195[i485 - 1] = iArr195[i485 - 1] + iArr195[i485];
                return 0;
            case WheelView.DIVIDER_ALPHA /*220*/:
                int[] iArr196 = this.FastBitmap$CoordinateSystem;
                int i486 = this.toDoubleRange;
                int i487 = i486 + 1;
                this.toDoubleRange = i487;
                iArr196[i486] = 57;
                iArr196[i487 - 1] = -iArr196[i487 - 1];
                return 0;
            case 221:
                int[] iArr197 = this.FastBitmap$CoordinateSystem;
                int i488 = this.toDoubleRange;
                int i489 = i488 + 1;
                this.toDoubleRange = i489;
                iArr197[i488] = 16;
                this.toDoubleRange = i489 + 1;
                iArr197[i489] = 0;
                return 0;
            case 222:
                int i490 = this.toDoubleRange - 1;
                this.toDoubleRange = i490;
                int[] iArr198 = this.FastBitmap$CoordinateSystem;
                iArr198[i490 - 1] = iArr198[i490 - 1] | iArr198[i490];
                iArr198[i490 - 1] = -iArr198[i490 - 1];
                int i491 = i490 + 2;
                this.toDoubleRange = i491;
                iArr198[i491 - 1] = iArr198[i491 - 3];
                iArr198[i490] = iArr198[i491 - 4];
                return 0;
            case 223:
                int[] iArr199 = this.FastBitmap$CoordinateSystem;
                int i492 = this.toDoubleRange;
                iArr199[i492 - 1] = -iArr199[i492 - 1];
                int i493 = i492 - 1;
                this.toDoubleRange = i493;
                iArr199[i493 - 1] = iArr199[i493 - 1] & iArr199[i493];
                this.toDoubleRange = i493 + 1;
                iArr199[i493] = 1;
                return 0;
            case 224:
                Object[] objArr21 = this.invokeSuspend;
                int i494 = this.toDoubleRange;
                this.toDoubleRange = i494 + 1;
                objArr21[i494] = objArr21[15];
                return 0;
            case 225:
                int[] iArr200 = this.FastBitmap$CoordinateSystem;
                int i495 = this.toDoubleRange;
                this.toDoubleRange = i495 + 1;
                iArr200[i495] = 4;
                return 0;
            case 226:
                int i496 = this.toDoubleRange - 1;
                this.toDoubleRange = i496;
                int[] iArr201 = this.FastBitmap$CoordinateSystem;
                iArr201[i496 - 1] = iArr201[i496 - 1] * iArr201[i496];
                return 0;
            case 227:
                int[] iArr202 = this.FastBitmap$CoordinateSystem;
                int i497 = this.toDoubleRange;
                this.toDoubleRange = i497 + 1;
                iArr202[i497] = 45;
                return 0;
            case 228:
                int[] iArr203 = this.FastBitmap$CoordinateSystem;
                int i498 = this.toDoubleRange;
                int i499 = i498 + 2;
                this.toDoubleRange = i499;
                iArr203[i499 - 1] = iArr203[i499 - 3];
                iArr203[i498] = iArr203[i499 - 4];
                int i500 = i499 - 1;
                this.toDoubleRange = i500;
                iArr203[i500 - 1] = iArr203[i500 - 1] ^ iArr203[i500];
                int i501 = i500 + 1;
                this.toDoubleRange = i501;
                int i502 = iArr203[i501 - 2];
                iArr203[i500] = i502;
                iArr203[i501 - 2] = iArr203[i501 - 3];
                iArr203[i501 - 3] = iArr203[i501 - 4];
                iArr203[i501 - 4] = i502;
                return 0;
            case 229:
                int[] iArr204 = this.FastBitmap$CoordinateSystem;
                int i503 = this.toDoubleRange;
                this.toDoubleRange = i503 + 1;
                iArr204[i503] = 101;
                return 0;
            case 230:
                int[] iArr205 = this.FastBitmap$CoordinateSystem;
                int i504 = this.toDoubleRange;
                int i505 = i504 + 2;
                this.toDoubleRange = i505;
                iArr205[i505 - 1] = iArr205[i505 - 3];
                iArr205[i504] = iArr205[i505 - 4];
                int i506 = i505 - 1;
                this.toDoubleRange = i506;
                iArr205[i506 - 1] = iArr205[i506 - 1] & iArr205[i506];
                this.toDoubleRange = i506 + 1;
                iArr205[i506] = -1;
                return 0;
            case 231:
                int i507 = this.toDoubleRange - 1;
                this.toDoubleRange = i507;
                this.invokeSuspend[i507] = null;
                int[] iArr206 = this.FastBitmap$CoordinateSystem;
                iArr206[i507 - 1] = -iArr206[i507 - 1];
                return 0;
            case 232:
                int i508 = this.toDoubleRange - 1;
                this.toDoubleRange = i508;
                int[] iArr207 = this.FastBitmap$CoordinateSystem;
                iArr207[i508 - 1] = iArr207[i508 - 1] ^ iArr207[i508];
                int i509 = i508 - 1;
                this.toDoubleRange = i509;
                iArr207[i509 - 1] = iArr207[i509 - 1] - iArr207[i509];
                return 0;
            case 233:
                int[] iArr208 = this.FastBitmap$CoordinateSystem;
                int i510 = this.toDoubleRange;
                this.toDoubleRange = i510 + 1;
                iArr208[i510] = 25;
                return 0;
            case 234:
                int i511 = this.toDoubleRange - 1;
                this.toDoubleRange = i511;
                this.invokeSuspend[i511] = null;
                int[] iArr209 = this.FastBitmap$CoordinateSystem;
                int i512 = i511 + 2;
                this.toDoubleRange = i512;
                iArr209[i512 - 1] = iArr209[i512 - 3];
                iArr209[i511] = iArr209[i512 - 4];
                return 0;
            case 235:
                int[] iArr210 = this.FastBitmap$CoordinateSystem;
                int i513 = this.toDoubleRange;
                iArr210[i513 - 1] = -iArr210[i513 - 1];
                int i514 = i513 + 1;
                this.toDoubleRange = i514;
                iArr210[i513] = -1;
                int i515 = i514 - 1;
                this.toDoubleRange = i515;
                iArr210[i515 - 1] = iArr210[i515] ^ iArr210[i515 - 1];
                return 0;
            case 236:
                int[] iArr211 = this.FastBitmap$CoordinateSystem;
                int i516 = this.toDoubleRange;
                this.toDoubleRange = i516 + 1;
                iArr211[i516] = 86;
                return 0;
            case 237:
                int[] iArr212 = this.FastBitmap$CoordinateSystem;
                int i517 = this.toDoubleRange;
                this.toDoubleRange = i517 + 1;
                iArr212[i517] = 39;
                return 0;
            case 238:
                int i518 = this.toDoubleRange - 1;
                this.toDoubleRange = i518;
                int[] iArr213 = this.FastBitmap$CoordinateSystem;
                iArr213[i518 - 1] = iArr213[i518 - 1] & iArr213[i518];
                int i519 = i518 - 1;
                this.toDoubleRange = i519;
                iArr213[i519 - 1] = iArr213[i519 - 1] | iArr213[i519];
                int i520 = i519 + 1;
                this.toDoubleRange = i520;
                int i521 = iArr213[i520 - 2];
                iArr213[i519] = i521;
                iArr213[i520 - 2] = iArr213[i520 - 3];
                iArr213[i520 - 3] = iArr213[i520 - 4];
                iArr213[i520 - 4] = i521;
                return 0;
            case 239:
                int[] iArr214 = this.FastBitmap$CoordinateSystem;
                int i522 = this.toDoubleRange;
                int i523 = i522 + 2;
                this.toDoubleRange = i523;
                iArr214[i523 - 1] = iArr214[i523 - 3];
                iArr214[i522] = iArr214[i523 - 4];
                int i524 = i523 - 1;
                this.toDoubleRange = i524;
                iArr214[i524 - 1] = iArr214[i524] | iArr214[i524 - 1];
                return 0;
            case 240:
                int i525 = this.toDoubleRange - 1;
                this.toDoubleRange = i525;
                this.invokeSuspend[i525] = null;
                int[] iArr215 = this.FastBitmap$CoordinateSystem;
                int i526 = i525 + 2;
                this.toDoubleRange = i526;
                iArr215[i526 - 1] = iArr215[i526 - 3];
                iArr215[i525] = iArr215[i526 - 4];
                int i527 = i526 - 1;
                this.toDoubleRange = i527;
                iArr215[i527 - 1] = iArr215[i527] & iArr215[i527 - 1];
                return 0;
            case 241:
                int i528 = this.toDoubleRange - 1;
                this.toDoubleRange = i528;
                int[] iArr216 = this.FastBitmap$CoordinateSystem;
                iArr216[i528 - 1] = iArr216[i528 - 1] | iArr216[i528];
                int i529 = i528 - 1;
                this.toDoubleRange = i529;
                iArr216[i529 - 1] = iArr216[i529 - 1] & iArr216[i529];
                int i530 = i529 + 2;
                this.toDoubleRange = i530;
                iArr216[i530 - 1] = iArr216[i530 - 3];
                iArr216[i529] = iArr216[i530 - 4];
                return 0;
            case 242:
                int[] iArr217 = this.FastBitmap$CoordinateSystem;
                int i531 = this.toDoubleRange;
                iArr217[i531 - 1] = -iArr217[i531 - 1];
                int i532 = i531 - 1;
                this.toDoubleRange = i532;
                iArr217[i532 - 1] = iArr217[i532 - 1] ^ iArr217[i532];
                int i533 = i532 + 1;
                this.toDoubleRange = i533;
                int i534 = iArr217[i533 - 2];
                iArr217[i532] = i534;
                iArr217[i533 - 2] = iArr217[i533 - 3];
                iArr217[i533 - 3] = iArr217[i533 - 4];
                iArr217[i533 - 4] = i534;
                return 0;
            case 243:
                int i535 = this.toDoubleRange - 1;
                this.toDoubleRange = i535;
                Object[] objArr22 = this.invokeSuspend;
                Object obj7 = objArr22[i535];
                objArr22[i535] = null;
                objArr22[14] = obj7;
                int i536 = i535 - 1;
                this.toDoubleRange = i536;
                Object obj8 = objArr22[i536];
                objArr22[i536] = null;
                objArr22[13] = obj8;
                this.toDoubleRange = i536 + 1;
                objArr22[i536] = objArr22[14];
                return 0;
            case 244:
                int[] iArr218 = this.FastBitmap$CoordinateSystem;
                int i537 = this.toDoubleRange;
                int i538 = i537 + 1;
                this.toDoubleRange = i538;
                iArr218[i537] = 79;
                iArr218[i538 - 1] = -iArr218[i538 - 1];
                int i539 = i538 + 1;
                this.toDoubleRange = i539;
                iArr218[i538] = iArr218[i539 - 2];
                return 0;
            case 245:
                int[] iArr219 = this.FastBitmap$CoordinateSystem;
                int i540 = this.toDoubleRange;
                int i541 = i540 + 1;
                this.toDoubleRange = i541;
                iArr219[i540] = 1;
                int i542 = i541 + 2;
                this.toDoubleRange = i542;
                iArr219[i542 - 1] = iArr219[i542 - 3];
                iArr219[i541] = iArr219[i542 - 4];
                return 0;
            case 246:
                int i543 = this.toDoubleRange - 1;
                this.toDoubleRange = i543;
                this.invokeSuspend[i543] = null;
                int[] iArr220 = this.FastBitmap$CoordinateSystem;
                iArr220[i543 - 1] = -iArr220[i543 - 1];
                int i544 = i543 - 1;
                this.toDoubleRange = i544;
                iArr220[i544 - 1] = iArr220[i544] ^ iArr220[i544 - 1];
                return 0;
            case 247:
                int[] iArr221 = this.FastBitmap$CoordinateSystem;
                int i545 = this.toDoubleRange;
                iArr221[i545 - 1] = -iArr221[i545 - 1];
                int i546 = i545 - 1;
                this.toDoubleRange = i546;
                iArr221[i546 - 1] = iArr221[i546 - 1] & iArr221[i546];
                int i547 = i546 + 1;
                this.toDoubleRange = i547;
                int i548 = iArr221[i547 - 2];
                iArr221[i546] = i548;
                iArr221[i547 - 2] = iArr221[i547 - 3];
                iArr221[i547 - 3] = iArr221[i547 - 4];
                iArr221[i547 - 4] = i548;
                return 0;
            case 248:
                int[] iArr222 = this.FastBitmap$CoordinateSystem;
                int i549 = this.toDoubleRange;
                iArr222[i549 - 1] = -iArr222[i549 - 1];
                int i550 = i549 + 2;
                this.toDoubleRange = i550;
                iArr222[i550 - 1] = iArr222[i550 - 3];
                iArr222[i549] = iArr222[i550 - 4];
                int i551 = i550 - 1;
                this.toDoubleRange = i551;
                iArr222[i551 - 1] = iArr222[i551] ^ iArr222[i551 - 1];
                return 0;
            case 249:
                int i552 = this.toDoubleRange - 1;
                this.toDoubleRange = i552;
                Object[] objArr23 = this.invokeSuspend;
                Object obj9 = objArr23[i552];
                objArr23[i552] = null;
                objArr23[14] = obj9;
                return 0;
            case SQLiteDatabase.MAX_SQL_CACHE_SIZE /*250*/:
                int i553 = this.toDoubleRange - 1;
                this.toDoubleRange = i553;
                Object[] objArr24 = this.invokeSuspend;
                Object obj10 = objArr24[i553];
                objArr24[i553] = null;
                objArr24[13] = obj10;
                return 0;
            case 251:
                int[] iArr223 = this.FastBitmap$CoordinateSystem;
                int i554 = this.toDoubleRange;
                int i555 = i554 + 1;
                this.toDoubleRange = i555;
                iArr223[i554] = 51;
                iArr223[i555 - 1] = -iArr223[i555 - 1];
                int i556 = i555 + 2;
                this.toDoubleRange = i556;
                iArr223[i556 - 1] = iArr223[i556 - 3];
                iArr223[i555] = iArr223[i556 - 4];
                return 0;
            case 252:
                int[] iArr224 = this.FastBitmap$CoordinateSystem;
                int i557 = this.toDoubleRange;
                int i558 = i557 + 1;
                this.toDoubleRange = i558;
                iArr224[i557] = 111;
                iArr224[i558 - 1] = -iArr224[i558 - 1];
                return 0;
            case 253:
                int i559 = this.toDoubleRange - 1;
                this.toDoubleRange = i559;
                int[] iArr225 = this.FastBitmap$CoordinateSystem;
                iArr225[i559 - 1] = iArr225[i559 - 1] | iArr225[i559];
                int i560 = i559 - 1;
                this.toDoubleRange = i560;
                iArr225[i560 - 1] = iArr225[i560 - 1] & iArr225[i560];
                int i561 = i560 + 1;
                this.toDoubleRange = i561;
                int i562 = iArr225[i561 - 2];
                iArr225[i560] = i562;
                iArr225[i561 - 2] = iArr225[i561 - 3];
                iArr225[i561 - 3] = iArr225[i561 - 4];
                iArr225[i561 - 4] = i562;
                return 0;
            case 254:
                Object[] objArr25 = this.invokeSuspend;
                int i563 = this.toDoubleRange;
                int i564 = i563 + 1;
                this.toDoubleRange = i564;
                objArr25[i563] = objArr25[i564 - 2];
                int i565 = i564 - 1;
                this.toDoubleRange = i565;
                Object obj11 = objArr25[i565];
                objArr25[i565] = null;
                objArr25[13] = obj11;
                return 0;
            case 255:
                Object[] objArr26 = this.invokeSuspend;
                int i566 = this.toDoubleRange;
                int i567 = i566 + 1;
                this.toDoubleRange = i567;
                objArr26[i566] = objArr26[i567 - 2];
                return 0;
            case 256:
                int i568 = this.toDoubleRange - 1;
                this.toDoubleRange = i568;
                Object[] objArr27 = this.invokeSuspend;
                Object obj12 = objArr27[i568];
                objArr27[i568] = null;
                this.setMax = obj12 == null ? 1 : 0;
                return 0;
            case 257:
                int[] iArr226 = this.FastBitmap$CoordinateSystem;
                int i569 = this.toDoubleRange;
                this.toDoubleRange = i569 + 1;
                iArr226[i569] = 26;
                return 0;
            case 258:
                Object[] objArr28 = this.invokeSuspend;
                int i570 = this.toDoubleRange;
                int i571 = i570 + 1;
                this.toDoubleRange = i571;
                objArr28[i570] = objArr28[i571 - 2];
                int i572 = i571 - 1;
                this.toDoubleRange = i572;
                Object obj13 = objArr28[i572];
                objArr28[i572] = null;
                objArr28[15] = obj13;
                return 0;
            case 259:
                int[] iArr227 = this.FastBitmap$CoordinateSystem;
                int i573 = this.toDoubleRange;
                this.toDoubleRange = i573 + 1;
                iArr227[i573] = 40;
                return 0;
            case 260:
                int[] iArr228 = this.FastBitmap$CoordinateSystem;
                int i574 = this.toDoubleRange;
                int i575 = i574 + 1;
                this.toDoubleRange = i575;
                iArr228[i574] = 88;
                int i576 = i575 + 1;
                this.toDoubleRange = i576;
                iArr228[i575] = 0;
                int i577 = i576 - 1;
                this.toDoubleRange = i577;
                iArr228[i577 - 1] = iArr228[i577 - 1] / iArr228[i577];
                return 0;
            case 261:
                int[] iArr229 = this.FastBitmap$CoordinateSystem;
                int i578 = this.toDoubleRange;
                this.toDoubleRange = i578 + 1;
                iArr229[i578] = 33;
                return 0;
            case 262:
                int[] iArr230 = this.FastBitmap$CoordinateSystem;
                int i579 = this.toDoubleRange;
                int i580 = i579 + 1;
                this.toDoubleRange = i580;
                iArr230[i579] = 53;
                int i581 = i580 + 1;
                this.toDoubleRange = i581;
                iArr230[i580] = iArr230[i581 - 2];
                this.toDoubleRange = i581 + 1;
                iArr230[i581] = -1;
                return 0;
            case 263:
                int[] iArr231 = this.FastBitmap$CoordinateSystem;
                int i582 = this.toDoubleRange;
                int i583 = iArr231[i582 - 1];
                iArr231[i582 - 1] = iArr231[i582 - 2];
                iArr231[i582 - 2] = i583;
                int i584 = i582 + 1;
                this.toDoubleRange = i584;
                iArr231[i582] = -1;
                int i585 = i584 - 1;
                this.toDoubleRange = i585;
                iArr231[i585 - 1] = iArr231[i585] ^ iArr231[i585 - 1];
                return 0;
            case 264:
                int[] iArr232 = this.FastBitmap$CoordinateSystem;
                int i586 = this.toDoubleRange;
                int i587 = i586 + 2;
                this.toDoubleRange = i587;
                iArr232[i587 - 1] = iArr232[i587 - 3];
                iArr232[i586] = iArr232[i587 - 4];
                iArr232[i587 - 1] = -iArr232[i587 - 1];
                int i588 = i587 - 1;
                this.toDoubleRange = i588;
                iArr232[i588 - 1] = iArr232[i588] & iArr232[i588 - 1];
                return 0;
            case 265:
                int i589 = this.toDoubleRange - 1;
                this.toDoubleRange = i589;
                int[] iArr233 = this.FastBitmap$CoordinateSystem;
                iArr233[i589 - 1] = iArr233[i589 - 1] | iArr233[i589];
                int i590 = i589 - 1;
                this.toDoubleRange = i590;
                iArr233[i590 - 1] = iArr233[i590 - 1] + iArr233[i590];
                this.toDoubleRange = i590 + 1;
                iArr233[i590] = 1;
                return 0;
            case 266:
                int i591 = this.toDoubleRange - 1;
                this.toDoubleRange = i591;
                this.invokeSuspend[i591] = null;
                int i592 = i591 - 1;
                this.toDoubleRange = i592;
                int[] iArr234 = this.FastBitmap$CoordinateSystem;
                iArr234[i592 - 1] = iArr234[i592 - 1] & iArr234[i592];
                int i593 = i592 - 1;
                this.toDoubleRange = i593;
                iArr234[i593 - 1] = iArr234[i593] | iArr234[i593 - 1];
                return 0;
            case 267:
                int i594 = this.toDoubleRange - 1;
                this.toDoubleRange = i594;
                int[] iArr235 = this.FastBitmap$CoordinateSystem;
                iArr235[i594 - 1] = iArr235[i594 - 1] | iArr235[i594];
                iArr235[i594 - 1] = -iArr235[i594 - 1];
                return 0;
            case 268:
                int[] iArr236 = this.FastBitmap$CoordinateSystem;
                int i595 = this.toDoubleRange;
                int i596 = i595 + 1;
                this.toDoubleRange = i596;
                iArr236[i595] = 83;
                iArr236[i596 - 1] = -iArr236[i596 - 1];
                return 0;
            case 269:
                int[] iArr237 = this.FastBitmap$CoordinateSystem;
                int i597 = this.toDoubleRange;
                this.toDoubleRange = i597 + 1;
                iArr237[i597] = 65;
                return 0;
            case 270:
                int[] iArr238 = this.FastBitmap$CoordinateSystem;
                int i598 = this.toDoubleRange;
                int i599 = i598 + 1;
                this.toDoubleRange = i599;
                iArr238[i598] = 105;
                iArr238[i599 - 1] = -iArr238[i599 - 1];
                return 0;
            case 271:
                int i600 = this.toDoubleRange - 1;
                this.toDoubleRange = i600;
                int[] iArr239 = this.FastBitmap$CoordinateSystem;
                iArr239[i600 - 1] = iArr239[i600 - 1] >>> iArr239[i600];
                int i601 = i600 - 1;
                this.toDoubleRange = i601;
                this.invokeSuspend[i601] = null;
                return 0;
            case LZMA_Base.kNumLenSymbols:
                int[] iArr240 = this.FastBitmap$CoordinateSystem;
                int i602 = this.toDoubleRange;
                this.toDoubleRange = i602 + 1;
                iArr240[i602] = 17;
                return 0;
            case LZMA_Base.kMatchMaxLen:
                int[] iArr241 = this.FastBitmap$CoordinateSystem;
                int i603 = this.toDoubleRange;
                this.toDoubleRange = i603 + 1;
                iArr241[i603] = 68;
                return 0;
            case 274:
                Object[] objArr29 = this.invokeSuspend;
                int i604 = this.toDoubleRange;
                int i605 = i604 + 1;
                this.toDoubleRange = i605;
                objArr29[i604] = objArr29[i605 - 2];
                int i606 = i605 - 1;
                this.toDoubleRange = i606;
                Object obj14 = objArr29[i606];
                objArr29[i606] = null;
                objArr29[11] = obj14;
                return 0;
            case 275:
                int[] iArr242 = this.FastBitmap$CoordinateSystem;
                int i607 = this.toDoubleRange;
                int i608 = i607 + 1;
                this.toDoubleRange = i608;
                iArr242[i607] = 37;
                int i609 = i608 + 2;
                this.toDoubleRange = i609;
                iArr242[i609 - 1] = iArr242[i609 - 3];
                iArr242[i608] = iArr242[i609 - 4];
                int i610 = i609 - 1;
                this.toDoubleRange = i610;
                iArr242[i610 - 1] = iArr242[i610] | iArr242[i610 - 1];
                return 0;
            case 276:
                int[] iArr243 = this.FastBitmap$CoordinateSystem;
                int i611 = this.toDoubleRange;
                iArr243[i611 - 1] = -iArr243[i611 - 1];
                int i612 = i611 - 1;
                this.toDoubleRange = i612;
                iArr243[i612 - 1] = iArr243[i612] ^ iArr243[i612 - 1];
                return 0;
            case 277:
                int i613 = this.toDoubleRange - 1;
                this.toDoubleRange = i613;
                this.invokeSuspend[i613] = null;
                int[] iArr244 = this.FastBitmap$CoordinateSystem;
                iArr244[i613 - 1] = -iArr244[i613 - 1];
                int i614 = i613 - 1;
                this.toDoubleRange = i614;
                iArr244[i614 - 1] = iArr244[i614] & iArr244[i614 - 1];
                return 0;
            case 278:
                int[] iArr245 = this.FastBitmap$CoordinateSystem;
                int i615 = this.toDoubleRange;
                int i616 = i615 + 1;
                this.toDoubleRange = i616;
                iArr245[i615] = 1;
                int i617 = i616 - 1;
                this.toDoubleRange = i617;
                iArr245[i617 - 1] = iArr245[i617 - 1] << iArr245[i617];
                iArr245[i617 - 1] = -iArr245[i617 - 1];
                return 0;
            case 279:
                int[] iArr246 = this.FastBitmap$CoordinateSystem;
                int i618 = this.toDoubleRange;
                int i619 = i618 + 1;
                this.toDoubleRange = i619;
                iArr246[i618] = 39;
                iArr246[i619 - 1] = -iArr246[i619 - 1];
                int i620 = i619 + 2;
                this.toDoubleRange = i620;
                iArr246[i620 - 1] = iArr246[i620 - 3];
                iArr246[i619] = iArr246[i620 - 4];
                return 0;
            case 280:
                int[] iArr247 = this.FastBitmap$CoordinateSystem;
                int i621 = this.toDoubleRange;
                this.toDoubleRange = i621 + 1;
                iArr247[i621] = 5;
                return 0;
            case 281:
                int[] iArr248 = this.FastBitmap$CoordinateSystem;
                int i622 = this.toDoubleRange;
                this.toDoubleRange = i622 + 1;
                iArr248[i622] = 3;
                return 0;
            case 282:
                int i623 = this.toDoubleRange - 1;
                this.toDoubleRange = i623;
                int[] iArr249 = this.FastBitmap$CoordinateSystem;
                iArr249[i623 - 1] = iArr249[i623 - 1] + iArr249[i623];
                int i624 = i623 + 1;
                this.toDoubleRange = i624;
                iArr249[i623] = 1;
                iArr249[i624 - 1] = -iArr249[i624 - 1];
                return 0;
            case 283:
                int[] iArr250 = this.FastBitmap$CoordinateSystem;
                int i625 = this.toDoubleRange;
                this.toDoubleRange = i625 + 1;
                iArr250[i625] = 60;
                return 0;
            case 284:
                int[] iArr251 = this.FastBitmap$CoordinateSystem;
                int i626 = this.toDoubleRange;
                this.toDoubleRange = i626 + 1;
                iArr251[i626] = 10;
                return 0;
            case 285:
                Object[] objArr30 = this.invokeSuspend;
                int i627 = this.toDoubleRange;
                int i628 = i627 + 1;
                this.toDoubleRange = i628;
                objArr30[i627] = objArr30[11];
                this.toDoubleRange = i628 + 1;
                objArr30[i628] = objArr30[10];
                return 0;
            case 286:
                int[] iArr252 = this.FastBitmap$CoordinateSystem;
                int i629 = this.toDoubleRange;
                this.toDoubleRange = i629 + 1;
                iArr252[i629] = 83;
                return 0;
            case 287:
                int i630 = this.toDoubleRange - 1;
                this.toDoubleRange = i630;
                this.invokeSuspend[i630] = null;
                int i631 = i630 - 1;
                this.toDoubleRange = i631;
                int[] iArr253 = this.FastBitmap$CoordinateSystem;
                iArr253[i631 - 1] = iArr253[i631 - 1] & iArr253[i631];
                int i632 = i631 + 1;
                this.toDoubleRange = i632;
                int i633 = iArr253[i632 - 2];
                iArr253[i631] = i633;
                iArr253[i632 - 2] = iArr253[i632 - 3];
                iArr253[i632 - 3] = iArr253[i632 - 4];
                iArr253[i632 - 4] = i633;
                return 0;
            case 288:
                int[] iArr254 = this.FastBitmap$CoordinateSystem;
                int i634 = this.toDoubleRange;
                int i635 = i634 + 1;
                this.toDoubleRange = i635;
                iArr254[i634] = 79;
                iArr254[i635 - 1] = -iArr254[i635 - 1];
                return 0;
            case 289:
                int[] iArr255 = this.FastBitmap$CoordinateSystem;
                int i636 = this.toDoubleRange;
                int i637 = i636 + 1;
                this.toDoubleRange = i637;
                iArr255[i636] = 109;
                iArr255[i637 - 1] = -iArr255[i637 - 1];
                return 0;
            case 290:
                Object[] objArr31 = this.invokeSuspend;
                int i638 = this.toDoubleRange;
                int i639 = i638 + 1;
                this.toDoubleRange = i639;
                objArr31[i638] = objArr31[10];
                int i640 = i639 + 1;
                this.toDoubleRange = i640;
                objArr31[i639] = objArr31[11];
                this.toDoubleRange = i640 + 1;
                objArr31[i640] = objArr31[12];
                return 0;
            case 291:
                int[] iArr256 = this.FastBitmap$CoordinateSystem;
                int i641 = this.toDoubleRange;
                this.toDoubleRange = i641 + 1;
                iArr256[i641] = 29;
                return 0;
            case BuildConfig.VERSION_CODE /*292*/:
                int[] iArr257 = this.FastBitmap$CoordinateSystem;
                int i642 = this.toDoubleRange;
                int i643 = i642 + 1;
                this.toDoubleRange = i643;
                iArr257[i642] = 69;
                int i644 = i643 + 2;
                this.toDoubleRange = i644;
                iArr257[i644 - 1] = iArr257[i644 - 3];
                iArr257[i643] = iArr257[i644 - 4];
                int i645 = i644 - 1;
                this.toDoubleRange = i645;
                iArr257[i645 - 1] = iArr257[i645] ^ iArr257[i645 - 1];
                return 0;
            case 293:
                int[] iArr258 = this.FastBitmap$CoordinateSystem;
                int i646 = this.toDoubleRange;
                int i647 = i646 + 1;
                this.toDoubleRange = i647;
                iArr258[i646] = 7;
                iArr258[i647 - 1] = -iArr258[i647 - 1];
                int i648 = i647 + 2;
                this.toDoubleRange = i648;
                iArr258[i648 - 1] = iArr258[i648 - 3];
                iArr258[i647] = iArr258[i648 - 4];
                return 0;
            case 294:
                int[] iArr259 = this.FastBitmap$CoordinateSystem;
                int i649 = this.toDoubleRange;
                int i650 = i649 + 1;
                this.toDoubleRange = i650;
                iArr259[i649] = 111;
                iArr259[i650 - 1] = -iArr259[i650 - 1];
                int i651 = i650 + 2;
                this.toDoubleRange = i651;
                iArr259[i651 - 1] = iArr259[i651 - 3];
                iArr259[i650] = iArr259[i651 - 4];
                return 0;
            case 295:
                int i652 = this.toDoubleRange - 1;
                this.toDoubleRange = i652;
                this.invokeSuspend[i652] = null;
                int i653 = i652 - 1;
                this.toDoubleRange = i653;
                int[] iArr260 = this.FastBitmap$CoordinateSystem;
                iArr260[i653 - 1] = iArr260[i653 - 1] & iArr260[i653];
                this.toDoubleRange = i653 + 1;
                iArr260[i653] = 1;
                return 0;
            case 296:
                int[] iArr261 = this.FastBitmap$CoordinateSystem;
                int i654 = this.toDoubleRange;
                int i655 = i654 + 1;
                this.toDoubleRange = i655;
                iArr261[i654] = 57;
                iArr261[i655 - 1] = -iArr261[i655 - 1];
                int i656 = i655 + 2;
                this.toDoubleRange = i656;
                iArr261[i656 - 1] = iArr261[i656 - 3];
                iArr261[i655] = iArr261[i656 - 4];
                return 0;
            case 297:
                int i657 = this.toDoubleRange - 1;
                this.toDoubleRange = i657;
                int[] iArr262 = this.FastBitmap$CoordinateSystem;
                iArr262[i657 - 1] = iArr262[i657 - 1] & iArr262[i657];
                int i658 = i657 - 1;
                this.toDoubleRange = i658;
                iArr262[i658 - 1] = iArr262[i658 - 1] | iArr262[i658];
                this.toDoubleRange = i658 + 1;
                iArr262[i658] = 1;
                return 0;
            case 298:
                int i659 = this.toDoubleRange - 1;
                this.toDoubleRange = i659;
                int[] iArr263 = this.FastBitmap$CoordinateSystem;
                iArr263[i659 - 1] = iArr263[i659 - 1] ^ iArr263[i659];
                iArr263[i659 - 1] = -iArr263[i659 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_STORE_UNKNOWN_ERROR /*299*/:
                int[] iArr264 = this.FastBitmap$CoordinateSystem;
                int i660 = this.toDoubleRange;
                this.toDoubleRange = i660 + 1;
                iArr264[i660] = 24;
                return 0;
            case 300:
                int[] iArr265 = this.FastBitmap$CoordinateSystem;
                int i661 = this.toDoubleRange;
                int i662 = i661 + 1;
                this.toDoubleRange = i662;
                iArr265[i661] = 3;
                int i663 = i662 + 1;
                this.toDoubleRange = i663;
                iArr265[i662] = 2;
                int i664 = i663 - 1;
                this.toDoubleRange = i664;
                iArr265[i664 - 1] = iArr265[i664 - 1] % iArr265[i664];
                return 0;
            case 301:
                int[] iArr266 = this.FastBitmap$CoordinateSystem;
                int i665 = this.toDoubleRange;
                this.toDoubleRange = i665 + 1;
                iArr266[i665] = 50;
                return 0;
            case 302:
                int[] iArr267 = this.FastBitmap$CoordinateSystem;
                int i666 = this.toDoubleRange;
                this.toDoubleRange = i666 + 1;
                iArr267[i666] = 28;
                return 0;
            case 303:
                int[] iArr268 = this.FastBitmap$CoordinateSystem;
                int i667 = this.toDoubleRange;
                int i668 = i667 + 1;
                this.toDoubleRange = i668;
                iArr268[i667] = 11;
                int i669 = i668 + 2;
                this.toDoubleRange = i669;
                iArr268[i669 - 1] = iArr268[i669 - 3];
                iArr268[i668] = iArr268[i669 - 4];
                int i670 = i669 + 2;
                this.toDoubleRange = i670;
                iArr268[i670 - 1] = iArr268[i670 - 3];
                iArr268[i669] = iArr268[i670 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE /*304*/:
                int[] iArr269 = this.FastBitmap$CoordinateSystem;
                int i671 = this.toDoubleRange;
                int i672 = i671 + 1;
                this.toDoubleRange = i672;
                iArr269[i671] = -1;
                int i673 = i672 - 1;
                this.toDoubleRange = i673;
                iArr269[i673 - 1] = iArr269[i673 - 1] ^ iArr269[i673];
                int i674 = i673 - 1;
                this.toDoubleRange = i674;
                iArr269[i674 - 1] = iArr269[i674] ^ iArr269[i674 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE_DATA /*305*/:
                int[] iArr270 = this.FastBitmap$CoordinateSystem;
                int i675 = this.toDoubleRange;
                this.toDoubleRange = i675 + 1;
                iArr270[i675] = 55;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_KEY_NOT_EXISTED /*306*/:
                int[] iArr271 = this.FastBitmap$CoordinateSystem;
                int i676 = this.toDoubleRange;
                int i677 = i676 + 1;
                this.toDoubleRange = i677;
                int i678 = iArr271[i677 - 2];
                iArr271[i676] = i678;
                iArr271[i677 - 2] = iArr271[i677 - 3];
                iArr271[i677 - 3] = iArr271[i677 - 4];
                iArr271[i677 - 4] = i678;
                int i679 = i677 - 1;
                this.toDoubleRange = i679;
                this.invokeSuspend[i679] = null;
                int i680 = i679 - 1;
                this.toDoubleRange = i680;
                iArr271[i680 - 1] = iArr271[i680] | iArr271[i680 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_ILLEGEL_KEY /*307*/:
                int[] iArr272 = this.FastBitmap$CoordinateSystem;
                int i681 = this.toDoubleRange;
                int i682 = i681 + 1;
                this.toDoubleRange = i682;
                iArr272[i681] = 75;
                int i683 = i682 + 2;
                this.toDoubleRange = i683;
                iArr272[i683 - 1] = iArr272[i683 - 3];
                iArr272[i682] = iArr272[i683 - 4];
                int i684 = i683 + 2;
                this.toDoubleRange = i684;
                iArr272[i684 - 1] = iArr272[i684 - 3];
                iArr272[i683] = iArr272[i684 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_NO_MEMORY /*308*/:
                int[] iArr273 = this.FastBitmap$CoordinateSystem;
                int i685 = this.toDoubleRange;
                int i686 = i685 + 1;
                this.toDoubleRange = i686;
                iArr273[i685] = 57;
                int i687 = i686 + 1;
                this.toDoubleRange = i687;
                iArr273[i686] = iArr273[i687 - 2];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_NO_SUCH_INDEX /*309*/:
                int[] iArr274 = this.FastBitmap$CoordinateSystem;
                int i688 = this.toDoubleRange;
                int i689 = i688 + 1;
                this.toDoubleRange = i689;
                iArr274[i688] = 95;
                iArr274[i689 - 1] = -iArr274[i689 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_INVALID_ENCRYPTED_DATA /*310*/:
                int i690 = this.toDoubleRange - 1;
                this.toDoubleRange = i690;
                this.invokeSuspend[i690] = null;
                int[] iArr275 = this.FastBitmap$CoordinateSystem;
                int i691 = i690 + 1;
                this.toDoubleRange = i691;
                iArr275[i690] = iArr275[i691 - 2];
                iArr275[i691 - 1] = -iArr275[i691 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_DECRYPT_MISMATCH_KEY_DATA /*311*/:
                int[] iArr276 = this.FastBitmap$CoordinateSystem;
                int i692 = this.toDoubleRange;
                this.toDoubleRange = i692 + 1;
                iArr276[i692] = 34;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_LOW_VERSION_DATA_FILE /*312*/:
                int[] iArr277 = this.FastBitmap$CoordinateSystem;
                int i693 = this.toDoubleRange;
                int i694 = i693 + 1;
                this.toDoubleRange = i694;
                iArr277[i693] = 21;
                int i695 = i694 + 2;
                this.toDoubleRange = i695;
                iArr277[i695 - 1] = iArr277[i695 - 3];
                iArr277[i694] = iArr277[i695 - 4];
                return 0;
            case 313:
                int[] iArr278 = this.FastBitmap$CoordinateSystem;
                int i696 = this.toDoubleRange;
                this.toDoubleRange = i696 + 1;
                iArr278[i696] = 109;
                return 0;
            case 314:
                int[] iArr279 = this.FastBitmap$CoordinateSystem;
                int i697 = this.toDoubleRange;
                iArr279[i697 - 1] = -iArr279[i697 - 1];
                int i698 = i697 + 2;
                this.toDoubleRange = i698;
                iArr279[i698 - 1] = iArr279[i698 - 3];
                iArr279[i697] = iArr279[i698 - 4];
                int i699 = i698 - 1;
                this.toDoubleRange = i699;
                iArr279[i699 - 1] = iArr279[i699] | iArr279[i699 - 1];
                return 0;
            case 315:
                int i700 = this.toDoubleRange - 1;
                this.toDoubleRange = i700;
                int[] iArr280 = this.FastBitmap$CoordinateSystem;
                iArr280[i700 - 1] = iArr280[i700 - 1] ^ iArr280[i700];
                int i701 = i700 - 1;
                this.toDoubleRange = i701;
                iArr280[i701 - 1] = iArr280[i701 - 1] - iArr280[i701];
                int i702 = i701 + 1;
                this.toDoubleRange = i702;
                iArr280[i701] = iArr280[i702 - 2];
                return 0;
            case 316:
                int[] iArr281 = this.FastBitmap$CoordinateSystem;
                int i703 = this.toDoubleRange;
                this.toDoubleRange = i703 + 1;
                iArr281[i703] = 71;
                return 0;
            case 317:
                int[] iArr282 = this.FastBitmap$CoordinateSystem;
                int i704 = this.toDoubleRange;
                int i705 = i704 + 2;
                this.toDoubleRange = i705;
                iArr282[i705 - 1] = iArr282[i705 - 3];
                iArr282[i704] = iArr282[i705 - 4];
                int i706 = i705 + 2;
                this.toDoubleRange = i706;
                iArr282[i706 - 1] = iArr282[i706 - 3];
                iArr282[i705] = iArr282[i706 - 4];
                return 0;
            case 318:
                int i707 = this.toDoubleRange - 1;
                this.toDoubleRange = i707;
                int[] iArr283 = this.FastBitmap$CoordinateSystem;
                iArr283[i707 - 1] = iArr283[i707 - 1] << iArr283[i707];
                int i708 = i707 - 1;
                this.toDoubleRange = i708;
                iArr283[i708 - 1] = iArr283[i708 - 1] + iArr283[i708];
                int i709 = i708 + 1;
                this.toDoubleRange = i709;
                iArr283[i708] = iArr283[i709 - 2];
                return 0;
            case 319:
                int[] iArr284 = this.FastBitmap$CoordinateSystem;
                int i710 = this.toDoubleRange;
                int i711 = i710 + 1;
                this.toDoubleRange = i711;
                iArr284[i710] = 105;
                int i712 = i711 - 1;
                this.toDoubleRange = i712;
                iArr284[i712 - 1] = iArr284[i712 - 1] + iArr284[i712];
                int i713 = i712 + 1;
                this.toDoubleRange = i713;
                iArr284[i712] = iArr284[i713 - 2];
                return 0;
            case 320:
                Object[] objArr32 = this.invokeSuspend;
                int i714 = this.toDoubleRange;
                int i715 = i714 + 1;
                this.toDoubleRange = i715;
                objArr32[i714] = objArr32[i715 - 2];
                int i716 = i715 - 1;
                this.toDoubleRange = i716;
                Object obj15 = objArr32[i716];
                objArr32[i716] = null;
                objArr32[14] = obj15;
                return 0;
            case 321:
                Object[] objArr33 = this.invokeSuspend;
                int i717 = this.toDoubleRange;
                int i718 = i717 + 1;
                this.toDoubleRange = i718;
                objArr33[i717] = objArr33[14];
                int[] iArr285 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i718 + 1;
                iArr285[i718] = 0;
                return 0;
            case 322:
                int[] iArr286 = this.FastBitmap$CoordinateSystem;
                int i719 = this.toDoubleRange;
                int i720 = i719 + 1;
                this.toDoubleRange = i720;
                iArr286[i719] = 101;
                int i721 = i720 + 2;
                this.toDoubleRange = i721;
                iArr286[i721 - 1] = iArr286[i721 - 3];
                iArr286[i720] = iArr286[i721 - 4];
                return 0;
            case 323:
                int[] iArr287 = this.FastBitmap$CoordinateSystem;
                int i722 = this.toDoubleRange;
                this.toDoubleRange = i722 + 1;
                iArr287[i722] = 59;
                return 0;
            case 324:
                int[] iArr288 = this.FastBitmap$CoordinateSystem;
                int i723 = this.toDoubleRange;
                iArr288[i723 - 1] = -iArr288[i723 - 1];
                int i724 = i723 - 1;
                this.toDoubleRange = i724;
                iArr288[i724 - 1] = iArr288[i724 - 1] ^ iArr288[i724];
                int i725 = i724 + 2;
                this.toDoubleRange = i725;
                iArr288[i725 - 1] = iArr288[i725 - 3];
                iArr288[i724] = iArr288[i725 - 4];
                return 0;
            case 325:
                int[] iArr289 = this.FastBitmap$CoordinateSystem;
                int i726 = this.toDoubleRange;
                int i727 = i726 + 1;
                this.toDoubleRange = i727;
                iArr289[i726] = 73;
                int i728 = i727 + 2;
                this.toDoubleRange = i728;
                iArr289[i728 - 1] = iArr289[i728 - 3];
                iArr289[i727] = iArr289[i728 - 4];
                return 0;
            case 326:
                int[] iArr290 = this.FastBitmap$CoordinateSystem;
                int i729 = this.toDoubleRange;
                int i730 = i729 + 1;
                this.toDoubleRange = i730;
                iArr290[i729] = 27;
                iArr290[i730 - 1] = -iArr290[i730 - 1];
                int i731 = i730 + 2;
                this.toDoubleRange = i731;
                iArr290[i731 - 1] = iArr290[i731 - 3];
                iArr290[i730] = iArr290[i731 - 4];
                return 0;
            case 327:
                int i732 = this.toDoubleRange - 1;
                this.toDoubleRange = i732;
                int[] iArr291 = this.FastBitmap$CoordinateSystem;
                iArr291[i732 - 1] = iArr291[i732 - 1] & iArr291[i732];
                int i733 = i732 - 1;
                this.toDoubleRange = i733;
                iArr291[i733 - 1] = iArr291[i733 - 1] | iArr291[i733];
                iArr291[i733 - 1] = -iArr291[i733 - 1];
                return 0;
            case 328:
                int i734 = this.toDoubleRange - 1;
                this.toDoubleRange = i734;
                Object[] objArr34 = this.invokeSuspend;
                Object obj16 = objArr34[i734];
                objArr34[i734] = null;
                objArr34[14] = obj16;
                this.toDoubleRange = i734 + 1;
                objArr34[i734] = objArr34[15];
                return 0;
            case 329:
                int[] iArr292 = this.FastBitmap$CoordinateSystem;
                int i735 = this.toDoubleRange;
                int i736 = i735 + 1;
                this.toDoubleRange = i736;
                iArr292[i735] = 5;
                int i737 = i736 - 1;
                this.toDoubleRange = i737;
                iArr292[i737 - 1] = iArr292[i737 - 1] * iArr292[i737];
                return 0;
            case 330:
                int[] iArr293 = this.FastBitmap$CoordinateSystem;
                int i738 = this.toDoubleRange;
                int i739 = i738 + 1;
                this.toDoubleRange = i739;
                iArr293[i738] = 57;
                int i740 = i739 + 2;
                this.toDoubleRange = i740;
                iArr293[i740 - 1] = iArr293[i740 - 3];
                iArr293[i739] = iArr293[i740 - 4];
                return 0;
            case 331:
                int[] iArr294 = this.FastBitmap$CoordinateSystem;
                int i741 = this.toDoubleRange;
                int i742 = i741 + 1;
                this.toDoubleRange = i742;
                iArr294[i741] = 21;
                iArr294[i742 - 1] = -iArr294[i742 - 1];
                int i743 = i742 + 1;
                this.toDoubleRange = i743;
                iArr294[i742] = iArr294[i743 - 2];
                return 0;
            case 332:
                int[] iArr295 = this.FastBitmap$CoordinateSystem;
                int i744 = this.toDoubleRange;
                int i745 = i744 + 1;
                this.toDoubleRange = i745;
                iArr295[i744] = 115;
                int i746 = i745 + 2;
                this.toDoubleRange = i746;
                iArr295[i746 - 1] = iArr295[i746 - 3];
                iArr295[i745] = iArr295[i746 - 4];
                int i747 = i746 + 2;
                this.toDoubleRange = i747;
                iArr295[i747 - 1] = iArr295[i747 - 3];
                iArr295[i746] = iArr295[i747 - 4];
                return 0;
            case 333:
                int[] iArr296 = this.FastBitmap$CoordinateSystem;
                int i748 = this.toDoubleRange;
                this.toDoubleRange = i748 + 1;
                iArr296[i748] = 73;
                return 0;
            case 334:
                int[] iArr297 = this.FastBitmap$CoordinateSystem;
                int i749 = this.toDoubleRange;
                int i750 = i749 + 1;
                this.toDoubleRange = i750;
                iArr297[i749] = 33;
                iArr297[i750 - 1] = -iArr297[i750 - 1];
                return 0;
            case 335:
                int i751 = this.toDoubleRange - 1;
                this.toDoubleRange = i751;
                Object[] objArr35 = this.invokeSuspend;
                Object obj17 = objArr35[i751];
                objArr35[i751] = null;
                this.setMax = obj17 != null ? 1 : 0;
                return 0;
            case 336:
                int i752 = this.toDoubleRange - 1;
                this.toDoubleRange = i752;
                Object[] objArr36 = this.invokeSuspend;
                Object obj18 = objArr36[i752];
                objArr36[i752] = null;
                objArr36[11] = obj18;
                this.toDoubleRange = i752 + 1;
                objArr36[i752] = objArr36[12];
                return 0;
            case 337:
                int i753 = this.toDoubleRange - 1;
                this.toDoubleRange = i753;
                Object[] objArr37 = this.invokeSuspend;
                Object obj19 = objArr37[i753];
                objArr37[i753] = null;
                objArr37[15] = obj19;
                return 0;
            case 338:
                int i754 = this.toDoubleRange - 1;
                this.toDoubleRange = i754;
                int[] iArr298 = this.FastBitmap$CoordinateSystem;
                iArr298[i754 - 1] = iArr298[i754 - 1] & iArr298[i754];
                int i755 = i754 - 1;
                this.toDoubleRange = i755;
                iArr298[i755 - 1] = iArr298[i755 - 1] | iArr298[i755];
                int i756 = iArr298[i755 - 1];
                iArr298[i755 - 1] = iArr298[i755 - 2];
                iArr298[i755 - 2] = i756;
                return 0;
            case 339:
                int i757 = this.toDoubleRange - 1;
                this.toDoubleRange = i757;
                int[] iArr299 = this.FastBitmap$CoordinateSystem;
                iArr299[i757 - 1] = iArr299[i757 - 1] ^ iArr299[i757];
                int i758 = i757 - 1;
                this.toDoubleRange = i758;
                iArr299[i758 - 1] = iArr299[i758 - 1] - iArr299[i758];
                this.toDoubleRange = i758 + 1;
                iArr299[i758] = 1;
                return 0;
            case 340:
                int[] iArr300 = this.FastBitmap$CoordinateSystem;
                int i759 = this.toDoubleRange;
                this.toDoubleRange = i759 + 1;
                iArr300[i759] = 38;
                return 0;
            case 341:
                int[] iArr301 = this.FastBitmap$CoordinateSystem;
                int i760 = this.toDoubleRange;
                int i761 = i760 + 1;
                this.toDoubleRange = i761;
                iArr301[i760] = 115;
                int i762 = i761 + 2;
                this.toDoubleRange = i762;
                iArr301[i762 - 1] = iArr301[i762 - 3];
                iArr301[i761] = iArr301[i762 - 4];
                return 0;
            case 342:
                int i763 = this.toDoubleRange - 1;
                this.toDoubleRange = i763;
                int[] iArr302 = this.FastBitmap$CoordinateSystem;
                iArr302[i763 - 1] = iArr302[i763 - 1] | iArr302[i763];
                int i764 = i763 + 1;
                this.toDoubleRange = i764;
                iArr302[i763] = iArr302[i764 - 2];
                iArr302[i764 - 1] = -iArr302[i764 - 1];
                return 0;
            case 343:
                int[] iArr303 = this.FastBitmap$CoordinateSystem;
                int i765 = this.toDoubleRange;
                this.toDoubleRange = i765 + 1;
                iArr303[i765] = 81;
                return 0;
            case 344:
                int[] iArr304 = this.FastBitmap$CoordinateSystem;
                int i766 = this.toDoubleRange;
                this.toDoubleRange = i766 + 1;
                iArr304[i766] = 70;
                return 0;
            case 345:
                int[] iArr305 = this.FastBitmap$CoordinateSystem;
                int i767 = this.toDoubleRange;
                int i768 = i767 + 1;
                this.toDoubleRange = i768;
                iArr305[i767] = 63;
                int i769 = i768 + 1;
                this.toDoubleRange = i769;
                iArr305[i768] = iArr305[i769 - 2];
                this.toDoubleRange = i769 + 1;
                iArr305[i769] = -1;
                return 0;
            case 346:
                int i770 = this.toDoubleRange - 1;
                this.toDoubleRange = i770;
                int[] iArr306 = this.FastBitmap$CoordinateSystem;
                iArr306[i770 - 1] = iArr306[i770 - 1] | iArr306[i770];
                int i771 = iArr306[i770 - 1];
                iArr306[i770 - 1] = iArr306[i770 - 2];
                iArr306[i770 - 2] = i771;
                return 0;
            case 347:
                int i772 = this.toDoubleRange - 1;
                this.toDoubleRange = i772;
                int[] iArr307 = this.FastBitmap$CoordinateSystem;
                iArr307[i772 - 1] = iArr307[i772 - 1] & iArr307[i772];
                this.toDoubleRange = i772 + 1;
                iArr307[i772] = -1;
                return 0;
            case 348:
                Object[] objArr38 = this.invokeSuspend;
                int i773 = this.toDoubleRange;
                int i774 = i773 + 1;
                this.toDoubleRange = i774;
                objArr38[i773] = objArr38[11];
                int i775 = i774 + 1;
                this.toDoubleRange = i775;
                objArr38[i774] = objArr38[12];
                this.toDoubleRange = i775 + 1;
                objArr38[i775] = objArr38[13];
                return 0;
            case 349:
                int[] iArr308 = this.FastBitmap$CoordinateSystem;
                int i776 = this.toDoubleRange;
                int i777 = i776 + 1;
                this.toDoubleRange = i777;
                iArr308[i776] = 37;
                this.toDoubleRange = i777 + 1;
                iArr308[i777] = 0;
                return 0;
            case 350:
                int[] iArr309 = this.FastBitmap$CoordinateSystem;
                int i778 = this.toDoubleRange;
                int i779 = i778 + 1;
                this.toDoubleRange = i779;
                iArr309[i778] = 79;
                int i780 = i779 + 2;
                this.toDoubleRange = i780;
                iArr309[i780 - 1] = iArr309[i780 - 3];
                iArr309[i779] = iArr309[i780 - 4];
                int i781 = i780 + 2;
                this.toDoubleRange = i781;
                iArr309[i781 - 1] = iArr309[i781 - 3];
                iArr309[i780] = iArr309[i781 - 4];
                return 0;
            case 351:
                int[] iArr310 = this.FastBitmap$CoordinateSystem;
                int i782 = this.toDoubleRange;
                this.toDoubleRange = i782 + 1;
                iArr310[i782] = 123;
                return 0;
            case 352:
                int[] iArr311 = this.FastBitmap$CoordinateSystem;
                int i783 = this.toDoubleRange;
                int i784 = i783 + 1;
                this.toDoubleRange = i784;
                iArr311[i783] = 89;
                this.toDoubleRange = i784 + 1;
                iArr311[i784] = 0;
                return 0;
            case 353:
                int[] iArr312 = this.FastBitmap$CoordinateSystem;
                int i785 = this.toDoubleRange;
                int i786 = i785 + 1;
                this.toDoubleRange = i786;
                iArr312[i785] = 15;
                int i787 = i786 + 1;
                this.toDoubleRange = i787;
                iArr312[i786] = iArr312[i787 - 2];
                this.toDoubleRange = i787 + 1;
                iArr312[i787] = -1;
                return 0;
            case 354:
                int i788 = this.toDoubleRange - 1;
                this.toDoubleRange = i788;
                int[] iArr313 = this.FastBitmap$CoordinateSystem;
                iArr313[i788 - 1] = iArr313[i788 - 1] & iArr313[i788];
                int i789 = iArr313[i788 - 1];
                iArr313[i788 - 1] = iArr313[i788 - 2];
                iArr313[i788 - 2] = i789;
                return 0;
            case 355:
                int[] iArr314 = this.FastBitmap$CoordinateSystem;
                int i790 = this.toDoubleRange;
                iArr314[i790 - 1] = -iArr314[i790 - 1];
                int i791 = i790 + 1;
                this.toDoubleRange = i791;
                iArr314[i790] = iArr314[i791 - 2];
                iArr314[i791 - 1] = -iArr314[i791 - 1];
                return 0;
            case 356:
                int[] iArr315 = this.FastBitmap$CoordinateSystem;
                int i792 = this.toDoubleRange;
                this.toDoubleRange = i792 + 1;
                iArr315[i792] = 30;
                return 0;
            case 357:
                int[] iArr316 = this.FastBitmap$CoordinateSystem;
                int i793 = this.toDoubleRange;
                int i794 = i793 + 1;
                this.toDoubleRange = i794;
                iArr316[i793] = 66;
                int i795 = i794 + 1;
                this.toDoubleRange = i795;
                iArr316[i794] = 0;
                int i796 = i795 - 1;
                this.toDoubleRange = i796;
                iArr316[i796 - 1] = iArr316[i796 - 1] / iArr316[i796];
                return 0;
            case 358:
                int[] iArr317 = this.FastBitmap$CoordinateSystem;
                int i797 = this.toDoubleRange;
                int i798 = i797 + 1;
                this.toDoubleRange = i798;
                iArr317[i797] = 63;
                iArr317[i798 - 1] = -iArr317[i798 - 1];
                return 0;
            case 359:
                int[] iArr318 = this.FastBitmap$CoordinateSystem;
                int i799 = this.toDoubleRange;
                int i800 = i799 + 1;
                this.toDoubleRange = i800;
                iArr318[i799] = 83;
                int i801 = i800 + 2;
                this.toDoubleRange = i801;
                iArr318[i801 - 1] = iArr318[i801 - 3];
                iArr318[i800] = iArr318[i801 - 4];
                int i802 = i801 - 1;
                this.toDoubleRange = i802;
                iArr318[i802 - 1] = iArr318[i802] ^ iArr318[i802 - 1];
                return 0;
            case AUScreenAdaptTool.WIDTH_BASE /*360*/:
                int[] iArr319 = this.FastBitmap$CoordinateSystem;
                int i803 = this.toDoubleRange;
                this.toDoubleRange = i803 + 1;
                iArr319[i803] = 92;
                return 0;
            case 361:
                int[] iArr320 = this.FastBitmap$CoordinateSystem;
                int i804 = this.toDoubleRange;
                int i805 = i804 + 1;
                this.toDoubleRange = i805;
                iArr320[i804] = 119;
                int i806 = i805 + 2;
                this.toDoubleRange = i806;
                iArr320[i806 - 1] = iArr320[i806 - 3];
                iArr320[i805] = iArr320[i806 - 4];
                int i807 = i806 + 2;
                this.toDoubleRange = i807;
                iArr320[i807 - 1] = iArr320[i807 - 3];
                iArr320[i806] = iArr320[i807 - 4];
                return 0;
            case 362:
                int[] iArr321 = this.FastBitmap$CoordinateSystem;
                int i808 = this.toDoubleRange;
                this.toDoubleRange = i808 + 1;
                iArr321[i808] = 69;
                return 0;
            case 363:
                this.setMax = this.FastBitmap$CoordinateSystem[this.toDoubleRange - 1];
                return 0;
            case 364:
                int[] iArr322 = this.FastBitmap$CoordinateSystem;
                int i809 = this.toDoubleRange;
                this.toDoubleRange = i809 + 1;
                iArr322[i809] = 105;
                return 0;
            case 365:
                int i810 = this.toDoubleRange - 1;
                this.toDoubleRange = i810;
                int[] iArr323 = this.FastBitmap$CoordinateSystem;
                iArr323[i810 - 1] = iArr323[i810 - 1] & iArr323[i810];
                int i811 = i810 - 1;
                this.toDoubleRange = i811;
                iArr323[i811 - 1] = iArr323[i811 - 1] | iArr323[i811];
                int i812 = i811 - 1;
                this.toDoubleRange = i812;
                iArr323[i812 - 1] = iArr323[i812 - 1] + iArr323[i812];
                return 0;
            case 366:
                int[] iArr324 = this.FastBitmap$CoordinateSystem;
                int i813 = this.toDoubleRange;
                int i814 = i813 + 1;
                this.toDoubleRange = i814;
                iArr324[i813] = 5;
                int i815 = i814 + 1;
                this.toDoubleRange = i815;
                iArr324[i814] = iArr324[i815 - 2];
                this.toDoubleRange = i815 + 1;
                iArr324[i815] = -1;
                return 0;
            case 367:
                int[] iArr325 = this.FastBitmap$CoordinateSystem;
                int i816 = this.toDoubleRange;
                int i817 = i816 + 1;
                this.toDoubleRange = i817;
                iArr325[i816] = 53;
                int i818 = i817 + 2;
                this.toDoubleRange = i818;
                iArr325[i818 - 1] = iArr325[i818 - 3];
                iArr325[i817] = iArr325[i818 - 4];
                int i819 = i818 + 2;
                this.toDoubleRange = i819;
                iArr325[i819 - 1] = iArr325[i819 - 3];
                iArr325[i818] = iArr325[i819 - 4];
                return 0;
            case 368:
                int i820 = this.toDoubleRange - 1;
                this.toDoubleRange = i820;
                int[] iArr326 = this.FastBitmap$CoordinateSystem;
                iArr326[i820 - 1] = iArr326[i820 - 1] | iArr326[i820];
                int i821 = i820 - 1;
                this.toDoubleRange = i821;
                iArr326[i821 - 1] = iArr326[i821 - 1] & iArr326[i821];
                iArr326[i821 - 1] = -iArr326[i821 - 1];
                return 0;
            case 369:
                int[] iArr327 = this.FastBitmap$CoordinateSystem;
                int i822 = this.toDoubleRange;
                int i823 = i822 + 1;
                this.toDoubleRange = i823;
                iArr327[i822] = 61;
                iArr327[i823 - 1] = -iArr327[i823 - 1];
                return 0;
            case 370:
                int i824 = this.toDoubleRange - 1;
                this.toDoubleRange = i824;
                this.invokeSuspend[i824] = null;
                int i825 = i824 - 1;
                this.toDoubleRange = i825;
                int[] iArr328 = this.FastBitmap$CoordinateSystem;
                iArr328[i825 - 1] = iArr328[i825 - 1] ^ iArr328[i825];
                int i826 = i825 - 1;
                this.toDoubleRange = i826;
                iArr328[i826 - 1] = iArr328[i826 - 1] - iArr328[i826];
                return 0;
            case 371:
                int i827 = this.toDoubleRange - 1;
                this.toDoubleRange = i827;
                int[] iArr329 = this.FastBitmap$CoordinateSystem;
                iArr329[i827 - 1] = iArr329[i827 - 1] ^ iArr329[i827];
                int i828 = i827 - 1;
                this.toDoubleRange = i828;
                iArr329[i828 - 1] = iArr329[i828 - 1] & iArr329[i828];
                int i829 = i828 - 1;
                this.toDoubleRange = i829;
                iArr329[i829 - 1] = iArr329[i829] | iArr329[i829 - 1];
                return 0;
            case 372:
                int[] iArr330 = this.FastBitmap$CoordinateSystem;
                int i830 = this.toDoubleRange;
                int i831 = i830 + 1;
                this.toDoubleRange = i831;
                iArr330[i830] = 35;
                int i832 = i831 + 1;
                this.toDoubleRange = i832;
                iArr330[i831] = 0;
                int i833 = i832 - 1;
                this.toDoubleRange = i833;
                iArr330[i833 - 1] = iArr330[i833 - 1] / iArr330[i833];
                return 0;
            case 373:
                int i834 = this.toDoubleRange - 1;
                this.toDoubleRange = i834;
                this.invokeSuspend[i834] = null;
                int[] iArr331 = this.FastBitmap$CoordinateSystem;
                int i835 = i834 + 2;
                this.toDoubleRange = i835;
                iArr331[i835 - 1] = iArr331[i835 - 3];
                iArr331[i834] = iArr331[i835 - 4];
                int i836 = i835 - 1;
                this.toDoubleRange = i836;
                iArr331[i836 - 1] = iArr331[i836] ^ iArr331[i836 - 1];
                return 0;
            case 374:
                int[] iArr332 = this.FastBitmap$CoordinateSystem;
                int i837 = this.toDoubleRange;
                int i838 = i837 + 2;
                this.toDoubleRange = i838;
                iArr332[i838 - 1] = iArr332[i838 - 3];
                iArr332[i837] = iArr332[i838 - 4];
                int i839 = i838 + 2;
                this.toDoubleRange = i839;
                iArr332[i839 - 1] = iArr332[i839 - 3];
                iArr332[i838] = iArr332[i839 - 4];
                int i840 = i839 - 1;
                this.toDoubleRange = i840;
                iArr332[i840 - 1] = iArr332[i840] ^ iArr332[i840 - 1];
                return 0;
            case 375:
                int[] iArr333 = this.FastBitmap$CoordinateSystem;
                int i841 = this.toDoubleRange;
                this.toDoubleRange = i841 + 1;
                iArr333[i841] = 1;
                return 0;
            case 376:
                int[] iArr334 = this.FastBitmap$CoordinateSystem;
                int i842 = this.toDoubleRange;
                iArr334[i842 - 1] = -iArr334[i842 - 1];
                int i843 = i842 - 1;
                this.toDoubleRange = i843;
                iArr334[i843 - 1] = iArr334[i843 - 1] | iArr334[i843];
                iArr334[i843 - 1] = -iArr334[i843 - 1];
                return 0;
            case 377:
                int[] iArr335 = this.FastBitmap$CoordinateSystem;
                int i844 = this.toDoubleRange;
                this.toDoubleRange = i844 + 1;
                iArr335[i844] = 91;
                return 0;
            case 378:
                int[] iArr336 = this.FastBitmap$CoordinateSystem;
                int i845 = this.toDoubleRange;
                int i846 = i845 + 1;
                this.toDoubleRange = i846;
                iArr336[i845] = 43;
                this.toDoubleRange = i846 + 1;
                iArr336[i846] = 0;
                return 0;
            case 379:
                int[] iArr337 = this.FastBitmap$CoordinateSystem;
                int i847 = this.toDoubleRange;
                int i848 = i847 + 1;
                this.toDoubleRange = i848;
                iArr337[i847] = 119;
                iArr337[i848 - 1] = -iArr337[i848 - 1];
                return 0;
            case 380:
                int[] iArr338 = this.FastBitmap$CoordinateSystem;
                int i849 = this.toDoubleRange;
                this.toDoubleRange = i849 + 1;
                iArr338[i849] = 90;
                return 0;
            case 381:
                int[] iArr339 = this.FastBitmap$CoordinateSystem;
                int i850 = this.toDoubleRange;
                int i851 = i850 + 1;
                this.toDoubleRange = i851;
                iArr339[i850] = 31;
                iArr339[i851 - 1] = -iArr339[i851 - 1];
                int i852 = i851 + 1;
                this.toDoubleRange = i852;
                iArr339[i851] = iArr339[i852 - 2];
                return 0;
            case 382:
                int[] iArr340 = this.FastBitmap$CoordinateSystem;
                int i853 = this.toDoubleRange;
                int i854 = i853 + 1;
                this.toDoubleRange = i854;
                iArr340[i853] = 89;
                iArr340[i854 - 1] = -iArr340[i854 - 1];
                return 0;
            case 383:
                Object[] objArr39 = this.invokeSuspend;
                int i855 = this.toDoubleRange;
                int i856 = i855 + 1;
                this.toDoubleRange = i856;
                objArr39[i855] = objArr39[10];
                int[] iArr341 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i856 + 1;
                iArr341[i856] = iArr341[11];
                return 0;
            case 384:
                int[] iArr342 = this.FastBitmap$CoordinateSystem;
                int i857 = this.toDoubleRange;
                this.toDoubleRange = i857 + 1;
                iArr342[i857] = 63;
                return 0;
            case 385:
                int[] iArr343 = this.FastBitmap$CoordinateSystem;
                int i858 = this.toDoubleRange;
                this.toDoubleRange = i858 + 1;
                iArr343[i858] = 64;
                return 0;
            case 386:
                int i859 = this.toDoubleRange - 1;
                this.toDoubleRange = i859;
                int[] iArr344 = this.FastBitmap$CoordinateSystem;
                iArr344[i859 - 1] = iArr344[i859 - 1] & iArr344[i859];
                int i860 = i859 - 1;
                this.toDoubleRange = i860;
                iArr344[i860 - 1] = iArr344[i860 - 1] | iArr344[i860];
                int i861 = i860 + 1;
                this.toDoubleRange = i861;
                iArr344[i860] = iArr344[i861 - 2];
                return 0;
            case 387:
                int[] iArr345 = this.FastBitmap$CoordinateSystem;
                int i862 = this.toDoubleRange;
                int i863 = iArr345[i862 - 1];
                iArr345[i862 - 1] = iArr345[i862 - 2];
                iArr345[i862 - 2] = i863;
                int i864 = i862 - 1;
                this.toDoubleRange = i864;
                this.invokeSuspend[i864] = null;
                int i865 = i864 + 1;
                this.toDoubleRange = i865;
                iArr345[i864] = iArr345[i865 - 2];
                return 0;
            case 388:
                int[] iArr346 = this.FastBitmap$CoordinateSystem;
                int i866 = this.toDoubleRange;
                this.toDoubleRange = i866 + 1;
                iArr346[i866] = 111;
                return 0;
            case 389:
                int[] iArr347 = this.FastBitmap$CoordinateSystem;
                int i867 = this.toDoubleRange;
                int i868 = i867 + 1;
                this.toDoubleRange = i868;
                iArr347[i867] = 73;
                int i869 = i868 + 2;
                this.toDoubleRange = i869;
                iArr347[i869 - 1] = iArr347[i869 - 3];
                iArr347[i868] = iArr347[i869 - 4];
                int i870 = i869 + 2;
                this.toDoubleRange = i870;
                iArr347[i870 - 1] = iArr347[i870 - 3];
                iArr347[i869] = iArr347[i870 - 4];
                return 0;
            case 390:
                int i871 = this.toDoubleRange - 1;
                this.toDoubleRange = i871;
                int[] iArr348 = this.FastBitmap$CoordinateSystem;
                iArr348[i871 - 1] = iArr348[i871 - 1] | iArr348[i871];
                int i872 = i871 + 2;
                this.toDoubleRange = i872;
                iArr348[i872 - 1] = iArr348[i872 - 3];
                iArr348[i871] = iArr348[i872 - 4];
                return 0;
            case 391:
                int[] iArr349 = this.FastBitmap$CoordinateSystem;
                int i873 = this.toDoubleRange;
                this.toDoubleRange = i873 + 1;
                iArr349[i873] = 99;
                return 0;
            case 392:
                int[] iArr350 = this.FastBitmap$CoordinateSystem;
                int i874 = this.toDoubleRange;
                this.toDoubleRange = i874 + 1;
                iArr350[i874] = 12;
                return 0;
            case 393:
                int[] iArr351 = this.FastBitmap$CoordinateSystem;
                int i875 = this.toDoubleRange;
                this.toDoubleRange = i875 + 1;
                iArr351[i875] = 87;
                return 0;
            case 394:
                int[] iArr352 = this.FastBitmap$CoordinateSystem;
                int i876 = this.toDoubleRange;
                int i877 = iArr352[i876 - 1];
                iArr352[i876 - 1] = iArr352[i876 - 2];
                iArr352[i876 - 2] = i877;
                int i878 = i876 - 1;
                this.toDoubleRange = i878;
                this.invokeSuspend[i878] = null;
                int i879 = i878 + 2;
                this.toDoubleRange = i879;
                iArr352[i879 - 1] = iArr352[i879 - 3];
                iArr352[i878] = iArr352[i879 - 4];
                return 0;
            case 395:
                int[] iArr353 = this.FastBitmap$CoordinateSystem;
                int i880 = this.toDoubleRange;
                this.toDoubleRange = i880 + 1;
                iArr353[i880] = 15;
                return 0;
            case 396:
                int[] iArr354 = this.FastBitmap$CoordinateSystem;
                int i881 = this.toDoubleRange;
                int i882 = i881 + 1;
                this.toDoubleRange = i882;
                iArr354[i881] = 43;
                int i883 = i882 + 1;
                this.toDoubleRange = i883;
                iArr354[i882] = iArr354[i883 - 2];
                this.toDoubleRange = i883 + 1;
                iArr354[i883] = -1;
                return 0;
            default:
                return i;
        }
        return 0;
    }

    /* renamed from: o.GyroscopeSensorService$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<VerifyNumberFragment> {
        @InjectedFieldSignature("id.dana.onboarding.verify.VerifyNumberFragment.dynamicUrlWrapper")
        public static void setMin(VerifyNumberFragment verifyNumberFragment, getShortName getshortname) {
            verifyNumberFragment.dynamicUrlWrapper = getshortname;
        }

        @InjectedFieldSignature("id.dana.onboarding.verify.VerifyNumberFragment.permissionStatePresenter")
        public static void getMax(VerifyNumberFragment verifyNumberFragment, ViewPager2.OffscreenPageLimit.length length) {
            verifyNumberFragment.permissionStatePresenter = length;
        }

        @InjectedFieldSignature("id.dana.onboarding.verify.VerifyNumberFragment.locationPermissionSubject")
        public static void getMax(VerifyNumberFragment verifyNumberFragment, isAlipayApp isalipayapp) {
            verifyNumberFragment.locationPermissionSubject = isalipayapp;
        }

        @InjectedFieldSignature("id.dana.onboarding.verify.VerifyNumberFragment.verifyPresenter")
        public static void getMax(VerifyNumberFragment verifyNumberFragment, CompassSensorService.length length) {
            verifyNumberFragment.verifyPresenter = length;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H&J\u0006\u0010\u0017\u001a\u00020\u0013R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@BX.¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lid/dana/onboarding/view/BaseSimpleView;", "", "()V", "<set-?>", "Landroid/content/Context;", "context", "getContext", "()Landroid/content/Context;", "unbinder", "Lbutterknife/Unbinder;", "Landroid/view/View;", "view", "getView", "()Landroid/view/View;", "getLayout", "", "getTitle", "", "inflateView", "", "parent", "Landroid/view/ViewGroup;", "init", "unbind", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public abstract class SensorChangedListener {
        public Context equals;
        public View toFloatRange;
        public Unbinder toIntRange;

        public abstract void getMin();

        public abstract int setMax();

        @Nullable
        public abstract String setMin();

        public final void length(@NotNull Context context, @NotNull ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            this.equals = context;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(setMax(), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…tLayout(), parent, false)");
            this.toFloatRange = inflate;
            if (inflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            this.toIntRange = ButterKnife.setMax((Object) this, inflate);
            getMin();
        }
    }
}
