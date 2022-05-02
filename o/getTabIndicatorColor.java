package o;

import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.savings.activity.SavingsActivity;

public class getTabIndicatorColor {
    private final float[] FastBitmap$CoordinateSystem = new float[15];
    private final Object[] Grayscale$Algorithm;
    public float IsOverlapping;
    public Object equals;
    public int getMax;
    public float getMin;
    private int hashCode;
    private final double[] invokeSuspend = new double[15];
    public Object isInside;
    public long length;
    public long setMax;
    public int setMin;
    private final long[] toDoubleRange = new long[15];
    public double toFloatRange;
    public double toIntRange;
    private int toString;
    private final int[] values = new int[15];

    public getTabIndicatorColor(Object obj) {
        Object[] objArr = new Object[15];
        this.Grayscale$Algorithm = objArr;
        objArr[12] = obj;
        this.hashCode = 0;
        this.toString = -1;
    }

    public getTabIndicatorColor(Object obj, Object obj2) {
        Object[] objArr = new Object[15];
        this.Grayscale$Algorithm = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        this.hashCode = 0;
        this.toString = -1;
    }

    public getTabIndicatorColor(Object obj, Object obj2, Object obj3) {
        Object[] objArr = new Object[15];
        this.Grayscale$Algorithm = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        this.hashCode = 0;
        this.toString = -1;
    }

