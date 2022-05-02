package o;

import com.alibaba.griver.image.framework.utils.FileUtils;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.iap.android.aplog.util.zip.LZMA_Base;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.savings.activity.SavingsActivity;
import net.sqlcipher.database.SQLiteDatabase;

public class setLayoutDirection {
    private final int[] FastBitmap$CoordinateSystem;
    public Object IsOverlapping;
    private final Object[] Mean$Arithmetic;
    public float equals;
    public long getMax;
    public long getMin;
    private final float[] hashCode;
    public Object isInside;
    public int length;
    public int setMax;
    public float setMin;
    private int toDoubleRange;
    public double toFloatRange;
    public double toIntRange;
    private int toString;
    private final double[] valueOf;
    private final long[] values;

    public setLayoutDirection(Object obj) {
        this.FastBitmap$CoordinateSystem = new int[15];
        this.values = new long[15];
        this.hashCode = new float[15];
        this.valueOf = new double[15];
        Object[] objArr = new Object[15];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        this.toDoubleRange = 0;
        this.toString = -1;
    }

    public setLayoutDirection(Object obj, int i) {
        int[] iArr = new int[15];
        this.FastBitmap$CoordinateSystem = iArr;
        this.values = new long[15];
        this.hashCode = new float[15];
        this.valueOf = new double[15];
        Object[] objArr = new Object[15];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        iArr[10] = i;
        this.toDoubleRange = 0;
        this.toString = -1;
    }

    public setLayoutDirection(Object obj, Object obj2) {
        this.FastBitmap$CoordinateSystem = new int[15];
        this.values = new long[15];
        this.hashCode = new float[15];
        this.valueOf = new double[15];
        Object[] objArr = new Object[15];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        this.toDoubleRange = 0;
        this.toString = -1;
    }

    public setLayoutDirection(Object obj, Object obj2, Object obj3, Object obj4) {
        this.FastBitmap$CoordinateSystem = new int[15];
        this.values = new long[15];
        this.hashCode = new float[15];
        this.valueOf = new double[15];
        Object[] objArr = new Object[15];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        objArr[12] = obj4;
        this.toDoubleRange = 0;
        this.toString = -1;
    }

    public setLayoutDirection(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.FastBitmap$CoordinateSystem = new int[15];
        this.values = new long[15];
        this.hashCode = new float[15];
        this.valueOf = new double[15];
        Object[] objArr = new Object[15];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        objArr[12] = obj4;
        objArr[13] = obj5;
        objArr[14] = obj6;
        this.toDoubleRange = 0;
        this.toString = -1;
    }

