package o;

import com.alibaba.griver.image.framework.utils.FileUtils;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.iap.android.aplog.util.zip.LZMA_Base;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.appsflyer.BuildConfig;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.savings.activity.SavingsActivity;
import net.sqlcipher.database.SQLiteDatabase;

public class setScrollingCacheEnabled {
    private final float[] FastBitmap$CoordinateSystem = new float[13];
    private final double[] Grayscale$Algorithm = new double[13];
    public float IsOverlapping;
    private final Object[] Mean$Arithmetic;
    public Object equals;
    public float getMax;
    public int getMin;
    private int hashCode;
    public double isInside;
    public int length;
    public long setMax;
    public long setMin;
    private int toDoubleRange;
    public double toFloatRange;
    public Object toIntRange;
    private final long[] toString = new long[13];
    private final int[] values = new int[13];

    public setScrollingCacheEnabled(Object obj) {
        Object[] objArr = new Object[13];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        this.toDoubleRange = 0;
        this.hashCode = -1;
    }

    public setScrollingCacheEnabled(Object obj, Object obj2) {
        Object[] objArr = new Object[13];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        this.toDoubleRange = 0;
        this.hashCode = -1;
    }

    public setScrollingCacheEnabled(Object obj, Object obj2, Object obj3) {
        Object[] objArr = new Object[13];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        this.toDoubleRange = 0;
        this.hashCode = -1;
    }