    public int setMin(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.values;
                int i2 = this.hashCode - 1;
                this.hashCode = i2;
                this.setMin = iArr[i2];
                return 0;
            case 2:
                Object[] objArr = this.Grayscale$Algorithm;
                int i3 = this.hashCode;
                Object obj = objArr[i3 - 1];
                objArr[i3 - 1] = null;
                this.isInside = obj;
                return 0;
            case 3:
                int[] iArr2 = this.values;
                int i4 = this.hashCode;
                this.hashCode = i4 + 1;
                iArr2[i4] = this.getMax;
                return 0;
            case 4:
                int[] iArr3 = this.values;
                int i5 = this.hashCode;
                this.hashCode = i5 + 1;
                iArr3[i5] = 97;
                return 0;
            case 5:
                int[] iArr4 = this.values;
                int i6 = this.hashCode;
                int i7 = i6 + 2;
                this.hashCode = i7;
                iArr4[i7 - 1] = iArr4[i7 - 3];
                iArr4[i6] = iArr4[i7 - 4];
                return 0;
            case 6:
                int[] iArr5 = this.values;
                int i8 = this.hashCode;
                int i9 = i8 + 2;
                this.hashCode = i9;
                iArr5[i9 - 1] = iArr5[i9 - 3];
                iArr5[i8] = iArr5[i9 - 4];
                int i10 = i9 - 1;
                this.hashCode = i10;
                iArr5[i10 - 1] = iArr5[i10] ^ iArr5[i10 - 1];
                return 0;
            case 7:
                int[] iArr6 = this.values;
                int i11 = this.hashCode;
                int i12 = i11 + 1;
                this.hashCode = i12;
                int i13 = iArr6[i12 - 2];
                iArr6[i11] = i13;
                iArr6[i12 - 2] = iArr6[i12 - 3];
                iArr6[i12 - 3] = iArr6[i12 - 4];
                iArr6[i12 - 4] = i13;
                int i14 = i12 - 1;
                this.hashCode = i14;
                this.Grayscale$Algorithm[i14] = null;
                return 0;
            case 8:
                int i15 = this.hashCode - 1;
                this.hashCode = i15;
                int[] iArr7 = this.values;
                iArr7[i15 - 1] = iArr7[i15 - 1] & iArr7[i15];
                int i16 = i15 - 1;
                this.hashCode = i16;
                iArr7[i16 - 1] = iArr7[i16 - 1] | iArr7[i16];
                this.hashCode = i16 + 1;
                iArr7[i16] = 1;
                return 0;
            case 9:
                int i17 = this.hashCode - 1;
                this.hashCode = i17;
                int[] iArr8 = this.values;
                iArr8[i17 - 1] = iArr8[i17 - 1] << iArr8[i17];
                int i18 = i17 + 1;
                this.hashCode = i18;
                int i19 = iArr8[i18 - 2];
                iArr8[i17] = i19;
                iArr8[i18 - 2] = iArr8[i18 - 3];
                iArr8[i18 - 3] = iArr8[i18 - 4];
                iArr8[i18 - 4] = i19;
                return 0;
            case 10:
                int i20 = this.hashCode - 1;
                this.hashCode = i20;
                this.Grayscale$Algorithm[i20] = null;
                return 0;
            case 11:
                int i21 = this.hashCode - 1;
                this.hashCode = i21;
                int[] iArr9 = this.values;
                iArr9[i21 - 1] = iArr9[i21 - 1] ^ iArr9[i21];
                iArr9[i21 - 1] = -iArr9[i21 - 1];
                return 0;
            case 12:
                int[] iArr10 = this.values;
                int i22 = this.hashCode;
                int i23 = i22 + 2;
                this.hashCode = i23;
                iArr10[i23 - 1] = iArr10[i23 - 3];
                iArr10[i22] = iArr10[i23 - 4];
                int i24 = i23 - 1;
                this.hashCode = i24;
                iArr10[i24 - 1] = iArr10[i24 - 1] ^ iArr10[i24];
                int i25 = i24 + 1;
                this.hashCode = i25;
                int i26 = iArr10[i25 - 2];
                iArr10[i24] = i26;
                iArr10[i25 - 2] = iArr10[i25 - 3];
                iArr10[i25 - 3] = iArr10[i25 - 4];
                iArr10[i25 - 4] = i26;
                return 0;
            case 13:
                int i27 = this.hashCode - 1;
                this.hashCode = i27;
                this.Grayscale$Algorithm[i27] = null;
                int i28 = i27 - 1;
                this.hashCode = i28;
                int[] iArr11 = this.values;
                iArr11[i28 - 1] = iArr11[i28 - 1] & iArr11[i28];
                this.hashCode = i28 + 1;
                iArr11[i28] = 1;
                return 0;
            case 14:
                int i29 = this.hashCode - 1;
                this.hashCode = i29;
                int[] iArr12 = this.values;
                iArr12[i29 - 1] = iArr12[i29 - 1] << iArr12[i29];
                int i30 = i29 - 1;
                this.hashCode = i30;
                iArr12[i30 - 1] = iArr12[i30 - 1] + iArr12[i30];
                return 0;
            case 15:
                int[] iArr13 = this.values;
                int i31 = this.hashCode;
                int i32 = i31 + 1;
                this.hashCode = i32;
                iArr13[i31] = iArr13[i32 - 2];
                this.hashCode = i32 + 1;
                iArr13[i32] = 128;
                return 0;
            case 16:
                int i33 = this.hashCode - 1;
                this.hashCode = i33;
                int[] iArr14 = this.values;
                iArr14[i33 - 1] = iArr14[i33 - 1] % iArr14[i33];
                return 0;
            case 17:
                int i34 = this.hashCode - this.getMax;
                this.hashCode = i34;
                this.toString = i34;
                return 0;
            case 18:
                int[] iArr15 = this.values;
                int i35 = this.toString;
                this.toString = i35 + 1;
                this.setMin = iArr15[i35];
                return 0;
            case 19:
                int i36 = this.hashCode - 1;
                this.hashCode = i36;
                this.setMin = this.values[i36] == 0 ? 1 : 0;
                return 0;
            case 20:
                int[] iArr16 = this.values;
                int i37 = this.hashCode;
                int i38 = i37 + 1;
                this.hashCode = i38;
                iArr16[i37] = 2;
                int i39 = i38 - 1;
                this.hashCode = i39;
                iArr16[i39 - 1] = iArr16[i39 - 1] % iArr16[i39];
                return 0;
            case 21:
                Object[] objArr2 = this.Grayscale$Algorithm;
                int i40 = this.toString;
                this.toString = i40 + 1;
                Object obj2 = objArr2[i40];
                objArr2[i40] = null;
                this.isInside = obj2;
                return 0;
            case 22:
                Object[] objArr3 = this.Grayscale$Algorithm;
                int i41 = this.hashCode;
                this.hashCode = i41 + 1;
                objArr3[i41] = this.equals;
                return 0;
            case 23:
                Object[] objArr4 = this.Grayscale$Algorithm;
                int i42 = this.hashCode;
                this.hashCode = i42 + 1;
                objArr4[i42] = objArr4[12];
                return 0;
            case 24:
                int[] iArr17 = this.values;
                int i43 = this.hashCode;
                this.hashCode = i43 + 1;
                iArr17[i43] = 2;
                return 0;
            case 25:
                int[] iArr18 = this.values;
                int i44 = this.hashCode;
                this.hashCode = i44 + 1;
                iArr18[i44] = 0;
                return 0;
            case 26:
                int[] iArr19 = this.values;
                int i45 = this.hashCode;
                this.hashCode = i45 + 1;
                iArr19[i45] = 66;
                return 0;
            case 27:
                int[] iArr20 = this.values;
                int i46 = this.hashCode;
                int i47 = i46 + 1;
                this.hashCode = i47;
                iArr20[i46] = 0;
                int i48 = i47 - 1;
                this.hashCode = i48;
                iArr20[i48 - 1] = iArr20[i48 - 1] / iArr20[i48];
                return 0;
            case 28:
                int[] iArr21 = this.values;
                int i49 = this.hashCode;
                this.hashCode = i49 + 1;
                iArr21[i49] = 1;
                return 0;
            case 29:
                int[] iArr22 = this.values;
                int i50 = this.hashCode;
                int i51 = i50 + 1;
                this.hashCode = i51;
                iArr22[i50] = 37;
                int i52 = i51 + 2;
                this.hashCode = i52;
                iArr22[i52 - 1] = iArr22[i52 - 3];
                iArr22[i51] = iArr22[i52 - 4];
                return 0;
            case 30:
                int i53 = this.hashCode - 1;
                this.hashCode = i53;
                int[] iArr23 = this.values;
                iArr23[i53 - 1] = iArr23[i53] & iArr23[i53 - 1];
                return 0;
            case 31:
                int[] iArr24 = this.values;
                int i54 = this.hashCode;
                int i55 = i54 + 1;
                this.hashCode = i55;
                int i56 = iArr24[i55 - 2];
                iArr24[i54] = i56;
                iArr24[i55 - 2] = iArr24[i55 - 3];
                iArr24[i55 - 3] = iArr24[i55 - 4];
                iArr24[i55 - 4] = i56;
                return 0;
            case 32:
                int i57 = this.hashCode - 1;
                this.hashCode = i57;
                this.Grayscale$Algorithm[i57] = null;
                int[] iArr25 = this.values;
                int i58 = i57 + 2;
                this.hashCode = i58;
                iArr25[i58 - 1] = iArr25[i58 - 3];
                iArr25[i57] = iArr25[i58 - 4];
                return 0;
            case 33:
                int i59 = this.hashCode - 1;
                this.hashCode = i59;
                int[] iArr26 = this.values;
                iArr26[i59 - 1] = iArr26[i59] ^ iArr26[i59 - 1];
                return 0;
            case 34:
                int[] iArr27 = this.values;
                int i60 = this.hashCode;
                int i61 = i60 + 1;
                this.hashCode = i61;
                int i62 = iArr27[i61 - 2];
                iArr27[i60] = i62;
                iArr27[i61 - 2] = iArr27[i61 - 3];
                iArr27[i61 - 3] = iArr27[i61 - 4];
                iArr27[i61 - 4] = i62;
                int i63 = i61 - 1;
                this.hashCode = i63;
                this.Grayscale$Algorithm[i63] = null;
                int i64 = i63 - 1;
                this.hashCode = i64;
                iArr27[i64 - 1] = iArr27[i64] & iArr27[i64 - 1];
                return 0;
            case 35:
                int i65 = this.hashCode - 1;
                this.hashCode = i65;
                int[] iArr28 = this.values;
                iArr28[i65 - 1] = iArr28[i65] | iArr28[i65 - 1];
                return 0;
            case 36:
                int[] iArr29 = this.values;
                int i66 = this.hashCode;
                int i67 = i66 + 2;
                this.hashCode = i67;
                iArr29[i67 - 1] = iArr29[i67 - 3];
                iArr29[i66] = iArr29[i67 - 4];
                int i68 = i67 - 1;
                this.hashCode = i68;
                iArr29[i68 - 1] = iArr29[i68] | iArr29[i68 - 1];
                return 0;
            case 37:
                int[] iArr30 = this.values;
                int i69 = this.hashCode;
                int i70 = i69 + 1;
                this.hashCode = i70;
                iArr30[i69] = 1;
                int i71 = i70 - 1;
                this.hashCode = i71;
                iArr30[i71 - 1] = iArr30[i71 - 1] << iArr30[i71];
                return 0;
            case 38:
                int[] iArr31 = this.values;
                int i72 = this.hashCode;
                int i73 = i72 + 1;
                this.hashCode = i73;
                int i74 = iArr31[i73 - 2];
                iArr31[i72] = i74;
                iArr31[i73 - 2] = iArr31[i73 - 3];
                iArr31[i73 - 3] = iArr31[i73 - 4];
                iArr31[i73 - 4] = i74;
                int i75 = i73 - 1;
                this.hashCode = i75;
                this.Grayscale$Algorithm[i75] = null;
                int i76 = i75 - 1;
                this.hashCode = i76;
                iArr31[i76 - 1] = iArr31[i76] ^ iArr31[i76 - 1];
                return 0;
            case 39:
                int i77 = this.hashCode - 1;
                this.hashCode = i77;
                int[] iArr32 = this.values;
                iArr32[i77 - 1] = iArr32[i77 - 1] - iArr32[i77];
                int i78 = i77 + 1;
                this.hashCode = i78;
                iArr32[i77] = iArr32[i78 - 2];
                this.hashCode = i78 + 1;
                iArr32[i78] = 128;
                return 0;
            case 40:
                int i79 = this.hashCode - 1;
                this.hashCode = i79;
                this.setMin = this.values[i79] != 0 ? 1 : 0;
                return 0;
            case 41:
                break;
            case 42:
                Object[] objArr5 = this.Grayscale$Algorithm;
                int i80 = this.hashCode;
                this.hashCode = i80 + 1;
                objArr5[i80] = null;
                break;
            case 43:
                int[] iArr33 = this.values;
                int i81 = this.hashCode;
                this.hashCode = i81 + 1;
                iArr33[i81] = 3;
                return 0;
            case 44:
                int i82 = this.hashCode - 1;
                this.hashCode = i82;
                int[] iArr34 = this.values;
                iArr34[i82 - 1] = iArr34[i82 - 1] + iArr34[i82];
                return 0;
            case 45:
                int[] iArr35 = this.values;
                int i83 = this.hashCode;
                int i84 = i83 + 1;
                this.hashCode = i84;
                iArr35[i83] = iArr35[i84 - 2];
                return 0;
            case 46:
                int[] iArr36 = this.values;
                int i85 = this.hashCode;
                int i86 = i85 + 1;
                this.hashCode = i86;
                iArr36[i85] = 128;
                int i87 = i86 - 1;
                this.hashCode = i87;
                iArr36[i87 - 1] = iArr36[i87 - 1] % iArr36[i87];
                return 0;
            case 47:
                for (int i88 = this.hashCode - 1; i88 >= 0; i88--) {
                    this.Grayscale$Algorithm[i88] = null;
                }
                this.hashCode = 0;
                Object[] objArr6 = this.Grayscale$Algorithm;
                this.hashCode = 0 + 1;
                objArr6[0] = this.equals;
                return 0;
            case 48:
                int[] iArr37 = this.values;
                int i89 = this.hashCode;
                int i90 = i89 + 1;
                this.hashCode = i90;
                iArr37[i89] = 53;
                iArr37[i90 - 1] = -iArr37[i90 - 1];
                return 0;
            case 49:
                int[] iArr38 = this.values;
                int i91 = this.hashCode;
                int i92 = i91 + 2;
                this.hashCode = i92;
                iArr38[i92 - 1] = iArr38[i92 - 3];
                iArr38[i91] = iArr38[i92 - 4];
                iArr38[i92 - 1] = -iArr38[i92 - 1];
                int i93 = i92 + 2;
                this.hashCode = i93;
                iArr38[i93 - 1] = iArr38[i93 - 3];
                iArr38[i92] = iArr38[i93 - 4];
                return 0;
            case 50:
                int[] iArr39 = this.values;
                int i94 = this.hashCode;
                this.hashCode = i94 + 1;
                iArr39[i94] = -1;
                return 0;
            case 51:
                int i95 = this.hashCode - 1;
                this.hashCode = i95;
                int[] iArr40 = this.values;
                iArr40[i95 - 1] = iArr40[i95 - 1] ^ iArr40[i95];
                int i96 = i95 - 1;
                this.hashCode = i96;
                this.Grayscale$Algorithm[i96] = null;
                int i97 = i96 - 1;
                this.hashCode = i97;
                iArr40[i97 - 1] = iArr40[i97] & iArr40[i97 - 1];
                return 0;
            case 52:
                int[] iArr41 = this.values;
                int i98 = this.hashCode;
                iArr41[i98 - 1] = -iArr41[i98 - 1];
                return 0;
            case 53:
                int i99 = this.hashCode - 1;
                this.hashCode = i99;
                int[] iArr42 = this.values;
                iArr42[i99 - 1] = iArr42[i99 - 1] | iArr42[i99];
                int i100 = i99 - 1;
                this.hashCode = i100;
                iArr42[i100 - 1] = iArr42[i100 - 1] + iArr42[i100];
                int i101 = i100 + 1;
                this.hashCode = i101;
                iArr42[i100] = iArr42[i101 - 2];
                return 0;
            case 54:
                int[] iArr43 = this.values;
                int i102 = this.hashCode;
                this.hashCode = i102 + 1;
                iArr43[i102] = 128;
                return 0;
            case 55:
                int[] iArr44 = this.values;
                int i103 = this.hashCode;
                int i104 = i103 + 1;
                this.hashCode = i104;
                iArr44[i103] = 2;
                this.hashCode = i104 + 1;
                iArr44[i104] = 2;
                return 0;
            case 56:
                int[] iArr45 = this.values;
                int i105 = this.hashCode;
                this.hashCode = i105 + 1;
                iArr45[i105] = 91;
                return 0;
            case 57:
                int[] iArr46 = this.values;
                int i106 = this.hashCode;
                iArr46[i106 - 1] = -iArr46[i106 - 1];
                int i107 = i106 + 2;
                this.hashCode = i107;
                iArr46[i107 - 1] = iArr46[i107 - 3];
                iArr46[i106] = iArr46[i107 - 4];
                iArr46[i107 - 1] = -iArr46[i107 - 1];
                return 0;
            case 58:
                int[] iArr47 = this.values;
                int i108 = this.hashCode;
                int i109 = i108 + 1;
                this.hashCode = i109;
                int i110 = iArr47[i109 - 2];
                iArr47[i108] = i110;
                iArr47[i109 - 2] = iArr47[i109 - 3];
                iArr47[i109 - 3] = iArr47[i109 - 4];
                iArr47[i109 - 4] = i110;
                int i111 = i109 - 1;
                this.hashCode = i111;
                this.Grayscale$Algorithm[i111] = null;
                iArr47[i111 - 1] = -iArr47[i111 - 1];
                return 0;
            case 59:
                int i112 = this.hashCode - 1;
                this.hashCode = i112;
                int[] iArr48 = this.values;
                iArr48[i112 - 1] = iArr48[i112 - 1] | iArr48[i112];
                int i113 = i112 - 1;
                this.hashCode = i113;
                iArr48[i113 - 1] = iArr48[i113 - 1] + iArr48[i113];
                return 0;
            case 60:
                int[] iArr49 = this.values;
                int i114 = this.hashCode;
                this.hashCode = i114 + 1;
                iArr49[i114] = 125;
                return 0;
            case 61:
                int[] iArr50 = this.values;
                int i115 = this.hashCode;
                int i116 = i115 + 2;
                this.hashCode = i116;
                iArr50[i116 - 1] = iArr50[i116 - 3];
                iArr50[i115] = iArr50[i116 - 4];
                int i117 = i116 - 1;
                this.hashCode = i117;
                iArr50[i117 - 1] = iArr50[i117 - 1] & iArr50[i117];
                this.hashCode = i117 + 1;
                iArr50[i117] = -1;
                return 0;
            case 62:
                int[] iArr51 = this.values;
                int i118 = this.hashCode;
                int i119 = i118 + 1;
                this.hashCode = i119;
                int i120 = iArr51[i119 - 2];
                iArr51[i118] = i120;
                iArr51[i119 - 2] = iArr51[i119 - 3];
                iArr51[i119 - 3] = iArr51[i119 - 4];
                iArr51[i119 - 4] = i120;
                int i121 = i119 - 1;
                this.hashCode = i121;
                this.Grayscale$Algorithm[i121] = null;
                int i122 = i121 - 1;
                this.hashCode = i122;
                iArr51[i122 - 1] = iArr51[i122] | iArr51[i122 - 1];
                return 0;
            case 63:
                int i123 = this.hashCode - 1;
                this.hashCode = i123;
                int[] iArr52 = this.values;
                iArr52[i123 - 1] = iArr52[i123 - 1] & iArr52[i123];
                int i124 = i123 + 1;
                this.hashCode = i124;
                int i125 = iArr52[i124 - 2];
                iArr52[i123] = i125;
                iArr52[i124 - 2] = iArr52[i124 - 3];
                iArr52[i124 - 3] = iArr52[i124 - 4];
                iArr52[i124 - 4] = i125;
                return 0;
            case 64:
                int i126 = this.hashCode - 1;
                this.hashCode = i126;
                this.Grayscale$Algorithm[i126] = null;
                int[] iArr53 = this.values;
                int i127 = i126 + 2;
                this.hashCode = i127;
                iArr53[i127 - 1] = iArr53[i127 - 3];
                iArr53[i126] = iArr53[i127 - 4];
                this.hashCode = i127 + 1;
                iArr53[i127] = -1;
                return 0;
            case 65:
                int i128 = this.hashCode - 1;
                this.hashCode = i128;
                int[] iArr54 = this.values;
                iArr54[i128 - 1] = iArr54[i128 - 1] ^ iArr54[i128];
                int i129 = i128 - 1;
                this.hashCode = i129;
                iArr54[i129 - 1] = iArr54[i129] ^ iArr54[i129 - 1];
                return 0;
            case 66:
                int i130 = this.hashCode - 1;
                this.hashCode = i130;
                int[] iArr55 = this.values;
                iArr55[i130 - 1] = iArr55[i130 - 1] & iArr55[i130];
                this.hashCode = i130 + 1;
                iArr55[i130] = 1;
                return 0;
            case 67:
                int i131 = this.hashCode - 1;
                this.hashCode = i131;
                int[] iArr56 = this.values;
                iArr56[i131 - 1] = iArr56[i131 - 1] << iArr56[i131];
                int i132 = i131 + 1;
                this.hashCode = i132;
                iArr56[i131] = iArr56[i132 - 2];
                return 0;
            case 68:
                int[] iArr57 = this.values;
                int i133 = this.hashCode;
                int i134 = i133 + 1;
                this.hashCode = i134;
                iArr57[i133] = -1;
                int i135 = i134 - 1;
                this.hashCode = i135;
                iArr57[i135 - 1] = iArr57[i135 - 1] ^ iArr57[i135];
                int i136 = iArr57[i135 - 1];
                iArr57[i135 - 1] = iArr57[i135 - 2];
                iArr57[i135 - 2] = i136;
                return 0;
            case 69:
                int i137 = this.hashCode - 1;
                this.hashCode = i137;
                int[] iArr58 = this.values;
                iArr58[i137 - 1] = iArr58[i137 - 1] - iArr58[i137];
                int i138 = i137 + 1;
                this.hashCode = i138;
                iArr58[i137] = 1;
                int i139 = i138 - 1;
                this.hashCode = i139;
                iArr58[i139 - 1] = iArr58[i139 - 1] - iArr58[i139];
                return 0;
            case 70:
                int[] iArr59 = this.values;
                int i140 = this.hashCode;
                this.hashCode = i140 + 1;
                iArr59[i140] = 1;
                return 0;
            case 71:
                int[] iArr60 = this.values;
                int i141 = this.hashCode;
                this.hashCode = i141 + 1;
                iArr60[i141] = 59;
                return 0;
            case 72:
                int[] iArr61 = this.values;
                int i142 = this.hashCode;
                int i143 = i142 + 1;
                this.hashCode = i143;
                iArr61[i142] = 93;
                int i144 = i143 + 2;
                this.hashCode = i144;
                iArr61[i144 - 1] = iArr61[i144 - 3];
                iArr61[i143] = iArr61[i144 - 4];
                int i145 = i144 - 1;
                this.hashCode = i145;
                iArr61[i145 - 1] = iArr61[i145] | iArr61[i145 - 1];
                return 0;
            case 73:
                int[] iArr62 = this.values;
                int i146 = this.hashCode;
                int i147 = i146 + 2;
                this.hashCode = i147;
                iArr62[i147 - 1] = iArr62[i147 - 3];
                iArr62[i146] = iArr62[i147 - 4];
                iArr62[i147 - 1] = -iArr62[i147 - 1];
                return 0;
            case 74:
                int[] iArr63 = this.values;
                int i148 = this.hashCode;
                this.hashCode = i148 + 1;
                iArr63[i148] = 109;
                return 0;
            case 75:
                int[] iArr64 = this.values;
                int i149 = this.hashCode;
                int i150 = i149 + 2;
                this.hashCode = i150;
                iArr64[i150 - 1] = iArr64[i150 - 3];
                iArr64[i149] = iArr64[i150 - 4];
                int i151 = i150 + 2;
                this.hashCode = i151;
                iArr64[i151 - 1] = iArr64[i151 - 3];
                iArr64[i150] = iArr64[i151 - 4];
                return 0;
            case 76:
                int i152 = this.hashCode - 1;
                this.hashCode = i152;
                int[] iArr65 = this.values;
                iArr65[i152 - 1] = iArr65[i152 - 1] & iArr65[i152];
                int i153 = i152 + 1;
                this.hashCode = i153;
                iArr65[i152] = -1;
                int i154 = i153 - 1;
                this.hashCode = i154;
                iArr65[i154 - 1] = iArr65[i154] ^ iArr65[i154 - 1];
                return 0;
            case 77:
                int i155 = this.hashCode - 1;
                this.hashCode = i155;
                this.Grayscale$Algorithm[i155] = null;
                int i156 = i155 - 1;
                this.hashCode = i156;
                int[] iArr66 = this.values;
                iArr66[i156 - 1] = iArr66[i156 - 1] | iArr66[i156];
                int i157 = i156 - 1;
                this.hashCode = i157;
                iArr66[i157 - 1] = iArr66[i157] & iArr66[i157 - 1];
                return 0;
            case 78:
                int[] iArr67 = this.values;
                int i158 = this.hashCode;
                int i159 = i158 + 1;
                this.hashCode = i159;
                int i160 = iArr67[i159 - 2];
                iArr67[i158] = i160;
                iArr67[i159 - 2] = iArr67[i159 - 3];
                iArr67[i159 - 3] = iArr67[i159 - 4];
                iArr67[i159 - 4] = i160;
                int i161 = i159 - 1;
                this.hashCode = i161;
                this.Grayscale$Algorithm[i161] = null;
                int i162 = i161 + 2;
                this.hashCode = i162;
                iArr67[i162 - 1] = iArr67[i162 - 3];
                iArr67[i161] = iArr67[i162 - 4];
                return 0;
            case 79:
                int[] iArr68 = this.values;
                int i163 = this.hashCode;
                int i164 = i163 + 1;
                this.hashCode = i164;
                iArr68[i163] = -1;
                int i165 = i164 - 1;
                this.hashCode = i165;
                iArr68[i165 - 1] = iArr68[i165 - 1] ^ iArr68[i165];
                int i166 = i165 - 1;
                this.hashCode = i166;
                iArr68[i166 - 1] = iArr68[i166] ^ iArr68[i166 - 1];
                return 0;
            case 80:
                int i167 = this.hashCode - 1;
                this.hashCode = i167;
                int[] iArr69 = this.values;
                iArr69[i167 - 1] = iArr69[i167 - 1] & iArr69[i167];
                int i168 = i167 + 1;
                this.hashCode = i168;
                iArr69[i167] = 1;
                int i169 = i168 - 1;
                this.hashCode = i169;
                iArr69[i169 - 1] = iArr69[i169 - 1] << iArr69[i169];
                return 0;
            case 81:
                int i170 = this.hashCode - 1;
                this.hashCode = i170;
                this.Grayscale$Algorithm[i170] = null;
                int i171 = i170 - 1;
                this.hashCode = i171;
                int[] iArr70 = this.values;
                iArr70[i171 - 1] = iArr70[i171 - 1] - iArr70[i171];
                this.hashCode = i171 + 1;
                iArr70[i171] = 1;
                return 0;
            case 82:
                Object[] objArr7 = this.Grayscale$Algorithm;
                int i172 = this.hashCode;
                this.hashCode = i172 + 1;
                objArr7[i172] = objArr7[13];
                return 0;
            case 83:
                int[] iArr71 = this.values;
                int i173 = this.hashCode;
                this.hashCode = i173 + 1;
                iArr71[i173] = 84;
                return 0;
            case 84:
                int[] iArr72 = this.values;
                int i174 = this.hashCode;
                int i175 = i174 + 1;
                this.hashCode = i175;
                iArr72[i174] = 79;
                int i176 = i175 + 2;
                this.hashCode = i176;
                iArr72[i176 - 1] = iArr72[i176 - 3];
                iArr72[i175] = iArr72[i176 - 4];
                return 0;
            case 85:
                int i177 = this.hashCode - 1;
                this.hashCode = i177;
                int[] iArr73 = this.values;
                iArr73[i177 - 1] = iArr73[i177 - 1] ^ iArr73[i177];
                int i178 = i177 + 1;
                this.hashCode = i178;
                int i179 = iArr73[i178 - 2];
                iArr73[i177] = i179;
                iArr73[i178 - 2] = iArr73[i178 - 3];
                iArr73[i178 - 3] = iArr73[i178 - 4];
                iArr73[i178 - 4] = i179;
                int i180 = i178 - 1;
                this.hashCode = i180;
                this.Grayscale$Algorithm[i180] = null;
                return 0;
            case 86:
                int i181 = this.hashCode - 1;
                this.hashCode = i181;
                int[] iArr74 = this.values;
                iArr74[i181 - 1] = iArr74[i181 - 1] << iArr74[i181];
                int i182 = i181 - 1;
                this.hashCode = i182;
                iArr74[i182 - 1] = iArr74[i182 - 1] + iArr74[i182];
                int i183 = i182 + 1;
                this.hashCode = i183;
                iArr74[i182] = iArr74[i183 - 2];
                return 0;
            case 87:
                int[] iArr75 = this.values;
                int i184 = this.hashCode;
                this.hashCode = i184 + 1;
                iArr75[i184] = 75;
                return 0;
            case 88:
                int[] iArr76 = this.values;
                int i185 = this.hashCode;
                this.hashCode = i185 + 1;
                iArr76[i185] = 93;
                return 0;
            case 89:
                int[] iArr77 = this.values;
                int i186 = this.hashCode;
                int i187 = i186 + 1;
                this.hashCode = i187;
                iArr77[i186] = 77;
                this.hashCode = i187 + 1;
                iArr77[i187] = 0;
                return 0;
            case 90:
                int i188 = this.hashCode - 1;
                this.hashCode = i188;
                int[] iArr78 = this.values;
                iArr78[i188 - 1] = iArr78[i188 - 1] / iArr78[i188];
                int i189 = i188 - 1;
                this.hashCode = i189;
                this.Grayscale$Algorithm[i189] = null;
                return 0;
            case 91:
                int[] iArr79 = this.values;
                int i190 = this.hashCode;
                int i191 = i190 + 1;
                this.hashCode = i191;
                iArr79[i190] = 2;
                int i192 = i191 + 1;
                this.hashCode = i192;
                iArr79[i191] = 2;
                int i193 = i192 - 1;
                this.hashCode = i193;
                iArr79[i193 - 1] = iArr79[i193 - 1] % iArr79[i193];
                return 0;
            case 92:
                int[] iArr80 = this.values;
                int i194 = this.hashCode;
                this.hashCode = i194 + 1;
                iArr80[i194] = 123;
                return 0;
            case 93:
                int i195 = this.hashCode - 1;
                this.hashCode = i195;
                int[] iArr81 = this.values;
                iArr81[i195 - 1] = iArr81[i195 - 1] - iArr81[i195];
                return 0;
            case 94:
                int[] iArr82 = this.values;
                int i196 = this.hashCode;
                this.hashCode = i196 + 1;
                iArr82[i196] = 5;
                return 0;
            case 95:
                int[] iArr83 = this.values;
                int i197 = this.hashCode;
                int i198 = i197 + 1;
                this.hashCode = i198;
                iArr83[i197] = 0;
                int i199 = i198 - 1;
                this.hashCode = i199;
                iArr83[i199 - 1] = iArr83[i199 - 1] / iArr83[i199];
                int i200 = i199 - 1;
                this.hashCode = i200;
                this.Grayscale$Algorithm[i200] = null;
                return 0;
            case 96:
                int[] iArr84 = this.values;
                int i201 = this.hashCode;
                this.hashCode = i201 + 1;
                iArr84[i201] = 77;
                return 0;
            case 97:
                Object[] objArr8 = this.Grayscale$Algorithm;
                int i202 = this.hashCode;
                int i203 = i202 + 1;
                this.hashCode = i203;
                objArr8[i202] = objArr8[i203 - 2];
                int i204 = i203 - 1;
                this.hashCode = i204;
                Object obj3 = objArr8[i204];
                objArr8[i204] = null;
                objArr8[14] = obj3;
                return 0;
            case 98:
                Object[] objArr9 = this.Grayscale$Algorithm;
                int i205 = this.hashCode;
                this.hashCode = i205 + 1;
                objArr9[i205] = objArr9[14];
                return 0;
            case 99:
                Object[] objArr10 = this.Grayscale$Algorithm;
                int i206 = this.hashCode;
                int i207 = i206 + 1;
                this.hashCode = i207;
                objArr10[i206] = objArr10[i207 - 2];
                return 0;
            case 100:
                int[] iArr85 = this.values;
                int i208 = this.hashCode;
                this.hashCode = i208 + 1;
                iArr85[i208] = 57;
                return 0;
            case 101:
                int[] iArr86 = this.values;
                int i209 = this.hashCode;
                this.hashCode = i209 + 1;
                iArr86[i209] = 18;
                return 0;
            case 102:
                int[] iArr87 = this.values;
                int i210 = this.hashCode;
                this.hashCode = i210 + 1;
                iArr87[i210] = 15;
                return 0;
            case 103:
                int i211 = this.hashCode - 1;
                this.hashCode = i211;
                int[] iArr88 = this.values;
                iArr88[i211 - 1] = iArr88[i211 - 1] | iArr88[i211];
                this.hashCode = i211 + 1;
                iArr88[i211] = 1;
                return 0;
            case 104:
                int i212 = this.hashCode - 1;
                this.hashCode = i212;
                this.Grayscale$Algorithm[i212] = null;
                int i213 = i212 - 1;
                this.hashCode = i213;
                int[] iArr89 = this.values;
                iArr89[i213 - 1] = iArr89[i213] ^ iArr89[i213 - 1];
                return 0;
            case 105:
                int[] iArr90 = this.values;
                int i214 = this.hashCode;
                int i215 = i214 + 2;
                this.hashCode = i215;
                iArr90[i215 - 1] = iArr90[i215 - 3];
                iArr90[i214] = iArr90[i215 - 4];
                iArr90[i215 - 1] = -iArr90[i215 - 1];
                int i216 = i215 - 1;
                this.hashCode = i216;
                iArr90[i216 - 1] = iArr90[i216] & iArr90[i216 - 1];
                return 0;
            case 106:
                int[] iArr91 = this.values;
                int i217 = this.hashCode;
                iArr91[i217 - 1] = -iArr91[i217 - 1];
                int i218 = i217 - 1;
                this.hashCode = i218;
                iArr91[i218 - 1] = iArr91[i218 - 1] | iArr91[i218];
                int i219 = i218 - 1;
                this.hashCode = i219;
                iArr91[i219 - 1] = iArr91[i219 - 1] + iArr91[i219];
                return 0;
            case 107:
                int[] iArr92 = this.values;
                int i220 = this.hashCode;
                this.hashCode = i220 + 1;
                iArr92[i220] = 48;
                return 0;
            case 108:
                int[] iArr93 = this.values;
                int i221 = this.hashCode;
                this.hashCode = i221 + 1;
                iArr93[i221] = 117;
                return 0;
            case 109:
                int[] iArr94 = this.values;
                int i222 = this.hashCode;
                int i223 = iArr94[i222 - 1];
                iArr94[i222 - 1] = iArr94[i222 - 2];
                iArr94[i222 - 2] = i223;
                int i224 = i222 - 1;
                this.hashCode = i224;
                this.Grayscale$Algorithm[i224] = null;
                iArr94[i224 - 1] = -iArr94[i224 - 1];
                return 0;
            case 110:
                int[] iArr95 = this.values;
                int i225 = this.hashCode;
                int i226 = i225 + 1;
                this.hashCode = i226;
                iArr95[i225] = 1;
                int i227 = i226 - 1;
                this.hashCode = i227;
                iArr95[i227 - 1] = iArr95[i227 - 1] << iArr95[i227];
                int i228 = i227 - 1;
                this.hashCode = i228;
                iArr95[i228 - 1] = iArr95[i228 - 1] + iArr95[i228];
                return 0;
            case 111:
                int[] iArr96 = this.values;
                int i229 = this.hashCode;
                int i230 = i229 + 1;
                this.hashCode = i230;
                iArr96[i229] = 1;
                int i231 = i230 + 1;
                this.hashCode = i231;
                iArr96[i230] = iArr96[i231 - 2];
                return 0;
            case 112:
                int[] iArr97 = this.values;
                int i232 = this.hashCode;
                int i233 = i232 + 1;
                this.hashCode = i233;
                iArr97[i232] = 1;
                int i234 = i233 - 1;
                this.hashCode = i234;
                iArr97[i234 - 1] = iArr97[i234 - 1] - iArr97[i234];
                int i235 = i234 + 1;
                this.hashCode = i235;
                iArr97[i234] = iArr97[i235 - 2];
                return 0;
            case 113:
                int[] iArr98 = this.values;
                int i236 = this.hashCode;
                this.hashCode = i236 + 1;
                iArr98[i236] = 69;
                return 0;
            case 114:
                Object[] objArr11 = this.Grayscale$Algorithm;
                int i237 = this.hashCode;
                int i238 = i237 + 1;
                this.hashCode = i238;
                objArr11[i237] = null;
                Object obj4 = objArr11[i238 - 1];
                objArr11[i238 - 1] = null;
                this.values[i238 - 1] = ((int[]) obj4).length;
                int i239 = i238 - 1;
                this.hashCode = i239;
                objArr11[i239] = null;
                return 0;
            case 115:
                int[] iArr99 = this.values;
                int i240 = this.hashCode;
                int i241 = i240 + 1;
                this.hashCode = i241;
                iArr99[i240] = 5;
                iArr99[i241 - 1] = -iArr99[i241 - 1];
                int i242 = i241 + 2;
                this.hashCode = i242;
                iArr99[i242 - 1] = iArr99[i242 - 3];
                iArr99[i241] = iArr99[i242 - 4];
                return 0;
            case 116:
                int i243 = this.hashCode - 1;
                this.hashCode = i243;
                this.Grayscale$Algorithm[i243] = null;
                int i244 = i243 - 1;
                this.hashCode = i244;
                int[] iArr100 = this.values;
                iArr100[i244 - 1] = iArr100[i244 - 1] & iArr100[i244];
                int i245 = i244 - 1;
                this.hashCode = i245;
                iArr100[i245 - 1] = iArr100[i245] | iArr100[i245 - 1];
                return 0;
            case 117:
                int i246 = this.hashCode - 1;
                this.hashCode = i246;
                this.Grayscale$Algorithm[i246] = null;
                int[] iArr101 = this.values;
                iArr101[i246 - 1] = -iArr101[i246 - 1];
                int i247 = i246 - 1;
                this.hashCode = i247;
                iArr101[i247 - 1] = iArr101[i247] ^ iArr101[i247 - 1];
                return 0;
            case 118:
                int[] iArr102 = this.values;
                int i248 = this.hashCode;
                iArr102[i248 - 1] = -iArr102[i248 - 1];
                int i249 = i248 - 1;
                this.hashCode = i249;
                iArr102[i249 - 1] = iArr102[i249] | iArr102[i249 - 1];
                return 0;
            case 119:
                int i250 = this.hashCode - 1;
                this.hashCode = i250;
                int[] iArr103 = this.values;
                iArr103[i250 - 1] = iArr103[i250 - 1] + iArr103[i250];
                int i251 = i250 + 1;
                this.hashCode = i251;
                iArr103[i250] = iArr103[i251 - 2];
                this.hashCode = i251 + 1;
                iArr103[i251] = 128;
                return 0;
            case 120:
                int i252 = this.hashCode - 1;
                this.hashCode = i252;
                Object[] objArr12 = this.Grayscale$Algorithm;
                Object obj5 = objArr12[i252];
                objArr12[i252] = null;
                objArr12[13] = obj5;
                return 0;
            case 121:
                int[] iArr104 = this.values;
                int i253 = this.hashCode;
                this.hashCode = i253 + 1;
                iArr104[i253] = 17;
                return 0;
            case 122:
                int[] iArr105 = this.values;
                int i254 = this.hashCode;
                int i255 = i254 + 2;
                this.hashCode = i255;
                iArr105[i255 - 1] = iArr105[i255 - 3];
                iArr105[i254] = iArr105[i255 - 4];
                int i256 = i255 - 1;
                this.hashCode = i256;
                iArr105[i256 - 1] = iArr105[i256] & iArr105[i256 - 1];
                return 0;
            case 123:
                int i257 = this.hashCode - 1;
                this.hashCode = i257;
                int[] iArr106 = this.values;
                iArr106[i257 - 1] = iArr106[i257 - 1] + iArr106[i257];
                int i258 = i257 + 1;
                this.hashCode = i258;
                iArr106[i257] = iArr106[i258 - 2];
                return 0;
            case 124:
                int[] iArr107 = this.values;
                int i259 = this.hashCode;
                int i260 = i259 + 1;
                this.hashCode = i260;
                iArr107[i259] = 19;
                iArr107[i260 - 1] = -iArr107[i260 - 1];
                int i261 = i260 + 1;
                this.hashCode = i261;
                iArr107[i260] = iArr107[i261 - 2];
                return 0;
            case 125:
                int[] iArr108 = this.values;
                int i262 = this.hashCode;
                iArr108[i262 - 1] = -iArr108[i262 - 1];
                this.hashCode = i262 + 1;
                iArr108[i262] = -1;
                return 0;
            case 126:
                int[] iArr109 = this.values;
                int i263 = this.hashCode;
                int i264 = i263 + 1;
                this.hashCode = i264;
                iArr109[i263] = -1;
                int i265 = i264 - 1;
                this.hashCode = i265;
                iArr109[i265 - 1] = iArr109[i265 - 1] ^ iArr109[i265];
                int i266 = i265 + 1;
                this.hashCode = i266;
                int i267 = iArr109[i266 - 2];
                iArr109[i265] = i267;
                iArr109[i266 - 2] = iArr109[i266 - 3];
                iArr109[i266 - 3] = iArr109[i266 - 4];
                iArr109[i266 - 4] = i267;
                return 0;
            case 127:
                int[] iArr110 = this.values;
                int i268 = this.hashCode;
                int i269 = iArr110[i268 - 1];
                iArr110[i268 - 1] = iArr110[i268 - 2];
                iArr110[i268 - 2] = i269;
                int i270 = i268 - 1;
                this.hashCode = i270;
                this.Grayscale$Algorithm[i270] = null;
                return 0;
            case 128:
                int[] iArr111 = this.values;
                int i271 = this.hashCode;
                int i272 = i271 + 1;
                this.hashCode = i272;
                iArr111[i271] = iArr111[i272 - 2];
                iArr111[i272 - 1] = -iArr111[i272 - 1];
                this.hashCode = i272 + 1;
                iArr111[i272] = -1;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3:
                int[] iArr112 = this.values;
                int i273 = this.hashCode;
                int i274 = iArr112[i273 - 1];
                iArr112[i273 - 1] = iArr112[i273 - 2];
                iArr112[i273 - 2] = i274;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                int i275 = this.hashCode - 1;
                this.hashCode = i275;
                this.Grayscale$Algorithm[i275] = null;
                int i276 = i275 - 1;
                this.hashCode = i276;
                int[] iArr113 = this.values;
                iArr113[i276 - 1] = iArr113[i276 - 1] - iArr113[i276];
                return 0;
            case 131:
                int[] iArr114 = this.values;
                int i277 = this.hashCode;
                int i278 = i277 + 1;
                this.hashCode = i278;
                iArr114[i277] = 1;
                int i279 = i278 - 1;
                this.hashCode = i279;
                iArr114[i279 - 1] = iArr114[i279 - 1] - iArr114[i279];
                this.hashCode = i279 + 1;
                iArr114[i279] = 1;
                return 0;
            case 132:
                int[] iArr115 = this.values;
                int i280 = this.hashCode;
                int i281 = i280 + 2;
                this.hashCode = i281;
                iArr115[i281 - 1] = iArr115[i281 - 3];
                iArr115[i280] = iArr115[i281 - 4];
                iArr115[i281 - 1] = -iArr115[i281 - 1];
                int i282 = i281 - 1;
                this.hashCode = i282;
                iArr115[i282 - 1] = iArr115[i282] | iArr115[i282 - 1];
                return 0;
            case 133:
                int i283 = this.hashCode - 1;
                this.hashCode = i283;
                int[] iArr116 = this.values;
                iArr116[i283 - 1] = iArr116[i283 - 1] ^ iArr116[i283];
                int i284 = i283 - 1;
                this.hashCode = i284;
                iArr116[i284 - 1] = iArr116[i284 - 1] - iArr116[i284];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                Object[] objArr13 = this.Grayscale$Algorithm;
                int i285 = this.hashCode;
                int i286 = i285 + 1;
                this.hashCode = i286;
                objArr13[i285] = objArr13[12];
                this.hashCode = i286 + 1;
                objArr13[i286] = objArr13[13];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
                int[] iArr117 = this.values;
                int i287 = this.hashCode;
                int i288 = i287 + 1;
                this.hashCode = i288;
                iArr117[i287] = 43;
                int i289 = i288 + 1;
                this.hashCode = i289;
                iArr117[i288] = iArr117[i289 - 2];
                return 0;
            case 136:
                int[] iArr118 = this.values;
                int i290 = this.hashCode;
                int i291 = i290 + 1;
                this.hashCode = i291;
                iArr118[i290] = -1;
                int i292 = i291 + 2;
                this.hashCode = i292;
                iArr118[i292 - 1] = iArr118[i292 - 3];
                iArr118[i291] = iArr118[i292 - 4];
                this.hashCode = i292 + 1;
                iArr118[i292] = -1;
                return 0;
            case 137:
                int i293 = this.hashCode - 1;
                this.hashCode = i293;
                int[] iArr119 = this.values;
                iArr119[i293 - 1] = iArr119[i293 - 1] & iArr119[i293];
                int i294 = i293 + 1;
                this.hashCode = i294;
                int i295 = iArr119[i294 - 2];
                iArr119[i293] = i295;
                iArr119[i294 - 2] = iArr119[i294 - 3];
                iArr119[i294 - 3] = iArr119[i294 - 4];
                iArr119[i294 - 4] = i295;
                int i296 = i294 - 1;
                this.hashCode = i296;
                this.Grayscale$Algorithm[i296] = null;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS:
                int[] iArr120 = this.values;
                int i297 = this.hashCode;
                int i298 = i297 + 1;
                this.hashCode = i298;
                iArr120[i297] = -1;
                int i299 = i298 - 1;
                this.hashCode = i299;
                iArr120[i299 - 1] = iArr120[i299] ^ iArr120[i299 - 1];
                return 0;
            case 139:
                int i300 = this.hashCode - 1;
                this.hashCode = i300;
                int[] iArr121 = this.values;
                iArr121[i300 - 1] = iArr121[i300 - 1] & iArr121[i300];
                int i301 = i300 - 1;
                this.hashCode = i301;
                iArr121[i301 - 1] = iArr121[i301] | iArr121[i301 - 1];
                return 0;
            case SavingsActivity.RV_BENEFIT_WIDTH /*140*/:
                int[] iArr122 = this.values;
                int i302 = this.hashCode;
                int i303 = iArr122[i302 - 1];
                iArr122[i302 - 1] = iArr122[i302 - 2];
                iArr122[i302 - 2] = i303;
                int i304 = i302 - 1;
                this.hashCode = i304;
                this.Grayscale$Algorithm[i304] = null;
                int i305 = i304 - 1;
                this.hashCode = i305;
                iArr122[i305 - 1] = iArr122[i305 - 1] - iArr122[i305];
                return 0;
            case 141:
                int[] iArr123 = this.values;
                int i306 = this.hashCode;
                int i307 = i306 + 1;
                this.hashCode = i307;
                iArr123[i306] = 1;
                iArr123[i307 - 1] = -iArr123[i307 - 1];
                return 0;
            case 142:
                int[] iArr124 = this.values;
                int i308 = this.hashCode;
                int i309 = i308 + 2;
                this.hashCode = i309;
                iArr124[i309 - 1] = iArr124[i309 - 3];
                iArr124[i308] = iArr124[i309 - 4];
                int i310 = i309 - 1;
                this.hashCode = i310;
                iArr124[i310 - 1] = iArr124[i310 - 1] & iArr124[i310];
                int i311 = i310 + 1;
                this.hashCode = i311;
                int i312 = iArr124[i311 - 2];
                iArr124[i310] = i312;
                iArr124[i311 - 2] = iArr124[i311 - 3];
                iArr124[i311 - 3] = iArr124[i311 - 4];
                iArr124[i311 - 4] = i312;
                return 0;
            case 143:
                int[] iArr125 = this.values;
                int i313 = this.hashCode;
                this.hashCode = i313 + 1;
                iArr125[i313] = 61;
                return 0;
            case 144:
                int[] iArr126 = this.values;
                int i314 = this.hashCode;
                iArr126[i314 - 1] = -iArr126[i314 - 1];
                int i315 = i314 + 2;
                this.hashCode = i315;
                iArr126[i315 - 1] = iArr126[i315 - 3];
                iArr126[i314] = iArr126[i315 - 4];
                return 0;
            case 145:
                int[] iArr127 = this.values;
                int i316 = this.hashCode;
                iArr127[i316 - 1] = -iArr127[i316 - 1];
                int i317 = i316 + 2;
                this.hashCode = i317;
                iArr127[i317 - 1] = iArr127[i317 - 3];
                iArr127[i316] = iArr127[i317 - 4];
                this.hashCode = i317 + 1;
                iArr127[i317] = -1;
                return 0;
            case 146:
                int i318 = this.hashCode - 1;
                this.hashCode = i318;
                this.Grayscale$Algorithm[i318] = null;
                int i319 = i318 - 1;
                this.hashCode = i319;
                int[] iArr128 = this.values;
                iArr128[i319 - 1] = iArr128[i319 - 1] & iArr128[i319];
                int i320 = i319 + 1;
                this.hashCode = i320;
                int i321 = iArr128[i320 - 2];
                iArr128[i319] = i321;
                iArr128[i320 - 2] = iArr128[i320 - 3];
                iArr128[i320 - 3] = iArr128[i320 - 4];
                iArr128[i320 - 4] = i321;
                return 0;
            case 147:
                int[] iArr129 = this.values;
                int i322 = this.hashCode;
                iArr129[i322 - 1] = -iArr129[i322 - 1];
                int i323 = i322 + 2;
                this.hashCode = i323;
                iArr129[i323 - 1] = iArr129[i323 - 3];
                iArr129[i322] = iArr129[i323 - 4];
                int i324 = i323 - 1;
                this.hashCode = i324;
                iArr129[i324 - 1] = iArr129[i324] ^ iArr129[i324 - 1];
                return 0;
            case 148:
                int[] iArr130 = this.values;
                int i325 = this.hashCode;
                this.hashCode = i325 + 1;
                iArr130[i325] = 65;
                return 0;
            case 149:
                int i326 = this.hashCode - 1;
                this.hashCode = i326;
                int[] iArr131 = this.values;
                iArr131[i326 - 1] = iArr131[i326 - 1] ^ iArr131[i326];
                int i327 = iArr131[i326 - 1];
                iArr131[i326 - 1] = iArr131[i326 - 2];
                iArr131[i326 - 2] = i327;
                return 0;
            case 150:
                int i328 = this.hashCode - 1;
                this.hashCode = i328;
                int[] iArr132 = this.values;
                iArr132[i328 - 1] = iArr132[i328 - 1] - iArr132[i328];
                this.hashCode = i328 + 1;
                iArr132[i328] = 1;
                return 0;
            case 151:
                int[] iArr133 = this.values;
                int i329 = this.hashCode;
                int i330 = i329 + 1;
                this.hashCode = i330;
                iArr133[i329] = 81;
                iArr133[i330 - 1] = -iArr133[i330 - 1];
                return 0;
            case 152:
                int[] iArr134 = this.values;
                int i331 = this.hashCode;
                int i332 = i331 + 2;
                this.hashCode = i332;
                iArr134[i332 - 1] = iArr134[i332 - 3];
                iArr134[i331] = iArr134[i332 - 4];
                int i333 = i332 + 1;
                this.hashCode = i333;
                iArr134[i332] = -1;
                int i334 = i333 - 1;
                this.hashCode = i334;
                iArr134[i334 - 1] = iArr134[i334] ^ iArr134[i334 - 1];
                return 0;
            case 153:
                int[] iArr135 = this.values;
                int i335 = this.hashCode;
                int i336 = i335 + 1;
                this.hashCode = i336;
                iArr135[i335] = -1;
                int i337 = i336 - 1;
                this.hashCode = i337;
                iArr135[i337 - 1] = iArr135[i337 - 1] ^ iArr135[i337];
                int i338 = i337 - 1;
                this.hashCode = i338;
                iArr135[i338 - 1] = iArr135[i338] & iArr135[i338 - 1];
                return 0;
            case 154:
                int i339 = this.hashCode - 1;
                this.hashCode = i339;
                int[] iArr136 = this.values;
                iArr136[i339 - 1] = iArr136[i339 - 1] << iArr136[i339];
                iArr136[i339 - 1] = -iArr136[i339 - 1];
                return 0;
            case 155:
                int i340 = this.hashCode - 1;
                this.hashCode = i340;
                int[] iArr137 = this.values;
                iArr137[i340 - 1] = iArr137[i340 - 1] << iArr137[i340];
                int i341 = i340 + 1;
                this.hashCode = i341;
                int i342 = iArr137[i341 - 2];
                iArr137[i340] = i342;
                iArr137[i341 - 2] = iArr137[i341 - 3];
                iArr137[i341 - 3] = iArr137[i341 - 4];
                iArr137[i341 - 4] = i342;
                int i343 = i341 - 1;
                this.hashCode = i343;
                this.Grayscale$Algorithm[i343] = null;
                return 0;
            case 156:
                int[] iArr138 = this.values;
                int i344 = this.hashCode;
                int i345 = i344 + 1;
                this.hashCode = i345;
                iArr138[i344] = 61;
                iArr138[i345 - 1] = -iArr138[i345 - 1];
                return 0;
            case 157:
                int i346 = this.hashCode - 1;
                this.hashCode = i346;
                this.Grayscale$Algorithm[i346] = null;
                int[] iArr139 = this.values;
                iArr139[i346 - 1] = -iArr139[i346 - 1];
                return 0;
            case 158:
                int i347 = this.hashCode - 1;
                this.hashCode = i347;
                this.Grayscale$Algorithm[i347] = null;
                int i348 = i347 - 1;
                this.hashCode = i348;
                int[] iArr140 = this.values;
                iArr140[i348 - 1] = iArr140[i348] & iArr140[i348 - 1];
                return 0;
            case 159:
                int i349 = this.hashCode - 1;
                this.hashCode = i349;
                int[] iArr141 = this.values;
                iArr141[i349 - 1] = iArr141[i349 - 1] ^ iArr141[i349];
                int i350 = i349 - 1;
                this.hashCode = i350;
                iArr141[i350 - 1] = iArr141[i350 - 1] - iArr141[i350];
                int i351 = i350 + 1;
                this.hashCode = i351;
                iArr141[i350] = iArr141[i351 - 2];
                return 0;
            case BlobStatic.MONITOR_IMAGE_WIDTH /*160*/:
                int[] iArr142 = this.values;
                int i352 = this.hashCode;
                Object[] objArr14 = this.Grayscale$Algorithm;
                Object obj6 = objArr14[i352 - 1];
                objArr14[i352 - 1] = null;
                iArr142[i352 - 1] = ((int[]) obj6).length;
                return 0;
            case 161:
                int[] iArr143 = this.values;
                int i353 = this.hashCode;
                this.hashCode = i353 + 1;
                iArr143[i353] = 29;
                return 0;
            case 162:
                int[] iArr144 = this.values;
                int i354 = this.hashCode;
                this.hashCode = i354 + 1;
                iArr144[i354] = 31;
                return 0;
            case 163:
                int[] iArr145 = this.values;
                int i355 = this.hashCode;
                iArr145[i355 - 1] = -iArr145[i355 - 1];
                int i356 = i355 - 1;
                this.hashCode = i356;
                iArr145[i356 - 1] = iArr145[i356 - 1] & iArr145[i356];
                int i357 = i356 + 1;
                this.hashCode = i357;
                int i358 = iArr145[i357 - 2];
                iArr145[i356] = i358;
                iArr145[i357 - 2] = iArr145[i357 - 3];
                iArr145[i357 - 3] = iArr145[i357 - 4];
                iArr145[i357 - 4] = i358;
                return 0;
            case 164:
                int i359 = this.hashCode - 1;
                this.hashCode = i359;
                this.Grayscale$Algorithm[i359] = null;
                int[] iArr146 = this.values;
                iArr146[i359 - 1] = -iArr146[i359 - 1];
                int i360 = i359 - 1;
                this.hashCode = i360;
                iArr146[i360 - 1] = iArr146[i360] | iArr146[i360 - 1];
                return 0;
            case 165:
                int[] iArr147 = this.values;
                int i361 = this.hashCode;
                this.hashCode = i361 + 1;
                iArr147[i361] = 27;
                return 0;
            case 166:
                int i362 = this.hashCode - 1;
                this.hashCode = i362;
                this.Grayscale$Algorithm[i362] = null;
                int[] iArr148 = this.values;
                iArr148[i362 - 1] = -iArr148[i362 - 1];
                int i363 = i362 - 1;
                this.hashCode = i363;
                iArr148[i363 - 1] = iArr148[i363] & iArr148[i363 - 1];
                return 0;
            case 167:
                Object[] objArr15 = this.Grayscale$Algorithm;
                int i364 = this.hashCode;
                int i365 = i364 + 1;
                this.hashCode = i365;
                objArr15[i364] = objArr15[13];
                this.hashCode = i365 + 1;
                objArr15[i365] = objArr15[14];
                return 0;
            case 168:
                int i366 = this.hashCode - 1;
                this.hashCode = i366;
                Object[] objArr16 = this.Grayscale$Algorithm;
                Object obj7 = objArr16[i366];
                objArr16[i366] = null;
                objArr16[14] = obj7;
                return 0;
            case 169:
                int[] iArr149 = this.values;
                int i367 = this.hashCode;
                this.hashCode = i367 + 1;
                iArr149[i367] = 60;
                return 0;
            case 170:
                int[] iArr150 = this.values;
                int i368 = this.hashCode;
                this.hashCode = i368 + 1;
                iArr150[i368] = 34;
                return 0;
            case 171:
                int[] iArr151 = this.values;
                int i369 = this.hashCode;
                int i370 = i369 + 1;
                this.hashCode = i370;
                iArr151[i369] = 65;
                int i371 = i370 + 1;
                this.hashCode = i371;
                iArr151[i370] = iArr151[i371 - 2];
                return 0;
            case 172:
                int i372 = this.hashCode - 1;
                this.hashCode = i372;
                int[] iArr152 = this.values;
                iArr152[i372 - 1] = iArr152[i372 - 1] << iArr152[i372];
                return 0;
            case 173:
                int[] iArr153 = this.values;
                int i373 = this.hashCode;
                iArr153[i373 - 1] = -iArr153[i373 - 1];
                int i374 = i373 - 1;
                this.hashCode = i374;
                iArr153[i374 - 1] = iArr153[i374 - 1] ^ iArr153[i374];
                int i375 = i374 - 1;
                this.hashCode = i375;
                iArr153[i375 - 1] = iArr153[i375 - 1] - iArr153[i375];
                return 0;
            case 174:
                int[] iArr154 = this.values;
                int i376 = this.hashCode;
                iArr154[i376 - 1] = -iArr154[i376 - 1];
                int i377 = i376 + 1;
                this.hashCode = i377;
                iArr154[i376] = iArr154[i377 - 2];
                return 0;
            case 175:
                int[] iArr155 = this.values;
                int i378 = this.hashCode;
                this.hashCode = i378 + 1;
                iArr155[i378] = 26;
                return 0;
            case 176:
                int[] iArr156 = this.values;
                int i379 = this.hashCode;
                this.hashCode = i379 + 1;
                iArr156[i379] = 101;
                return 0;
            case 177:
                int[] iArr157 = this.values;
                int i380 = this.hashCode;
                int i381 = i380 + 1;
                this.hashCode = i381;
                iArr157[i380] = iArr157[i381 - 2];
                int i382 = i381 + 1;
                this.hashCode = i382;
                iArr157[i381] = 128;
                int i383 = i382 - 1;
                this.hashCode = i383;
                iArr157[i383 - 1] = iArr157[i383 - 1] % iArr157[i383];
                return 0;
            case 178:
                int[] iArr158 = this.values;
                int i384 = this.hashCode;
                int i385 = i384 + 1;
                this.hashCode = i385;
                iArr158[i384] = 5;
                int i386 = i385 + 1;
                this.hashCode = i386;
                iArr158[i385] = 2;
                int i387 = i386 - 1;
                this.hashCode = i387;
                iArr158[i387 - 1] = iArr158[i387 - 1] >>> iArr158[i387];
                return 0;
            case 179:
                int[] iArr159 = this.values;
                int i388 = this.hashCode;
                int i389 = i388 + 1;
                this.hashCode = i389;
                iArr159[i388] = 21;
                iArr159[i389 - 1] = -iArr159[i389 - 1];
                int i390 = i389 + 2;
                this.hashCode = i390;
                iArr159[i390 - 1] = iArr159[i390 - 3];
                iArr159[i389] = iArr159[i390 - 4];
                return 0;
            case 180:
                int i391 = this.hashCode - 1;
                this.hashCode = i391;
                this.Grayscale$Algorithm[i391] = null;
                int[] iArr160 = this.values;
                iArr160[i391 - 1] = -iArr160[i391 - 1];
                int i392 = i391 + 2;
                this.hashCode = i392;
                iArr160[i392 - 1] = iArr160[i392 - 3];
                iArr160[i391] = iArr160[i392 - 4];
                return 0;
            case 181:
                int[] iArr161 = this.values;
                int i393 = this.hashCode;
                int i394 = iArr161[i393 - 1];
                iArr161[i393 - 1] = iArr161[i393 - 2];
                iArr161[i393 - 2] = i394;
                this.hashCode = i393 + 1;
                iArr161[i393] = -1;
                return 0;
            case 182:
                int[] iArr162 = this.values;
                int i395 = this.hashCode;
                int i396 = i395 + 1;
                this.hashCode = i396;
                iArr162[i395] = iArr162[i396 - 2];
                this.hashCode = i396 + 1;
                iArr162[i396] = -1;
                return 0;
            case 183:
                int i397 = this.hashCode - 1;
                this.hashCode = i397;
                int[] iArr163 = this.values;
                iArr163[i397 - 1] = iArr163[i397 - 1] ^ iArr163[i397];
                int i398 = iArr163[i397 - 1];
                iArr163[i397 - 1] = iArr163[i397 - 2];
                iArr163[i397 - 2] = i398;
                int i399 = i397 - 1;
                this.hashCode = i399;
                this.Grayscale$Algorithm[i399] = null;
                return 0;
            case 184:
                int[] iArr164 = this.values;
                int i400 = this.hashCode;
                int i401 = i400 + 1;
                this.hashCode = i401;
                iArr164[i400] = 1;
                int i402 = i401 - 1;
                this.hashCode = i402;
                iArr164[i402 - 1] = iArr164[i402 - 1] - iArr164[i402];
                return 0;
            case WSContextConstant.HANDSHAKE_RECEIVE_SIZE /*185*/:
                int[] iArr165 = this.values;
                int i403 = this.hashCode;
                Object[] objArr17 = this.Grayscale$Algorithm;
                Object obj8 = objArr17[i403 - 1];
                objArr17[i403 - 1] = null;
                iArr165[i403 - 1] = ((int[]) obj8).length;
                int i404 = i403 - 1;
                this.hashCode = i404;
                objArr17[i404] = null;
                return 0;
            case 186:
                int[] iArr166 = this.values;
                int i405 = this.hashCode;
                int i406 = i405 + 1;
                this.hashCode = i406;
                iArr166[i405] = 2;
                int i407 = i406 - 1;
                this.hashCode = i407;
                iArr166[i407 - 1] = iArr166[i407 - 1] % iArr166[i407];
                int i408 = i407 - 1;
                this.hashCode = i408;
                this.Grayscale$Algorithm[i408] = null;
                return 0;
            case 187:
                int[] iArr167 = this.values;
                int i409 = this.hashCode;
                this.hashCode = i409 + 1;
                iArr167[i409] = 88;
                return 0;
            case TsExtractor.TS_PACKET_SIZE:
                int[] iArr168 = this.values;
                int i410 = this.hashCode;
                this.hashCode = i410 + 1;
                iArr168[i410] = 35;
                return 0;
            case 189:
                int i411 = this.hashCode - 1;
                this.hashCode = i411;
                int[] iArr169 = this.values;
                iArr169[i411 - 1] = iArr169[i411 - 1] ^ iArr169[i411];
                int i412 = i411 - 1;
                this.hashCode = i412;
                iArr169[i412 - 1] = iArr169[i412] & iArr169[i412 - 1];
                return 0;
            case 190:
                int i413 = this.hashCode - 1;
                this.hashCode = i413;
                int[] iArr170 = this.values;
                iArr170[i413 - 1] = iArr170[i413 - 1] | iArr170[i413];
                int i414 = i413 + 1;
                this.hashCode = i414;
                int i415 = iArr170[i414 - 2];
                iArr170[i413] = i415;
                iArr170[i414 - 2] = iArr170[i414 - 3];
                iArr170[i414 - 3] = iArr170[i414 - 4];
                iArr170[i414 - 4] = i415;
                int i416 = i414 - 1;
                this.hashCode = i416;
                this.Grayscale$Algorithm[i416] = null;
                return 0;
            case 191:
                int[] iArr171 = this.values;
                int i417 = this.hashCode;
                int i418 = i417 + 2;
                this.hashCode = i418;
                iArr171[i418 - 1] = iArr171[i418 - 3];
                iArr171[i417] = iArr171[i418 - 4];
                this.hashCode = i418 + 1;
                iArr171[i418] = -1;
                return 0;
            case PsExtractor.AUDIO_STREAM:
                int[] iArr172 = this.values;
                int i419 = this.hashCode;
                this.hashCode = i419 + 1;
                iArr172[i419] = 79;
                return 0;
            case 193:
                int[] iArr173 = this.values;
                int i420 = this.hashCode;
                int i421 = i420 + 1;
                this.hashCode = i421;
                iArr173[i420] = iArr173[i421 - 2];
                iArr173[i421 - 1] = -iArr173[i421 - 1];
                return 0;
            case 194:
                int[] iArr174 = this.values;
                int i422 = this.hashCode;
                this.hashCode = i422 + 1;
                iArr174[i422] = 37;
                return 0;
            case 195:
                int[] iArr175 = this.values;
                int i423 = this.hashCode;
                this.hashCode = i423 + 1;
                iArr175[i423] = 0;
                return 0;
            case 196:
                int[] iArr176 = this.values;
                int i424 = this.hashCode;
                this.hashCode = i424 + 1;
                iArr176[i424] = 44;
                return 0;
            case 197:
                int[] iArr177 = this.values;
                int i425 = this.hashCode;
                this.hashCode = i425 + 1;
                iArr177[i425] = 6;
                return 0;
            case 198:
                int[] iArr178 = this.values;
                int i426 = this.hashCode;
                int i427 = i426 + 1;
                this.hashCode = i427;
                iArr178[i426] = 117;
                int i428 = i427 + 2;
                this.hashCode = i428;
                iArr178[i428 - 1] = iArr178[i428 - 3];
                iArr178[i427] = iArr178[i428 - 4];
                int i429 = i428 - 1;
                this.hashCode = i429;
                iArr178[i429 - 1] = iArr178[i429] ^ iArr178[i429 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR /*199*/:
                int[] iArr179 = this.values;
                int i430 = this.hashCode;
                this.hashCode = i430 + 1;
                iArr179[i430] = 45;
                return 0;
            default:
                return i;
        }
        return 0;
    }
}