    public int getMax(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.FastBitmap$CoordinateSystem;
                int i2 = this.toDoubleRange;
                this.toDoubleRange = i2 + 1;
                iArr[i2] = 1;
                return 0;
            case 2:
                Object[] objArr = this.Mean$Arithmetic;
                int i3 = this.toDoubleRange;
                Object obj = objArr[i3 - 1];
                objArr[i3 - 1] = null;
                this.IsOverlapping = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.Mean$Arithmetic;
                int i4 = this.toDoubleRange;
                this.toDoubleRange = i4 + 1;
                objArr2[i4] = objArr2[9];
                return 0;
            case 4:
                int i5 = this.toDoubleRange - this.length;
                this.toDoubleRange = i5;
                this.toString = i5;
                return 0;
            case 5:
                Object[] objArr3 = this.Mean$Arithmetic;
                int i6 = this.toString;
                this.toString = i6 + 1;
                Object obj2 = objArr3[i6];
                objArr3[i6] = null;
                this.IsOverlapping = obj2;
                return 0;
            case 6:
                Object[] objArr4 = this.Mean$Arithmetic;
                int i7 = this.toDoubleRange;
                this.toDoubleRange = i7 + 1;
                objArr4[i7] = objArr4[10];
                return 0;
            case 7:
                Object[] objArr5 = this.Mean$Arithmetic;
                int i8 = this.toDoubleRange;
                this.toDoubleRange = i8 + 1;
                objArr5[i8] = objArr5[11];
                return 0;
            case 8:
                int[] iArr2 = this.FastBitmap$CoordinateSystem;
                int i9 = this.toDoubleRange;
                this.toDoubleRange = i9 + 1;
                iArr2[i9] = this.length;
                return 0;
            case 9:
                int[] iArr3 = this.FastBitmap$CoordinateSystem;
                int i10 = this.toDoubleRange;
                int i11 = i10 + 1;
                this.toDoubleRange = i11;
                iArr3[i10] = 77;
                int i12 = i11 + 2;
                this.toDoubleRange = i12;
                iArr3[i12 - 1] = iArr3[i12 - 3];
                iArr3[i11] = iArr3[i12 - 4];
                return 0;
            case 10:
                int[] iArr4 = this.FastBitmap$CoordinateSystem;
                int i13 = this.toDoubleRange;
                int i14 = i13 + 2;
                this.toDoubleRange = i14;
                iArr4[i14 - 1] = iArr4[i14 - 3];
                iArr4[i13] = iArr4[i14 - 4];
                int i15 = i14 - 1;
                this.toDoubleRange = i15;
                iArr4[i15 - 1] = iArr4[i15 - 1] & iArr4[i15];
                this.toDoubleRange = i15 + 1;
                iArr4[i15] = -1;
                return 0;
            case 11:
                int i16 = this.toDoubleRange - 1;
                this.toDoubleRange = i16;
                int[] iArr5 = this.FastBitmap$CoordinateSystem;
                iArr5[i16 - 1] = iArr5[i16 - 1] ^ iArr5[i16];
                int i17 = i16 + 1;
                this.toDoubleRange = i17;
                int i18 = iArr5[i17 - 2];
                iArr5[i16] = i18;
                iArr5[i17 - 2] = iArr5[i17 - 3];
                iArr5[i17 - 3] = iArr5[i17 - 4];
                iArr5[i17 - 4] = i18;
                return 0;
            case 12:
                int i19 = this.toDoubleRange - 1;
                this.toDoubleRange = i19;
                this.Mean$Arithmetic[i19] = null;
                int i20 = i19 - 1;
                this.toDoubleRange = i20;
                int[] iArr6 = this.FastBitmap$CoordinateSystem;
                iArr6[i20 - 1] = iArr6[i20] | iArr6[i20 - 1];
                return 0;
            case 13:
                int i21 = this.toDoubleRange - 1;
                this.toDoubleRange = i21;
                int[] iArr7 = this.FastBitmap$CoordinateSystem;
                iArr7[i21 - 1] = iArr7[i21] & iArr7[i21 - 1];
                return 0;
            case 14:
                int[] iArr8 = this.FastBitmap$CoordinateSystem;
                int i22 = this.toDoubleRange;
                int i23 = i22 + 1;
                this.toDoubleRange = i23;
                int i24 = iArr8[i23 - 2];
                iArr8[i22] = i24;
                iArr8[i23 - 2] = iArr8[i23 - 3];
                iArr8[i23 - 3] = iArr8[i23 - 4];
                iArr8[i23 - 4] = i24;
                return 0;
            case 15:
                int i25 = this.toDoubleRange - 1;
                this.toDoubleRange = i25;
                this.Mean$Arithmetic[i25] = null;
                return 0;
            case 16:
                int[] iArr9 = this.FastBitmap$CoordinateSystem;
                int i26 = this.toDoubleRange;
                int i27 = i26 + 2;
                this.toDoubleRange = i27;
                iArr9[i27 - 1] = iArr9[i27 - 3];
                iArr9[i26] = iArr9[i27 - 4];
                return 0;
            case 17:
                int[] iArr10 = this.FastBitmap$CoordinateSystem;
                int i28 = this.toDoubleRange;
                int i29 = i28 + 1;
                this.toDoubleRange = i29;
                iArr10[i28] = -1;
                int i30 = i29 - 1;
                this.toDoubleRange = i30;
                iArr10[i30 - 1] = iArr10[i30 - 1] ^ iArr10[i30];
                int i31 = i30 - 1;
                this.toDoubleRange = i31;
                iArr10[i31 - 1] = iArr10[i31] ^ iArr10[i31 - 1];
                return 0;
            case 18:
                int i32 = this.toDoubleRange - 1;
                this.toDoubleRange = i32;
                this.Mean$Arithmetic[i32] = null;
                int i33 = i32 - 1;
                this.toDoubleRange = i33;
                int[] iArr11 = this.FastBitmap$CoordinateSystem;
                iArr11[i33 - 1] = iArr11[i33] & iArr11[i33 - 1];
                return 0;
            case 19:
                int i34 = this.toDoubleRange - 1;
                this.toDoubleRange = i34;
                int[] iArr12 = this.FastBitmap$CoordinateSystem;
                iArr12[i34 - 1] = iArr12[i34 - 1] << iArr12[i34];
                int i35 = i34 + 2;
                this.toDoubleRange = i35;
                iArr12[i35 - 1] = iArr12[i35 - 3];
                iArr12[i34] = iArr12[i35 - 4];
                return 0;
            case 20:
                int i36 = this.toDoubleRange - 1;
                this.toDoubleRange = i36;
                int[] iArr13 = this.FastBitmap$CoordinateSystem;
                iArr13[i36 - 1] = iArr13[i36] ^ iArr13[i36 - 1];
                return 0;
            case 21:
                int[] iArr14 = this.FastBitmap$CoordinateSystem;
                int i37 = this.toDoubleRange;
                int i38 = i37 + 1;
                this.toDoubleRange = i38;
                int i39 = iArr14[i38 - 2];
                iArr14[i37] = i39;
                iArr14[i38 - 2] = iArr14[i38 - 3];
                iArr14[i38 - 3] = iArr14[i38 - 4];
                iArr14[i38 - 4] = i39;
                int i40 = i38 - 1;
                this.toDoubleRange = i40;
                this.Mean$Arithmetic[i40] = null;
                int i41 = i40 - 1;
                this.toDoubleRange = i41;
                iArr14[i41 - 1] = iArr14[i41] & iArr14[i41 - 1];
                return 0;
            case 22:
                int i42 = this.toDoubleRange - 1;
                this.toDoubleRange = i42;
                int[] iArr15 = this.FastBitmap$CoordinateSystem;
                iArr15[i42 - 1] = iArr15[i42 - 1] << iArr15[i42];
                return 0;
            case 23:
                int i43 = this.toDoubleRange - 1;
                this.toDoubleRange = i43;
                int[] iArr16 = this.FastBitmap$CoordinateSystem;
                iArr16[i43 - 1] = iArr16[i43 - 1] + iArr16[i43];
                return 0;
            case 24:
                int[] iArr17 = this.FastBitmap$CoordinateSystem;
                int i44 = this.toDoubleRange;
                int i45 = i44 + 1;
                this.toDoubleRange = i45;
                iArr17[i44] = iArr17[i45 - 2];
                int i46 = i45 + 1;
                this.toDoubleRange = i46;
                iArr17[i45] = 128;
                int i47 = i46 - 1;
                this.toDoubleRange = i47;
                iArr17[i47 - 1] = iArr17[i47 - 1] % iArr17[i47];
                return 0;
            case 25:
                int[] iArr18 = this.FastBitmap$CoordinateSystem;
                int i48 = this.toString;
                this.toString = i48 + 1;
                this.setMax = iArr18[i48];
                return 0;
            case 26:
                int[] iArr19 = this.FastBitmap$CoordinateSystem;
                int i49 = this.toDoubleRange;
                this.toDoubleRange = i49 + 1;
                iArr19[i49] = 2;
                return 0;
            case 27:
                int i50 = this.toDoubleRange - 1;
                this.toDoubleRange = i50;
                int[] iArr20 = this.FastBitmap$CoordinateSystem;
                iArr20[i50 - 1] = iArr20[i50 - 1] % iArr20[i50];
                return 0;
            case 28:
                int i51 = this.toDoubleRange - 1;
                this.toDoubleRange = i51;
                this.setMax = this.FastBitmap$CoordinateSystem[i51] == 0 ? 1 : 0;
                return 0;
            case 29:
                int[] iArr21 = this.FastBitmap$CoordinateSystem;
                int i52 = this.toDoubleRange;
                int i53 = i52 + 1;
                this.toDoubleRange = i53;
                iArr21[i52] = 2;
                int i54 = i53 - 1;
                this.toDoubleRange = i54;
                iArr21[i54 - 1] = iArr21[i54 - 1] % iArr21[i54];
                return 0;
            case 30:
                int[] iArr22 = this.FastBitmap$CoordinateSystem;
                int i55 = this.toDoubleRange;
                int i56 = i55 + 1;
                this.toDoubleRange = i56;
                iArr22[i55] = 107;
                int i57 = i56 + 2;
                this.toDoubleRange = i57;
                iArr22[i57 - 1] = iArr22[i57 - 3];
                iArr22[i56] = iArr22[i57 - 4];
                int i58 = i57 - 1;
                this.toDoubleRange = i58;
                iArr22[i58 - 1] = iArr22[i58] ^ iArr22[i58 - 1];
                return 0;
            case 31:
                int i59 = this.toDoubleRange - 1;
                this.toDoubleRange = i59;
                int[] iArr23 = this.FastBitmap$CoordinateSystem;
                iArr23[i59 - 1] = iArr23[i59 - 1] << iArr23[i59];
                int i60 = i59 - 1;
                this.toDoubleRange = i60;
                iArr23[i60 - 1] = iArr23[i60 - 1] + iArr23[i60];
                return 0;
            case 32:
                int[] iArr24 = this.FastBitmap$CoordinateSystem;
                int i61 = this.toDoubleRange;
                int i62 = i61 + 1;
                this.toDoubleRange = i62;
                iArr24[i61] = iArr24[i62 - 2];
                return 0;
            case 33:
                int[] iArr25 = this.FastBitmap$CoordinateSystem;
                int i63 = this.toDoubleRange;
                this.toDoubleRange = i63 + 1;
                iArr25[i63] = 128;
                return 0;
            case 34:
                int i64 = this.toDoubleRange - 1;
                this.toDoubleRange = i64;
                this.setMax = this.FastBitmap$CoordinateSystem[i64] != 0 ? 1 : 0;
                return 0;
            case 35:
                int[] iArr26 = this.FastBitmap$CoordinateSystem;
                int i65 = this.toDoubleRange - 1;
                this.toDoubleRange = i65;
                this.setMax = iArr26[i65];
                return 0;
            case 36:
                int[] iArr27 = this.FastBitmap$CoordinateSystem;
                int i66 = this.toDoubleRange;
                this.toDoubleRange = i66 + 1;
                iArr27[i66] = 21;
                return 0;
            case 37:
                int[] iArr28 = this.FastBitmap$CoordinateSystem;
                int i67 = this.toDoubleRange;
                iArr28[i67 - 1] = -iArr28[i67 - 1];
                int i68 = i67 + 1;
                this.toDoubleRange = i68;
                iArr28[i67] = iArr28[i68 - 2];
                iArr28[i68 - 1] = -iArr28[i68 - 1];
                return 0;
            case 38:
                int[] iArr29 = this.FastBitmap$CoordinateSystem;
                int i69 = this.toDoubleRange;
                this.toDoubleRange = i69 + 1;
                iArr29[i69] = -1;
                return 0;
            case 39:
                int[] iArr30 = this.FastBitmap$CoordinateSystem;
                int i70 = this.toDoubleRange;
                int i71 = i70 + 2;
                this.toDoubleRange = i71;
                iArr30[i71 - 1] = iArr30[i71 - 3];
                iArr30[i70] = iArr30[i71 - 4];
                int i72 = i71 + 1;
                this.toDoubleRange = i72;
                iArr30[i71] = -1;
                int i73 = i72 - 1;
                this.toDoubleRange = i73;
                iArr30[i73 - 1] = iArr30[i73] ^ iArr30[i73 - 1];
                return 0;
            case 40:
                int i74 = this.toDoubleRange - 1;
                this.toDoubleRange = i74;
                int[] iArr31 = this.FastBitmap$CoordinateSystem;
                iArr31[i74 - 1] = iArr31[i74 - 1] & iArr31[i74];
                int i75 = i74 + 1;
                this.toDoubleRange = i75;
                int i76 = iArr31[i75 - 2];
                iArr31[i74] = i76;
                iArr31[i75 - 2] = iArr31[i75 - 3];
                iArr31[i75 - 3] = iArr31[i75 - 4];
                iArr31[i75 - 4] = i76;
                return 0;
            case 41:
                int i77 = this.toDoubleRange - 1;
                this.toDoubleRange = i77;
                this.Mean$Arithmetic[i77] = null;
                int[] iArr32 = this.FastBitmap$CoordinateSystem;
                int i78 = iArr32[i77 - 1];
                iArr32[i77 - 1] = iArr32[i77 - 2];
                iArr32[i77 - 2] = i78;
                this.toDoubleRange = i77 + 1;
                iArr32[i77] = -1;
                return 0;
            case 42:
                int i79 = this.toDoubleRange - 1;
                this.toDoubleRange = i79;
                int[] iArr33 = this.FastBitmap$CoordinateSystem;
                iArr33[i79 - 1] = iArr33[i79 - 1] ^ iArr33[i79];
                int i80 = i79 - 1;
                this.toDoubleRange = i80;
                iArr33[i80 - 1] = iArr33[i80] & iArr33[i80 - 1];
                return 0;
            case 43:
                int i81 = this.toDoubleRange - 1;
                this.toDoubleRange = i81;
                int[] iArr34 = this.FastBitmap$CoordinateSystem;
                iArr34[i81 - 1] = iArr34[i81 - 1] | iArr34[i81];
                int i82 = iArr34[i81 - 1];
                iArr34[i81 - 1] = iArr34[i81 - 2];
                iArr34[i81 - 2] = i82;
                return 0;
            case 44:
                int i83 = this.toDoubleRange - 1;
                this.toDoubleRange = i83;
                this.Mean$Arithmetic[i83] = null;
                int[] iArr35 = this.FastBitmap$CoordinateSystem;
                int i84 = i83 + 2;
                this.toDoubleRange = i84;
                iArr35[i84 - 1] = iArr35[i84 - 3];
                iArr35[i83] = iArr35[i84 - 4];
                iArr35[i84 - 1] = -iArr35[i84 - 1];
                return 0;
            case 45:
                int i85 = this.toDoubleRange - 1;
                this.toDoubleRange = i85;
                this.Mean$Arithmetic[i85] = null;
                int[] iArr36 = this.FastBitmap$CoordinateSystem;
                iArr36[i85 - 1] = -iArr36[i85 - 1];
                int i86 = i85 - 1;
                this.toDoubleRange = i86;
                iArr36[i86 - 1] = iArr36[i86] & iArr36[i86 - 1];
                return 0;
            case 46:
                int[] iArr37 = this.FastBitmap$CoordinateSystem;
                int i87 = this.toDoubleRange;
                int i88 = i87 + 1;
                this.toDoubleRange = i88;
                iArr37[i87] = 1;
                iArr37[i88 - 1] = -iArr37[i88 - 1];
                return 0;
            case 47:
                int[] iArr38 = this.FastBitmap$CoordinateSystem;
                int i89 = this.toDoubleRange;
                int i90 = i89 + 1;
                this.toDoubleRange = i90;
                iArr38[i89] = 1;
                int i91 = i90 - 1;
                this.toDoubleRange = i91;
                iArr38[i91 - 1] = iArr38[i91 - 1] << iArr38[i91];
                int i92 = i91 - 1;
                this.toDoubleRange = i92;
                iArr38[i92 - 1] = iArr38[i92 - 1] + iArr38[i92];
                return 0;
            case 48:
                int[] iArr39 = this.FastBitmap$CoordinateSystem;
                int i93 = this.toDoubleRange;
                this.toDoubleRange = i93 + 1;
                iArr39[i93] = 0;
                return 0;
            case 49:
                Object[] objArr6 = this.Mean$Arithmetic;
                int i94 = this.toDoubleRange;
                this.toDoubleRange = i94 + 1;
                objArr6[i94] = objArr6[12];
                return 0;
            case 50:
                break;
            case 51:
                Object[] objArr7 = this.Mean$Arithmetic;
                int i95 = this.toDoubleRange;
                this.toDoubleRange = i95 + 1;
                objArr7[i95] = null;
                break;
            case 52:
                for (int i96 = this.toDoubleRange - 1; i96 >= 0; i96--) {
                    this.Mean$Arithmetic[i96] = null;
                }
                this.toDoubleRange = 0;
                Object[] objArr8 = this.Mean$Arithmetic;
                this.toDoubleRange = 0 + 1;
                objArr8[0] = this.isInside;
                return 0;
            case 53:
                int[] iArr40 = this.FastBitmap$CoordinateSystem;
                int i97 = this.toDoubleRange;
                this.toDoubleRange = i97 + 1;
                iArr40[i97] = 29;
                return 0;
            case 54:
                int[] iArr41 = this.FastBitmap$CoordinateSystem;
                int i98 = this.toDoubleRange;
                int i99 = i98 + 1;
                this.toDoubleRange = i99;
                iArr41[i98] = iArr41[i99 - 2];
                this.toDoubleRange = i99 + 1;
                iArr41[i99] = -1;
                return 0;
            case 55:
                int[] iArr42 = this.FastBitmap$CoordinateSystem;
                int i100 = this.toDoubleRange;
                int i101 = iArr42[i100 - 1];
                iArr42[i100 - 1] = iArr42[i100 - 2];
                iArr42[i100 - 2] = i101;
                int i102 = i100 + 1;
                this.toDoubleRange = i102;
                iArr42[i100] = -1;
                int i103 = i102 - 1;
                this.toDoubleRange = i103;
                iArr42[i103 - 1] = iArr42[i103] ^ iArr42[i103 - 1];
                return 0;
            case 56:
                int i104 = this.toDoubleRange - 1;
                this.toDoubleRange = i104;
                int[] iArr43 = this.FastBitmap$CoordinateSystem;
                iArr43[i104 - 1] = iArr43[i104 - 1] & iArr43[i104];
                int i105 = i104 - 1;
                this.toDoubleRange = i105;
                iArr43[i105 - 1] = iArr43[i105 - 1] | iArr43[i105];
                int i106 = iArr43[i105 - 1];
                iArr43[i105 - 1] = iArr43[i105 - 2];
                iArr43[i105 - 2] = i106;
                return 0;
            case 57:
                int i107 = this.toDoubleRange - 1;
                this.toDoubleRange = i107;
                this.Mean$Arithmetic[i107] = null;
                int[] iArr44 = this.FastBitmap$CoordinateSystem;
                iArr44[i107 - 1] = -iArr44[i107 - 1];
                return 0;
            case 58:
                int[] iArr45 = this.FastBitmap$CoordinateSystem;
                int i108 = this.toDoubleRange;
                int i109 = i108 + 2;
                this.toDoubleRange = i109;
                iArr45[i109 - 1] = iArr45[i109 - 3];
                iArr45[i108] = iArr45[i109 - 4];
                int i110 = i109 - 1;
                this.toDoubleRange = i110;
                iArr45[i110 - 1] = iArr45[i110] | iArr45[i110 - 1];
                return 0;
            case 59:
                int i111 = this.toDoubleRange - 1;
                this.toDoubleRange = i111;
                int[] iArr46 = this.FastBitmap$CoordinateSystem;
                iArr46[i111 - 1] = iArr46[i111 - 1] << iArr46[i111];
                int i112 = i111 + 1;
                this.toDoubleRange = i112;
                int i113 = iArr46[i112 - 2];
                iArr46[i111] = i113;
                iArr46[i112 - 2] = iArr46[i112 - 3];
                iArr46[i112 - 3] = iArr46[i112 - 4];
                iArr46[i112 - 4] = i113;
                int i114 = i112 - 1;
                this.toDoubleRange = i114;
                this.Mean$Arithmetic[i114] = null;
                return 0;
            case 60:
                int i115 = this.toDoubleRange - 1;
                this.toDoubleRange = i115;
                int[] iArr47 = this.FastBitmap$CoordinateSystem;
                iArr47[i115 - 1] = iArr47[i115 - 1] - iArr47[i115];
                return 0;
            case 61:
                int[] iArr48 = this.FastBitmap$CoordinateSystem;
                int i116 = this.toDoubleRange;
                int i117 = i116 + 1;
                this.toDoubleRange = i117;
                iArr48[i116] = 1;
                int i118 = i117 + 2;
                this.toDoubleRange = i118;
                iArr48[i118 - 1] = iArr48[i118 - 3];
                iArr48[i117] = iArr48[i118 - 4];
                iArr48[i118 - 1] = -iArr48[i118 - 1];
                return 0;
            case 62:
                int i119 = this.toDoubleRange - 1;
                this.toDoubleRange = i119;
                int[] iArr49 = this.FastBitmap$CoordinateSystem;
                iArr49[i119 - 1] = iArr49[i119 - 1] & iArr49[i119];
                int i120 = i119 + 1;
                this.toDoubleRange = i120;
                int i121 = iArr49[i120 - 2];
                iArr49[i119] = i121;
                iArr49[i120 - 2] = iArr49[i120 - 3];
                iArr49[i120 - 3] = iArr49[i120 - 4];
                iArr49[i120 - 4] = i121;
                int i122 = i120 - 1;
                this.toDoubleRange = i122;
                this.Mean$Arithmetic[i122] = null;
                return 0;
            case 63:
                int[] iArr50 = this.FastBitmap$CoordinateSystem;
                int i123 = this.toDoubleRange;
                iArr50[i123 - 1] = -iArr50[i123 - 1];
                int i124 = i123 - 1;
                this.toDoubleRange = i124;
                iArr50[i124 - 1] = iArr50[i124 - 1] | iArr50[i124];
                int i125 = i124 - 1;
                this.toDoubleRange = i125;
                iArr50[i125 - 1] = iArr50[i125 - 1] + iArr50[i125];
                return 0;
            case 64:
                int[] iArr51 = this.FastBitmap$CoordinateSystem;
                int i126 = this.toDoubleRange;
                int i127 = i126 + 1;
                this.toDoubleRange = i127;
                iArr51[i126] = 128;
                int i128 = i127 - 1;
                this.toDoubleRange = i128;
                iArr51[i128 - 1] = iArr51[i128 - 1] % iArr51[i128];
                return 0;
            case 65:
                int[] iArr52 = this.FastBitmap$CoordinateSystem;
                int i129 = this.toDoubleRange;
                int i130 = i129 + 1;
                this.toDoubleRange = i130;
                iArr52[i129] = 42;
                int i131 = i130 + 1;
                this.toDoubleRange = i131;
                iArr52[i130] = 0;
                int i132 = i131 - 1;
                this.toDoubleRange = i132;
                iArr52[i132 - 1] = iArr52[i132 - 1] / iArr52[i132];
                return 0;
            case 66:
                int[] iArr53 = this.FastBitmap$CoordinateSystem;
                int i133 = this.toDoubleRange;
                int i134 = i133 + 1;
                this.toDoubleRange = i134;
                iArr53[i133] = 2;
                this.toDoubleRange = i134 + 1;
                iArr53[i134] = 2;
                return 0;
            case 67:
                int i135 = this.toDoubleRange - 1;
                this.toDoubleRange = i135;
                int[] iArr54 = this.FastBitmap$CoordinateSystem;
                iArr54[i135 - 1] = iArr54[i135 - 1] % iArr54[i135];
                int i136 = i135 - 1;
                this.toDoubleRange = i136;
                this.Mean$Arithmetic[i136] = null;
                return 0;
            case 68:
                Object[] objArr9 = this.Mean$Arithmetic;
                int i137 = this.toDoubleRange;
                int i138 = i137 + 1;
                this.toDoubleRange = i138;
                objArr9[i137] = objArr9[9];
                this.toDoubleRange = i138 + 1;
                objArr9[i138] = objArr9[12];
                return 0;
            case 69:
                Object[] objArr10 = this.Mean$Arithmetic;
                int i139 = this.toDoubleRange;
                this.toDoubleRange = i139 + 1;
                objArr10[i139] = objArr10[13];
                return 0;
            case 70:
                Object[] objArr11 = this.Mean$Arithmetic;
                int i140 = this.toDoubleRange;
                this.toDoubleRange = i140 + 1;
                objArr11[i140] = objArr11[14];
                return 0;
            case 71:
                Object[] objArr12 = this.Mean$Arithmetic;
                int i141 = this.toDoubleRange;
                int i142 = i141 + 1;
                this.toDoubleRange = i142;
                objArr12[i141] = null;
                Object obj3 = objArr12[i142 - 1];
                objArr12[i142 - 1] = null;
                this.FastBitmap$CoordinateSystem[i142 - 1] = ((int[]) obj3).length;
                return 0;
            case 72:
                int[] iArr55 = this.FastBitmap$CoordinateSystem;
                int i143 = this.toDoubleRange;
                this.toDoubleRange = i143 + 1;
                iArr55[i143] = 115;
                return 0;
            case 73:
                int[] iArr56 = this.FastBitmap$CoordinateSystem;
                int i144 = this.toDoubleRange;
                iArr56[i144 - 1] = -iArr56[i144 - 1];
                return 0;
            case 74:
                int[] iArr57 = this.FastBitmap$CoordinateSystem;
                int i145 = this.toDoubleRange;
                int i146 = i145 + 2;
                this.toDoubleRange = i146;
                iArr57[i146 - 1] = iArr57[i146 - 3];
                iArr57[i145] = iArr57[i146 - 4];
                int i147 = i146 - 1;
                this.toDoubleRange = i147;
                iArr57[i147 - 1] = iArr57[i147 - 1] ^ iArr57[i147];
                int i148 = i147 + 1;
                this.toDoubleRange = i148;
                int i149 = iArr57[i148 - 2];
                iArr57[i147] = i149;
                iArr57[i148 - 2] = iArr57[i148 - 3];
                iArr57[i148 - 3] = iArr57[i148 - 4];
                iArr57[i148 - 4] = i149;
                return 0;
            case 75:
                int i150 = this.toDoubleRange - 1;
                this.toDoubleRange = i150;
                this.Mean$Arithmetic[i150] = null;
                int i151 = i150 - 1;
                this.toDoubleRange = i151;
                int[] iArr58 = this.FastBitmap$CoordinateSystem;
                iArr58[i151 - 1] = iArr58[i151 - 1] & iArr58[i151];
                int i152 = i151 - 1;
                this.toDoubleRange = i152;
                iArr58[i152 - 1] = iArr58[i152] | iArr58[i152 - 1];
                return 0;
            case 76:
                int[] iArr59 = this.FastBitmap$CoordinateSystem;
                int i153 = this.toDoubleRange;
                iArr59[i153 - 1] = -iArr59[i153 - 1];
                int i154 = i153 - 1;
                this.toDoubleRange = i154;
                iArr59[i154 - 1] = iArr59[i154 - 1] ^ iArr59[i154];
                int i155 = i154 + 2;
                this.toDoubleRange = i155;
                iArr59[i155 - 1] = iArr59[i155 - 3];
                iArr59[i154] = iArr59[i155 - 4];
                return 0;
            case 77:
                int[] iArr60 = this.FastBitmap$CoordinateSystem;
                int i156 = this.toDoubleRange;
                iArr60[i156 - 1] = -iArr60[i156 - 1];
                int i157 = i156 - 1;
                this.toDoubleRange = i157;
                iArr60[i157 - 1] = iArr60[i157 - 1] | iArr60[i157];
                this.toDoubleRange = i157 + 1;
                iArr60[i157] = 1;
                return 0;
            case 78:
                int i158 = this.toDoubleRange - 1;
                this.toDoubleRange = i158;
                int[] iArr61 = this.FastBitmap$CoordinateSystem;
                iArr61[i158 - 1] = iArr61[i158 - 1] ^ iArr61[i158];
                int i159 = i158 - 1;
                this.toDoubleRange = i159;
                iArr61[i159 - 1] = iArr61[i159 - 1] - iArr61[i159];
                return 0;
            case 79:
                int[] iArr62 = this.FastBitmap$CoordinateSystem;
                int i160 = this.toDoubleRange;
                int i161 = i160 + 1;
                this.toDoubleRange = i161;
                iArr62[i160] = iArr62[i161 - 2];
                this.toDoubleRange = i161 + 1;
                iArr62[i161] = 128;
                return 0;
            case 80:
                int[] iArr63 = this.FastBitmap$CoordinateSystem;
                int i162 = this.toDoubleRange;
                int i163 = i162 + 1;
                this.toDoubleRange = i163;
                iArr63[i162] = 51;
                int i164 = i163 + 1;
                this.toDoubleRange = i164;
                iArr63[i163] = iArr63[i164 - 2];
                this.toDoubleRange = i164 + 1;
                iArr63[i164] = -1;
                return 0;
            case 81:
                int[] iArr64 = this.FastBitmap$CoordinateSystem;
                int i165 = this.toDoubleRange;
                int i166 = iArr64[i165 - 1];
                iArr64[i165 - 1] = iArr64[i165 - 2];
                iArr64[i165 - 2] = i166;
                int i167 = i165 - 1;
                this.toDoubleRange = i167;
                this.Mean$Arithmetic[i167] = null;
                return 0;
            case 82:
                int[] iArr65 = this.FastBitmap$CoordinateSystem;
                int i168 = this.toDoubleRange;
                iArr65[i168 - 1] = -iArr65[i168 - 1];
                int i169 = i168 - 1;
                this.toDoubleRange = i169;
                iArr65[i169 - 1] = iArr65[i169] ^ iArr65[i169 - 1];
                return 0;
            case 83:
                int i170 = this.toDoubleRange - 1;
                this.toDoubleRange = i170;
                int[] iArr66 = this.FastBitmap$CoordinateSystem;
                iArr66[i170 - 1] = iArr66[i170 - 1] & iArr66[i170];
                this.toDoubleRange = i170 + 1;
                iArr66[i170] = 1;
                return 0;
            case 84:
                int i171 = this.toDoubleRange - 1;
                this.toDoubleRange = i171;
                int[] iArr67 = this.FastBitmap$CoordinateSystem;
                iArr67[i171 - 1] = iArr67[i171 - 1] << iArr67[i171];
                int i172 = i171 - 1;
                this.toDoubleRange = i172;
                iArr67[i172 - 1] = iArr67[i172 - 1] + iArr67[i172];
                this.toDoubleRange = i172 + 1;
                iArr67[i172] = 1;
                return 0;
            case 85:
                int[] iArr68 = this.FastBitmap$CoordinateSystem;
                int i173 = this.toDoubleRange;
                int i174 = i173 + 1;
                this.toDoubleRange = i174;
                iArr68[i173] = iArr68[i174 - 2];
                iArr68[i174 - 1] = -iArr68[i174 - 1];
                return 0;
            case 86:
                int[] iArr69 = this.FastBitmap$CoordinateSystem;
                int i175 = this.toDoubleRange;
                int i176 = iArr69[i175 - 1];
                iArr69[i175 - 1] = iArr69[i175 - 2];
                iArr69[i175 - 2] = i176;
                int i177 = i175 - 1;
                this.toDoubleRange = i177;
                this.Mean$Arithmetic[i177] = null;
                int i178 = i177 - 1;
                this.toDoubleRange = i178;
                iArr69[i178 - 1] = iArr69[i178 - 1] - iArr69[i178];
                return 0;
            case 87:
                int i179 = this.toDoubleRange - 1;
                this.toDoubleRange = i179;
                int[] iArr70 = this.FastBitmap$CoordinateSystem;
                iArr70[i179 - 1] = iArr70[i179 - 1] - iArr70[i179];
                int i180 = i179 + 1;
                this.toDoubleRange = i180;
                iArr70[i179] = iArr70[i180 - 2];
                this.toDoubleRange = i180 + 1;
                iArr70[i180] = 128;
                return 0;
            case 88:
                Object[] objArr13 = this.Mean$Arithmetic;
                int i181 = this.toDoubleRange;
                this.toDoubleRange = i181 + 1;
                objArr13[i181] = this.isInside;
                return 0;
            case 89:
                int[] iArr71 = this.FastBitmap$CoordinateSystem;
                int i182 = this.toDoubleRange;
                this.toDoubleRange = i182 + 1;
                iArr71[i182] = 30;
                return 0;
            case 90:
                int[] iArr72 = this.FastBitmap$CoordinateSystem;
                int i183 = this.toDoubleRange;
                iArr72[i183 - 1] = -iArr72[i183 - 1];
                int i184 = i183 + 1;
                this.toDoubleRange = i184;
                iArr72[i183] = -1;
                int i185 = i184 + 2;
                this.toDoubleRange = i185;
                iArr72[i185 - 1] = iArr72[i185 - 3];
                iArr72[i184] = iArr72[i185 - 4];
                return 0;
            case 91:
                int i186 = this.toDoubleRange - 1;
                this.toDoubleRange = i186;
                int[] iArr73 = this.FastBitmap$CoordinateSystem;
                iArr73[i186 - 1] = iArr73[i186 - 1] ^ iArr73[i186];
                int i187 = i186 - 1;
                this.toDoubleRange = i187;
                iArr73[i187 - 1] = iArr73[i187 - 1] & iArr73[i187];
                int i188 = i187 + 1;
                this.toDoubleRange = i188;
                int i189 = iArr73[i188 - 2];
                iArr73[i187] = i189;
                iArr73[i188 - 2] = iArr73[i188 - 3];
                iArr73[i188 - 3] = iArr73[i188 - 4];
                iArr73[i188 - 4] = i189;
                return 0;
            case 92:
                int i190 = this.toDoubleRange - 1;
                this.toDoubleRange = i190;
                this.Mean$Arithmetic[i190] = null;
                int[] iArr74 = this.FastBitmap$CoordinateSystem;
                int i191 = iArr74[i190 - 1];
                iArr74[i190 - 1] = iArr74[i190 - 2];
                iArr74[i190 - 2] = i191;
                return 0;
            case 93:
                int i192 = this.toDoubleRange - 1;
                this.toDoubleRange = i192;
                int[] iArr75 = this.FastBitmap$CoordinateSystem;
                iArr75[i192 - 1] = iArr75[i192 - 1] ^ iArr75[i192];
                int i193 = i192 - 1;
                this.toDoubleRange = i193;
                iArr75[i193 - 1] = iArr75[i193 - 1] & iArr75[i193];
                int i194 = i193 - 1;
                this.toDoubleRange = i194;
                iArr75[i194 - 1] = iArr75[i194] | iArr75[i194 - 1];
                return 0;
            case 94:
                int[] iArr76 = this.FastBitmap$CoordinateSystem;
                int i195 = this.toDoubleRange;
                int i196 = iArr76[i195 - 1];
                iArr76[i195 - 1] = iArr76[i195 - 2];
                iArr76[i195 - 2] = i196;
                return 0;
            case 95:
                int[] iArr77 = this.FastBitmap$CoordinateSystem;
                int i197 = this.toDoubleRange;
                int i198 = i197 + 2;
                this.toDoubleRange = i198;
                iArr77[i198 - 1] = iArr77[i198 - 3];
                iArr77[i197] = iArr77[i198 - 4];
                int i199 = i198 - 1;
                this.toDoubleRange = i199;
                iArr77[i199 - 1] = iArr77[i199] & iArr77[i199 - 1];
                return 0;
            case 96:
                int i200 = this.toDoubleRange - 1;
                this.toDoubleRange = i200;
                this.Mean$Arithmetic[i200] = null;
                int i201 = i200 - 1;
                this.toDoubleRange = i201;
                int[] iArr78 = this.FastBitmap$CoordinateSystem;
                iArr78[i201 - 1] = iArr78[i201 - 1] | iArr78[i201];
                int i202 = i201 - 1;
                this.toDoubleRange = i202;
                iArr78[i202 - 1] = iArr78[i202 - 1] + iArr78[i202];
                return 0;
            case 97:
                int[] iArr79 = this.FastBitmap$CoordinateSystem;
                int i203 = this.toDoubleRange;
                this.toDoubleRange = i203 + 1;
                iArr79[i203] = 37;
                return 0;
            case 98:
                int[] iArr80 = this.FastBitmap$CoordinateSystem;
                int i204 = this.toDoubleRange;
                int i205 = i204 + 1;
                this.toDoubleRange = i205;
                iArr80[i204] = 71;
                int i206 = i205 + 2;
                this.toDoubleRange = i206;
                iArr80[i206 - 1] = iArr80[i206 - 3];
                iArr80[i205] = iArr80[i206 - 4];
                int i207 = i206 - 1;
                this.toDoubleRange = i207;
                iArr80[i207 - 1] = iArr80[i207] & iArr80[i207 - 1];
                return 0;
            case 99:
                int i208 = this.toDoubleRange - 1;
                this.toDoubleRange = i208;
                int[] iArr81 = this.FastBitmap$CoordinateSystem;
                iArr81[i208 - 1] = iArr81[i208] | iArr81[i208 - 1];
                return 0;
            case 100:
                int i209 = this.toDoubleRange - 1;
                this.toDoubleRange = i209;
                int[] iArr82 = this.FastBitmap$CoordinateSystem;
                iArr82[i209 - 1] = iArr82[i209 - 1] + iArr82[i209];
                int i210 = i209 + 1;
                this.toDoubleRange = i210;
                iArr82[i209] = iArr82[i210 - 2];
                return 0;
            case 101:
                int[] iArr83 = this.FastBitmap$CoordinateSystem;
                int i211 = this.toDoubleRange;
                Object[] objArr14 = this.Mean$Arithmetic;
                Object obj4 = objArr14[i211 - 1];
                objArr14[i211 - 1] = null;
                iArr83[i211 - 1] = ((int[]) obj4).length;
                int i212 = i211 - 1;
                this.toDoubleRange = i212;
                objArr14[i212] = null;
                return 0;
            case 102:
                int[] iArr84 = this.FastBitmap$CoordinateSystem;
                int i213 = this.toDoubleRange;
                int i214 = i213 + 1;
                this.toDoubleRange = i214;
                iArr84[i213] = 79;
                iArr84[i214 - 1] = -iArr84[i214 - 1];
                return 0;
            case 103:
                int[] iArr85 = this.FastBitmap$CoordinateSystem;
                int i215 = this.toDoubleRange;
                iArr85[i215 - 1] = -iArr85[i215 - 1];
                int i216 = i215 + 2;
                this.toDoubleRange = i216;
                iArr85[i216 - 1] = iArr85[i216 - 3];
                iArr85[i215] = iArr85[i216 - 4];
                this.toDoubleRange = i216 + 1;
                iArr85[i216] = -1;
                return 0;
            case 104:
                int i217 = this.toDoubleRange - 1;
                this.toDoubleRange = i217;
                int[] iArr86 = this.FastBitmap$CoordinateSystem;
                iArr86[i217 - 1] = iArr86[i217 - 1] ^ iArr86[i217];
                int i218 = i217 - 1;
                this.toDoubleRange = i218;
                this.Mean$Arithmetic[i218] = null;
                int i219 = i218 - 1;
                this.toDoubleRange = i219;
                iArr86[i219 - 1] = iArr86[i219] & iArr86[i219 - 1];
                return 0;
            case 105:
                int i220 = this.toDoubleRange - 1;
                this.toDoubleRange = i220;
                this.Mean$Arithmetic[i220] = null;
                int[] iArr87 = this.FastBitmap$CoordinateSystem;
                iArr87[i220 - 1] = -iArr87[i220 - 1];
                int i221 = i220 + 2;
                this.toDoubleRange = i221;
                iArr87[i221 - 1] = iArr87[i221 - 3];
                iArr87[i220] = iArr87[i221 - 4];
                return 0;
            case 106:
                int[] iArr88 = this.FastBitmap$CoordinateSystem;
                int i222 = this.toDoubleRange;
                int i223 = i222 + 1;
                this.toDoubleRange = i223;
                int i224 = iArr88[i223 - 2];
                iArr88[i222] = i224;
                iArr88[i223 - 2] = iArr88[i223 - 3];
                iArr88[i223 - 3] = iArr88[i223 - 4];
                iArr88[i223 - 4] = i224;
                int i225 = i223 - 1;
                this.toDoubleRange = i225;
                this.Mean$Arithmetic[i225] = null;
                return 0;
            case 107:
                int[] iArr89 = this.FastBitmap$CoordinateSystem;
                int i226 = this.toDoubleRange;
                iArr89[i226 - 1] = -iArr89[i226 - 1];
                int i227 = i226 - 1;
                this.toDoubleRange = i227;
                iArr89[i227 - 1] = iArr89[i227] & iArr89[i227 - 1];
                return 0;
            case 108:
                int[] iArr90 = this.FastBitmap$CoordinateSystem;
                int i228 = this.toDoubleRange;
                int i229 = i228 + 1;
                this.toDoubleRange = i229;
                iArr90[i228] = 1;
                int i230 = i229 - 1;
                this.toDoubleRange = i230;
                iArr90[i230 - 1] = iArr90[i230 - 1] << iArr90[i230];
                return 0;
            case 109:
                int[] iArr91 = this.FastBitmap$CoordinateSystem;
                int i231 = this.toDoubleRange;
                int i232 = i231 + 1;
                this.toDoubleRange = i232;
                iArr91[i231] = 31;
                iArr91[i232 - 1] = -iArr91[i232 - 1];
                return 0;
            case 110:
                int i233 = this.toDoubleRange - 1;
                this.toDoubleRange = i233;
                int[] iArr92 = this.FastBitmap$CoordinateSystem;
                iArr92[i233 - 1] = iArr92[i233 - 1] ^ iArr92[i233];
                int i234 = i233 + 1;
                this.toDoubleRange = i234;
                int i235 = iArr92[i234 - 2];
                iArr92[i233] = i235;
                iArr92[i234 - 2] = iArr92[i234 - 3];
                iArr92[i234 - 3] = iArr92[i234 - 4];
                iArr92[i234 - 4] = i235;
                int i236 = i234 - 1;
                this.toDoubleRange = i236;
                this.Mean$Arithmetic[i236] = null;
                return 0;
            case 111:
                int i237 = this.toDoubleRange - 1;
                this.toDoubleRange = i237;
                int[] iArr93 = this.FastBitmap$CoordinateSystem;
                iArr93[i237 - 1] = iArr93[i237 - 1] ^ iArr93[i237];
                int i238 = i237 - 1;
                this.toDoubleRange = i238;
                iArr93[i238 - 1] = iArr93[i238] ^ iArr93[i238 - 1];
                return 0;
            case 112:
                int i239 = this.toDoubleRange - 1;
                this.toDoubleRange = i239;
                int[] iArr94 = this.FastBitmap$CoordinateSystem;
                iArr94[i239 - 1] = iArr94[i239 - 1] & iArr94[i239];
                int i240 = i239 + 1;
                this.toDoubleRange = i240;
                iArr94[i239] = 1;
                int i241 = i240 - 1;
                this.toDoubleRange = i241;
                iArr94[i241 - 1] = iArr94[i241 - 1] << iArr94[i241];
                return 0;
            case 113:
                int[] iArr95 = this.FastBitmap$CoordinateSystem;
                int i242 = this.toDoubleRange;
                int i243 = i242 + 2;
                this.toDoubleRange = i243;
                iArr95[i243 - 1] = iArr95[i243 - 3];
                iArr95[i242] = iArr95[i243 - 4];
                int i244 = i243 - 1;
                this.toDoubleRange = i244;
                iArr95[i244 - 1] = iArr95[i244] ^ iArr95[i244 - 1];
                return 0;
            case 114:
                int[] iArr96 = this.FastBitmap$CoordinateSystem;
                int i245 = this.toDoubleRange;
                this.toDoubleRange = i245 + 1;
                iArr96[i245] = 17;
                return 0;
            case 115:
                int[] iArr97 = this.FastBitmap$CoordinateSystem;
                int i246 = this.toDoubleRange;
                int i247 = i246 + 2;
                this.toDoubleRange = i247;
                iArr97[i247 - 1] = iArr97[i247 - 3];
                iArr97[i246] = iArr97[i247 - 4];
                int i248 = i247 + 2;
                this.toDoubleRange = i248;
                iArr97[i248 - 1] = iArr97[i248 - 3];
                iArr97[i247] = iArr97[i248 - 4];
                return 0;
            case 116:
                int i249 = this.toDoubleRange - 1;
                this.toDoubleRange = i249;
                this.Mean$Arithmetic[i249] = null;
                int[] iArr98 = this.FastBitmap$CoordinateSystem;
                int i250 = i249 + 2;
                this.toDoubleRange = i250;
                iArr98[i250 - 1] = iArr98[i250 - 3];
                iArr98[i249] = iArr98[i250 - 4];
                return 0;
            case 117:
                int i251 = this.toDoubleRange - 1;
                this.toDoubleRange = i251;
                int[] iArr99 = this.FastBitmap$CoordinateSystem;
                iArr99[i251 - 1] = iArr99[i251 - 1] & iArr99[i251];
                int i252 = i251 - 1;
                this.toDoubleRange = i252;
                iArr99[i252 - 1] = iArr99[i252] | iArr99[i252 - 1];
                return 0;
            case 118:
                int i253 = this.toDoubleRange - 1;
                this.toDoubleRange = i253;
                int[] iArr100 = this.FastBitmap$CoordinateSystem;
                iArr100[i253 - 1] = iArr100[i253 - 1] | iArr100[i253];
                int i254 = i253 - 1;
                this.toDoubleRange = i254;
                iArr100[i254 - 1] = iArr100[i254 - 1] + iArr100[i254];
                return 0;
            case 119:
                int i255 = this.toDoubleRange - 1;
                this.toDoubleRange = i255;
                Object[] objArr15 = this.Mean$Arithmetic;
                Object obj5 = objArr15[i255];
                objArr15[i255] = null;
                objArr15[10] = obj5;
                return 0;
            case 120:
                int[] iArr101 = this.FastBitmap$CoordinateSystem;
                int i256 = this.toDoubleRange;
                this.toDoubleRange = i256 + 1;
                iArr101[i256] = 8;
                return 0;
            case 121:
                int[] iArr102 = this.FastBitmap$CoordinateSystem;
                int i257 = this.toDoubleRange;
                this.toDoubleRange = i257 + 1;
                iArr102[i257] = 3;
                return 0;
            case 122:
                int[] iArr103 = this.FastBitmap$CoordinateSystem;
                int i258 = this.toDoubleRange;
                int i259 = i258 + 1;
                this.toDoubleRange = i259;
                iArr103[i258] = 9;
                iArr103[i259 - 1] = -iArr103[i259 - 1];
                int i260 = i259 + 2;
                this.toDoubleRange = i260;
                iArr103[i260 - 1] = iArr103[i260 - 3];
                iArr103[i259] = iArr103[i260 - 4];
                return 0;
            case 123:
                int[] iArr104 = this.FastBitmap$CoordinateSystem;
                int i261 = this.toDoubleRange;
                iArr104[i261 - 1] = -iArr104[i261 - 1];
                int i262 = i261 + 2;
                this.toDoubleRange = i262;
                iArr104[i262 - 1] = iArr104[i262 - 3];
                iArr104[i261] = iArr104[i262 - 4];
                return 0;
            case 124:
                int[] iArr105 = this.FastBitmap$CoordinateSystem;
                int i263 = this.toDoubleRange;
                int i264 = i263 + 1;
                this.toDoubleRange = i264;
                iArr105[i263] = -1;
                int i265 = i264 - 1;
                this.toDoubleRange = i265;
                iArr105[i265 - 1] = iArr105[i265] ^ iArr105[i265 - 1];
                return 0;
            case 125:
                int[] iArr106 = this.FastBitmap$CoordinateSystem;
                int i266 = this.toDoubleRange;
                int i267 = i266 + 1;
                this.toDoubleRange = i267;
                int i268 = iArr106[i267 - 2];
                iArr106[i266] = i268;
                iArr106[i267 - 2] = iArr106[i267 - 3];
                iArr106[i267 - 3] = iArr106[i267 - 4];
                iArr106[i267 - 4] = i268;
                int i269 = i267 - 1;
                this.toDoubleRange = i269;
                this.Mean$Arithmetic[i269] = null;
                int i270 = i269 - 1;
                this.toDoubleRange = i270;
                iArr106[i270 - 1] = iArr106[i270] | iArr106[i270 - 1];
                return 0;
            case 126:
                int i271 = this.toDoubleRange - 1;
                this.toDoubleRange = i271;
                int[] iArr107 = this.FastBitmap$CoordinateSystem;
                iArr107[i271 - 1] = iArr107[i271 - 1] & iArr107[i271];
                int i272 = i271 + 2;
                this.toDoubleRange = i272;
                iArr107[i272 - 1] = iArr107[i272 - 3];
                iArr107[i271] = iArr107[i272 - 4];
                iArr107[i272 - 1] = -iArr107[i272 - 1];
                return 0;
            case 127:
                int[] iArr108 = this.FastBitmap$CoordinateSystem;
                int i273 = this.toDoubleRange;
                this.toDoubleRange = i273 + 1;
                iArr108[i273] = 85;
                return 0;
            case 128:
                int[] iArr109 = this.FastBitmap$CoordinateSystem;
                int i274 = this.toDoubleRange;
                this.toDoubleRange = i274 + 1;
                iArr109[i274] = 11;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3:
                Object[] objArr16 = this.Mean$Arithmetic;
                int i275 = this.toDoubleRange;
                int i276 = i275 + 1;
                this.toDoubleRange = i276;
                objArr16[i275] = null;
                Object obj6 = objArr16[i276 - 1];
                objArr16[i276 - 1] = null;
                this.FastBitmap$CoordinateSystem[i276 - 1] = ((int[]) obj6).length;
                int i277 = i276 - 1;
                this.toDoubleRange = i277;
                objArr16[i277] = null;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                int[] iArr110 = this.FastBitmap$CoordinateSystem;
                int i278 = this.toDoubleRange;
                int i279 = i278 + 1;
                this.toDoubleRange = i279;
                iArr110[i278] = 13;
                iArr110[i279 - 1] = -iArr110[i279 - 1];
                return 0;
            case 131:
                int[] iArr111 = this.FastBitmap$CoordinateSystem;
                int i280 = this.toDoubleRange;
                iArr111[i280 - 1] = -iArr111[i280 - 1];
                this.toDoubleRange = i280 + 1;
                iArr111[i280] = -1;
                return 0;
            case 132:
                int i281 = this.toDoubleRange - 1;
                this.toDoubleRange = i281;
                this.Mean$Arithmetic[i281] = null;
                int[] iArr112 = this.FastBitmap$CoordinateSystem;
                iArr112[i281 - 1] = -iArr112[i281 - 1];
                int i282 = i281 - 1;
                this.toDoubleRange = i282;
                iArr112[i282 - 1] = iArr112[i282] | iArr112[i282 - 1];
                return 0;
            case 133:
                int i283 = this.toDoubleRange - 1;
                this.toDoubleRange = i283;
                int[] iArr113 = this.FastBitmap$CoordinateSystem;
                iArr113[i283 - 1] = iArr113[i283 - 1] + iArr113[i283];
                int i284 = i283 + 1;
                this.toDoubleRange = i284;
                iArr113[i283] = 1;
                int i285 = i284 - 1;
                this.toDoubleRange = i285;
                iArr113[i285 - 1] = iArr113[i285 - 1] - iArr113[i285];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                int[] iArr114 = this.FastBitmap$CoordinateSystem;
                int i286 = this.toDoubleRange;
                this.toDoubleRange = i286 + 1;
                iArr114[i286] = 6;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
                int[] iArr115 = this.FastBitmap$CoordinateSystem;
                int i287 = this.toDoubleRange;
                this.toDoubleRange = i287 + 1;
                iArr115[i287] = 35;
                return 0;
            case 136:
                int i288 = this.toDoubleRange - 1;
                this.toDoubleRange = i288;
                int[] iArr116 = this.FastBitmap$CoordinateSystem;
                iArr116[i288 - 1] = iArr116[i288 - 1] | iArr116[i288];
                int i289 = i288 + 1;
                this.toDoubleRange = i289;
                iArr116[i288] = 1;
                int i290 = i289 - 1;
                this.toDoubleRange = i290;
                iArr116[i290 - 1] = iArr116[i290 - 1] << iArr116[i290];
                return 0;
            case 137:
                int[] iArr117 = this.FastBitmap$CoordinateSystem;
                int i291 = this.toDoubleRange;
                int i292 = iArr117[i291 - 1];
                iArr117[i291 - 1] = iArr117[i291 - 2];
                iArr117[i291 - 2] = i292;
                this.toDoubleRange = i291 + 1;
                iArr117[i291] = -1;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS:
                int i293 = this.toDoubleRange - 1;
                this.toDoubleRange = i293;
                int[] iArr118 = this.FastBitmap$CoordinateSystem;
                iArr118[i293 - 1] = iArr118[i293 - 1] | iArr118[i293];
                iArr118[i293 - 1] = -iArr118[i293 - 1];
                return 0;
            case 139:
                int i294 = this.toDoubleRange - 1;
                this.toDoubleRange = i294;
                int[] iArr119 = this.FastBitmap$CoordinateSystem;
                iArr119[i294 - 1] = iArr119[i294 - 1] ^ iArr119[i294];
                int i295 = iArr119[i294 - 1];
                iArr119[i294 - 1] = iArr119[i294 - 2];
                iArr119[i294 - 2] = i295;
                return 0;
            case SavingsActivity.RV_BENEFIT_WIDTH /*140*/:
                int i296 = this.toDoubleRange - 1;
                this.toDoubleRange = i296;
                this.Mean$Arithmetic[i296] = null;
                int i297 = i296 - 1;
                this.toDoubleRange = i297;
                int[] iArr120 = this.FastBitmap$CoordinateSystem;
                iArr120[i297 - 1] = iArr120[i297 - 1] - iArr120[i297];
                this.toDoubleRange = i297 + 1;
                iArr120[i297] = 1;
                return 0;
            case 141:
                int[] iArr121 = this.FastBitmap$CoordinateSystem;
                int i298 = this.toDoubleRange;
                int i299 = i298 + 1;
                this.toDoubleRange = i299;
                iArr121[i298] = 17;
                int i300 = i299 + 1;
                this.toDoubleRange = i300;
                iArr121[i299] = 0;
                int i301 = i300 - 1;
                this.toDoubleRange = i301;
                iArr121[i301 - 1] = iArr121[i301 - 1] / iArr121[i301];
                return 0;
            case 142:
                int[] iArr122 = this.FastBitmap$CoordinateSystem;
                int i302 = this.toDoubleRange;
                int i303 = i302 + 1;
                this.toDoubleRange = i303;
                iArr122[i302] = 2;
                int i304 = i303 + 1;
                this.toDoubleRange = i304;
                iArr122[i303] = 2;
                int i305 = i304 - 1;
                this.toDoubleRange = i305;
                iArr122[i305 - 1] = iArr122[i305 - 1] % iArr122[i305];
                return 0;
            case 143:
                int[] iArr123 = this.FastBitmap$CoordinateSystem;
                int i306 = this.toDoubleRange;
                this.toDoubleRange = i306 + 1;
                iArr123[i306] = iArr123[10];
                return 0;
            case 144:
                int[] iArr124 = this.FastBitmap$CoordinateSystem;
                int i307 = this.toDoubleRange;
                int i308 = i307 + 1;
                this.toDoubleRange = i308;
                iArr124[i307] = 91;
                int i309 = i308 + 2;
                this.toDoubleRange = i309;
                iArr124[i309 - 1] = iArr124[i309 - 3];
                iArr124[i308] = iArr124[i309 - 4];
                int i310 = i309 - 1;
                this.toDoubleRange = i310;
                iArr124[i310 - 1] = iArr124[i310] & iArr124[i310 - 1];
                return 0;
            case 145:
                int[] iArr125 = this.FastBitmap$CoordinateSystem;
                int i311 = this.toDoubleRange;
                int i312 = i311 + 1;
                this.toDoubleRange = i312;
                iArr125[i311] = 87;
                int i313 = i312 + 1;
                this.toDoubleRange = i313;
                iArr125[i312] = iArr125[i313 - 2];
                return 0;
            case 146:
                int i314 = this.toDoubleRange - 1;
                this.toDoubleRange = i314;
                int[] iArr126 = this.FastBitmap$CoordinateSystem;
                iArr126[i314 - 1] = iArr126[i314 - 1] & iArr126[i314];
                int i315 = iArr126[i314 - 1];
                iArr126[i314 - 1] = iArr126[i314 - 2];
                iArr126[i314 - 2] = i315;
                return 0;
            case 147:
                int[] iArr127 = this.FastBitmap$CoordinateSystem;
                int i316 = this.toDoubleRange;
                int i317 = i316 + 2;
                this.toDoubleRange = i317;
                iArr127[i317 - 1] = iArr127[i317 - 3];
                iArr127[i316] = iArr127[i317 - 4];
                iArr127[i317 - 1] = -iArr127[i317 - 1];
                int i318 = i317 - 1;
                this.toDoubleRange = i318;
                iArr127[i318 - 1] = iArr127[i318] ^ iArr127[i318 - 1];
                return 0;
            case 148:
                int[] iArr128 = this.FastBitmap$CoordinateSystem;
                int i319 = this.toDoubleRange;
                int i320 = i319 + 1;
                this.toDoubleRange = i320;
                iArr128[i319] = 1;
                iArr128[i320 - 1] = -iArr128[i320 - 1];
                int i321 = i320 + 1;
                this.toDoubleRange = i321;
                iArr128[i320] = iArr128[i321 - 2];
                return 0;
            case 149:
                int i322 = this.toDoubleRange - 1;
                this.toDoubleRange = i322;
                int[] iArr129 = this.FastBitmap$CoordinateSystem;
                iArr129[i322 - 1] = iArr129[i322 - 1] - iArr129[i322];
                int i323 = i322 + 1;
                this.toDoubleRange = i323;
                iArr129[i322] = iArr129[i323 - 2];
                return 0;
            case 150:
                int[] iArr130 = this.FastBitmap$CoordinateSystem;
                int i324 = this.toDoubleRange;
                int i325 = i324 + 1;
                this.toDoubleRange = i325;
                iArr130[i324] = 29;
                int i326 = i325 + 2;
                this.toDoubleRange = i326;
                iArr130[i326 - 1] = iArr130[i326 - 3];
                iArr130[i325] = iArr130[i326 - 4];
                return 0;
            case 151:
                int i327 = this.toDoubleRange - 1;
                this.toDoubleRange = i327;
                int[] iArr131 = this.FastBitmap$CoordinateSystem;
                iArr131[i327 - 1] = iArr131[i327 - 1] | iArr131[i327];
                this.toDoubleRange = i327 + 1;
                iArr131[i327] = 1;
                return 0;
            case 152:
                int[] iArr132 = this.FastBitmap$CoordinateSystem;
                int i328 = this.toDoubleRange;
                int i329 = i328 + 1;
                this.toDoubleRange = i329;
                iArr132[i328] = 9;
                iArr132[i329 - 1] = -iArr132[i329 - 1];
                return 0;
            case 153:
                int[] iArr133 = this.FastBitmap$CoordinateSystem;
                int i330 = this.toDoubleRange;
                int i331 = i330 + 1;
                this.toDoubleRange = i331;
                iArr133[i330] = -1;
                int i332 = i331 - 1;
                this.toDoubleRange = i332;
                iArr133[i332 - 1] = iArr133[i332 - 1] ^ iArr133[i332];
                int i333 = i332 - 1;
                this.toDoubleRange = i333;
                iArr133[i333 - 1] = iArr133[i333] & iArr133[i333 - 1];
                return 0;
            case 154:
                int[] iArr134 = this.FastBitmap$CoordinateSystem;
                int i334 = this.toDoubleRange;
                int i335 = i334 + 1;
                this.toDoubleRange = i335;
                int i336 = iArr134[i335 - 2];
                iArr134[i334] = i336;
                iArr134[i335 - 2] = iArr134[i335 - 3];
                iArr134[i335 - 3] = iArr134[i335 - 4];
                iArr134[i335 - 4] = i336;
                int i337 = i335 - 1;
                this.toDoubleRange = i337;
                this.Mean$Arithmetic[i337] = null;
                int i338 = iArr134[i337 - 1];
                iArr134[i337 - 1] = iArr134[i337 - 2];
                iArr134[i337 - 2] = i338;
                return 0;
            case 155:
                int i339 = this.toDoubleRange - 1;
                this.toDoubleRange = i339;
                int[] iArr135 = this.FastBitmap$CoordinateSystem;
                iArr135[i339 - 1] = iArr135[i339 - 1] | iArr135[i339];
                int i340 = i339 + 1;
                this.toDoubleRange = i340;
                int i341 = iArr135[i340 - 2];
                iArr135[i339] = i341;
                iArr135[i340 - 2] = iArr135[i340 - 3];
                iArr135[i340 - 3] = iArr135[i340 - 4];
                iArr135[i340 - 4] = i341;
                return 0;
            case 156:
                int[] iArr136 = this.FastBitmap$CoordinateSystem;
                int i342 = this.toDoubleRange;
                int i343 = i342 + 1;
                this.toDoubleRange = i343;
                int i344 = iArr136[i343 - 2];
                iArr136[i342] = i344;
                iArr136[i343 - 2] = iArr136[i343 - 3];
                iArr136[i343 - 3] = iArr136[i343 - 4];
                iArr136[i343 - 4] = i344;
                int i345 = i343 - 1;
                this.toDoubleRange = i345;
                this.Mean$Arithmetic[i345] = null;
                iArr136[i345 - 1] = -iArr136[i345 - 1];
                return 0;
            case 157:
                int[] iArr137 = this.FastBitmap$CoordinateSystem;
                int i346 = this.toDoubleRange;
                int i347 = i346 + 2;
                this.toDoubleRange = i347;
                iArr137[i347 - 1] = iArr137[i347 - 3];
                iArr137[i346] = iArr137[i347 - 4];
                this.toDoubleRange = i347 + 1;
                iArr137[i347] = -1;
                return 0;
            case 158:
                int[] iArr138 = this.FastBitmap$CoordinateSystem;
                int i348 = this.toDoubleRange;
                int i349 = i348 + 1;
                this.toDoubleRange = i349;
                iArr138[i348] = 1;
                int i350 = i349 - 1;
                this.toDoubleRange = i350;
                iArr138[i350 - 1] = iArr138[i350 - 1] << iArr138[i350];
                int i351 = i350 + 1;
                this.toDoubleRange = i351;
                iArr138[i350] = iArr138[i351 - 2];
                return 0;
            case 159:
                int[] iArr139 = this.FastBitmap$CoordinateSystem;
                int i352 = this.toDoubleRange;
                int i353 = i352 + 1;
                this.toDoubleRange = i353;
                iArr139[i352] = -1;
                int i354 = i353 - 1;
                this.toDoubleRange = i354;
                iArr139[i354 - 1] = iArr139[i354 - 1] ^ iArr139[i354];
                int i355 = iArr139[i354 - 1];
                iArr139[i354 - 1] = iArr139[i354 - 2];
                iArr139[i354 - 2] = i355;
                return 0;
            case BlobStatic.MONITOR_IMAGE_WIDTH /*160*/:
                int[] iArr140 = this.FastBitmap$CoordinateSystem;
                int i356 = this.toDoubleRange;
                this.toDoubleRange = i356 + 1;
                iArr140[i356] = 97;
                return 0;
            case 161:
                int[] iArr141 = this.FastBitmap$CoordinateSystem;
                int i357 = this.toDoubleRange;
                iArr141[i357 - 1] = -iArr141[i357 - 1];
                int i358 = i357 + 1;
                this.toDoubleRange = i358;
                iArr141[i357] = iArr141[i358 - 2];
                return 0;
            case 162:
                int[] iArr142 = this.FastBitmap$CoordinateSystem;
                int i359 = this.toDoubleRange;
                int i360 = i359 + 1;
                this.toDoubleRange = i360;
                iArr142[i359] = -1;
                int i361 = i360 + 2;
                this.toDoubleRange = i361;
                iArr142[i361 - 1] = iArr142[i361 - 3];
                iArr142[i360] = iArr142[i361 - 4];
                int i362 = i361 - 1;
                this.toDoubleRange = i362;
                iArr142[i362 - 1] = iArr142[i362] & iArr142[i362 - 1];
                return 0;
            case 163:
                int[] iArr143 = this.FastBitmap$CoordinateSystem;
                int i363 = this.toDoubleRange;
                this.toDoubleRange = i363 + 1;
                iArr143[i363] = 90;
                return 0;
            case 164:
                int[] iArr144 = this.FastBitmap$CoordinateSystem;
                int i364 = this.toDoubleRange;
                int i365 = i364 + 1;
                this.toDoubleRange = i365;
                iArr144[i364] = 0;
                int i366 = i365 - 1;
                this.toDoubleRange = i366;
                iArr144[i366 - 1] = iArr144[i366 - 1] / iArr144[i366];
                return 0;
            case 165:
                int[] iArr145 = this.FastBitmap$CoordinateSystem;
                int i367 = this.toDoubleRange;
                int i368 = i367 + 1;
                this.toDoubleRange = i368;
                iArr145[i367] = 125;
                iArr145[i368 - 1] = -iArr145[i368 - 1];
                int i369 = i368 + 2;
                this.toDoubleRange = i369;
                iArr145[i369 - 1] = iArr145[i369 - 3];
                iArr145[i368] = iArr145[i369 - 4];
                return 0;
            case 166:
                int i370 = this.toDoubleRange - 1;
                this.toDoubleRange = i370;
                int[] iArr146 = this.FastBitmap$CoordinateSystem;
                iArr146[i370 - 1] = iArr146[i370 - 1] | iArr146[i370];
                int i371 = i370 + 2;
                this.toDoubleRange = i371;
                iArr146[i371 - 1] = iArr146[i371 - 3];
                iArr146[i370] = iArr146[i371 - 4];
                int i372 = i371 - 1;
                this.toDoubleRange = i372;
                iArr146[i372 - 1] = iArr146[i372] | iArr146[i372 - 1];
                return 0;
            case 167:
                int[] iArr147 = this.FastBitmap$CoordinateSystem;
                int i373 = this.toDoubleRange;
                int i374 = i373 + 1;
                this.toDoubleRange = i374;
                iArr147[i373] = 1;
                int i375 = i374 - 1;
                this.toDoubleRange = i375;
                iArr147[i375 - 1] = iArr147[i375 - 1] << iArr147[i375];
                int i376 = i375 + 1;
                this.toDoubleRange = i376;
                int i377 = iArr147[i376 - 2];
                iArr147[i375] = i377;
                iArr147[i376 - 2] = iArr147[i376 - 3];
                iArr147[i376 - 3] = iArr147[i376 - 4];
                iArr147[i376 - 4] = i377;
                return 0;
            case 168:
                int i378 = this.toDoubleRange - 1;
                this.toDoubleRange = i378;
                this.Mean$Arithmetic[i378] = null;
                int i379 = i378 - 1;
                this.toDoubleRange = i379;
                int[] iArr148 = this.FastBitmap$CoordinateSystem;
                iArr148[i379 - 1] = iArr148[i379] ^ iArr148[i379 - 1];
                return 0;
            case 169:
                int[] iArr149 = this.FastBitmap$CoordinateSystem;
                int i380 = this.toDoubleRange;
                this.toDoubleRange = i380 + 1;
                iArr149[i380] = 77;
                return 0;
            case 170:
                int[] iArr150 = this.FastBitmap$CoordinateSystem;
                int i381 = this.toDoubleRange;
                int i382 = i381 + 1;
                this.toDoubleRange = i382;
                iArr150[i381] = iArr150[i382 - 2];
                int i383 = i382 + 1;
                this.toDoubleRange = i383;
                iArr150[i382] = -1;
                int i384 = i383 - 1;
                this.toDoubleRange = i384;
                iArr150[i384 - 1] = iArr150[i384] ^ iArr150[i384 - 1];
                return 0;
            case 171:
                int[] iArr151 = this.FastBitmap$CoordinateSystem;
                int i385 = this.toDoubleRange;
                this.toDoubleRange = i385 + 1;
                iArr151[i385] = 61;
                return 0;
            case 172:
                int[] iArr152 = this.FastBitmap$CoordinateSystem;
                int i386 = this.toDoubleRange;
                int i387 = i386 + 1;
                this.toDoubleRange = i387;
                iArr152[i386] = 93;
                iArr152[i387 - 1] = -iArr152[i387 - 1];
                int i388 = i387 + 2;
                this.toDoubleRange = i388;
                iArr152[i388 - 1] = iArr152[i388 - 3];
                iArr152[i387] = iArr152[i388 - 4];
                return 0;
            case 173:
                int[] iArr153 = this.FastBitmap$CoordinateSystem;
                int i389 = this.toDoubleRange;
                int i390 = i389 + 1;
                this.toDoubleRange = i390;
                iArr153[i389] = 1;
                int i391 = i390 - 1;
                this.toDoubleRange = i391;
                iArr153[i391 - 1] = iArr153[i391 - 1] << iArr153[i391];
                int i392 = i391 + 2;
                this.toDoubleRange = i392;
                iArr153[i392 - 1] = iArr153[i392 - 3];
                iArr153[i391] = iArr153[i392 - 4];
                return 0;
            case 174:
                int i393 = this.toDoubleRange - 1;
                this.toDoubleRange = i393;
                int[] iArr154 = this.FastBitmap$CoordinateSystem;
                iArr154[i393 - 1] = iArr154[i393 - 1] + iArr154[i393];
                int i394 = i393 + 1;
                this.toDoubleRange = i394;
                iArr154[i393] = iArr154[i394 - 2];
                this.toDoubleRange = i394 + 1;
                iArr154[i394] = 128;
                return 0;
            case 175:
                int[] iArr155 = this.FastBitmap$CoordinateSystem;
                int i395 = this.toDoubleRange;
                this.toDoubleRange = i395 + 1;
                iArr155[i395] = 47;
                return 0;
            case 176:
                int[] iArr156 = this.FastBitmap$CoordinateSystem;
                int i396 = this.toDoubleRange;
                int i397 = i396 + 2;
                this.toDoubleRange = i397;
                iArr156[i397 - 1] = iArr156[i397 - 3];
                iArr156[i396] = iArr156[i397 - 4];
                iArr156[i397 - 1] = -iArr156[i397 - 1];
                return 0;
            case 177:
                int[] iArr157 = this.FastBitmap$CoordinateSystem;
                int i398 = this.toDoubleRange;
                iArr157[i398 - 1] = -iArr157[i398 - 1];
                int i399 = i398 - 1;
                this.toDoubleRange = i399;
                iArr157[i399 - 1] = iArr157[i399] | iArr157[i399 - 1];
                return 0;
            case 178:
                int[] iArr158 = this.FastBitmap$CoordinateSystem;
                int i400 = this.toDoubleRange;
                int i401 = i400 + 1;
                this.toDoubleRange = i401;
                iArr158[i400] = 3;
                int i402 = i401 + 1;
                this.toDoubleRange = i402;
                iArr158[i401] = 2;
                int i403 = i402 - 1;
                this.toDoubleRange = i403;
                iArr158[i403 - 1] = iArr158[i403 - 1] % iArr158[i403];
                return 0;
            case 179:
                int[] iArr159 = this.FastBitmap$CoordinateSystem;
                int i404 = this.toDoubleRange;
                int i405 = i404 + 1;
                this.toDoubleRange = i405;
                iArr159[i404] = 56;
                this.toDoubleRange = i405 + 1;
                iArr159[i405] = 0;
                return 0;
            case 180:
                int i406 = this.toDoubleRange - 1;
                this.toDoubleRange = i406;
                int[] iArr160 = this.FastBitmap$CoordinateSystem;
                iArr160[i406 - 1] = iArr160[i406 - 1] / iArr160[i406];
                return 0;
            case 181:
                int[] iArr161 = this.FastBitmap$CoordinateSystem;
                int i407 = this.toDoubleRange;
                this.toDoubleRange = i407 + 1;
                iArr161[i407] = 96;
                return 0;
            case 182:
                int[] iArr162 = this.FastBitmap$CoordinateSystem;
                int i408 = this.toDoubleRange;
                this.toDoubleRange = i408 + 1;
                iArr162[i408] = 34;
                return 0;
            case 183:
                int[] iArr163 = this.FastBitmap$CoordinateSystem;
                int i409 = this.toDoubleRange;
                this.toDoubleRange = i409 + 1;
                iArr163[i409] = 76;
                return 0;
            case 184:
                Object[] objArr17 = this.Mean$Arithmetic;
                int i410 = this.toDoubleRange;
                int i411 = i410 + 1;
                this.toDoubleRange = i411;
                objArr17[i410] = objArr17[9];
                this.toDoubleRange = i411 + 1;
                objArr17[i411] = null;
                return 0;
            case WSContextConstant.HANDSHAKE_RECEIVE_SIZE /*185*/:
                int[] iArr164 = this.FastBitmap$CoordinateSystem;
                int i412 = this.toDoubleRange;
                Object[] objArr18 = this.Mean$Arithmetic;
                Object obj7 = objArr18[i412 - 1];
                objArr18[i412 - 1] = null;
                iArr164[i412 - 1] = ((int[]) obj7).length;
                return 0;
            case 186:
                int[] iArr165 = this.FastBitmap$CoordinateSystem;
                int i413 = this.toDoubleRange;
                int i414 = i413 + 1;
                this.toDoubleRange = i414;
                iArr165[i413] = 81;
                iArr165[i414 - 1] = -iArr165[i414 - 1];
                int i415 = i414 + 2;
                this.toDoubleRange = i415;
                iArr165[i415 - 1] = iArr165[i415 - 3];
                iArr165[i414] = iArr165[i415 - 4];
                return 0;
            case 187:
                int i416 = this.toDoubleRange - 1;
                this.toDoubleRange = i416;
                int[] iArr166 = this.FastBitmap$CoordinateSystem;
                iArr166[i416 - 1] = iArr166[i416 - 1] ^ iArr166[i416];
                int i417 = iArr166[i416 - 1];
                iArr166[i416 - 1] = iArr166[i416 - 2];
                iArr166[i416 - 2] = i417;
                int i418 = i416 - 1;
                this.toDoubleRange = i418;
                this.Mean$Arithmetic[i418] = null;
                return 0;
            case TsExtractor.TS_PACKET_SIZE:
                int i419 = this.toDoubleRange - 1;
                this.toDoubleRange = i419;
                int[] iArr167 = this.FastBitmap$CoordinateSystem;
                iArr167[i419 - 1] = iArr167[i419 - 1] - iArr167[i419];
                this.toDoubleRange = i419 + 1;
                iArr167[i419] = 1;
                return 0;
            case 189:
                int[] iArr168 = this.FastBitmap$CoordinateSystem;
                int i420 = this.toDoubleRange;
                int i421 = i420 + 1;
                this.toDoubleRange = i421;
                iArr168[i420] = 35;
                iArr168[i421 - 1] = -iArr168[i421 - 1];
                return 0;
            case 190:
                int[] iArr169 = this.FastBitmap$CoordinateSystem;
                int i422 = this.toDoubleRange;
                this.toDoubleRange = i422 + 1;
                iArr169[i422] = 57;
                return 0;
            case 191:
                int i423 = this.toDoubleRange - 1;
                this.toDoubleRange = i423;
                Object[] objArr19 = this.Mean$Arithmetic;
                Object obj8 = objArr19[i423];
                objArr19[i423] = null;
                this.setMax = obj8 != null ? 1 : 0;
                return 0;
            case PsExtractor.AUDIO_STREAM:
                int[] iArr170 = this.FastBitmap$CoordinateSystem;
                int i424 = this.toDoubleRange;
                this.toDoubleRange = i424 + 1;
                iArr170[i424] = 113;
                return 0;
            case 193:
                int[] iArr171 = this.FastBitmap$CoordinateSystem;
                int i425 = this.toDoubleRange;
                int i426 = i425 + 1;
                this.toDoubleRange = i426;
                iArr171[i425] = iArr171[i426 - 2];
                int i427 = i426 + 1;
                this.toDoubleRange = i427;
                iArr171[i426] = -1;
                int i428 = i427 + 2;
                this.toDoubleRange = i428;
                iArr171[i428 - 1] = iArr171[i428 - 3];
                iArr171[i427] = iArr171[i428 - 4];
                return 0;
            case 194:
                int[] iArr172 = this.FastBitmap$CoordinateSystem;
                int i429 = this.toDoubleRange;
                int i430 = iArr172[i429 - 1];
                iArr172[i429 - 1] = iArr172[i429 - 2];
                iArr172[i429 - 2] = i430;
                int i431 = i429 - 1;
                this.toDoubleRange = i431;
                this.Mean$Arithmetic[i431] = null;
                int i432 = i431 + 2;
                this.toDoubleRange = i432;
                iArr172[i432 - 1] = iArr172[i432 - 3];
                iArr172[i431] = iArr172[i432 - 4];
                return 0;
            case 195:
                int i433 = this.toDoubleRange - 1;
                this.toDoubleRange = i433;
                int[] iArr173 = this.FastBitmap$CoordinateSystem;
                iArr173[i433 - 1] = iArr173[i433 - 1] | iArr173[i433];
                int i434 = i433 - 1;
                this.toDoubleRange = i434;
                iArr173[i434 - 1] = iArr173[i434 - 1] + iArr173[i434];
                this.toDoubleRange = i434 + 1;
                iArr173[i434] = 1;
                return 0;
            case 196:
                int[] iArr174 = this.FastBitmap$CoordinateSystem;
                int i435 = this.toDoubleRange;
                int i436 = i435 + 2;
                this.toDoubleRange = i436;
                iArr174[i436 - 1] = iArr174[i436 - 3];
                iArr174[i435] = iArr174[i436 - 4];
                iArr174[i436 - 1] = -iArr174[i436 - 1];
                int i437 = i436 - 1;
                this.toDoubleRange = i437;
                iArr174[i437 - 1] = iArr174[i437] & iArr174[i437 - 1];
                return 0;
            case 197:
                int[] iArr175 = this.FastBitmap$CoordinateSystem;
                int i438 = this.toDoubleRange;
                this.toDoubleRange = i438 + 1;
                iArr175[i438] = 81;
                return 0;
            case 198:
                int i439 = this.toDoubleRange - 1;
                this.toDoubleRange = i439;
                int[] iArr176 = this.FastBitmap$CoordinateSystem;
                iArr176[i439 - 1] = iArr176[i439 - 1] & iArr176[i439];
                int i440 = i439 - 1;
                this.toDoubleRange = i440;
                iArr176[i440 - 1] = iArr176[i440 - 1] | iArr176[i440];
                this.toDoubleRange = i440 + 1;
                iArr176[i440] = 1;
                return 0;
            case SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR /*199*/:
                int i441 = this.toDoubleRange - 1;
                this.toDoubleRange = i441;
                this.Mean$Arithmetic[i441] = null;
                int i442 = i441 - 1;
                this.toDoubleRange = i442;
                int[] iArr177 = this.FastBitmap$CoordinateSystem;
                iArr177[i442 - 1] = iArr177[i442 - 1] & iArr177[i442];
                this.toDoubleRange = i442 + 1;
                iArr177[i442] = 1;
                return 0;
            case 200:
                int[] iArr178 = this.FastBitmap$CoordinateSystem;
                int i443 = this.toDoubleRange;
                this.toDoubleRange = i443 + 1;
                iArr178[i443] = 52;
                return 0;
            case 201:
                int[] iArr179 = this.FastBitmap$CoordinateSystem;
                int i444 = this.toDoubleRange;
                this.toDoubleRange = i444 + 1;
                iArr179[i444] = 7;
                return 0;
            case 202:
                int[] iArr180 = this.FastBitmap$CoordinateSystem;
                int i445 = this.toDoubleRange;
                this.toDoubleRange = i445 + 1;
                iArr180[i445] = 4;
                return 0;
            case 203:
                int[] iArr181 = this.FastBitmap$CoordinateSystem;
                int i446 = this.toDoubleRange;
                this.toDoubleRange = i446 + 1;
                iArr181[i446] = 5;
                return 0;
            case 204:
                int i447 = this.toDoubleRange - 1;
                this.toDoubleRange = i447;
                int[] iArr182 = this.FastBitmap$CoordinateSystem;
                iArr182[i447 - 1] = iArr182[i447 - 1] / iArr182[i447];
                int i448 = i447 - 1;
                this.toDoubleRange = i448;
                this.Mean$Arithmetic[i448] = null;
                return 0;
            case 205:
                int[] iArr183 = this.FastBitmap$CoordinateSystem;
                int i449 = this.toDoubleRange;
                this.toDoubleRange = i449 + 1;
                iArr183[i449] = 73;
                return 0;
            case 206:
                Object[] objArr20 = this.Mean$Arithmetic;
                int i450 = this.toDoubleRange;
                int i451 = i450 + 1;
                this.toDoubleRange = i451;
                objArr20[i450] = objArr20[9];
                this.toDoubleRange = i451 + 1;
                objArr20[i451] = objArr20[10];
                return 0;
            case 207:
                int[] iArr184 = this.FastBitmap$CoordinateSystem;
                int i452 = this.toDoubleRange;
                this.toDoubleRange = i452 + 1;
                iArr184[i452] = 55;
                return 0;
            case 208:
                int[] iArr185 = this.FastBitmap$CoordinateSystem;
                int i453 = this.toDoubleRange;
                this.toDoubleRange = i453 + 1;
                iArr185[i453] = 86;
                return 0;
            case 209:
                int[] iArr186 = this.FastBitmap$CoordinateSystem;
                int i454 = this.toDoubleRange;
                int i455 = i454 + 1;
                this.toDoubleRange = i455;
                iArr186[i454] = 80;
                this.toDoubleRange = i455 + 1;
                iArr186[i455] = 0;
                return 0;
            case 210:
                this.setMax = this.FastBitmap$CoordinateSystem[this.toDoubleRange - 1];
                return 0;
            case 211:
                int[] iArr187 = this.FastBitmap$CoordinateSystem;
                int i456 = this.toDoubleRange;
                this.toDoubleRange = i456 + 1;
                iArr187[i456] = 74;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_STORE_LOW_VERSION_DATA_FILE /*212*/:
                int[] iArr188 = this.FastBitmap$CoordinateSystem;
                int i457 = this.toDoubleRange;
                this.toDoubleRange = i457 + 1;
                iArr188[i457] = 78;
                return 0;
            case 213:
                int[] iArr189 = this.FastBitmap$CoordinateSystem;
                int i458 = this.toDoubleRange;
                this.toDoubleRange = i458 + 1;
                iArr189[i458] = 83;
                return 0;
            case 214:
                int[] iArr190 = this.FastBitmap$CoordinateSystem;
                int i459 = this.toDoubleRange;
                int i460 = i459 + 1;
                this.toDoubleRange = i460;
                iArr190[i459] = 23;
                int i461 = i460 + 2;
                this.toDoubleRange = i461;
                iArr190[i461 - 1] = iArr190[i461 - 3];
                iArr190[i460] = iArr190[i461 - 4];
                int i462 = i461 + 2;
                this.toDoubleRange = i462;
                iArr190[i462 - 1] = iArr190[i462 - 3];
                iArr190[i461] = iArr190[i462 - 4];
                return 0;
            case 215:
                int[] iArr191 = this.FastBitmap$CoordinateSystem;
                int i463 = this.toDoubleRange;
                iArr191[i463 - 1] = -iArr191[i463 - 1];
                int i464 = i463 + 2;
                this.toDoubleRange = i464;
                iArr191[i464 - 1] = iArr191[i464 - 3];
                iArr191[i463] = iArr191[i464 - 4];
                int i465 = i464 - 1;
                this.toDoubleRange = i465;
                iArr191[i465 - 1] = iArr191[i465] ^ iArr191[i465 - 1];
                return 0;
            case 216:
                int[] iArr192 = this.FastBitmap$CoordinateSystem;
                int i466 = this.toDoubleRange;
                int i467 = i466 + 1;
                this.toDoubleRange = i467;
                iArr192[i466] = 33;
                int i468 = i467 + 1;
                this.toDoubleRange = i468;
                iArr192[i467] = iArr192[i468 - 2];
                this.toDoubleRange = i468 + 1;
                iArr192[i468] = -1;
                return 0;
            case FileUtils.JPEG_MARKER_EOI /*217*/:
                int[] iArr193 = this.FastBitmap$CoordinateSystem;
                int i469 = this.toDoubleRange;
                this.toDoubleRange = i469 + 1;
                iArr193[i469] = 3;
                return 0;
            case 218:
                int i470 = this.toDoubleRange - 1;
                this.toDoubleRange = i470;
                int[] iArr194 = this.FastBitmap$CoordinateSystem;
                iArr194[i470 - 1] = iArr194[i470 - 1] * iArr194[i470];
                return 0;
            case 219:
                int i471 = this.toDoubleRange - 1;
                this.toDoubleRange = i471;
                Object[] objArr21 = this.Mean$Arithmetic;
                Object obj9 = objArr21[i471];
                objArr21[i471] = null;
                this.setMax = obj9 == null ? 1 : 0;
                return 0;
            case WheelView.DIVIDER_ALPHA /*220*/:
                int[] iArr195 = this.FastBitmap$CoordinateSystem;
                int i472 = this.toDoubleRange;
                this.toDoubleRange = i472 + 1;
                iArr195[i472] = 25;
                return 0;
            case 221:
                int i473 = this.toDoubleRange - 1;
                this.toDoubleRange = i473;
                int[] iArr196 = this.FastBitmap$CoordinateSystem;
                iArr196[i473 - 1] = iArr196[i473 - 1] << iArr196[i473];
                int i474 = i473 + 1;
                this.toDoubleRange = i474;
                int i475 = iArr196[i474 - 2];
                iArr196[i473] = i475;
                iArr196[i474 - 2] = iArr196[i474 - 3];
                iArr196[i474 - 3] = iArr196[i474 - 4];
                iArr196[i474 - 4] = i475;
                return 0;
            case 222:
                int i476 = this.toDoubleRange - 1;
                this.toDoubleRange = i476;
                int[] iArr197 = this.FastBitmap$CoordinateSystem;
                iArr197[i476 - 1] = iArr197[i476 - 1] & iArr197[i476];
                int i477 = i476 + 1;
                this.toDoubleRange = i477;
                iArr197[i476] = -1;
                int i478 = i477 - 1;
                this.toDoubleRange = i478;
                iArr197[i478 - 1] = iArr197[i478] ^ iArr197[i478 - 1];
                return 0;
            case 223:
                int i479 = this.toDoubleRange - 1;
                this.toDoubleRange = i479;
                int[] iArr198 = this.FastBitmap$CoordinateSystem;
                iArr198[i479 - 1] = iArr198[i479 - 1] & iArr198[i479];
                int i480 = i479 + 1;
                this.toDoubleRange = i480;
                iArr198[i479] = iArr198[i480 - 2];
                iArr198[i480 - 1] = -iArr198[i480 - 1];
                return 0;
            case 224:
                int[] iArr199 = this.FastBitmap$CoordinateSystem;
                int i481 = this.toDoubleRange;
                int i482 = i481 + 1;
                this.toDoubleRange = i482;
                iArr199[i481] = 1;
                int i483 = i482 - 1;
                this.toDoubleRange = i483;
                iArr199[i483 - 1] = iArr199[i483 - 1] - iArr199[i483];
                int i484 = i483 + 1;
                this.toDoubleRange = i484;
                iArr199[i483] = iArr199[i484 - 2];
                return 0;
            case 225:
                int[] iArr200 = this.FastBitmap$CoordinateSystem;
                int i485 = this.toDoubleRange;
                this.toDoubleRange = i485 + 1;
                iArr200[i485] = 119;
                return 0;
            case 226:
                int[] iArr201 = this.FastBitmap$CoordinateSystem;
                int i486 = this.toDoubleRange;
                int i487 = i486 + 1;
                this.toDoubleRange = i487;
                iArr201[i486] = 85;
                iArr201[i487 - 1] = -iArr201[i487 - 1];
                return 0;
            case 227:
                int[] iArr202 = this.FastBitmap$CoordinateSystem;
                int i488 = this.toDoubleRange;
                this.toDoubleRange = i488 + 1;
                iArr202[i488] = 89;
                return 0;
            case 228:
                Object[] objArr22 = this.Mean$Arithmetic;
                int i489 = this.toDoubleRange;
                int i490 = i489 + 1;
                this.toDoubleRange = i490;
                objArr22[i489] = objArr22[9];
                int i491 = i490 + 1;
                this.toDoubleRange = i491;
                objArr22[i490] = objArr22[9];
                int i492 = i491 + 1;
                this.toDoubleRange = i492;
                objArr22[i491] = objArr22[i492 - 2];
                return 0;
            case 229:
                int[] iArr203 = this.FastBitmap$CoordinateSystem;
                int i493 = this.toDoubleRange;
                int i494 = i493 + 1;
                this.toDoubleRange = i494;
                iArr203[i493] = 49;
                int i495 = i494 + 2;
                this.toDoubleRange = i495;
                iArr203[i495 - 1] = iArr203[i495 - 3];
                iArr203[i494] = iArr203[i495 - 4];
                int i496 = i495 + 2;
                this.toDoubleRange = i496;
                iArr203[i496 - 1] = iArr203[i496 - 3];
                iArr203[i495] = iArr203[i496 - 4];
                return 0;
            case 230:
                int i497 = this.toDoubleRange - 1;
                this.toDoubleRange = i497;
                int[] iArr204 = this.FastBitmap$CoordinateSystem;
                iArr204[i497 - 1] = iArr204[i497 - 1] ^ iArr204[i497];
                int i498 = i497 - 1;
                this.toDoubleRange = i498;
                iArr204[i498 - 1] = iArr204[i498 - 1] - iArr204[i498];
                int i499 = i498 + 1;
                this.toDoubleRange = i499;
                iArr204[i498] = iArr204[i499 - 2];
                return 0;
            case 231:
                int i500 = this.toDoubleRange - 1;
                this.toDoubleRange = i500;
                int[] iArr205 = this.FastBitmap$CoordinateSystem;
                iArr205[i500 - 1] = iArr205[i500 - 1] | iArr205[i500];
                int i501 = i500 - 1;
                this.toDoubleRange = i501;
                iArr205[i501 - 1] = iArr205[i501 - 1] + iArr205[i501];
                int i502 = i501 + 1;
                this.toDoubleRange = i502;
                iArr205[i501] = iArr205[i502 - 2];
                return 0;
            case 232:
                int[] iArr206 = this.FastBitmap$CoordinateSystem;
                int i503 = this.toDoubleRange;
                this.toDoubleRange = i503 + 1;
                iArr206[i503] = 59;
                return 0;
            case 233:
                int[] iArr207 = this.FastBitmap$CoordinateSystem;
                int i504 = this.toDoubleRange;
                int i505 = i504 + 1;
                this.toDoubleRange = i505;
                iArr207[i504] = 1;
                int i506 = i505 - 1;
                this.toDoubleRange = i506;
                iArr207[i506 - 1] = iArr207[i506 - 1] << iArr207[i506];
                iArr207[i506 - 1] = -iArr207[i506 - 1];
                return 0;
            case 234:
                int[] iArr208 = this.FastBitmap$CoordinateSystem;
                int i507 = this.toDoubleRange;
                int i508 = i507 + 1;
                this.toDoubleRange = i508;
                iArr208[i507] = 59;
                int i509 = i508 + 2;
                this.toDoubleRange = i509;
                iArr208[i509 - 1] = iArr208[i509 - 3];
                iArr208[i508] = iArr208[i509 - 4];
                int i510 = i509 + 2;
                this.toDoubleRange = i510;
                iArr208[i510 - 1] = iArr208[i510 - 3];
                iArr208[i509] = iArr208[i510 - 4];
                return 0;
            case 235:
                int i511 = this.toDoubleRange - 1;
                this.toDoubleRange = i511;
                this.Mean$Arithmetic[i511] = null;
                int i512 = i511 - 1;
                this.toDoubleRange = i512;
                int[] iArr209 = this.FastBitmap$CoordinateSystem;
                iArr209[i512 - 1] = iArr209[i512 - 1] ^ iArr209[i512];
                int i513 = i512 + 2;
                this.toDoubleRange = i513;
                iArr209[i513 - 1] = iArr209[i513 - 3];
                iArr209[i512] = iArr209[i513 - 4];
                return 0;
            case 236:
                int[] iArr210 = this.FastBitmap$CoordinateSystem;
                int i514 = this.toDoubleRange;
                this.toDoubleRange = i514 + 1;
                iArr210[i514] = 26;
                return 0;
            case 237:
                int i515 = this.toDoubleRange - 1;
                this.toDoubleRange = i515;
                this.Mean$Arithmetic[i515] = null;
                int i516 = i515 - 1;
                this.toDoubleRange = i516;
                int[] iArr211 = this.FastBitmap$CoordinateSystem;
                iArr211[i516 - 1] = iArr211[i516 - 1] & iArr211[i516];
                int i517 = i516 + 1;
                this.toDoubleRange = i517;
                int i518 = iArr211[i517 - 2];
                iArr211[i516] = i518;
                iArr211[i517 - 2] = iArr211[i517 - 3];
                iArr211[i517 - 3] = iArr211[i517 - 4];
                iArr211[i517 - 4] = i518;
                return 0;
            case 238:
                int[] iArr212 = this.FastBitmap$CoordinateSystem;
                int i519 = this.toDoubleRange;
                int i520 = i519 + 1;
                this.toDoubleRange = i520;
                iArr212[i519] = 79;
                int i521 = i520 + 1;
                this.toDoubleRange = i521;
                iArr212[i520] = iArr212[i521 - 2];
                this.toDoubleRange = i521 + 1;
                iArr212[i521] = -1;
                return 0;
            case 239:
                int[] iArr213 = this.FastBitmap$CoordinateSystem;
                int i522 = this.toDoubleRange;
                int i523 = i522 + 2;
                this.toDoubleRange = i523;
                iArr213[i523 - 1] = iArr213[i523 - 3];
                iArr213[i522] = iArr213[i523 - 4];
                iArr213[i523 - 1] = -iArr213[i523 - 1];
                int i524 = i523 - 1;
                this.toDoubleRange = i524;
                iArr213[i524 - 1] = iArr213[i524] | iArr213[i524 - 1];
                return 0;
            case 240:
                int[] iArr214 = this.FastBitmap$CoordinateSystem;
                int i525 = this.toDoubleRange;
                iArr214[i525 - 1] = -iArr214[i525 - 1];
                int i526 = i525 - 1;
                this.toDoubleRange = i526;
                iArr214[i526 - 1] = iArr214[i526 - 1] ^ iArr214[i526];
                int i527 = i526 - 1;
                this.toDoubleRange = i527;
                iArr214[i527 - 1] = iArr214[i527 - 1] - iArr214[i527];
                return 0;
            case 241:
                int i528 = this.toDoubleRange - 1;
                this.toDoubleRange = i528;
                int[] iArr215 = this.FastBitmap$CoordinateSystem;
                iArr215[i528 - 1] = iArr215[i528 - 1] | iArr215[i528];
                int i529 = i528 - 1;
                this.toDoubleRange = i529;
                iArr215[i529 - 1] = iArr215[i529] & iArr215[i529 - 1];
                return 0;
            case 242:
                int[] iArr216 = this.FastBitmap$CoordinateSystem;
                int i530 = this.toDoubleRange;
                int i531 = i530 + 1;
                this.toDoubleRange = i531;
                iArr216[i530] = 107;
                iArr216[i531 - 1] = -iArr216[i531 - 1];
                return 0;
            case 243:
                int[] iArr217 = this.FastBitmap$CoordinateSystem;
                int i532 = this.toDoubleRange;
                int i533 = i532 + 1;
                this.toDoubleRange = i533;
                iArr217[i532] = -1;
                int i534 = i533 + 2;
                this.toDoubleRange = i534;
                iArr217[i534 - 1] = iArr217[i534 - 3];
                iArr217[i533] = iArr217[i534 - 4];
                return 0;
            case 244:
                int i535 = this.toDoubleRange - 1;
                this.toDoubleRange = i535;
                int[] iArr218 = this.FastBitmap$CoordinateSystem;
                iArr218[i535 - 1] = iArr218[i535 - 1] & iArr218[i535];
                this.toDoubleRange = i535 + 1;
                iArr218[i535] = -1;
                return 0;
            case 245:
                int i536 = this.toDoubleRange - 1;
                this.toDoubleRange = i536;
                this.Mean$Arithmetic[i536] = null;
                int i537 = i536 - 1;
                this.toDoubleRange = i537;
                int[] iArr219 = this.FastBitmap$CoordinateSystem;
                iArr219[i537 - 1] = iArr219[i537 - 1] | iArr219[i537];
                int i538 = i537 - 1;
                this.toDoubleRange = i538;
                iArr219[i538 - 1] = iArr219[i538] & iArr219[i538 - 1];
                return 0;
            case 246:
                int i539 = this.toDoubleRange - 1;
                this.toDoubleRange = i539;
                this.Mean$Arithmetic[i539] = null;
                int i540 = i539 - 1;
                this.toDoubleRange = i540;
                int[] iArr220 = this.FastBitmap$CoordinateSystem;
                iArr220[i540 - 1] = iArr220[i540 - 1] - iArr220[i540];
                return 0;
            case 247:
                int[] iArr221 = this.FastBitmap$CoordinateSystem;
                int i541 = this.toDoubleRange;
                int i542 = i541 + 1;
                this.toDoubleRange = i542;
                iArr221[i541] = 1;
                iArr221[i542 - 1] = -iArr221[i542 - 1];
                int i543 = i542 + 2;
                this.toDoubleRange = i543;
                iArr221[i543 - 1] = iArr221[i543 - 3];
                iArr221[i542] = iArr221[i543 - 4];
                return 0;
            case 248:
                int[] iArr222 = this.FastBitmap$CoordinateSystem;
                int i544 = this.toDoubleRange;
                iArr222[i544 - 1] = -iArr222[i544 - 1];
                int i545 = i544 + 2;
                this.toDoubleRange = i545;
                iArr222[i545 - 1] = iArr222[i545 - 3];
                iArr222[i544] = iArr222[i545 - 4];
                iArr222[i545 - 1] = -iArr222[i545 - 1];
                return 0;
            case 249:
                int[] iArr223 = this.FastBitmap$CoordinateSystem;
                int i546 = this.toDoubleRange;
                this.toDoubleRange = i546 + 1;
                iArr223[i546] = 69;
                return 0;
            case SQLiteDatabase.MAX_SQL_CACHE_SIZE /*250*/:
                int[] iArr224 = this.FastBitmap$CoordinateSystem;
                int i547 = this.toDoubleRange;
                this.toDoubleRange = i547 + 1;
                iArr224[i547] = 19;
                return 0;
            case 251:
                int[] iArr225 = this.FastBitmap$CoordinateSystem;
                int i548 = this.toDoubleRange;
                int i549 = i548 + 1;
                this.toDoubleRange = i549;
                iArr225[i548] = -1;
                int i550 = i549 - 1;
                this.toDoubleRange = i550;
                iArr225[i550 - 1] = iArr225[i550 - 1] ^ iArr225[i550];
                int i551 = i550 + 1;
                this.toDoubleRange = i551;
                int i552 = iArr225[i551 - 2];
                iArr225[i550] = i552;
                iArr225[i551 - 2] = iArr225[i551 - 3];
                iArr225[i551 - 3] = iArr225[i551 - 4];
                iArr225[i551 - 4] = i552;
                return 0;
            case 252:
                int i553 = this.toDoubleRange - 1;
                this.toDoubleRange = i553;
                int[] iArr226 = this.FastBitmap$CoordinateSystem;
                iArr226[i553 - 1] = iArr226[i553 - 1] + iArr226[i553];
                int i554 = i553 + 1;
                this.toDoubleRange = i554;
                iArr226[i553] = 1;
                iArr226[i554 - 1] = -iArr226[i554 - 1];
                return 0;
            case 253:
                int[] iArr227 = this.FastBitmap$CoordinateSystem;
                int i555 = this.toDoubleRange;
                int i556 = i555 + 1;
                this.toDoubleRange = i556;
                iArr227[i555] = 1;
                int i557 = i556 - 1;
                this.toDoubleRange = i557;
                iArr227[i557 - 1] = iArr227[i557 - 1] - iArr227[i557];
                return 0;
            case 254:
                int[] iArr228 = this.FastBitmap$CoordinateSystem;
                int i558 = this.toDoubleRange;
                this.toDoubleRange = i558 + 1;
                iArr228[i558] = 95;
                return 0;
            case 255:
                int[] iArr229 = this.FastBitmap$CoordinateSystem;
                int i559 = this.toDoubleRange;
                int i560 = i559 + 1;
                this.toDoubleRange = i560;
                iArr229[i559] = -1;
                int i561 = i560 + 2;
                this.toDoubleRange = i561;
                iArr229[i561 - 1] = iArr229[i561 - 3];
                iArr229[i560] = iArr229[i561 - 4];
                this.toDoubleRange = i561 + 1;
                iArr229[i561] = -1;
                return 0;
            case 256:
                int[] iArr230 = this.FastBitmap$CoordinateSystem;
                int i562 = this.toDoubleRange;
                iArr230[i562 - 1] = -iArr230[i562 - 1];
                int i563 = i562 - 1;
                this.toDoubleRange = i563;
                iArr230[i563 - 1] = iArr230[i563 - 1] & iArr230[i563];
                this.toDoubleRange = i563 + 1;
                iArr230[i563] = 1;
                return 0;
            case 257:
                int[] iArr231 = this.FastBitmap$CoordinateSystem;
                int i564 = this.toDoubleRange;
                int i565 = i564 + 1;
                this.toDoubleRange = i565;
                iArr231[i564] = 81;
                iArr231[i565 - 1] = -iArr231[i565 - 1];
                return 0;
            case 258:
                int[] iArr232 = this.FastBitmap$CoordinateSystem;
                int i566 = this.toDoubleRange;
                int i567 = i566 + 1;
                this.toDoubleRange = i567;
                iArr232[i566] = 39;
                int i568 = i567 + 2;
                this.toDoubleRange = i568;
                iArr232[i568 - 1] = iArr232[i568 - 3];
                iArr232[i567] = iArr232[i568 - 4];
                return 0;
            case 259:
                int[] iArr233 = this.FastBitmap$CoordinateSystem;
                int i569 = this.toDoubleRange;
                int i570 = i569 + 1;
                this.toDoubleRange = i570;
                iArr233[i569] = 73;
                int i571 = i570 + 1;
                this.toDoubleRange = i571;
                iArr233[i570] = iArr233[i571 - 2];
                this.toDoubleRange = i571 + 1;
                iArr233[i571] = -1;
                return 0;
            case 260:
                int i572 = this.toDoubleRange - 1;
                this.toDoubleRange = i572;
                int[] iArr234 = this.FastBitmap$CoordinateSystem;
                iArr234[i572 - 1] = iArr234[i572 - 1] | iArr234[i572];
                int i573 = i572 - 1;
                this.toDoubleRange = i573;
                iArr234[i573 - 1] = iArr234[i573 - 1] & iArr234[i573];
                int i574 = iArr234[i573 - 1];
                iArr234[i573 - 1] = iArr234[i573 - 2];
                iArr234[i573 - 2] = i574;
                return 0;
            case 261:
                Object[] objArr23 = this.Mean$Arithmetic;
                int i575 = this.toDoubleRange;
                int i576 = i575 + 1;
                this.toDoubleRange = i576;
                Object obj10 = objArr23[i576 - 2];
                objArr23[i576 - 2] = null;
                objArr23[i575] = obj10;
                Object obj11 = objArr23[i576 - 3];
                objArr23[i576 - 3] = null;
                objArr23[i576 - 2] = obj11;
                objArr23[i576 - 3] = obj10;
                return 0;
            case 262:
                int[] iArr235 = this.FastBitmap$CoordinateSystem;
                int i577 = this.toDoubleRange;
                this.toDoubleRange = i577 + 1;
                iArr235[i577] = 91;
                return 0;
            case 263:
                int[] iArr236 = this.FastBitmap$CoordinateSystem;
                int i578 = this.toDoubleRange;
                int i579 = i578 + 1;
                this.toDoubleRange = i579;
                iArr236[i578] = 41;
                iArr236[i579 - 1] = -iArr236[i579 - 1];
                return 0;
            case 264:
                int[] iArr237 = this.FastBitmap$CoordinateSystem;
                int i580 = this.toDoubleRange;
                iArr237[i580 - 1] = -iArr237[i580 - 1];
                int i581 = i580 - 1;
                this.toDoubleRange = i581;
                iArr237[i581 - 1] = iArr237[i581 - 1] & iArr237[i581];
                int i582 = i581 + 1;
                this.toDoubleRange = i582;
                int i583 = iArr237[i582 - 2];
                iArr237[i581] = i583;
                iArr237[i582 - 2] = iArr237[i582 - 3];
                iArr237[i582 - 3] = iArr237[i582 - 4];
                iArr237[i582 - 4] = i583;
                return 0;
            case 265:
                int[] iArr238 = this.FastBitmap$CoordinateSystem;
                int i584 = this.toDoubleRange;
                this.toDoubleRange = i584 + 1;
                iArr238[i584] = 4;
                return 0;
            case 266:
                int[] iArr239 = this.FastBitmap$CoordinateSystem;
                int i585 = this.toDoubleRange;
                this.toDoubleRange = i585 + 1;
                iArr239[i585] = 65;
                return 0;
            case 267:
                int[] iArr240 = this.FastBitmap$CoordinateSystem;
                int i586 = this.toDoubleRange;
                int i587 = i586 + 1;
                this.toDoubleRange = i587;
                iArr240[i586] = iArr240[i587 - 2];
                iArr240[i587 - 1] = -iArr240[i587 - 1];
                this.toDoubleRange = i587 + 1;
                iArr240[i587] = -1;
                return 0;
            case 268:
                int[] iArr241 = this.FastBitmap$CoordinateSystem;
                int i588 = this.toDoubleRange;
                int i589 = i588 + 1;
                this.toDoubleRange = i589;
                iArr241[i588] = 67;
                int i590 = i589 + 1;
                this.toDoubleRange = i590;
                iArr241[i589] = 0;
                int i591 = i590 - 1;
                this.toDoubleRange = i591;
                iArr241[i591 - 1] = iArr241[i591 - 1] / iArr241[i591];
                return 0;
            case 269:
                int[] iArr242 = this.FastBitmap$CoordinateSystem;
                int i592 = this.toDoubleRange;
                this.toDoubleRange = i592 + 1;
                iArr242[i592] = 40;
                return 0;
            case 270:
                int[] iArr243 = this.FastBitmap$CoordinateSystem;
                int i593 = this.toDoubleRange;
                int i594 = i593 + 1;
                this.toDoubleRange = i594;
                iArr243[i593] = 18;
                this.toDoubleRange = i594 + 1;
                iArr243[i594] = 0;
                return 0;
            case 271:
                int i595 = this.toDoubleRange - 1;
                this.toDoubleRange = i595;
                int[] iArr244 = this.FastBitmap$CoordinateSystem;
                iArr244[i595 - 1] = iArr244[i595 - 1] & iArr244[i595];
                int i596 = i595 - 1;
                this.toDoubleRange = i596;
                iArr244[i596 - 1] = iArr244[i596 - 1] | iArr244[i596];
                int i597 = i596 + 1;
                this.toDoubleRange = i597;
                int i598 = iArr244[i597 - 2];
                iArr244[i596] = i598;
                iArr244[i597 - 2] = iArr244[i597 - 3];
                iArr244[i597 - 3] = iArr244[i597 - 4];
                iArr244[i597 - 4] = i598;
                return 0;
            case LZMA_Base.kNumLenSymbols:
                int i599 = this.toDoubleRange - 1;
                this.toDoubleRange = i599;
                int[] iArr245 = this.FastBitmap$CoordinateSystem;
                iArr245[i599 - 1] = iArr245[i599 - 1] << iArr245[i599];
                iArr245[i599 - 1] = -iArr245[i599 - 1];
                return 0;
            case LZMA_Base.kMatchMaxLen:
                int[] iArr246 = this.FastBitmap$CoordinateSystem;
                int i600 = this.toDoubleRange;
                this.toDoubleRange = i600 + 1;
                iArr246[i600] = 27;
                return 0;
            case 274:
                int[] iArr247 = this.FastBitmap$CoordinateSystem;
                int i601 = this.toDoubleRange;
                this.toDoubleRange = i601 + 1;
                iArr247[i601] = 43;
                return 0;
            case 275:
                int[] iArr248 = this.FastBitmap$CoordinateSystem;
                int i602 = this.toDoubleRange;
                this.toDoubleRange = i602 + 1;
                iArr248[i602] = 93;
                return 0;
            case 276:
                int i603 = this.toDoubleRange - 1;
                this.toDoubleRange = i603;
                int[] iArr249 = this.FastBitmap$CoordinateSystem;
                iArr249[i603 - 1] = iArr249[i603 - 1] ^ iArr249[i603];
                int i604 = i603 - 1;
                this.toDoubleRange = i604;
                iArr249[i604 - 1] = iArr249[i604 - 1] ^ iArr249[i604];
                int i605 = i604 - 1;
                this.toDoubleRange = i605;
                this.Mean$Arithmetic[i605] = null;
                return 0;
            case 277:
                int[] iArr250 = this.FastBitmap$CoordinateSystem;
                int i606 = this.toDoubleRange;
                int i607 = i606 + 1;
                this.toDoubleRange = i607;
                iArr250[i606] = 2;
                int i608 = i607 - 1;
                this.toDoubleRange = i608;
                iArr250[i608 - 1] = iArr250[i608 - 1] % iArr250[i608];
                int i609 = i608 - 1;
                this.toDoubleRange = i609;
                this.Mean$Arithmetic[i609] = null;
                return 0;
            case 278:
                int[] iArr251 = this.FastBitmap$CoordinateSystem;
                int i610 = this.toDoubleRange;
                this.toDoubleRange = i610 + 1;
                iArr251[i610] = 58;
                return 0;
            case 279:
                int[] iArr252 = this.FastBitmap$CoordinateSystem;
                int i611 = this.toDoubleRange;
                int i612 = i611 + 1;
                this.toDoubleRange = i612;
                iArr252[i611] = 65;
                int i613 = i612 + 2;
                this.toDoubleRange = i613;
                iArr252[i613 - 1] = iArr252[i613 - 3];
                iArr252[i612] = iArr252[i613 - 4];
                int i614 = i613 + 2;
                this.toDoubleRange = i614;
                iArr252[i614 - 1] = iArr252[i614 - 3];
                iArr252[i613] = iArr252[i614 - 4];
                return 0;
            case 280:
                int[] iArr253 = this.FastBitmap$CoordinateSystem;
                int i615 = this.toDoubleRange;
                int i616 = i615 + 1;
                this.toDoubleRange = i616;
                iArr253[i615] = 117;
                int i617 = i616 + 2;
                this.toDoubleRange = i617;
                iArr253[i617 - 1] = iArr253[i617 - 3];
                iArr253[i616] = iArr253[i617 - 4];
                return 0;
            case 281:
                int i618 = this.toDoubleRange - 1;
                this.toDoubleRange = i618;
                int[] iArr254 = this.FastBitmap$CoordinateSystem;
                iArr254[i618 - 1] = iArr254[i618 - 1] & iArr254[i618];
                int i619 = i618 - 1;
                this.toDoubleRange = i619;
                iArr254[i619 - 1] = iArr254[i619 - 1] | iArr254[i619];
                iArr254[i619 - 1] = -iArr254[i619 - 1];
                return 0;
            default:
                return i;
        }
        return 0;
    }
}