    public int setMax(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.Mean$Arithmetic;
                int i2 = this.toDoubleRange;
                Object obj = objArr[i2 - 1];
                objArr[i2 - 1] = null;
                this.equals = obj;
                return 0;
            case 2:
                Object[] objArr2 = this.Mean$Arithmetic;
                int i3 = this.toDoubleRange;
                this.toDoubleRange = i3 + 1;
                objArr2[i3] = objArr2[9];
                return 0;
            case 3:
                int i4 = this.toDoubleRange - this.length;
                this.toDoubleRange = i4;
                this.hashCode = i4;
                return 0;
            case 4:
                Object[] objArr3 = this.Mean$Arithmetic;
                int i5 = this.hashCode;
                this.hashCode = i5 + 1;
                Object obj2 = objArr3[i5];
                objArr3[i5] = null;
                this.equals = obj2;
                return 0;
            case 5:
                Object[] objArr4 = this.Mean$Arithmetic;
                int i6 = this.toDoubleRange;
                this.toDoubleRange = i6 + 1;
                objArr4[i6] = this.toIntRange;
                return 0;
            case 6:
                int[] iArr = this.values;
                int i7 = this.toDoubleRange;
                int i8 = i7 + 1;
                this.toDoubleRange = i8;
                iArr[i7] = 2;
                this.toDoubleRange = i8 + 1;
                iArr[i8] = 2;
                return 0;
            case 7:
                int i9 = this.toDoubleRange - 1;
                this.toDoubleRange = i9;
                int[] iArr2 = this.values;
                iArr2[i9 - 1] = iArr2[i9 - 1] % iArr2[i9];
                int i10 = i9 - 1;
                this.toDoubleRange = i10;
                this.Mean$Arithmetic[i10] = null;
                return 0;
            case 8:
                int[] iArr3 = this.values;
                int i11 = this.toDoubleRange - 1;
                this.toDoubleRange = i11;
                this.getMin = iArr3[i11];
                return 0;
            case 9:
                int[] iArr4 = this.values;
                int i12 = this.toDoubleRange;
                this.toDoubleRange = i12 + 1;
                iArr4[i12] = 72;
                return 0;
            case 10:
                int[] iArr5 = this.values;
                int i13 = this.toDoubleRange;
                this.toDoubleRange = i13 + 1;
                iArr5[i13] = 51;
                return 0;
            case 11:
                break;
            case 12:
                int[] iArr6 = this.values;
                int i14 = this.toDoubleRange;
                this.toDoubleRange = i14 + 1;
                iArr6[i14] = this.length;
                break;
            case 13:
                int[] iArr7 = this.values;
                int i15 = this.toDoubleRange;
                int i16 = i15 + 1;
                this.toDoubleRange = i16;
                iArr7[i15] = 41;
                int i17 = i16 + 2;
                this.toDoubleRange = i17;
                iArr7[i17 - 1] = iArr7[i17 - 3];
                iArr7[i16] = iArr7[i17 - 4];
                return 0;
            case 14:
                int[] iArr8 = this.values;
                int i18 = this.toDoubleRange;
                int i19 = i18 + 2;
                this.toDoubleRange = i19;
                iArr8[i19 - 1] = iArr8[i19 - 3];
                iArr8[i18] = iArr8[i19 - 4];
                this.toDoubleRange = i19 + 1;
                iArr8[i19] = -1;
                return 0;
            case 15:
                int i20 = this.toDoubleRange - 1;
                this.toDoubleRange = i20;
                int[] iArr9 = this.values;
                iArr9[i20 - 1] = iArr9[i20] ^ iArr9[i20 - 1];
                return 0;
            case 16:
                int i21 = this.toDoubleRange - 1;
                this.toDoubleRange = i21;
                int[] iArr10 = this.values;
                iArr10[i21 - 1] = iArr10[i21 - 1] & iArr10[i21];
                int i22 = i21 + 1;
                this.toDoubleRange = i22;
                int i23 = iArr10[i22 - 2];
                iArr10[i21] = i23;
                iArr10[i22 - 2] = iArr10[i22 - 3];
                iArr10[i22 - 3] = iArr10[i22 - 4];
                iArr10[i22 - 4] = i23;
                int i24 = i22 - 1;
                this.toDoubleRange = i24;
                this.Mean$Arithmetic[i24] = null;
                return 0;
            case 17:
                int[] iArr11 = this.values;
                int i25 = this.toDoubleRange;
                int i26 = iArr11[i25 - 1];
                iArr11[i25 - 1] = iArr11[i25 - 2];
                iArr11[i25 - 2] = i26;
                return 0;
            case 18:
                int[] iArr12 = this.values;
                int i27 = this.toDoubleRange;
                int i28 = i27 + 1;
                this.toDoubleRange = i28;
                iArr12[i27] = -1;
                int i29 = i28 - 1;
                this.toDoubleRange = i29;
                iArr12[i29 - 1] = iArr12[i29 - 1] ^ iArr12[i29];
                int i30 = i29 - 1;
                this.toDoubleRange = i30;
                iArr12[i30 - 1] = iArr12[i30] & iArr12[i30 - 1];
                return 0;
            case 19:
                int i31 = this.toDoubleRange - 1;
                this.toDoubleRange = i31;
                int[] iArr13 = this.values;
                iArr13[i31 - 1] = iArr13[i31] | iArr13[i31 - 1];
                return 0;
            case 20:
                int[] iArr14 = this.values;
                int i32 = this.toDoubleRange;
                int i33 = i32 + 1;
                this.toDoubleRange = i33;
                int i34 = iArr14[i33 - 2];
                iArr14[i32] = i34;
                iArr14[i33 - 2] = iArr14[i33 - 3];
                iArr14[i33 - 3] = iArr14[i33 - 4];
                iArr14[i33 - 4] = i34;
                return 0;
            case 21:
                int i35 = this.toDoubleRange - 1;
                this.toDoubleRange = i35;
                this.Mean$Arithmetic[i35] = null;
                int i36 = i35 - 1;
                this.toDoubleRange = i36;
                int[] iArr15 = this.values;
                iArr15[i36 - 1] = iArr15[i36 - 1] & iArr15[i36];
                this.toDoubleRange = i36 + 1;
                iArr15[i36] = 1;
                return 0;
            case 22:
                int i37 = this.toDoubleRange - 1;
                this.toDoubleRange = i37;
                int[] iArr16 = this.values;
                iArr16[i37 - 1] = iArr16[i37 - 1] << iArr16[i37];
                iArr16[i37 - 1] = -iArr16[i37 - 1];
                int i38 = i37 + 2;
                this.toDoubleRange = i38;
                iArr16[i38 - 1] = iArr16[i38 - 3];
                iArr16[i37] = iArr16[i38 - 4];
                return 0;
            case 23:
                int[] iArr17 = this.values;
                int i39 = this.toDoubleRange;
                iArr17[i39 - 1] = -iArr17[i39 - 1];
                int i40 = i39 - 1;
                this.toDoubleRange = i40;
                iArr17[i40 - 1] = iArr17[i40] & iArr17[i40 - 1];
                return 0;
            case 24:
                int[] iArr18 = this.values;
                int i41 = this.toDoubleRange;
                int i42 = i41 + 1;
                this.toDoubleRange = i42;
                int i43 = iArr18[i42 - 2];
                iArr18[i41] = i43;
                iArr18[i42 - 2] = iArr18[i42 - 3];
                iArr18[i42 - 3] = iArr18[i42 - 4];
                iArr18[i42 - 4] = i43;
                int i44 = i42 - 1;
                this.toDoubleRange = i44;
                this.Mean$Arithmetic[i44] = null;
                iArr18[i44 - 1] = -iArr18[i44 - 1];
                return 0;
            case 25:
                int i45 = this.toDoubleRange - 1;
                this.toDoubleRange = i45;
                int[] iArr19 = this.values;
                iArr19[i45 - 1] = iArr19[i45 - 1] + iArr19[i45];
                int i46 = i45 + 1;
                this.toDoubleRange = i46;
                iArr19[i45] = iArr19[i46 - 2];
                return 0;
            case 26:
                int[] iArr20 = this.values;
                int i47 = this.toDoubleRange;
                this.toDoubleRange = i47 + 1;
                iArr20[i47] = 128;
                return 0;
            case 27:
                int[] iArr21 = this.values;
                int i48 = this.hashCode;
                this.hashCode = i48 + 1;
                this.getMin = iArr21[i48];
                return 0;
            case 28:
                int i49 = this.toDoubleRange - 1;
                this.toDoubleRange = i49;
                int[] iArr22 = this.values;
                iArr22[i49 - 1] = iArr22[i49 - 1] % iArr22[i49];
                return 0;
            case 29:
                int[] iArr23 = this.values;
                int i50 = this.toDoubleRange;
                this.toDoubleRange = i50 + 1;
                iArr23[i50] = 2;
                return 0;
            case 30:
                int i51 = this.toDoubleRange - 1;
                this.toDoubleRange = i51;
                this.getMin = this.values[i51] != 0 ? 1 : 0;
                return 0;
            case 31:
                Object[] objArr5 = this.Mean$Arithmetic;
                int i52 = this.toDoubleRange;
                this.toDoubleRange = i52 + 1;
                objArr5[i52] = null;
                return 0;
            case 32:
                int i53 = this.toDoubleRange - 1;
                this.toDoubleRange = i53;
                this.Mean$Arithmetic[i53] = null;
                return 0;
            case 33:
                for (int i54 = this.toDoubleRange - 1; i54 >= 0; i54--) {
                    this.Mean$Arithmetic[i54] = null;
                }
                this.toDoubleRange = 0;
                Object[] objArr6 = this.Mean$Arithmetic;
                this.toDoubleRange = 0 + 1;
                objArr6[0] = this.toIntRange;
                return 0;
            case 34:
                int[] iArr24 = this.values;
                int i55 = this.toDoubleRange;
                this.toDoubleRange = i55 + 1;
                iArr24[i55] = 75;
                return 0;
            case 35:
                int[] iArr25 = this.values;
                int i56 = this.toDoubleRange;
                iArr25[i56 - 1] = -iArr25[i56 - 1];
                int i57 = i56 + 1;
                this.toDoubleRange = i57;
                iArr25[i56] = iArr25[i57 - 2];
                iArr25[i57 - 1] = -iArr25[i57 - 1];
                return 0;
            case 36:
                int[] iArr26 = this.values;
                int i58 = this.toDoubleRange;
                this.toDoubleRange = i58 + 1;
                iArr26[i58] = -1;
                return 0;
            case 37:
                int[] iArr27 = this.values;
                int i59 = this.toDoubleRange;
                int i60 = i59 + 2;
                this.toDoubleRange = i60;
                iArr27[i60 - 1] = iArr27[i60 - 3];
                iArr27[i59] = iArr27[i60 - 4];
                return 0;
            case 38:
                int i61 = this.toDoubleRange - 1;
                this.toDoubleRange = i61;
                int[] iArr28 = this.values;
                iArr28[i61 - 1] = iArr28[i61 - 1] ^ iArr28[i61];
                int i62 = i61 - 1;
                this.toDoubleRange = i62;
                iArr28[i62 - 1] = iArr28[i62] & iArr28[i62 - 1];
                return 0;
            case 39:
                int i63 = this.toDoubleRange - 1;
                this.toDoubleRange = i63;
                this.Mean$Arithmetic[i63] = null;
                int[] iArr29 = this.values;
                int i64 = iArr29[i63 - 1];
                iArr29[i63 - 1] = iArr29[i63 - 2];
                iArr29[i63 - 2] = i64;
                return 0;
            case 40:
                int[] iArr30 = this.values;
                int i65 = this.toDoubleRange;
                int i66 = i65 + 1;
                this.toDoubleRange = i66;
                iArr30[i65] = -1;
                int i67 = i66 - 1;
                this.toDoubleRange = i67;
                iArr30[i67 - 1] = iArr30[i67] ^ iArr30[i67 - 1];
                return 0;
            case 41:
                int i68 = this.toDoubleRange - 1;
                this.toDoubleRange = i68;
                int[] iArr31 = this.values;
                iArr31[i68 - 1] = iArr31[i68] & iArr31[i68 - 1];
                return 0;
            case 42:
                int[] iArr32 = this.values;
                int i69 = this.toDoubleRange;
                int i70 = iArr32[i69 - 1];
                iArr32[i69 - 1] = iArr32[i69 - 2];
                iArr32[i69 - 2] = i70;
                int i71 = i69 - 1;
                this.toDoubleRange = i71;
                this.Mean$Arithmetic[i71] = null;
                return 0;
            case 43:
                int i72 = this.toDoubleRange - 1;
                this.toDoubleRange = i72;
                int[] iArr33 = this.values;
                iArr33[i72 - 1] = iArr33[i72 - 1] - iArr33[i72];
                return 0;
            case 44:
                int[] iArr34 = this.values;
                int i73 = this.toDoubleRange;
                int i74 = i73 + 1;
                this.toDoubleRange = i74;
                iArr34[i73] = 1;
                int i75 = i74 - 1;
                this.toDoubleRange = i75;
                iArr34[i75 - 1] = iArr34[i75 - 1] - iArr34[i75];
                int i76 = i75 + 1;
                this.toDoubleRange = i76;
                iArr34[i75] = iArr34[i76 - 2];
                return 0;
            case 45:
                int[] iArr35 = this.values;
                int i77 = this.toDoubleRange;
                int i78 = i77 + 1;
                this.toDoubleRange = i78;
                iArr35[i77] = 2;
                int i79 = i78 - 1;
                this.toDoubleRange = i79;
                iArr35[i79 - 1] = iArr35[i79 - 1] % iArr35[i79];
                return 0;
            case 46:
                int[] iArr36 = this.values;
                int i80 = this.toDoubleRange;
                this.toDoubleRange = i80 + 1;
                iArr36[i80] = 1;
                return 0;
            case 47:
                int[] iArr37 = this.values;
                int i81 = this.toDoubleRange;
                this.toDoubleRange = i81 + 1;
                iArr37[i81] = 0;
                return 0;
            case 48:
                int[] iArr38 = this.values;
                int i82 = this.toDoubleRange;
                int i83 = i82 + 1;
                this.toDoubleRange = i83;
                iArr38[i82] = 2;
                int i84 = i83 + 1;
                this.toDoubleRange = i84;
                iArr38[i83] = 2;
                int i85 = i84 - 1;
                this.toDoubleRange = i85;
                iArr38[i85 - 1] = iArr38[i85 - 1] % iArr38[i85];
                return 0;
            case 49:
                Object[] objArr7 = this.Mean$Arithmetic;
                int i86 = this.toDoubleRange;
                int i87 = i86 + 1;
                this.toDoubleRange = i87;
                objArr7[i86] = objArr7[9];
                int i88 = i87 + 1;
                this.toDoubleRange = i88;
                objArr7[i87] = objArr7[i88 - 2];
                return 0;
            case 50:
                Object[] objArr8 = this.Mean$Arithmetic;
                int i89 = this.toDoubleRange;
                int i90 = i89 + 1;
                this.toDoubleRange = i90;
                objArr8[i89] = null;
                Object obj3 = objArr8[i90 - 1];
                objArr8[i90 - 1] = null;
                this.values[i90 - 1] = ((int[]) obj3).length;
                int i91 = i90 - 1;
                this.toDoubleRange = i91;
                objArr8[i91] = null;
                return 0;
            case 51:
                int[] iArr39 = this.values;
                int i92 = this.toDoubleRange;
                this.toDoubleRange = i92 + 1;
                iArr39[i92] = 47;
                return 0;
            case 52:
                int[] iArr40 = this.values;
                int i93 = this.toDoubleRange;
                iArr40[i93 - 1] = -iArr40[i93 - 1];
                return 0;
            case 53:
                int[] iArr41 = this.values;
                int i94 = this.toDoubleRange;
                iArr41[i94 - 1] = -iArr41[i94 - 1];
                int i95 = i94 + 2;
                this.toDoubleRange = i95;
                iArr41[i95 - 1] = iArr41[i95 - 3];
                iArr41[i94] = iArr41[i95 - 4];
                return 0;
            case 54:
                int[] iArr42 = this.values;
                int i96 = this.toDoubleRange;
                int i97 = i96 + 1;
                this.toDoubleRange = i97;
                iArr42[i96] = -1;
                int i98 = i97 - 1;
                this.toDoubleRange = i98;
                iArr42[i98 - 1] = iArr42[i98 - 1] ^ iArr42[i98];
                int i99 = i98 - 1;
                this.toDoubleRange = i99;
                iArr42[i99 - 1] = iArr42[i99] ^ iArr42[i99 - 1];
                return 0;
            case 55:
                int i100 = this.toDoubleRange - 1;
                this.toDoubleRange = i100;
                this.Mean$Arithmetic[i100] = null;
                int i101 = i100 - 1;
                this.toDoubleRange = i101;
                int[] iArr43 = this.values;
                iArr43[i101 - 1] = iArr43[i101 - 1] & iArr43[i101];
                int i102 = i101 + 1;
                this.toDoubleRange = i102;
                int i103 = iArr43[i102 - 2];
                iArr43[i101] = i103;
                iArr43[i102 - 2] = iArr43[i102 - 3];
                iArr43[i102 - 3] = iArr43[i102 - 4];
                iArr43[i102 - 4] = i103;
                return 0;
            case 56:
                int i104 = this.toDoubleRange - 1;
                this.toDoubleRange = i104;
                this.Mean$Arithmetic[i104] = null;
                int[] iArr44 = this.values;
                iArr44[i104 - 1] = -iArr44[i104 - 1];
                return 0;
            case 57:
                int[] iArr45 = this.values;
                int i105 = this.toDoubleRange;
                int i106 = i105 + 2;
                this.toDoubleRange = i106;
                iArr45[i106 - 1] = iArr45[i106 - 3];
                iArr45[i105] = iArr45[i106 - 4];
                iArr45[i106 - 1] = -iArr45[i106 - 1];
                return 0;
            case 58:
                int[] iArr46 = this.values;
                int i107 = this.toDoubleRange;
                int i108 = i107 + 1;
                this.toDoubleRange = i108;
                iArr46[i107] = 1;
                int i109 = i108 - 1;
                this.toDoubleRange = i109;
                iArr46[i109 - 1] = iArr46[i109 - 1] << iArr46[i109];
                int i110 = i109 + 1;
                this.toDoubleRange = i110;
                int i111 = iArr46[i110 - 2];
                iArr46[i109] = i111;
                iArr46[i110 - 2] = iArr46[i110 - 3];
                iArr46[i110 - 3] = iArr46[i110 - 4];
                iArr46[i110 - 4] = i111;
                return 0;
            case 59:
                int i112 = this.toDoubleRange - 1;
                this.toDoubleRange = i112;
                this.Mean$Arithmetic[i112] = null;
                int[] iArr47 = this.values;
                iArr47[i112 - 1] = -iArr47[i112 - 1];
                int i113 = i112 - 1;
                this.toDoubleRange = i113;
                iArr47[i113 - 1] = iArr47[i113] ^ iArr47[i113 - 1];
                return 0;
            case 60:
                int[] iArr48 = this.values;
                int i114 = this.toDoubleRange;
                int i115 = i114 + 1;
                this.toDoubleRange = i115;
                iArr48[i114] = iArr48[i115 - 2];
                return 0;
            case 61:
                int[] iArr49 = this.values;
                int i116 = this.toDoubleRange;
                int i117 = i116 + 1;
                this.toDoubleRange = i117;
                iArr49[i116] = 128;
                int i118 = i117 - 1;
                this.toDoubleRange = i118;
                iArr49[i118 - 1] = iArr49[i118 - 1] % iArr49[i118];
                return 0;
            case 62:
                int i119 = this.toDoubleRange - 1;
                this.toDoubleRange = i119;
                this.getMin = this.values[i119] == 0 ? 1 : 0;
                return 0;
            case 63:
                int[] iArr50 = this.values;
                int i120 = this.toDoubleRange;
                this.toDoubleRange = i120 + 1;
                iArr50[i120] = 97;
                return 0;
            case 64:
                int[] iArr51 = this.values;
                int i121 = this.toDoubleRange;
                int i122 = i121 + 2;
                this.toDoubleRange = i122;
                iArr51[i122 - 1] = iArr51[i122 - 3];
                iArr51[i121] = iArr51[i122 - 4];
                int i123 = i122 - 1;
                this.toDoubleRange = i123;
                iArr51[i123 - 1] = iArr51[i123 - 1] ^ iArr51[i123];
                int i124 = i123 + 1;
                this.toDoubleRange = i124;
                int i125 = iArr51[i124 - 2];
                iArr51[i123] = i125;
                iArr51[i124 - 2] = iArr51[i124 - 3];
                iArr51[i124 - 3] = iArr51[i124 - 4];
                iArr51[i124 - 4] = i125;
                return 0;
            case 65:
                int i126 = this.toDoubleRange - 1;
                this.toDoubleRange = i126;
                int[] iArr52 = this.values;
                iArr52[i126 - 1] = iArr52[i126 - 1] + iArr52[i126];
                int i127 = i126 + 1;
                this.toDoubleRange = i127;
                iArr52[i126] = iArr52[i127 - 2];
                this.toDoubleRange = i127 + 1;
                iArr52[i127] = 128;
                return 0;
            case 66:
                int[] iArr53 = this.values;
                int i128 = this.toDoubleRange;
                this.toDoubleRange = i128 + 1;
                iArr53[i128] = 24;
                return 0;
            case 67:
                int[] iArr54 = this.values;
                int i129 = this.toDoubleRange;
                this.toDoubleRange = i129 + 1;
                iArr54[i129] = 28;
                return 0;
            case 68:
                int[] iArr55 = this.values;
                int i130 = this.toDoubleRange;
                this.toDoubleRange = i130 + 1;
                iArr55[i130] = 5;
                return 0;
            case 69:
                int[] iArr56 = this.values;
                int i131 = this.toDoubleRange;
                int i132 = i131 + 1;
                this.toDoubleRange = i132;
                iArr56[i131] = 105;
                int i133 = i132 + 2;
                this.toDoubleRange = i133;
                iArr56[i133 - 1] = iArr56[i133 - 3];
                iArr56[i132] = iArr56[i133 - 4];
                return 0;
            case 70:
                int[] iArr57 = this.values;
                int i134 = this.toDoubleRange;
                int i135 = i134 + 2;
                this.toDoubleRange = i135;
                iArr57[i135 - 1] = iArr57[i135 - 3];
                iArr57[i134] = iArr57[i135 - 4];
                int i136 = i135 - 1;
                this.toDoubleRange = i136;
                iArr57[i136 - 1] = iArr57[i136 - 1] & iArr57[i136];
                this.toDoubleRange = i136 + 1;
                iArr57[i136] = -1;
                return 0;
            case 71:
                int[] iArr58 = this.values;
                int i137 = this.toDoubleRange;
                int i138 = i137 + 1;
                this.toDoubleRange = i138;
                int i139 = iArr58[i138 - 2];
                iArr58[i137] = i139;
                iArr58[i138 - 2] = iArr58[i138 - 3];
                iArr58[i138 - 3] = iArr58[i138 - 4];
                iArr58[i138 - 4] = i139;
                int i140 = i138 - 1;
                this.toDoubleRange = i140;
                this.Mean$Arithmetic[i140] = null;
                return 0;
            case 72:
                int i141 = this.toDoubleRange - 1;
                this.toDoubleRange = i141;
                int[] iArr59 = this.values;
                iArr59[i141 - 1] = iArr59[i141 - 1] | iArr59[i141];
                int i142 = i141 - 1;
                this.toDoubleRange = i142;
                iArr59[i142 - 1] = iArr59[i142 - 1] & iArr59[i142];
                int i143 = i142 + 1;
                this.toDoubleRange = i143;
                int i144 = iArr59[i143 - 2];
                iArr59[i142] = i144;
                iArr59[i143 - 2] = iArr59[i143 - 3];
                iArr59[i143 - 3] = iArr59[i143 - 4];
                iArr59[i143 - 4] = i144;
                return 0;
            case 73:
                int[] iArr60 = this.values;
                int i145 = this.toDoubleRange;
                int i146 = i145 + 2;
                this.toDoubleRange = i146;
                iArr60[i146 - 1] = iArr60[i146 - 3];
                iArr60[i145] = iArr60[i146 - 4];
                int i147 = i146 + 1;
                this.toDoubleRange = i147;
                iArr60[i146] = -1;
                int i148 = i147 - 1;
                this.toDoubleRange = i148;
                iArr60[i148 - 1] = iArr60[i148] ^ iArr60[i148 - 1];
                return 0;
            case 74:
                int i149 = this.toDoubleRange - 1;
                this.toDoubleRange = i149;
                int[] iArr61 = this.values;
                iArr61[i149 - 1] = iArr61[i149 - 1] ^ iArr61[i149];
                int i150 = i149 - 1;
                this.toDoubleRange = i150;
                this.Mean$Arithmetic[i150] = null;
                return 0;
            case 75:
                int i151 = this.toDoubleRange - 1;
                this.toDoubleRange = i151;
                int[] iArr62 = this.values;
                iArr62[i151 - 1] = iArr62[i151 - 1] << iArr62[i151];
                return 0;
            case 76:
                int[] iArr63 = this.values;
                int i152 = this.toDoubleRange;
                this.toDoubleRange = i152 + 1;
                iArr63[i152] = 55;
                return 0;
            case 77:
                Object[] objArr9 = this.Mean$Arithmetic;
                int i153 = this.toDoubleRange;
                int i154 = i153 + 1;
                this.toDoubleRange = i154;
                objArr9[i153] = objArr9[i154 - 2];
                return 0;
            case 78:
                int[] iArr64 = this.values;
                int i155 = this.toDoubleRange;
                this.toDoubleRange = i155 + 1;
                iArr64[i155] = 15;
                return 0;
            case 79:
                int i156 = this.toDoubleRange - 1;
                this.toDoubleRange = i156;
                this.Mean$Arithmetic[i156] = null;
                int i157 = i156 - 1;
                this.toDoubleRange = i157;
                int[] iArr65 = this.values;
                iArr65[i157 - 1] = iArr65[i157] & iArr65[i157 - 1];
                return 0;
            case 80:
                int i158 = this.toDoubleRange - 1;
                this.toDoubleRange = i158;
                int[] iArr66 = this.values;
                iArr66[i158 - 1] = iArr66[i158 - 1] | iArr66[i158];
                this.toDoubleRange = i158 + 1;
                iArr66[i158] = 1;
                return 0;
            case 81:
                int i159 = this.toDoubleRange - 1;
                this.toDoubleRange = i159;
                int[] iArr67 = this.values;
                iArr67[i159 - 1] = iArr67[i159 - 1] ^ iArr67[i159];
                int i160 = i159 + 1;
                this.toDoubleRange = i160;
                iArr67[i159] = iArr67[i160 - 2];
                return 0;
            case 82:
                int[] iArr68 = this.values;
                int i161 = this.toDoubleRange;
                iArr68[i161 - 1] = -iArr68[i161 - 1];
                int i162 = i161 + 1;
                this.toDoubleRange = i162;
                iArr68[i161] = -1;
                int i163 = i162 - 1;
                this.toDoubleRange = i163;
                iArr68[i163 - 1] = iArr68[i163] ^ iArr68[i163 - 1];
                return 0;
            case 83:
                int[] iArr69 = this.values;
                int i164 = this.toDoubleRange;
                this.toDoubleRange = i164 + 1;
                iArr69[i164] = 67;
                return 0;
            case 84:
                int i165 = this.toDoubleRange - 1;
                this.toDoubleRange = i165;
                int[] iArr70 = this.values;
                iArr70[i165 - 1] = iArr70[i165 - 1] ^ iArr70[i165];
                int i166 = i165 - 1;
                this.toDoubleRange = i166;
                iArr70[i166 - 1] = iArr70[i166] ^ iArr70[i166 - 1];
                return 0;
            case 85:
                int[] iArr71 = this.values;
                int i167 = this.toDoubleRange;
                int i168 = i167 + 1;
                this.toDoubleRange = i168;
                int i169 = iArr71[i168 - 2];
                iArr71[i167] = i169;
                iArr71[i168 - 2] = iArr71[i168 - 3];
                iArr71[i168 - 3] = iArr71[i168 - 4];
                iArr71[i168 - 4] = i169;
                int i170 = i168 - 1;
                this.toDoubleRange = i170;
                this.Mean$Arithmetic[i170] = null;
                int i171 = i170 - 1;
                this.toDoubleRange = i171;
                iArr71[i171 - 1] = iArr71[i171] & iArr71[i171 - 1];
                return 0;
            case 86:
                int i172 = this.toDoubleRange - 1;
                this.toDoubleRange = i172;
                int[] iArr72 = this.values;
                iArr72[i172 - 1] = iArr72[i172 - 1] | iArr72[i172];
                iArr72[i172 - 1] = -iArr72[i172 - 1];
                int i173 = i172 + 2;
                this.toDoubleRange = i173;
                iArr72[i173 - 1] = iArr72[i173 - 3];
                iArr72[i172] = iArr72[i173 - 4];
                return 0;
            case 87:
                int[] iArr73 = this.values;
                int i174 = this.toDoubleRange;
                int i175 = i174 + 1;
                this.toDoubleRange = i175;
                iArr73[i174] = 95;
                iArr73[i175 - 1] = -iArr73[i175 - 1];
                return 0;
            case 88:
                int[] iArr74 = this.values;
                int i176 = this.toDoubleRange;
                int i177 = i176 + 2;
                this.toDoubleRange = i177;
                iArr74[i177 - 1] = iArr74[i177 - 3];
                iArr74[i176] = iArr74[i177 - 4];
                iArr74[i177 - 1] = -iArr74[i177 - 1];
                int i178 = i177 - 1;
                this.toDoubleRange = i178;
                iArr74[i178 - 1] = iArr74[i178] & iArr74[i178 - 1];
                return 0;
            case 89:
                int i179 = this.toDoubleRange - 1;
                this.toDoubleRange = i179;
                int[] iArr75 = this.values;
                iArr75[i179 - 1] = iArr75[i179 - 1] | iArr75[i179];
                int i180 = i179 + 2;
                this.toDoubleRange = i180;
                iArr75[i180 - 1] = iArr75[i180 - 3];
                iArr75[i179] = iArr75[i180 - 4];
                int i181 = i180 - 1;
                this.toDoubleRange = i181;
                iArr75[i181 - 1] = iArr75[i181] & iArr75[i181 - 1];
                return 0;
            case 90:
                int[] iArr76 = this.values;
                int i182 = this.toDoubleRange;
                int i183 = i182 + 1;
                this.toDoubleRange = i183;
                int i184 = iArr76[i183 - 2];
                iArr76[i182] = i184;
                iArr76[i183 - 2] = iArr76[i183 - 3];
                iArr76[i183 - 3] = iArr76[i183 - 4];
                iArr76[i183 - 4] = i184;
                int i185 = i183 - 1;
                this.toDoubleRange = i185;
                this.Mean$Arithmetic[i185] = null;
                int i186 = i185 - 1;
                this.toDoubleRange = i186;
                iArr76[i186 - 1] = iArr76[i186] | iArr76[i186 - 1];
                return 0;
            case 91:
                int i187 = this.toDoubleRange - 1;
                this.toDoubleRange = i187;
                int[] iArr77 = this.values;
                iArr77[i187 - 1] = iArr77[i187 - 1] + iArr77[i187];
                return 0;
            case 92:
                int[] iArr78 = this.values;
                int i188 = this.toDoubleRange;
                this.toDoubleRange = i188 + 1;
                iArr78[i188] = 123;
                return 0;
            case 93:
                int[] iArr79 = this.values;
                int i189 = this.toDoubleRange;
                int i190 = i189 + 2;
                this.toDoubleRange = i190;
                iArr79[i190 - 1] = iArr79[i190 - 3];
                iArr79[i189] = iArr79[i190 - 4];
                iArr79[i190 - 1] = -iArr79[i190 - 1];
                int i191 = i190 - 1;
                this.toDoubleRange = i191;
                iArr79[i191 - 1] = iArr79[i191] ^ iArr79[i191 - 1];
                return 0;
            case 94:
                int i192 = this.toDoubleRange - 1;
                this.toDoubleRange = i192;
                int[] iArr80 = this.values;
                iArr80[i192 - 1] = iArr80[i192 - 1] & iArr80[i192];
                int i193 = i192 + 1;
                this.toDoubleRange = i193;
                iArr80[i192] = 1;
                int i194 = i193 - 1;
                this.toDoubleRange = i194;
                iArr80[i194 - 1] = iArr80[i194 - 1] << iArr80[i194];
                return 0;
            case 95:
                Object[] objArr10 = this.Mean$Arithmetic;
                int i195 = this.toDoubleRange;
                int i196 = i195 + 1;
                this.toDoubleRange = i196;
                objArr10[i195] = null;
                Object obj4 = objArr10[i196 - 1];
                objArr10[i196 - 1] = null;
                this.values[i196 - 1] = ((int[]) obj4).length;
                return 0;
            case 96:
                int[] iArr81 = this.values;
                int i197 = this.toDoubleRange;
                this.toDoubleRange = i197 + 1;
                iArr81[i197] = 25;
                return 0;
            case 97:
                int i198 = this.toDoubleRange - 1;
                this.toDoubleRange = i198;
                int[] iArr82 = this.values;
                iArr82[i198 - 1] = iArr82[i198 - 1] ^ iArr82[i198];
                int i199 = i198 - 1;
                this.toDoubleRange = i199;
                this.Mean$Arithmetic[i199] = null;
                int i200 = i199 - 1;
                this.toDoubleRange = i200;
                iArr82[i200 - 1] = iArr82[i200] & iArr82[i200 - 1];
                return 0;
            case 98:
                int i201 = this.toDoubleRange - 1;
                this.toDoubleRange = i201;
                int[] iArr83 = this.values;
                iArr83[i201 - 1] = iArr83[i201 - 1] << iArr83[i201];
                int i202 = i201 - 1;
                this.toDoubleRange = i202;
                iArr83[i202 - 1] = iArr83[i202 - 1] + iArr83[i202];
                return 0;
            case 99:
                int[] iArr84 = this.values;
                int i203 = this.toDoubleRange;
                int i204 = i203 + 1;
                this.toDoubleRange = i204;
                iArr84[i203] = 27;
                int i205 = i204 + 2;
                this.toDoubleRange = i205;
                iArr84[i205 - 1] = iArr84[i205 - 3];
                iArr84[i204] = iArr84[i205 - 4];
                return 0;
            case 100:
                int i206 = this.toDoubleRange - 1;
                this.toDoubleRange = i206;
                int[] iArr85 = this.values;
                iArr85[i206 - 1] = iArr85[i206 - 1] ^ iArr85[i206];
                int i207 = i206 + 1;
                this.toDoubleRange = i207;
                int i208 = iArr85[i207 - 2];
                iArr85[i206] = i208;
                iArr85[i207 - 2] = iArr85[i207 - 3];
                iArr85[i207 - 3] = iArr85[i207 - 4];
                iArr85[i207 - 4] = i208;
                return 0;
            case 101:
                int i209 = this.toDoubleRange - 1;
                this.toDoubleRange = i209;
                int[] iArr86 = this.values;
                iArr86[i209 - 1] = iArr86[i209 - 1] | iArr86[i209];
                int i210 = i209 + 1;
                this.toDoubleRange = i210;
                iArr86[i209] = 1;
                int i211 = i210 - 1;
                this.toDoubleRange = i211;
                iArr86[i211 - 1] = iArr86[i211 - 1] << iArr86[i211];
                return 0;
            case 102:
                int i212 = this.toDoubleRange - 1;
                this.toDoubleRange = i212;
                this.Mean$Arithmetic[i212] = null;
                int[] iArr87 = this.values;
                int i213 = iArr87[i212 - 1];
                iArr87[i212 - 1] = iArr87[i212 - 2];
                iArr87[i212 - 2] = i213;
                this.toDoubleRange = i212 + 1;
                iArr87[i212] = -1;
                return 0;
            case 103:
                int i214 = this.toDoubleRange - 1;
                this.toDoubleRange = i214;
                int[] iArr88 = this.values;
                iArr88[i214 - 1] = iArr88[i214 - 1] | iArr88[i214];
                int i215 = i214 - 1;
                this.toDoubleRange = i215;
                iArr88[i215 - 1] = iArr88[i215 - 1] - iArr88[i215];
                return 0;
            case 104:
                int[] iArr89 = this.values;
                int i216 = this.toDoubleRange;
                this.toDoubleRange = i216 + 1;
                iArr89[i216] = 21;
                return 0;
            case 105:
                int[] iArr90 = this.values;
                int i217 = this.toDoubleRange;
                int i218 = i217 + 1;
                this.toDoubleRange = i218;
                iArr90[i217] = iArr90[i218 - 2];
                iArr90[i218 - 1] = -iArr90[i218 - 1];
                return 0;
            case 106:
                int[] iArr91 = this.values;
                int i219 = this.toDoubleRange;
                int i220 = i219 + 1;
                this.toDoubleRange = i220;
                iArr91[i219] = -1;
                int i221 = i220 + 2;
                this.toDoubleRange = i221;
                iArr91[i221 - 1] = iArr91[i221 - 3];
                iArr91[i220] = iArr91[i221 - 4];
                this.toDoubleRange = i221 + 1;
                iArr91[i221] = -1;
                return 0;
            case 107:
                int i222 = this.toDoubleRange - 1;
                this.toDoubleRange = i222;
                int[] iArr92 = this.values;
                iArr92[i222 - 1] = iArr92[i222 - 1] ^ iArr92[i222];
                int i223 = i222 - 1;
                this.toDoubleRange = i223;
                iArr92[i223 - 1] = iArr92[i223 - 1] & iArr92[i223];
                int i224 = i223 + 1;
                this.toDoubleRange = i224;
                int i225 = iArr92[i224 - 2];
                iArr92[i223] = i225;
                iArr92[i224 - 2] = iArr92[i224 - 3];
                iArr92[i224 - 3] = iArr92[i224 - 4];
                iArr92[i224 - 4] = i225;
                return 0;
            case 108:
                int i226 = this.toDoubleRange - 1;
                this.toDoubleRange = i226;
                int[] iArr93 = this.values;
                iArr93[i226 - 1] = iArr93[i226 - 1] | iArr93[i226];
                int i227 = iArr93[i226 - 1];
                iArr93[i226 - 1] = iArr93[i226 - 2];
                iArr93[i226 - 2] = i227;
                int i228 = i226 - 1;
                this.toDoubleRange = i228;
                this.Mean$Arithmetic[i228] = null;
                return 0;
            case 109:
                int[] iArr94 = this.values;
                int i229 = this.toDoubleRange;
                iArr94[i229 - 1] = -iArr94[i229 - 1];
                int i230 = i229 + 1;
                this.toDoubleRange = i230;
                iArr94[i229] = iArr94[i230 - 2];
                return 0;
            case 110:
                int i231 = this.toDoubleRange - 1;
                this.toDoubleRange = i231;
                int[] iArr95 = this.values;
                iArr95[i231 - 1] = iArr95[i231 - 1] ^ iArr95[i231];
                int i232 = iArr95[i231 - 1];
                iArr95[i231 - 1] = iArr95[i231 - 2];
                iArr95[i231 - 2] = i232;
                int i233 = i231 - 1;
                this.toDoubleRange = i233;
                this.Mean$Arithmetic[i233] = null;
                return 0;
            case 111:
                int[] iArr96 = this.values;
                int i234 = this.toDoubleRange;
                int i235 = i234 + 1;
                this.toDoubleRange = i235;
                iArr96[i234] = 1;
                int i236 = i235 - 1;
                this.toDoubleRange = i236;
                iArr96[i236 - 1] = iArr96[i236 - 1] - iArr96[i236];
                this.toDoubleRange = i236 + 1;
                iArr96[i236] = 1;
                return 0;
            case 112:
                int[] iArr97 = this.values;
                int i237 = this.toDoubleRange;
                int i238 = i237 + 1;
                this.toDoubleRange = i238;
                iArr97[i237] = 41;
                int i239 = i238 + 1;
                this.toDoubleRange = i239;
                iArr97[i238] = iArr97[i239 - 2];
                return 0;
            case 113:
                int[] iArr98 = this.values;
                int i240 = this.toDoubleRange;
                int i241 = i240 + 1;
                this.toDoubleRange = i241;
                iArr98[i240] = -1;
                int i242 = i241 + 2;
                this.toDoubleRange = i242;
                iArr98[i242 - 1] = iArr98[i242 - 3];
                iArr98[i241] = iArr98[i242 - 4];
                return 0;
            case 114:
                int i243 = this.toDoubleRange - 1;
                this.toDoubleRange = i243;
                int[] iArr99 = this.values;
                iArr99[i243 - 1] = iArr99[i243 - 1] & iArr99[i243];
                int i244 = i243 + 1;
                this.toDoubleRange = i244;
                iArr99[i243] = -1;
                int i245 = i244 - 1;
                this.toDoubleRange = i245;
                iArr99[i245 - 1] = iArr99[i245] ^ iArr99[i245 - 1];
                return 0;
            case 115:
                int i246 = this.toDoubleRange - 1;
                this.toDoubleRange = i246;
                this.Mean$Arithmetic[i246] = null;
                int i247 = i246 - 1;
                this.toDoubleRange = i247;
                int[] iArr100 = this.values;
                iArr100[i247 - 1] = iArr100[i247 - 1] | iArr100[i247];
                int i248 = i247 - 1;
                this.toDoubleRange = i248;
                iArr100[i248 - 1] = iArr100[i248] & iArr100[i248 - 1];
                return 0;
            case 116:
                int i249 = this.toDoubleRange - 1;
                this.toDoubleRange = i249;
                this.Mean$Arithmetic[i249] = null;
                int[] iArr101 = this.values;
                int i250 = i249 + 1;
                this.toDoubleRange = i250;
                iArr101[i249] = iArr101[i250 - 2];
                iArr101[i250 - 1] = -iArr101[i250 - 1];
                return 0;
            case 117:
                int[] iArr102 = this.values;
                int i251 = this.toDoubleRange;
                int i252 = i251 + 1;
                this.toDoubleRange = i252;
                iArr102[i251] = -1;
                int i253 = i252 - 1;
                this.toDoubleRange = i253;
                iArr102[i253 - 1] = iArr102[i253 - 1] ^ iArr102[i253];
                int i254 = iArr102[i253 - 1];
                iArr102[i253 - 1] = iArr102[i253 - 2];
                iArr102[i253 - 2] = i254;
                return 0;
            case 118:
                int i255 = this.toDoubleRange - 1;
                this.toDoubleRange = i255;
                int[] iArr103 = this.values;
                iArr103[i255 - 1] = iArr103[i255 - 1] - iArr103[i255];
                this.toDoubleRange = i255 + 1;
                iArr103[i255] = 1;
                return 0;
            case 119:
                int i256 = this.toDoubleRange - 1;
                this.toDoubleRange = i256;
                int[] iArr104 = this.values;
                iArr104[i256 - 1] = iArr104[i256 - 1] - iArr104[i256];
                int i257 = i256 + 1;
                this.toDoubleRange = i257;
                iArr104[i256] = 1;
                int i258 = i257 - 1;
                this.toDoubleRange = i258;
                iArr104[i258 - 1] = iArr104[i258 - 1] - iArr104[i258];
                return 0;
            case 120:
                int[] iArr105 = this.values;
                int i259 = this.toDoubleRange;
                int i260 = i259 + 1;
                this.toDoubleRange = i260;
                iArr105[i259] = iArr105[i260 - 2];
                int i261 = i260 + 1;
                this.toDoubleRange = i261;
                iArr105[i260] = 128;
                int i262 = i261 - 1;
                this.toDoubleRange = i262;
                iArr105[i262 - 1] = iArr105[i262 - 1] % iArr105[i262];
                return 0;
            case 121:
                int[] iArr106 = this.values;
                int i263 = this.toDoubleRange;
                int i264 = i263 + 1;
                this.toDoubleRange = i264;
                iArr106[i263] = 49;
                int i265 = i264 + 2;
                this.toDoubleRange = i265;
                iArr106[i265 - 1] = iArr106[i265 - 3];
                iArr106[i264] = iArr106[i265 - 4];
                return 0;
            case 122:
                int i266 = this.toDoubleRange - 1;
                this.toDoubleRange = i266;
                int[] iArr107 = this.values;
                iArr107[i266 - 1] = iArr107[i266 - 1] & iArr107[i266];
                this.toDoubleRange = i266 + 1;
                iArr107[i266] = 1;
                return 0;
            case 123:
                int i267 = this.toDoubleRange - 1;
                this.toDoubleRange = i267;
                Object[] objArr11 = this.Mean$Arithmetic;
                Object obj5 = objArr11[i267];
                objArr11[i267] = null;
                this.getMin = obj5 == null ? 1 : 0;
                return 0;
            case 124:
                Object[] objArr12 = this.Mean$Arithmetic;
                int i268 = this.toDoubleRange;
                int i269 = i268 + 1;
                this.toDoubleRange = i269;
                objArr12[i268] = objArr12[9];
                this.toDoubleRange = i269 + 1;
                objArr12[i269] = objArr12[9];
                return 0;
            case 125:
                int[] iArr108 = this.values;
                int i270 = this.toDoubleRange;
                int i271 = i270 + 1;
                this.toDoubleRange = i271;
                iArr108[i270] = 2;
                int i272 = i271 + 1;
                this.toDoubleRange = i272;
                iArr108[i271] = 4;
                int i273 = i272 - 1;
                this.toDoubleRange = i273;
                iArr108[i273 - 1] = iArr108[i273 - 1] >> iArr108[i273];
                return 0;
            case 126:
                int[] iArr109 = this.values;
                int i274 = this.toDoubleRange;
                int i275 = i274 + 1;
                this.toDoubleRange = i275;
                iArr109[i274] = 121;
                int i276 = i275 - 1;
                this.toDoubleRange = i276;
                iArr109[i276 - 1] = iArr109[i276 - 1] + iArr109[i276];
                int i277 = i276 + 1;
                this.toDoubleRange = i277;
                iArr109[i276] = iArr109[i277 - 2];
                return 0;
            case 127:
                int[] iArr110 = this.values;
                int i278 = this.toDoubleRange;
                this.toDoubleRange = i278 + 1;
                iArr110[i278] = 41;
                return 0;
            case 128:
                int[] iArr111 = this.values;
                int i279 = this.toDoubleRange;
                int i280 = i279 + 1;
                this.toDoubleRange = i280;
                iArr111[i279] = iArr111[i280 - 2];
                this.toDoubleRange = i280 + 1;
                iArr111[i280] = -1;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3:
                int i281 = this.toDoubleRange - 1;
                this.toDoubleRange = i281;
                this.Mean$Arithmetic[i281] = null;
                int i282 = i281 - 1;
                this.toDoubleRange = i282;
                int[] iArr112 = this.values;
                iArr112[i282 - 1] = iArr112[i282 - 1] - iArr112[i282];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                int i283 = this.toDoubleRange - 1;
                this.toDoubleRange = i283;
                int[] iArr113 = this.values;
                iArr113[i283 - 1] = iArr113[i283 - 1] | iArr113[i283];
                int i284 = i283 - 1;
                this.toDoubleRange = i284;
                iArr113[i284 - 1] = iArr113[i284 - 1] + iArr113[i284];
                int i285 = i284 + 1;
                this.toDoubleRange = i285;
                iArr113[i284] = iArr113[i285 - 2];
                return 0;
            case 131:
                int[] iArr114 = this.values;
                int i286 = this.toDoubleRange;
                this.toDoubleRange = i286 + 1;
                iArr114[i286] = 14;
                return 0;
            case 132:
                int[] iArr115 = this.values;
                int i287 = this.toDoubleRange;
                this.toDoubleRange = i287 + 1;
                iArr115[i287] = 103;
                return 0;
            case 133:
                int[] iArr116 = this.values;
                int i288 = this.toDoubleRange;
                int i289 = i288 + 1;
                this.toDoubleRange = i289;
                iArr116[i288] = -1;
                int i290 = i289 + 2;
                this.toDoubleRange = i290;
                iArr116[i290 - 1] = iArr116[i290 - 3];
                iArr116[i289] = iArr116[i290 - 4];
                int i291 = i290 - 1;
                this.toDoubleRange = i291;
                iArr116[i291 - 1] = iArr116[i291] & iArr116[i291 - 1];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                int[] iArr117 = this.values;
                int i292 = this.toDoubleRange;
                int i293 = i292 + 1;
                this.toDoubleRange = i293;
                iArr117[i292] = -1;
                int i294 = i293 - 1;
                this.toDoubleRange = i294;
                iArr117[i294 - 1] = iArr117[i294 - 1] ^ iArr117[i294];
                int i295 = i294 + 1;
                this.toDoubleRange = i295;
                int i296 = iArr117[i295 - 2];
                iArr117[i294] = i296;
                iArr117[i295 - 2] = iArr117[i295 - 3];
                iArr117[i295 - 3] = iArr117[i295 - 4];
                iArr117[i295 - 4] = i296;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
                int[] iArr118 = this.values;
                int i297 = this.toDoubleRange;
                int i298 = i297 + 1;
                this.toDoubleRange = i298;
                int i299 = iArr118[i298 - 2];
                iArr118[i297] = i299;
                iArr118[i298 - 2] = iArr118[i298 - 3];
                iArr118[i298 - 3] = iArr118[i298 - 4];
                iArr118[i298 - 4] = i299;
                int i300 = i298 - 1;
                this.toDoubleRange = i300;
                this.Mean$Arithmetic[i300] = null;
                int i301 = i300 - 1;
                this.toDoubleRange = i301;
                iArr118[i301 - 1] = iArr118[i301] ^ iArr118[i301 - 1];
                return 0;
            case 136:
                int i302 = this.toDoubleRange - 1;
                this.toDoubleRange = i302;
                int[] iArr119 = this.values;
                iArr119[i302 - 1] = iArr119[i302 - 1] - iArr119[i302];
                int i303 = i302 + 1;
                this.toDoubleRange = i303;
                iArr119[i302] = 1;
                int i304 = i303 + 2;
                this.toDoubleRange = i304;
                iArr119[i304 - 1] = iArr119[i304 - 3];
                iArr119[i303] = iArr119[i304 - 4];
                return 0;
            case 137:
                int i305 = this.toDoubleRange - 1;
                this.toDoubleRange = i305;
                int[] iArr120 = this.values;
                iArr120[i305 - 1] = iArr120[i305 - 1] ^ iArr120[i305];
                int i306 = i305 + 1;
                this.toDoubleRange = i306;
                int i307 = iArr120[i306 - 2];
                iArr120[i305] = i307;
                iArr120[i306 - 2] = iArr120[i306 - 3];
                iArr120[i306 - 3] = iArr120[i306 - 4];
                iArr120[i306 - 4] = i307;
                int i308 = i306 - 1;
                this.toDoubleRange = i308;
                this.Mean$Arithmetic[i308] = null;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS:
                int i309 = this.toDoubleRange - 1;
                this.toDoubleRange = i309;
                int[] iArr121 = this.values;
                iArr121[i309 - 1] = iArr121[i309 - 1] << iArr121[i309];
                int i310 = i309 - 1;
                this.toDoubleRange = i310;
                iArr121[i310 - 1] = iArr121[i310 - 1] + iArr121[i310];
                int i311 = i310 + 1;
                this.toDoubleRange = i311;
                iArr121[i310] = iArr121[i311 - 2];
                return 0;
            case 139:
                Object[] objArr13 = this.Mean$Arithmetic;
                int i312 = this.toDoubleRange;
                this.toDoubleRange = i312 + 1;
                objArr13[i312] = objArr13[10];
                return 0;
            case SavingsActivity.RV_BENEFIT_WIDTH /*140*/:
                int[] iArr122 = this.values;
                int i313 = this.toDoubleRange;
                this.toDoubleRange = i313 + 1;
                iArr122[i313] = 65;
                return 0;
            case 141:
                int[] iArr123 = this.values;
                int i314 = this.toDoubleRange;
                int i315 = i314 + 1;
                this.toDoubleRange = i315;
                iArr123[i314] = iArr123[i315 - 2];
                iArr123[i315 - 1] = -iArr123[i315 - 1];
                this.toDoubleRange = i315 + 1;
                iArr123[i315] = -1;
                return 0;
            case 142:
                int i316 = this.toDoubleRange - 1;
                this.toDoubleRange = i316;
                int[] iArr124 = this.values;
                iArr124[i316 - 1] = iArr124[i316 - 1] | iArr124[i316];
                int i317 = i316 - 1;
                this.toDoubleRange = i317;
                iArr124[i317 - 1] = iArr124[i317] & iArr124[i317 - 1];
                return 0;
            case 143:
                int[] iArr125 = this.values;
                int i318 = this.toDoubleRange;
                int i319 = iArr125[i318 - 1];
                iArr125[i318 - 1] = iArr125[i318 - 2];
                iArr125[i318 - 2] = i319;
                int i320 = i318 - 1;
                this.toDoubleRange = i320;
                this.Mean$Arithmetic[i320] = null;
                int i321 = i320 + 1;
                this.toDoubleRange = i321;
                iArr125[i320] = iArr125[i321 - 2];
                return 0;
            case 144:
                int i322 = this.toDoubleRange - 1;
                this.toDoubleRange = i322;
                int[] iArr126 = this.values;
                iArr126[i322 - 1] = iArr126[i322 - 1] - iArr126[i322];
                int i323 = i322 + 1;
                this.toDoubleRange = i323;
                iArr126[i322] = iArr126[i323 - 2];
                return 0;
            case 145:
                Object[] objArr14 = this.Mean$Arithmetic;
                int i324 = this.toDoubleRange;
                int i325 = i324 + 1;
                this.toDoubleRange = i325;
                objArr14[i324] = objArr14[10];
                this.toDoubleRange = i325 + 1;
                objArr14[i325] = objArr14[9];
                return 0;
            case 146:
                Object[] objArr15 = this.Mean$Arithmetic;
                int i326 = this.toDoubleRange;
                int i327 = i326 + 1;
                this.toDoubleRange = i327;
                objArr15[i326] = null;
                int[] iArr127 = this.values;
                int i328 = i327 + 1;
                this.toDoubleRange = i328;
                iArr127[i327] = 1;
                this.toDoubleRange = i328 + 1;
                iArr127[i328] = 0;
                return 0;
            case 147:
                int[] iArr128 = this.values;
                int i329 = this.toDoubleRange;
                this.toDoubleRange = i329 + 1;
                iArr128[i329] = 79;
                return 0;
            case 148:
                int[] iArr129 = this.values;
                int i330 = this.toDoubleRange;
                iArr129[i330 - 1] = -iArr129[i330 - 1];
                int i331 = i330 + 2;
                this.toDoubleRange = i331;
                iArr129[i331 - 1] = iArr129[i331 - 3];
                iArr129[i330] = iArr129[i331 - 4];
                iArr129[i331 - 1] = -iArr129[i331 - 1];
                return 0;
            case 149:
                int[] iArr130 = this.values;
                int i332 = this.toDoubleRange;
                int i333 = i332 + 1;
                this.toDoubleRange = i333;
                iArr130[i332] = 1;
                int i334 = i333 - 1;
                this.toDoubleRange = i334;
                iArr130[i334 - 1] = iArr130[i334 - 1] << iArr130[i334];
                iArr130[i334 - 1] = -iArr130[i334 - 1];
                return 0;
            case 150:
                int i335 = this.toDoubleRange - 1;
                this.toDoubleRange = i335;
                int[] iArr131 = this.values;
                iArr131[i335 - 1] = iArr131[i335 - 1] | iArr131[i335];
                int i336 = i335 - 1;
                this.toDoubleRange = i336;
                iArr131[i336 - 1] = iArr131[i336 - 1] + iArr131[i336];
                return 0;
            case 151:
                int i337 = this.toDoubleRange - 1;
                this.toDoubleRange = i337;
                Object[] objArr16 = this.Mean$Arithmetic;
                Object obj6 = objArr16[i337];
                objArr16[i337] = null;
                this.getMin = obj6 != null ? 1 : 0;
                return 0;
            case 152:
                int[] iArr132 = this.values;
                int i338 = this.toDoubleRange;
                int i339 = i338 + 1;
                this.toDoubleRange = i339;
                iArr132[i338] = 49;
                iArr132[i339 - 1] = -iArr132[i339 - 1];
                return 0;
            case 153:
                int[] iArr133 = this.values;
                int i340 = this.toDoubleRange;
                int i341 = i340 + 2;
                this.toDoubleRange = i341;
                iArr133[i341 - 1] = iArr133[i341 - 3];
                iArr133[i340] = iArr133[i341 - 4];
                iArr133[i341 - 1] = -iArr133[i341 - 1];
                int i342 = i341 + 2;
                this.toDoubleRange = i342;
                iArr133[i342 - 1] = iArr133[i342 - 3];
                iArr133[i341] = iArr133[i342 - 4];
                return 0;
            case 154:
                int[] iArr134 = this.values;
                int i343 = this.toDoubleRange;
                int i344 = i343 + 1;
                this.toDoubleRange = i344;
                int i345 = iArr134[i344 - 2];
                iArr134[i343] = i345;
                iArr134[i344 - 2] = iArr134[i344 - 3];
                iArr134[i344 - 3] = iArr134[i344 - 4];
                iArr134[i344 - 4] = i345;
                int i346 = i344 - 1;
                this.toDoubleRange = i346;
                this.Mean$Arithmetic[i346] = null;
                int i347 = iArr134[i346 - 1];
                iArr134[i346 - 1] = iArr134[i346 - 2];
                iArr134[i346 - 2] = i347;
                return 0;
            case 155:
                int i348 = this.toDoubleRange - 1;
                this.toDoubleRange = i348;
                int[] iArr135 = this.values;
                iArr135[i348 - 1] = iArr135[i348 - 1] | iArr135[i348];
                int i349 = i348 + 1;
                this.toDoubleRange = i349;
                int i350 = iArr135[i349 - 2];
                iArr135[i348] = i350;
                iArr135[i349 - 2] = iArr135[i349 - 3];
                iArr135[i349 - 3] = iArr135[i349 - 4];
                iArr135[i349 - 4] = i350;
                return 0;
            case 156:
                int[] iArr136 = this.values;
                int i351 = this.toDoubleRange;
                iArr136[i351 - 1] = -iArr136[i351 - 1];
                int i352 = i351 + 2;
                this.toDoubleRange = i352;
                iArr136[i352 - 1] = iArr136[i352 - 3];
                iArr136[i351] = iArr136[i352 - 4];
                this.toDoubleRange = i352 + 1;
                iArr136[i352] = -1;
                return 0;
            case 157:
                int i353 = this.toDoubleRange - 1;
                this.toDoubleRange = i353;
                int[] iArr137 = this.values;
                iArr137[i353 - 1] = iArr137[i353 - 1] ^ iArr137[i353];
                int i354 = i353 - 1;
                this.toDoubleRange = i354;
                iArr137[i354 - 1] = iArr137[i354 - 1] ^ iArr137[i354];
                int i355 = i354 - 1;
                this.toDoubleRange = i355;
                this.Mean$Arithmetic[i355] = null;
                return 0;
            case 158:
                int[] iArr138 = this.values;
                int i356 = this.toDoubleRange;
                int i357 = i356 + 1;
                this.toDoubleRange = i357;
                iArr138[i356] = 1;
                int i358 = i357 - 1;
                this.toDoubleRange = i358;
                iArr138[i358 - 1] = iArr138[i358 - 1] << iArr138[i358];
                return 0;
            case 159:
                int[] iArr139 = this.values;
                int i359 = this.toDoubleRange;
                int i360 = i359 + 1;
                this.toDoubleRange = i360;
                iArr139[i359] = iArr139[i360 - 2];
                this.toDoubleRange = i360 + 1;
                iArr139[i360] = 128;
                return 0;
            case BlobStatic.MONITOR_IMAGE_WIDTH /*160*/:
                int[] iArr140 = this.values;
                int i361 = this.toDoubleRange;
                this.toDoubleRange = i361 + 1;
                iArr140[i361] = 40;
                return 0;
            case 161:
                int[] iArr141 = this.values;
                int i362 = this.toDoubleRange;
                int i363 = i362 + 1;
                this.toDoubleRange = i363;
                iArr141[i362] = 21;
                iArr141[i363 - 1] = -iArr141[i363 - 1];
                return 0;
            case 162:
                int[] iArr142 = this.values;
                int i364 = this.toDoubleRange;
                int i365 = i364 + 2;
                this.toDoubleRange = i365;
                iArr142[i365 - 1] = iArr142[i365 - 3];
                iArr142[i364] = iArr142[i365 - 4];
                int i366 = i365 - 1;
                this.toDoubleRange = i366;
                iArr142[i366 - 1] = iArr142[i366] & iArr142[i366 - 1];
                return 0;
            case 163:
                int i367 = this.toDoubleRange - 1;
                this.toDoubleRange = i367;
                this.Mean$Arithmetic[i367] = null;
                int i368 = i367 - 1;
                this.toDoubleRange = i368;
                int[] iArr143 = this.values;
                iArr143[i368 - 1] = iArr143[i368 - 1] | iArr143[i368];
                int i369 = i368 - 1;
                this.toDoubleRange = i369;
                iArr143[i369 - 1] = iArr143[i369 - 1] + iArr143[i369];
                return 0;
            case 164:
                int[] iArr144 = this.values;
                int i370 = this.toDoubleRange;
                this.toDoubleRange = i370 + 1;
                iArr144[i370] = 125;
                return 0;
            case 165:
                int[] iArr145 = this.values;
                int i371 = this.toDoubleRange;
                int i372 = i371 + 2;
                this.toDoubleRange = i372;
                iArr145[i372 - 1] = iArr145[i372 - 3];
                iArr145[i371] = iArr145[i372 - 4];
                int i373 = i372 - 1;
                this.toDoubleRange = i373;
                iArr145[i373 - 1] = iArr145[i373] ^ iArr145[i373 - 1];
                return 0;
            case 166:
                int i374 = this.toDoubleRange - 1;
                this.toDoubleRange = i374;
                int[] iArr146 = this.values;
                iArr146[i374 - 1] = iArr146[i374 - 1] ^ iArr146[i374];
                int i375 = i374 + 2;
                this.toDoubleRange = i375;
                iArr146[i375 - 1] = iArr146[i375 - 3];
                iArr146[i374] = iArr146[i375 - 4];
                return 0;
            case 167:
                int i376 = this.toDoubleRange - 1;
                this.toDoubleRange = i376;
                int[] iArr147 = this.values;
                iArr147[i376 - 1] = iArr147[i376 - 1] << iArr147[i376];
                int i377 = i376 + 1;
                this.toDoubleRange = i377;
                int i378 = iArr147[i377 - 2];
                iArr147[i376] = i378;
                iArr147[i377 - 2] = iArr147[i377 - 3];
                iArr147[i377 - 3] = iArr147[i377 - 4];
                iArr147[i377 - 4] = i378;
                int i379 = i377 - 1;
                this.toDoubleRange = i379;
                this.Mean$Arithmetic[i379] = null;
                return 0;
            case 168:
                int[] iArr148 = this.values;
                int i380 = this.toDoubleRange;
                iArr148[i380 - 1] = -iArr148[i380 - 1];
                int i381 = i380 - 1;
                this.toDoubleRange = i381;
                iArr148[i381 - 1] = iArr148[i381 - 1] ^ iArr148[i381];
                int i382 = i381 - 1;
                this.toDoubleRange = i382;
                iArr148[i382 - 1] = iArr148[i382 - 1] - iArr148[i382];
                return 0;
            case 169:
                int[] iArr149 = this.values;
                int i383 = this.toDoubleRange;
                this.toDoubleRange = i383 + 1;
                iArr149[i383] = 93;
                return 0;
            case 170:
                int[] iArr150 = this.values;
                int i384 = this.toDoubleRange;
                int i385 = i384 + 1;
                this.toDoubleRange = i385;
                iArr150[i384] = 0;
                int i386 = i385 - 1;
                this.toDoubleRange = i386;
                iArr150[i386 - 1] = iArr150[i386 - 1] / iArr150[i386];
                int i387 = i386 - 1;
                this.toDoubleRange = i387;
                this.Mean$Arithmetic[i387] = null;
                return 0;
            case 171:
                int i388 = this.toDoubleRange - 1;
                this.toDoubleRange = i388;
                Object[] objArr17 = this.Mean$Arithmetic;
                Object obj7 = objArr17[i388];
                objArr17[i388] = null;
                objArr17[10] = obj7;
                int i389 = i388 + 1;
                this.toDoubleRange = i389;
                objArr17[i388] = objArr17[9];
                this.toDoubleRange = i389 + 1;
                objArr17[i389] = objArr17[10];
                return 0;
            case 172:
                int[] iArr151 = this.values;
                int i390 = this.toDoubleRange;
                this.toDoubleRange = i390 + 1;
                iArr151[i390] = 83;
                return 0;
            case 173:
                int[] iArr152 = this.values;
                int i391 = this.toDoubleRange;
                int i392 = i391 + 1;
                this.toDoubleRange = i392;
                iArr152[i391] = 109;
                int i393 = i392 + 2;
                this.toDoubleRange = i393;
                iArr152[i393 - 1] = iArr152[i393 - 3];
                iArr152[i392] = iArr152[i393 - 4];
                return 0;
            case 174:
                int i394 = this.toDoubleRange - 1;
                this.toDoubleRange = i394;
                int[] iArr153 = this.values;
                iArr153[i394 - 1] = iArr153[i394 - 1] << iArr153[i394];
                int i395 = i394 + 1;
                this.toDoubleRange = i395;
                int i396 = iArr153[i395 - 2];
                iArr153[i394] = i396;
                iArr153[i395 - 2] = iArr153[i395 - 3];
                iArr153[i395 - 3] = iArr153[i395 - 4];
                iArr153[i395 - 4] = i396;
                return 0;
            case 175:
                int i397 = this.toDoubleRange - 1;
                this.toDoubleRange = i397;
                int[] iArr154 = this.values;
                iArr154[i397 - 1] = iArr154[i397 - 1] - iArr154[i397];
                int i398 = i397 + 1;
                this.toDoubleRange = i398;
                iArr154[i397] = iArr154[i398 - 2];
                this.toDoubleRange = i398 + 1;
                iArr154[i398] = 128;
                return 0;
            case 176:
                int[] iArr155 = this.values;
                int i399 = this.toDoubleRange;
                this.toDoubleRange = i399 + 1;
                iArr155[i399] = 1;
                return 0;
            case 177:
                int i400 = this.toDoubleRange - 1;
                this.toDoubleRange = i400;
                int[] iArr156 = this.values;
                iArr156[i400 - 1] = iArr156[i400 - 1] ^ iArr156[i400];
                int i401 = i400 - 1;
                this.toDoubleRange = i401;
                iArr156[i401 - 1] = iArr156[i401 - 1] - iArr156[i401];
                return 0;
            case 178:
                int[] iArr157 = this.values;
                int i402 = this.toDoubleRange;
                this.toDoubleRange = i402 + 1;
                iArr157[i402] = 13;
                return 0;
            case 179:
                Object[] objArr18 = this.Mean$Arithmetic;
                int i403 = this.toDoubleRange;
                int i404 = i403 + 1;
                this.toDoubleRange = i404;
                objArr18[i403] = objArr18[11];
                this.toDoubleRange = i404 + 1;
                objArr18[i404] = objArr18[12];
                return 0;
            case 180:
                int i405 = this.toDoubleRange - 1;
                this.toDoubleRange = i405;
                Object[] objArr19 = this.Mean$Arithmetic;
                Object obj8 = objArr19[i405];
                objArr19[i405] = null;
                objArr19[11] = obj8;
                int i406 = i405 + 1;
                this.toDoubleRange = i406;
                objArr19[i405] = objArr19[9];
                int i407 = i406 + 1;
                this.toDoubleRange = i407;
                objArr19[i406] = objArr19[i407 - 2];
                return 0;
            case 181:
                int i408 = this.toDoubleRange - 1;
                this.toDoubleRange = i408;
                Object[] objArr20 = this.Mean$Arithmetic;
                Object obj9 = objArr20[i408];
                objArr20[i408] = null;
                objArr20[12] = obj9;
                return 0;
            case 182:
                Object[] objArr21 = this.Mean$Arithmetic;
                int i409 = this.toDoubleRange;
                this.toDoubleRange = i409 + 1;
                objArr21[i409] = objArr21[11];
                return 0;
            case 183:
                int[] iArr158 = this.values;
                int i410 = this.toDoubleRange;
                int i411 = i410 + 1;
                this.toDoubleRange = i411;
                iArr158[i410] = 121;
                iArr158[i411 - 1] = -iArr158[i411 - 1];
                int i412 = i411 + 1;
                this.toDoubleRange = i412;
                iArr158[i411] = iArr158[i412 - 2];
                return 0;
            case 184:
                int[] iArr159 = this.values;
                int i413 = this.toDoubleRange;
                iArr159[i413 - 1] = -iArr159[i413 - 1];
                this.toDoubleRange = i413 + 1;
                iArr159[i413] = -1;
                return 0;
            case WSContextConstant.HANDSHAKE_RECEIVE_SIZE /*185*/:
                int i414 = this.toDoubleRange - 1;
                this.toDoubleRange = i414;
                int[] iArr160 = this.values;
                iArr160[i414 - 1] = iArr160[i414 - 1] | iArr160[i414];
                int i415 = iArr160[i414 - 1];
                iArr160[i414 - 1] = iArr160[i414 - 2];
                iArr160[i414 - 2] = i415;
                return 0;
            case 186:
                int[] iArr161 = this.values;
                int i416 = this.toDoubleRange;
                iArr161[i416 - 1] = -iArr161[i416 - 1];
                int i417 = i416 - 1;
                this.toDoubleRange = i417;
                iArr161[i417 - 1] = iArr161[i417 - 1] & iArr161[i417];
                int i418 = i417 + 1;
                this.toDoubleRange = i418;
                int i419 = iArr161[i418 - 2];
                iArr161[i417] = i419;
                iArr161[i418 - 2] = iArr161[i418 - 3];
                iArr161[i418 - 3] = iArr161[i418 - 4];
                iArr161[i418 - 4] = i419;
                return 0;
            case 187:
                int[] iArr162 = this.values;
                int i420 = this.toDoubleRange;
                int i421 = i420 + 1;
                this.toDoubleRange = i421;
                iArr162[i420] = 1;
                int i422 = i421 + 2;
                this.toDoubleRange = i422;
                iArr162[i422 - 1] = iArr162[i422 - 3];
                iArr162[i421] = iArr162[i422 - 4];
                iArr162[i422 - 1] = -iArr162[i422 - 1];
                return 0;
            case TsExtractor.TS_PACKET_SIZE:
                int[] iArr163 = this.values;
                int i423 = this.toDoubleRange;
                int i424 = i423 + 1;
                this.toDoubleRange = i424;
                iArr163[i423] = 1;
                int i425 = i424 - 1;
                this.toDoubleRange = i425;
                iArr163[i425 - 1] = iArr163[i425 - 1] << iArr163[i425];
                int i426 = i425 - 1;
                this.toDoubleRange = i426;
                iArr163[i426 - 1] = iArr163[i426 - 1] + iArr163[i426];
                return 0;
            case 189:
                this.getMin = this.values[this.toDoubleRange - 1];
                return 0;
            case 190:
                int[] iArr164 = this.values;
                int i427 = this.toDoubleRange;
                this.toDoubleRange = i427 + 1;
                iArr164[i427] = 71;
                return 0;
            case 191:
                int[] iArr165 = this.values;
                int i428 = this.toDoubleRange;
                int i429 = i428 + 1;
                this.toDoubleRange = i429;
                iArr165[i428] = 87;
                int i430 = i429 + 1;
                this.toDoubleRange = i430;
                iArr165[i429] = iArr165[i430 - 2];
                this.toDoubleRange = i430 + 1;
                iArr165[i430] = -1;
                return 0;
            case PsExtractor.AUDIO_STREAM:
                int[] iArr166 = this.values;
                int i431 = this.toDoubleRange;
                int i432 = i431 + 2;
                this.toDoubleRange = i432;
                iArr166[i432 - 1] = iArr166[i432 - 3];
                iArr166[i431] = iArr166[i432 - 4];
                iArr166[i432 - 1] = -iArr166[i432 - 1];
                int i433 = i432 - 1;
                this.toDoubleRange = i433;
                iArr166[i433 - 1] = iArr166[i433] | iArr166[i433 - 1];
                return 0;
            case 193:
                int i434 = this.toDoubleRange - 1;
                this.toDoubleRange = i434;
                int[] iArr167 = this.values;
                iArr167[i434 - 1] = iArr167[i434 - 1] ^ iArr167[i434];
                int i435 = i434 - 1;
                this.toDoubleRange = i435;
                iArr167[i435 - 1] = iArr167[i435 - 1] - iArr167[i435];
                this.toDoubleRange = i435 + 1;
                iArr167[i435] = 1;
                return 0;
            case 194:
                int[] iArr168 = this.values;
                int i436 = this.toDoubleRange;
                int i437 = i436 + 1;
                this.toDoubleRange = i437;
                iArr168[i436] = 9;
                iArr168[i437 - 1] = -iArr168[i437 - 1];
                int i438 = i437 + 2;
                this.toDoubleRange = i438;
                iArr168[i438 - 1] = iArr168[i438 - 3];
                iArr168[i437] = iArr168[i438 - 4];
                return 0;
            case 195:
                int i439 = this.toDoubleRange - 1;
                this.toDoubleRange = i439;
                int[] iArr169 = this.values;
                iArr169[i439 - 1] = iArr169[i439 - 1] & iArr169[i439];
                int i440 = i439 - 1;
                this.toDoubleRange = i440;
                iArr169[i440 - 1] = iArr169[i440] | iArr169[i440 - 1];
                return 0;
            case 196:
                int i441 = this.toDoubleRange - 1;
                this.toDoubleRange = i441;
                int[] iArr170 = this.values;
                iArr170[i441 - 1] = iArr170[i441 - 1] & iArr170[i441];
                int i442 = i441 + 1;
                this.toDoubleRange = i442;
                int i443 = iArr170[i442 - 2];
                iArr170[i441] = i443;
                iArr170[i442 - 2] = iArr170[i442 - 3];
                iArr170[i442 - 3] = iArr170[i442 - 4];
                iArr170[i442 - 4] = i443;
                return 0;
            case 197:
                int[] iArr171 = this.values;
                int i444 = this.toDoubleRange;
                iArr171[i444 - 1] = -iArr171[i444 - 1];
                int i445 = i444 - 1;
                this.toDoubleRange = i445;
                iArr171[i445 - 1] = iArr171[i445 - 1] | iArr171[i445];
                int i446 = i445 - 1;
                this.toDoubleRange = i446;
                iArr171[i446 - 1] = iArr171[i446 - 1] + iArr171[i446];
                return 0;
            case 198:
                int[] iArr172 = this.values;
                int i447 = this.toDoubleRange;
                this.toDoubleRange = i447 + 1;
                iArr172[i447] = 82;
                return 0;
            case SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR /*199*/:
                int[] iArr173 = this.values;
                int i448 = this.toDoubleRange;
                this.toDoubleRange = i448 + 1;
                iArr173[i448] = 35;
                return 0;
            case 200:
                int[] iArr174 = this.values;
                int i449 = this.toDoubleRange;
                Object[] objArr22 = this.Mean$Arithmetic;
                Object obj10 = objArr22[i449 - 1];
                objArr22[i449 - 1] = null;
                iArr174[i449 - 1] = ((int[]) obj10).length;
                return 0;
            case 201:
                int[] iArr175 = this.values;
                int i450 = this.toDoubleRange;
                int i451 = i450 + 1;
                this.toDoubleRange = i451;
                iArr175[i450] = 1;
                int i452 = i451 - 1;
                this.toDoubleRange = i452;
                iArr175[i452 - 1] = iArr175[i452 - 1] - iArr175[i452];
                return 0;
            case 202:
                int[] iArr176 = this.values;
                int i453 = this.toDoubleRange;
                iArr176[i453 - 1] = -iArr176[i453 - 1];
                int i454 = i453 - 1;
                this.toDoubleRange = i454;
                iArr176[i454 - 1] = iArr176[i454] ^ iArr176[i454 - 1];
                return 0;
            case 203:
                int[] iArr177 = this.values;
                int i455 = this.toDoubleRange;
                this.toDoubleRange = i455 + 1;
                iArr177[i455] = 60;
                return 0;
            case 204:
                Object[] objArr23 = this.Mean$Arithmetic;
                int i456 = this.toDoubleRange;
                int i457 = i456 + 1;
                this.toDoubleRange = i457;
                objArr23[i456] = objArr23[11];
                int[] iArr178 = this.values;
                this.toDoubleRange = i457 + 1;
                iArr178[i457] = 0;
                return 0;
            case 205:
                int[] iArr179 = this.values;
                int i458 = this.toDoubleRange;
                this.toDoubleRange = i458 + 1;
                iArr179[i458] = 44;
                return 0;
            case 206:
                int[] iArr180 = this.values;
                int i459 = this.toDoubleRange;
                int i460 = i459 + 1;
                this.toDoubleRange = i460;
                iArr180[i459] = 95;
                int i461 = i460 + 2;
                this.toDoubleRange = i461;
                iArr180[i461 - 1] = iArr180[i461 - 3];
                iArr180[i460] = iArr180[i461 - 4];
                return 0;
            case 207:
                int[] iArr181 = this.values;
                int i462 = this.toDoubleRange;
                int i463 = i462 + 1;
                this.toDoubleRange = i463;
                iArr181[i462] = 93;
                iArr181[i463 - 1] = -iArr181[i463 - 1];
                return 0;
            case 208:
                int i464 = this.toDoubleRange - 1;
                this.toDoubleRange = i464;
                int[] iArr182 = this.values;
                iArr182[i464 - 1] = iArr182[i464 - 1] ^ iArr182[i464];
                int i465 = iArr182[i464 - 1];
                iArr182[i464 - 1] = iArr182[i464 - 2];
                iArr182[i464 - 2] = i465;
                return 0;
            case 209:
                int i466 = this.toDoubleRange - 1;
                this.toDoubleRange = i466;
                this.Mean$Arithmetic[i466] = null;
                int i467 = i466 - 1;
                this.toDoubleRange = i467;
                int[] iArr183 = this.values;
                iArr183[i467 - 1] = iArr183[i467 - 1] - iArr183[i467];
                this.toDoubleRange = i467 + 1;
                iArr183[i467] = 1;
                return 0;
            case 210:
                int[] iArr184 = this.values;
                int i468 = this.toDoubleRange;
                this.toDoubleRange = i468 + 1;
                iArr184[i468] = 90;
                return 0;
            case 211:
                int i469 = this.toDoubleRange - 1;
                this.toDoubleRange = i469;
                Object[] objArr24 = this.Mean$Arithmetic;
                Object obj11 = objArr24[i469];
                objArr24[i469] = null;
                objArr24[10] = obj11;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_STORE_LOW_VERSION_DATA_FILE /*212*/:
                int[] iArr185 = this.values;
                int i470 = this.toDoubleRange;
                this.toDoubleRange = i470 + 1;
                iArr185[i470] = 5;
                return 0;
            case 213:
                int[] iArr186 = this.values;
                int i471 = this.toDoubleRange;
                int i472 = i471 + 1;
                this.toDoubleRange = i472;
                iArr186[i471] = 4;
                int i473 = i472 - 1;
                this.toDoubleRange = i473;
                iArr186[i473 - 1] = iArr186[i473 - 1] >> iArr186[i473];
                return 0;
            case 214:
                int[] iArr187 = this.values;
                int i474 = this.toDoubleRange;
                this.toDoubleRange = i474 + 1;
                iArr187[i474] = 96;
                return 0;
            case 215:
                int[] iArr188 = this.values;
                int i475 = this.toDoubleRange;
                this.toDoubleRange = i475 + 1;
                iArr188[i475] = 46;
                return 0;
            case 216:
                int[] iArr189 = this.values;
                int i476 = this.toDoubleRange;
                int i477 = i476 + 1;
                this.toDoubleRange = i477;
                iArr189[i476] = 61;
                iArr189[i477 - 1] = -iArr189[i477 - 1];
                return 0;
            case FileUtils.JPEG_MARKER_EOI /*217*/:
                int[] iArr190 = this.values;
                int i478 = this.toDoubleRange;
                int i479 = i478 + 1;
                this.toDoubleRange = i479;
                iArr190[i478] = 4;
                iArr190[i479 - 1] = -iArr190[i479 - 1];
                int i480 = i479 + 2;
                this.toDoubleRange = i480;
                iArr190[i480 - 1] = iArr190[i480 - 3];
                iArr190[i479] = iArr190[i480 - 4];
                return 0;
            case 218:
                int[] iArr191 = this.values;
                int i481 = this.toDoubleRange;
                iArr191[i481 - 1] = -iArr191[i481 - 1];
                int i482 = i481 - 1;
                this.toDoubleRange = i482;
                iArr191[i482 - 1] = iArr191[i482 - 1] ^ iArr191[i482];
                int i483 = i482 + 1;
                this.toDoubleRange = i483;
                int i484 = iArr191[i483 - 2];
                iArr191[i482] = i484;
                iArr191[i483 - 2] = iArr191[i483 - 3];
                iArr191[i483 - 3] = iArr191[i483 - 4];
                iArr191[i483 - 4] = i484;
                return 0;
            case 219:
                int i485 = this.toDoubleRange - 1;
                this.toDoubleRange = i485;
                int[] iArr192 = this.values;
                iArr192[i485 - 1] = iArr192[i485 - 1] + iArr192[i485];
                int i486 = i485 - 1;
                this.toDoubleRange = i486;
                this.Mean$Arithmetic[i486] = null;
                return 0;
            case WheelView.DIVIDER_ALPHA /*220*/:
                int[] iArr193 = this.values;
                int i487 = this.toDoubleRange;
                this.toDoubleRange = i487 + 1;
                iArr193[i487] = 26;
                return 0;
            case 221:
                int[] iArr194 = this.values;
                int i488 = this.toDoubleRange;
                int i489 = i488 + 1;
                this.toDoubleRange = i489;
                iArr194[i488] = 17;
                int i490 = i489 + 2;
                this.toDoubleRange = i490;
                iArr194[i490 - 1] = iArr194[i490 - 3];
                iArr194[i489] = iArr194[i490 - 4];
                return 0;
            case 222:
                int i491 = this.toDoubleRange - 1;
                this.toDoubleRange = i491;
                int[] iArr195 = this.values;
                iArr195[i491 - 1] = iArr195[i491 - 1] ^ iArr195[i491];
                int i492 = i491 - 1;
                this.toDoubleRange = i492;
                iArr195[i492 - 1] = iArr195[i492 - 1] - iArr195[i492];
                int i493 = i492 + 1;
                this.toDoubleRange = i493;
                iArr195[i492] = iArr195[i493 - 2];
                return 0;
            case 223:
                Object[] objArr25 = this.Mean$Arithmetic;
                int i494 = this.toDoubleRange;
                int i495 = i494 + 1;
                this.toDoubleRange = i495;
                objArr25[i494] = objArr25[9];
                this.toDoubleRange = i495 + 1;
                objArr25[i495] = objArr25[12];
                return 0;
            case 224:
                Object[] objArr26 = this.Mean$Arithmetic;
                int i496 = this.toDoubleRange;
                int i497 = i496 + 1;
                this.toDoubleRange = i497;
                objArr26[i496] = objArr26[i497 - 2];
                int i498 = i497 - 1;
                this.toDoubleRange = i498;
                Object obj12 = objArr26[i498];
                objArr26[i498] = null;
                objArr26[12] = obj12;
                return 0;
            case 225:
                int[] iArr196 = this.values;
                int i499 = this.toDoubleRange;
                int i500 = i499 + 1;
                this.toDoubleRange = i500;
                iArr196[i499] = 19;
                int i501 = i500 + 2;
                this.toDoubleRange = i501;
                iArr196[i501 - 1] = iArr196[i501 - 3];
                iArr196[i500] = iArr196[i501 - 4];
                return 0;
            case 226:
                int[] iArr197 = this.values;
                int i502 = this.toDoubleRange;
                int i503 = i502 + 1;
                this.toDoubleRange = i503;
                iArr197[i502] = 3;
                int i504 = i503 - 1;
                this.toDoubleRange = i504;
                iArr197[i504 - 1] = iArr197[i504 - 1] / iArr197[i504];
                int i505 = i504 - 1;
                this.toDoubleRange = i505;
                this.Mean$Arithmetic[i505] = null;
                return 0;
            case 227:
                int[] iArr198 = this.values;
                int i506 = this.toDoubleRange;
                int i507 = i506 + 1;
                this.toDoubleRange = i507;
                iArr198[i506] = 85;
                iArr198[i507 - 1] = -iArr198[i507 - 1];
                int i508 = i507 + 2;
                this.toDoubleRange = i508;
                iArr198[i508 - 1] = iArr198[i508 - 3];
                iArr198[i507] = iArr198[i508 - 4];
                return 0;
            case 228:
                int i509 = this.toDoubleRange - 1;
                this.toDoubleRange = i509;
                this.Mean$Arithmetic[i509] = null;
                int i510 = i509 - 1;
                this.toDoubleRange = i510;
                int[] iArr199 = this.values;
                iArr199[i510 - 1] = iArr199[i510 - 1] & iArr199[i510];
                int i511 = i510 - 1;
                this.toDoubleRange = i511;
                iArr199[i511 - 1] = iArr199[i511] | iArr199[i511 - 1];
                return 0;
            case 229:
                int[] iArr200 = this.values;
                int i512 = this.toDoubleRange;
                this.toDoubleRange = i512 + 1;
                iArr200[i512] = 45;
                return 0;
            case 230:
                int i513 = this.toDoubleRange - 1;
                this.toDoubleRange = i513;
                Object[] objArr27 = this.Mean$Arithmetic;
                Object obj13 = objArr27[i513];
                objArr27[i513] = null;
                objArr27[11] = obj13;
                return 0;
            case 231:
                int[] iArr201 = this.values;
                int i514 = this.toDoubleRange;
                this.toDoubleRange = i514 + 1;
                iArr201[i514] = 91;
                return 0;
            case 232:
                int[] iArr202 = this.values;
                int i515 = this.toDoubleRange;
                int i516 = i515 + 1;
                this.toDoubleRange = i516;
                iArr202[i515] = 1;
                iArr202[i516 - 1] = -iArr202[i516 - 1];
                int i517 = i516 + 1;
                this.toDoubleRange = i517;
                iArr202[i516] = iArr202[i517 - 2];
                return 0;
            case 233:
                int i518 = this.toDoubleRange - 1;
                this.toDoubleRange = i518;
                this.Mean$Arithmetic[i518] = null;
                int[] iArr203 = this.values;
                int i519 = i518 + 2;
                this.toDoubleRange = i519;
                iArr203[i519 - 1] = iArr203[i519 - 3];
                iArr203[i518] = iArr203[i519 - 4];
                iArr203[i519 - 1] = -iArr203[i519 - 1];
                return 0;
            case 234:
                int i520 = this.toDoubleRange - 1;
                this.toDoubleRange = i520;
                int[] iArr204 = this.values;
                iArr204[i520 - 1] = iArr204[i520 - 1] + iArr204[i520];
                this.toDoubleRange = i520 + 1;
                iArr204[i520] = 1;
                return 0;
            case 235:
                int i521 = this.toDoubleRange - 1;
                this.toDoubleRange = i521;
                this.Mean$Arithmetic[i521] = null;
                int i522 = i521 - 1;
                this.toDoubleRange = i522;
                int[] iArr205 = this.values;
                iArr205[i522 - 1] = iArr205[i522 - 1] ^ iArr205[i522];
                int i523 = i522 - 1;
                this.toDoubleRange = i523;
                iArr205[i523 - 1] = iArr205[i523 - 1] - iArr205[i523];
                return 0;
            case 236:
                int[] iArr206 = this.values;
                int i524 = this.toDoubleRange;
                int i525 = i524 + 1;
                this.toDoubleRange = i525;
                iArr206[i524] = 4;
                this.toDoubleRange = i525 + 1;
                iArr206[i525] = 5;
                return 0;
            case 237:
                int i526 = this.toDoubleRange - 1;
                this.toDoubleRange = i526;
                int[] iArr207 = this.values;
                iArr207[i526 - 1] = iArr207[i526 - 1] * iArr207[i526];
                return 0;
            case 238:
                int[] iArr208 = this.values;
                int i527 = this.toDoubleRange;
                this.toDoubleRange = i527 + 1;
                iArr208[i527] = 63;
                return 0;
            case 239:
                Object[] objArr28 = this.Mean$Arithmetic;
                int i528 = this.toDoubleRange;
                this.toDoubleRange = i528 + 1;
                objArr28[i528] = objArr28[12];
                return 0;
            case 240:
                int[] iArr209 = this.values;
                int i529 = this.toDoubleRange;
                this.toDoubleRange = i529 + 1;
                iArr209[i529] = 52;
                return 0;
            case 241:
                int[] iArr210 = this.values;
                int i530 = this.toDoubleRange;
                int i531 = i530 + 1;
                this.toDoubleRange = i531;
                iArr210[i530] = 105;
                iArr210[i531 - 1] = -iArr210[i531 - 1];
                return 0;
            case 242:
                int[] iArr211 = this.values;
                int i532 = this.toDoubleRange;
                this.toDoubleRange = i532 + 1;
                iArr211[i532] = 0;
                return 0;
            case 243:
                int i533 = this.toDoubleRange - 1;
                this.toDoubleRange = i533;
                int[] iArr212 = this.values;
                iArr212[i533 - 1] = iArr212[i533 - 1] / iArr212[i533];
                return 0;
            case 244:
                int[] iArr213 = this.values;
                int i534 = this.toDoubleRange;
                this.toDoubleRange = i534 + 1;
                iArr213[i534] = 70;
                return 0;
            case 245:
                int[] iArr214 = this.values;
                int i535 = this.toDoubleRange;
                this.toDoubleRange = i535 + 1;
                iArr214[i535] = 69;
                return 0;
            case 246:
                int[] iArr215 = this.values;
                int i536 = this.toDoubleRange;
                int i537 = i536 + 2;
                this.toDoubleRange = i537;
                iArr215[i537 - 1] = iArr215[i537 - 3];
                iArr215[i536] = iArr215[i537 - 4];
                int i538 = i537 - 1;
                this.toDoubleRange = i538;
                iArr215[i538 - 1] = iArr215[i538 - 1] & iArr215[i538];
                int i539 = i538 + 1;
                this.toDoubleRange = i539;
                int i540 = iArr215[i539 - 2];
                iArr215[i538] = i540;
                iArr215[i539 - 2] = iArr215[i539 - 3];
                iArr215[i539 - 3] = iArr215[i539 - 4];
                iArr215[i539 - 4] = i540;
                return 0;
            case 247:
                int[] iArr216 = this.values;
                int i541 = this.toDoubleRange;
                int i542 = i541 + 1;
                this.toDoubleRange = i542;
                iArr216[i541] = 65;
                int i543 = i542 + 1;
                this.toDoubleRange = i543;
                iArr216[i542] = iArr216[i543 - 2];
                return 0;
            case 248:
                int i544 = this.toDoubleRange - 1;
                this.toDoubleRange = i544;
                int[] iArr217 = this.values;
                iArr217[i544 - 1] = iArr217[i544 - 1] ^ iArr217[i544];
                int i545 = i544 - 1;
                this.toDoubleRange = i545;
                iArr217[i545 - 1] = iArr217[i545 - 1] & iArr217[i545];
                int i546 = i545 - 1;
                this.toDoubleRange = i546;
                iArr217[i546 - 1] = iArr217[i546] | iArr217[i546 - 1];
                return 0;
            case 249:
                int[] iArr218 = this.values;
                int i547 = this.toDoubleRange;
                int i548 = i547 + 1;
                this.toDoubleRange = i548;
                iArr218[i547] = 69;
                iArr218[i548 - 1] = -iArr218[i548 - 1];
                int i549 = i548 + 2;
                this.toDoubleRange = i549;
                iArr218[i549 - 1] = iArr218[i549 - 3];
                iArr218[i548] = iArr218[i549 - 4];
                return 0;
            case SQLiteDatabase.MAX_SQL_CACHE_SIZE /*250*/:
                int[] iArr219 = this.values;
                int i550 = this.toDoubleRange;
                this.toDoubleRange = i550 + 1;
                iArr219[i550] = 87;
                return 0;
            case 251:
                int i551 = this.toDoubleRange - 1;
                this.toDoubleRange = i551;
                int[] iArr220 = this.values;
                iArr220[i551 - 1] = iArr220[i551 - 1] | iArr220[i551];
                int i552 = i551 + 1;
                this.toDoubleRange = i552;
                int i553 = iArr220[i552 - 2];
                iArr220[i551] = i553;
                iArr220[i552 - 2] = iArr220[i552 - 3];
                iArr220[i552 - 3] = iArr220[i552 - 4];
                iArr220[i552 - 4] = i553;
                int i554 = i552 - 1;
                this.toDoubleRange = i554;
                this.Mean$Arithmetic[i554] = null;
                return 0;
            case 252:
                int[] iArr221 = this.values;
                int i555 = this.toDoubleRange;
                int i556 = i555 + 1;
                this.toDoubleRange = i556;
                iArr221[i555] = 83;
                iArr221[i556 - 1] = -iArr221[i556 - 1];
                return 0;
            case 253:
                int i557 = this.toDoubleRange - 1;
                this.toDoubleRange = i557;
                int[] iArr222 = this.values;
                iArr222[i557 - 1] = iArr222[i557 - 1] & iArr222[i557];
                this.toDoubleRange = i557 + 1;
                iArr222[i557] = -1;
                return 0;
            case 254:
                int i558 = this.toDoubleRange - 1;
                this.toDoubleRange = i558;
                int[] iArr223 = this.values;
                iArr223[i558 - 1] = iArr223[i558 - 1] | iArr223[i558];
                int i559 = i558 - 1;
                this.toDoubleRange = i559;
                iArr223[i559 - 1] = iArr223[i559 - 1] & iArr223[i559];
                int i560 = iArr223[i559 - 1];
                iArr223[i559 - 1] = iArr223[i559 - 2];
                iArr223[i559 - 2] = i560;
                return 0;
            case 255:
                int[] iArr224 = this.values;
                int i561 = this.toDoubleRange;
                iArr224[i561 - 1] = -iArr224[i561 - 1];
                int i562 = i561 + 2;
                this.toDoubleRange = i562;
                iArr224[i562 - 1] = iArr224[i562 - 3];
                iArr224[i561] = iArr224[i562 - 4];
                int i563 = i562 - 1;
                this.toDoubleRange = i563;
                iArr224[i563 - 1] = iArr224[i563] | iArr224[i563 - 1];
                return 0;
            case 256:
                int[] iArr225 = this.values;
                int i564 = this.toDoubleRange;
                this.toDoubleRange = i564 + 1;
                iArr225[i564] = 77;
                return 0;
            case 257:
                int[] iArr226 = this.values;
                int i565 = this.toDoubleRange;
                int i566 = i565 + 2;
                this.toDoubleRange = i566;
                iArr226[i566 - 1] = iArr226[i566 - 3];
                iArr226[i565] = iArr226[i566 - 4];
                int i567 = i566 - 1;
                this.toDoubleRange = i567;
                iArr226[i567 - 1] = iArr226[i567] | iArr226[i567 - 1];
                return 0;
            case 258:
                int[] iArr227 = this.values;
                int i568 = this.toDoubleRange;
                int i569 = i568 + 1;
                this.toDoubleRange = i569;
                int i570 = iArr227[i569 - 2];
                iArr227[i568] = i570;
                iArr227[i569 - 2] = iArr227[i569 - 3];
                iArr227[i569 - 3] = iArr227[i569 - 4];
                iArr227[i569 - 4] = i570;
                int i571 = i569 - 1;
                this.toDoubleRange = i571;
                this.Mean$Arithmetic[i571] = null;
                int i572 = i571 + 2;
                this.toDoubleRange = i572;
                iArr227[i572 - 1] = iArr227[i572 - 3];
                iArr227[i571] = iArr227[i572 - 4];
                return 0;
            case 259:
                int i573 = this.toDoubleRange - 1;
                this.toDoubleRange = i573;
                int[] iArr228 = this.values;
                iArr228[i573 - 1] = iArr228[i573 - 1] | iArr228[i573];
                int i574 = i573 - 1;
                this.toDoubleRange = i574;
                iArr228[i574 - 1] = iArr228[i574 - 1] & iArr228[i574];
                int i575 = i574 - 1;
                this.toDoubleRange = i575;
                iArr228[i575 - 1] = iArr228[i575 - 1] - iArr228[i575];
                return 0;
            case 260:
                int[] iArr229 = this.values;
                int i576 = this.toDoubleRange;
                this.toDoubleRange = i576 + 1;
                iArr229[i576] = 17;
                return 0;
            case 261:
                int[] iArr230 = this.values;
                int i577 = this.toDoubleRange;
                this.toDoubleRange = i577 + 1;
                iArr230[i577] = 4;
                return 0;
            case 262:
                int[] iArr231 = this.values;
                int i578 = this.toDoubleRange;
                this.toDoubleRange = i578 + 1;
                iArr231[i578] = 3;
                return 0;
            case 263:
                int[] iArr232 = this.values;
                int i579 = this.toDoubleRange;
                int i580 = i579 + 1;
                this.toDoubleRange = i580;
                iArr232[i579] = 37;
                int i581 = i580 - 1;
                this.toDoubleRange = i581;
                iArr232[i581 - 1] = iArr232[i581 - 1] + iArr232[i581];
                int i582 = i581 + 1;
                this.toDoubleRange = i582;
                iArr232[i581] = iArr232[i582 - 2];
                return 0;
            case 264:
                int[] iArr233 = this.values;
                int i583 = this.toDoubleRange;
                this.toDoubleRange = i583 + 1;
                iArr233[i583] = 16;
                return 0;
            case 265:
                int[] iArr234 = this.values;
                int i584 = this.toDoubleRange;
                this.toDoubleRange = i584 + 1;
                iArr234[i584] = 80;
                return 0;
            case 266:
                int[] iArr235 = this.values;
                int i585 = this.toDoubleRange;
                this.toDoubleRange = i585 + 1;
                iArr235[i585] = 61;
                return 0;
            case 267:
                int[] iArr236 = this.values;
                int i586 = this.toDoubleRange;
                iArr236[i586 - 1] = -iArr236[i586 - 1];
                int i587 = i586 - 1;
                this.toDoubleRange = i587;
                iArr236[i587 - 1] = iArr236[i587 - 1] | iArr236[i587];
                this.toDoubleRange = i587 + 1;
                iArr236[i587] = 1;
                return 0;
            case 268:
                int[] iArr237 = this.values;
                int i588 = this.toDoubleRange;
                this.toDoubleRange = i588 + 1;
                iArr237[i588] = 78;
                return 0;
            case 269:
                int[] iArr238 = this.values;
                int i589 = this.toDoubleRange;
                int i590 = i589 + 1;
                this.toDoubleRange = i590;
                iArr238[i589] = 55;
                this.toDoubleRange = i590 + 1;
                iArr238[i590] = 0;
                return 0;
            case 270:
                int i591 = this.toDoubleRange - 1;
                this.toDoubleRange = i591;
                int[] iArr239 = this.values;
                iArr239[i591 - 1] = iArr239[i591 - 1] / iArr239[i591];
                int i592 = i591 - 1;
                this.toDoubleRange = i592;
                this.Mean$Arithmetic[i592] = null;
                return 0;
            case 271:
                int[] iArr240 = this.values;
                int i593 = this.toDoubleRange;
                this.toDoubleRange = i593 + 1;
                iArr240[i593] = 113;
                return 0;
            case LZMA_Base.kNumLenSymbols:
                int[] iArr241 = this.values;
                int i594 = this.toDoubleRange;
                int i595 = i594 + 1;
                this.toDoubleRange = i595;
                iArr241[i594] = 11;
                iArr241[i595 - 1] = -iArr241[i595 - 1];
                int i596 = i595 + 2;
                this.toDoubleRange = i596;
                iArr241[i596 - 1] = iArr241[i596 - 3];
                iArr241[i595] = iArr241[i596 - 4];
                return 0;
            case LZMA_Base.kMatchMaxLen:
                int[] iArr242 = this.values;
                int i597 = this.toDoubleRange;
                this.toDoubleRange = i597 + 1;
                iArr242[i597] = 19;
                return 0;
            case 274:
                int[] iArr243 = this.values;
                int i598 = this.toDoubleRange;
                this.toDoubleRange = i598 + 1;
                iArr243[i598] = 7;
                return 0;
            case 275:
                int i599 = this.toDoubleRange - 1;
                this.toDoubleRange = i599;
                int[] iArr244 = this.values;
                iArr244[i599 - 1] = iArr244[i599 - 1] | iArr244[i599];
                int i600 = i599 + 2;
                this.toDoubleRange = i600;
                iArr244[i600 - 1] = iArr244[i600 - 3];
                iArr244[i599] = iArr244[i600 - 4];
                return 0;
            case 276:
                int[] iArr245 = this.values;
                int i601 = this.toDoubleRange;
                int i602 = i601 + 1;
                this.toDoubleRange = i602;
                iArr245[i601] = 50;
                this.toDoubleRange = i602 + 1;
                iArr245[i602] = 0;
                return 0;
            case 277:
                int[] iArr246 = this.values;
                int i603 = this.toDoubleRange;
                this.toDoubleRange = i603 + 1;
                iArr246[i603] = 34;
                return 0;
            case 278:
                int[] iArr247 = this.values;
                int i604 = this.toDoubleRange;
                this.toDoubleRange = i604 + 1;
                iArr247[i604] = 121;
                return 0;
            case 279:
                int[] iArr248 = this.values;
                int i605 = this.toDoubleRange;
                int i606 = i605 + 2;
                this.toDoubleRange = i606;
                iArr248[i606 - 1] = iArr248[i606 - 3];
                iArr248[i605] = iArr248[i606 - 4];
                int i607 = i606 + 2;
                this.toDoubleRange = i607;
                iArr248[i607 - 1] = iArr248[i607 - 3];
                iArr248[i606] = iArr248[i607 - 4];
                this.toDoubleRange = i607 + 1;
                iArr248[i607] = -1;
                return 0;
            case 280:
                int[] iArr249 = this.values;
                int i608 = this.toDoubleRange;
                this.toDoubleRange = i608 + 1;
                iArr249[i608] = 9;
                return 0;
            case 281:
                int i609 = this.toDoubleRange - 1;
                this.toDoubleRange = i609;
                this.Mean$Arithmetic[i609] = null;
                int[] iArr250 = this.values;
                this.toDoubleRange = i609 + 1;
                iArr250[i609] = 0;
                return 0;
            case 282:
                int[] iArr251 = this.values;
                int i610 = this.toDoubleRange;
                int i611 = i610 + 1;
                this.toDoubleRange = i611;
                iArr251[i610] = 51;
                int i612 = i611 + 2;
                this.toDoubleRange = i612;
                iArr251[i612 - 1] = iArr251[i612 - 3];
                iArr251[i611] = iArr251[i612 - 4];
                int i613 = i612 + 2;
                this.toDoubleRange = i613;
                iArr251[i613 - 1] = iArr251[i613 - 3];
                iArr251[i612] = iArr251[i613 - 4];
                return 0;
            case 283:
                int[] iArr252 = this.values;
                int i614 = this.toDoubleRange;
                this.toDoubleRange = i614 + 1;
                iArr252[i614] = 76;
                return 0;
            case 284:
                int[] iArr253 = this.values;
                int i615 = this.toDoubleRange;
                int i616 = i615 + 1;
                this.toDoubleRange = i616;
                iArr253[i615] = 45;
                iArr253[i616 - 1] = -iArr253[i616 - 1];
                int i617 = i616 + 1;
                this.toDoubleRange = i617;
                iArr253[i616] = iArr253[i617 - 2];
                return 0;
            case 285:
                int[] iArr254 = this.values;
                int i618 = this.toDoubleRange;
                int i619 = iArr254[i618 - 1];
                iArr254[i618 - 1] = iArr254[i618 - 2];
                iArr254[i618 - 2] = i619;
                int i620 = i618 + 1;
                this.toDoubleRange = i620;
                iArr254[i618] = -1;
                int i621 = i620 - 1;
                this.toDoubleRange = i621;
                iArr254[i621 - 1] = iArr254[i621] ^ iArr254[i621 - 1];
                return 0;
            case 286:
                int i622 = this.toDoubleRange - 1;
                this.toDoubleRange = i622;
                this.Mean$Arithmetic[i622] = null;
                int[] iArr255 = this.values;
                iArr255[i622 - 1] = -iArr255[i622 - 1];
                int i623 = i622 - 1;
                this.toDoubleRange = i623;
                iArr255[i623 - 1] = iArr255[i623] & iArr255[i623 - 1];
                return 0;
            case 287:
                int[] iArr256 = this.values;
                int i624 = this.toDoubleRange;
                this.toDoubleRange = i624 + 1;
                iArr256[i624] = iArr256[10];
                return 0;
            case 288:
                int[] iArr257 = this.values;
                int i625 = this.toDoubleRange;
                int i626 = i625 + 1;
                this.toDoubleRange = i626;
                iArr257[i625] = 85;
                this.toDoubleRange = i626 + 1;
                iArr257[i626] = 0;
                return 0;
            case 289:
                int i627 = this.toDoubleRange - 1;
                this.toDoubleRange = i627;
                int[] iArr258 = this.values;
                iArr258[10] = iArr258[i627];
                this.toDoubleRange = i627 + 1;
                iArr258[i627] = iArr258[11];
                return 0;
            case 290:
                int[] iArr259 = this.values;
                int i628 = this.toDoubleRange;
                int i629 = i628 + 1;
                this.toDoubleRange = i629;
                iArr259[i628] = 101;
                int i630 = i629 - 1;
                this.toDoubleRange = i630;
                iArr259[i630 - 1] = iArr259[i630 - 1] + iArr259[i630];
                int i631 = i630 + 1;
                this.toDoubleRange = i631;
                iArr259[i630] = iArr259[i631 - 2];
                return 0;
            case 291:
                int i632 = this.toDoubleRange - 1;
                this.toDoubleRange = i632;
                int[] iArr260 = this.values;
                iArr260[11] = iArr260[i632];
                return 0;
            case BuildConfig.VERSION_CODE /*292*/:
                int[] iArr261 = this.values;
                int i633 = this.toDoubleRange;
                this.toDoubleRange = i633 + 1;
                iArr261[i633] = 89;
                return 0;
            case 293:
                int[] iArr262 = this.values;
                int i634 = this.toDoubleRange;
                int i635 = i634 + 1;
                this.toDoubleRange = i635;
                iArr262[i634] = 0;
                int i636 = i635 - 1;
                this.toDoubleRange = i636;
                iArr262[i636 - 1] = iArr262[i636 - 1] / iArr262[i636];
                return 0;
            case 294:
                int[] iArr263 = this.values;
                int i637 = this.toDoubleRange;
                int i638 = i637 + 1;
                this.toDoubleRange = i638;
                iArr263[i637] = 35;
                iArr263[i638 - 1] = -iArr263[i638 - 1];
                return 0;
            case 295:
                int i639 = this.toDoubleRange - 1;
                this.toDoubleRange = i639;
                this.Mean$Arithmetic[i639] = null;
                int[] iArr264 = this.values;
                iArr264[i639 - 1] = -iArr264[i639 - 1];
                int i640 = i639 + 2;
                this.toDoubleRange = i640;
                iArr264[i640 - 1] = iArr264[i640 - 3];
                iArr264[i639] = iArr264[i640 - 4];
                return 0;
            case 296:
                int[] iArr265 = this.values;
                int i641 = this.toDoubleRange;
                this.toDoubleRange = i641 + 1;
                iArr265[i641] = iArr265[11];
                return 0;
            case 297:
                int[] iArr266 = this.values;
                int i642 = this.toDoubleRange;
                this.toDoubleRange = i642 + 1;
                iArr266[i642] = 29;
                return 0;
            case 298:
                int[] iArr267 = this.values;
                int i643 = this.toDoubleRange;
                int i644 = i643 + 1;
                this.toDoubleRange = i644;
                iArr267[i643] = 47;
                int i645 = i644 + 2;
                this.toDoubleRange = i645;
                iArr267[i645 - 1] = iArr267[i645 - 3];
                iArr267[i644] = iArr267[i645 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_STORE_UNKNOWN_ERROR /*299*/:
                int[] iArr268 = this.values;
                int i646 = this.toDoubleRange;
                this.toDoubleRange = i646 + 1;
                iArr268[i646] = 98;
                return 0;
            case 300:
                int[] iArr269 = this.values;
                int i647 = this.toDoubleRange;
                int i648 = i647 + 1;
                this.toDoubleRange = i648;
                iArr269[i647] = 99;
                iArr269[i648 - 1] = -iArr269[i648 - 1];
                int i649 = i648 + 2;
                this.toDoubleRange = i649;
                iArr269[i649 - 1] = iArr269[i649 - 3];
                iArr269[i648] = iArr269[i649 - 4];
                return 0;
            case 301:
                int[] iArr270 = this.values;
                int i650 = this.toDoubleRange;
                int i651 = iArr270[i650 - 1];
                iArr270[i650 - 1] = iArr270[i650 - 2];
                iArr270[i650 - 2] = i651;
                this.toDoubleRange = i650 + 1;
                iArr270[i650] = -1;
                return 0;
            case 302:
                int[] iArr271 = this.values;
                int i652 = this.toDoubleRange;
                int i653 = i652 + 1;
                this.toDoubleRange = i653;
                iArr271[i652] = 119;
                int i654 = i653 + 1;
                this.toDoubleRange = i654;
                iArr271[i653] = iArr271[i654 - 2];
                this.toDoubleRange = i654 + 1;
                iArr271[i654] = -1;
                return 0;
            case 303:
                int[] iArr272 = this.values;
                int i655 = this.toDoubleRange;
                int i656 = iArr272[i655 - 1];
                iArr272[i655 - 1] = iArr272[i655 - 2];
                iArr272[i655 - 2] = i656;
                int i657 = i655 - 1;
                this.toDoubleRange = i657;
                this.Mean$Arithmetic[i657] = null;
                int i658 = i657 + 2;
                this.toDoubleRange = i658;
                iArr272[i658 - 1] = iArr272[i658 - 3];
                iArr272[i657] = iArr272[i658 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE /*304*/:
                int i659 = this.toDoubleRange - 1;
                this.toDoubleRange = i659;
                int[] iArr273 = this.values;
                iArr273[i659 - 1] = iArr273[i659 - 1] + iArr273[i659];
                int i660 = i659 + 1;
                this.toDoubleRange = i660;
                iArr273[i659] = 1;
                int i661 = i660 + 2;
                this.toDoubleRange = i661;
                iArr273[i661 - 1] = iArr273[i661 - 3];
                iArr273[i660] = iArr273[i661 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE_DATA /*305*/:
                int[] iArr274 = this.values;
                int i662 = this.toDoubleRange;
                this.toDoubleRange = i662 + 1;
                iArr274[i662] = 85;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_KEY_NOT_EXISTED /*306*/:
                int[] iArr275 = this.values;
                int i663 = this.toDoubleRange;
                int i664 = i663 + 2;
                this.toDoubleRange = i664;
                iArr275[i664 - 1] = iArr275[i664 - 3];
                iArr275[i663] = iArr275[i664 - 4];
                int i665 = i664 + 2;
                this.toDoubleRange = i665;
                iArr275[i665 - 1] = iArr275[i665 - 3];
                iArr275[i664] = iArr275[i665 - 4];
                int i666 = i665 - 1;
                this.toDoubleRange = i666;
                iArr275[i666 - 1] = iArr275[i666] & iArr275[i666 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_ILLEGEL_KEY /*307*/:
                Object[] objArr29 = this.Mean$Arithmetic;
                int i667 = this.toDoubleRange;
                int i668 = i667 + 1;
                this.toDoubleRange = i668;
                objArr29[i667] = objArr29[9];
                this.toDoubleRange = i668 + 1;
                objArr29[i668] = objArr29[10];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_NO_MEMORY /*308*/:
                int[] iArr276 = this.values;
                int i669 = this.toDoubleRange;
                int i670 = i669 + 1;
                this.toDoubleRange = i670;
                iArr276[i669] = 35;
                int i671 = i670 + 2;
                this.toDoubleRange = i671;
                iArr276[i671 - 1] = iArr276[i671 - 3];
                iArr276[i670] = iArr276[i671 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_NO_SUCH_INDEX /*309*/:
                int i672 = this.toDoubleRange - 1;
                this.toDoubleRange = i672;
                int[] iArr277 = this.values;
                iArr277[i672 - 1] = iArr277[i672 - 1] & iArr277[i672];
                int i673 = i672 - 1;
                this.toDoubleRange = i673;
                iArr277[i673 - 1] = iArr277[i673 - 1] | iArr277[i673];
                int i674 = i673 + 2;
                this.toDoubleRange = i674;
                iArr277[i674 - 1] = iArr277[i674 - 3];
                iArr277[i673] = iArr277[i674 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_INVALID_ENCRYPTED_DATA /*310*/:
                int[] iArr278 = this.values;
                int i675 = this.toDoubleRange;
                Object[] objArr30 = this.Mean$Arithmetic;
                Object obj14 = objArr30[i675 - 1];
                objArr30[i675 - 1] = null;
                iArr278[i675 - 1] = ((int[]) obj14).length;
                int i676 = i675 - 1;
                this.toDoubleRange = i676;
                objArr30[i676] = null;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_DECRYPT_MISMATCH_KEY_DATA /*311*/:
                int[] iArr279 = this.values;
                int i677 = this.toDoubleRange;
                int i678 = i677 + 1;
                this.toDoubleRange = i678;
                iArr279[i677] = 93;
                int i679 = i678 + 2;
                this.toDoubleRange = i679;
                iArr279[i679 - 1] = iArr279[i679 - 3];
                iArr279[i678] = iArr279[i679 - 4];
                int i680 = i679 - 1;
                this.toDoubleRange = i680;
                iArr279[i680 - 1] = iArr279[i680] ^ iArr279[i680 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_LOW_VERSION_DATA_FILE /*312*/:
                int[] iArr280 = this.values;
                int i681 = this.toDoubleRange;
                int i682 = i681 + 1;
                this.toDoubleRange = i682;
                iArr280[i681] = 2;
                int i683 = i682 - 1;
                this.toDoubleRange = i683;
                iArr280[i683 - 1] = iArr280[i683 - 1] % iArr280[i683];
                int i684 = i683 - 1;
                this.toDoubleRange = i684;
                this.Mean$Arithmetic[i684] = null;
                return 0;
            case 313:
                int[] iArr281 = this.values;
                int i685 = this.toDoubleRange;
                int i686 = i685 + 1;
                this.toDoubleRange = i686;
                iArr281[i685] = 59;
                int i687 = i686 + 2;
                this.toDoubleRange = i687;
                iArr281[i687 - 1] = iArr281[i687 - 3];
                iArr281[i686] = iArr281[i687 - 4];
                return 0;
            case 314:
                int i688 = this.toDoubleRange - 1;
                this.toDoubleRange = i688;
                int[] iArr282 = this.values;
                iArr282[i688 - 1] = iArr282[i688 - 1] << iArr282[i688];
                int i689 = i688 + 2;
                this.toDoubleRange = i689;
                iArr282[i689 - 1] = iArr282[i689 - 3];
                iArr282[i688] = iArr282[i689 - 4];
                int i690 = i689 - 1;
                this.toDoubleRange = i690;
                iArr282[i690 - 1] = iArr282[i690] & iArr282[i690 - 1];
                return 0;
            case 315:
                int[] iArr283 = this.values;
                int i691 = this.toDoubleRange;
                int i692 = i691 + 1;
                this.toDoubleRange = i692;
                iArr283[i691] = 111;
                iArr283[i692 - 1] = -iArr283[i692 - 1];
                return 0;
            case 316:
                int[] iArr284 = this.values;
                int i693 = this.toDoubleRange;
                int i694 = i693 + 1;
                this.toDoubleRange = i694;
                iArr284[i693] = 29;
                int i695 = i694 + 1;
                this.toDoubleRange = i695;
                iArr284[i694] = iArr284[i695 - 2];
                return 0;
            case 317:
                int[] iArr285 = this.values;
                int i696 = this.toDoubleRange;
                int i697 = i696 + 1;
                this.toDoubleRange = i697;
                iArr285[i696] = 111;
                int i698 = i697 + 2;
                this.toDoubleRange = i698;
                iArr285[i698 - 1] = iArr285[i698 - 3];
                iArr285[i697] = iArr285[i698 - 4];
                return 0;
            case 318:
                int i699 = this.toDoubleRange - 1;
                this.toDoubleRange = i699;
                this.Mean$Arithmetic[i699] = null;
                int[] iArr286 = this.values;
                iArr286[i699 - 1] = -iArr286[i699 - 1];
                int i700 = i699 - 1;
                this.toDoubleRange = i700;
                iArr286[i700 - 1] = iArr286[i700] | iArr286[i700 - 1];
                return 0;
            case 319:
                Object[] objArr31 = this.Mean$Arithmetic;
                int i701 = this.toDoubleRange;
                int i702 = i701 + 1;
                this.toDoubleRange = i702;
                objArr31[i701] = objArr31[10];
                this.toDoubleRange = i702 + 1;
                objArr31[i702] = objArr31[11];
                return 0;
            case 320:
                int[] iArr287 = this.values;
                int i703 = this.toDoubleRange;
                int i704 = i703 + 1;
                this.toDoubleRange = i704;
                iArr287[i703] = 72;
                int i705 = i704 + 1;
                this.toDoubleRange = i705;
                iArr287[i704] = 0;
                int i706 = i705 - 1;
                this.toDoubleRange = i706;
                iArr287[i706 - 1] = iArr287[i706 - 1] / iArr287[i706];
                return 0;
            case 321:
                int[] iArr288 = this.values;
                int i707 = this.toDoubleRange;
                int i708 = i707 + 1;
                this.toDoubleRange = i708;
                iArr288[i707] = 37;
                iArr288[i708 - 1] = -iArr288[i708 - 1];
                return 0;
            default:
                return i;
        }
        return 0;
    }
}
