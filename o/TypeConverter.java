package o;

import com.alibaba.griver.image.framework.utils.FileUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
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

public class TypeConverter {
    private final int[] FastBitmap$CoordinateSystem;
    public Object IsOverlapping;
    public double equals;
    public long getMax;
    public long getMin;
    private final float[] hashCode;
    private final Object[] invoke;
    private final double[] invokeSuspend;
    public Object isInside;
    public float length;
    public int setMax;
    public int setMin;
    private int toDoubleRange;
    public float toFloatRange;
    public double toIntRange;
    private final long[] toString;
    private int values;

    public TypeConverter(Object obj) {
        this.FastBitmap$CoordinateSystem = new int[19];
        this.toString = new long[19];
        this.hashCode = new float[19];
        this.invokeSuspend = new double[19];
        Object[] objArr = new Object[19];
        this.invoke = objArr;
        objArr[13] = obj;
        this.toDoubleRange = 0;
        this.values = -1;
    }

    public TypeConverter(Object obj, int i) {
        int[] iArr = new int[19];
        this.FastBitmap$CoordinateSystem = iArr;
        this.toString = new long[19];
        this.hashCode = new float[19];
        this.invokeSuspend = new double[19];
        Object[] objArr = new Object[19];
        this.invoke = objArr;
        objArr[13] = obj;
        iArr[14] = i;
        this.toDoubleRange = 0;
        this.values = -1;
    }

    public TypeConverter(Object obj, Object obj2) {
        this.FastBitmap$CoordinateSystem = new int[19];
        this.toString = new long[19];
        this.hashCode = new float[19];
        this.invokeSuspend = new double[19];
        Object[] objArr = new Object[19];
        this.invoke = objArr;
        objArr[13] = obj;
        objArr[14] = obj2;
        this.toDoubleRange = 0;
        this.values = -1;
    }

    public TypeConverter(Object obj, Object obj2, int i) {
        int[] iArr = new int[19];
        this.FastBitmap$CoordinateSystem = iArr;
        this.toString = new long[19];
        this.hashCode = new float[19];
        this.invokeSuspend = new double[19];
        Object[] objArr = new Object[19];
        this.invoke = objArr;
        objArr[13] = obj;
        objArr[14] = obj2;
        iArr[15] = i;
        this.toDoubleRange = 0;
        this.values = -1;
    }

    public TypeConverter(Object obj, Object obj2, Object obj3) {
        this.FastBitmap$CoordinateSystem = new int[19];
        this.toString = new long[19];
        this.hashCode = new float[19];
        this.invokeSuspend = new double[19];
        Object[] objArr = new Object[19];
        this.invoke = objArr;
        objArr[13] = obj;
        objArr[14] = obj2;
        objArr[15] = obj3;
        this.toDoubleRange = 0;
        this.values = -1;
    }

    public TypeConverter(Object obj, Object obj2, Object obj3, int i) {
        int[] iArr = new int[19];
        this.FastBitmap$CoordinateSystem = iArr;
        this.toString = new long[19];
        this.hashCode = new float[19];
        this.invokeSuspend = new double[19];
        Object[] objArr = new Object[19];
        this.invoke = objArr;
        objArr[13] = obj;
        objArr[14] = obj2;
        objArr[15] = obj3;
        iArr[16] = i;
        this.toDoubleRange = 0;
        this.values = -1;
    }

    public TypeConverter(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5) {
        int[] iArr = new int[19];
        this.FastBitmap$CoordinateSystem = iArr;
        this.toString = new long[19];
        this.hashCode = new float[19];
        this.invokeSuspend = new double[19];
        Object[] objArr = new Object[19];
        this.invoke = objArr;
        objArr[13] = obj;
        objArr[14] = obj2;
        objArr[15] = obj3;
        iArr[16] = i;
        objArr[17] = obj4;
        objArr[18] = obj5;
        this.toDoubleRange = 0;
        this.values = -1;
    }

    public TypeConverter(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        int[] iArr = new int[19];
        this.FastBitmap$CoordinateSystem = iArr;
        this.toString = new long[19];
        this.hashCode = new float[19];
        this.invokeSuspend = new double[19];
        Object[] objArr = new Object[19];
        this.invoke = objArr;
        objArr[13] = obj;
        objArr[14] = obj2;
        objArr[15] = obj3;
        objArr[16] = obj4;
        iArr[17] = i;
        this.toDoubleRange = 0;
        this.values = -1;
    }

    public TypeConverter(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.FastBitmap$CoordinateSystem = new int[19];
        this.toString = new long[19];
        this.hashCode = new float[19];
        this.invokeSuspend = new double[19];
        Object[] objArr = new Object[19];
        this.invoke = objArr;
        objArr[13] = obj;
        objArr[14] = obj2;
        objArr[15] = obj3;
        objArr[16] = obj4;
        objArr[17] = obj5;
        this.toDoubleRange = 0;
        this.values = -1;
    }

