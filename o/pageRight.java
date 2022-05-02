package o;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.savings.activity.SavingsActivity;

public class pageRight {
    private final float[] FastBitmap$CoordinateSystem = new float[13];
    public double IsOverlapping;
    private final Object[] Mean$Arithmetic;
    public Object equals;
    public float getMax;
    public long getMin;
    private int hashCode;
    private final double[] invokeSuspend = new double[13];
    public float isInside;
    public long length;
    public int setMax;
    public int setMin;
    private int toDoubleRange;
    public double toFloatRange;
    public Object toIntRange;
    private final long[] toString = new long[13];
    private final int[] values = new int[13];

    public pageRight(Object obj) {
        Object[] objArr = new Object[13];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        this.hashCode = 0;
        this.toDoubleRange = -1;
    }

    public pageRight(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = new Object[13];
        this.Mean$Arithmetic = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        objArr[12] = obj4;
        this.hashCode = 0;
        this.toDoubleRange = -1;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [o.pageRight] */
    public int getMax(int i) {
        int i2 = 1;
        switch (i) {
            case 1:
                int i3 = this.hashCode - this.setMax;
                this.hashCode = i3;
                this.toDoubleRange = i3;
                return 0;
            case 2:
                Object[] objArr = this.Mean$Arithmetic;
                int i4 = this.toDoubleRange;
                this.toDoubleRange = i4 + 1;
                Object obj = objArr[i4];
                objArr[i4] = null;
                this.toIntRange = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.Mean$Arithmetic;
                int i5 = this.hashCode;
                this.hashCode = i5 + 1;
                objArr2[i5] = this.equals;
                return 0;
            case 4:
                Object[] objArr3 = this.Mean$Arithmetic;
                int i6 = this.hashCode;
                this.hashCode = i6 + 1;
                objArr3[i6] = objArr3[9];
                return 0;
            case 5:
                Object[] objArr4 = this.Mean$Arithmetic;
                int i7 = this.hashCode;
                int i8 = i7 + 1;
                this.hashCode = i8;
                objArr4[i7] = objArr4[9];
                int i9 = i8 + 1;
                this.hashCode = i9;
                objArr4[i8] = objArr4[10];
                this.hashCode = i9 + 1;
                objArr4[i9] = objArr4[11];
                return 0;
            case 6:
                Object[] objArr5 = this.Mean$Arithmetic;
                int i10 = this.hashCode;
                this.hashCode = i10 + 1;
                objArr5[i10] = objArr5[12];
                return 0;
            case 7:
                Object[] objArr6 = this.Mean$Arithmetic;
                int i11 = this.hashCode;
                Object obj2 = objArr6[i11 - 1];
                objArr6[i11 - 1] = null;
                this.toIntRange = obj2;
                return 0;
            case 8:
                int[] iArr = this.values;
                int i12 = this.hashCode;
                this.hashCode = i12 + 1;
                iArr[i12] = this.setMax;
                return 0;
            case 9:
                int[] iArr2 = this.values;
                int i13 = this.hashCode;
                this.hashCode = i13 + 1;
                iArr2[i13] = 37;
                return 0;
            case 10:
                int[] iArr3 = this.values;
                int i14 = this.hashCode;
                int i15 = i14 + 2;
                this.hashCode = i15;
                iArr3[i15 - 1] = iArr3[i15 - 3];
                iArr3[i14] = iArr3[i15 - 4];
                int i16 = i15 + 2;
                this.hashCode = i16;
                iArr3[i16 - 1] = iArr3[i16 - 3];
                iArr3[i15] = iArr3[i16 - 4];
                int i17 = i16 - 1;
                this.hashCode = i17;
                iArr3[i17 - 1] = iArr3[i17] ^ iArr3[i17 - 1];
                return 0;
            case 11:
                int[] iArr4 = this.values;
                int i18 = this.hashCode;
                int i19 = i18 + 1;
                this.hashCode = i19;
                int i20 = iArr4[i19 - 2];
                iArr4[i18] = i20;
                iArr4[i19 - 2] = iArr4[i19 - 3];
                iArr4[i19 - 3] = iArr4[i19 - 4];
                iArr4[i19 - 4] = i20;
                return 0;
            case 12:
                int i21 = this.hashCode - 1;
                this.hashCode = i21;
                this.Mean$Arithmetic[i21] = null;
                int i22 = i21 - 1;
                this.hashCode = i22;
                int[] iArr5 = this.values;
                iArr5[i22 - 1] = iArr5[i22 - 1] & iArr5[i22];
                int i23 = i22 - 1;
                this.hashCode = i23;
                iArr5[i23 - 1] = iArr5[i23] | iArr5[i23 - 1];
                return 0;
            case 13:
                int[] iArr6 = this.values;
                int i24 = this.hashCode;
                this.hashCode = i24 + 1;
                iArr6[i24] = 1;
                return 0;
            case 14:
                int i25 = this.hashCode - 1;
                this.hashCode = i25;
                int[] iArr7 = this.values;
                iArr7[i25 - 1] = iArr7[i25 - 1] << iArr7[i25];
                return 0;
            case 15:
                int[] iArr8 = this.values;
                int i26 = this.hashCode;
                int i27 = i26 + 1;
                this.hashCode = i27;
                int i28 = iArr8[i27 - 2];
                iArr8[i26] = i28;
                iArr8[i27 - 2] = iArr8[i27 - 3];
                iArr8[i27 - 3] = iArr8[i27 - 4];
                iArr8[i27 - 4] = i28;
                int i29 = i27 - 1;
                this.hashCode = i29;
                this.Mean$Arithmetic[i29] = null;
                int i30 = i29 + 2;
                this.hashCode = i30;
                iArr8[i30 - 1] = iArr8[i30 - 3];
                iArr8[i29] = iArr8[i30 - 4];
                return 0;
            case 16:
                int i31 = this.hashCode - 1;
                this.hashCode = i31;
                int[] iArr9 = this.values;
                iArr9[i31 - 1] = iArr9[i31 - 1] & iArr9[i31];
                this.hashCode = i31 + 1;
                iArr9[i31] = -1;
                return 0;
            case 17:
                int i32 = this.hashCode - 1;
                this.hashCode = i32;
                int[] iArr10 = this.values;
                iArr10[i32 - 1] = iArr10[i32] ^ iArr10[i32 - 1];
                return 0;
            case 18:
                int i33 = this.hashCode - 1;
                this.hashCode = i33;
                this.Mean$Arithmetic[i33] = null;
                return 0;
            case 19:
                int i34 = this.hashCode - 1;
                this.hashCode = i34;
                int[] iArr11 = this.values;
                iArr11[i34 - 1] = iArr11[i34 - 1] | iArr11[i34];
                int i35 = i34 - 1;
                this.hashCode = i35;
                iArr11[i35 - 1] = iArr11[i35] & iArr11[i35 - 1];
                return 0;
            case 20:
                int i36 = this.hashCode - 1;
                this.hashCode = i36;
                int[] iArr12 = this.values;
                iArr12[i36 - 1] = iArr12[i36 - 1] - iArr12[i36];
                int i37 = i36 + 1;
                this.hashCode = i37;
                iArr12[i36] = iArr12[i37 - 2];
                this.hashCode = i37 + 1;
                iArr12[i37] = 128;
                return 0;
            case 21:
                int[] iArr13 = this.values;
                int i38 = this.toDoubleRange;
                this.toDoubleRange = i38 + 1;
                this.setMin = iArr13[i38];
                return 0;
            case 22:
                int i39 = this.hashCode - 1;
                this.hashCode = i39;
                int[] iArr14 = this.values;
                iArr14[i39 - 1] = iArr14[i39 - 1] % iArr14[i39];
                return 0;
            case 23:
                int i40 = this.hashCode - 1;
                this.hashCode = i40;
                if (this.values[i40] != 0) {
                    i2 = 0;
                }
                this.setMin = i2;
                return 0;
            case 24:
                int[] iArr15 = this.values;
                int i41 = this.hashCode;
                int i42 = i41 + 1;
                this.hashCode = i42;
                iArr15[i41] = 2;
                int i43 = i42 - 1;
                this.hashCode = i43;
                iArr15[i43 - 1] = iArr15[i43 - 1] % iArr15[i43];
                return 0;
            case 25:
                break;
            case 26:
                int[] iArr16 = this.values;
                int i44 = this.hashCode;
                int i45 = i44 + 1;
                this.hashCode = i45;
                iArr16[i44] = 1;
                int i46 = i45 + 1;
                this.hashCode = i46;
                iArr16[i45] = iArr16[i46 - 2];
                this.hashCode = i46 + 1;
                iArr16[i46] = -1;
                break;
            case 27:
                int[] iArr17 = this.values;
                int i47 = this.hashCode;
                int i48 = i47 + 2;
                this.hashCode = i48;
                iArr17[i48 - 1] = iArr17[i48 - 3];
                iArr17[i47] = iArr17[i48 - 4];
                int i49 = i48 - 1;
                this.hashCode = i49;
                iArr17[i49 - 1] = iArr17[i49] & iArr17[i49 - 1];
                return 0;
            case 28:
                int[] iArr18 = this.values;
                int i50 = this.hashCode;
                int i51 = i50 + 1;
                this.hashCode = i51;
                iArr18[i50] = -1;
                int i52 = i51 - 1;
                this.hashCode = i52;
                iArr18[i52 - 1] = iArr18[i52] ^ iArr18[i52 - 1];
                return 0;
            case 29:
                int[] iArr19 = this.values;
                int i53 = this.hashCode;
                int i54 = i53 + 1;
                this.hashCode = i54;
                int i55 = iArr19[i54 - 2];
                iArr19[i53] = i55;
                iArr19[i54 - 2] = iArr19[i54 - 3];
                iArr19[i54 - 3] = iArr19[i54 - 4];
                iArr19[i54 - 4] = i55;
                int i56 = i54 - 1;
                this.hashCode = i56;
                this.Mean$Arithmetic[i56] = null;
                int i57 = i56 - 1;
                this.hashCode = i57;
                iArr19[i57 - 1] = iArr19[i57] | iArr19[i57 - 1];
                return 0;
            case 30:
                int i58 = this.hashCode - 1;
                this.hashCode = i58;
                int[] iArr20 = this.values;
                iArr20[i58 - 1] = iArr20[i58] & iArr20[i58 - 1];
                return 0;
            case 31:
                int[] iArr21 = this.values;
                int i59 = this.hashCode;
                int i60 = iArr21[i59 - 1];
                iArr21[i59 - 1] = iArr21[i59 - 2];
                iArr21[i59 - 2] = i60;
                return 0;
            case 32:
                int i61 = this.hashCode - 1;
                this.hashCode = i61;
                this.Mean$Arithmetic[i61] = null;
                int[] iArr22 = this.values;
                int i62 = i61 + 2;
                this.hashCode = i62;
                iArr22[i62 - 1] = iArr22[i62 - 3];
                iArr22[i61] = iArr22[i62 - 4];
                iArr22[i62 - 1] = -iArr22[i62 - 1];
                return 0;
            case 33:
                int i63 = this.hashCode - 1;
                this.hashCode = i63;
                int[] iArr23 = this.values;
                iArr23[i63 - 1] = iArr23[i63 - 1] & iArr23[i63];
                int i64 = i63 + 1;
                this.hashCode = i64;
                int i65 = iArr23[i64 - 2];
                iArr23[i63] = i65;
                iArr23[i64 - 2] = iArr23[i64 - 3];
                iArr23[i64 - 3] = iArr23[i64 - 4];
                iArr23[i64 - 4] = i65;
                int i66 = i64 - 1;
                this.hashCode = i66;
                this.Mean$Arithmetic[i66] = null;
                return 0;
            case 34:
                int[] iArr24 = this.values;
                int i67 = this.hashCode;
                iArr24[i67 - 1] = -iArr24[i67 - 1];
                return 0;
            case 35:
                int i68 = this.hashCode - 1;
                this.hashCode = i68;
                int[] iArr25 = this.values;
                iArr25[i68 - 1] = iArr25[i68 - 1] | iArr25[i68];
                int i69 = i68 - 1;
                this.hashCode = i69;
                iArr25[i69 - 1] = iArr25[i69 - 1] + iArr25[i69];
                return 0;
            case 36:
                int[] iArr26 = this.values;
                int i70 = this.hashCode;
                int i71 = i70 + 1;
                this.hashCode = i71;
                iArr26[i70] = 1;
                int i72 = i71 - 1;
                this.hashCode = i72;
                iArr26[i72 - 1] = iArr26[i72 - 1] - iArr26[i72];
                return 0;
            case 37:
                int[] iArr27 = this.values;
                int i73 = this.hashCode;
                int i74 = i73 + 1;
                this.hashCode = i74;
                iArr27[i73] = iArr27[i74 - 2];
                this.hashCode = i74 + 1;
                iArr27[i74] = 128;
                return 0;
            case 38:
                int[] iArr28 = this.values;
                int i75 = this.hashCode;
                this.hashCode = i75 + 1;
                iArr28[i75] = 2;
                return 0;
            case 39:
                int i76 = this.hashCode - 1;
                this.hashCode = i76;
                if (this.values[i76] == 0) {
                    i2 = 0;
                }
                this.setMin = i2;
                return 0;
            case 40:
                int i77 = this.hashCode - 1;
                this.hashCode = i77;
                int[] iArr29 = this.values;
                iArr29[i77 - 1] = iArr29[i77 - 1] % iArr29[i77];
                int i78 = i77 - 1;
                this.hashCode = i78;
                this.Mean$Arithmetic[i78] = null;
                return 0;
            case 41:
                for (int i79 = this.hashCode - 1; i79 >= 0; i79--) {
                    this.Mean$Arithmetic[i79] = null;
                }
                this.hashCode = 0;
                Object[] objArr7 = this.Mean$Arithmetic;
                this.hashCode = 0 + 1;
                objArr7[0] = this.equals;
                return 0;
            case 42:
                int[] iArr30 = this.values;
                int i80 = this.hashCode;
                int i81 = i80 + 1;
                this.hashCode = i81;
                iArr30[i80] = 43;
                iArr30[i81 - 1] = -iArr30[i81 - 1];
                int i82 = i81 + 2;
                this.hashCode = i82;
                iArr30[i82 - 1] = iArr30[i82 - 3];
                iArr30[i81] = iArr30[i82 - 4];
                return 0;
            case 43:
                int i83 = this.hashCode - 1;
                this.hashCode = i83;
                int[] iArr31 = this.values;
                iArr31[i83 - 1] = iArr31[i83 - 1] | iArr31[i83];
                this.hashCode = i83 + 1;
                iArr31[i83] = 1;
                return 0;
            case 44:
                int[] iArr32 = this.values;
                int i84 = this.hashCode;
                iArr32[i84 - 1] = -iArr32[i84 - 1];
                int i85 = i84 - 1;
                this.hashCode = i85;
                iArr32[i85 - 1] = iArr32[i85] ^ iArr32[i85 - 1];
                return 0;
            case 45:
                int[] iArr33 = this.values;
                int i86 = this.hashCode;
                int i87 = i86 + 1;
                this.hashCode = i87;
                iArr33[i86] = 3;
                iArr33[i87 - 1] = -iArr33[i87 - 1];
                int i88 = i87 + 1;
                this.hashCode = i88;
                iArr33[i87] = iArr33[i88 - 2];
                return 0;
            case 46:
                int[] iArr34 = this.values;
                int i89 = this.hashCode;
                iArr34[i89 - 1] = -iArr34[i89 - 1];
                this.hashCode = i89 + 1;
                iArr34[i89] = -1;
                return 0;
            case 47:
                int[] iArr35 = this.values;
                int i90 = this.hashCode;
                int i91 = i90 + 2;
                this.hashCode = i91;
                iArr35[i91 - 1] = iArr35[i91 - 3];
                iArr35[i90] = iArr35[i91 - 4];
                return 0;
            case 48:
                int[] iArr36 = this.values;
                int i92 = this.hashCode;
                int i93 = i92 + 1;
                this.hashCode = i93;
                iArr36[i92] = -1;
                int i94 = i93 - 1;
                this.hashCode = i94;
                iArr36[i94 - 1] = iArr36[i94 - 1] ^ iArr36[i94];
                int i95 = i94 - 1;
                this.hashCode = i95;
                iArr36[i95 - 1] = iArr36[i95] & iArr36[i95 - 1];
                return 0;
            case 49:
                int[] iArr37 = this.values;
                int i96 = this.hashCode;
                int i97 = i96 + 1;
                this.hashCode = i97;
                int i98 = iArr37[i97 - 2];
                iArr37[i96] = i98;
                iArr37[i97 - 2] = iArr37[i97 - 3];
                iArr37[i97 - 3] = iArr37[i97 - 4];
                iArr37[i97 - 4] = i98;
                int i99 = i97 - 1;
                this.hashCode = i99;
                this.Mean$Arithmetic[i99] = null;
                int i100 = iArr37[i99 - 1];
                iArr37[i99 - 1] = iArr37[i99 - 2];
                iArr37[i99 - 2] = i100;
                return 0;
            case 50:
                int[] iArr38 = this.values;
                int i101 = this.hashCode;
                this.hashCode = i101 + 1;
                iArr38[i101] = -1;
                return 0;
            case 51:
                int i102 = this.hashCode - 1;
                this.hashCode = i102;
                int[] iArr39 = this.values;
                iArr39[i102 - 1] = iArr39[i102 - 1] & iArr39[i102];
                int i103 = i102 - 1;
                this.hashCode = i103;
                iArr39[i103 - 1] = iArr39[i103] | iArr39[i103 - 1];
                return 0;
            case 52:
                int i104 = this.hashCode - 1;
                this.hashCode = i104;
                this.Mean$Arithmetic[i104] = null;
                int i105 = i104 - 1;
                this.hashCode = i105;
                int[] iArr40 = this.values;
                iArr40[i105 - 1] = iArr40[i105 - 1] - iArr40[i105];
                return 0;
            case 53:
                int i106 = this.hashCode - 1;
                this.hashCode = i106;
                int[] iArr41 = this.values;
                iArr41[i106 - 1] = iArr41[i106 - 1] - iArr41[i106];
                return 0;
            case 54:
                int[] iArr42 = this.values;
                int i107 = this.hashCode;
                int i108 = i107 + 1;
                this.hashCode = i108;
                iArr42[i107] = iArr42[i108 - 2];
                return 0;
            case 55:
                int[] iArr43 = this.values;
                int i109 = this.hashCode;
                this.hashCode = i109 + 1;
                iArr43[i109] = 128;
                return 0;
            case 56:
                int[] iArr44 = this.values;
                int i110 = this.hashCode;
                int i111 = i110 + 1;
                this.hashCode = i111;
                iArr44[i110] = 2;
                int i112 = i111 - 1;
                this.hashCode = i112;
                iArr44[i112 - 1] = iArr44[i112 - 1] % iArr44[i112];
                int i113 = i112 - 1;
                this.hashCode = i113;
                this.Mean$Arithmetic[i113] = null;
                return 0;
            case 57:
                int[] iArr45 = this.values;
                int i114 = this.hashCode;
                this.hashCode = i114 + 1;
                iArr45[i114] = 0;
                return 0;
            case 58:
                Object[] objArr8 = this.Mean$Arithmetic;
                int i115 = this.hashCode;
                this.hashCode = i115 + 1;
                objArr8[i115] = null;
                return 0;
            case 59:
                int[] iArr46 = this.values;
                int i116 = this.hashCode;
                Object[] objArr9 = this.Mean$Arithmetic;
                Object obj3 = objArr9[i116 - 1];
                objArr9[i116 - 1] = null;
                iArr46[i116 - 1] = ((int[]) obj3).length;
                int i117 = i116 - 1;
                this.hashCode = i117;
                objArr9[i117] = null;
                return 0;
            case 60:
                int[] iArr47 = this.values;
                int i118 = this.hashCode - 1;
                this.hashCode = i118;
                this.setMin = iArr47[i118];
                return 0;
            case 61:
                int[] iArr48 = this.values;
                int i119 = this.hashCode;
                int i120 = i119 + 1;
                this.hashCode = i120;
                iArr48[i119] = 65;
                iArr48[i120 - 1] = -iArr48[i120 - 1];
                return 0;
            case 62:
                int[] iArr49 = this.values;
                int i121 = this.hashCode;
                int i122 = i121 + 2;
                this.hashCode = i122;
                iArr49[i122 - 1] = iArr49[i122 - 3];
                iArr49[i121] = iArr49[i122 - 4];
                iArr49[i122 - 1] = -iArr49[i122 - 1];
                return 0;
            case 63:
                int[] iArr50 = this.values;
                int i123 = this.hashCode;
                int i124 = i123 + 1;
                this.hashCode = i124;
                int i125 = iArr50[i124 - 2];
                iArr50[i123] = i125;
                iArr50[i124 - 2] = iArr50[i124 - 3];
                iArr50[i124 - 3] = iArr50[i124 - 4];
                iArr50[i124 - 4] = i125;
                int i126 = i124 - 1;
                this.hashCode = i126;
                this.Mean$Arithmetic[i126] = null;
                return 0;
            case 64:
                int[] iArr51 = this.values;
                int i127 = this.hashCode;
                int i128 = i127 + 1;
                this.hashCode = i128;
                iArr51[i127] = 1;
                int i129 = i128 - 1;
                this.hashCode = i129;
                iArr51[i129 - 1] = iArr51[i129 - 1] << iArr51[i129];
                return 0;
            case 65:
                int[] iArr52 = this.values;
                int i130 = this.hashCode;
                iArr52[i130 - 1] = -iArr52[i130 - 1];
                int i131 = i130 - 1;
                this.hashCode = i131;
                iArr52[i131 - 1] = iArr52[i131 - 1] ^ iArr52[i131];
                int i132 = i131 + 2;
                this.hashCode = i132;
                iArr52[i132 - 1] = iArr52[i132 - 3];
                iArr52[i131] = iArr52[i132 - 4];
                return 0;
            case 66:
                int[] iArr53 = this.values;
                int i133 = this.hashCode;
                iArr53[i133 - 1] = -iArr53[i133 - 1];
                int i134 = i133 - 1;
                this.hashCode = i134;
                iArr53[i134 - 1] = iArr53[i134] & iArr53[i134 - 1];
                return 0;
            case 67:
                int[] iArr54 = this.values;
                int i135 = this.hashCode;
                int i136 = i135 + 1;
                this.hashCode = i136;
                int i137 = iArr54[i136 - 2];
                iArr54[i135] = i137;
                iArr54[i136 - 2] = iArr54[i136 - 3];
                iArr54[i136 - 3] = iArr54[i136 - 4];
                iArr54[i136 - 4] = i137;
                int i138 = i136 - 1;
                this.hashCode = i138;
                this.Mean$Arithmetic[i138] = null;
                iArr54[i138 - 1] = -iArr54[i138 - 1];
                return 0;
            case 68:
                int i139 = this.hashCode - 1;
                this.hashCode = i139;
                int[] iArr55 = this.values;
                iArr55[i139 - 1] = iArr55[i139] | iArr55[i139 - 1];
                return 0;
            case 69:
                int i140 = this.hashCode - 1;
                this.hashCode = i140;
                int[] iArr56 = this.values;
                iArr56[i140 - 1] = iArr56[i140 - 1] + iArr56[i140];
                int i141 = i140 + 1;
                this.hashCode = i141;
                iArr56[i140] = iArr56[i141 - 2];
                return 0;
            case 70:
                int[] iArr57 = this.values;
                int i142 = this.hashCode;
                int i143 = i142 + 1;
                this.hashCode = i143;
                iArr57[i142] = 128;
                int i144 = i143 - 1;
                this.hashCode = i144;
                iArr57[i144 - 1] = iArr57[i144 - 1] % iArr57[i144];
                return 0;
            case 71:
                int[] iArr58 = this.values;
                int i145 = this.hashCode;
                this.hashCode = i145 + 1;
                iArr58[i145] = 90;
                return 0;
            case 72:
                Object[] objArr10 = this.Mean$Arithmetic;
                int i146 = this.hashCode;
                int i147 = i146 + 1;
                this.hashCode = i147;
                objArr10[i146] = null;
                Object obj4 = objArr10[i147 - 1];
                objArr10[i147 - 1] = null;
                this.values[i147 - 1] = ((int[]) obj4).length;
                return 0;
            case 73:
                int[] iArr59 = this.values;
                int i148 = this.hashCode;
                this.hashCode = i148 + 1;
                iArr59[i148] = 20;
                return 0;
            case 74:
                int[] iArr60 = this.values;
                int i149 = this.hashCode;
                int i150 = i149 + 1;
                this.hashCode = i150;
                iArr60[i149] = 59;
                int i151 = i150 + 2;
                this.hashCode = i151;
                iArr60[i151 - 1] = iArr60[i151 - 3];
                iArr60[i150] = iArr60[i151 - 4];
                int i152 = i151 + 2;
                this.hashCode = i152;
                iArr60[i152 - 1] = iArr60[i152 - 3];
                iArr60[i151] = iArr60[i152 - 4];
                return 0;
            case 75:
                int i153 = this.hashCode - 1;
                this.hashCode = i153;
                int[] iArr61 = this.values;
                iArr61[i153 - 1] = iArr61[i153 - 1] ^ iArr61[i153];
                int i154 = i153 + 1;
                this.hashCode = i154;
                int i155 = iArr61[i154 - 2];
                iArr61[i153] = i155;
                iArr61[i154 - 2] = iArr61[i154 - 3];
                iArr61[i154 - 3] = iArr61[i154 - 4];
                iArr61[i154 - 4] = i155;
                return 0;
            case 76:
                int i156 = this.hashCode - 1;
                this.hashCode = i156;
                this.Mean$Arithmetic[i156] = null;
                int i157 = i156 - 1;
                this.hashCode = i157;
                int[] iArr62 = this.values;
                iArr62[i157 - 1] = iArr62[i157] & iArr62[i157 - 1];
                return 0;
            case 77:
                int i158 = this.hashCode - 1;
                this.hashCode = i158;
                int[] iArr63 = this.values;
                iArr63[i158 - 1] = iArr63[i158 - 1] << iArr63[i158];
                int i159 = i158 + 1;
                this.hashCode = i159;
                int i160 = iArr63[i159 - 2];
                iArr63[i158] = i160;
                iArr63[i159 - 2] = iArr63[i159 - 3];
                iArr63[i159 - 3] = iArr63[i159 - 4];
                iArr63[i159 - 4] = i160;
                int i161 = i159 - 1;
                this.hashCode = i161;
                this.Mean$Arithmetic[i161] = null;
                return 0;
            case 78:
                int i162 = this.hashCode - 1;
                this.hashCode = i162;
                int[] iArr64 = this.values;
                iArr64[i162 - 1] = iArr64[i162 - 1] ^ iArr64[i162];
                int i163 = i162 - 1;
                this.hashCode = i163;
                iArr64[i163 - 1] = iArr64[i163 - 1] - iArr64[i163];
                return 0;
            case 79:
                int[] iArr65 = this.values;
                int i164 = this.hashCode;
                int i165 = i164 + 1;
                this.hashCode = i165;
                iArr65[i164] = iArr65[i165 - 2];
                int i166 = i165 + 1;
                this.hashCode = i166;
                iArr65[i165] = 128;
                int i167 = i166 - 1;
                this.hashCode = i167;
                iArr65[i167 - 1] = iArr65[i167 - 1] % iArr65[i167];
                return 0;
            case 80:
                int[] iArr66 = this.values;
                int i168 = this.hashCode;
                this.hashCode = i168 + 1;
                iArr66[i168] = 60;
                return 0;
            case 81:
                int[] iArr67 = this.values;
                int i169 = this.hashCode;
                this.hashCode = i169 + 1;
                iArr67[i169] = 73;
                return 0;
            case 82:
                int[] iArr68 = this.values;
                int i170 = this.hashCode;
                this.hashCode = i170 + 1;
                iArr68[i170] = 93;
                return 0;
            case 83:
                int i171 = this.hashCode - 1;
                this.hashCode = i171;
                int[] iArr69 = this.values;
                iArr69[i171 - 1] = iArr69[i171 - 1] | iArr69[i171];
                int i172 = i171 + 1;
                this.hashCode = i172;
                iArr69[i171] = 1;
                int i173 = i172 - 1;
                this.hashCode = i173;
                iArr69[i173 - 1] = iArr69[i173 - 1] << iArr69[i173];
                return 0;
            case 84:
                int i174 = this.hashCode - 1;
                this.hashCode = i174;
                this.Mean$Arithmetic[i174] = null;
                int[] iArr70 = this.values;
                iArr70[i174 - 1] = -iArr70[i174 - 1];
                return 0;
            case 85:
                int i175 = this.hashCode - 1;
                this.hashCode = i175;
                int[] iArr71 = this.values;
                iArr71[i175 - 1] = iArr71[i175 - 1] & iArr71[i175];
                int i176 = i175 + 1;
                this.hashCode = i176;
                int i177 = iArr71[i176 - 2];
                iArr71[i175] = i177;
                iArr71[i176 - 2] = iArr71[i176 - 3];
                iArr71[i176 - 3] = iArr71[i176 - 4];
                iArr71[i176 - 4] = i177;
                return 0;
            case 86:
                int[] iArr72 = this.values;
                int i178 = this.hashCode;
                iArr72[i178 - 1] = -iArr72[i178 - 1];
                int i179 = i178 - 1;
                this.hashCode = i179;
                iArr72[i179 - 1] = iArr72[i179] | iArr72[i179 - 1];
                return 0;
            case 87:
                int[] iArr73 = this.values;
                int i180 = this.hashCode;
                this.hashCode = i180 + 1;
                iArr73[i180] = 88;
                return 0;
            case 88:
                int i181 = this.hashCode - 1;
                this.hashCode = i181;
                Object[] objArr11 = this.Mean$Arithmetic;
                Object obj5 = objArr11[i181];
                objArr11[i181] = null;
                if (obj5 == null) {
                    i2 = 0;
                }
                this.setMin = i2;
                return 0;
            case 89:
                int[] iArr74 = this.values;
                int i182 = this.hashCode;
                this.hashCode = i182 + 1;
                iArr74[i182] = 3;
                return 0;
            case 90:
                int i183 = this.hashCode - 1;
                this.hashCode = i183;
                this.Mean$Arithmetic[i183] = null;
                int i184 = i183 - 1;
                this.hashCode = i184;
                int[] iArr75 = this.values;
                iArr75[i184 - 1] = iArr75[i184 - 1] & iArr75[i184];
                int i185 = i184 + 1;
                this.hashCode = i185;
                int i186 = iArr75[i185 - 2];
                iArr75[i184] = i186;
                iArr75[i185 - 2] = iArr75[i185 - 3];
                iArr75[i185 - 3] = iArr75[i185 - 4];
                iArr75[i185 - 4] = i186;
                return 0;
            case 91:
                int i187 = this.hashCode - 1;
                this.hashCode = i187;
                this.Mean$Arithmetic[i187] = null;
                int[] iArr76 = this.values;
                iArr76[i187 - 1] = -iArr76[i187 - 1];
                int i188 = i187 + 2;
                this.hashCode = i188;
                iArr76[i188 - 1] = iArr76[i188 - 3];
                iArr76[i187] = iArr76[i188 - 4];
                return 0;
            case 92:
                int i189 = this.hashCode - 1;
                this.hashCode = i189;
                int[] iArr77 = this.values;
                iArr77[i189 - 1] = iArr77[i189 - 1] | iArr77[i189];
                int i190 = i189 + 2;
                this.hashCode = i190;
                iArr77[i190 - 1] = iArr77[i190 - 3];
                iArr77[i189] = iArr77[i190 - 4];
                return 0;
            case 93:
                int i191 = this.hashCode - 1;
                this.hashCode = i191;
                int[] iArr78 = this.values;
                iArr78[i191 - 1] = iArr78[i191 - 1] | iArr78[i191];
                int i192 = i191 - 1;
                this.hashCode = i192;
                iArr78[i192 - 1] = iArr78[i192 - 1] + iArr78[i192];
                int i193 = i192 + 1;
                this.hashCode = i193;
                iArr78[i192] = iArr78[i193 - 2];
                return 0;
            case 94:
                int[] iArr79 = this.values;
                int i194 = this.hashCode;
                this.hashCode = i194 + 1;
                iArr79[i194] = 97;
                return 0;
            case 95:
                int[] iArr80 = this.values;
                int i195 = this.hashCode;
                this.hashCode = i195 + 1;
                iArr80[i195] = 34;
                return 0;
            case 96:
                int[] iArr81 = this.values;
                int i196 = this.hashCode;
                int i197 = i196 + 1;
                this.hashCode = i197;
                iArr81[i196] = 2;
                this.hashCode = i197 + 1;
                iArr81[i197] = 5;
                return 0;
            case 97:
                int i198 = this.hashCode - 1;
                this.hashCode = i198;
                int[] iArr82 = this.values;
                iArr82[i198 - 1] = iArr82[i198 - 1] / iArr82[i198];
                return 0;
            case 98:
                int[] iArr83 = this.values;
                int i199 = this.hashCode;
                this.hashCode = i199 + 1;
                iArr83[i199] = 94;
                return 0;
            case 99:
                int[] iArr84 = this.values;
                int i200 = this.hashCode;
                int i201 = i200 + 1;
                this.hashCode = i201;
                iArr84[i200] = 0;
                int i202 = i201 - 1;
                this.hashCode = i202;
                iArr84[i202 - 1] = iArr84[i202 - 1] / iArr84[i202];
                int i203 = i202 - 1;
                this.hashCode = i203;
                this.Mean$Arithmetic[i203] = null;
                return 0;
            case 100:
                int[] iArr85 = this.values;
                int i204 = this.hashCode;
                int i205 = i204 + 1;
                this.hashCode = i205;
                iArr85[i204] = 2;
                this.hashCode = i205 + 1;
                iArr85[i205] = 2;
                return 0;
            case 101:
                int[] iArr86 = this.values;
                int i206 = this.hashCode;
                int i207 = i206 + 1;
                this.hashCode = i207;
                iArr86[i206] = 93;
                int i208 = i207 + 2;
                this.hashCode = i208;
                iArr86[i208 - 1] = iArr86[i208 - 3];
                iArr86[i207] = iArr86[i208 - 4];
                int i209 = i208 + 2;
                this.hashCode = i209;
                iArr86[i209 - 1] = iArr86[i209 - 3];
                iArr86[i208] = iArr86[i209 - 4];
                return 0;
            case 102:
                int i210 = this.hashCode - 1;
                this.hashCode = i210;
                this.Mean$Arithmetic[i210] = null;
                int[] iArr87 = this.values;
                int i211 = i210 + 2;
                this.hashCode = i211;
                iArr87[i211 - 1] = iArr87[i211 - 3];
                iArr87[i210] = iArr87[i211 - 4];
                int i212 = i211 - 1;
                this.hashCode = i212;
                iArr87[i212 - 1] = iArr87[i212] ^ iArr87[i212 - 1];
                return 0;
            case 103:
                int[] iArr88 = this.values;
                int i213 = this.hashCode;
                int i214 = i213 + 1;
                this.hashCode = i214;
                int i215 = iArr88[i214 - 2];
                iArr88[i213] = i215;
                iArr88[i214 - 2] = iArr88[i214 - 3];
                iArr88[i214 - 3] = iArr88[i214 - 4];
                iArr88[i214 - 4] = i215;
                int i216 = i214 - 1;
                this.hashCode = i216;
                this.Mean$Arithmetic[i216] = null;
                int i217 = i216 - 1;
                this.hashCode = i217;
                iArr88[i217 - 1] = iArr88[i217] & iArr88[i217 - 1];
                return 0;
            case 104:
                int i218 = this.hashCode - 1;
                this.hashCode = i218;
                int[] iArr89 = this.values;
                iArr89[i218 - 1] = iArr89[i218 - 1] ^ iArr89[i218];
                int i219 = i218 + 1;
                this.hashCode = i219;
                int i220 = iArr89[i219 - 2];
                iArr89[i218] = i220;
                iArr89[i219 - 2] = iArr89[i219 - 3];
                iArr89[i219 - 3] = iArr89[i219 - 4];
                iArr89[i219 - 4] = i220;
                int i221 = i219 - 1;
                this.hashCode = i221;
                this.Mean$Arithmetic[i221] = null;
                return 0;
            case 105:
                int i222 = this.hashCode - 1;
                this.hashCode = i222;
                int[] iArr90 = this.values;
                iArr90[i222 - 1] = iArr90[i222 - 1] & iArr90[i222];
                this.hashCode = i222 + 1;
                iArr90[i222] = 1;
                return 0;
            case 106:
                int i223 = this.hashCode - 1;
                this.hashCode = i223;
                int[] iArr91 = this.values;
                iArr91[i223 - 1] = iArr91[i223 - 1] << iArr91[i223];
                int i224 = i223 - 1;
                this.hashCode = i224;
                iArr91[i224 - 1] = iArr91[i224 - 1] + iArr91[i224];
                int i225 = i224 + 1;
                this.hashCode = i225;
                iArr91[i224] = iArr91[i225 - 2];
                return 0;
            case 107:
                Object[] objArr12 = this.Mean$Arithmetic;
                int i226 = this.hashCode;
                int i227 = i226 + 1;
                this.hashCode = i227;
                objArr12[i226] = objArr12[9];
                this.hashCode = i227 + 1;
                objArr12[i227] = null;
                return 0;
            case 108:
                int[] iArr92 = this.values;
                int i228 = this.hashCode;
                int i229 = i228 + 1;
                this.hashCode = i229;
                iArr92[i228] = 105;
                int i230 = i229 + 2;
                this.hashCode = i230;
                iArr92[i230 - 1] = iArr92[i230 - 3];
                iArr92[i229] = iArr92[i230 - 4];
                return 0;
            case 109:
                int i231 = this.hashCode - 1;
                this.hashCode = i231;
                int[] iArr93 = this.values;
                iArr93[i231 - 1] = iArr93[i231 - 1] ^ iArr93[i231];
                int i232 = i231 - 1;
                this.hashCode = i232;
                iArr93[i232 - 1] = iArr93[i232] & iArr93[i232 - 1];
                return 0;
            case 110:
                int i233 = this.hashCode - 1;
                this.hashCode = i233;
                int[] iArr94 = this.values;
                iArr94[i233 - 1] = iArr94[i233 - 1] | iArr94[i233];
                int i234 = i233 + 1;
                this.hashCode = i234;
                int i235 = iArr94[i234 - 2];
                iArr94[i233] = i235;
                iArr94[i234 - 2] = iArr94[i234 - 3];
                iArr94[i234 - 3] = iArr94[i234 - 4];
                iArr94[i234 - 4] = i235;
                int i236 = i234 - 1;
                this.hashCode = i236;
                this.Mean$Arithmetic[i236] = null;
                return 0;
            case 111:
                int[] iArr95 = this.values;
                int i237 = this.hashCode;
                int i238 = i237 + 1;
                this.hashCode = i238;
                iArr95[i237] = 1;
                int i239 = i238 - 1;
                this.hashCode = i239;
                iArr95[i239 - 1] = iArr95[i239 - 1] << iArr95[i239];
                int i240 = i239 - 1;
                this.hashCode = i240;
                iArr95[i240 - 1] = iArr95[i240 - 1] + iArr95[i240];
                return 0;
            case 112:
                int[] iArr96 = this.values;
                int i241 = this.hashCode;
                Object[] objArr13 = this.Mean$Arithmetic;
                Object obj6 = objArr13[i241 - 1];
                objArr13[i241 - 1] = null;
                iArr96[i241 - 1] = ((int[]) obj6).length;
                return 0;
            case 113:
                int[] iArr97 = this.values;
                int i242 = this.hashCode;
                int i243 = i242 + 1;
                this.hashCode = i243;
                iArr97[i242] = 3;
                int i244 = i243 + 1;
                this.hashCode = i244;
                iArr97[i243] = iArr97[i244 - 2];
                this.hashCode = i244 + 1;
                iArr97[i244] = -1;
                return 0;
            case 114:
                int[] iArr98 = this.values;
                int i245 = this.hashCode;
                int i246 = iArr98[i245 - 1];
                iArr98[i245 - 1] = iArr98[i245 - 2];
                iArr98[i245 - 2] = i246;
                int i247 = i245 - 1;
                this.hashCode = i247;
                this.Mean$Arithmetic[i247] = null;
                return 0;
            case 115:
                int[] iArr99 = this.values;
                int i248 = this.hashCode;
                iArr99[i248 - 1] = -iArr99[i248 - 1];
                int i249 = i248 + 2;
                this.hashCode = i249;
                iArr99[i249 - 1] = iArr99[i249 - 3];
                iArr99[i248] = iArr99[i249 - 4];
                int i250 = i249 - 1;
                this.hashCode = i250;
                iArr99[i250 - 1] = iArr99[i250] ^ iArr99[i250 - 1];
                return 0;
            case 116:
                int i251 = this.hashCode - 1;
                this.hashCode = i251;
                int[] iArr100 = this.values;
                iArr100[i251 - 1] = iArr100[i251 - 1] + iArr100[i251];
                return 0;
            case 117:
                int[] iArr101 = this.values;
                int i252 = this.hashCode;
                int i253 = i252 + 2;
                this.hashCode = i253;
                iArr101[i253 - 1] = iArr101[i253 - 3];
                iArr101[i252] = iArr101[i253 - 4];
                iArr101[i253 - 1] = -iArr101[i253 - 1];
                int i254 = i253 - 1;
                this.hashCode = i254;
                iArr101[i254 - 1] = iArr101[i254] & iArr101[i254 - 1];
                return 0;
            case 118:
                int[] iArr102 = this.values;
                int i255 = this.hashCode;
                int i256 = i255 + 1;
                this.hashCode = i256;
                iArr102[i255] = 2;
                int i257 = i256 + 1;
                this.hashCode = i257;
                iArr102[i256] = 2;
                int i258 = i257 - 1;
                this.hashCode = i258;
                iArr102[i258 - 1] = iArr102[i258 - 1] % iArr102[i258];
                return 0;
            case 119:
                int[] iArr103 = this.values;
                int i259 = this.hashCode;
                this.hashCode = i259 + 1;
                iArr103[i259] = 89;
                return 0;
            case 120:
                int[] iArr104 = this.values;
                int i260 = this.hashCode;
                int i261 = i260 + 1;
                this.hashCode = i261;
                iArr104[i260] = iArr104[i261 - 2];
                int i262 = i261 + 1;
                this.hashCode = i262;
                iArr104[i261] = -1;
                int i263 = i262 + 2;
                this.hashCode = i263;
                iArr104[i263 - 1] = iArr104[i263 - 3];
                iArr104[i262] = iArr104[i263 - 4];
                return 0;
            case 121:
                int i264 = this.hashCode - 1;
                this.hashCode = i264;
                this.Mean$Arithmetic[i264] = null;
                int[] iArr105 = this.values;
                int i265 = iArr105[i264 - 1];
                iArr105[i264 - 1] = iArr105[i264 - 2];
                iArr105[i264 - 2] = i265;
                this.hashCode = i264 + 1;
                iArr105[i264] = -1;
                return 0;
            case 122:
                int[] iArr106 = this.values;
                int i266 = this.hashCode;
                int i267 = i266 + 1;
                this.hashCode = i267;
                iArr106[i266] = iArr106[i267 - 2];
                iArr106[i267 - 1] = -iArr106[i267 - 1];
                return 0;
            case 123:
                int[] iArr107 = this.values;
                int i268 = this.hashCode;
                int i269 = iArr107[i268 - 1];
                iArr107[i268 - 1] = iArr107[i268 - 2];
                iArr107[i268 - 2] = i269;
                int i270 = i268 - 1;
                this.hashCode = i270;
                this.Mean$Arithmetic[i270] = null;
                int i271 = i270 - 1;
                this.hashCode = i271;
                iArr107[i271 - 1] = iArr107[i271 - 1] - iArr107[i271];
                return 0;
            case 124:
                int[] iArr108 = this.values;
                int i272 = this.hashCode;
                int i273 = i272 + 1;
                this.hashCode = i273;
                iArr108[i272] = 1;
                int i274 = i273 - 1;
                this.hashCode = i274;
                iArr108[i274 - 1] = iArr108[i274 - 1] - iArr108[i274];
                this.hashCode = i274 + 1;
                iArr108[i274] = 1;
                return 0;
            case 125:
                int[] iArr109 = this.values;
                int i275 = this.hashCode;
                int i276 = i275 + 1;
                this.hashCode = i276;
                iArr109[i275] = 9;
                iArr109[i276 - 1] = -iArr109[i276 - 1];
                return 0;
            case 126:
                int[] iArr110 = this.values;
                int i277 = this.hashCode;
                int i278 = i277 + 1;
                this.hashCode = i278;
                iArr110[i277] = 77;
                int i279 = i278 + 1;
                this.hashCode = i279;
                iArr110[i278] = iArr110[i279 - 2];
                return 0;
            case 127:
                int[] iArr111 = this.values;
                int i280 = this.hashCode;
                int i281 = i280 + 1;
                this.hashCode = i281;
                iArr111[i280] = -1;
                int i282 = i281 + 2;
                this.hashCode = i282;
                iArr111[i282 - 1] = iArr111[i282 - 3];
                iArr111[i281] = iArr111[i282 - 4];
                this.hashCode = i282 + 1;
                iArr111[i282] = -1;
                return 0;
            case 128:
                int i283 = this.hashCode - 1;
                this.hashCode = i283;
                this.Mean$Arithmetic[i283] = null;
                int[] iArr112 = this.values;
                int i284 = iArr112[i283 - 1];
                iArr112[i283 - 1] = iArr112[i283 - 2];
                iArr112[i283 - 2] = i284;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3:
                int i285 = this.hashCode - 1;
                this.hashCode = i285;
                int[] iArr113 = this.values;
                iArr113[i285 - 1] = iArr113[i285 - 1] ^ iArr113[i285];
                int i286 = i285 - 1;
                this.hashCode = i286;
                iArr113[i286 - 1] = iArr113[i286 - 1] & iArr113[i286];
                int i287 = i286 - 1;
                this.hashCode = i287;
                iArr113[i287 - 1] = iArr113[i287] | iArr113[i287 - 1];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                int[] iArr114 = this.values;
                int i288 = this.hashCode;
                iArr114[i288 - 1] = -iArr114[i288 - 1];
                int i289 = i288 + 1;
                this.hashCode = i289;
                iArr114[i288] = iArr114[i289 - 2];
                this.hashCode = i289 + 1;
                iArr114[i289] = -1;
                return 0;
            case 131:
                int i290 = this.hashCode - 1;
                this.hashCode = i290;
                this.Mean$Arithmetic[i290] = null;
                int i291 = i290 - 1;
                this.hashCode = i291;
                int[] iArr115 = this.values;
                iArr115[i291 - 1] = iArr115[i291 - 1] - iArr115[i291];
                this.hashCode = i291 + 1;
                iArr115[i291] = 1;
                return 0;
            case 132:
                int i292 = this.hashCode - 1;
                this.hashCode = i292;
                int[] iArr116 = this.values;
                iArr116[i292 - 1] = iArr116[i292 - 1] - iArr116[i292];
                int i293 = i292 + 1;
                this.hashCode = i293;
                iArr116[i292] = 1;
                int i294 = i293 - 1;
                this.hashCode = i294;
                iArr116[i294 - 1] = iArr116[i294 - 1] - iArr116[i294];
                return 0;
            case 133:
                int[] iArr117 = this.values;
                int i295 = this.hashCode;
                int i296 = i295 + 1;
                this.hashCode = i296;
                iArr117[i295] = 59;
                iArr117[i296 - 1] = -iArr117[i296 - 1];
                int i297 = i296 + 2;
                this.hashCode = i297;
                iArr117[i297 - 1] = iArr117[i297 - 3];
                iArr117[i296] = iArr117[i297 - 4];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                int[] iArr118 = this.values;
                int i298 = this.hashCode;
                iArr118[i298 - 1] = -iArr118[i298 - 1];
                int i299 = i298 + 2;
                this.hashCode = i299;
                iArr118[i299 - 1] = iArr118[i299 - 3];
                iArr118[i298] = iArr118[i299 - 4];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
                int i300 = this.hashCode - 1;
                this.hashCode = i300;
                int[] iArr119 = this.values;
                iArr119[i300 - 1] = iArr119[i300 - 1] | iArr119[i300];
                iArr119[i300 - 1] = -iArr119[i300 - 1];
                return 0;
            case 136:
                int[] iArr120 = this.values;
                int i301 = this.hashCode;
                int i302 = i301 + 2;
                this.hashCode = i302;
                iArr120[i302 - 1] = iArr120[i302 - 3];
                iArr120[i301] = iArr120[i302 - 4];
                int i303 = i302 - 1;
                this.hashCode = i303;
                iArr120[i303 - 1] = iArr120[i303] | iArr120[i303 - 1];
                return 0;
            case 137:
                int[] iArr121 = this.values;
                int i304 = this.hashCode;
                int i305 = i304 + 1;
                this.hashCode = i305;
                int i306 = iArr121[i305 - 2];
                iArr121[i304] = i306;
                iArr121[i305 - 2] = iArr121[i305 - 3];
                iArr121[i305 - 3] = iArr121[i305 - 4];
                iArr121[i305 - 4] = i306;
                int i307 = i305 - 1;
                this.hashCode = i307;
                this.Mean$Arithmetic[i307] = null;
                int i308 = i307 - 1;
                this.hashCode = i308;
                iArr121[i308 - 1] = iArr121[i308] ^ iArr121[i308 - 1];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS:
                int[] iArr122 = this.values;
                int i309 = this.hashCode;
                int i310 = i309 + 1;
                this.hashCode = i310;
                iArr122[i309] = 29;
                iArr122[i310 - 1] = -iArr122[i310 - 1];
                int i311 = i310 + 1;
                this.hashCode = i311;
                iArr122[i310] = iArr122[i311 - 2];
                return 0;
            case 139:
                int i312 = this.hashCode - 1;
                this.hashCode = i312;
                int[] iArr123 = this.values;
                iArr123[i312 - 1] = iArr123[i312 - 1] & iArr123[i312];
                int i313 = iArr123[i312 - 1];
                iArr123[i312 - 1] = iArr123[i312 - 2];
                iArr123[i312 - 2] = i313;
                return 0;
            case SavingsActivity.RV_BENEFIT_WIDTH /*140*/:
                int i314 = this.hashCode - 1;
                this.hashCode = i314;
                int[] iArr124 = this.values;
                iArr124[i314 - 1] = iArr124[i314 - 1] ^ iArr124[i314];
                int i315 = iArr124[i314 - 1];
                iArr124[i314 - 1] = iArr124[i314 - 2];
                iArr124[i314 - 2] = i315;
                int i316 = i314 - 1;
                this.hashCode = i316;
                this.Mean$Arithmetic[i316] = null;
                return 0;
            case 141:
                int[] iArr125 = this.values;
                int i317 = this.hashCode;
                iArr125[i317 - 1] = -iArr125[i317 - 1];
                int i318 = i317 - 1;
                this.hashCode = i318;
                iArr125[i318 - 1] = iArr125[i318 - 1] & iArr125[i318];
                this.hashCode = i318 + 1;
                iArr125[i318] = 1;
                return 0;
            case 142:
                int[] iArr126 = this.values;
                int i319 = this.hashCode;
                this.hashCode = i319 + 1;
                iArr126[i319] = 44;
                return 0;
            default:
                return i;
        }
        return 0;
    }
}