    public int getMax(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.FastBitmap$CoordinateSystem;
                int i2 = this.toDoubleRange;
                this.toDoubleRange = i2 + 1;
                iArr[i2] = 7;
                return 0;
            case 2:
                int i3 = this.toDoubleRange - this.setMax;
                this.toDoubleRange = i3;
                this.values = i3;
                return 0;
            case 3:
                Object[] objArr = this.invoke;
                int i4 = this.values;
                this.values = i4 + 1;
                Object obj = objArr[i4];
                objArr[i4] = null;
                this.isInside = obj;
                return 0;
            case 4:
                Object[] objArr2 = this.invoke;
                int i5 = this.toDoubleRange;
                this.toDoubleRange = i5 + 1;
                objArr2[i5] = this.IsOverlapping;
                return 0;
            case 5:
                Object[] objArr3 = this.invoke;
                int i6 = this.toDoubleRange;
                this.toDoubleRange = i6 + 1;
                objArr3[i6] = objArr3[13];
                return 0;
            case 6:
                int[] iArr2 = this.FastBitmap$CoordinateSystem;
                int i7 = this.toDoubleRange;
                this.toDoubleRange = i7 + 1;
                iArr2[i7] = iArr2[15];
                return 0;
            case 7:
                int[] iArr3 = this.FastBitmap$CoordinateSystem;
                int i8 = this.values;
                this.values = i8 + 1;
                this.setMin = iArr3[i8];
                return 0;
            case 8:
                Object[] objArr4 = this.invoke;
                int i9 = this.toDoubleRange;
                Object obj2 = objArr4[i9 - 1];
                objArr4[i9 - 1] = null;
                this.isInside = obj2;
                return 0;
            case 9:
                int[] iArr4 = this.FastBitmap$CoordinateSystem;
                int i10 = this.toDoubleRange - 1;
                this.toDoubleRange = i10;
                this.setMin = iArr4[i10];
                return 0;
            case 10:
                int[] iArr5 = this.FastBitmap$CoordinateSystem;
                int i11 = this.toDoubleRange;
                this.toDoubleRange = i11 + 1;
                iArr5[i11] = 1;
                return 0;
            case 11:
                int[] iArr6 = this.FastBitmap$CoordinateSystem;
                int i12 = this.toDoubleRange;
                this.toDoubleRange = i12 + 1;
                iArr6[i12] = 0;
                return 0;
            case 12:
                Object[] objArr5 = this.invoke;
                int i13 = this.toDoubleRange;
                this.toDoubleRange = i13 + 1;
                objArr5[i13] = objArr5[14];
                return 0;
            case 13:
                Object[] objArr6 = this.invoke;
                int i14 = this.toDoubleRange;
                int i15 = i14 + 1;
                this.toDoubleRange = i15;
                objArr6[i14] = null;
                Object obj3 = objArr6[i15 - 1];
                objArr6[i15 - 1] = null;
                this.FastBitmap$CoordinateSystem[i15 - 1] = ((int[]) obj3).length;
                return 0;
            case 14:
                int i16 = this.toDoubleRange - 1;
                this.toDoubleRange = i16;
                this.invoke[i16] = null;
                return 0;
            case 15:
                break;
            case 16:
                int[] iArr7 = this.FastBitmap$CoordinateSystem;
                int i17 = this.toDoubleRange;
                this.toDoubleRange = i17 + 1;
                iArr7[i17] = 83;
                break;
            case 17:
                int[] iArr8 = this.FastBitmap$CoordinateSystem;
                int i18 = this.toDoubleRange;
                int i19 = i18 + 1;
                this.toDoubleRange = i19;
                iArr8[i18] = 0;
                int i20 = i19 - 1;
                this.toDoubleRange = i20;
                iArr8[i20 - 1] = iArr8[i20 - 1] / iArr8[i20];
                int i21 = i20 - 1;
                this.toDoubleRange = i21;
                this.invoke[i21] = null;
                return 0;
            case 18:
                int[] iArr9 = this.FastBitmap$CoordinateSystem;
                int i22 = this.toDoubleRange;
                this.toDoubleRange = i22 + 1;
                iArr9[i22] = this.setMax;
                return 0;
            case 19:
                int[] iArr10 = this.FastBitmap$CoordinateSystem;
                int i23 = this.toDoubleRange;
                this.toDoubleRange = i23 + 1;
                iArr10[i23] = 33;
                return 0;
            case 20:
                int[] iArr11 = this.FastBitmap$CoordinateSystem;
                int i24 = this.toDoubleRange;
                int i25 = i24 + 2;
                this.toDoubleRange = i25;
                iArr11[i25 - 1] = iArr11[i25 - 3];
                iArr11[i24] = iArr11[i25 - 4];
                int i26 = i25 - 1;
                this.toDoubleRange = i26;
                iArr11[i26 - 1] = iArr11[i26 - 1] & iArr11[i26];
                int i27 = i26 + 1;
                this.toDoubleRange = i27;
                int i28 = iArr11[i27 - 2];
                iArr11[i26] = i28;
                iArr11[i27 - 2] = iArr11[i27 - 3];
                iArr11[i27 - 3] = iArr11[i27 - 4];
                iArr11[i27 - 4] = i28;
                return 0;
            case 21:
                int[] iArr12 = this.FastBitmap$CoordinateSystem;
                int i29 = this.toDoubleRange;
                int i30 = i29 + 2;
                this.toDoubleRange = i30;
                iArr12[i30 - 1] = iArr12[i30 - 3];
                iArr12[i29] = iArr12[i30 - 4];
                return 0;
            case 22:
                int i31 = this.toDoubleRange - 1;
                this.toDoubleRange = i31;
                int[] iArr13 = this.FastBitmap$CoordinateSystem;
                iArr13[i31 - 1] = iArr13[i31] ^ iArr13[i31 - 1];
                return 0;
            case 23:
                int[] iArr14 = this.FastBitmap$CoordinateSystem;
                int i32 = this.toDoubleRange;
                int i33 = i32 + 1;
                this.toDoubleRange = i33;
                int i34 = iArr14[i33 - 2];
                iArr14[i32] = i34;
                iArr14[i33 - 2] = iArr14[i33 - 3];
                iArr14[i33 - 3] = iArr14[i33 - 4];
                iArr14[i33 - 4] = i34;
                int i35 = i33 - 1;
                this.toDoubleRange = i35;
                this.invoke[i35] = null;
                return 0;
            case 24:
                int i36 = this.toDoubleRange - 1;
                this.toDoubleRange = i36;
                int[] iArr15 = this.FastBitmap$CoordinateSystem;
                iArr15[i36 - 1] = iArr15[i36 - 1] & iArr15[i36];
                int i37 = i36 - 1;
                this.toDoubleRange = i37;
                iArr15[i37 - 1] = iArr15[i37] | iArr15[i37 - 1];
                return 0;
            case 25:
                int[] iArr16 = this.FastBitmap$CoordinateSystem;
                int i38 = this.toDoubleRange;
                iArr16[i38 - 1] = -iArr16[i38 - 1];
                int i39 = i38 + 2;
                this.toDoubleRange = i39;
                iArr16[i39 - 1] = iArr16[i39 - 3];
                iArr16[i38] = iArr16[i39 - 4];
                return 0;
            case 26:
                int[] iArr17 = this.FastBitmap$CoordinateSystem;
                int i40 = this.toDoubleRange;
                iArr17[i40 - 1] = -iArr17[i40 - 1];
                return 0;
            case 27:
                int i41 = this.toDoubleRange - 1;
                this.toDoubleRange = i41;
                int[] iArr18 = this.FastBitmap$CoordinateSystem;
                iArr18[i41 - 1] = iArr18[i41 - 1] ^ iArr18[i41];
                int i42 = i41 + 1;
                this.toDoubleRange = i42;
                int i43 = iArr18[i42 - 2];
                iArr18[i41] = i43;
                iArr18[i42 - 2] = iArr18[i42 - 3];
                iArr18[i42 - 3] = iArr18[i42 - 4];
                iArr18[i42 - 4] = i43;
                return 0;
            case 28:
                int[] iArr19 = this.FastBitmap$CoordinateSystem;
                int i44 = this.toDoubleRange;
                iArr19[i44 - 1] = -iArr19[i44 - 1];
                int i45 = i44 - 1;
                this.toDoubleRange = i45;
                iArr19[i45 - 1] = iArr19[i45] & iArr19[i45 - 1];
                return 0;
            case 29:
                int i46 = this.toDoubleRange - 1;
                this.toDoubleRange = i46;
                int[] iArr20 = this.FastBitmap$CoordinateSystem;
                iArr20[i46 - 1] = iArr20[i46 - 1] << iArr20[i46];
                int i47 = i46 - 1;
                this.toDoubleRange = i47;
                iArr20[i47 - 1] = iArr20[i47 - 1] + iArr20[i47];
                return 0;
            case 30:
                int[] iArr21 = this.FastBitmap$CoordinateSystem;
                int i48 = this.toDoubleRange;
                int i49 = i48 + 1;
                this.toDoubleRange = i49;
                iArr21[i48] = iArr21[i49 - 2];
                return 0;
            case 31:
                int[] iArr22 = this.FastBitmap$CoordinateSystem;
                int i50 = this.toDoubleRange;
                this.toDoubleRange = i50 + 1;
                iArr22[i50] = 128;
                return 0;
            case 32:
                int i51 = this.toDoubleRange - 1;
                this.toDoubleRange = i51;
                int[] iArr23 = this.FastBitmap$CoordinateSystem;
                iArr23[i51 - 1] = iArr23[i51 - 1] % iArr23[i51];
                return 0;
            case 33:
                int[] iArr24 = this.FastBitmap$CoordinateSystem;
                int i52 = this.toDoubleRange;
                int i53 = i52 + 1;
                this.toDoubleRange = i53;
                iArr24[i52] = 2;
                int i54 = i53 - 1;
                this.toDoubleRange = i54;
                iArr24[i54 - 1] = iArr24[i54 - 1] % iArr24[i54];
                return 0;
            case 34:
                int i55 = this.toDoubleRange - 1;
                this.toDoubleRange = i55;
                this.setMin = this.FastBitmap$CoordinateSystem[i55] == 0 ? 1 : 0;
                return 0;
            case 35:
                int[] iArr25 = this.FastBitmap$CoordinateSystem;
                int i56 = this.toDoubleRange;
                this.toDoubleRange = i56 + 1;
                iArr25[i56] = 97;
                return 0;
            case 36:
                int[] iArr26 = this.FastBitmap$CoordinateSystem;
                int i57 = this.toDoubleRange;
                this.toDoubleRange = i57 + 1;
                iArr26[i57] = 85;
                return 0;
            case 37:
                int[] iArr27 = this.FastBitmap$CoordinateSystem;
                int i58 = this.toDoubleRange;
                iArr27[i58 - 1] = -iArr27[i58 - 1];
                int i59 = i58 - 1;
                this.toDoubleRange = i59;
                iArr27[i59 - 1] = iArr27[i59] ^ iArr27[i59 - 1];
                return 0;
            case 38:
                int[] iArr28 = this.FastBitmap$CoordinateSystem;
                int i60 = this.toDoubleRange;
                int i61 = i60 + 1;
                this.toDoubleRange = i61;
                int i62 = iArr28[i61 - 2];
                iArr28[i60] = i62;
                iArr28[i61 - 2] = iArr28[i61 - 3];
                iArr28[i61 - 3] = iArr28[i61 - 4];
                iArr28[i61 - 4] = i62;
                int i63 = i61 - 1;
                this.toDoubleRange = i63;
                this.invoke[i63] = null;
                iArr28[i63 - 1] = -iArr28[i63 - 1];
                return 0;
            case 39:
                int[] iArr29 = this.FastBitmap$CoordinateSystem;
                int i64 = this.toDoubleRange;
                int i65 = i64 + 1;
                this.toDoubleRange = i65;
                iArr29[i64] = -1;
                int i66 = i65 - 1;
                this.toDoubleRange = i66;
                iArr29[i66 - 1] = iArr29[i66] ^ iArr29[i66 - 1];
                return 0;
            case 40:
                int i67 = this.toDoubleRange - 1;
                this.toDoubleRange = i67;
                int[] iArr30 = this.FastBitmap$CoordinateSystem;
                iArr30[i67 - 1] = iArr30[i67 - 1] ^ iArr30[i67];
                int i68 = i67 - 1;
                this.toDoubleRange = i68;
                this.invoke[i68] = null;
                return 0;
            case 41:
                int i69 = this.toDoubleRange - 1;
                this.toDoubleRange = i69;
                int[] iArr31 = this.FastBitmap$CoordinateSystem;
                iArr31[i69 - 1] = iArr31[i69] & iArr31[i69 - 1];
                return 0;
            case 42:
                int i70 = this.toDoubleRange - 1;
                this.toDoubleRange = i70;
                int[] iArr32 = this.FastBitmap$CoordinateSystem;
                iArr32[i70 - 1] = iArr32[i70 - 1] << iArr32[i70];
                return 0;
            case 43:
                int[] iArr33 = this.FastBitmap$CoordinateSystem;
                int i71 = this.toDoubleRange;
                iArr33[i71 - 1] = -iArr33[i71 - 1];
                int i72 = i71 + 2;
                this.toDoubleRange = i72;
                iArr33[i72 - 1] = iArr33[i72 - 3];
                iArr33[i71] = iArr33[i72 - 4];
                iArr33[i72 - 1] = -iArr33[i72 - 1];
                return 0;
            case 44:
                int i73 = this.toDoubleRange - 1;
                this.toDoubleRange = i73;
                int[] iArr34 = this.FastBitmap$CoordinateSystem;
                iArr34[i73 - 1] = iArr34[i73] | iArr34[i73 - 1];
                return 0;
            case 45:
                int i74 = this.toDoubleRange - 1;
                this.toDoubleRange = i74;
                int[] iArr35 = this.FastBitmap$CoordinateSystem;
                iArr35[i74 - 1] = iArr35[i74 - 1] ^ iArr35[i74];
                int i75 = i74 - 1;
                this.toDoubleRange = i75;
                iArr35[i75 - 1] = iArr35[i75 - 1] - iArr35[i75];
                return 0;
            case 46:
                int[] iArr36 = this.FastBitmap$CoordinateSystem;
                int i76 = this.toDoubleRange;
                int i77 = i76 + 1;
                this.toDoubleRange = i77;
                iArr36[i76] = iArr36[i77 - 2];
                this.toDoubleRange = i77 + 1;
                iArr36[i77] = 128;
                return 0;
            case 47:
                int i78 = this.toDoubleRange - 1;
                this.toDoubleRange = i78;
                this.setMin = this.FastBitmap$CoordinateSystem[i78] != 0 ? 1 : 0;
                return 0;
            case 48:
                int[] iArr37 = this.FastBitmap$CoordinateSystem;
                int i79 = this.toDoubleRange;
                this.toDoubleRange = i79 + 1;
                iArr37[i79] = 2;
                return 0;
            case 49:
                for (int i80 = this.toDoubleRange - 1; i80 >= 0; i80--) {
                    this.invoke[i80] = null;
                }
                this.toDoubleRange = 0;
                Object[] objArr7 = this.invoke;
                this.toDoubleRange = 0 + 1;
                objArr7[0] = this.IsOverlapping;
                return 0;
            case 50:
                Object[] objArr8 = this.invoke;
                int i81 = this.toDoubleRange;
                this.toDoubleRange = i81 + 1;
                objArr8[i81] = objArr8[15];
                return 0;
            case 51:
                int[] iArr38 = this.FastBitmap$CoordinateSystem;
                int i82 = this.toDoubleRange;
                int i83 = i82 + 1;
                this.toDoubleRange = i83;
                iArr38[i82] = 2;
                this.toDoubleRange = i83 + 1;
                iArr38[i83] = 2;
                return 0;
            case 52:
                int[] iArr39 = this.FastBitmap$CoordinateSystem;
                int i84 = this.toDoubleRange;
                this.toDoubleRange = i84 + 1;
                iArr39[i84] = 46;
                return 0;
            case 53:
                int[] iArr40 = this.FastBitmap$CoordinateSystem;
                int i85 = this.toDoubleRange;
                int i86 = i85 + 1;
                this.toDoubleRange = i86;
                iArr40[i85] = 45;
                iArr40[i86 - 1] = -iArr40[i86 - 1];
                int i87 = i86 + 1;
                this.toDoubleRange = i87;
                iArr40[i86] = iArr40[i87 - 2];
                return 0;
            case 54:
                int[] iArr41 = this.FastBitmap$CoordinateSystem;
                int i88 = this.toDoubleRange;
                this.toDoubleRange = i88 + 1;
                iArr41[i88] = -1;
                return 0;
            case 55:
                int[] iArr42 = this.FastBitmap$CoordinateSystem;
                int i89 = this.toDoubleRange;
                int i90 = i89 + 2;
                this.toDoubleRange = i90;
                iArr42[i90 - 1] = iArr42[i90 - 3];
                iArr42[i89] = iArr42[i90 - 4];
                int i91 = i90 - 1;
                this.toDoubleRange = i91;
                iArr42[i91 - 1] = iArr42[i91 - 1] & iArr42[i91];
                this.toDoubleRange = i91 + 1;
                iArr42[i91] = -1;
                return 0;
            case 56:
                int[] iArr43 = this.FastBitmap$CoordinateSystem;
                int i92 = this.toDoubleRange;
                int i93 = i92 + 1;
                this.toDoubleRange = i93;
                int i94 = iArr43[i93 - 2];
                iArr43[i92] = i94;
                iArr43[i93 - 2] = iArr43[i93 - 3];
                iArr43[i93 - 3] = iArr43[i93 - 4];
                iArr43[i93 - 4] = i94;
                int i95 = i93 - 1;
                this.toDoubleRange = i95;
                this.invoke[i95] = null;
                int i96 = i95 - 1;
                this.toDoubleRange = i96;
                iArr43[i96 - 1] = iArr43[i96] | iArr43[i96 - 1];
                return 0;
            case 57:
                int[] iArr44 = this.FastBitmap$CoordinateSystem;
                int i97 = this.toDoubleRange;
                int i98 = iArr44[i97 - 1];
                iArr44[i97 - 1] = iArr44[i97 - 2];
                iArr44[i97 - 2] = i98;
                int i99 = i97 - 1;
                this.toDoubleRange = i99;
                this.invoke[i99] = null;
                iArr44[i99 - 1] = -iArr44[i99 - 1];
                return 0;
            case 58:
                int[] iArr45 = this.FastBitmap$CoordinateSystem;
                int i100 = this.toDoubleRange;
                int i101 = i100 + 1;
                this.toDoubleRange = i101;
                iArr45[i100] = -1;
                int i102 = i101 - 1;
                this.toDoubleRange = i102;
                iArr45[i102 - 1] = iArr45[i102 - 1] ^ iArr45[i102];
                int i103 = iArr45[i102 - 1];
                iArr45[i102 - 1] = iArr45[i102 - 2];
                iArr45[i102 - 2] = i103;
                return 0;
            case 59:
                int i104 = this.toDoubleRange - 1;
                this.toDoubleRange = i104;
                int[] iArr46 = this.FastBitmap$CoordinateSystem;
                iArr46[i104 - 1] = iArr46[i104 - 1] - iArr46[i104];
                return 0;
            case 60:
                int[] iArr47 = this.FastBitmap$CoordinateSystem;
                int i105 = this.toDoubleRange;
                int i106 = i105 + 1;
                this.toDoubleRange = i106;
                iArr47[i105] = 1;
                int i107 = i106 - 1;
                this.toDoubleRange = i107;
                iArr47[i107 - 1] = iArr47[i107 - 1] << iArr47[i107];
                int i108 = i107 + 1;
                this.toDoubleRange = i108;
                int i109 = iArr47[i108 - 2];
                iArr47[i107] = i109;
                iArr47[i108 - 2] = iArr47[i108 - 3];
                iArr47[i108 - 3] = iArr47[i108 - 4];
                iArr47[i108 - 4] = i109;
                return 0;
            case 61:
                int i110 = this.toDoubleRange - 1;
                this.toDoubleRange = i110;
                this.invoke[i110] = null;
                int i111 = i110 - 1;
                this.toDoubleRange = i111;
                int[] iArr48 = this.FastBitmap$CoordinateSystem;
                iArr48[i111 - 1] = iArr48[i111] ^ iArr48[i111 - 1];
                return 0;
            case 62:
                int i112 = this.toDoubleRange - 1;
                this.toDoubleRange = i112;
                int[] iArr49 = this.FastBitmap$CoordinateSystem;
                iArr49[i112 - 1] = iArr49[i112 - 1] - iArr49[i112];
                int i113 = i112 + 1;
                this.toDoubleRange = i113;
                iArr49[i112] = iArr49[i113 - 2];
                return 0;
            case 63:
                int[] iArr50 = this.FastBitmap$CoordinateSystem;
                int i114 = this.toDoubleRange;
                this.toDoubleRange = i114 + 1;
                iArr50[i114] = 43;
                return 0;
            case 64:
                int i115 = this.toDoubleRange - 1;
                this.toDoubleRange = i115;
                this.invoke[i115] = null;
                int i116 = i115 - 1;
                this.toDoubleRange = i116;
                int[] iArr51 = this.FastBitmap$CoordinateSystem;
                iArr51[i116 - 1] = iArr51[i116] & iArr51[i116 - 1];
                return 0;
            case 65:
                int i117 = this.toDoubleRange - 1;
                this.toDoubleRange = i117;
                int[] iArr52 = this.FastBitmap$CoordinateSystem;
                iArr52[i117 - 1] = iArr52[i117 - 1] << iArr52[i117];
                int i118 = i117 - 1;
                this.toDoubleRange = i118;
                iArr52[i118 - 1] = iArr52[i118 - 1] + iArr52[i118];
                int i119 = i118 + 1;
                this.toDoubleRange = i119;
                iArr52[i118] = iArr52[i119 - 2];
                return 0;
            case 66:
                int[] iArr53 = this.FastBitmap$CoordinateSystem;
                int i120 = this.toDoubleRange;
                this.toDoubleRange = i120 + 1;
                iArr53[i120] = 21;
                return 0;
            case 67:
                int[] iArr54 = this.FastBitmap$CoordinateSystem;
                int i121 = this.toDoubleRange;
                this.toDoubleRange = i121 + 1;
                iArr54[i121] = 0;
                return 0;
            case 68:
                int i122 = this.toDoubleRange - 1;
                this.toDoubleRange = i122;
                int[] iArr55 = this.FastBitmap$CoordinateSystem;
                iArr55[i122 - 1] = iArr55[i122 - 1] / iArr55[i122];
                return 0;
            case 69:
                Object[] objArr9 = this.invoke;
                int i123 = this.toDoubleRange;
                int i124 = i123 + 1;
                this.toDoubleRange = i124;
                objArr9[i123] = objArr9[14];
                this.toDoubleRange = i124 + 1;
                objArr9[i124] = objArr9[15];
                return 0;
            case 70:
                int[] iArr56 = this.FastBitmap$CoordinateSystem;
                int i125 = this.toDoubleRange;
                this.toDoubleRange = i125 + 1;
                iArr56[i125] = iArr56[16];
                return 0;
            case 71:
                int[] iArr57 = this.FastBitmap$CoordinateSystem;
                int i126 = this.toDoubleRange;
                int i127 = i126 + 1;
                this.toDoubleRange = i127;
                iArr57[i126] = 30;
                int i128 = i127 + 1;
                this.toDoubleRange = i128;
                iArr57[i127] = 0;
                int i129 = i128 - 1;
                this.toDoubleRange = i129;
                iArr57[i129 - 1] = iArr57[i129 - 1] / iArr57[i129];
                return 0;
            case 72:
                int[] iArr58 = this.FastBitmap$CoordinateSystem;
                int i130 = this.toDoubleRange;
                this.toDoubleRange = i130 + 1;
                iArr58[i130] = 69;
                return 0;
            case 73:
                int[] iArr59 = this.FastBitmap$CoordinateSystem;
                int i131 = this.toDoubleRange;
                int i132 = i131 + 1;
                this.toDoubleRange = i132;
                iArr59[i131] = 49;
                iArr59[i132 - 1] = -iArr59[i132 - 1];
                int i133 = i132 + 1;
                this.toDoubleRange = i133;
                iArr59[i132] = iArr59[i133 - 2];
                return 0;
            case 74:
                int[] iArr60 = this.FastBitmap$CoordinateSystem;
                int i134 = this.toDoubleRange;
                iArr60[i134 - 1] = -iArr60[i134 - 1];
                this.toDoubleRange = i134 + 1;
                iArr60[i134] = -1;
                return 0;
            case 75:
                int[] iArr61 = this.FastBitmap$CoordinateSystem;
                int i135 = this.toDoubleRange;
                int i136 = i135 + 2;
                this.toDoubleRange = i136;
                iArr61[i136 - 1] = iArr61[i136 - 3];
                iArr61[i135] = iArr61[i136 - 4];
                this.toDoubleRange = i136 + 1;
                iArr61[i136] = -1;
                return 0;
            case 76:
                int i137 = this.toDoubleRange - 1;
                this.toDoubleRange = i137;
                int[] iArr62 = this.FastBitmap$CoordinateSystem;
                iArr62[i137 - 1] = iArr62[i137 - 1] ^ iArr62[i137];
                int i138 = i137 - 1;
                this.toDoubleRange = i138;
                iArr62[i138 - 1] = iArr62[i138] & iArr62[i138 - 1];
                return 0;
            case 77:
                int[] iArr63 = this.FastBitmap$CoordinateSystem;
                int i139 = this.toDoubleRange;
                int i140 = i139 + 1;
                this.toDoubleRange = i140;
                int i141 = iArr63[i140 - 2];
                iArr63[i139] = i141;
                iArr63[i140 - 2] = iArr63[i140 - 3];
                iArr63[i140 - 3] = iArr63[i140 - 4];
                iArr63[i140 - 4] = i141;
                return 0;
            case 78:
                int[] iArr64 = this.FastBitmap$CoordinateSystem;
                int i142 = this.toDoubleRange;
                int i143 = iArr64[i142 - 1];
                iArr64[i142 - 1] = iArr64[i142 - 2];
                iArr64[i142 - 2] = i143;
                this.toDoubleRange = i142 + 1;
                iArr64[i142] = -1;
                return 0;
            case 79:
                int[] iArr65 = this.FastBitmap$CoordinateSystem;
                int i144 = this.toDoubleRange;
                int i145 = iArr65[i144 - 1];
                iArr65[i144 - 1] = iArr65[i144 - 2];
                iArr65[i144 - 2] = i145;
                return 0;
            case 80:
                int i146 = this.toDoubleRange - 1;
                this.toDoubleRange = i146;
                this.invoke[i146] = null;
                int[] iArr66 = this.FastBitmap$CoordinateSystem;
                iArr66[i146 - 1] = -iArr66[i146 - 1];
                return 0;
            case 81:
                int i147 = this.toDoubleRange - 1;
                this.toDoubleRange = i147;
                int[] iArr67 = this.FastBitmap$CoordinateSystem;
                iArr67[i147 - 1] = iArr67[i147 - 1] ^ iArr67[i147];
                int i148 = i147 + 1;
                this.toDoubleRange = i148;
                int i149 = iArr67[i148 - 2];
                iArr67[i147] = i149;
                iArr67[i148 - 2] = iArr67[i148 - 3];
                iArr67[i148 - 3] = iArr67[i148 - 4];
                iArr67[i148 - 4] = i149;
                int i150 = i148 - 1;
                this.toDoubleRange = i150;
                this.invoke[i150] = null;
                return 0;
            case 82:
                int i151 = this.toDoubleRange - 1;
                this.toDoubleRange = i151;
                int[] iArr68 = this.FastBitmap$CoordinateSystem;
                iArr68[i151 - 1] = iArr68[i151 - 1] & iArr68[i151];
                int i152 = i151 + 1;
                this.toDoubleRange = i152;
                iArr68[i151] = 1;
                int i153 = i152 - 1;
                this.toDoubleRange = i153;
                iArr68[i153 - 1] = iArr68[i153 - 1] << iArr68[i153];
                return 0;
            case 83:
                int i154 = this.toDoubleRange - 1;
                this.toDoubleRange = i154;
                int[] iArr69 = this.FastBitmap$CoordinateSystem;
                iArr69[i154 - 1] = iArr69[i154 - 1] + iArr69[i154];
                int i155 = i154 + 1;
                this.toDoubleRange = i155;
                iArr69[i154] = 1;
                int i156 = i155 + 2;
                this.toDoubleRange = i156;
                iArr69[i156 - 1] = iArr69[i156 - 3];
                iArr69[i155] = iArr69[i156 - 4];
                return 0;
            case 84:
                int i157 = this.toDoubleRange - 1;
                this.toDoubleRange = i157;
                int[] iArr70 = this.FastBitmap$CoordinateSystem;
                iArr70[i157 - 1] = iArr70[i157 - 1] | iArr70[i157];
                this.toDoubleRange = i157 + 1;
                iArr70[i157] = 1;
                return 0;
            case 85:
                int i158 = this.toDoubleRange - 1;
                this.toDoubleRange = i158;
                int[] iArr71 = this.FastBitmap$CoordinateSystem;
                iArr71[i158 - 1] = iArr71[i158 - 1] << iArr71[i158];
                int i159 = i158 + 1;
                this.toDoubleRange = i159;
                int i160 = iArr71[i159 - 2];
                iArr71[i158] = i160;
                iArr71[i159 - 2] = iArr71[i159 - 3];
                iArr71[i159 - 3] = iArr71[i159 - 4];
                iArr71[i159 - 4] = i160;
                int i161 = i159 - 1;
                this.toDoubleRange = i161;
                this.invoke[i161] = null;
                return 0;
            case 86:
                int[] iArr72 = this.FastBitmap$CoordinateSystem;
                int i162 = this.toDoubleRange;
                int i163 = i162 + 1;
                this.toDoubleRange = i163;
                iArr72[i162] = 128;
                int i164 = i163 - 1;
                this.toDoubleRange = i164;
                iArr72[i164 - 1] = iArr72[i164 - 1] % iArr72[i164];
                return 0;
            case 87:
                int[] iArr73 = this.FastBitmap$CoordinateSystem;
                int i165 = this.toDoubleRange;
                int i166 = i165 + 1;
                this.toDoubleRange = i166;
                iArr73[i165] = 2;
                int i167 = i166 + 1;
                this.toDoubleRange = i167;
                iArr73[i166] = 2;
                int i168 = i167 - 1;
                this.toDoubleRange = i168;
                iArr73[i168 - 1] = iArr73[i168 - 1] % iArr73[i168];
                return 0;
            case 88:
                int[] iArr74 = this.FastBitmap$CoordinateSystem;
                int i169 = this.toDoubleRange;
                int i170 = i169 + 1;
                this.toDoubleRange = i170;
                iArr74[i169] = 121;
                iArr74[i170 - 1] = -iArr74[i170 - 1];
                int i171 = i170 + 2;
                this.toDoubleRange = i171;
                iArr74[i171 - 1] = iArr74[i171 - 3];
                iArr74[i170] = iArr74[i171 - 4];
                return 0;
            case 89:
                int[] iArr75 = this.FastBitmap$CoordinateSystem;
                int i172 = this.toDoubleRange;
                iArr75[i172 - 1] = -iArr75[i172 - 1];
                int i173 = i172 + 2;
                this.toDoubleRange = i173;
                iArr75[i173 - 1] = iArr75[i173 - 3];
                iArr75[i172] = iArr75[i173 - 4];
                this.toDoubleRange = i173 + 1;
                iArr75[i173] = -1;
                return 0;
            case 90:
                int i174 = this.toDoubleRange - 1;
                this.toDoubleRange = i174;
                int[] iArr76 = this.FastBitmap$CoordinateSystem;
                iArr76[i174 - 1] = iArr76[i174 - 1] & iArr76[i174];
                int i175 = i174 + 1;
                this.toDoubleRange = i175;
                int i176 = iArr76[i175 - 2];
                iArr76[i174] = i176;
                iArr76[i175 - 2] = iArr76[i175 - 3];
                iArr76[i175 - 3] = iArr76[i175 - 4];
                iArr76[i175 - 4] = i176;
                return 0;
            case 91:
                int i177 = this.toDoubleRange - 1;
                this.toDoubleRange = i177;
                this.invoke[i177] = null;
                int[] iArr77 = this.FastBitmap$CoordinateSystem;
                int i178 = iArr77[i177 - 1];
                iArr77[i177 - 1] = iArr77[i177 - 2];
                iArr77[i177 - 2] = i178;
                this.toDoubleRange = i177 + 1;
                iArr77[i177] = -1;
                return 0;
            case 92:
                int[] iArr78 = this.FastBitmap$CoordinateSystem;
                int i179 = this.toDoubleRange;
                iArr78[i179 - 1] = -iArr78[i179 - 1];
                int i180 = i179 + 2;
                this.toDoubleRange = i180;
                iArr78[i180 - 1] = iArr78[i180 - 3];
                iArr78[i179] = iArr78[i180 - 4];
                int i181 = i180 - 1;
                this.toDoubleRange = i181;
                iArr78[i181 - 1] = iArr78[i181] | iArr78[i181 - 1];
                return 0;
            case 93:
                int[] iArr79 = this.FastBitmap$CoordinateSystem;
                int i182 = this.toDoubleRange;
                int i183 = i182 + 1;
                this.toDoubleRange = i183;
                iArr79[i182] = 1;
                int i184 = i183 - 1;
                this.toDoubleRange = i184;
                iArr79[i184 - 1] = iArr79[i184 - 1] << iArr79[i184];
                return 0;
            case 94:
                int[] iArr80 = this.FastBitmap$CoordinateSystem;
                int i185 = this.toDoubleRange;
                int i186 = i185 + 1;
                this.toDoubleRange = i186;
                iArr80[i185] = iArr80[i186 - 2];
                int i187 = i186 + 1;
                this.toDoubleRange = i187;
                iArr80[i186] = 128;
                int i188 = i187 - 1;
                this.toDoubleRange = i188;
                iArr80[i188 - 1] = iArr80[i188 - 1] % iArr80[i188];
                return 0;
            case 95:
                Object[] objArr10 = this.invoke;
                int i189 = this.toDoubleRange;
                int i190 = i189 + 1;
                this.toDoubleRange = i190;
                objArr10[i189] = objArr10[13];
                int[] iArr81 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i190 + 1;
                iArr81[i190] = iArr81[16];
                return 0;
            case 96:
                Object[] objArr11 = this.invoke;
                int i191 = this.toDoubleRange;
                int i192 = i191 + 1;
                this.toDoubleRange = i192;
                objArr11[i191] = null;
                Object obj4 = objArr11[i192 - 1];
                objArr11[i192 - 1] = null;
                this.FastBitmap$CoordinateSystem[i192 - 1] = ((int[]) obj4).length;
                int i193 = i192 - 1;
                this.toDoubleRange = i193;
                objArr11[i193] = null;
                return 0;
            case 97:
                int[] iArr82 = this.FastBitmap$CoordinateSystem;
                int i194 = this.toDoubleRange;
                this.toDoubleRange = i194 + 1;
                iArr82[i194] = 3;
                return 0;
            case 98:
                int[] iArr83 = this.FastBitmap$CoordinateSystem;
                int i195 = this.toDoubleRange;
                int i196 = i195 + 1;
                this.toDoubleRange = i196;
                iArr83[i195] = 1;
                iArr83[i196 - 1] = -iArr83[i196 - 1];
                int i197 = i196 + 2;
                this.toDoubleRange = i197;
                iArr83[i197 - 1] = iArr83[i197 - 3];
                iArr83[i196] = iArr83[i197 - 4];
                return 0;
            case 99:
                int i198 = this.toDoubleRange - 1;
                this.toDoubleRange = i198;
                int[] iArr84 = this.FastBitmap$CoordinateSystem;
                iArr84[i198 - 1] = iArr84[i198 - 1] & iArr84[i198];
                this.toDoubleRange = i198 + 1;
                iArr84[i198] = 1;
                return 0;
            case 100:
                int i199 = this.toDoubleRange - 1;
                this.toDoubleRange = i199;
                int[] iArr85 = this.FastBitmap$CoordinateSystem;
                iArr85[i199 - 1] = iArr85[i199 - 1] + iArr85[i199];
                return 0;
            case 101:
                int[] iArr86 = this.FastBitmap$CoordinateSystem;
                int i200 = this.toDoubleRange;
                int i201 = i200 + 1;
                this.toDoubleRange = i201;
                iArr86[i200] = 90;
                int i202 = i201 + 1;
                this.toDoubleRange = i202;
                iArr86[i201] = 0;
                int i203 = i202 - 1;
                this.toDoubleRange = i203;
                iArr86[i203 - 1] = iArr86[i203 - 1] / iArr86[i203];
                return 0;
            case 102:
                int[] iArr87 = this.FastBitmap$CoordinateSystem;
                int i204 = this.toDoubleRange;
                this.toDoubleRange = i204 + 1;
                iArr87[i204] = 63;
                return 0;
            case 103:
                int i205 = this.toDoubleRange - 1;
                this.toDoubleRange = i205;
                int[] iArr88 = this.FastBitmap$CoordinateSystem;
                iArr88[i205 - 1] = iArr88[i205 - 1] ^ iArr88[i205];
                int i206 = i205 - 1;
                this.toDoubleRange = i206;
                this.invoke[i206] = null;
                int i207 = i206 - 1;
                this.toDoubleRange = i207;
                iArr88[i207 - 1] = iArr88[i207] & iArr88[i207 - 1];
                return 0;
            case 104:
                int[] iArr89 = this.FastBitmap$CoordinateSystem;
                int i208 = this.toDoubleRange;
                int i209 = i208 + 1;
                this.toDoubleRange = i209;
                int i210 = iArr89[i209 - 2];
                iArr89[i208] = i210;
                iArr89[i209 - 2] = iArr89[i209 - 3];
                iArr89[i209 - 3] = iArr89[i209 - 4];
                iArr89[i209 - 4] = i210;
                int i211 = i209 - 1;
                this.toDoubleRange = i211;
                this.invoke[i211] = null;
                int i212 = i211 + 2;
                this.toDoubleRange = i212;
                iArr89[i212 - 1] = iArr89[i212 - 3];
                iArr89[i211] = iArr89[i212 - 4];
                return 0;
            case 105:
                int[] iArr90 = this.FastBitmap$CoordinateSystem;
                int i213 = this.toDoubleRange;
                int i214 = i213 + 2;
                this.toDoubleRange = i214;
                iArr90[i214 - 1] = iArr90[i214 - 3];
                iArr90[i213] = iArr90[i214 - 4];
                int i215 = i214 - 1;
                this.toDoubleRange = i215;
                iArr90[i215 - 1] = iArr90[i215 - 1] ^ iArr90[i215];
                int i216 = i215 + 1;
                this.toDoubleRange = i216;
                int i217 = iArr90[i216 - 2];
                iArr90[i215] = i217;
                iArr90[i216 - 2] = iArr90[i216 - 3];
                iArr90[i216 - 3] = iArr90[i216 - 4];
                iArr90[i216 - 4] = i217;
                return 0;
            case 106:
                int i218 = this.toDoubleRange - 1;
                this.toDoubleRange = i218;
                int[] iArr91 = this.FastBitmap$CoordinateSystem;
                iArr91[i218 - 1] = iArr91[i218 - 1] + iArr91[i218];
                int i219 = i218 + 1;
                this.toDoubleRange = i219;
                iArr91[i218] = iArr91[i219 - 2];
                return 0;
            case 107:
                int[] iArr92 = this.FastBitmap$CoordinateSystem;
                int i220 = this.toDoubleRange;
                this.toDoubleRange = i220 + 1;
                iArr92[i220] = 64;
                return 0;
            case 108:
                int[] iArr93 = this.FastBitmap$CoordinateSystem;
                int i221 = this.toDoubleRange;
                int i222 = i221 + 1;
                this.toDoubleRange = i222;
                iArr93[i221] = 77;
                int i223 = i222 + 1;
                this.toDoubleRange = i223;
                iArr93[i222] = 0;
                int i224 = i223 - 1;
                this.toDoubleRange = i224;
                iArr93[i224 - 1] = iArr93[i224 - 1] / iArr93[i224];
                return 0;
            case 109:
                Object[] objArr12 = this.invoke;
                int i225 = this.toDoubleRange;
                this.toDoubleRange = i225 + 1;
                objArr12[i225] = objArr12[17];
                return 0;
            case 110:
                Object[] objArr13 = this.invoke;
                int i226 = this.toDoubleRange;
                this.toDoubleRange = i226 + 1;
                objArr13[i226] = objArr13[18];
                return 0;
            case 111:
                int[] iArr94 = this.FastBitmap$CoordinateSystem;
                int i227 = this.toDoubleRange;
                this.toDoubleRange = i227 + 1;
                iArr94[i227] = 89;
                return 0;
            case 112:
                int[] iArr95 = this.FastBitmap$CoordinateSystem;
                int i228 = this.toDoubleRange;
                this.toDoubleRange = i228 + 1;
                iArr95[i228] = 41;
                return 0;
            case 113:
                int[] iArr96 = this.FastBitmap$CoordinateSystem;
                int i229 = this.toDoubleRange;
                this.toDoubleRange = i229 + 1;
                iArr96[i229] = 8;
                return 0;
            case 114:
                Object[] objArr14 = this.invoke;
                int i230 = this.toDoubleRange;
                this.toDoubleRange = i230 + 1;
                objArr14[i230] = objArr14[16];
                return 0;
            case 115:
                int[] iArr97 = this.FastBitmap$CoordinateSystem;
                int i231 = this.toDoubleRange;
                int i232 = i231 + 1;
                this.toDoubleRange = i232;
                iArr97[i231] = 63;
                int i233 = i232 + 1;
                this.toDoubleRange = i233;
                iArr97[i232] = 0;
                int i234 = i233 - 1;
                this.toDoubleRange = i234;
                iArr97[i234 - 1] = iArr97[i234 - 1] / iArr97[i234];
                return 0;
            case 116:
                int[] iArr98 = this.FastBitmap$CoordinateSystem;
                int i235 = this.toDoubleRange;
                this.toDoubleRange = i235 + 1;
                iArr98[i235] = 55;
                return 0;
            case 117:
                int[] iArr99 = this.FastBitmap$CoordinateSystem;
                int i236 = this.toDoubleRange;
                this.toDoubleRange = i236 + 1;
                iArr99[i236] = 5;
                return 0;
            case 118:
                int i237 = this.toDoubleRange - 1;
                this.toDoubleRange = i237;
                int[] iArr100 = this.FastBitmap$CoordinateSystem;
                iArr100[i237 - 1] = iArr100[i237 - 1] | iArr100[i237];
                int i238 = i237 - 1;
                this.toDoubleRange = i238;
                iArr100[i238 - 1] = iArr100[i238 - 1] & iArr100[i238];
                int i239 = iArr100[i238 - 1];
                iArr100[i238 - 1] = iArr100[i238 - 2];
                iArr100[i238 - 2] = i239;
                return 0;
            case 119:
                int i240 = this.toDoubleRange - 1;
                this.toDoubleRange = i240;
                int[] iArr101 = this.FastBitmap$CoordinateSystem;
                iArr101[i240 - 1] = iArr101[i240 - 1] + iArr101[i240];
                int i241 = i240 + 1;
                this.toDoubleRange = i241;
                iArr101[i240] = 1;
                int i242 = i241 + 1;
                this.toDoubleRange = i242;
                iArr101[i241] = iArr101[i242 - 2];
                return 0;
            case 120:
                int[] iArr102 = this.FastBitmap$CoordinateSystem;
                int i243 = this.toDoubleRange;
                iArr102[i243 - 1] = -iArr102[i243 - 1];
                int i244 = i243 + 1;
                this.toDoubleRange = i244;
                iArr102[i243] = -1;
                int i245 = i244 - 1;
                this.toDoubleRange = i245;
                iArr102[i245 - 1] = iArr102[i245] ^ iArr102[i245 - 1];
                return 0;
            case 121:
                int[] iArr103 = this.FastBitmap$CoordinateSystem;
                int i246 = this.toDoubleRange;
                int i247 = iArr103[i246 - 1];
                iArr103[i246 - 1] = iArr103[i246 - 2];
                iArr103[i246 - 2] = i247;
                int i248 = i246 - 1;
                this.toDoubleRange = i248;
                this.invoke[i248] = null;
                return 0;
            case 122:
                int i249 = this.toDoubleRange - 1;
                this.toDoubleRange = i249;
                int[] iArr104 = this.FastBitmap$CoordinateSystem;
                iArr104[i249 - 1] = iArr104[i249 - 1] - iArr104[i249];
                this.toDoubleRange = i249 + 1;
                iArr104[i249] = 1;
                return 0;
            case 123:
                Object[] objArr15 = this.invoke;
                int i250 = this.toDoubleRange;
                this.toDoubleRange = i250 + 1;
                objArr15[i250] = null;
                return 0;
            case 124:
                int[] iArr105 = this.FastBitmap$CoordinateSystem;
                int i251 = this.toDoubleRange;
                this.toDoubleRange = i251 + 1;
                iArr105[i251] = 72;
                return 0;
            case 125:
                int[] iArr106 = this.FastBitmap$CoordinateSystem;
                int i252 = this.toDoubleRange;
                int i253 = i252 + 1;
                this.toDoubleRange = i253;
                iArr106[i252] = 82;
                int i254 = i253 + 1;
                this.toDoubleRange = i254;
                iArr106[i253] = 0;
                int i255 = i254 - 1;
                this.toDoubleRange = i255;
                iArr106[i255 - 1] = iArr106[i255 - 1] / iArr106[i255];
                return 0;
            case 126:
                Object[] objArr16 = this.invoke;
                int i256 = this.toDoubleRange;
                int i257 = i256 + 1;
                this.toDoubleRange = i257;
                objArr16[i256] = objArr16[16];
                this.toDoubleRange = i257 + 1;
                objArr16[i257] = objArr16[17];
                return 0;
            case 127:
                int[] iArr107 = this.FastBitmap$CoordinateSystem;
                int i258 = this.toDoubleRange;
                int i259 = i258 + 1;
                this.toDoubleRange = i259;
                iArr107[i258] = 51;
                int i260 = i259 + 1;
                this.toDoubleRange = i260;
                iArr107[i259] = iArr107[i260 - 2];
                return 0;
            case 128:
                int i261 = this.toDoubleRange - 1;
                this.toDoubleRange = i261;
                int[] iArr108 = this.FastBitmap$CoordinateSystem;
                iArr108[i261 - 1] = iArr108[i261 - 1] ^ iArr108[i261];
                int i262 = iArr108[i261 - 1];
                iArr108[i261 - 1] = iArr108[i261 - 2];
                iArr108[i261 - 2] = i262;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_AC3:
                int i263 = this.toDoubleRange - 1;
                this.toDoubleRange = i263;
                this.invoke[i263] = null;
                int i264 = i263 - 1;
                this.toDoubleRange = i264;
                int[] iArr109 = this.FastBitmap$CoordinateSystem;
                iArr109[i264 - 1] = iArr109[i264 - 1] - iArr109[i264];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                int[] iArr110 = this.FastBitmap$CoordinateSystem;
                int i265 = this.toDoubleRange;
                int i266 = i265 + 1;
                this.toDoubleRange = i266;
                iArr110[i265] = 1;
                int i267 = i266 - 1;
                this.toDoubleRange = i267;
                iArr110[i267 - 1] = iArr110[i267 - 1] - iArr110[i267];
                int i268 = i267 + 1;
                this.toDoubleRange = i268;
                iArr110[i267] = iArr110[i268 - 2];
                return 0;
            case 131:
                int i269 = this.toDoubleRange - 1;
                this.toDoubleRange = i269;
                int[] iArr111 = this.FastBitmap$CoordinateSystem;
                iArr111[i269 - 1] = iArr111[i269 - 1] % iArr111[i269];
                int i270 = i269 - 1;
                this.toDoubleRange = i270;
                this.invoke[i270] = null;
                return 0;
            case 132:
                int[] iArr112 = this.FastBitmap$CoordinateSystem;
                int i271 = this.toDoubleRange;
                this.toDoubleRange = i271 + 1;
                iArr112[i271] = 73;
                return 0;
            case 133:
                int[] iArr113 = this.FastBitmap$CoordinateSystem;
                int i272 = this.toDoubleRange;
                int i273 = i272 + 1;
                this.toDoubleRange = i273;
                iArr113[i272] = -1;
                int i274 = i273 + 2;
                this.toDoubleRange = i274;
                iArr113[i274 - 1] = iArr113[i274 - 3];
                iArr113[i273] = iArr113[i274 - 4];
                this.toDoubleRange = i274 + 1;
                iArr113[i274] = -1;
                return 0;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                int i275 = this.toDoubleRange - 1;
                this.toDoubleRange = i275;
                int[] iArr114 = this.FastBitmap$CoordinateSystem;
                iArr114[i275 - 1] = iArr114[i275 - 1] ^ iArr114[i275];
                int i276 = i275 - 1;
                this.toDoubleRange = i276;
                iArr114[i276 - 1] = iArr114[i276 - 1] & iArr114[i276];
                int i277 = i276 - 1;
                this.toDoubleRange = i277;
                iArr114[i277 - 1] = iArr114[i277] | iArr114[i277 - 1];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
                int[] iArr115 = this.FastBitmap$CoordinateSystem;
                int i278 = this.toDoubleRange;
                int i279 = iArr115[i278 - 1];
                iArr115[i278 - 1] = iArr115[i278 - 2];
                iArr115[i278 - 2] = i279;
                int i280 = i278 - 1;
                this.toDoubleRange = i280;
                this.invoke[i280] = null;
                int i281 = i280 - 1;
                this.toDoubleRange = i281;
                iArr115[i281 - 1] = iArr115[i281 - 1] - iArr115[i281];
                return 0;
            case 136:
                int i282 = this.toDoubleRange - 1;
                this.toDoubleRange = i282;
                this.invoke[i282] = null;
                int[] iArr116 = this.FastBitmap$CoordinateSystem;
                iArr116[i282 - 1] = -iArr116[i282 - 1];
                int i283 = i282 - 1;
                this.toDoubleRange = i283;
                iArr116[i283 - 1] = iArr116[i283] & iArr116[i283 - 1];
                return 0;
            case 137:
                int[] iArr117 = this.FastBitmap$CoordinateSystem;
                int i284 = this.toDoubleRange;
                int i285 = i284 + 1;
                this.toDoubleRange = i285;
                iArr117[i284] = 1;
                int i286 = i285 - 1;
                this.toDoubleRange = i286;
                iArr117[i286 - 1] = iArr117[i286 - 1] << iArr117[i286];
                int i287 = i286 - 1;
                this.toDoubleRange = i287;
                iArr117[i287 - 1] = iArr117[i287 - 1] + iArr117[i287];
                return 0;
            case TsExtractor.TS_STREAM_TYPE_DTS:
                int[] iArr118 = this.FastBitmap$CoordinateSystem;
                int i288 = this.toDoubleRange;
                this.toDoubleRange = i288 + 1;
                iArr118[i288] = 37;
                return 0;
            case 139:
                int[] iArr119 = this.FastBitmap$CoordinateSystem;
                int i289 = this.toDoubleRange;
                int i290 = i289 + 1;
                this.toDoubleRange = i290;
                iArr119[i289] = -1;
                int i291 = i290 - 1;
                this.toDoubleRange = i291;
                iArr119[i291 - 1] = iArr119[i291 - 1] ^ iArr119[i291];
                int i292 = i291 - 1;
                this.toDoubleRange = i292;
                iArr119[i292 - 1] = iArr119[i292] & iArr119[i292 - 1];
                return 0;
            case SavingsActivity.RV_BENEFIT_WIDTH /*140*/:
                int i293 = this.toDoubleRange - 1;
                this.toDoubleRange = i293;
                int[] iArr120 = this.FastBitmap$CoordinateSystem;
                iArr120[i293 - 1] = iArr120[i293 - 1] | iArr120[i293];
                int i294 = i293 + 1;
                this.toDoubleRange = i294;
                int i295 = iArr120[i294 - 2];
                iArr120[i293] = i295;
                iArr120[i294 - 2] = iArr120[i294 - 3];
                iArr120[i294 - 3] = iArr120[i294 - 4];
                iArr120[i294 - 4] = i295;
                return 0;
            case 141:
                int i296 = this.toDoubleRange - 1;
                this.toDoubleRange = i296;
                int[] iArr121 = this.FastBitmap$CoordinateSystem;
                iArr121[i296 - 1] = iArr121[i296 - 1] ^ iArr121[i296];
                int i297 = i296 - 1;
                this.toDoubleRange = i297;
                iArr121[i297 - 1] = iArr121[i297] ^ iArr121[i297 - 1];
                return 0;
            case 142:
                int i298 = this.toDoubleRange - 1;
                this.toDoubleRange = i298;
                this.invoke[i298] = null;
                int i299 = i298 - 1;
                this.toDoubleRange = i299;
                int[] iArr122 = this.FastBitmap$CoordinateSystem;
                iArr122[i299 - 1] = iArr122[i299 - 1] & iArr122[i299];
                this.toDoubleRange = i299 + 1;
                iArr122[i299] = 1;
                return 0;
            case 143:
                int i300 = this.toDoubleRange - 1;
                this.toDoubleRange = i300;
                int[] iArr123 = this.FastBitmap$CoordinateSystem;
                iArr123[i300 - 1] = iArr123[i300 - 1] << iArr123[i300];
                iArr123[i300 - 1] = -iArr123[i300 - 1];
                return 0;
            case 144:
                int[] iArr124 = this.FastBitmap$CoordinateSystem;
                int i301 = this.toDoubleRange;
                int i302 = i301 + 2;
                this.toDoubleRange = i302;
                iArr124[i302 - 1] = iArr124[i302 - 3];
                iArr124[i301] = iArr124[i302 - 4];
                iArr124[i302 - 1] = -iArr124[i302 - 1];
                int i303 = i302 - 1;
                this.toDoubleRange = i303;
                iArr124[i303 - 1] = iArr124[i303] | iArr124[i303 - 1];
                return 0;
            case 145:
                int i304 = this.toDoubleRange - 1;
                this.toDoubleRange = i304;
                this.invoke[i304] = null;
                int[] iArr125 = this.FastBitmap$CoordinateSystem;
                iArr125[i304 - 1] = -iArr125[i304 - 1];
                int i305 = i304 - 1;
                this.toDoubleRange = i305;
                iArr125[i305 - 1] = iArr125[i305] ^ iArr125[i305 - 1];
                return 0;
            case 146:
                int i306 = this.toDoubleRange - 1;
                this.toDoubleRange = i306;
                int[] iArr126 = this.FastBitmap$CoordinateSystem;
                iArr126[i306 - 1] = iArr126[i306 - 1] - iArr126[i306];
                int i307 = i306 + 1;
                this.toDoubleRange = i307;
                iArr126[i306] = iArr126[i307 - 2];
                this.toDoubleRange = i307 + 1;
                iArr126[i307] = 128;
                return 0;
            case 147:
                int[] iArr127 = this.FastBitmap$CoordinateSystem;
                int i308 = this.toDoubleRange;
                this.toDoubleRange = i308 + 1;
                iArr127[i308] = 75;
                return 0;
            case 148:
                int[] iArr128 = this.FastBitmap$CoordinateSystem;
                int i309 = this.toDoubleRange;
                this.toDoubleRange = i309 + 1;
                iArr128[i309] = 47;
                return 0;
            case 149:
                int[] iArr129 = this.FastBitmap$CoordinateSystem;
                int i310 = this.toDoubleRange;
                int i311 = i310 + 1;
                this.toDoubleRange = i311;
                iArr129[i310] = 1;
                iArr129[i311 - 1] = -iArr129[i311 - 1];
                return 0;
            case 150:
                int[] iArr130 = this.FastBitmap$CoordinateSystem;
                int i312 = this.toDoubleRange;
                int i313 = i312 + 1;
                this.toDoubleRange = i313;
                int i314 = iArr130[i313 - 2];
                iArr130[i312] = i314;
                iArr130[i313 - 2] = iArr130[i313 - 3];
                iArr130[i313 - 3] = iArr130[i313 - 4];
                iArr130[i313 - 4] = i314;
                int i315 = i313 - 1;
                this.toDoubleRange = i315;
                this.invoke[i315] = null;
                int i316 = i315 - 1;
                this.toDoubleRange = i316;
                iArr130[i316 - 1] = iArr130[i316] ^ iArr130[i316 - 1];
                return 0;
            case 151:
                int[] iArr131 = this.FastBitmap$CoordinateSystem;
                int i317 = this.toDoubleRange;
                this.toDoubleRange = i317 + 1;
                iArr131[i317] = 109;
                return 0;
            case 152:
                int[] iArr132 = this.FastBitmap$CoordinateSystem;
                int i318 = this.toDoubleRange;
                int i319 = i318 + 1;
                this.toDoubleRange = i319;
                iArr132[i318] = iArr132[i319 - 2];
                iArr132[i319 - 1] = -iArr132[i319 - 1];
                return 0;
            case 153:
                int i320 = this.toDoubleRange - 1;
                this.toDoubleRange = i320;
                int[] iArr133 = this.FastBitmap$CoordinateSystem;
                iArr133[i320 - 1] = iArr133[i320 - 1] - iArr133[i320];
                int i321 = i320 + 1;
                this.toDoubleRange = i321;
                iArr133[i320] = 1;
                int i322 = i321 - 1;
                this.toDoubleRange = i322;
                iArr133[i322 - 1] = iArr133[i322 - 1] - iArr133[i322];
                return 0;
            case 154:
                int[] iArr134 = this.FastBitmap$CoordinateSystem;
                int i323 = this.toDoubleRange;
                int i324 = i323 + 1;
                this.toDoubleRange = i324;
                iArr134[i323] = 85;
                iArr134[i324 - 1] = -iArr134[i324 - 1];
                return 0;
            case 155:
                int[] iArr135 = this.FastBitmap$CoordinateSystem;
                int i325 = this.toDoubleRange;
                iArr135[i325 - 1] = -iArr135[i325 - 1];
                int i326 = i325 + 2;
                this.toDoubleRange = i326;
                iArr135[i326 - 1] = iArr135[i326 - 3];
                iArr135[i325] = iArr135[i326 - 4];
                int i327 = i326 - 1;
                this.toDoubleRange = i327;
                iArr135[i327 - 1] = iArr135[i327] ^ iArr135[i327 - 1];
                return 0;
            case 156:
                int i328 = this.toDoubleRange - 1;
                this.toDoubleRange = i328;
                int[] iArr136 = this.FastBitmap$CoordinateSystem;
                iArr136[i328 - 1] = iArr136[i328 - 1] & iArr136[i328];
                this.toDoubleRange = i328 + 1;
                iArr136[i328] = -1;
                return 0;
            case 157:
                int[] iArr137 = this.FastBitmap$CoordinateSystem;
                int i329 = this.toDoubleRange;
                int i330 = i329 + 2;
                this.toDoubleRange = i330;
                iArr137[i330 - 1] = iArr137[i330 - 3];
                iArr137[i329] = iArr137[i330 - 4];
                iArr137[i330 - 1] = -iArr137[i330 - 1];
                int i331 = i330 - 1;
                this.toDoubleRange = i331;
                iArr137[i331 - 1] = iArr137[i331] & iArr137[i331 - 1];
                return 0;
            case 158:
                int[] iArr138 = this.FastBitmap$CoordinateSystem;
                int i332 = this.toDoubleRange;
                int i333 = i332 + 1;
                this.toDoubleRange = i333;
                iArr138[i332] = 85;
                int i334 = i333 + 2;
                this.toDoubleRange = i334;
                iArr138[i334 - 1] = iArr138[i334 - 3];
                iArr138[i333] = iArr138[i334 - 4];
                return 0;
            case 159:
                int[] iArr139 = this.FastBitmap$CoordinateSystem;
                int i335 = this.toDoubleRange;
                this.toDoubleRange = i335 + 1;
                iArr139[i335] = 11;
                return 0;
            case BlobStatic.MONITOR_IMAGE_WIDTH /*160*/:
                int i336 = this.toDoubleRange - 1;
                this.toDoubleRange = i336;
                int[] iArr140 = this.FastBitmap$CoordinateSystem;
                iArr140[i336 - 1] = iArr140[i336 - 1] ^ iArr140[i336];
                int i337 = i336 - 1;
                this.toDoubleRange = i337;
                iArr140[i337 - 1] = iArr140[i337 - 1] & iArr140[i337];
                int i338 = i337 + 1;
                this.toDoubleRange = i338;
                int i339 = iArr140[i338 - 2];
                iArr140[i337] = i339;
                iArr140[i338 - 2] = iArr140[i338 - 3];
                iArr140[i338 - 3] = iArr140[i338 - 4];
                iArr140[i338 - 4] = i339;
                return 0;
            case 161:
                int[] iArr141 = this.FastBitmap$CoordinateSystem;
                int i340 = this.toDoubleRange;
                int i341 = iArr141[i340 - 1];
                iArr141[i340 - 1] = iArr141[i340 - 2];
                iArr141[i340 - 2] = i341;
                int i342 = i340 - 1;
                this.toDoubleRange = i342;
                this.invoke[i342] = null;
                int i343 = i342 + 2;
                this.toDoubleRange = i343;
                iArr141[i343 - 1] = iArr141[i343 - 3];
                iArr141[i342] = iArr141[i343 - 4];
                return 0;
            case 162:
                int i344 = this.toDoubleRange - 1;
                this.toDoubleRange = i344;
                int[] iArr142 = this.FastBitmap$CoordinateSystem;
                iArr142[i344 - 1] = iArr142[i344 - 1] & iArr142[i344];
                int i345 = i344 + 1;
                this.toDoubleRange = i345;
                int i346 = iArr142[i345 - 2];
                iArr142[i344] = i346;
                iArr142[i345 - 2] = iArr142[i345 - 3];
                iArr142[i345 - 3] = iArr142[i345 - 4];
                iArr142[i345 - 4] = i346;
                int i347 = i345 - 1;
                this.toDoubleRange = i347;
                this.invoke[i347] = null;
                return 0;
            case 163:
                int i348 = this.toDoubleRange - 1;
                this.toDoubleRange = i348;
                int[] iArr143 = this.FastBitmap$CoordinateSystem;
                iArr143[i348 - 1] = iArr143[i348 - 1] | iArr143[i348];
                int i349 = i348 - 1;
                this.toDoubleRange = i349;
                iArr143[i349 - 1] = iArr143[i349 - 1] + iArr143[i349];
                this.toDoubleRange = i349 + 1;
                iArr143[i349] = 1;
                return 0;
            case 164:
                int[] iArr144 = this.FastBitmap$CoordinateSystem;
                int i350 = this.toDoubleRange;
                int i351 = i350 + 1;
                this.toDoubleRange = i351;
                iArr144[i350] = 97;
                int i352 = i351 + 1;
                this.toDoubleRange = i352;
                iArr144[i351] = 0;
                int i353 = i352 - 1;
                this.toDoubleRange = i353;
                iArr144[i353 - 1] = iArr144[i353 - 1] / iArr144[i353];
                return 0;
            case 165:
                int[] iArr145 = this.FastBitmap$CoordinateSystem;
                int i354 = this.toDoubleRange;
                this.toDoubleRange = i354 + 1;
                iArr145[i354] = 57;
                return 0;
            case 166:
                int i355 = this.toDoubleRange - 1;
                this.toDoubleRange = i355;
                int[] iArr146 = this.FastBitmap$CoordinateSystem;
                iArr146[i355 - 1] = iArr146[i355 - 1] | iArr146[i355];
                int i356 = iArr146[i355 - 1];
                iArr146[i355 - 1] = iArr146[i355 - 2];
                iArr146[i355 - 2] = i356;
                return 0;
            case 167:
                int i357 = this.toDoubleRange - 1;
                this.toDoubleRange = i357;
                this.invoke[i357] = null;
                int i358 = i357 - 1;
                this.toDoubleRange = i358;
                int[] iArr147 = this.FastBitmap$CoordinateSystem;
                iArr147[i358 - 1] = iArr147[i358 - 1] - iArr147[i358];
                this.toDoubleRange = i358 + 1;
                iArr147[i358] = 1;
                return 0;
            case 168:
                int i359 = this.toDoubleRange - 1;
                this.toDoubleRange = i359;
                int[] iArr148 = this.FastBitmap$CoordinateSystem;
                iArr148[i359 - 1] = iArr148[i359 - 1] | iArr148[i359];
                int i360 = i359 - 1;
                this.toDoubleRange = i360;
                iArr148[i360 - 1] = iArr148[i360 - 1] + iArr148[i360];
                int i361 = i360 + 1;
                this.toDoubleRange = i361;
                iArr148[i360] = iArr148[i361 - 2];
                return 0;
            case 169:
                int[] iArr149 = this.FastBitmap$CoordinateSystem;
                int i362 = this.toDoubleRange;
                int i363 = i362 + 2;
                this.toDoubleRange = i363;
                iArr149[i363 - 1] = iArr149[i363 - 3];
                iArr149[i362] = iArr149[i363 - 4];
                int i364 = i363 - 1;
                this.toDoubleRange = i364;
                iArr149[i364 - 1] = iArr149[i364] ^ iArr149[i364 - 1];
                return 0;
            case 170:
                int i365 = this.toDoubleRange - 1;
                this.toDoubleRange = i365;
                int[] iArr150 = this.FastBitmap$CoordinateSystem;
                iArr150[i365 - 1] = iArr150[i365 - 1] & iArr150[i365];
                int i366 = i365 - 1;
                this.toDoubleRange = i366;
                iArr150[i366 - 1] = iArr150[i366 - 1] | iArr150[i366];
                this.toDoubleRange = i366 + 1;
                iArr150[i366] = 1;
                return 0;
            case 171:
                int[] iArr151 = this.FastBitmap$CoordinateSystem;
                int i367 = this.toDoubleRange;
                int i368 = i367 + 2;
                this.toDoubleRange = i368;
                iArr151[i368 - 1] = iArr151[i368 - 3];
                iArr151[i367] = iArr151[i368 - 4];
                int i369 = i368 + 1;
                this.toDoubleRange = i369;
                iArr151[i368] = -1;
                int i370 = i369 - 1;
                this.toDoubleRange = i370;
                iArr151[i370 - 1] = iArr151[i370] ^ iArr151[i370 - 1];
                return 0;
            case 172:
                int i371 = this.toDoubleRange - 1;
                this.toDoubleRange = i371;
                int[] iArr152 = this.FastBitmap$CoordinateSystem;
                iArr152[i371 - 1] = iArr152[i371 - 1] + iArr152[i371];
                int i372 = i371 + 1;
                this.toDoubleRange = i372;
                iArr152[i371] = iArr152[i372 - 2];
                this.toDoubleRange = i372 + 1;
                iArr152[i372] = 128;
                return 0;
            case 173:
                int[] iArr153 = this.FastBitmap$CoordinateSystem;
                int i373 = this.toDoubleRange;
                this.toDoubleRange = i373 + 1;
                iArr153[i373] = 94;
                return 0;
            case 174:
                int[] iArr154 = this.FastBitmap$CoordinateSystem;
                int i374 = this.toDoubleRange;
                int i375 = i374 + 1;
                this.toDoubleRange = i375;
                iArr154[i374] = 15;
                int i376 = i375 + 2;
                this.toDoubleRange = i376;
                iArr154[i376 - 1] = iArr154[i376 - 3];
                iArr154[i375] = iArr154[i376 - 4];
                int i377 = i376 + 2;
                this.toDoubleRange = i377;
                iArr154[i377 - 1] = iArr154[i377 - 3];
                iArr154[i376] = iArr154[i377 - 4];
                return 0;
            case 175:
                int i378 = this.toDoubleRange - 1;
                this.toDoubleRange = i378;
                this.invoke[i378] = null;
                int i379 = i378 - 1;
                this.toDoubleRange = i379;
                int[] iArr155 = this.FastBitmap$CoordinateSystem;
                iArr155[i379 - 1] = iArr155[i379] | iArr155[i379 - 1];
                return 0;
            case 176:
                int i380 = this.toDoubleRange - 1;
                this.toDoubleRange = i380;
                this.invoke[i380] = null;
                int[] iArr156 = this.FastBitmap$CoordinateSystem;
                int i381 = i380 + 2;
                this.toDoubleRange = i381;
                iArr156[i381 - 1] = iArr156[i381 - 3];
                iArr156[i380] = iArr156[i381 - 4];
                this.toDoubleRange = i381 + 1;
                iArr156[i381] = -1;
                return 0;
            case 177:
                int i382 = this.toDoubleRange - 1;
                this.toDoubleRange = i382;
                int[] iArr157 = this.FastBitmap$CoordinateSystem;
                iArr157[i382 - 1] = iArr157[i382 - 1] << iArr157[i382];
                int i383 = i382 + 2;
                this.toDoubleRange = i383;
                iArr157[i383 - 1] = iArr157[i383 - 3];
                iArr157[i382] = iArr157[i383 - 4];
                int i384 = i383 - 1;
                this.toDoubleRange = i384;
                iArr157[i384 - 1] = iArr157[i384] | iArr157[i384 - 1];
                return 0;
            case 178:
                int[] iArr158 = this.FastBitmap$CoordinateSystem;
                int i385 = this.toDoubleRange;
                int i386 = i385 + 1;
                this.toDoubleRange = i386;
                iArr158[i385] = 105;
                iArr158[i386 - 1] = -iArr158[i386 - 1];
                return 0;
            case 179:
                int[] iArr159 = this.FastBitmap$CoordinateSystem;
                int i387 = this.toDoubleRange;
                int i388 = i387 + 2;
                this.toDoubleRange = i388;
                iArr159[i388 - 1] = iArr159[i388 - 3];
                iArr159[i387] = iArr159[i388 - 4];
                iArr159[i388 - 1] = -iArr159[i388 - 1];
                int i389 = i388 + 2;
                this.toDoubleRange = i389;
                iArr159[i389 - 1] = iArr159[i389 - 3];
                iArr159[i388] = iArr159[i389 - 4];
                return 0;
            case 180:
                int[] iArr160 = this.FastBitmap$CoordinateSystem;
                int i390 = this.toDoubleRange;
                int i391 = iArr160[i390 - 1];
                iArr160[i390 - 1] = iArr160[i390 - 2];
                iArr160[i390 - 2] = i391;
                int i392 = i390 + 1;
                this.toDoubleRange = i392;
                iArr160[i390] = -1;
                int i393 = i392 - 1;
                this.toDoubleRange = i393;
                iArr160[i393 - 1] = iArr160[i393] ^ iArr160[i393 - 1];
                return 0;
            case 181:
                int i394 = this.toDoubleRange - 1;
                this.toDoubleRange = i394;
                int[] iArr161 = this.FastBitmap$CoordinateSystem;
                iArr161[i394 - 1] = iArr161[i394 - 1] & iArr161[i394];
                int i395 = i394 - 1;
                this.toDoubleRange = i395;
                iArr161[i395 - 1] = iArr161[i395 - 1] | iArr161[i395];
                int i396 = i395 + 1;
                this.toDoubleRange = i396;
                int i397 = iArr161[i396 - 2];
                iArr161[i395] = i397;
                iArr161[i396 - 2] = iArr161[i396 - 3];
                iArr161[i396 - 3] = iArr161[i396 - 4];
                iArr161[i396 - 4] = i397;
                return 0;
            case 182:
                int i398 = this.toDoubleRange - 1;
                this.toDoubleRange = i398;
                int[] iArr162 = this.FastBitmap$CoordinateSystem;
                iArr162[i398 - 1] = iArr162[i398 - 1] ^ iArr162[i398];
                int i399 = i398 - 1;
                this.toDoubleRange = i399;
                iArr162[i399 - 1] = iArr162[i399 - 1] ^ iArr162[i399];
                int i400 = i399 - 1;
                this.toDoubleRange = i400;
                this.invoke[i400] = null;
                return 0;
            case 183:
                int[] iArr163 = this.FastBitmap$CoordinateSystem;
                int i401 = this.toDoubleRange;
                this.toDoubleRange = i401 + 1;
                iArr163[i401] = 23;
                return 0;
            case 184:
                int[] iArr164 = this.FastBitmap$CoordinateSystem;
                int i402 = this.toDoubleRange;
                this.toDoubleRange = i402 + 1;
                iArr164[i402] = 125;
                return 0;
            case WSContextConstant.HANDSHAKE_RECEIVE_SIZE /*185*/:
                int[] iArr165 = this.FastBitmap$CoordinateSystem;
                int i403 = this.toDoubleRange;
                int i404 = i403 + 1;
                this.toDoubleRange = i404;
                iArr165[i403] = -1;
                int i405 = i404 + 2;
                this.toDoubleRange = i405;
                iArr165[i405 - 1] = iArr165[i405 - 3];
                iArr165[i404] = iArr165[i405 - 4];
                return 0;
            case 186:
                int[] iArr166 = this.FastBitmap$CoordinateSystem;
                int i406 = this.toDoubleRange;
                int i407 = i406 + 1;
                this.toDoubleRange = i407;
                int i408 = iArr166[i407 - 2];
                iArr166[i406] = i408;
                iArr166[i407 - 2] = iArr166[i407 - 3];
                iArr166[i407 - 3] = iArr166[i407 - 4];
                iArr166[i407 - 4] = i408;
                int i409 = i407 - 1;
                this.toDoubleRange = i409;
                this.invoke[i409] = null;
                int i410 = iArr166[i409 - 1];
                iArr166[i409 - 1] = iArr166[i409 - 2];
                iArr166[i409 - 2] = i410;
                return 0;
            case 187:
                int i411 = this.toDoubleRange - 1;
                this.toDoubleRange = i411;
                int[] iArr167 = this.FastBitmap$CoordinateSystem;
                iArr167[i411 - 1] = iArr167[i411 - 1] + iArr167[i411];
                int i412 = i411 + 1;
                this.toDoubleRange = i412;
                iArr167[i411] = 1;
                int i413 = i412 - 1;
                this.toDoubleRange = i413;
                iArr167[i413 - 1] = iArr167[i413 - 1] - iArr167[i413];
                return 0;
            case TsExtractor.TS_PACKET_SIZE:
                int[] iArr168 = this.FastBitmap$CoordinateSystem;
                int i414 = this.toDoubleRange;
                int i415 = i414 + 1;
                this.toDoubleRange = i415;
                iArr168[i414] = 109;
                iArr168[i415 - 1] = -iArr168[i415 - 1];
                return 0;
            case 189:
                int i416 = this.toDoubleRange - 1;
                this.toDoubleRange = i416;
                int[] iArr169 = this.FastBitmap$CoordinateSystem;
                iArr169[i416 - 1] = iArr169[i416 - 1] & iArr169[i416];
                int i417 = i416 + 1;
                this.toDoubleRange = i417;
                iArr169[i416] = -1;
                int i418 = i417 - 1;
                this.toDoubleRange = i418;
                iArr169[i418 - 1] = iArr169[i418] ^ iArr169[i418 - 1];
                return 0;
            case 190:
                int i419 = this.toDoubleRange - 1;
                this.toDoubleRange = i419;
                int[] iArr170 = this.FastBitmap$CoordinateSystem;
                iArr170[i419 - 1] = iArr170[i419 - 1] | iArr170[i419];
                int i420 = i419 - 1;
                this.toDoubleRange = i420;
                iArr170[i420 - 1] = iArr170[i420] & iArr170[i420 - 1];
                return 0;
            case 191:
                int[] iArr171 = this.FastBitmap$CoordinateSystem;
                int i421 = this.toDoubleRange;
                this.toDoubleRange = i421 + 1;
                iArr171[i421] = 61;
                return 0;
            case PsExtractor.AUDIO_STREAM:
                int[] iArr172 = this.FastBitmap$CoordinateSystem;
                int i422 = this.toDoubleRange;
                this.toDoubleRange = i422 + 1;
                iArr172[i422] = 71;
                return 0;
            case 193:
                int[] iArr173 = this.FastBitmap$CoordinateSystem;
                int i423 = this.toDoubleRange;
                int i424 = i423 + 1;
                this.toDoubleRange = i424;
                iArr173[i423] = 49;
                iArr173[i424 - 1] = -iArr173[i424 - 1];
                int i425 = i424 + 2;
                this.toDoubleRange = i425;
                iArr173[i425 - 1] = iArr173[i425 - 3];
                iArr173[i424] = iArr173[i425 - 4];
                return 0;
            case 194:
                int[] iArr174 = this.FastBitmap$CoordinateSystem;
                int i426 = this.toDoubleRange;
                int i427 = i426 + 1;
                this.toDoubleRange = i427;
                iArr174[i426] = 43;
                int i428 = i427 + 1;
                this.toDoubleRange = i428;
                iArr174[i427] = iArr174[i428 - 2];
                return 0;
            case 195:
                int i429 = this.toDoubleRange - 1;
                this.toDoubleRange = i429;
                int[] iArr175 = this.FastBitmap$CoordinateSystem;
                iArr175[i429 - 1] = iArr175[i429 - 1] & iArr175[i429];
                int i430 = iArr175[i429 - 1];
                iArr175[i429 - 1] = iArr175[i429 - 2];
                iArr175[i429 - 2] = i430;
                int i431 = i429 - 1;
                this.toDoubleRange = i431;
                this.invoke[i431] = null;
                return 0;
            case 196:
                int[] iArr176 = this.FastBitmap$CoordinateSystem;
                int i432 = this.toDoubleRange;
                int i433 = i432 + 1;
                this.toDoubleRange = i433;
                iArr176[i432] = 53;
                int i434 = i433 + 2;
                this.toDoubleRange = i434;
                iArr176[i434 - 1] = iArr176[i434 - 3];
                iArr176[i433] = iArr176[i434 - 4];
                return 0;
            case 197:
                int i435 = this.toDoubleRange - 1;
                this.toDoubleRange = i435;
                this.invoke[i435] = null;
                int[] iArr177 = this.FastBitmap$CoordinateSystem;
                int i436 = i435 + 2;
                this.toDoubleRange = i436;
                iArr177[i436 - 1] = iArr177[i436 - 3];
                iArr177[i435] = iArr177[i436 - 4];
                return 0;
            case 198:
                int[] iArr178 = this.FastBitmap$CoordinateSystem;
                int i437 = this.toDoubleRange;
                iArr178[i437 - 1] = -iArr178[i437 - 1];
                int i438 = i437 - 1;
                this.toDoubleRange = i438;
                iArr178[i438 - 1] = iArr178[i438 - 1] & iArr178[i438];
                int i439 = i438 + 1;
                this.toDoubleRange = i439;
                int i440 = iArr178[i439 - 2];
                iArr178[i438] = i440;
                iArr178[i439 - 2] = iArr178[i439 - 3];
                iArr178[i439 - 3] = iArr178[i439 - 4];
                iArr178[i439 - 4] = i440;
                return 0;
            case SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR /*199*/:
                int i441 = this.toDoubleRange - 1;
                this.toDoubleRange = i441;
                this.invoke[i441] = null;
                int[] iArr179 = this.FastBitmap$CoordinateSystem;
                iArr179[i441 - 1] = -iArr179[i441 - 1];
                int i442 = i441 - 1;
                this.toDoubleRange = i442;
                iArr179[i442 - 1] = iArr179[i442] | iArr179[i442 - 1];
                return 0;
            case 200:
                int[] iArr180 = this.FastBitmap$CoordinateSystem;
                int i443 = this.toDoubleRange;
                this.toDoubleRange = i443 + 1;
                iArr180[i443] = 79;
                return 0;
            case 201:
                int i444 = this.toDoubleRange - 1;
                this.toDoubleRange = i444;
                this.invoke[i444] = null;
                int i445 = i444 - 1;
                this.toDoubleRange = i445;
                int[] iArr181 = this.FastBitmap$CoordinateSystem;
                iArr181[i445 - 1] = iArr181[i445 - 1] | iArr181[i445];
                int i446 = i445 - 1;
                this.toDoubleRange = i446;
                iArr181[i446 - 1] = iArr181[i446] & iArr181[i446 - 1];
                return 0;
            case 202:
                int[] iArr182 = this.FastBitmap$CoordinateSystem;
                int i447 = this.toDoubleRange;
                int i448 = i447 + 1;
                this.toDoubleRange = i448;
                iArr182[i447] = 91;
                iArr182[i448 - 1] = -iArr182[i448 - 1];
                return 0;
            case 203:
                int[] iArr183 = this.FastBitmap$CoordinateSystem;
                int i449 = this.toDoubleRange;
                int i450 = i449 + 1;
                this.toDoubleRange = i450;
                iArr183[i449] = -1;
                int i451 = i450 - 1;
                this.toDoubleRange = i451;
                iArr183[i451 - 1] = iArr183[i451 - 1] ^ iArr183[i451];
                int i452 = i451 - 1;
                this.toDoubleRange = i452;
                iArr183[i452 - 1] = iArr183[i452] ^ iArr183[i452 - 1];
                return 0;
            case 204:
                int[] iArr184 = this.FastBitmap$CoordinateSystem;
                int i453 = this.toDoubleRange;
                this.toDoubleRange = i453 + 1;
                iArr184[i453] = 2;
                return 0;
            case 205:
                int i454 = this.toDoubleRange - 2;
                this.toDoubleRange = i454;
                int[] iArr185 = this.FastBitmap$CoordinateSystem;
                this.setMin = iArr185[i454] > iArr185[i454 + 1] ? 1 : 0;
                return 0;
            case 206:
                Object[] objArr17 = this.invoke;
                int i455 = this.toDoubleRange;
                int i456 = i455 + 1;
                this.toDoubleRange = i456;
                objArr17[i455] = objArr17[i456 - 2];
                return 0;
            case 207:
                int[] iArr186 = this.FastBitmap$CoordinateSystem;
                int i457 = this.toDoubleRange;
                this.toDoubleRange = i457 + 1;
                iArr186[i457] = 32;
                return 0;
            case 208:
                int[] iArr187 = this.FastBitmap$CoordinateSystem;
                int i458 = this.toDoubleRange;
                this.toDoubleRange = i458 + 1;
                iArr187[i458] = 78;
                return 0;
            case 209:
                int[] iArr188 = this.FastBitmap$CoordinateSystem;
                int i459 = this.toDoubleRange;
                this.toDoubleRange = i459 + 1;
                iArr188[i459] = 56;
                return 0;
            case 210:
                int[] iArr189 = this.FastBitmap$CoordinateSystem;
                int i460 = this.toDoubleRange;
                this.toDoubleRange = i460 + 1;
                iArr189[i460] = 29;
                return 0;
            case 211:
                int i461 = this.toDoubleRange - 1;
                this.toDoubleRange = i461;
                Object[] objArr18 = this.invoke;
                objArr18[i461] = null;
                this.toDoubleRange = i461 + 1;
                objArr18[i461] = objArr18[13];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_STORE_LOW_VERSION_DATA_FILE /*212*/:
                Object[] objArr19 = this.invoke;
                int i462 = this.toDoubleRange;
                int i463 = i462 + 1;
                this.toDoubleRange = i463;
                objArr19[i462] = objArr19[16];
                int[] iArr190 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i463 + 1;
                iArr190[i463] = 0;
                return 0;
            case 213:
                Object[] objArr20 = this.invoke;
                int i464 = this.toDoubleRange;
                int i465 = i464 + 1;
                this.toDoubleRange = i465;
                objArr20[i464] = objArr20[i465 - 2];
                int i466 = i465 - 1;
                this.toDoubleRange = i466;
                Object obj5 = objArr20[i466];
                objArr20[i466] = null;
                objArr20[16] = obj5;
                return 0;
            case 214:
                int i467 = this.toDoubleRange - 1;
                this.toDoubleRange = i467;
                int[] iArr191 = this.FastBitmap$CoordinateSystem;
                iArr191[i467 - 1] = iArr191[i467 - 1] ^ iArr191[i467];
                int i468 = i467 - 1;
                this.toDoubleRange = i468;
                iArr191[i468 - 1] = iArr191[i468 - 1] - iArr191[i468];
                int i469 = i468 + 1;
                this.toDoubleRange = i469;
                iArr191[i468] = iArr191[i469 - 2];
                return 0;
            case 215:
                int[] iArr192 = this.FastBitmap$CoordinateSystem;
                int i470 = this.toDoubleRange;
                this.toDoubleRange = i470 + 1;
                iArr192[i470] = 39;
                return 0;
            case 216:
                int[] iArr193 = this.FastBitmap$CoordinateSystem;
                int i471 = this.toDoubleRange;
                int i472 = i471 + 2;
                this.toDoubleRange = i472;
                iArr193[i472 - 1] = iArr193[i472 - 3];
                iArr193[i471] = iArr193[i472 - 4];
                iArr193[i472 - 1] = -iArr193[i472 - 1];
                return 0;
            case FileUtils.JPEG_MARKER_EOI /*217*/:
                int i473 = this.toDoubleRange - 1;
                this.toDoubleRange = i473;
                int[] iArr194 = this.FastBitmap$CoordinateSystem;
                iArr194[i473 - 1] = iArr194[i473 - 1] | iArr194[i473];
                int i474 = i473 + 1;
                this.toDoubleRange = i474;
                iArr194[i473] = 1;
                int i475 = i474 - 1;
                this.toDoubleRange = i475;
                iArr194[i475 - 1] = iArr194[i475 - 1] << iArr194[i475];
                return 0;
            case 218:
                int[] iArr195 = this.FastBitmap$CoordinateSystem;
                int i476 = this.toDoubleRange;
                iArr195[i476 - 1] = -iArr195[i476 - 1];
                int i477 = i476 - 1;
                this.toDoubleRange = i477;
                iArr195[i477 - 1] = iArr195[i477 - 1] ^ iArr195[i477];
                iArr195[i477 - 1] = -iArr195[i477 - 1];
                return 0;
            case 219:
                int[] iArr196 = this.FastBitmap$CoordinateSystem;
                int i478 = this.toDoubleRange;
                int i479 = i478 + 1;
                this.toDoubleRange = i479;
                iArr196[i478] = 93;
                int i480 = i479 + 1;
                this.toDoubleRange = i480;
                iArr196[i479] = iArr196[i480 - 2];
                return 0;
            case WheelView.DIVIDER_ALPHA /*220*/:
                int[] iArr197 = this.FastBitmap$CoordinateSystem;
                int i481 = this.toDoubleRange;
                int i482 = i481 + 1;
                this.toDoubleRange = i482;
                int i483 = iArr197[i482 - 2];
                iArr197[i481] = i483;
                iArr197[i482 - 2] = iArr197[i482 - 3];
                iArr197[i482 - 3] = iArr197[i482 - 4];
                iArr197[i482 - 4] = i483;
                int i484 = i482 - 1;
                this.toDoubleRange = i484;
                this.invoke[i484] = null;
                int i485 = i484 - 1;
                this.toDoubleRange = i485;
                iArr197[i485 - 1] = iArr197[i485] & iArr197[i485 - 1];
                return 0;
            case 221:
                int[] iArr198 = this.FastBitmap$CoordinateSystem;
                int i486 = this.toDoubleRange;
                int i487 = i486 + 2;
                this.toDoubleRange = i487;
                iArr198[i487 - 1] = iArr198[i487 - 3];
                iArr198[i486] = iArr198[i487 - 4];
                int i488 = i487 - 1;
                this.toDoubleRange = i488;
                iArr198[i488 - 1] = iArr198[i488] & iArr198[i488 - 1];
                return 0;
            case 222:
                int[] iArr199 = this.FastBitmap$CoordinateSystem;
                int i489 = this.toDoubleRange;
                this.toDoubleRange = i489 + 1;
                iArr199[i489] = 68;
                return 0;
            case 223:
                int[] iArr200 = this.FastBitmap$CoordinateSystem;
                int i490 = this.toDoubleRange;
                this.toDoubleRange = i490 + 1;
                iArr200[i490] = 101;
                return 0;
            case 224:
                int i491 = this.toDoubleRange - 1;
                this.toDoubleRange = i491;
                this.invoke[i491] = null;
                int i492 = i491 - 1;
                this.toDoubleRange = i492;
                int[] iArr201 = this.FastBitmap$CoordinateSystem;
                iArr201[i492 - 1] = iArr201[i492 - 1] & iArr201[i492];
                int i493 = i492 + 1;
                this.toDoubleRange = i493;
                int i494 = iArr201[i493 - 2];
                iArr201[i492] = i494;
                iArr201[i493 - 2] = iArr201[i493 - 3];
                iArr201[i493 - 3] = iArr201[i493 - 4];
                iArr201[i493 - 4] = i494;
                return 0;
            case 225:
                int[] iArr202 = this.FastBitmap$CoordinateSystem;
                int i495 = this.toDoubleRange;
                int i496 = i495 + 1;
                this.toDoubleRange = i496;
                iArr202[i495] = iArr202[i496 - 2];
                int i497 = i496 + 1;
                this.toDoubleRange = i497;
                iArr202[i496] = -1;
                int i498 = i497 - 1;
                this.toDoubleRange = i498;
                iArr202[i498 - 1] = iArr202[i498] ^ iArr202[i498 - 1];
                return 0;
            case 226:
                int[] iArr203 = this.FastBitmap$CoordinateSystem;
                int i499 = this.toDoubleRange;
                this.toDoubleRange = i499 + 1;
                iArr203[i499] = 54;
                return 0;
            case 227:
                int[] iArr204 = this.FastBitmap$CoordinateSystem;
                int i500 = this.toDoubleRange;
                Object[] objArr21 = this.invoke;
                Object obj6 = objArr21[i500 - 1];
                objArr21[i500 - 1] = null;
                iArr204[i500 - 1] = ((int[]) obj6).length;
                int i501 = i500 - 1;
                this.toDoubleRange = i501;
                objArr21[i501] = null;
                return 0;
            case 228:
                Object[] objArr22 = this.invoke;
                int i502 = this.toDoubleRange;
                int i503 = i502 + 1;
                this.toDoubleRange = i503;
                objArr22[i502] = objArr22[14];
                this.toDoubleRange = i503 + 1;
                objArr22[i503] = objArr22[16];
                return 0;
            case 229:
                int[] iArr205 = this.FastBitmap$CoordinateSystem;
                int i504 = this.toDoubleRange;
                this.toDoubleRange = i504 + 1;
                iArr205[i504] = 76;
                return 0;
            case 230:
                int[] iArr206 = this.FastBitmap$CoordinateSystem;
                int i505 = this.toDoubleRange;
                int i506 = i505 + 1;
                this.toDoubleRange = i506;
                iArr206[i505] = 2;
                int i507 = i506 - 1;
                this.toDoubleRange = i507;
                iArr206[i507 - 1] = iArr206[i507 - 1] % iArr206[i507];
                int i508 = i507 - 1;
                this.toDoubleRange = i508;
                this.invoke[i508] = null;
                return 0;
            case 231:
                int[] iArr207 = this.FastBitmap$CoordinateSystem;
                int i509 = this.toDoubleRange;
                this.toDoubleRange = i509 + 1;
                iArr207[i509] = 16;
                return 0;
            case 232:
                int i510 = this.toDoubleRange - 1;
                this.toDoubleRange = i510;
                this.invoke[i510] = null;
                int i511 = i510 - 1;
                this.toDoubleRange = i511;
                int[] iArr208 = this.FastBitmap$CoordinateSystem;
                iArr208[i511 - 1] = iArr208[i511 - 1] & iArr208[i511];
                int i512 = i511 - 1;
                this.toDoubleRange = i512;
                iArr208[i512 - 1] = iArr208[i512] | iArr208[i512 - 1];
                return 0;
            case 233:
                int i513 = this.toDoubleRange - 1;
                this.toDoubleRange = i513;
                int[] iArr209 = this.FastBitmap$CoordinateSystem;
                iArr209[i513 - 1] = iArr209[i513 - 1] & iArr209[i513];
                int i514 = i513 - 1;
                this.toDoubleRange = i514;
                iArr209[i514 - 1] = iArr209[i514 - 1] | iArr209[i514];
                int i515 = i514 - 1;
                this.toDoubleRange = i515;
                iArr209[i515 - 1] = iArr209[i515 - 1] - iArr209[i515];
                return 0;
            case 234:
                int[] iArr210 = this.FastBitmap$CoordinateSystem;
                int i516 = this.toDoubleRange;
                this.toDoubleRange = i516 + 1;
                iArr210[i516] = 34;
                return 0;
            case 235:
                int i517 = this.toDoubleRange - 1;
                this.toDoubleRange = i517;
                int[] iArr211 = this.FastBitmap$CoordinateSystem;
                iArr211[i517 - 1] = iArr211[i517 - 1] / iArr211[i517];
                int i518 = i517 - 1;
                this.toDoubleRange = i518;
                this.invoke[i518] = null;
                return 0;
            case 236:
                int[] iArr212 = this.FastBitmap$CoordinateSystem;
                int i519 = this.toDoubleRange;
                this.toDoubleRange = i519 + 1;
                iArr212[i519] = 51;
                return 0;
            case 237:
                int[] iArr213 = this.FastBitmap$CoordinateSystem;
                int i520 = this.toDoubleRange;
                this.toDoubleRange = i520 + 1;
                iArr213[i520] = 67;
                return 0;
            case 238:
                int[] iArr214 = this.FastBitmap$CoordinateSystem;
                int i521 = this.toDoubleRange;
                int i522 = i521 + 1;
                this.toDoubleRange = i522;
                iArr214[i521] = 49;
                int i523 = i522 + 2;
                this.toDoubleRange = i523;
                iArr214[i523 - 1] = iArr214[i523 - 3];
                iArr214[i522] = iArr214[i523 - 4];
                return 0;
            case 239:
                int[] iArr215 = this.FastBitmap$CoordinateSystem;
                int i524 = this.toDoubleRange;
                int i525 = i524 + 2;
                this.toDoubleRange = i525;
                iArr215[i525 - 1] = iArr215[i525 - 3];
                iArr215[i524] = iArr215[i525 - 4];
                int i526 = i525 + 2;
                this.toDoubleRange = i526;
                iArr215[i526 - 1] = iArr215[i526 - 3];
                iArr215[i525] = iArr215[i526 - 4];
                int i527 = i526 - 1;
                this.toDoubleRange = i527;
                iArr215[i527 - 1] = iArr215[i527] ^ iArr215[i527 - 1];
                return 0;
            case 240:
                int[] iArr216 = this.FastBitmap$CoordinateSystem;
                int i528 = this.toDoubleRange;
                int i529 = i528 + 2;
                this.toDoubleRange = i529;
                iArr216[i529 - 1] = iArr216[i529 - 3];
                iArr216[i528] = iArr216[i529 - 4];
                int i530 = i529 - 1;
                this.toDoubleRange = i530;
                iArr216[i530 - 1] = iArr216[i530 - 1] | iArr216[i530];
                this.toDoubleRange = i530 + 1;
                iArr216[i530] = 1;
                return 0;
            case 241:
                int i531 = this.toDoubleRange - 1;
                this.toDoubleRange = i531;
                int[] iArr217 = this.FastBitmap$CoordinateSystem;
                iArr217[i531 - 1] = iArr217[i531 - 1] << iArr217[i531];
                int i532 = i531 + 1;
                this.toDoubleRange = i532;
                int i533 = iArr217[i532 - 2];
                iArr217[i531] = i533;
                iArr217[i532 - 2] = iArr217[i532 - 3];
                iArr217[i532 - 3] = iArr217[i532 - 4];
                iArr217[i532 - 4] = i533;
                return 0;
            case 242:
                int[] iArr218 = this.FastBitmap$CoordinateSystem;
                int i534 = this.toDoubleRange;
                int i535 = i534 + 1;
                this.toDoubleRange = i535;
                iArr218[i534] = 41;
                iArr218[i535 - 1] = -iArr218[i535 - 1];
                return 0;
            case 243:
                int i536 = this.toDoubleRange - 1;
                this.toDoubleRange = i536;
                int[] iArr219 = this.FastBitmap$CoordinateSystem;
                iArr219[i536 - 1] = iArr219[i536 - 1] & iArr219[i536];
                int i537 = i536 - 1;
                this.toDoubleRange = i537;
                iArr219[i537 - 1] = iArr219[i537 - 1] | iArr219[i537];
                iArr219[i537 - 1] = -iArr219[i537 - 1];
                return 0;
            case 244:
                Object[] objArr23 = this.invoke;
                int i538 = this.toDoubleRange;
                int i539 = i538 + 1;
                this.toDoubleRange = i539;
                objArr23[i538] = objArr23[13];
                this.toDoubleRange = i539 + 1;
                objArr23[i539] = objArr23[14];
                return 0;
            case 245:
                int[] iArr220 = this.FastBitmap$CoordinateSystem;
                int i540 = this.toDoubleRange;
                int i541 = i540 + 1;
                this.toDoubleRange = i541;
                iArr220[i540] = 93;
                iArr220[i541 - 1] = -iArr220[i541 - 1];
                return 0;
            case 246:
                int[] iArr221 = this.FastBitmap$CoordinateSystem;
                int i542 = this.toDoubleRange;
                this.toDoubleRange = i542 + 1;
                iArr221[i542] = 13;
                return 0;
            case 247:
                int[] iArr222 = this.FastBitmap$CoordinateSystem;
                int i543 = this.toDoubleRange;
                this.toDoubleRange = i543 + 1;
                iArr222[i543] = 4;
                return 0;
            case 248:
                int[] iArr223 = this.FastBitmap$CoordinateSystem;
                int i544 = this.toDoubleRange;
                this.toDoubleRange = i544 + 1;
                iArr223[i544] = 26;
                return 0;
            case 249:
                int[] iArr224 = this.FastBitmap$CoordinateSystem;
                int i545 = this.toDoubleRange;
                this.toDoubleRange = i545 + 1;
                iArr224[i545] = 42;
                return 0;
            case SQLiteDatabase.MAX_SQL_CACHE_SIZE /*250*/:
                int[] iArr225 = this.FastBitmap$CoordinateSystem;
                int i546 = this.toDoubleRange;
                this.toDoubleRange = i546 + 1;
                iArr225[i546] = 98;
                return 0;
            case 251:
                int i547 = this.toDoubleRange - 1;
                this.toDoubleRange = i547;
                Object[] objArr24 = this.invoke;
                Object obj7 = objArr24[i547];
                objArr24[i547] = null;
                objArr24[15] = obj7;
                return 0;
            case 252:
                int i548 = this.toDoubleRange - 1;
                this.toDoubleRange = i548;
                Object[] objArr25 = this.invoke;
                Object obj8 = objArr25[i548];
                objArr25[i548] = null;
                this.setMin = obj8 == null ? 1 : 0;
                return 0;
            case 253:
                int[] iArr226 = this.FastBitmap$CoordinateSystem;
                int i549 = this.toDoubleRange;
                this.toDoubleRange = i549 + 1;
                iArr226[i549] = 66;
                return 0;
            case 254:
                int[] iArr227 = this.FastBitmap$CoordinateSystem;
                int i550 = this.toDoubleRange;
                int i551 = i550 + 1;
                this.toDoubleRange = i551;
                iArr227[i550] = 89;
                int i552 = i551 + 2;
                this.toDoubleRange = i552;
                iArr227[i552 - 1] = iArr227[i552 - 3];
                iArr227[i551] = iArr227[i552 - 4];
                int i553 = i552 + 2;
                this.toDoubleRange = i553;
                iArr227[i553 - 1] = iArr227[i553 - 3];
                iArr227[i552] = iArr227[i553 - 4];
                return 0;
            case 255:
                int[] iArr228 = this.FastBitmap$CoordinateSystem;
                int i554 = this.toDoubleRange;
                int i555 = i554 + 1;
                this.toDoubleRange = i555;
                iArr228[i554] = 115;
                iArr228[i555 - 1] = -iArr228[i555 - 1];
                int i556 = i555 + 1;
                this.toDoubleRange = i556;
                iArr228[i555] = iArr228[i556 - 2];
                return 0;
            case 256:
                int[] iArr229 = this.FastBitmap$CoordinateSystem;
                int i557 = this.toDoubleRange;
                int i558 = i557 + 1;
                this.toDoubleRange = i558;
                iArr229[i557] = 99;
                this.toDoubleRange = i558 + 1;
                iArr229[i558] = 0;
                return 0;
            case 257:
                int[] iArr230 = this.FastBitmap$CoordinateSystem;
                int i559 = this.toDoubleRange;
                int i560 = i559 + 2;
                this.toDoubleRange = i560;
                iArr230[i560 - 1] = iArr230[i560 - 3];
                iArr230[i559] = iArr230[i560 - 4];
                int i561 = i560 - 1;
                this.toDoubleRange = i561;
                iArr230[i561 - 1] = iArr230[i561] | iArr230[i561 - 1];
                return 0;
            case 258:
                int[] iArr231 = this.FastBitmap$CoordinateSystem;
                int i562 = this.toDoubleRange;
                this.toDoubleRange = i562 + 1;
                iArr231[i562] = 103;
                return 0;
            case 259:
                int[] iArr232 = this.FastBitmap$CoordinateSystem;
                int i563 = this.toDoubleRange;
                int i564 = i563 + 1;
                this.toDoubleRange = i564;
                iArr232[i563] = 41;
                iArr232[i564 - 1] = -iArr232[i564 - 1];
                int i565 = i564 + 1;
                this.toDoubleRange = i565;
                iArr232[i564] = iArr232[i565 - 2];
                return 0;
            case 260:
                int[] iArr233 = this.FastBitmap$CoordinateSystem;
                int i566 = this.toDoubleRange;
                int i567 = i566 + 1;
                this.toDoubleRange = i567;
                iArr233[i566] = iArr233[i567 - 2];
                iArr233[i567 - 1] = -iArr233[i567 - 1];
                this.toDoubleRange = i567 + 1;
                iArr233[i567] = -1;
                return 0;
            case 261:
                int i568 = this.toDoubleRange - 1;
                this.toDoubleRange = i568;
                int[] iArr234 = this.FastBitmap$CoordinateSystem;
                iArr234[i568 - 1] = iArr234[i568 - 1] ^ iArr234[i568];
                int i569 = iArr234[i568 - 1];
                iArr234[i568 - 1] = iArr234[i568 - 2];
                iArr234[i568 - 2] = i569;
                int i570 = i568 - 1;
                this.toDoubleRange = i570;
                this.invoke[i570] = null;
                return 0;
            case 262:
                int[] iArr235 = this.FastBitmap$CoordinateSystem;
                int i571 = this.toDoubleRange;
                this.toDoubleRange = i571 + 1;
                iArr235[i571] = 90;
                return 0;
            case 263:
                int[] iArr236 = this.FastBitmap$CoordinateSystem;
                int i572 = this.toDoubleRange;
                int i573 = i572 + 1;
                this.toDoubleRange = i573;
                iArr236[i572] = 65;
                int i574 = i573 + 2;
                this.toDoubleRange = i574;
                iArr236[i574 - 1] = iArr236[i574 - 3];
                iArr236[i573] = iArr236[i574 - 4];
                int i575 = i574 + 2;
                this.toDoubleRange = i575;
                iArr236[i575 - 1] = iArr236[i575 - 3];
                iArr236[i574] = iArr236[i575 - 4];
                return 0;
            case 264:
                int i576 = this.toDoubleRange - 1;
                this.toDoubleRange = i576;
                int[] iArr237 = this.FastBitmap$CoordinateSystem;
                iArr237[i576 - 1] = iArr237[i576 - 1] & iArr237[i576];
                int i577 = i576 - 1;
                this.toDoubleRange = i577;
                iArr237[i577 - 1] = iArr237[i577 - 1] | iArr237[i577];
                int i578 = i577 + 2;
                this.toDoubleRange = i578;
                iArr237[i578 - 1] = iArr237[i578 - 3];
                iArr237[i577] = iArr237[i578 - 4];
                return 0;
            case 265:
                int[] iArr238 = this.FastBitmap$CoordinateSystem;
                int i579 = this.toDoubleRange;
                this.toDoubleRange = i579 + 1;
                iArr238[i579] = iArr238[14];
                return 0;
            case 266:
                int i580 = this.toDoubleRange - 1;
                this.toDoubleRange = i580;
                Object[] objArr26 = this.invoke;
                Object obj9 = objArr26[i580];
                objArr26[i580] = null;
                objArr26[14] = obj9;
                return 0;
            case 267:
                int[] iArr239 = this.FastBitmap$CoordinateSystem;
                int i581 = this.toDoubleRange;
                int i582 = i581 + 1;
                this.toDoubleRange = i582;
                iArr239[i581] = 93;
                this.toDoubleRange = i582 + 1;
                iArr239[i582] = 0;
                return 0;
            case 268:
                int i583 = this.toDoubleRange - 1;
                this.toDoubleRange = i583;
                Object[] objArr27 = this.invoke;
                Object obj10 = objArr27[i583];
                objArr27[i583] = null;
                this.setMin = obj10 != null ? 1 : 0;
                return 0;
            case 269:
                int[] iArr240 = this.FastBitmap$CoordinateSystem;
                int i584 = this.toDoubleRange;
                this.toDoubleRange = i584 + 1;
                iArr240[i584] = 28;
                return 0;
            case 270:
                int[] iArr241 = this.FastBitmap$CoordinateSystem;
                int i585 = this.toDoubleRange;
                this.toDoubleRange = i585 + 1;
                iArr241[i585] = 36;
                return 0;
            case 271:
                int[] iArr242 = this.FastBitmap$CoordinateSystem;
                int i586 = this.toDoubleRange;
                int i587 = i586 + 1;
                this.toDoubleRange = i587;
                iArr242[i586] = 5;
                int i588 = i587 + 1;
                this.toDoubleRange = i588;
                iArr242[i587] = 4;
                int i589 = i588 - 1;
                this.toDoubleRange = i589;
                iArr242[i589 - 1] = iArr242[i589 - 1] % iArr242[i589];
                return 0;
            case LZMA_Base.kNumLenSymbols:
                int[] iArr243 = this.FastBitmap$CoordinateSystem;
                int i590 = this.toDoubleRange;
                int i591 = i590 + 1;
                this.toDoubleRange = i591;
                iArr243[i590] = 109;
                int i592 = i591 - 1;
                this.toDoubleRange = i592;
                iArr243[i592 - 1] = iArr243[i592 - 1] + iArr243[i592];
                int i593 = i592 + 1;
                this.toDoubleRange = i593;
                iArr243[i592] = iArr243[i593 - 2];
                return 0;
            case LZMA_Base.kMatchMaxLen:
                int[] iArr244 = this.FastBitmap$CoordinateSystem;
                int i594 = this.toDoubleRange;
                int i595 = i594 + 1;
                this.toDoubleRange = i595;
                iArr244[i594] = 59;
                iArr244[i595 - 1] = -iArr244[i595 - 1];
                int i596 = i595 + 1;
                this.toDoubleRange = i596;
                iArr244[i595] = iArr244[i596 - 2];
                return 0;
            case 274:
                int i597 = this.toDoubleRange - 1;
                this.toDoubleRange = i597;
                int[] iArr245 = this.FastBitmap$CoordinateSystem;
                iArr245[i597 - 1] = iArr245[i597 - 1] | iArr245[i597];
                int i598 = iArr245[i597 - 1];
                iArr245[i597 - 1] = iArr245[i597 - 2];
                iArr245[i597 - 2] = i598;
                int i599 = i597 - 1;
                this.toDoubleRange = i599;
                this.invoke[i599] = null;
                return 0;
            case 275:
                int i600 = this.toDoubleRange - 1;
                this.toDoubleRange = i600;
                int[] iArr246 = this.FastBitmap$CoordinateSystem;
                iArr246[i600 - 1] = iArr246[i600 - 1] + iArr246[i600];
                this.toDoubleRange = i600 + 1;
                iArr246[i600] = 1;
                return 0;
            case 276:
                int[] iArr247 = this.FastBitmap$CoordinateSystem;
                int i601 = this.toDoubleRange;
                iArr247[i601 - 1] = -iArr247[i601 - 1];
                int i602 = i601 - 1;
                this.toDoubleRange = i602;
                iArr247[i602 - 1] = iArr247[i602 - 1] ^ iArr247[i602];
                int i603 = i602 + 1;
                this.toDoubleRange = i603;
                int i604 = iArr247[i603 - 2];
                iArr247[i602] = i604;
                iArr247[i603 - 2] = iArr247[i603 - 3];
                iArr247[i603 - 3] = iArr247[i603 - 4];
                iArr247[i603 - 4] = i604;
                return 0;
            case 277:
                int[] iArr248 = this.FastBitmap$CoordinateSystem;
                int i605 = this.toDoubleRange;
                int i606 = i605 + 1;
                this.toDoubleRange = i606;
                iArr248[i605] = 19;
                int i607 = i606 + 2;
                this.toDoubleRange = i607;
                iArr248[i607 - 1] = iArr248[i607 - 3];
                iArr248[i606] = iArr248[i607 - 4];
                return 0;
            case 278:
                int i608 = this.toDoubleRange - 1;
                this.toDoubleRange = i608;
                int[] iArr249 = this.FastBitmap$CoordinateSystem;
                iArr249[i608 - 1] = iArr249[i608 - 1] | iArr249[i608];
                int i609 = i608 + 2;
                this.toDoubleRange = i609;
                iArr249[i609 - 1] = iArr249[i609 - 3];
                iArr249[i608] = iArr249[i609 - 4];
                return 0;
            case 279:
                int i610 = this.toDoubleRange - 1;
                this.toDoubleRange = i610;
                int[] iArr250 = this.FastBitmap$CoordinateSystem;
                iArr250[i610 - 1] = iArr250[i610 - 1] | iArr250[i610];
                int i611 = i610 - 1;
                this.toDoubleRange = i611;
                iArr250[i611 - 1] = iArr250[i611 - 1] + iArr250[i611];
                return 0;
            case 280:
                int[] iArr251 = this.FastBitmap$CoordinateSystem;
                int i612 = this.toDoubleRange;
                this.toDoubleRange = i612 + 1;
                iArr251[i612] = 35;
                return 0;
            case 281:
                int[] iArr252 = this.FastBitmap$CoordinateSystem;
                int i613 = this.toDoubleRange;
                int i614 = i613 + 1;
                this.toDoubleRange = i614;
                iArr252[i613] = 59;
                iArr252[i614 - 1] = -iArr252[i614 - 1];
                return 0;
            case 282:
                int[] iArr253 = this.FastBitmap$CoordinateSystem;
                int i615 = this.toDoubleRange;
                iArr253[i615 - 1] = -iArr253[i615 - 1];
                int i616 = i615 - 1;
                this.toDoubleRange = i616;
                iArr253[i616 - 1] = iArr253[i616 - 1] ^ iArr253[i616];
                int i617 = i616 - 1;
                this.toDoubleRange = i617;
                iArr253[i617 - 1] = iArr253[i617 - 1] - iArr253[i617];
                return 0;
            case 283:
                int[] iArr254 = this.FastBitmap$CoordinateSystem;
                int i618 = this.toDoubleRange;
                iArr254[i618 - 1] = -iArr254[i618 - 1];
                int i619 = i618 - 1;
                this.toDoubleRange = i619;
                iArr254[i619 - 1] = iArr254[i619] | iArr254[i619 - 1];
                return 0;
            case 284:
                int[] iArr255 = this.FastBitmap$CoordinateSystem;
                int i620 = this.toDoubleRange;
                this.toDoubleRange = i620 + 1;
                iArr255[i620] = 113;
                return 0;
            case 285:
                int[] iArr256 = this.FastBitmap$CoordinateSystem;
                int i621 = this.toDoubleRange;
                this.toDoubleRange = i621 + 1;
                iArr256[i621] = 22;
                return 0;
            case 286:
                this.setMin = this.FastBitmap$CoordinateSystem[this.toDoubleRange - 1];
                return 0;
            case 287:
                int[] iArr257 = this.FastBitmap$CoordinateSystem;
                int i622 = this.toDoubleRange;
                this.toDoubleRange = i622 + 1;
                iArr257[i622] = 25;
                return 0;
            case 288:
                int[] iArr258 = this.FastBitmap$CoordinateSystem;
                int i623 = this.toDoubleRange;
                int i624 = i623 + 2;
                this.toDoubleRange = i624;
                iArr258[i624 - 1] = iArr258[i624 - 3];
                iArr258[i623] = iArr258[i624 - 4];
                int i625 = i624 + 2;
                this.toDoubleRange = i625;
                iArr258[i625 - 1] = iArr258[i625 - 3];
                iArr258[i624] = iArr258[i625 - 4];
                return 0;
            case 289:
                int[] iArr259 = this.FastBitmap$CoordinateSystem;
                int i626 = this.toDoubleRange;
                this.toDoubleRange = i626 + 1;
                iArr259[i626] = 91;
                return 0;
            case 290:
                int i627 = this.toDoubleRange - 1;
                this.toDoubleRange = i627;
                this.invoke[i627] = null;
                int i628 = i627 - 1;
                this.toDoubleRange = i628;
                int[] iArr260 = this.FastBitmap$CoordinateSystem;
                iArr260[i628 - 1] = iArr260[i628 - 1] | iArr260[i628];
                int i629 = i628 - 1;
                this.toDoubleRange = i629;
                iArr260[i629 - 1] = iArr260[i629 - 1] + iArr260[i629];
                return 0;
            case 291:
                int[] iArr261 = this.FastBitmap$CoordinateSystem;
                int i630 = this.toDoubleRange;
                this.toDoubleRange = i630 + 1;
                iArr261[i630] = 10;
                return 0;
            case BuildConfig.VERSION_CODE /*292*/:
                int[] iArr262 = this.FastBitmap$CoordinateSystem;
                int i631 = this.toDoubleRange;
                this.toDoubleRange = i631 + 1;
                iArr262[i631] = 60;
                return 0;
            case 293:
                int[] iArr263 = this.FastBitmap$CoordinateSystem;
                int i632 = this.toDoubleRange;
                iArr263[i632 - 1] = -iArr263[i632 - 1];
                int i633 = i632 + 1;
                this.toDoubleRange = i633;
                iArr263[i632] = -1;
                int i634 = i633 + 2;
                this.toDoubleRange = i634;
                iArr263[i634 - 1] = iArr263[i634 - 3];
                iArr263[i633] = iArr263[i634 - 4];
                return 0;
            case 294:
                int[] iArr264 = this.FastBitmap$CoordinateSystem;
                int i635 = this.toDoubleRange;
                this.toDoubleRange = i635 + 1;
                iArr264[i635] = 45;
                return 0;
            case 295:
                int[] iArr265 = this.FastBitmap$CoordinateSystem;
                int i636 = this.toDoubleRange;
                int i637 = i636 + 1;
                this.toDoubleRange = i637;
                iArr265[i636] = 105;
                iArr265[i637 - 1] = -iArr265[i637 - 1];
                int i638 = i637 + 2;
                this.toDoubleRange = i638;
                iArr265[i638 - 1] = iArr265[i638 - 3];
                iArr265[i637] = iArr265[i638 - 4];
                return 0;
            case 296:
                int[] iArr266 = this.FastBitmap$CoordinateSystem;
                int i639 = this.toDoubleRange;
                int i640 = i639 + 1;
                this.toDoubleRange = i640;
                iArr266[i639] = 119;
                iArr266[i640 - 1] = -iArr266[i640 - 1];
                return 0;
            case 297:
                int i641 = this.toDoubleRange - 1;
                this.toDoubleRange = i641;
                int[] iArr267 = this.FastBitmap$CoordinateSystem;
                iArr267[i641 - 1] = iArr267[i641 - 1] | iArr267[i641];
                int i642 = i641 + 2;
                this.toDoubleRange = i642;
                iArr267[i642 - 1] = iArr267[i642 - 3];
                iArr267[i641] = iArr267[i642 - 4];
                int i643 = i642 - 1;
                this.toDoubleRange = i643;
                iArr267[i643 - 1] = iArr267[i643] ^ iArr267[i643 - 1];
                return 0;
            case 298:
                int[] iArr268 = this.FastBitmap$CoordinateSystem;
                int i644 = this.toDoubleRange;
                this.toDoubleRange = i644 + 1;
                iArr268[i644] = 48;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_STORE_UNKNOWN_ERROR /*299*/:
                int[] iArr269 = this.FastBitmap$CoordinateSystem;
                int i645 = this.toDoubleRange;
                int i646 = i645 + 1;
                this.toDoubleRange = i646;
                iArr269[i645] = 65;
                int i647 = i646 + 2;
                this.toDoubleRange = i647;
                iArr269[i647 - 1] = iArr269[i647 - 3];
                iArr269[i646] = iArr269[i647 - 4];
                return 0;
            case 300:
                int i648 = this.toDoubleRange - 1;
                this.toDoubleRange = i648;
                int[] iArr270 = this.FastBitmap$CoordinateSystem;
                iArr270[i648 - 1] = iArr270[i648 - 1] | iArr270[i648];
                iArr270[i648 - 1] = -iArr270[i648 - 1];
                return 0;
            case 301:
                int[] iArr271 = this.FastBitmap$CoordinateSystem;
                int i649 = this.toDoubleRange;
                iArr271[i649 - 1] = -iArr271[i649 - 1];
                int i650 = i649 - 1;
                this.toDoubleRange = i650;
                iArr271[i650 - 1] = iArr271[i650 - 1] & iArr271[i650];
                this.toDoubleRange = i650 + 1;
                iArr271[i650] = 1;
                return 0;
            case 302:
                int[] iArr272 = this.FastBitmap$CoordinateSystem;
                int i651 = this.toDoubleRange;
                int i652 = i651 + 1;
                this.toDoubleRange = i652;
                iArr272[i651] = 95;
                int i653 = i652 + 2;
                this.toDoubleRange = i653;
                iArr272[i653 - 1] = iArr272[i653 - 3];
                iArr272[i652] = iArr272[i653 - 4];
                int i654 = i653 - 1;
                this.toDoubleRange = i654;
                iArr272[i654 - 1] = iArr272[i654] & iArr272[i654 - 1];
                return 0;
            case 303:
                Object[] objArr28 = this.invoke;
                int i655 = this.toDoubleRange;
                int i656 = i655 + 1;
                this.toDoubleRange = i656;
                objArr28[i655] = objArr28[14];
                int i657 = i656 + 1;
                this.toDoubleRange = i657;
                objArr28[i656] = objArr28[i657 - 2];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE /*304*/:
                int[] iArr273 = this.FastBitmap$CoordinateSystem;
                int i658 = this.toDoubleRange;
                int i659 = i658 + 1;
                this.toDoubleRange = i659;
                iArr273[i658] = 75;
                this.toDoubleRange = i659 + 1;
                iArr273[i659] = 0;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE_DATA /*305*/:
                int i660 = this.toDoubleRange - 1;
                this.toDoubleRange = i660;
                int[] iArr274 = this.FastBitmap$CoordinateSystem;
                iArr274[i660 - 1] = iArr274[i660 - 1] << iArr274[i660];
                int i661 = i660 - 1;
                this.toDoubleRange = i661;
                this.invoke[i661] = null;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_KEY_NOT_EXISTED /*306*/:
                int[] iArr275 = this.FastBitmap$CoordinateSystem;
                int i662 = this.toDoubleRange;
                int i663 = i662 + 1;
                this.toDoubleRange = i663;
                iArr275[i662] = 7;
                int i664 = i663 + 2;
                this.toDoubleRange = i664;
                iArr275[i664 - 1] = iArr275[i664 - 3];
                iArr275[i663] = iArr275[i664 - 4];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_ILLEGEL_KEY /*307*/:
                int i665 = this.toDoubleRange - 1;
                this.toDoubleRange = i665;
                int[] iArr276 = this.FastBitmap$CoordinateSystem;
                iArr276[i665 - 1] = iArr276[i665 - 1] << iArr276[i665];
                int i666 = i665 + 2;
                this.toDoubleRange = i666;
                iArr276[i666 - 1] = iArr276[i666 - 3];
                iArr276[i665] = iArr276[i666 - 4];
                int i667 = i666 - 1;
                this.toDoubleRange = i667;
                iArr276[i667 - 1] = iArr276[i667] ^ iArr276[i667 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_NO_MEMORY /*308*/:
                int[] iArr277 = this.FastBitmap$CoordinateSystem;
                int i668 = this.toDoubleRange;
                this.toDoubleRange = i668 + 1;
                iArr277[i668] = 77;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_NO_SUCH_INDEX /*309*/:
                int[] iArr278 = this.FastBitmap$CoordinateSystem;
                int i669 = this.toDoubleRange;
                int i670 = i669 + 2;
                this.toDoubleRange = i670;
                iArr278[i670 - 1] = iArr278[i670 - 3];
                iArr278[i669] = iArr278[i670 - 4];
                int i671 = i670 + 2;
                this.toDoubleRange = i671;
                iArr278[i671 - 1] = iArr278[i671 - 3];
                iArr278[i670] = iArr278[i671 - 4];
                this.toDoubleRange = i671 + 1;
                iArr278[i671] = -1;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_INVALID_ENCRYPTED_DATA /*310*/:
                int[] iArr279 = this.FastBitmap$CoordinateSystem;
                int i672 = this.toDoubleRange;
                iArr279[i672 - 1] = -iArr279[i672 - 1];
                int i673 = i672 + 1;
                this.toDoubleRange = i673;
                iArr279[i672] = iArr279[i673 - 2];
                iArr279[i673 - 1] = -iArr279[i673 - 1];
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_DECRYPT_MISMATCH_KEY_DATA /*311*/:
                int i674 = this.toDoubleRange - 1;
                this.toDoubleRange = i674;
                this.invoke[i674] = null;
                int[] iArr280 = this.FastBitmap$CoordinateSystem;
                int i675 = iArr280[i674 - 1];
                iArr280[i674 - 1] = iArr280[i674 - 2];
                iArr280[i674 - 2] = i675;
                return 0;
            case SecExceptionCode.SEC_ERROR_STA_LOW_VERSION_DATA_FILE /*312*/:
                int[] iArr281 = this.FastBitmap$CoordinateSystem;
                int i676 = this.toDoubleRange;
                this.toDoubleRange = i676 + 1;
                iArr281[i676] = 119;
                return 0;
            case 313:
                int i677 = this.toDoubleRange - 1;
                this.toDoubleRange = i677;
                Object[] objArr29 = this.invoke;
                objArr29[i677] = null;
                this.toDoubleRange = i677 + 1;
                objArr29[i677] = null;
                return 0;
            case 314:
                int[] iArr282 = this.FastBitmap$CoordinateSystem;
                int i678 = this.toDoubleRange;
                this.toDoubleRange = i678 + 1;
                iArr282[i678] = 59;
                return 0;
            case 315:
                int[] iArr283 = this.FastBitmap$CoordinateSystem;
                int i679 = this.toDoubleRange;
                int i680 = i679 + 1;
                this.toDoubleRange = i680;
                iArr283[i679] = 121;
                int i681 = i680 + 2;
                this.toDoubleRange = i681;
                iArr283[i681 - 1] = iArr283[i681 - 3];
                iArr283[i680] = iArr283[i681 - 4];
                int i682 = i681 - 1;
                this.toDoubleRange = i682;
                iArr283[i682 - 1] = iArr283[i682] | iArr283[i682 - 1];
                return 0;
            case 316:
                int[] iArr284 = this.FastBitmap$CoordinateSystem;
                int i683 = this.toDoubleRange;
                int i684 = i683 + 1;
                this.toDoubleRange = i684;
                iArr284[i683] = 103;
                iArr284[i684 - 1] = -iArr284[i684 - 1];
                int i685 = i684 + 2;
                this.toDoubleRange = i685;
                iArr284[i685 - 1] = iArr284[i685 - 3];
                iArr284[i684] = iArr284[i685 - 4];
                return 0;
            case 317:
                int i686 = this.toDoubleRange - 1;
                this.toDoubleRange = i686;
                int[] iArr285 = this.FastBitmap$CoordinateSystem;
                iArr285[i686 - 1] = iArr285[i686 - 1] | iArr285[i686];
                int i687 = i686 - 1;
                this.toDoubleRange = i687;
                iArr285[i687 - 1] = iArr285[i687 - 1] - iArr285[i687];
                int i688 = i687 + 1;
                this.toDoubleRange = i688;
                iArr285[i687] = iArr285[i688 - 2];
                return 0;
            case 318:
                int i689 = this.toDoubleRange - 1;
                this.toDoubleRange = i689;
                Object[] objArr30 = this.invoke;
                Object obj11 = objArr30[i689];
                objArr30[i689] = null;
                objArr30[15] = obj11;
                int i690 = i689 + 1;
                this.toDoubleRange = i690;
                objArr30[i689] = objArr30[i690 - 2];
                int i691 = i690 - 1;
                this.toDoubleRange = i691;
                Object obj12 = objArr30[i691];
                objArr30[i691] = null;
                objArr30[14] = obj12;
                return 0;
            case 319:
                int[] iArr286 = this.FastBitmap$CoordinateSystem;
                int i692 = this.toDoubleRange;
                int i693 = i692 + 1;
                this.toDoubleRange = i693;
                iArr286[i692] = 119;
                iArr286[i693 - 1] = -iArr286[i693 - 1];
                int i694 = i693 + 2;
                this.toDoubleRange = i694;
                iArr286[i694 - 1] = iArr286[i694 - 3];
                iArr286[i693] = iArr286[i694 - 4];
                return 0;
            case 320:
                int[] iArr287 = this.FastBitmap$CoordinateSystem;
                int i695 = this.toDoubleRange;
                int i696 = i695 + 1;
                this.toDoubleRange = i696;
                iArr287[i695] = 75;
                iArr287[i696 - 1] = -iArr287[i696 - 1];
                int i697 = i696 + 2;
                this.toDoubleRange = i697;
                iArr287[i697 - 1] = iArr287[i697 - 3];
                iArr287[i696] = iArr287[i697 - 4];
                return 0;
            case 321:
                int i698 = this.toDoubleRange - 1;
                this.toDoubleRange = i698;
                this.invoke[i698] = null;
                int[] iArr288 = this.FastBitmap$CoordinateSystem;
                iArr288[i698 - 1] = -iArr288[i698 - 1];
                int i699 = i698 + 2;
                this.toDoubleRange = i699;
                iArr288[i699 - 1] = iArr288[i699 - 3];
                iArr288[i698] = iArr288[i699 - 4];
                return 0;
            case 322:
                Object[] objArr31 = this.invoke;
                int i700 = this.toDoubleRange;
                int i701 = i700 + 1;
                this.toDoubleRange = i701;
                objArr31[i700] = objArr31[i701 - 2];
                int[] iArr289 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i701 + 1;
                iArr289[i701] = 0;
                return 0;
            case 323:
                int i702 = this.toDoubleRange - 3;
                this.toDoubleRange = i702;
                Object[] objArr32 = this.invoke;
                Object obj13 = objArr32[i702];
                objArr32[i702] = null;
                int i703 = this.FastBitmap$CoordinateSystem[i702 + 1];
                Object obj14 = objArr32[i702 + 2];
                objArr32[i702 + 2] = null;
                ((Object[]) obj13)[i703] = obj14;
                return 0;
            case 324:
                Object[] objArr33 = this.invoke;
                int i704 = this.toDoubleRange;
                int i705 = i704 + 1;
                this.toDoubleRange = i705;
                objArr33[i704] = objArr33[i705 - 2];
                int i706 = i705 - 1;
                this.toDoubleRange = i706;
                Object obj15 = objArr33[i706];
                objArr33[i706] = null;
                objArr33[14] = obj15;
                return 0;
            case 325:
                int[] iArr290 = this.FastBitmap$CoordinateSystem;
                int i707 = this.toDoubleRange;
                int i708 = i707 + 1;
                this.toDoubleRange = i708;
                iArr290[i707] = 33;
                int i709 = i708 + 1;
                this.toDoubleRange = i709;
                iArr290[i708] = iArr290[i709 - 2];
                this.toDoubleRange = i709 + 1;
                iArr290[i709] = -1;
                return 0;
            case 326:
                int[] iArr291 = this.FastBitmap$CoordinateSystem;
                int i710 = this.toDoubleRange;
                this.toDoubleRange = i710 + 1;
                iArr291[i710] = 1;
                return 0;
            case 327:
                int[] iArr292 = this.FastBitmap$CoordinateSystem;
                int i711 = this.toDoubleRange;
                int i712 = i711 + 1;
                this.toDoubleRange = i712;
                iArr292[i711] = 5;
                int i713 = i712 + 1;
                this.toDoubleRange = i713;
                iArr292[i712] = 3;
                int i714 = i713 - 1;
                this.toDoubleRange = i714;
                iArr292[i714 - 1] = iArr292[i714 - 1] / iArr292[i714];
                return 0;
            case 328:
                int[] iArr293 = this.FastBitmap$CoordinateSystem;
                int i715 = this.toDoubleRange;
                this.toDoubleRange = i715 + 1;
                iArr293[i715] = 99;
                return 0;
            case 329:
                int[] iArr294 = this.FastBitmap$CoordinateSystem;
                int i716 = this.toDoubleRange;
                int i717 = i716 + 1;
                this.toDoubleRange = i717;
                iArr294[i716] = 23;
                iArr294[i717 - 1] = -iArr294[i717 - 1];
                int i718 = i717 + 2;
                this.toDoubleRange = i718;
                iArr294[i718 - 1] = iArr294[i718 - 3];
                iArr294[i717] = iArr294[i718 - 4];
                return 0;
            case 330:
                int i719 = this.toDoubleRange - 1;
                this.toDoubleRange = i719;
                int[] iArr295 = this.FastBitmap$CoordinateSystem;
                iArr295[i719 - 1] = iArr295[i719 - 1] & iArr295[i719];
                iArr295[i719 - 1] = -iArr295[i719 - 1];
                int i720 = i719 + 1;
                this.toDoubleRange = i720;
                iArr295[i719] = iArr295[i720 - 2];
                return 0;
            case 331:
                int[] iArr296 = this.FastBitmap$CoordinateSystem;
                int i721 = this.toDoubleRange;
                int i722 = i721 + 1;
                this.toDoubleRange = i722;
                iArr296[i721] = 63;
                iArr296[i722 - 1] = -iArr296[i722 - 1];
                return 0;
            case 332:
                Object[] objArr34 = this.invoke;
                int i723 = this.toDoubleRange;
                int i724 = i723 + 1;
                this.toDoubleRange = i724;
                objArr34[i723] = objArr34[14];
                int i725 = i724 - 1;
                this.toDoubleRange = i725;
                Object obj16 = objArr34[i725];
                objArr34[i725] = null;
                objArr34[15] = obj16;
                int i726 = i725 + 1;
                this.toDoubleRange = i726;
                objArr34[i725] = objArr34[i726 - 2];
                return 0;
            case 333:
                int i727 = this.toDoubleRange - 1;
                this.toDoubleRange = i727;
                int[] iArr297 = this.FastBitmap$CoordinateSystem;
                iArr297[i727 - 1] = iArr297[i727 - 1] & iArr297[i727];
                int i728 = i727 - 1;
                this.toDoubleRange = i728;
                iArr297[i728 - 1] = iArr297[i728 - 1] | iArr297[i728];
                int i729 = iArr297[i728 - 1];
                iArr297[i728 - 1] = iArr297[i728 - 2];
                iArr297[i728 - 2] = i729;
                return 0;
            case 334:
                int[] iArr298 = this.FastBitmap$CoordinateSystem;
                int i730 = this.toDoubleRange;
                this.toDoubleRange = i730 + 1;
                iArr298[i730] = 38;
                return 0;
            case 335:
                int[] iArr299 = this.FastBitmap$CoordinateSystem;
                int i731 = this.toDoubleRange;
                int i732 = i731 + 1;
                this.toDoubleRange = i732;
                iArr299[i731] = 95;
                int i733 = i732 + 2;
                this.toDoubleRange = i733;
                iArr299[i733 - 1] = iArr299[i733 - 3];
                iArr299[i732] = iArr299[i733 - 4];
                int i734 = i733 + 2;
                this.toDoubleRange = i734;
                iArr299[i734 - 1] = iArr299[i734 - 3];
                iArr299[i733] = iArr299[i734 - 4];
                return 0;
            case 336:
                int i735 = this.toDoubleRange - 1;
                this.toDoubleRange = i735;
                int[] iArr300 = this.FastBitmap$CoordinateSystem;
                iArr300[i735 - 1] = iArr300[i735 - 1] | iArr300[i735];
                int i736 = i735 + 1;
                this.toDoubleRange = i736;
                int i737 = iArr300[i736 - 2];
                iArr300[i735] = i737;
                iArr300[i736 - 2] = iArr300[i736 - 3];
                iArr300[i736 - 3] = iArr300[i736 - 4];
                iArr300[i736 - 4] = i737;
                int i738 = i736 - 1;
                this.toDoubleRange = i738;
                this.invoke[i738] = null;
                return 0;
            case 337:
                int[] iArr301 = this.FastBitmap$CoordinateSystem;
                int i739 = this.toDoubleRange;
                int i740 = i739 + 1;
                this.toDoubleRange = i740;
                iArr301[i739] = 81;
                int i741 = i740 + 1;
                this.toDoubleRange = i741;
                iArr301[i740] = iArr301[i741 - 2];
                return 0;
            case 338:
                Object[] objArr35 = this.invoke;
                int i742 = this.toDoubleRange;
                int i743 = i742 + 1;
                this.toDoubleRange = i743;
                objArr35[i742] = objArr35[i743 - 2];
                int[] iArr302 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i743 + 1;
                iArr302[i743] = 2;
                return 0;
            case 339:
                Object[] objArr36 = this.invoke;
                int i744 = this.toDoubleRange;
                int i745 = i744 + 1;
                this.toDoubleRange = i745;
                objArr36[i744] = objArr36[i745 - 2];
                int i746 = i745 - 1;
                this.toDoubleRange = i746;
                Object obj17 = objArr36[i746];
                objArr36[i746] = null;
                objArr36[15] = obj17;
                return 0;
            case 340:
                int[] iArr303 = this.FastBitmap$CoordinateSystem;
                int i747 = this.toDoubleRange;
                this.toDoubleRange = i747 + 1;
                iArr303[i747] = 5;
                return 0;
            case 341:
                int[] iArr304 = this.FastBitmap$CoordinateSystem;
                int i748 = this.toDoubleRange;
                this.toDoubleRange = i748 + 1;
                iArr304[i748] = 3;
                return 0;
            case 342:
                Object[] objArr37 = this.invoke;
                int i749 = this.toDoubleRange;
                int i750 = i749 + 1;
                this.toDoubleRange = i750;
                objArr37[i749] = objArr37[i750 - 2];
                int[] iArr305 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i750 + 1;
                iArr305[i750] = 1;
                return 0;
            case 343:
                int[] iArr306 = this.FastBitmap$CoordinateSystem;
                int i751 = this.toDoubleRange;
                int i752 = i751 + 1;
                this.toDoubleRange = i752;
                iArr306[i751] = 0;
                Object[] objArr38 = this.invoke;
                this.toDoubleRange = i752 + 1;
                objArr38[i752] = objArr38[13];
                return 0;
            case 344:
                int[] iArr307 = this.FastBitmap$CoordinateSystem;
                int i753 = this.toDoubleRange;
                int i754 = i753 + 1;
                this.toDoubleRange = i754;
                iArr307[i753] = 69;
                iArr307[i754 - 1] = -iArr307[i754 - 1];
                int i755 = i754 + 2;
                this.toDoubleRange = i755;
                iArr307[i755 - 1] = iArr307[i755 - 3];
                iArr307[i754] = iArr307[i755 - 4];
                return 0;
            case 345:
                int[] iArr308 = this.FastBitmap$CoordinateSystem;
                int i756 = this.toDoubleRange;
                this.toDoubleRange = i756 + 1;
                iArr308[i756] = 24;
                return 0;
            case 346:
                int i757 = this.toDoubleRange - 1;
                this.toDoubleRange = i757;
                int[] iArr309 = this.FastBitmap$CoordinateSystem;
                iArr309[i757 - 1] = iArr309[i757 - 1] ^ iArr309[i757];
                int i758 = i757 - 1;
                this.toDoubleRange = i758;
                iArr309[i758 - 1] = iArr309[i758 - 1] - iArr309[i758];
                this.toDoubleRange = i758 + 1;
                iArr309[i758] = 1;
                return 0;
            case 347:
                int[] iArr310 = this.FastBitmap$CoordinateSystem;
                int i759 = this.toDoubleRange;
                this.toDoubleRange = i759 + 1;
                iArr310[i759] = 105;
                return 0;
            case 348:
                int[] iArr311 = this.FastBitmap$CoordinateSystem;
                int i760 = this.toDoubleRange;
                this.toDoubleRange = i760 + 1;
                iArr311[i760] = 115;
                return 0;
            case 349:
                int i761 = this.toDoubleRange - 1;
                this.toDoubleRange = i761;
                int[] iArr312 = this.FastBitmap$CoordinateSystem;
                iArr312[i761 - 1] = iArr312[i761 - 1] & iArr312[i761];
                int i762 = iArr312[i761 - 1];
                iArr312[i761 - 1] = iArr312[i761 - 2];
                iArr312[i761 - 2] = i762;
                return 0;
            case 350:
                int[] iArr313 = this.FastBitmap$CoordinateSystem;
                int i763 = this.toDoubleRange;
                this.toDoubleRange = i763 + 1;
                iArr313[i763] = 87;
                return 0;
            case 351:
                int i764 = this.toDoubleRange - 1;
                this.toDoubleRange = i764;
                int[] iArr314 = this.FastBitmap$CoordinateSystem;
                iArr314[i764 - 1] = iArr314[i764 - 1] & iArr314[i764];
                int i765 = i764 - 1;
                this.toDoubleRange = i765;
                iArr314[i765 - 1] = iArr314[i765 - 1] | iArr314[i765];
                int i766 = i765 + 1;
                this.toDoubleRange = i766;
                iArr314[i765] = iArr314[i766 - 2];
                return 0;
            case 352:
                int[] iArr315 = this.FastBitmap$CoordinateSystem;
                int i767 = this.toDoubleRange;
                int i768 = i767 + 1;
                this.toDoubleRange = i768;
                iArr315[i767] = 1;
                int i769 = i768 - 1;
                this.toDoubleRange = i769;
                iArr315[i769 - 1] = iArr315[i769 - 1] - iArr315[i769];
                return 0;
            case 353:
                int[] iArr316 = this.FastBitmap$CoordinateSystem;
                int i770 = this.toDoubleRange;
                iArr316[i770 - 1] = -iArr316[i770 - 1];
                int i771 = i770 + 2;
                this.toDoubleRange = i771;
                iArr316[i771 - 1] = iArr316[i771 - 3];
                iArr316[i770] = iArr316[i771 - 4];
                int i772 = i771 - 1;
                this.toDoubleRange = i772;
                iArr316[i772 - 1] = iArr316[i772] & iArr316[i772 - 1];
                return 0;
            case 354:
                int[] iArr317 = this.FastBitmap$CoordinateSystem;
                int i773 = this.toDoubleRange;
                int i774 = i773 + 1;
                this.toDoubleRange = i774;
                iArr317[i773] = 15;
                int i775 = i774 - 1;
                this.toDoubleRange = i775;
                iArr317[i775 - 1] = iArr317[i775 - 1] + iArr317[i775];
                return 0;
            case 355:
                int[] iArr318 = this.FastBitmap$CoordinateSystem;
                int i776 = this.toDoubleRange;
                this.toDoubleRange = i776 + 1;
                iArr318[i776] = 53;
                return 0;
            case 356:
                int i777 = this.toDoubleRange - 1;
                this.toDoubleRange = i777;
                int[] iArr319 = this.FastBitmap$CoordinateSystem;
                iArr319[i777 - 1] = iArr319[i777 - 1] | iArr319[i777];
                iArr319[i777 - 1] = -iArr319[i777 - 1];
                int i778 = i777 + 2;
                this.toDoubleRange = i778;
                iArr319[i778 - 1] = iArr319[i778 - 3];
                iArr319[i777] = iArr319[i778 - 4];
                return 0;
            case 357:
                int[] iArr320 = this.FastBitmap$CoordinateSystem;
                int i779 = this.toDoubleRange;
                this.toDoubleRange = i779 + 1;
                iArr320[i779] = 49;
                return 0;
            case 358:
                int i780 = this.toDoubleRange - 1;
                this.toDoubleRange = i780;
                int[] iArr321 = this.FastBitmap$CoordinateSystem;
                iArr321[i780 - 1] = iArr321[i780 - 1] - iArr321[i780];
                int i781 = i780 + 1;
                this.toDoubleRange = i781;
                iArr321[i780] = 1;
                iArr321[i781 - 1] = -iArr321[i781 - 1];
                return 0;
            case 359:
                int[] iArr322 = this.FastBitmap$CoordinateSystem;
                int i782 = this.toDoubleRange;
                int i783 = i782 + 1;
                this.toDoubleRange = i783;
                iArr322[i782] = 35;
                int i784 = i783 + 1;
                this.toDoubleRange = i784;
                iArr322[i783] = iArr322[i784 - 2];
                this.toDoubleRange = i784 + 1;
                iArr322[i784] = -1;
                return 0;
            case AUScreenAdaptTool.WIDTH_BASE /*360*/:
                int i785 = this.toDoubleRange - 1;
                this.toDoubleRange = i785;
                this.invoke[i785] = null;
                int[] iArr323 = this.FastBitmap$CoordinateSystem;
                int i786 = i785 + 2;
                this.toDoubleRange = i786;
                iArr323[i786 - 1] = iArr323[i786 - 3];
                iArr323[i785] = iArr323[i786 - 4];
                iArr323[i786 - 1] = -iArr323[i786 - 1];
                return 0;
            case 361:
                Object[] objArr39 = this.invoke;
                int i787 = this.toDoubleRange;
                int i788 = i787 + 1;
                this.toDoubleRange = i788;
                objArr39[i787] = objArr39[14];
                int[] iArr324 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i788 + 1;
                iArr324[i788] = iArr324[15];
                return 0;
            case 362:
                int[] iArr325 = this.FastBitmap$CoordinateSystem;
                int i789 = this.toDoubleRange;
                this.toDoubleRange = i789 + 1;
                iArr325[i789] = 74;
                return 0;
            case 363:
                int[] iArr326 = this.FastBitmap$CoordinateSystem;
                int i790 = this.toDoubleRange;
                int i791 = i790 + 1;
                this.toDoubleRange = i791;
                iArr326[i790] = 0;
                int i792 = i791 - 1;
                this.toDoubleRange = i792;
                iArr326[i792 - 1] = iArr326[i792 - 1] / iArr326[i792];
                return 0;
            case 364:
                int[] iArr327 = this.FastBitmap$CoordinateSystem;
                int i793 = this.toDoubleRange;
                int i794 = i793 + 1;
                this.toDoubleRange = i794;
                iArr327[i793] = 101;
                iArr327[i794 - 1] = -iArr327[i794 - 1];
                return 0;
            case 365:
                Object[] objArr40 = this.invoke;
                int i795 = this.toDoubleRange;
                int i796 = i795 + 1;
                this.toDoubleRange = i796;
                objArr40[i795] = objArr40[13];
                int i797 = i796 + 1;
                this.toDoubleRange = i797;
                objArr40[i796] = objArr40[14];
                int[] iArr328 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i797 + 1;
                iArr328[i797] = iArr328[15];
                return 0;
            case 366:
                int[] iArr329 = this.FastBitmap$CoordinateSystem;
                int i798 = this.toDoubleRange;
                int i799 = i798 + 1;
                this.toDoubleRange = i799;
                iArr329[i798] = 77;
                iArr329[i799 - 1] = -iArr329[i799 - 1];
                int i800 = i799 + 2;
                this.toDoubleRange = i800;
                iArr329[i800 - 1] = iArr329[i800 - 3];
                iArr329[i799] = iArr329[i800 - 4];
                return 0;
            case 367:
                int[] iArr330 = this.FastBitmap$CoordinateSystem;
                int i801 = this.toDoubleRange;
                int i802 = i801 + 1;
                this.toDoubleRange = i802;
                iArr330[i801] = 39;
                iArr330[i802 - 1] = -iArr330[i802 - 1];
                int i803 = i802 + 2;
                this.toDoubleRange = i803;
                iArr330[i803 - 1] = iArr330[i803 - 3];
                iArr330[i802] = iArr330[i803 - 4];
                return 0;
            case 368:
                int i804 = this.toDoubleRange - 1;
                this.toDoubleRange = i804;
                int[] iArr331 = this.FastBitmap$CoordinateSystem;
                iArr331[i804 - 1] = iArr331[i804 - 1] | iArr331[i804];
                int i805 = i804 + 2;
                this.toDoubleRange = i805;
                iArr331[i805 - 1] = iArr331[i805 - 3];
                iArr331[i804] = iArr331[i805 - 4];
                int i806 = i805 - 1;
                this.toDoubleRange = i806;
                iArr331[i806 - 1] = iArr331[i806] | iArr331[i806 - 1];
                return 0;
            case 369:
                int[] iArr332 = this.FastBitmap$CoordinateSystem;
                int i807 = this.toDoubleRange;
                int i808 = i807 + 1;
                this.toDoubleRange = i808;
                iArr332[i807] = 5;
                iArr332[i808 - 1] = -iArr332[i808 - 1];
                return 0;
            case 370:
                int[] iArr333 = this.FastBitmap$CoordinateSystem;
                int i809 = this.toDoubleRange;
                int i810 = i809 + 1;
                this.toDoubleRange = i810;
                iArr333[i809] = 92;
                int i811 = i810 + 1;
                this.toDoubleRange = i811;
                iArr333[i810] = 0;
                int i812 = i811 - 1;
                this.toDoubleRange = i812;
                iArr333[i812 - 1] = iArr333[i812 - 1] / iArr333[i812];
                return 0;
            case 371:
                Object[] objArr41 = this.invoke;
                int i813 = this.toDoubleRange;
                int i814 = i813 + 1;
                this.toDoubleRange = i814;
                objArr41[i813] = objArr41[13];
                int[] iArr334 = this.FastBitmap$CoordinateSystem;
                this.toDoubleRange = i814 + 1;
                iArr334[i814] = iArr334[14];
                return 0;
            case 372:
                int i815 = this.toDoubleRange - 1;
                this.toDoubleRange = i815;
                int[] iArr335 = this.FastBitmap$CoordinateSystem;
                iArr335[i815 - 1] = iArr335[i815 - 1] & iArr335[i815];
                int i816 = i815 + 2;
                this.toDoubleRange = i816;
                iArr335[i816 - 1] = iArr335[i816 - 3];
                iArr335[i815] = iArr335[i816 - 4];
                return 0;
            case 373:
                int[] iArr336 = this.FastBitmap$CoordinateSystem;
                int i817 = this.toDoubleRange;
                int i818 = i817 + 1;
                this.toDoubleRange = i818;
                iArr336[i817] = 95;
                iArr336[i818 - 1] = -iArr336[i818 - 1];
                return 0;
            case 374:
                int[] iArr337 = this.FastBitmap$CoordinateSystem;
                int i819 = this.toDoubleRange;
                int i820 = i819 + 1;
                this.toDoubleRange = i820;
                iArr337[i819] = 1;
                iArr337[i820 - 1] = -iArr337[i820 - 1];
                int i821 = i820 + 2;
                this.toDoubleRange = i821;
                iArr337[i821 - 1] = iArr337[i821 - 3];
                iArr337[i820] = iArr337[i821 - 4];
                return 0;
            case 375:
                int[] iArr338 = this.FastBitmap$CoordinateSystem;
                int i822 = this.toDoubleRange;
                Object[] objArr42 = this.invoke;
                Object obj18 = objArr42[i822 - 1];
                objArr42[i822 - 1] = null;
                iArr338[i822 - 1] = ((int[]) obj18).length;
                return 0;
            case 376:
                int[] iArr339 = this.FastBitmap$CoordinateSystem;
                int i823 = this.toDoubleRange;
                this.toDoubleRange = i823 + 1;
                iArr339[i823] = 117;
                return 0;
            case 377:
                int[] iArr340 = this.FastBitmap$CoordinateSystem;
                int i824 = this.toDoubleRange;
                int i825 = i824 + 1;
                this.toDoubleRange = i825;
                iArr340[i824] = 7;
                iArr340[i825 - 1] = -iArr340[i825 - 1];
                int i826 = i825 + 2;
                this.toDoubleRange = i826;
                iArr340[i826 - 1] = iArr340[i826 - 3];
                iArr340[i825] = iArr340[i826 - 4];
                return 0;
            case 378:
                int[] iArr341 = this.FastBitmap$CoordinateSystem;
                int i827 = this.toDoubleRange;
                int i828 = i827 + 1;
                this.toDoubleRange = i828;
                iArr341[i827] = 15;
                int i829 = i828 + 1;
                this.toDoubleRange = i829;
                iArr341[i828] = 0;
                int i830 = i829 - 1;
                this.toDoubleRange = i830;
                iArr341[i830 - 1] = iArr341[i830 - 1] / iArr341[i830];
                return 0;
            case 379:
                int[] iArr342 = this.FastBitmap$CoordinateSystem;
                int i831 = this.toDoubleRange;
                int i832 = i831 + 1;
                this.toDoubleRange = i832;
                iArr342[i831] = -1;
                int i833 = i832 - 1;
                this.toDoubleRange = i833;
                iArr342[i833 - 1] = iArr342[i833 - 1] ^ iArr342[i833];
                int i834 = i833 + 1;
                this.toDoubleRange = i834;
                int i835 = iArr342[i834 - 2];
                iArr342[i833] = i835;
                iArr342[i834 - 2] = iArr342[i834 - 3];
                iArr342[i834 - 3] = iArr342[i834 - 4];
                iArr342[i834 - 4] = i835;
                return 0;
            case 380:
                int[] iArr343 = this.FastBitmap$CoordinateSystem;
                int i836 = this.toDoubleRange;
                int i837 = i836 + 1;
                this.toDoubleRange = i837;
                iArr343[i836] = 1;
                int i838 = i837 - 1;
                this.toDoubleRange = i838;
                iArr343[i838 - 1] = iArr343[i838 - 1] << iArr343[i838];
                int i839 = i838 + 2;
                this.toDoubleRange = i839;
                iArr343[i839 - 1] = iArr343[i839 - 3];
                iArr343[i838] = iArr343[i839 - 4];
                return 0;
            case 381:
                int i840 = this.toDoubleRange - 1;
                this.toDoubleRange = i840;
                this.invoke[i840] = null;
                int i841 = i840 - 1;
                this.toDoubleRange = i841;
                int[] iArr344 = this.FastBitmap$CoordinateSystem;
                iArr344[i841 - 1] = iArr344[i841 - 1] ^ iArr344[i841];
                int i842 = i841 - 1;
                this.toDoubleRange = i842;
                iArr344[i842 - 1] = iArr344[i842 - 1] - iArr344[i842];
                return 0;
            case 382:
                int[] iArr345 = this.FastBitmap$CoordinateSystem;
                int i843 = this.toDoubleRange;
                int i844 = i843 + 1;
                this.toDoubleRange = i844;
                iArr345[i843] = 99;
                int i845 = i844 + 2;
                this.toDoubleRange = i845;
                iArr345[i845 - 1] = iArr345[i845 - 3];
                iArr345[i844] = iArr345[i845 - 4];
                int i846 = i845 + 2;
                this.toDoubleRange = i846;
                iArr345[i846 - 1] = iArr345[i846 - 3];
                iArr345[i845] = iArr345[i846 - 4];
                return 0;
            case 383:
                int i847 = this.toDoubleRange - 1;
                this.toDoubleRange = i847;
                int[] iArr346 = this.FastBitmap$CoordinateSystem;
                iArr346[i847 - 1] = iArr346[i847 - 1] & iArr346[i847];
                int i848 = i847 - 1;
                this.toDoubleRange = i848;
                iArr346[i848 - 1] = iArr346[i848 - 1] - iArr346[i848];
                int i849 = i848 + 1;
                this.toDoubleRange = i849;
                iArr346[i848] = iArr346[i849 - 2];
                return 0;
            case 384:
                int[] iArr347 = this.FastBitmap$CoordinateSystem;
                int i850 = this.toDoubleRange;
                int i851 = i850 + 1;
                this.toDoubleRange = i851;
                iArr347[i850] = 107;
                iArr347[i851 - 1] = -iArr347[i851 - 1];
                int i852 = i851 + 2;
                this.toDoubleRange = i852;
                iArr347[i852 - 1] = iArr347[i852 - 3];
                iArr347[i851] = iArr347[i852 - 4];
                return 0;
            case 385:
                int[] iArr348 = this.FastBitmap$CoordinateSystem;
                int i853 = this.toDoubleRange;
                this.toDoubleRange = i853 + 1;
                iArr348[i853] = 123;
                return 0;
            case 386:
                int[] iArr349 = this.FastBitmap$CoordinateSystem;
                int i854 = this.toDoubleRange;
                int i855 = i854 + 1;
                this.toDoubleRange = i855;
                iArr349[i854] = 51;
                iArr349[i855 - 1] = -iArr349[i855 - 1];
                return 0;
            case 387:
                int[] iArr350 = this.FastBitmap$CoordinateSystem;
                int i856 = this.toDoubleRange;
                int i857 = i856 + 1;
                this.toDoubleRange = i857;
                iArr350[i856] = 11;
                int i858 = i857 + 2;
                this.toDoubleRange = i858;
                iArr350[i858 - 1] = iArr350[i858 - 3];
                iArr350[i857] = iArr350[i858 - 4];
                int i859 = i858 + 2;
                this.toDoubleRange = i859;
                iArr350[i859 - 1] = iArr350[i859 - 3];
                iArr350[i858] = iArr350[i859 - 4];
                return 0;
            case 388:
                int i860 = this.toDoubleRange - 1;
                this.toDoubleRange = i860;
                int[] iArr351 = this.FastBitmap$CoordinateSystem;
                iArr351[i860 - 1] = iArr351[i860 - 1] & iArr351[i860];
                iArr351[i860 - 1] = -iArr351[i860 - 1];
                int i861 = i860 + 2;
                this.toDoubleRange = i861;
                iArr351[i861 - 1] = iArr351[i861 - 3];
                iArr351[i860] = iArr351[i861 - 4];
                return 0;
            case 389:
                int[] iArr352 = this.FastBitmap$CoordinateSystem;
                int i862 = this.toDoubleRange;
                int i863 = i862 + 1;
                this.toDoubleRange = i863;
                iArr352[i862] = 0;
                int i864 = i863 + 1;
                this.toDoubleRange = i864;
                iArr352[i863] = 0;
                int i865 = i864 - 1;
                this.toDoubleRange = i865;
                iArr352[i865 - 1] = iArr352[i865 - 1] / iArr352[i865];
                return 0;
            case 390:
                int[] iArr353 = this.FastBitmap$CoordinateSystem;
                int i866 = this.toDoubleRange;
                int i867 = i866 + 1;
                this.toDoubleRange = i867;
                iArr353[i866] = 13;
                int i868 = i867 + 2;
                this.toDoubleRange = i868;
                iArr353[i868 - 1] = iArr353[i868 - 3];
                iArr353[i867] = iArr353[i868 - 4];
                int i869 = i868 - 1;
                this.toDoubleRange = i869;
                iArr353[i869 - 1] = iArr353[i869] ^ iArr353[i869 - 1];
                return 0;
            case 391:
                int[] iArr354 = this.FastBitmap$CoordinateSystem;
                int i870 = this.toDoubleRange;
                int i871 = i870 + 1;
                this.toDoubleRange = i871;
                iArr354[i870] = 1;
                int i872 = i871 - 1;
                this.toDoubleRange = i872;
                iArr354[i872 - 1] = iArr354[i872 - 1] << iArr354[i872];
                iArr354[i872 - 1] = -iArr354[i872 - 1];
                return 0;
            default:
                return i;
        }
        return 0;
    }
}
