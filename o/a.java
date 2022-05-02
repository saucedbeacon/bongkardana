package o;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.iap.android.aplog.util.zip.LZMA_Base;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.appsflyer.BuildConfig;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.nearbyme.model.ShopModel;
import id.dana.savings.activity.SavingsActivity;
import java.util.List;
import kotlin.Metadata;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lid/dana/data/config/model/Display;", "", "density", "", "dpi", "height", "width", "(IIII)V", "getDensity", "()I", "getDpi", "getHeight", "getWidth", "component1", "component2", "component3", "component4", "copy", "densityAndroid", "", "equals", "", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class a {
    private final int density;
    private final int dpi;
    private final int height;
    private final int width;

    /* renamed from: o.a$9  reason: invalid class name */
    public class AnonymousClass9 {
        private int FastBitmap$CoordinateSystem;
        public double IsOverlapping;
        public double equals;
        public int getMax;
        public float getMin;
        private final float[] hashCode;
        private final double[] invoke;
        private final Object[] invokeSuspend;
        public Object isInside;
        public long length;
        public int setMax;
        public long setMin;
        private final long[] toDoubleRange;
        public float toFloatRange;
        public Object toIntRange;
        private int toString;
        private final int[] values;

        public AnonymousClass9(Object obj) {
            this.values = new int[23];
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, int i) {
            int[] iArr = new int[23];
            this.values = iArr;
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            iArr[15] = i;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            int[] iArr = new int[23];
            this.values = iArr;
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            iArr[15] = i;
            objArr[16] = obj2;
            objArr[17] = obj3;
            objArr[18] = obj4;
            objArr[19] = obj5;
            objArr[20] = obj6;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2) {
            this.values = new int[23];
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2, int i) {
            int[] iArr = new int[23];
            this.values = iArr;
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            iArr[16] = i;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2, Object obj3) {
            this.values = new int[23];
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            objArr[16] = obj3;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2, Object obj3, int i) {
            int[] iArr = new int[23];
            this.values = iArr;
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            objArr[16] = obj3;
            iArr[17] = i;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2, Object obj3, Object obj4) {
            this.values = new int[23];
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            objArr[16] = obj3;
            objArr[17] = obj4;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
            int[] iArr = new int[23];
            this.values = iArr;
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            objArr[16] = obj3;
            objArr[17] = obj4;
            iArr[18] = i;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            this.values = new int[23];
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            objArr[16] = obj3;
            objArr[17] = obj4;
            objArr[18] = obj5;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            this.values = new int[23];
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            objArr[16] = obj3;
            objArr[17] = obj4;
            objArr[18] = obj5;
            objArr[19] = obj6;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
            int[] iArr = new int[23];
            this.values = iArr;
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            objArr[16] = obj3;
            objArr[17] = obj4;
            objArr[18] = obj5;
            objArr[19] = obj6;
            iArr[20] = i;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public AnonymousClass9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            this.values = new int[23];
            this.toDoubleRange = new long[23];
            this.hashCode = new float[23];
            this.invoke = new double[23];
            Object[] objArr = new Object[23];
            this.invokeSuspend = objArr;
            objArr[14] = obj;
            objArr[15] = obj2;
            objArr[16] = obj3;
            objArr[17] = obj4;
            objArr[18] = obj5;
            objArr[19] = obj6;
            objArr[20] = obj7;
            this.FastBitmap$CoordinateSystem = 0;
            this.toString = -1;
        }

        public int setMax(int i) {
            switch (i) {
                case 1:
                    int i2 = this.FastBitmap$CoordinateSystem - this.getMax;
                    this.FastBitmap$CoordinateSystem = i2;
                    this.toString = i2;
                    return 0;
                case 2:
                    Object[] objArr = this.invokeSuspend;
                    int i3 = this.toString;
                    this.toString = i3 + 1;
                    Object obj = objArr[i3];
                    objArr[i3] = null;
                    this.isInside = obj;
                    return 0;
                case 3:
                    Object[] objArr2 = this.invokeSuspend;
                    int i4 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i4 + 1;
                    objArr2[i4] = this.toIntRange;
                    return 0;
                case 4:
                    Object[] objArr3 = this.invokeSuspend;
                    int i5 = this.FastBitmap$CoordinateSystem;
                    int i6 = i5 + 1;
                    this.FastBitmap$CoordinateSystem = i6;
                    objArr3[i5] = objArr3[14];
                    int i7 = i6 + 1;
                    this.FastBitmap$CoordinateSystem = i7;
                    objArr3[i6] = objArr3[i7 - 2];
                    return 0;
                case 5:
                    Object[] objArr4 = this.invokeSuspend;
                    int i8 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i8 + 1;
                    objArr4[i8] = objArr4[16];
                    return 0;
                case 6:
                    Object[] objArr5 = this.invokeSuspend;
                    int i9 = this.FastBitmap$CoordinateSystem;
                    int i10 = i9 + 1;
                    this.FastBitmap$CoordinateSystem = i10;
                    objArr5[i9] = objArr5[17];
                    this.FastBitmap$CoordinateSystem = i10 + 1;
                    objArr5[i10] = objArr5[15];
                    return 0;
                case 7:
                    Object[] objArr6 = this.invokeSuspend;
                    int i11 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i11 + 1;
                    objArr6[i11] = objArr6[14];
                    return 0;
                case 8:
                    Object[] objArr7 = this.invokeSuspend;
                    int i12 = this.FastBitmap$CoordinateSystem;
                    int i13 = i12 + 1;
                    this.FastBitmap$CoordinateSystem = i13;
                    objArr7[i12] = objArr7[i13 - 2];
                    return 0;
                case 9:
                    int i14 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i14;
                    Object[] objArr8 = this.invokeSuspend;
                    objArr8[i14] = null;
                    int i15 = i14 - 1;
                    this.FastBitmap$CoordinateSystem = i15;
                    Object obj2 = objArr8[i15];
                    objArr8[i15] = null;
                    objArr8[15] = obj2;
                    this.FastBitmap$CoordinateSystem = i15 + 1;
                    objArr8[i15] = objArr8[15];
                    return 0;
                case 10:
                    int[] iArr = this.values;
                    int i16 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i16 + 1;
                    iArr[i16] = iArr[18];
                    return 0;
                case 11:
                    int[] iArr2 = this.values;
                    int i17 = this.toString;
                    this.toString = i17 + 1;
                    this.setMax = iArr2[i17];
                    return 0;
                case 12:
                    int[] iArr3 = this.values;
                    int i18 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i18 + 1;
                    iArr3[i18] = this.getMax;
                    return 0;
                case 13:
                    int[] iArr4 = this.values;
                    int i19 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i19 + 1;
                    iArr4[i19] = 3;
                    return 0;
                case 14:
                    int[] iArr5 = this.values;
                    int i20 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i20;
                    this.setMax = iArr5[i20];
                    return 0;
                case 15:
                    int[] iArr6 = this.values;
                    int i21 = this.FastBitmap$CoordinateSystem;
                    int i22 = i21 + 1;
                    this.FastBitmap$CoordinateSystem = i22;
                    iArr6[i21] = 61;
                    int i23 = i22 + 2;
                    this.FastBitmap$CoordinateSystem = i23;
                    iArr6[i23 - 1] = iArr6[i23 - 3];
                    iArr6[i22] = iArr6[i23 - 4];
                    return 0;
                case 16:
                    int[] iArr7 = this.values;
                    int i24 = this.FastBitmap$CoordinateSystem;
                    int i25 = i24 + 2;
                    this.FastBitmap$CoordinateSystem = i25;
                    iArr7[i25 - 1] = iArr7[i25 - 3];
                    iArr7[i24] = iArr7[i25 - 4];
                    int i26 = i25 - 1;
                    this.FastBitmap$CoordinateSystem = i26;
                    iArr7[i26 - 1] = iArr7[i26 - 1] ^ iArr7[i26];
                    int i27 = i26 + 1;
                    this.FastBitmap$CoordinateSystem = i27;
                    int i28 = iArr7[i27 - 2];
                    iArr7[i26] = i28;
                    iArr7[i27 - 2] = iArr7[i27 - 3];
                    iArr7[i27 - 3] = iArr7[i27 - 4];
                    iArr7[i27 - 4] = i28;
                    return 0;
                case 17:
                    int i29 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i29;
                    this.invokeSuspend[i29] = null;
                    return 0;
                case 18:
                    int i30 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i30;
                    int[] iArr8 = this.values;
                    iArr8[i30 - 1] = iArr8[i30] & iArr8[i30 - 1];
                    return 0;
                case 19:
                    int i31 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i31;
                    int[] iArr9 = this.values;
                    iArr9[i31 - 1] = iArr9[i31 - 1] | iArr9[i31];
                    this.FastBitmap$CoordinateSystem = i31 + 1;
                    iArr9[i31] = 1;
                    return 0;
                case 20:
                    int i32 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i32;
                    int[] iArr10 = this.values;
                    iArr10[i32 - 1] = iArr10[i32 - 1] << iArr10[i32];
                    return 0;
                case 21:
                    int[] iArr11 = this.values;
                    int i33 = this.FastBitmap$CoordinateSystem;
                    int i34 = i33 + 1;
                    this.FastBitmap$CoordinateSystem = i34;
                    int i35 = iArr11[i34 - 2];
                    iArr11[i33] = i35;
                    iArr11[i34 - 2] = iArr11[i34 - 3];
                    iArr11[i34 - 3] = iArr11[i34 - 4];
                    iArr11[i34 - 4] = i35;
                    return 0;
                case 22:
                    int i36 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i36;
                    this.invokeSuspend[i36] = null;
                    int i37 = i36 - 1;
                    this.FastBitmap$CoordinateSystem = i37;
                    int[] iArr12 = this.values;
                    iArr12[i37 - 1] = iArr12[i37 - 1] ^ iArr12[i37];
                    iArr12[i37 - 1] = -iArr12[i37 - 1];
                    return 0;
                case 23:
                    int[] iArr13 = this.values;
                    int i38 = this.FastBitmap$CoordinateSystem;
                    int i39 = i38 + 2;
                    this.FastBitmap$CoordinateSystem = i39;
                    iArr13[i39 - 1] = iArr13[i39 - 3];
                    iArr13[i38] = iArr13[i39 - 4];
                    int i40 = i39 - 1;
                    this.FastBitmap$CoordinateSystem = i40;
                    iArr13[i40 - 1] = iArr13[i40 - 1] | iArr13[i40];
                    this.FastBitmap$CoordinateSystem = i40 + 1;
                    iArr13[i40] = 1;
                    return 0;
                case 24:
                    int i41 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i41;
                    int[] iArr14 = this.values;
                    iArr14[i41 - 1] = iArr14[i41] ^ iArr14[i41 - 1];
                    return 0;
                case 25:
                    int i42 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i42;
                    int[] iArr15 = this.values;
                    iArr15[i42 - 1] = iArr15[i42 - 1] - iArr15[i42];
                    int i43 = i42 + 1;
                    this.FastBitmap$CoordinateSystem = i43;
                    iArr15[i42] = iArr15[i43 - 2];
                    return 0;
                case 26:
                    int[] iArr16 = this.values;
                    int i44 = this.FastBitmap$CoordinateSystem;
                    int i45 = i44 + 1;
                    this.FastBitmap$CoordinateSystem = i45;
                    iArr16[i44] = 128;
                    int i46 = i45 - 1;
                    this.FastBitmap$CoordinateSystem = i46;
                    iArr16[i46 - 1] = iArr16[i46 - 1] % iArr16[i46];
                    return 0;
                case 27:
                    int[] iArr17 = this.values;
                    int i47 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i47 + 1;
                    iArr17[i47] = 2;
                    return 0;
                case 28:
                    int i48 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i48;
                    this.setMax = this.values[i48] != 0 ? 1 : 0;
                    return 0;
                case 29:
                    int i49 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i49;
                    int[] iArr18 = this.values;
                    iArr18[i49 - 1] = iArr18[i49 - 1] % iArr18[i49];
                    return 0;
                case 30:
                    Object[] objArr9 = this.invokeSuspend;
                    int i50 = this.FastBitmap$CoordinateSystem;
                    int i51 = i50 + 1;
                    this.FastBitmap$CoordinateSystem = i51;
                    objArr9[i50] = objArr9[14];
                    int i52 = i51 - 1;
                    this.FastBitmap$CoordinateSystem = i52;
                    Object obj3 = objArr9[i52];
                    objArr9[i52] = null;
                    objArr9[15] = obj3;
                    return 0;
                case 31:
                    Object[] objArr10 = this.invokeSuspend;
                    int i53 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i53 + 1;
                    objArr10[i53] = objArr10[15];
                    return 0;
                case 32:
                    int[] iArr19 = this.values;
                    int i54 = this.FastBitmap$CoordinateSystem;
                    int i55 = i54 + 1;
                    this.FastBitmap$CoordinateSystem = i55;
                    iArr19[i54] = 95;
                    iArr19[i55 - 1] = -iArr19[i55 - 1];
                    return 0;
                case 33:
                    int[] iArr20 = this.values;
                    int i56 = this.FastBitmap$CoordinateSystem;
                    int i57 = i56 + 2;
                    this.FastBitmap$CoordinateSystem = i57;
                    iArr20[i57 - 1] = iArr20[i57 - 3];
                    iArr20[i56] = iArr20[i57 - 4];
                    iArr20[i57 - 1] = -iArr20[i57 - 1];
                    return 0;
                case 34:
                    int i58 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i58;
                    int[] iArr21 = this.values;
                    iArr21[i58 - 1] = iArr21[i58] | iArr21[i58 - 1];
                    return 0;
                case 35:
                    int[] iArr22 = this.values;
                    int i59 = this.FastBitmap$CoordinateSystem;
                    int i60 = i59 + 1;
                    this.FastBitmap$CoordinateSystem = i60;
                    iArr22[i59] = 1;
                    int i61 = i60 - 1;
                    this.FastBitmap$CoordinateSystem = i61;
                    iArr22[i61 - 1] = iArr22[i61 - 1] << iArr22[i61];
                    return 0;
                case 36:
                    int[] iArr23 = this.values;
                    int i62 = this.FastBitmap$CoordinateSystem;
                    int i63 = i62 + 1;
                    this.FastBitmap$CoordinateSystem = i63;
                    int i64 = iArr23[i63 - 2];
                    iArr23[i62] = i64;
                    iArr23[i63 - 2] = iArr23[i63 - 3];
                    iArr23[i63 - 3] = iArr23[i63 - 4];
                    iArr23[i63 - 4] = i64;
                    int i65 = i63 - 1;
                    this.FastBitmap$CoordinateSystem = i65;
                    this.invokeSuspend[i65] = null;
                    return 0;
                case 37:
                    int[] iArr24 = this.values;
                    int i66 = this.FastBitmap$CoordinateSystem;
                    iArr24[i66 - 1] = -iArr24[i66 - 1];
                    int i67 = i66 - 1;
                    this.FastBitmap$CoordinateSystem = i67;
                    iArr24[i67 - 1] = iArr24[i67 - 1] ^ iArr24[i67];
                    int i68 = i67 - 1;
                    this.FastBitmap$CoordinateSystem = i68;
                    iArr24[i68 - 1] = iArr24[i68 - 1] - iArr24[i68];
                    return 0;
                case 38:
                    int[] iArr25 = this.values;
                    int i69 = this.FastBitmap$CoordinateSystem;
                    int i70 = i69 + 1;
                    this.FastBitmap$CoordinateSystem = i70;
                    iArr25[i69] = iArr25[i70 - 2];
                    int i71 = i70 + 1;
                    this.FastBitmap$CoordinateSystem = i71;
                    iArr25[i70] = 128;
                    int i72 = i71 - 1;
                    this.FastBitmap$CoordinateSystem = i72;
                    iArr25[i72 - 1] = iArr25[i72 - 1] % iArr25[i72];
                    return 0;
                case 39:
                    int[] iArr26 = this.values;
                    int i73 = this.FastBitmap$CoordinateSystem;
                    int i74 = i73 + 1;
                    this.FastBitmap$CoordinateSystem = i74;
                    iArr26[i73] = 123;
                    iArr26[i74 - 1] = -iArr26[i74 - 1];
                    return 0;
                case 40:
                    int[] iArr27 = this.values;
                    int i75 = this.FastBitmap$CoordinateSystem;
                    int i76 = i75 + 2;
                    this.FastBitmap$CoordinateSystem = i76;
                    iArr27[i76 - 1] = iArr27[i76 - 3];
                    iArr27[i75] = iArr27[i76 - 4];
                    return 0;
                case 41:
                    int[] iArr28 = this.values;
                    int i77 = this.FastBitmap$CoordinateSystem;
                    iArr28[i77 - 1] = -iArr28[i77 - 1];
                    int i78 = i77 + 2;
                    this.FastBitmap$CoordinateSystem = i78;
                    iArr28[i78 - 1] = iArr28[i78 - 3];
                    iArr28[i77] = iArr28[i78 - 4];
                    this.FastBitmap$CoordinateSystem = i78 + 1;
                    iArr28[i78] = -1;
                    return 0;
                case 42:
                    int i79 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i79;
                    int[] iArr29 = this.values;
                    iArr29[i79 - 1] = iArr29[i79 - 1] ^ iArr29[i79];
                    int i80 = i79 - 1;
                    this.FastBitmap$CoordinateSystem = i80;
                    iArr29[i80 - 1] = iArr29[i80 - 1] ^ iArr29[i80];
                    int i81 = i80 - 1;
                    this.FastBitmap$CoordinateSystem = i81;
                    this.invokeSuspend[i81] = null;
                    return 0;
                case 43:
                    int i82 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i82;
                    int[] iArr30 = this.values;
                    iArr30[i82 - 1] = iArr30[i82 - 1] & iArr30[i82];
                    int i83 = i82 + 1;
                    this.FastBitmap$CoordinateSystem = i83;
                    int i84 = iArr30[i83 - 2];
                    iArr30[i82] = i84;
                    iArr30[i83 - 2] = iArr30[i83 - 3];
                    iArr30[i83 - 3] = iArr30[i83 - 4];
                    iArr30[i83 - 4] = i84;
                    return 0;
                case 44:
                    int[] iArr31 = this.values;
                    int i85 = this.FastBitmap$CoordinateSystem;
                    iArr31[i85 - 1] = -iArr31[i85 - 1];
                    int i86 = i85 + 2;
                    this.FastBitmap$CoordinateSystem = i86;
                    iArr31[i86 - 1] = iArr31[i86 - 3];
                    iArr31[i85] = iArr31[i86 - 4];
                    int i87 = i86 - 1;
                    this.FastBitmap$CoordinateSystem = i87;
                    iArr31[i87 - 1] = iArr31[i87] ^ iArr31[i87 - 1];
                    return 0;
                case 45:
                    int i88 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i88;
                    int[] iArr32 = this.values;
                    iArr32[i88 - 1] = iArr32[i88 - 1] + iArr32[i88];
                    int i89 = i88 + 1;
                    this.FastBitmap$CoordinateSystem = i89;
                    iArr32[i88] = iArr32[i89 - 2];
                    return 0;
                case 46:
                    int i90 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i90;
                    this.setMax = this.values[i90] == 0 ? 1 : 0;
                    return 0;
                case 47:
                    int[] iArr33 = this.values;
                    int i91 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i91 + 1;
                    iArr33[i91] = 92;
                    return 0;
                case 48:
                    Object[] objArr11 = this.invokeSuspend;
                    int i92 = this.FastBitmap$CoordinateSystem;
                    Object obj4 = objArr11[i92 - 1];
                    objArr11[i92 - 1] = null;
                    this.isInside = obj4;
                    return 0;
                case 49:
                    int[] iArr34 = this.values;
                    int i93 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i93 + 1;
                    iArr34[i93] = 21;
                    return 0;
                case 50:
                    break;
                case 51:
                    int[] iArr35 = this.values;
                    int i94 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i94 + 1;
                    iArr35[i94] = 25;
                    break;
                case 52:
                    int[] iArr36 = this.values;
                    int i95 = this.FastBitmap$CoordinateSystem;
                    iArr36[i95 - 1] = -iArr36[i95 - 1];
                    return 0;
                case 53:
                    int[] iArr37 = this.values;
                    int i96 = this.FastBitmap$CoordinateSystem;
                    int i97 = i96 + 2;
                    this.FastBitmap$CoordinateSystem = i97;
                    iArr37[i97 - 1] = iArr37[i97 - 3];
                    iArr37[i96] = iArr37[i97 - 4];
                    iArr37[i97 - 1] = -iArr37[i97 - 1];
                    int i98 = i97 - 1;
                    this.FastBitmap$CoordinateSystem = i98;
                    iArr37[i98 - 1] = iArr37[i98] | iArr37[i98 - 1];
                    return 0;
                case 54:
                    int[] iArr38 = this.values;
                    int i99 = this.FastBitmap$CoordinateSystem;
                    int i100 = i99 + 1;
                    this.FastBitmap$CoordinateSystem = i100;
                    int i101 = iArr38[i100 - 2];
                    iArr38[i99] = i101;
                    iArr38[i100 - 2] = iArr38[i100 - 3];
                    iArr38[i100 - 3] = iArr38[i100 - 4];
                    iArr38[i100 - 4] = i101;
                    int i102 = i100 - 1;
                    this.FastBitmap$CoordinateSystem = i102;
                    this.invokeSuspend[i102] = null;
                    iArr38[i102 - 1] = -iArr38[i102 - 1];
                    return 0;
                case 55:
                    int i103 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i103;
                    int[] iArr39 = this.values;
                    iArr39[i103 - 1] = iArr39[i103 - 1] ^ iArr39[i103];
                    int i104 = i103 - 1;
                    this.FastBitmap$CoordinateSystem = i104;
                    iArr39[i104 - 1] = iArr39[i104 - 1] - iArr39[i104];
                    int i105 = i104 + 1;
                    this.FastBitmap$CoordinateSystem = i105;
                    iArr39[i104] = iArr39[i105 - 2];
                    return 0;
                case 56:
                    int[] iArr40 = this.values;
                    int i106 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i106 + 1;
                    iArr40[i106] = 128;
                    return 0;
                case 57:
                    int[] iArr41 = this.values;
                    int i107 = this.FastBitmap$CoordinateSystem;
                    int i108 = i107 + 1;
                    this.FastBitmap$CoordinateSystem = i108;
                    iArr41[i107] = 2;
                    int i109 = i108 - 1;
                    this.FastBitmap$CoordinateSystem = i109;
                    iArr41[i109 - 1] = iArr41[i109 - 1] % iArr41[i109];
                    return 0;
                case 58:
                    int[] iArr42 = this.values;
                    int i110 = this.FastBitmap$CoordinateSystem;
                    int i111 = i110 + 1;
                    this.FastBitmap$CoordinateSystem = i111;
                    iArr42[i110] = 125;
                    int i112 = i111 + 2;
                    this.FastBitmap$CoordinateSystem = i112;
                    iArr42[i112 - 1] = iArr42[i112 - 3];
                    iArr42[i111] = iArr42[i112 - 4];
                    int i113 = i112 - 1;
                    this.FastBitmap$CoordinateSystem = i113;
                    iArr42[i113 - 1] = iArr42[i113] ^ iArr42[i113 - 1];
                    return 0;
                case 59:
                    int i114 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i114;
                    int[] iArr43 = this.values;
                    iArr43[i114 - 1] = iArr43[i114 - 1] & iArr43[i114];
                    this.FastBitmap$CoordinateSystem = i114 + 1;
                    iArr43[i114] = 1;
                    return 0;
                case 60:
                    int i115 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i115;
                    int[] iArr44 = this.values;
                    iArr44[i115 - 1] = iArr44[i115 - 1] + iArr44[i115];
                    return 0;
                case 61:
                    int[] iArr45 = this.values;
                    int i116 = this.FastBitmap$CoordinateSystem;
                    int i117 = i116 + 1;
                    this.FastBitmap$CoordinateSystem = i117;
                    iArr45[i116] = iArr45[i117 - 2];
                    return 0;
                case 62:
                    int[] iArr46 = this.values;
                    int i118 = this.FastBitmap$CoordinateSystem;
                    int i119 = i118 + 1;
                    this.FastBitmap$CoordinateSystem = i119;
                    iArr46[i118] = 89;
                    int i120 = i119 + 1;
                    this.FastBitmap$CoordinateSystem = i120;
                    iArr46[i119] = 0;
                    int i121 = i120 - 1;
                    this.FastBitmap$CoordinateSystem = i121;
                    iArr46[i121 - 1] = iArr46[i121 - 1] / iArr46[i121];
                    return 0;
                case 63:
                    Object[] objArr12 = this.invokeSuspend;
                    int i122 = this.FastBitmap$CoordinateSystem;
                    int i123 = i122 + 1;
                    this.FastBitmap$CoordinateSystem = i123;
                    objArr12[i122] = null;
                    Object obj5 = objArr12[i123 - 1];
                    objArr12[i123 - 1] = null;
                    this.values[i123 - 1] = ((int[]) obj5).length;
                    int i124 = i123 - 1;
                    this.FastBitmap$CoordinateSystem = i124;
                    objArr12[i124] = null;
                    return 0;
                case 64:
                    int[] iArr47 = this.values;
                    int i125 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i125 + 1;
                    iArr47[i125] = 32;
                    return 0;
                case 65:
                    int[] iArr48 = this.values;
                    int i126 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i126 + 1;
                    iArr48[i126] = 111;
                    return 0;
                case 66:
                    int[] iArr49 = this.values;
                    int i127 = this.FastBitmap$CoordinateSystem;
                    iArr49[i127 - 1] = -iArr49[i127 - 1];
                    int i128 = i127 + 2;
                    this.FastBitmap$CoordinateSystem = i128;
                    iArr49[i128 - 1] = iArr49[i128 - 3];
                    iArr49[i127] = iArr49[i128 - 4];
                    return 0;
                case 67:
                    int i129 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i129;
                    int[] iArr50 = this.values;
                    iArr50[i129 - 1] = iArr50[i129 - 1] ^ iArr50[i129];
                    int i130 = i129 + 1;
                    this.FastBitmap$CoordinateSystem = i130;
                    int i131 = iArr50[i130 - 2];
                    iArr50[i129] = i131;
                    iArr50[i130 - 2] = iArr50[i130 - 3];
                    iArr50[i130 - 3] = iArr50[i130 - 4];
                    iArr50[i130 - 4] = i131;
                    int i132 = i130 - 1;
                    this.FastBitmap$CoordinateSystem = i132;
                    this.invokeSuspend[i132] = null;
                    return 0;
                case 68:
                    int[] iArr51 = this.values;
                    int i133 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i133 + 1;
                    iArr51[i133] = 1;
                    return 0;
                case 69:
                    int i134 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i134;
                    int[] iArr52 = this.values;
                    iArr52[i134 - 1] = iArr52[i134 - 1] << iArr52[i134];
                    int i135 = i134 + 1;
                    this.FastBitmap$CoordinateSystem = i135;
                    int i136 = iArr52[i135 - 2];
                    iArr52[i134] = i136;
                    iArr52[i135 - 2] = iArr52[i135 - 3];
                    iArr52[i135 - 3] = iArr52[i135 - 4];
                    iArr52[i135 - 4] = i136;
                    int i137 = i135 - 1;
                    this.FastBitmap$CoordinateSystem = i137;
                    this.invokeSuspend[i137] = null;
                    return 0;
                case 70:
                    int i138 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i138;
                    int[] iArr53 = this.values;
                    iArr53[i138 - 1] = iArr53[i138 - 1] - iArr53[i138];
                    int i139 = i138 + 1;
                    this.FastBitmap$CoordinateSystem = i139;
                    iArr53[i138] = iArr53[i139 - 2];
                    this.FastBitmap$CoordinateSystem = i139 + 1;
                    iArr53[i139] = 128;
                    return 0;
                case 71:
                    int[] iArr54 = this.values;
                    int i140 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i140 + 1;
                    iArr54[i140] = 81;
                    return 0;
                case 72:
                    int[] iArr55 = this.values;
                    int i141 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i141 + 1;
                    iArr55[i141] = 0;
                    return 0;
                case 73:
                    int[] iArr56 = this.values;
                    int i142 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i142 + 1;
                    iArr56[i142] = 53;
                    return 0;
                case 74:
                    int i143 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i143;
                    int[] iArr57 = this.values;
                    iArr57[i143 - 1] = iArr57[i143 - 1] << iArr57[i143];
                    int i144 = i143 + 1;
                    this.FastBitmap$CoordinateSystem = i144;
                    int i145 = iArr57[i144 - 2];
                    iArr57[i143] = i145;
                    iArr57[i144 - 2] = iArr57[i144 - 3];
                    iArr57[i144 - 3] = iArr57[i144 - 4];
                    iArr57[i144 - 4] = i145;
                    return 0;
                case 75:
                    int[] iArr58 = this.values;
                    int i146 = this.FastBitmap$CoordinateSystem;
                    int i147 = iArr58[i146 - 1];
                    iArr58[i146 - 1] = iArr58[i146 - 2];
                    iArr58[i146 - 2] = i147;
                    return 0;
                case 76:
                    int[] iArr59 = this.values;
                    int i148 = this.FastBitmap$CoordinateSystem;
                    int i149 = i148 + 1;
                    this.FastBitmap$CoordinateSystem = i149;
                    iArr59[i148] = -1;
                    int i150 = i149 - 1;
                    this.FastBitmap$CoordinateSystem = i150;
                    iArr59[i150 - 1] = iArr59[i150] ^ iArr59[i150 - 1];
                    return 0;
                case 77:
                    int[] iArr60 = this.values;
                    int i151 = this.FastBitmap$CoordinateSystem;
                    int i152 = i151 + 1;
                    this.FastBitmap$CoordinateSystem = i152;
                    iArr60[i151] = iArr60[i152 - 2];
                    iArr60[i152 - 1] = -iArr60[i152 - 1];
                    return 0;
                case 78:
                    int[] iArr61 = this.values;
                    int i153 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i153 + 1;
                    iArr61[i153] = -1;
                    return 0;
                case 79:
                    int[] iArr62 = this.values;
                    int i154 = this.FastBitmap$CoordinateSystem;
                    int i155 = iArr62[i154 - 1];
                    iArr62[i154 - 1] = iArr62[i154 - 2];
                    iArr62[i154 - 2] = i155;
                    int i156 = i154 - 1;
                    this.FastBitmap$CoordinateSystem = i156;
                    this.invokeSuspend[i156] = null;
                    return 0;
                case 80:
                    int i157 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i157;
                    int[] iArr63 = this.values;
                    iArr63[i157 - 1] = iArr63[i157 - 1] - iArr63[i157];
                    int i158 = i157 + 1;
                    this.FastBitmap$CoordinateSystem = i158;
                    iArr63[i157] = 1;
                    int i159 = i158 - 1;
                    this.FastBitmap$CoordinateSystem = i159;
                    iArr63[i159 - 1] = iArr63[i159 - 1] - iArr63[i159];
                    return 0;
                case 81:
                    int[] iArr64 = this.values;
                    int i160 = this.FastBitmap$CoordinateSystem;
                    int i161 = i160 + 1;
                    this.FastBitmap$CoordinateSystem = i161;
                    iArr64[i160] = 61;
                    this.FastBitmap$CoordinateSystem = i161 + 1;
                    iArr64[i161] = 0;
                    return 0;
                case 82:
                    int i162 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i162;
                    int[] iArr65 = this.values;
                    iArr65[i162 - 1] = iArr65[i162 - 1] / iArr65[i162];
                    return 0;
                case 83:
                    int[] iArr66 = this.values;
                    int i163 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i163 + 1;
                    iArr66[i163] = 20;
                    return 0;
                case 84:
                    int[] iArr67 = this.values;
                    int i164 = this.FastBitmap$CoordinateSystem;
                    int i165 = i164 + 1;
                    this.FastBitmap$CoordinateSystem = i165;
                    iArr67[i164] = 2;
                    int i166 = i165 + 1;
                    this.FastBitmap$CoordinateSystem = i166;
                    iArr67[i165] = 2;
                    int i167 = i166 - 1;
                    this.FastBitmap$CoordinateSystem = i167;
                    iArr67[i167 - 1] = iArr67[i167 - 1] % iArr67[i167];
                    return 0;
                case 85:
                    for (int i168 = this.FastBitmap$CoordinateSystem - 1; i168 >= 0; i168--) {
                        this.invokeSuspend[i168] = null;
                    }
                    this.FastBitmap$CoordinateSystem = 0;
                    Object[] objArr13 = this.invokeSuspend;
                    this.FastBitmap$CoordinateSystem = 0 + 1;
                    objArr13[0] = this.toIntRange;
                    return 0;
                case 86:
                    int[] iArr68 = this.values;
                    int i169 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i169 + 1;
                    iArr68[i169] = 5;
                    return 0;
                case 87:
                    int i170 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i170;
                    Object[] objArr14 = this.invokeSuspend;
                    objArr14[i170] = null;
                    int i171 = i170 - 1;
                    this.FastBitmap$CoordinateSystem = i171;
                    Object obj6 = objArr14[i171];
                    objArr14[i171] = null;
                    objArr14[15] = obj6;
                    return 0;
                case 88:
                    int[] iArr69 = this.values;
                    int i172 = this.FastBitmap$CoordinateSystem;
                    int i173 = i172 + 1;
                    this.FastBitmap$CoordinateSystem = i173;
                    iArr69[i172] = 0;
                    int i174 = i173 + 1;
                    this.FastBitmap$CoordinateSystem = i174;
                    iArr69[i173] = 0;
                    int i175 = i174 - 1;
                    this.FastBitmap$CoordinateSystem = i175;
                    iArr69[i175 - 1] = iArr69[i175 - 1] / iArr69[i175];
                    return 0;
                case 89:
                    int[] iArr70 = this.values;
                    int i176 = this.FastBitmap$CoordinateSystem;
                    int i177 = i176 + 1;
                    this.FastBitmap$CoordinateSystem = i177;
                    iArr70[i176] = 2;
                    this.FastBitmap$CoordinateSystem = i177 + 1;
                    iArr70[i177] = 2;
                    return 0;
                case 90:
                    int i178 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i178;
                    int[] iArr71 = this.values;
                    iArr71[i178 - 1] = iArr71[i178 - 1] % iArr71[i178];
                    int i179 = i178 - 1;
                    this.FastBitmap$CoordinateSystem = i179;
                    this.invokeSuspend[i179] = null;
                    return 0;
                case 91:
                    Object[] objArr15 = this.invokeSuspend;
                    int i180 = this.FastBitmap$CoordinateSystem;
                    int i181 = i180 + 1;
                    this.FastBitmap$CoordinateSystem = i181;
                    objArr15[i180] = objArr15[14];
                    this.FastBitmap$CoordinateSystem = i181 + 1;
                    objArr15[i181] = objArr15[15];
                    return 0;
                case 92:
                    Object[] objArr16 = this.invokeSuspend;
                    int i182 = this.FastBitmap$CoordinateSystem;
                    int i183 = i182 + 1;
                    this.FastBitmap$CoordinateSystem = i183;
                    objArr16[i182] = null;
                    Object obj7 = objArr16[i183 - 1];
                    objArr16[i183 - 1] = null;
                    this.values[i183 - 1] = ((int[]) obj7).length;
                    return 0;
                case 93:
                    int[] iArr72 = this.values;
                    int i184 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i184 + 1;
                    iArr72[i184] = 27;
                    return 0;
                case 94:
                    int i185 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i185;
                    int[] iArr73 = this.values;
                    iArr73[i185 - 1] = iArr73[i185 - 1] | iArr73[i185];
                    int i186 = i185 + 1;
                    this.FastBitmap$CoordinateSystem = i186;
                    iArr73[i185] = 1;
                    int i187 = i186 - 1;
                    this.FastBitmap$CoordinateSystem = i187;
                    iArr73[i187 - 1] = iArr73[i187 - 1] << iArr73[i187];
                    return 0;
                case 95:
                    int i188 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i188;
                    this.invokeSuspend[i188] = null;
                    int[] iArr74 = this.values;
                    iArr74[i188 - 1] = -iArr74[i188 - 1];
                    int i189 = i188 - 1;
                    this.FastBitmap$CoordinateSystem = i189;
                    iArr74[i189 - 1] = iArr74[i189] ^ iArr74[i189 - 1];
                    return 0;
                case 96:
                    int i190 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i190;
                    int[] iArr75 = this.values;
                    iArr75[i190 - 1] = iArr75[i190 - 1] - iArr75[i190];
                    int i191 = i190 + 1;
                    this.FastBitmap$CoordinateSystem = i191;
                    iArr75[i190] = 1;
                    int i192 = i191 + 2;
                    this.FastBitmap$CoordinateSystem = i192;
                    iArr75[i192 - 1] = iArr75[i192 - 3];
                    iArr75[i191] = iArr75[i192 - 4];
                    return 0;
                case 97:
                    int[] iArr76 = this.values;
                    int i193 = this.FastBitmap$CoordinateSystem;
                    iArr76[i193 - 1] = -iArr76[i193 - 1];
                    int i194 = i193 - 1;
                    this.FastBitmap$CoordinateSystem = i194;
                    iArr76[i194 - 1] = iArr76[i194] & iArr76[i194 - 1];
                    return 0;
                case 98:
                    int i195 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i195;
                    this.invokeSuspend[i195] = null;
                    int[] iArr77 = this.values;
                    iArr77[i195 - 1] = -iArr77[i195 - 1];
                    int i196 = i195 - 1;
                    this.FastBitmap$CoordinateSystem = i196;
                    iArr77[i196 - 1] = iArr77[i196] | iArr77[i196 - 1];
                    return 0;
                case 99:
                    int[] iArr78 = this.values;
                    int i197 = this.FastBitmap$CoordinateSystem;
                    int i198 = i197 + 1;
                    this.FastBitmap$CoordinateSystem = i198;
                    iArr78[i197] = iArr78[i198 - 2];
                    this.FastBitmap$CoordinateSystem = i198 + 1;
                    iArr78[i198] = 128;
                    return 0;
                case 100:
                    int[] iArr79 = this.values;
                    int i199 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i199 + 1;
                    iArr79[i199] = 115;
                    return 0;
                case 101:
                    int[] iArr80 = this.values;
                    int i200 = this.FastBitmap$CoordinateSystem;
                    int i201 = i200 + 2;
                    this.FastBitmap$CoordinateSystem = i201;
                    iArr80[i201 - 1] = iArr80[i201 - 3];
                    iArr80[i200] = iArr80[i201 - 4];
                    int i202 = i201 + 2;
                    this.FastBitmap$CoordinateSystem = i202;
                    iArr80[i202 - 1] = iArr80[i202 - 3];
                    iArr80[i201] = iArr80[i202 - 4];
                    return 0;
                case 102:
                    int i203 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i203;
                    this.invokeSuspend[i203] = null;
                    int i204 = i203 - 1;
                    this.FastBitmap$CoordinateSystem = i204;
                    int[] iArr81 = this.values;
                    iArr81[i204 - 1] = iArr81[i204 - 1] & iArr81[i204];
                    int i205 = i204 - 1;
                    this.FastBitmap$CoordinateSystem = i205;
                    iArr81[i205 - 1] = iArr81[i205] | iArr81[i205 - 1];
                    return 0;
                case 103:
                    int[] iArr82 = this.values;
                    int i206 = this.FastBitmap$CoordinateSystem;
                    int i207 = i206 + 1;
                    this.FastBitmap$CoordinateSystem = i207;
                    iArr82[i206] = -1;
                    int i208 = i207 - 1;
                    this.FastBitmap$CoordinateSystem = i208;
                    iArr82[i208 - 1] = iArr82[i208 - 1] ^ iArr82[i208];
                    int i209 = i208 - 1;
                    this.FastBitmap$CoordinateSystem = i209;
                    iArr82[i209 - 1] = iArr82[i209] & iArr82[i209 - 1];
                    return 0;
                case 104:
                    int i210 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i210;
                    int[] iArr83 = this.values;
                    iArr83[i210 - 1] = iArr83[i210 - 1] ^ iArr83[i210];
                    int i211 = i210 - 1;
                    this.FastBitmap$CoordinateSystem = i211;
                    iArr83[i211 - 1] = iArr83[i211 - 1] & iArr83[i211];
                    int i212 = i211 - 1;
                    this.FastBitmap$CoordinateSystem = i212;
                    iArr83[i212 - 1] = iArr83[i212] | iArr83[i212 - 1];
                    return 0;
                case 105:
                    int[] iArr84 = this.values;
                    int i213 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i213 + 1;
                    iArr84[i213] = 69;
                    return 0;
                case 106:
                    int[] iArr85 = this.values;
                    int i214 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i214 + 1;
                    iArr85[i214] = 91;
                    return 0;
                case 107:
                    int[] iArr86 = this.values;
                    int i215 = this.FastBitmap$CoordinateSystem;
                    int i216 = i215 + 2;
                    this.FastBitmap$CoordinateSystem = i216;
                    iArr86[i216 - 1] = iArr86[i216 - 3];
                    iArr86[i215] = iArr86[i216 - 4];
                    int i217 = i216 + 2;
                    this.FastBitmap$CoordinateSystem = i217;
                    iArr86[i217 - 1] = iArr86[i217 - 3];
                    iArr86[i216] = iArr86[i217 - 4];
                    this.FastBitmap$CoordinateSystem = i217 + 1;
                    iArr86[i217] = -1;
                    return 0;
                case 108:
                    int i218 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i218;
                    this.invokeSuspend[i218] = null;
                    int[] iArr87 = this.values;
                    int i219 = iArr87[i218 - 1];
                    iArr87[i218 - 1] = iArr87[i218 - 2];
                    iArr87[i218 - 2] = i219;
                    return 0;
                case 109:
                    int i220 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i220;
                    int[] iArr88 = this.values;
                    iArr88[i220 - 1] = iArr88[i220 - 1] ^ iArr88[i220];
                    int i221 = i220 - 1;
                    this.FastBitmap$CoordinateSystem = i221;
                    iArr88[i221 - 1] = iArr88[i221] & iArr88[i221 - 1];
                    return 0;
                case 110:
                    int i222 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i222;
                    int[] iArr89 = this.values;
                    iArr89[i222 - 1] = iArr89[i222 - 1] | iArr89[i222];
                    int i223 = i222 + 1;
                    this.FastBitmap$CoordinateSystem = i223;
                    int i224 = iArr89[i223 - 2];
                    iArr89[i222] = i224;
                    iArr89[i223 - 2] = iArr89[i223 - 3];
                    iArr89[i223 - 3] = iArr89[i223 - 4];
                    iArr89[i223 - 4] = i224;
                    return 0;
                case 111:
                    int[] iArr90 = this.values;
                    int i225 = this.FastBitmap$CoordinateSystem;
                    int i226 = i225 + 1;
                    this.FastBitmap$CoordinateSystem = i226;
                    iArr90[i225] = -1;
                    int i227 = i226 - 1;
                    this.FastBitmap$CoordinateSystem = i227;
                    iArr90[i227 - 1] = iArr90[i227 - 1] ^ iArr90[i227];
                    int i228 = i227 - 1;
                    this.FastBitmap$CoordinateSystem = i228;
                    iArr90[i228 - 1] = iArr90[i228] ^ iArr90[i228 - 1];
                    return 0;
                case 112:
                    int i229 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i229;
                    int[] iArr91 = this.values;
                    iArr91[i229 - 1] = iArr91[i229 - 1] & iArr91[i229];
                    int i230 = i229 + 1;
                    this.FastBitmap$CoordinateSystem = i230;
                    iArr91[i229] = 1;
                    int i231 = i230 - 1;
                    this.FastBitmap$CoordinateSystem = i231;
                    iArr91[i231 - 1] = iArr91[i231 - 1] << iArr91[i231];
                    return 0;
                case 113:
                    Object[] objArr17 = this.invokeSuspend;
                    int i232 = this.FastBitmap$CoordinateSystem;
                    int i233 = i232 + 1;
                    this.FastBitmap$CoordinateSystem = i233;
                    objArr17[i232] = objArr17[14];
                    int i234 = i233 - 1;
                    this.FastBitmap$CoordinateSystem = i234;
                    Object obj8 = objArr17[i234];
                    objArr17[i234] = null;
                    objArr17[16] = obj8;
                    return 0;
                case 114:
                    int i235 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i235;
                    this.invokeSuspend[i235] = null;
                    int[] iArr92 = this.values;
                    int i236 = iArr92[i235 - 1];
                    iArr92[i235 - 1] = iArr92[i235 - 2];
                    iArr92[i235 - 2] = i236;
                    this.FastBitmap$CoordinateSystem = i235 + 1;
                    iArr92[i235] = -1;
                    return 0;
                case 115:
                    int i237 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i237;
                    int[] iArr93 = this.values;
                    iArr93[i237 - 1] = iArr93[i237 - 1] | iArr93[i237];
                    int i238 = i237 + 1;
                    this.FastBitmap$CoordinateSystem = i238;
                    int i239 = iArr93[i238 - 2];
                    iArr93[i237] = i239;
                    iArr93[i238 - 2] = iArr93[i238 - 3];
                    iArr93[i238 - 3] = iArr93[i238 - 4];
                    iArr93[i238 - 4] = i239;
                    int i240 = i238 - 1;
                    this.FastBitmap$CoordinateSystem = i240;
                    this.invokeSuspend[i240] = null;
                    return 0;
                case 116:
                    int i241 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i241;
                    int[] iArr94 = this.values;
                    iArr94[i241 - 1] = iArr94[i241 - 1] << iArr94[i241];
                    int i242 = i241 + 2;
                    this.FastBitmap$CoordinateSystem = i242;
                    iArr94[i242 - 1] = iArr94[i242 - 3];
                    iArr94[i241] = iArr94[i242 - 4];
                    int i243 = i242 - 1;
                    this.FastBitmap$CoordinateSystem = i243;
                    iArr94[i243 - 1] = iArr94[i243] & iArr94[i243 - 1];
                    return 0;
                case 117:
                    int i244 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i244;
                    this.invokeSuspend[i244] = null;
                    int i245 = i244 - 1;
                    this.FastBitmap$CoordinateSystem = i245;
                    int[] iArr95 = this.values;
                    iArr95[i245 - 1] = iArr95[i245 - 1] | iArr95[i245];
                    int i246 = i245 - 1;
                    this.FastBitmap$CoordinateSystem = i246;
                    iArr95[i246 - 1] = iArr95[i246 - 1] + iArr95[i246];
                    return 0;
                case 118:
                    int[] iArr96 = this.values;
                    int i247 = this.FastBitmap$CoordinateSystem;
                    int i248 = i247 + 1;
                    this.FastBitmap$CoordinateSystem = i248;
                    iArr96[i247] = 99;
                    iArr96[i248 - 1] = -iArr96[i248 - 1];
                    int i249 = i248 + 2;
                    this.FastBitmap$CoordinateSystem = i249;
                    iArr96[i249 - 1] = iArr96[i249 - 3];
                    iArr96[i248] = iArr96[i249 - 4];
                    return 0;
                case 119:
                    int i250 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i250;
                    int[] iArr97 = this.values;
                    iArr97[i250 - 1] = iArr97[i250 - 1] ^ iArr97[i250];
                    int i251 = i250 - 1;
                    this.FastBitmap$CoordinateSystem = i251;
                    iArr97[i251 - 1] = iArr97[i251] ^ iArr97[i251 - 1];
                    return 0;
                case 120:
                    int i252 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i252;
                    int[] iArr98 = this.values;
                    iArr98[i252 - 1] = iArr98[i252 - 1] & iArr98[i252];
                    int i253 = i252 - 1;
                    this.FastBitmap$CoordinateSystem = i253;
                    iArr98[i253 - 1] = iArr98[i253] | iArr98[i253 - 1];
                    return 0;
                case 121:
                    int[] iArr99 = this.values;
                    int i254 = this.FastBitmap$CoordinateSystem;
                    int i255 = i254 + 1;
                    this.FastBitmap$CoordinateSystem = i255;
                    iArr99[i254] = 2;
                    int i256 = i255 - 1;
                    this.FastBitmap$CoordinateSystem = i256;
                    iArr99[i256 - 1] = iArr99[i256 - 1] % iArr99[i256];
                    int i257 = i256 - 1;
                    this.FastBitmap$CoordinateSystem = i257;
                    this.invokeSuspend[i257] = null;
                    return 0;
                case 122:
                    int[] iArr100 = this.values;
                    int i258 = this.FastBitmap$CoordinateSystem;
                    int i259 = i258 + 1;
                    this.FastBitmap$CoordinateSystem = i259;
                    iArr100[i258] = 119;
                    iArr100[i259 - 1] = -iArr100[i259 - 1];
                    return 0;
                case 123:
                    int i260 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i260;
                    int[] iArr101 = this.values;
                    iArr101[i260 - 1] = iArr101[i260 - 1] ^ iArr101[i260];
                    int i261 = i260 + 1;
                    this.FastBitmap$CoordinateSystem = i261;
                    int i262 = iArr101[i261 - 2];
                    iArr101[i260] = i262;
                    iArr101[i261 - 2] = iArr101[i261 - 3];
                    iArr101[i261 - 3] = iArr101[i261 - 4];
                    iArr101[i261 - 4] = i262;
                    return 0;
                case 124:
                    int[] iArr102 = this.values;
                    int i263 = this.FastBitmap$CoordinateSystem;
                    int i264 = i263 + 2;
                    this.FastBitmap$CoordinateSystem = i264;
                    iArr102[i264 - 1] = iArr102[i264 - 3];
                    iArr102[i263] = iArr102[i264 - 4];
                    int i265 = i264 - 1;
                    this.FastBitmap$CoordinateSystem = i265;
                    iArr102[i265 - 1] = iArr102[i265] & iArr102[i265 - 1];
                    return 0;
                case 125:
                    int i266 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i266;
                    this.invokeSuspend[i266] = null;
                    int i267 = i266 - 1;
                    this.FastBitmap$CoordinateSystem = i267;
                    int[] iArr103 = this.values;
                    iArr103[i267 - 1] = iArr103[i267 - 1] | iArr103[i267];
                    int i268 = i267 - 1;
                    this.FastBitmap$CoordinateSystem = i268;
                    iArr103[i268 - 1] = iArr103[i268] & iArr103[i268 - 1];
                    return 0;
                case 126:
                    int[] iArr104 = this.values;
                    int i269 = this.FastBitmap$CoordinateSystem;
                    iArr104[i269 - 1] = -iArr104[i269 - 1];
                    int i270 = i269 - 1;
                    this.FastBitmap$CoordinateSystem = i270;
                    iArr104[i270 - 1] = iArr104[i270] | iArr104[i270 - 1];
                    return 0;
                case 127:
                    int i271 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i271;
                    int[] iArr105 = this.values;
                    iArr105[i271 - 1] = iArr105[i271 - 1] + iArr105[i271];
                    int i272 = i271 + 1;
                    this.FastBitmap$CoordinateSystem = i272;
                    iArr105[i271] = iArr105[i272 - 2];
                    this.FastBitmap$CoordinateSystem = i272 + 1;
                    iArr105[i272] = 128;
                    return 0;
                case 128:
                    int i273 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i273;
                    Object[] objArr18 = this.invokeSuspend;
                    Object obj9 = objArr18[i273];
                    objArr18[i273] = null;
                    objArr18[16] = obj9;
                    return 0;
                case TsExtractor.TS_STREAM_TYPE_AC3 /*129*/:
                    Object[] objArr19 = this.invokeSuspend;
                    int i274 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i274 + 1;
                    objArr19[i274] = objArr19[17];
                    return 0;
                case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /*130*/:
                    int[] iArr106 = this.values;
                    int i275 = this.FastBitmap$CoordinateSystem;
                    int i276 = i275 + 1;
                    this.FastBitmap$CoordinateSystem = i276;
                    iArr106[i275] = 101;
                    int i277 = i276 + 2;
                    this.FastBitmap$CoordinateSystem = i277;
                    iArr106[i277 - 1] = iArr106[i277 - 3];
                    iArr106[i276] = iArr106[i277 - 4];
                    return 0;
                case 131:
                    int[] iArr107 = this.values;
                    int i278 = this.FastBitmap$CoordinateSystem;
                    int i279 = i278 + 2;
                    this.FastBitmap$CoordinateSystem = i279;
                    iArr107[i279 - 1] = iArr107[i279 - 3];
                    iArr107[i278] = iArr107[i279 - 4];
                    int i280 = i279 + 1;
                    this.FastBitmap$CoordinateSystem = i280;
                    iArr107[i279] = -1;
                    int i281 = i280 - 1;
                    this.FastBitmap$CoordinateSystem = i281;
                    iArr107[i281 - 1] = iArr107[i281] ^ iArr107[i281 - 1];
                    return 0;
                case 132:
                    int i282 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i282;
                    int[] iArr108 = this.values;
                    iArr108[i282 - 1] = iArr108[i282 - 1] ^ iArr108[i282];
                    int i283 = i282 - 1;
                    this.FastBitmap$CoordinateSystem = i283;
                    this.invokeSuspend[i283] = null;
                    return 0;
                case 133:
                    int[] iArr109 = this.values;
                    int i284 = this.FastBitmap$CoordinateSystem;
                    int i285 = i284 + 1;
                    this.FastBitmap$CoordinateSystem = i285;
                    int i286 = iArr109[i285 - 2];
                    iArr109[i284] = i286;
                    iArr109[i285 - 2] = iArr109[i285 - 3];
                    iArr109[i285 - 3] = iArr109[i285 - 4];
                    iArr109[i285 - 4] = i286;
                    int i287 = i285 - 1;
                    this.FastBitmap$CoordinateSystem = i287;
                    this.invokeSuspend[i287] = null;
                    int i288 = i287 + 2;
                    this.FastBitmap$CoordinateSystem = i288;
                    iArr109[i288 - 1] = iArr109[i288 - 3];
                    iArr109[i287] = iArr109[i288 - 4];
                    return 0;
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /*134*/:
                    int i289 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i289;
                    this.invokeSuspend[i289] = null;
                    int i290 = i289 - 1;
                    this.FastBitmap$CoordinateSystem = i290;
                    int[] iArr110 = this.values;
                    iArr110[i290 - 1] = iArr110[i290] & iArr110[i290 - 1];
                    return 0;
                case TsExtractor.TS_STREAM_TYPE_E_AC3 /*135*/:
                    int i291 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i291;
                    this.invokeSuspend[i291] = null;
                    int[] iArr111 = this.values;
                    iArr111[i291 - 1] = -iArr111[i291 - 1];
                    return 0;
                case 136:
                    int i292 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i292;
                    int[] iArr112 = this.values;
                    iArr112[i292 - 1] = iArr112[i292 - 1] | iArr112[i292];
                    int i293 = i292 - 1;
                    this.FastBitmap$CoordinateSystem = i293;
                    iArr112[i293 - 1] = iArr112[i293 - 1] + iArr112[i293];
                    int i294 = i293 + 1;
                    this.FastBitmap$CoordinateSystem = i294;
                    iArr112[i293] = iArr112[i294 - 2];
                    return 0;
                case 137:
                    Object[] objArr20 = this.invokeSuspend;
                    int i295 = this.FastBitmap$CoordinateSystem;
                    int i296 = i295 + 1;
                    this.FastBitmap$CoordinateSystem = i296;
                    objArr20[i295] = objArr20[15];
                    int i297 = i296 + 1;
                    this.FastBitmap$CoordinateSystem = i297;
                    objArr20[i296] = objArr20[17];
                    this.FastBitmap$CoordinateSystem = i297 + 1;
                    objArr20[i297] = objArr20[18];
                    return 0;
                case TsExtractor.TS_STREAM_TYPE_DTS /*138*/:
                    Object[] objArr21 = this.invokeSuspend;
                    int i298 = this.FastBitmap$CoordinateSystem;
                    int i299 = i298 + 1;
                    this.FastBitmap$CoordinateSystem = i299;
                    objArr21[i298] = objArr21[19];
                    int i300 = i299 - 1;
                    this.FastBitmap$CoordinateSystem = i300;
                    Object obj10 = objArr21[i300];
                    objArr21[i300] = null;
                    objArr21[16] = obj10;
                    int i301 = i300 - 1;
                    this.FastBitmap$CoordinateSystem = i301;
                    Object obj11 = objArr21[i301];
                    objArr21[i301] = null;
                    objArr21[15] = obj11;
                    return 0;
                case 139:
                    int i302 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i302;
                    Object[] objArr22 = this.invokeSuspend;
                    Object obj12 = objArr22[i302];
                    objArr22[i302] = null;
                    objArr22[18] = obj12;
                    int i303 = i302 - 1;
                    this.FastBitmap$CoordinateSystem = i303;
                    Object obj13 = objArr22[i303];
                    objArr22[i303] = null;
                    objArr22[19] = obj13;
                    return 0;
                case SavingsActivity.RV_BENEFIT_WIDTH /*140*/:
                    int i304 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i304;
                    Object[] objArr23 = this.invokeSuspend;
                    Object obj14 = objArr23[i304];
                    objArr23[i304] = null;
                    objArr23[20] = obj14;
                    this.FastBitmap$CoordinateSystem = i304 + 1;
                    objArr23[i304] = objArr23[20];
                    return 0;
                case 141:
                    Object[] objArr24 = this.invokeSuspend;
                    int i305 = this.FastBitmap$CoordinateSystem;
                    int i306 = i305 + 1;
                    this.FastBitmap$CoordinateSystem = i306;
                    objArr24[i305] = objArr24[19];
                    int i307 = i306 + 1;
                    this.FastBitmap$CoordinateSystem = i307;
                    objArr24[i306] = objArr24[18];
                    this.FastBitmap$CoordinateSystem = i307 + 1;
                    objArr24[i307] = objArr24[15];
                    return 0;
                case 142:
                    int i308 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i308;
                    Object[] objArr25 = this.invokeSuspend;
                    Object obj15 = objArr25[i308];
                    objArr25[i308] = null;
                    objArr25[16] = obj15;
                    this.FastBitmap$CoordinateSystem = i308 + 1;
                    objArr25[i308] = objArr25[16];
                    return 0;
                case 143:
                    int[] iArr113 = this.values;
                    int i309 = this.FastBitmap$CoordinateSystem;
                    int i310 = i309 + 1;
                    this.FastBitmap$CoordinateSystem = i310;
                    iArr113[i309] = 53;
                    int i311 = i310 + 2;
                    this.FastBitmap$CoordinateSystem = i311;
                    iArr113[i311 - 1] = iArr113[i311 - 3];
                    iArr113[i310] = iArr113[i311 - 4];
                    int i312 = i311 - 1;
                    this.FastBitmap$CoordinateSystem = i312;
                    iArr113[i312 - 1] = iArr113[i312] ^ iArr113[i312 - 1];
                    return 0;
                case 144:
                    int[] iArr114 = this.values;
                    int i313 = this.FastBitmap$CoordinateSystem;
                    int i314 = i313 + 2;
                    this.FastBitmap$CoordinateSystem = i314;
                    iArr114[i314 - 1] = iArr114[i314 - 3];
                    iArr114[i313] = iArr114[i314 - 4];
                    this.FastBitmap$CoordinateSystem = i314 + 1;
                    iArr114[i314] = -1;
                    return 0;
                case 145:
                    int i315 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i315;
                    this.invokeSuspend[i315] = null;
                    int i316 = i315 - 1;
                    this.FastBitmap$CoordinateSystem = i316;
                    int[] iArr115 = this.values;
                    iArr115[i316 - 1] = iArr115[i316 - 1] & iArr115[i316];
                    this.FastBitmap$CoordinateSystem = i316 + 1;
                    iArr115[i316] = 1;
                    return 0;
                case 146:
                    int i317 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i317;
                    Object[] objArr26 = this.invokeSuspend;
                    Object obj16 = objArr26[i317];
                    objArr26[i317] = null;
                    objArr26[15] = obj16;
                    return 0;
                case 147:
                    Object[] objArr27 = this.invokeSuspend;
                    int i318 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i318 + 1;
                    objArr27[i318] = null;
                    return 0;
                case 148:
                    int i319 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i319;
                    this.invokeSuspend[i319] = null;
                    int i320 = i319 - 1;
                    this.FastBitmap$CoordinateSystem = i320;
                    int[] iArr116 = this.values;
                    iArr116[i320 - 1] = iArr116[i320 - 1] & iArr116[i320];
                    int i321 = i320 + 1;
                    this.FastBitmap$CoordinateSystem = i321;
                    int i322 = iArr116[i321 - 2];
                    iArr116[i320] = i322;
                    iArr116[i321 - 2] = iArr116[i321 - 3];
                    iArr116[i321 - 3] = iArr116[i321 - 4];
                    iArr116[i321 - 4] = i322;
                    return 0;
                case 149:
                    int i323 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i323;
                    int[] iArr117 = this.values;
                    iArr117[i323 - 1] = iArr117[i323 - 1] & iArr117[i323];
                    int i324 = i323 - 1;
                    this.FastBitmap$CoordinateSystem = i324;
                    iArr117[i324 - 1] = iArr117[i324 - 1] | iArr117[i324];
                    iArr117[i324 - 1] = -iArr117[i324 - 1];
                    return 0;
                case 150:
                    int[] iArr118 = this.values;
                    int i325 = this.FastBitmap$CoordinateSystem;
                    int i326 = i325 + 1;
                    this.FastBitmap$CoordinateSystem = i326;
                    iArr118[i325] = 53;
                    iArr118[i326 - 1] = -iArr118[i326 - 1];
                    int i327 = i326 + 2;
                    this.FastBitmap$CoordinateSystem = i327;
                    iArr118[i327 - 1] = iArr118[i327 - 3];
                    iArr118[i326] = iArr118[i327 - 4];
                    return 0;
                case 151:
                    int i328 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i328;
                    int[] iArr119 = this.values;
                    iArr119[i328 - 1] = iArr119[i328 - 1] & iArr119[i328];
                    int i329 = i328 + 1;
                    this.FastBitmap$CoordinateSystem = i329;
                    iArr119[i328] = iArr119[i329 - 2];
                    iArr119[i329 - 1] = -iArr119[i329 - 1];
                    return 0;
                case 152:
                    int i330 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i330;
                    int[] iArr120 = this.values;
                    iArr120[i330 - 1] = iArr120[i330 - 1] ^ iArr120[i330];
                    int i331 = iArr120[i330 - 1];
                    iArr120[i330 - 1] = iArr120[i330 - 2];
                    iArr120[i330 - 2] = i331;
                    return 0;
                case 153:
                    int[] iArr121 = this.values;
                    int i332 = this.FastBitmap$CoordinateSystem;
                    int i333 = i332 + 1;
                    this.FastBitmap$CoordinateSystem = i333;
                    iArr121[i332] = 37;
                    iArr121[i333 - 1] = -iArr121[i333 - 1];
                    return 0;
                case 154:
                    int i334 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i334;
                    int[] iArr122 = this.values;
                    iArr122[i334 - 1] = iArr122[i334 - 1] ^ iArr122[i334];
                    int i335 = iArr122[i334 - 1];
                    iArr122[i334 - 1] = iArr122[i334 - 2];
                    iArr122[i334 - 2] = i335;
                    int i336 = i334 - 1;
                    this.FastBitmap$CoordinateSystem = i336;
                    this.invokeSuspend[i336] = null;
                    return 0;
                case 155:
                    int i337 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i337;
                    int[] iArr123 = this.values;
                    iArr123[i337 - 1] = iArr123[i337 - 1] - iArr123[i337];
                    return 0;
                case 156:
                    int[] iArr124 = this.values;
                    int i338 = this.FastBitmap$CoordinateSystem;
                    int i339 = i338 + 1;
                    this.FastBitmap$CoordinateSystem = i339;
                    iArr124[i338] = 1;
                    int i340 = i339 - 1;
                    this.FastBitmap$CoordinateSystem = i340;
                    iArr124[i340 - 1] = iArr124[i340 - 1] - iArr124[i340];
                    return 0;
                case 157:
                    int[] iArr125 = this.values;
                    int i341 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i341 + 1;
                    iArr125[i341] = 51;
                    return 0;
                case 158:
                    int[] iArr126 = this.values;
                    int i342 = this.FastBitmap$CoordinateSystem;
                    iArr126[i342 - 1] = -iArr126[i342 - 1];
                    int i343 = i342 + 1;
                    this.FastBitmap$CoordinateSystem = i343;
                    iArr126[i342] = iArr126[i343 - 2];
                    return 0;
                case 159:
                    int[] iArr127 = this.values;
                    int i344 = this.FastBitmap$CoordinateSystem;
                    iArr127[i344 - 1] = -iArr127[i344 - 1];
                    int i345 = i344 + 1;
                    this.FastBitmap$CoordinateSystem = i345;
                    iArr127[i344] = -1;
                    int i346 = i345 + 2;
                    this.FastBitmap$CoordinateSystem = i346;
                    iArr127[i346 - 1] = iArr127[i346 - 3];
                    iArr127[i345] = iArr127[i346 - 4];
                    return 0;
                case BlobStatic.MONITOR_IMAGE_WIDTH /*160*/:
                    int i347 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i347;
                    int[] iArr128 = this.values;
                    iArr128[i347 - 1] = iArr128[i347 - 1] & iArr128[i347];
                    this.FastBitmap$CoordinateSystem = i347 + 1;
                    iArr128[i347] = -1;
                    return 0;
                case 161:
                    int[] iArr129 = this.values;
                    int i348 = this.FastBitmap$CoordinateSystem;
                    int i349 = i348 + 1;
                    this.FastBitmap$CoordinateSystem = i349;
                    int i350 = iArr129[i349 - 2];
                    iArr129[i348] = i350;
                    iArr129[i349 - 2] = iArr129[i349 - 3];
                    iArr129[i349 - 3] = iArr129[i349 - 4];
                    iArr129[i349 - 4] = i350;
                    int i351 = i349 - 1;
                    this.FastBitmap$CoordinateSystem = i351;
                    this.invokeSuspend[i351] = null;
                    int i352 = i351 - 1;
                    this.FastBitmap$CoordinateSystem = i352;
                    iArr129[i352 - 1] = iArr129[i352] | iArr129[i352 - 1];
                    return 0;
                case 162:
                    int i353 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i353;
                    int[] iArr130 = this.values;
                    iArr130[i353 - 1] = iArr130[i353 - 1] & iArr130[i353];
                    int i354 = iArr130[i353 - 1];
                    iArr130[i353 - 1] = iArr130[i353 - 2];
                    iArr130[i353 - 2] = i354;
                    int i355 = i353 - 1;
                    this.FastBitmap$CoordinateSystem = i355;
                    this.invokeSuspend[i355] = null;
                    return 0;
                case 163:
                    int[] iArr131 = this.values;
                    int i356 = this.FastBitmap$CoordinateSystem;
                    int i357 = i356 + 1;
                    this.FastBitmap$CoordinateSystem = i357;
                    iArr131[i356] = 1;
                    int i358 = i357 - 1;
                    this.FastBitmap$CoordinateSystem = i358;
                    iArr131[i358 - 1] = iArr131[i358 - 1] << iArr131[i358];
                    int i359 = i358 + 1;
                    this.FastBitmap$CoordinateSystem = i359;
                    int i360 = iArr131[i359 - 2];
                    iArr131[i358] = i360;
                    iArr131[i359 - 2] = iArr131[i359 - 3];
                    iArr131[i359 - 3] = iArr131[i359 - 4];
                    iArr131[i359 - 4] = i360;
                    return 0;
                case 164:
                    int[] iArr132 = this.values;
                    int i361 = this.FastBitmap$CoordinateSystem;
                    int i362 = i361 + 1;
                    this.FastBitmap$CoordinateSystem = i362;
                    iArr132[i361] = 1;
                    iArr132[i362 - 1] = -iArr132[i362 - 1];
                    int i363 = i362 + 1;
                    this.FastBitmap$CoordinateSystem = i363;
                    iArr132[i362] = iArr132[i363 - 2];
                    return 0;
                case 165:
                    int[] iArr133 = this.values;
                    int i364 = this.FastBitmap$CoordinateSystem;
                    int i365 = i364 + 1;
                    this.FastBitmap$CoordinateSystem = i365;
                    iArr133[i364] = -1;
                    int i366 = i365 - 1;
                    this.FastBitmap$CoordinateSystem = i366;
                    iArr133[i366 - 1] = iArr133[i366 - 1] ^ iArr133[i366];
                    int i367 = iArr133[i366 - 1];
                    iArr133[i366 - 1] = iArr133[i366 - 2];
                    iArr133[i366 - 2] = i367;
                    return 0;
                case 166:
                    int i368 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i368;
                    this.invokeSuspend[i368] = null;
                    int i369 = i368 - 1;
                    this.FastBitmap$CoordinateSystem = i369;
                    int[] iArr134 = this.values;
                    iArr134[i369 - 1] = iArr134[i369 - 1] - iArr134[i369];
                    return 0;
                case 167:
                    int[] iArr135 = this.values;
                    int i370 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i370 + 1;
                    iArr135[i370] = 39;
                    return 0;
                case 168:
                    int[] iArr136 = this.values;
                    int i371 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i371 + 1;
                    iArr136[i371] = 0;
                    return 0;
                case 169:
                    int[] iArr137 = this.values;
                    int i372 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i372 + 1;
                    iArr137[i372] = 55;
                    return 0;
                case 170:
                    int i373 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i373;
                    int[] iArr138 = this.values;
                    iArr138[i373 - 1] = iArr138[i373 - 1] & iArr138[i373];
                    int i374 = i373 + 1;
                    this.FastBitmap$CoordinateSystem = i374;
                    int i375 = iArr138[i374 - 2];
                    iArr138[i373] = i375;
                    iArr138[i374 - 2] = iArr138[i374 - 3];
                    iArr138[i374 - 3] = iArr138[i374 - 4];
                    iArr138[i374 - 4] = i375;
                    int i376 = i374 - 1;
                    this.FastBitmap$CoordinateSystem = i376;
                    this.invokeSuspend[i376] = null;
                    return 0;
                case 171:
                    int i377 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i377;
                    int[] iArr139 = this.values;
                    iArr139[i377 - 1] = iArr139[i377 - 1] & iArr139[i377];
                    int i378 = i377 - 1;
                    this.FastBitmap$CoordinateSystem = i378;
                    iArr139[i378 - 1] = iArr139[i378 - 1] | iArr139[i378];
                    int i379 = i378 - 1;
                    this.FastBitmap$CoordinateSystem = i379;
                    iArr139[i379 - 1] = iArr139[i379 - 1] + iArr139[i379];
                    return 0;
                case 172:
                    int[] iArr140 = this.values;
                    int i380 = this.FastBitmap$CoordinateSystem;
                    int i381 = i380 + 1;
                    this.FastBitmap$CoordinateSystem = i381;
                    iArr140[i380] = 95;
                    int i382 = i381 + 2;
                    this.FastBitmap$CoordinateSystem = i382;
                    iArr140[i382 - 1] = iArr140[i382 - 3];
                    iArr140[i381] = iArr140[i382 - 4];
                    return 0;
                case 173:
                    int[] iArr141 = this.values;
                    int i383 = this.FastBitmap$CoordinateSystem;
                    int i384 = i383 + 2;
                    this.FastBitmap$CoordinateSystem = i384;
                    iArr141[i384 - 1] = iArr141[i384 - 3];
                    iArr141[i383] = iArr141[i384 - 4];
                    int i385 = i384 - 1;
                    this.FastBitmap$CoordinateSystem = i385;
                    iArr141[i385 - 1] = iArr141[i385 - 1] & iArr141[i385];
                    this.FastBitmap$CoordinateSystem = i385 + 1;
                    iArr141[i385] = -1;
                    return 0;
                case 174:
                    int i386 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i386;
                    this.invokeSuspend[i386] = null;
                    int[] iArr142 = this.values;
                    int i387 = i386 + 2;
                    this.FastBitmap$CoordinateSystem = i387;
                    iArr142[i387 - 1] = iArr142[i387 - 3];
                    iArr142[i386] = iArr142[i387 - 4];
                    this.FastBitmap$CoordinateSystem = i387 + 1;
                    iArr142[i387] = -1;
                    return 0;
                case 175:
                    int i388 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i388;
                    int[] iArr143 = this.values;
                    iArr143[i388 - 1] = iArr143[i388 - 1] ^ iArr143[i388];
                    int i389 = i388 - 1;
                    this.FastBitmap$CoordinateSystem = i389;
                    this.invokeSuspend[i389] = null;
                    int i390 = i389 - 1;
                    this.FastBitmap$CoordinateSystem = i390;
                    iArr143[i390 - 1] = iArr143[i390] & iArr143[i390 - 1];
                    return 0;
                case 176:
                    int i391 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i391;
                    int[] iArr144 = this.values;
                    iArr144[i391 - 1] = iArr144[i391 - 1] << iArr144[i391];
                    iArr144[i391 - 1] = -iArr144[i391 - 1];
                    return 0;
                case 177:
                    int[] iArr145 = this.values;
                    int i392 = this.FastBitmap$CoordinateSystem;
                    int i393 = i392 + 1;
                    this.FastBitmap$CoordinateSystem = i393;
                    iArr145[i392] = 21;
                    int i394 = i393 + 1;
                    this.FastBitmap$CoordinateSystem = i394;
                    iArr145[i393] = iArr145[i394 - 2];
                    this.FastBitmap$CoordinateSystem = i394 + 1;
                    iArr145[i394] = -1;
                    return 0;
                case 178:
                    int[] iArr146 = this.values;
                    int i395 = this.FastBitmap$CoordinateSystem;
                    int i396 = iArr146[i395 - 1];
                    iArr146[i395 - 1] = iArr146[i395 - 2];
                    iArr146[i395 - 2] = i396;
                    int i397 = i395 - 1;
                    this.FastBitmap$CoordinateSystem = i397;
                    this.invokeSuspend[i397] = null;
                    int i398 = i397 - 1;
                    this.FastBitmap$CoordinateSystem = i398;
                    iArr146[i398 - 1] = iArr146[i398 - 1] - iArr146[i398];
                    return 0;
                case 179:
                    int[] iArr147 = this.values;
                    int i399 = this.FastBitmap$CoordinateSystem;
                    int i400 = i399 + 1;
                    this.FastBitmap$CoordinateSystem = i400;
                    iArr147[i399] = 1;
                    iArr147[i400 - 1] = -iArr147[i400 - 1];
                    return 0;
                case 180:
                    int[] iArr148 = this.values;
                    int i401 = this.FastBitmap$CoordinateSystem;
                    int i402 = i401 + 1;
                    this.FastBitmap$CoordinateSystem = i402;
                    iArr148[i401] = iArr148[i402 - 2];
                    this.FastBitmap$CoordinateSystem = i402 + 1;
                    iArr148[i402] = -1;
                    return 0;
                case 181:
                    int i403 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i403;
                    this.invokeSuspend[i403] = null;
                    int i404 = i403 - 1;
                    this.FastBitmap$CoordinateSystem = i404;
                    int[] iArr149 = this.values;
                    iArr149[i404 - 1] = iArr149[i404 - 1] - iArr149[i404];
                    this.FastBitmap$CoordinateSystem = i404 + 1;
                    iArr149[i404] = 1;
                    return 0;
                case 182:
                    int i405 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i405;
                    Object[] objArr28 = this.invokeSuspend;
                    Object obj17 = objArr28[i405];
                    objArr28[i405] = null;
                    objArr28[15] = obj17;
                    this.FastBitmap$CoordinateSystem = i405 + 1;
                    objArr28[i405] = objArr28[15];
                    return 0;
                case 183:
                    int[] iArr150 = this.values;
                    int i406 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i406 + 1;
                    iArr150[i406] = 35;
                    return 0;
                case 184:
                    int[] iArr151 = this.values;
                    int i407 = this.FastBitmap$CoordinateSystem;
                    int i408 = i407 + 1;
                    this.FastBitmap$CoordinateSystem = i408;
                    iArr151[i407] = iArr151[17];
                    this.FastBitmap$CoordinateSystem = i408 + 1;
                    iArr151[i408] = 1000;
                    return 0;
                case WSContextConstant.HANDSHAKE_RECEIVE_SIZE /*185*/:
                    int i409 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i409;
                    int[] iArr152 = this.values;
                    iArr152[i409 - 1] = iArr152[i409 - 1] * iArr152[i409];
                    return 0;
                case 186:
                    int[] iArr153 = this.values;
                    int i410 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i410 + 1;
                    iArr153[i410] = 103;
                    return 0;
                case 187:
                    int[] iArr154 = this.values;
                    int i411 = this.FastBitmap$CoordinateSystem;
                    iArr154[i411 - 1] = -iArr154[i411 - 1];
                    int i412 = i411 - 1;
                    this.FastBitmap$CoordinateSystem = i412;
                    iArr154[i412 - 1] = iArr154[i412 - 1] ^ iArr154[i412];
                    int i413 = i412 + 1;
                    this.FastBitmap$CoordinateSystem = i413;
                    int i414 = iArr154[i413 - 2];
                    iArr154[i412] = i414;
                    iArr154[i413 - 2] = iArr154[i413 - 3];
                    iArr154[i413 - 3] = iArr154[i413 - 4];
                    iArr154[i413 - 4] = i414;
                    return 0;
                case TsExtractor.TS_PACKET_SIZE /*188*/:
                    int[] iArr155 = this.values;
                    int i415 = this.FastBitmap$CoordinateSystem;
                    int i416 = i415 + 1;
                    this.FastBitmap$CoordinateSystem = i416;
                    iArr155[i415] = 1;
                    int i417 = i416 - 1;
                    this.FastBitmap$CoordinateSystem = i417;
                    iArr155[i417 - 1] = iArr155[i417 - 1] << iArr155[i417];
                    int i418 = i417 - 1;
                    this.FastBitmap$CoordinateSystem = i418;
                    iArr155[i418 - 1] = iArr155[i418 - 1] + iArr155[i418];
                    return 0;
                case 189:
                    int i419 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i419;
                    Object[] objArr29 = this.invokeSuspend;
                    objArr29[i419] = null;
                    int i420 = i419 - 1;
                    this.FastBitmap$CoordinateSystem = i420;
                    Object obj18 = objArr29[i420];
                    objArr29[i420] = null;
                    objArr29[16] = obj18;
                    this.FastBitmap$CoordinateSystem = i420 + 1;
                    objArr29[i420] = objArr29[16];
                    return 0;
                case 190:
                    int[] iArr156 = this.values;
                    int i421 = this.FastBitmap$CoordinateSystem;
                    Object[] objArr30 = this.invokeSuspend;
                    Object obj19 = objArr30[i421 - 1];
                    objArr30[i421 - 1] = null;
                    iArr156[i421 - 1] = ((int[]) obj19).length;
                    int i422 = i421 - 1;
                    this.FastBitmap$CoordinateSystem = i422;
                    objArr30[i422] = null;
                    return 0;
                case 191:
                    int i423 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i423;
                    this.invokeSuspend[i423] = null;
                    int[] iArr157 = this.values;
                    iArr157[i423 - 1] = -iArr157[i423 - 1];
                    int i424 = i423 - 1;
                    this.FastBitmap$CoordinateSystem = i424;
                    iArr157[i424 - 1] = iArr157[i424] & iArr157[i424 - 1];
                    return 0;
                case PsExtractor.AUDIO_STREAM /*192*/:
                    int[] iArr158 = this.values;
                    int i425 = this.FastBitmap$CoordinateSystem;
                    int i426 = i425 + 1;
                    this.FastBitmap$CoordinateSystem = i426;
                    iArr158[i425] = 19;
                    int i427 = i426 + 2;
                    this.FastBitmap$CoordinateSystem = i427;
                    iArr158[i427 - 1] = iArr158[i427 - 3];
                    iArr158[i426] = iArr158[i427 - 4];
                    int i428 = i427 + 2;
                    this.FastBitmap$CoordinateSystem = i428;
                    iArr158[i428 - 1] = iArr158[i428 - 3];
                    iArr158[i427] = iArr158[i428 - 4];
                    return 0;
                case 193:
                    int i429 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i429;
                    int[] iArr159 = this.values;
                    iArr159[i429 - 1] = iArr159[i429 - 1] & iArr159[i429];
                    int i430 = i429 + 1;
                    this.FastBitmap$CoordinateSystem = i430;
                    iArr159[i429] = -1;
                    int i431 = i430 - 1;
                    this.FastBitmap$CoordinateSystem = i431;
                    iArr159[i431 - 1] = iArr159[i431] ^ iArr159[i431 - 1];
                    return 0;
                case 194:
                    int i432 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i432;
                    int[] iArr160 = this.values;
                    iArr160[i432 - 1] = iArr160[i432 - 1] << iArr160[i432];
                    int i433 = i432 - 1;
                    this.FastBitmap$CoordinateSystem = i433;
                    iArr160[i433 - 1] = iArr160[i433 - 1] + iArr160[i433];
                    int i434 = i433 + 1;
                    this.FastBitmap$CoordinateSystem = i434;
                    iArr160[i433] = iArr160[i434 - 2];
                    return 0;
                case 195:
                    Object[] objArr31 = this.invokeSuspend;
                    int i435 = this.FastBitmap$CoordinateSystem;
                    int i436 = i435 + 1;
                    this.FastBitmap$CoordinateSystem = i436;
                    objArr31[i435] = objArr31[16];
                    this.FastBitmap$CoordinateSystem = i436 + 1;
                    objArr31[i436] = objArr31[15];
                    return 0;
                case 196:
                    int[] iArr161 = this.values;
                    int i437 = this.FastBitmap$CoordinateSystem;
                    int i438 = i437 + 1;
                    this.FastBitmap$CoordinateSystem = i438;
                    iArr161[i437] = 19;
                    iArr161[i438 - 1] = -iArr161[i438 - 1];
                    return 0;
                case 197:
                    int[] iArr162 = this.values;
                    int i439 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i439 + 1;
                    iArr162[i439] = 119;
                    return 0;
                case 198:
                    Object[] objArr32 = this.invokeSuspend;
                    int i440 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i440 + 1;
                    objArr32[i440] = objArr32[18];
                    return 0;
                case SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR /*199*/:
                    Object[] objArr33 = this.invokeSuspend;
                    int i441 = this.FastBitmap$CoordinateSystem;
                    int i442 = i441 + 1;
                    this.FastBitmap$CoordinateSystem = i442;
                    objArr33[i441] = objArr33[i442 - 2];
                    int i443 = i442 - 1;
                    this.FastBitmap$CoordinateSystem = i443;
                    Object obj20 = objArr33[i443];
                    objArr33[i443] = null;
                    objArr33[17] = obj20;
                    return 0;
                case 200:
                    int i444 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i444;
                    Object[] objArr34 = this.invokeSuspend;
                    objArr34[i444] = null;
                    this.FastBitmap$CoordinateSystem = i444 + 1;
                    objArr34[i444] = objArr34[18];
                    return 0;
                case 201:
                    int i445 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i445;
                    Object[] objArr35 = this.invokeSuspend;
                    objArr35[i445] = null;
                    this.FastBitmap$CoordinateSystem = i445 + 1;
                    objArr35[i445] = objArr35[17];
                    return 0;
                case 202:
                    int i446 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i446;
                    Object[] objArr36 = this.invokeSuspend;
                    Object obj21 = objArr36[i446];
                    objArr36[i446] = null;
                    objArr36[18] = obj21;
                    return 0;
                case 203:
                    int[] iArr163 = this.values;
                    int i447 = this.FastBitmap$CoordinateSystem;
                    int i448 = i447 + 1;
                    this.FastBitmap$CoordinateSystem = i448;
                    iArr163[i447] = 95;
                    iArr163[i448 - 1] = -iArr163[i448 - 1];
                    int i449 = i448 + 2;
                    this.FastBitmap$CoordinateSystem = i449;
                    iArr163[i449 - 1] = iArr163[i449 - 3];
                    iArr163[i448] = iArr163[i449 - 4];
                    return 0;
                case 204:
                    int i450 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i450;
                    this.invokeSuspend[i450] = null;
                    int i451 = i450 - 1;
                    this.FastBitmap$CoordinateSystem = i451;
                    int[] iArr164 = this.values;
                    iArr164[i451 - 1] = iArr164[i451] | iArr164[i451 - 1];
                    return 0;
                case 205:
                    int i452 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i452;
                    int[] iArr165 = this.values;
                    iArr165[i452 - 1] = iArr165[i452 - 1] & iArr165[i452];
                    iArr165[i452 - 1] = -iArr165[i452 - 1];
                    return 0;
                case 206:
                    int[] iArr166 = this.values;
                    int i453 = this.FastBitmap$CoordinateSystem;
                    int i454 = i453 + 2;
                    this.FastBitmap$CoordinateSystem = i454;
                    iArr166[i454 - 1] = iArr166[i454 - 3];
                    iArr166[i453] = iArr166[i454 - 4];
                    int i455 = i454 - 1;
                    this.FastBitmap$CoordinateSystem = i455;
                    iArr166[i455 - 1] = iArr166[i455 - 1] & iArr166[i455];
                    int i456 = i455 + 1;
                    this.FastBitmap$CoordinateSystem = i456;
                    int i457 = iArr166[i456 - 2];
                    iArr166[i455] = i457;
                    iArr166[i456 - 2] = iArr166[i456 - 3];
                    iArr166[i456 - 3] = iArr166[i456 - 4];
                    iArr166[i456 - 4] = i457;
                    return 0;
                case 207:
                    int[] iArr167 = this.values;
                    int i458 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i458 + 1;
                    iArr167[i458] = 93;
                    return 0;
                case 208:
                    int i459 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i459;
                    this.invokeSuspend[i459] = null;
                    int[] iArr168 = this.values;
                    int i460 = i459 + 2;
                    this.FastBitmap$CoordinateSystem = i460;
                    iArr168[i460 - 1] = iArr168[i460 - 3];
                    iArr168[i459] = iArr168[i460 - 4];
                    int i461 = i460 - 1;
                    this.FastBitmap$CoordinateSystem = i461;
                    iArr168[i461 - 1] = iArr168[i461] ^ iArr168[i461 - 1];
                    return 0;
                case 209:
                    int[] iArr169 = this.values;
                    int i462 = this.FastBitmap$CoordinateSystem;
                    int i463 = i462 + 1;
                    this.FastBitmap$CoordinateSystem = i463;
                    int i464 = iArr169[i463 - 2];
                    iArr169[i462] = i464;
                    iArr169[i463 - 2] = iArr169[i463 - 3];
                    iArr169[i463 - 3] = iArr169[i463 - 4];
                    iArr169[i463 - 4] = i464;
                    int i465 = i463 - 1;
                    this.FastBitmap$CoordinateSystem = i465;
                    this.invokeSuspend[i465] = null;
                    int i466 = i465 - 1;
                    this.FastBitmap$CoordinateSystem = i466;
                    iArr169[i466 - 1] = iArr169[i466] & iArr169[i466 - 1];
                    return 0;
                case 210:
                    int[] iArr170 = this.values;
                    int i467 = this.FastBitmap$CoordinateSystem;
                    int i468 = i467 + 1;
                    this.FastBitmap$CoordinateSystem = i468;
                    iArr170[i467] = 75;
                    int i469 = i468 - 1;
                    this.FastBitmap$CoordinateSystem = i469;
                    iArr170[i469 - 1] = iArr170[i469 - 1] + iArr170[i469];
                    int i470 = i469 + 1;
                    this.FastBitmap$CoordinateSystem = i470;
                    iArr170[i469] = iArr170[i470 - 2];
                    return 0;
                case 211:
                    int[] iArr171 = this.values;
                    int i471 = this.FastBitmap$CoordinateSystem;
                    int i472 = i471 + 1;
                    this.FastBitmap$CoordinateSystem = i472;
                    iArr171[i471] = 75;
                    iArr171[i472 - 1] = -iArr171[i472 - 1];
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_STORE_LOW_VERSION_DATA_FILE /*212*/:
                    int[] iArr172 = this.values;
                    int i473 = this.FastBitmap$CoordinateSystem;
                    iArr172[i473 - 1] = -iArr172[i473 - 1];
                    int i474 = i473 - 1;
                    this.FastBitmap$CoordinateSystem = i474;
                    iArr172[i474 - 1] = iArr172[i474 - 1] ^ iArr172[i474];
                    int i475 = i474 + 2;
                    this.FastBitmap$CoordinateSystem = i475;
                    iArr172[i475 - 1] = iArr172[i475 - 3];
                    iArr172[i474] = iArr172[i475 - 4];
                    return 0;
                case 213:
                    int[] iArr173 = this.values;
                    int i476 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i476 + 1;
                    iArr173[i476] = 86;
                    return 0;
                case 214:
                    int i477 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i477;
                    int[] iArr174 = this.values;
                    iArr174[i477 - 1] = iArr174[i477 - 1] / iArr174[i477];
                    int i478 = i477 - 1;
                    this.FastBitmap$CoordinateSystem = i478;
                    this.invokeSuspend[i478] = null;
                    return 0;
                case 215:
                    int[] iArr175 = this.values;
                    int i479 = this.FastBitmap$CoordinateSystem;
                    Object[] objArr37 = this.invokeSuspend;
                    Object obj22 = objArr37[i479 - 1];
                    objArr37[i479 - 1] = null;
                    iArr175[i479 - 1] = ((int[]) obj22).length;
                    return 0;
                case 216:
                    int[] iArr176 = this.values;
                    int i480 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i480 + 1;
                    iArr176[i480] = 97;
                    return 0;
                case FileUtils.JPEG_MARKER_EOI /*217*/:
                    int[] iArr177 = this.values;
                    int i481 = this.FastBitmap$CoordinateSystem;
                    iArr177[i481 - 1] = -iArr177[i481 - 1];
                    int i482 = i481 - 1;
                    this.FastBitmap$CoordinateSystem = i482;
                    iArr177[i482 - 1] = iArr177[i482 - 1] | iArr177[i482];
                    this.FastBitmap$CoordinateSystem = i482 + 1;
                    iArr177[i482] = 1;
                    return 0;
                case 218:
                    int[] iArr178 = this.values;
                    int i483 = this.FastBitmap$CoordinateSystem;
                    int i484 = i483 + 1;
                    this.FastBitmap$CoordinateSystem = i484;
                    iArr178[i483] = 121;
                    iArr178[i484 - 1] = -iArr178[i484 - 1];
                    return 0;
                case 219:
                    int[] iArr179 = this.values;
                    int i485 = this.FastBitmap$CoordinateSystem;
                    iArr179[i485 - 1] = -iArr179[i485 - 1];
                    int i486 = i485 + 2;
                    this.FastBitmap$CoordinateSystem = i486;
                    iArr179[i486 - 1] = iArr179[i486 - 3];
                    iArr179[i485] = iArr179[i486 - 4];
                    iArr179[i486 - 1] = -iArr179[i486 - 1];
                    return 0;
                case WheelView.DIVIDER_ALPHA /*220*/:
                    int[] iArr180 = this.values;
                    int i487 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i487 + 1;
                    iArr180[i487] = 17;
                    return 0;
                case 221:
                    int[] iArr181 = this.values;
                    int i488 = this.FastBitmap$CoordinateSystem;
                    int i489 = i488 + 1;
                    this.FastBitmap$CoordinateSystem = i489;
                    iArr181[i488] = 27;
                    iArr181[i489 - 1] = -iArr181[i489 - 1];
                    return 0;
                case 222:
                    int i490 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i490;
                    Object[] objArr38 = this.invokeSuspend;
                    Object obj23 = objArr38[i490];
                    objArr38[i490] = null;
                    this.setMax = obj23 != null ? 1 : 0;
                    return 0;
                case 223:
                    int[] iArr182 = this.values;
                    int i491 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i491 + 1;
                    iArr182[i491] = 4;
                    return 0;
                case 224:
                    int[] iArr183 = this.values;
                    int i492 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i492 + 1;
                    iArr183[i492] = 29;
                    return 0;
                case 225:
                    int i493 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i493;
                    this.invokeSuspend[i493] = null;
                    int[] iArr184 = this.values;
                    int i494 = i493 + 2;
                    this.FastBitmap$CoordinateSystem = i494;
                    iArr184[i494 - 1] = iArr184[i494 - 3];
                    iArr184[i493] = iArr184[i494 - 4];
                    return 0;
                case 226:
                    int[] iArr185 = this.values;
                    int i495 = this.FastBitmap$CoordinateSystem;
                    int i496 = i495 + 1;
                    this.FastBitmap$CoordinateSystem = i496;
                    int i497 = iArr185[i496 - 2];
                    iArr185[i495] = i497;
                    iArr185[i496 - 2] = iArr185[i496 - 3];
                    iArr185[i496 - 3] = iArr185[i496 - 4];
                    iArr185[i496 - 4] = i497;
                    int i498 = i496 - 1;
                    this.FastBitmap$CoordinateSystem = i498;
                    this.invokeSuspend[i498] = null;
                    int i499 = i498 - 1;
                    this.FastBitmap$CoordinateSystem = i499;
                    iArr185[i499 - 1] = iArr185[i499] ^ iArr185[i499 - 1];
                    return 0;
                case 227:
                    int[] iArr186 = this.values;
                    int i500 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i500 + 1;
                    iArr186[i500] = 9;
                    return 0;
                case 228:
                    int[] iArr187 = this.values;
                    int i501 = this.FastBitmap$CoordinateSystem;
                    int i502 = i501 + 1;
                    this.FastBitmap$CoordinateSystem = i502;
                    iArr187[i501] = -1;
                    int i503 = i502 + 2;
                    this.FastBitmap$CoordinateSystem = i503;
                    iArr187[i503 - 1] = iArr187[i503 - 3];
                    iArr187[i502] = iArr187[i503 - 4];
                    return 0;
                case 229:
                    int i504 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i504;
                    int[] iArr188 = this.values;
                    iArr188[i504 - 1] = iArr188[i504 - 1] | iArr188[i504];
                    int i505 = i504 - 1;
                    this.FastBitmap$CoordinateSystem = i505;
                    iArr188[i505 - 1] = iArr188[i505 - 1] & iArr188[i505];
                    int i506 = iArr188[i505 - 1];
                    iArr188[i505 - 1] = iArr188[i505 - 2];
                    iArr188[i505 - 2] = i506;
                    return 0;
                case 230:
                    int i507 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i507;
                    this.invokeSuspend[i507] = null;
                    int[] iArr189 = this.values;
                    int i508 = i507 + 2;
                    this.FastBitmap$CoordinateSystem = i508;
                    iArr189[i508 - 1] = iArr189[i508 - 3];
                    iArr189[i507] = iArr189[i508 - 4];
                    iArr189[i508 - 1] = -iArr189[i508 - 1];
                    return 0;
                case 231:
                    int i509 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i509;
                    int[] iArr190 = this.values;
                    iArr190[i509 - 1] = iArr190[i509 - 1] << iArr190[i509];
                    int i510 = i509 - 1;
                    this.FastBitmap$CoordinateSystem = i510;
                    iArr190[i510 - 1] = iArr190[i510 - 1] + iArr190[i510];
                    return 0;
                case 232:
                    int[] iArr191 = this.values;
                    int i511 = this.FastBitmap$CoordinateSystem;
                    int i512 = i511 + 1;
                    this.FastBitmap$CoordinateSystem = i512;
                    iArr191[i511] = 1;
                    iArr191[i512 - 1] = -iArr191[i512 - 1];
                    int i513 = i512 + 2;
                    this.FastBitmap$CoordinateSystem = i513;
                    iArr191[i513 - 1] = iArr191[i513 - 3];
                    iArr191[i512] = iArr191[i513 - 4];
                    return 0;
                case 233:
                    int[] iArr192 = this.values;
                    int i514 = this.FastBitmap$CoordinateSystem;
                    int i515 = i514 + 1;
                    this.FastBitmap$CoordinateSystem = i515;
                    iArr192[i514] = 5;
                    this.FastBitmap$CoordinateSystem = i515 + 1;
                    iArr192[i515] = 4;
                    return 0;
                case 234:
                    int[] iArr193 = this.values;
                    int i516 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i516 + 1;
                    iArr193[i516] = 8;
                    return 0;
                case 235:
                    int[] iArr194 = this.values;
                    int i517 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i517 + 1;
                    iArr194[i517] = 65;
                    return 0;
                case 236:
                    int[] iArr195 = this.values;
                    int i518 = this.FastBitmap$CoordinateSystem;
                    int i519 = i518 + 1;
                    this.FastBitmap$CoordinateSystem = i519;
                    iArr195[i518] = 117;
                    int i520 = i519 + 2;
                    this.FastBitmap$CoordinateSystem = i520;
                    iArr195[i520 - 1] = iArr195[i520 - 3];
                    iArr195[i519] = iArr195[i520 - 4];
                    int i521 = i520 + 2;
                    this.FastBitmap$CoordinateSystem = i521;
                    iArr195[i521 - 1] = iArr195[i521 - 3];
                    iArr195[i520] = iArr195[i521 - 4];
                    return 0;
                case 237:
                    int i522 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i522;
                    this.invokeSuspend[i522] = null;
                    int i523 = i522 - 1;
                    this.FastBitmap$CoordinateSystem = i523;
                    int[] iArr196 = this.values;
                    iArr196[i523 - 1] = iArr196[i523 - 1] | iArr196[i523];
                    int i524 = i523 + 2;
                    this.FastBitmap$CoordinateSystem = i524;
                    iArr196[i524 - 1] = iArr196[i524 - 3];
                    iArr196[i523] = iArr196[i524 - 4];
                    return 0;
                case 238:
                    int[] iArr197 = this.values;
                    int i525 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i525 + 1;
                    iArr197[i525] = 43;
                    return 0;
                case 239:
                    int[] iArr198 = this.values;
                    int i526 = this.FastBitmap$CoordinateSystem;
                    int i527 = i526 + 1;
                    this.FastBitmap$CoordinateSystem = i527;
                    iArr198[i526] = 51;
                    iArr198[i527 - 1] = -iArr198[i527 - 1];
                    int i528 = i527 + 2;
                    this.FastBitmap$CoordinateSystem = i528;
                    iArr198[i528 - 1] = iArr198[i528 - 3];
                    iArr198[i527] = iArr198[i528 - 4];
                    return 0;
                case 240:
                    int i529 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i529;
                    this.invokeSuspend[i529] = null;
                    int[] iArr199 = this.values;
                    iArr199[i529 - 1] = -iArr199[i529 - 1];
                    int i530 = i529 + 2;
                    this.FastBitmap$CoordinateSystem = i530;
                    iArr199[i530 - 1] = iArr199[i530 - 3];
                    iArr199[i529] = iArr199[i530 - 4];
                    return 0;
                case 241:
                    int[] iArr200 = this.values;
                    int i531 = this.FastBitmap$CoordinateSystem;
                    iArr200[i531 - 1] = -iArr200[i531 - 1];
                    int i532 = i531 - 1;
                    this.FastBitmap$CoordinateSystem = i532;
                    iArr200[i532 - 1] = iArr200[i532] ^ iArr200[i532 - 1];
                    return 0;
                case 242:
                    int[] iArr201 = this.values;
                    int i533 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i533 + 1;
                    iArr201[i533] = 77;
                    return 0;
                case 243:
                    int[] iArr202 = this.values;
                    int i534 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i534 + 1;
                    iArr202[i534] = 7;
                    return 0;
                case 244:
                    int[] iArr203 = this.values;
                    int i535 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i535 + 1;
                    iArr203[i535] = 67;
                    return 0;
                case 245:
                    int[] iArr204 = this.values;
                    int i536 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i536 + 1;
                    iArr204[i536] = 49;
                    return 0;
                case 246:
                    int[] iArr205 = this.values;
                    int i537 = this.FastBitmap$CoordinateSystem;
                    int i538 = i537 + 1;
                    this.FastBitmap$CoordinateSystem = i538;
                    iArr205[i537] = iArr205[i538 - 2];
                    int i539 = i538 + 1;
                    this.FastBitmap$CoordinateSystem = i539;
                    iArr205[i538] = -1;
                    int i540 = i539 - 1;
                    this.FastBitmap$CoordinateSystem = i540;
                    iArr205[i540 - 1] = iArr205[i540] ^ iArr205[i540 - 1];
                    return 0;
                case 247:
                    int[] iArr206 = this.values;
                    int i541 = this.FastBitmap$CoordinateSystem;
                    int i542 = i541 + 1;
                    this.FastBitmap$CoordinateSystem = i542;
                    iArr206[i541] = 63;
                    int i543 = i542 + 1;
                    this.FastBitmap$CoordinateSystem = i543;
                    iArr206[i542] = iArr206[i543 - 2];
                    this.FastBitmap$CoordinateSystem = i543 + 1;
                    iArr206[i543] = -1;
                    return 0;
                case 248:
                    int i544 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i544;
                    int[] iArr207 = this.values;
                    iArr207[i544 - 1] = iArr207[i544 - 1] - iArr207[i544];
                    this.FastBitmap$CoordinateSystem = i544 + 1;
                    iArr207[i544] = 1;
                    return 0;
                case 249:
                    Object[] objArr39 = this.invokeSuspend;
                    int i545 = this.FastBitmap$CoordinateSystem;
                    int i546 = i545 + 1;
                    this.FastBitmap$CoordinateSystem = i546;
                    objArr39[i545] = objArr39[i546 - 2];
                    int i547 = i546 - 1;
                    this.FastBitmap$CoordinateSystem = i547;
                    Object obj24 = objArr39[i547];
                    objArr39[i547] = null;
                    objArr39[15] = obj24;
                    int[] iArr208 = this.values;
                    this.FastBitmap$CoordinateSystem = i547 + 1;
                    iArr208[i547] = 0;
                    return 0;
                case SQLiteDatabase.MAX_SQL_CACHE_SIZE /*250*/:
                    int[] iArr209 = this.values;
                    int i548 = this.FastBitmap$CoordinateSystem;
                    int i549 = i548 + 1;
                    this.FastBitmap$CoordinateSystem = i549;
                    iArr209[i548] = 49;
                    iArr209[i549 - 1] = -iArr209[i549 - 1];
                    int i550 = i549 + 2;
                    this.FastBitmap$CoordinateSystem = i550;
                    iArr209[i550 - 1] = iArr209[i550 - 3];
                    iArr209[i549] = iArr209[i550 - 4];
                    return 0;
                case 251:
                    int[] iArr210 = this.values;
                    int i551 = this.FastBitmap$CoordinateSystem;
                    int i552 = i551 + 1;
                    this.FastBitmap$CoordinateSystem = i552;
                    int i553 = iArr210[i552 - 2];
                    iArr210[i551] = i553;
                    iArr210[i552 - 2] = iArr210[i552 - 3];
                    iArr210[i552 - 3] = iArr210[i552 - 4];
                    iArr210[i552 - 4] = i553;
                    int i554 = i552 - 1;
                    this.FastBitmap$CoordinateSystem = i554;
                    this.invokeSuspend[i554] = null;
                    int i555 = iArr210[i554 - 1];
                    iArr210[i554 - 1] = iArr210[i554 - 2];
                    iArr210[i554 - 2] = i555;
                    return 0;
                case 252:
                    int[] iArr211 = this.values;
                    int i556 = this.FastBitmap$CoordinateSystem;
                    int i557 = i556 + 2;
                    this.FastBitmap$CoordinateSystem = i557;
                    iArr211[i557 - 1] = iArr211[i557 - 3];
                    iArr211[i556] = iArr211[i557 - 4];
                    iArr211[i557 - 1] = -iArr211[i557 - 1];
                    int i558 = i557 - 1;
                    this.FastBitmap$CoordinateSystem = i558;
                    iArr211[i558 - 1] = iArr211[i558] ^ iArr211[i558 - 1];
                    return 0;
                case 253:
                    int[] iArr212 = this.values;
                    int i559 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i559 + 1;
                    iArr212[i559] = 63;
                    return 0;
                case 254:
                    int[] iArr213 = this.values;
                    int i560 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i560 + 1;
                    iArr213[i560] = 28;
                    return 0;
                case 255:
                    long[] jArr = this.toDoubleRange;
                    int i561 = this.toString;
                    this.toString = i561 + 1;
                    this.length = jArr[i561];
                    return 0;
                case 256:
                    Object[] objArr40 = this.invokeSuspend;
                    int i562 = this.FastBitmap$CoordinateSystem;
                    int i563 = i562 + 1;
                    this.FastBitmap$CoordinateSystem = i563;
                    objArr40[i562] = objArr40[16];
                    this.FastBitmap$CoordinateSystem = i563 + 1;
                    objArr40[i563] = objArr40[14];
                    return 0;
                case 257:
                    int[] iArr214 = this.values;
                    int i564 = this.FastBitmap$CoordinateSystem;
                    int i565 = i564 + 1;
                    this.FastBitmap$CoordinateSystem = i565;
                    iArr214[i564] = 69;
                    int i566 = i565 - 1;
                    this.FastBitmap$CoordinateSystem = i566;
                    iArr214[i566 - 1] = iArr214[i566 - 1] + iArr214[i566];
                    int i567 = i566 + 1;
                    this.FastBitmap$CoordinateSystem = i567;
                    iArr214[i566] = iArr214[i567 - 2];
                    return 0;
                case 258:
                    Object[] objArr41 = this.invokeSuspend;
                    int i568 = this.FastBitmap$CoordinateSystem;
                    int i569 = i568 + 1;
                    this.FastBitmap$CoordinateSystem = i569;
                    objArr41[i568] = objArr41[14];
                    this.FastBitmap$CoordinateSystem = i569 + 1;
                    objArr41[i569] = objArr41[18];
                    return 0;
                case 259:
                    Object[] objArr42 = this.invokeSuspend;
                    int i570 = this.FastBitmap$CoordinateSystem;
                    int i571 = i570 + 1;
                    this.FastBitmap$CoordinateSystem = i571;
                    objArr42[i570] = objArr42[19];
                    this.FastBitmap$CoordinateSystem = i571 + 1;
                    objArr42[i571] = objArr42[16];
                    return 0;
                case 260:
                    Object[] objArr43 = this.invokeSuspend;
                    int i572 = this.FastBitmap$CoordinateSystem;
                    int i573 = i572 + 1;
                    this.FastBitmap$CoordinateSystem = i573;
                    objArr43[i572] = objArr43[17];
                    this.FastBitmap$CoordinateSystem = i573 + 1;
                    objArr43[i573] = objArr43[20];
                    return 0;
                case 261:
                    int[] iArr215 = this.values;
                    int i574 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i574 + 1;
                    iArr215[i574] = 27832;
                    return 0;
                case 262:
                    Object[] objArr44 = this.invokeSuspend;
                    int i575 = this.FastBitmap$CoordinateSystem;
                    int i576 = i575 + 1;
                    this.FastBitmap$CoordinateSystem = i576;
                    objArr44[i575] = objArr44[14];
                    int i577 = i576 + 1;
                    this.FastBitmap$CoordinateSystem = i577;
                    objArr44[i576] = objArr44[18];
                    this.FastBitmap$CoordinateSystem = i577 + 1;
                    objArr44[i577] = objArr44[19];
                    return 0;
                case 263:
                    Object[] objArr45 = this.invokeSuspend;
                    int i578 = this.FastBitmap$CoordinateSystem;
                    int i579 = i578 + 1;
                    this.FastBitmap$CoordinateSystem = i579;
                    objArr45[i578] = objArr45[16];
                    int i580 = i579 + 1;
                    this.FastBitmap$CoordinateSystem = i580;
                    objArr45[i579] = objArr45[17];
                    this.FastBitmap$CoordinateSystem = i580 + 1;
                    objArr45[i580] = objArr45[20];
                    return 0;
                case 264:
                    int[] iArr216 = this.values;
                    int i581 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i581 + 1;
                    iArr216[i581] = 500;
                    return 0;
                case 265:
                    int[] iArr217 = this.values;
                    int i582 = this.FastBitmap$CoordinateSystem;
                    int i583 = i582 + 1;
                    this.FastBitmap$CoordinateSystem = i583;
                    iArr217[i582] = 67;
                    iArr217[i583 - 1] = -iArr217[i583 - 1];
                    return 0;
                case 266:
                    int[] iArr218 = this.values;
                    int i584 = this.FastBitmap$CoordinateSystem;
                    iArr218[i584 - 1] = -iArr218[i584 - 1];
                    int i585 = i584 - 1;
                    this.FastBitmap$CoordinateSystem = i585;
                    iArr218[i585 - 1] = iArr218[i585 - 1] & iArr218[i585];
                    int i586 = i585 + 1;
                    this.FastBitmap$CoordinateSystem = i586;
                    int i587 = iArr218[i586 - 2];
                    iArr218[i585] = i587;
                    iArr218[i586 - 2] = iArr218[i586 - 3];
                    iArr218[i586 - 3] = iArr218[i586 - 4];
                    iArr218[i586 - 4] = i587;
                    return 0;
                case 267:
                    int i588 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i588;
                    int[] iArr219 = this.values;
                    iArr219[i588 - 1] = iArr219[i588 - 1] & iArr219[i588];
                    int i589 = i588 - 1;
                    this.FastBitmap$CoordinateSystem = i589;
                    iArr219[i589 - 1] = iArr219[i589 - 1] | iArr219[i589];
                    int i590 = i589 + 2;
                    this.FastBitmap$CoordinateSystem = i590;
                    iArr219[i590 - 1] = iArr219[i590 - 3];
                    iArr219[i589] = iArr219[i590 - 4];
                    return 0;
                case 268:
                    int[] iArr220 = this.values;
                    int i591 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i591 + 1;
                    iArr220[i591] = 89;
                    return 0;
                case 269:
                    int i592 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i592;
                    int[] iArr221 = this.values;
                    iArr221[i592 - 1] = iArr221[i592 - 1] & iArr221[i592];
                    int i593 = i592 - 1;
                    this.FastBitmap$CoordinateSystem = i593;
                    iArr221[i593 - 1] = iArr221[i593 - 1] | iArr221[i593];
                    this.FastBitmap$CoordinateSystem = i593 + 1;
                    iArr221[i593] = 1;
                    return 0;
                case 270:
                    int i594 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i594;
                    int[] iArr222 = this.values;
                    iArr222[i594 - 1] = iArr222[i594 - 1] ^ iArr222[i594];
                    int i595 = i594 - 1;
                    this.FastBitmap$CoordinateSystem = i595;
                    iArr222[i595 - 1] = iArr222[i595 - 1] & iArr222[i595];
                    int i596 = i595 + 1;
                    this.FastBitmap$CoordinateSystem = i596;
                    int i597 = iArr222[i596 - 2];
                    iArr222[i595] = i597;
                    iArr222[i596 - 2] = iArr222[i596 - 3];
                    iArr222[i596 - 3] = iArr222[i596 - 4];
                    iArr222[i596 - 4] = i597;
                    return 0;
                case 271:
                    int i598 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i598;
                    int[] iArr223 = this.values;
                    iArr223[i598 - 1] = iArr223[i598 - 1] & iArr223[i598];
                    int i599 = i598 - 1;
                    this.FastBitmap$CoordinateSystem = i599;
                    iArr223[i599 - 1] = iArr223[i599 - 1] | iArr223[i599];
                    int i600 = i599 - 1;
                    this.FastBitmap$CoordinateSystem = i600;
                    iArr223[i600 - 1] = iArr223[i600 - 1] - iArr223[i600];
                    return 0;
                case LZMA_Base.kNumLenSymbols /*272*/:
                    int[] iArr224 = this.values;
                    int i601 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i601 + 1;
                    iArr224[i601] = 90;
                    return 0;
                case LZMA_Base.kMatchMaxLen /*273*/:
                    int[] iArr225 = this.values;
                    int i602 = this.FastBitmap$CoordinateSystem;
                    int i603 = i602 + 1;
                    this.FastBitmap$CoordinateSystem = i603;
                    iArr225[i602] = 27;
                    int i604 = i603 + 2;
                    this.FastBitmap$CoordinateSystem = i604;
                    iArr225[i604 - 1] = iArr225[i604 - 3];
                    iArr225[i603] = iArr225[i604 - 4];
                    return 0;
                case 274:
                    int[] iArr226 = this.values;
                    int i605 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i605 + 1;
                    iArr226[i605] = 105;
                    return 0;
                case 275:
                    int i606 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i606;
                    int[] iArr227 = this.values;
                    iArr227[i606 - 1] = iArr227[i606 - 1] ^ iArr227[i606];
                    int i607 = i606 - 1;
                    this.FastBitmap$CoordinateSystem = i607;
                    iArr227[i607 - 1] = iArr227[i607 - 1] - iArr227[i607];
                    return 0;
                case 276:
                    Object[] objArr46 = this.invokeSuspend;
                    int i608 = this.FastBitmap$CoordinateSystem;
                    int i609 = i608 + 1;
                    this.FastBitmap$CoordinateSystem = i609;
                    objArr46[i608] = objArr46[14];
                    this.FastBitmap$CoordinateSystem = i609 + 1;
                    objArr46[i609] = objArr46[16];
                    return 0;
                case 277:
                    int[] iArr228 = this.values;
                    int i610 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i610 + 1;
                    iArr228[i610] = 68;
                    return 0;
                case 278:
                    int[] iArr229 = this.values;
                    int i611 = this.FastBitmap$CoordinateSystem;
                    int i612 = i611 + 1;
                    this.FastBitmap$CoordinateSystem = i612;
                    iArr229[i611] = 85;
                    iArr229[i612 - 1] = -iArr229[i612 - 1];
                    return 0;
                case 279:
                    int[] iArr230 = this.values;
                    int i613 = this.FastBitmap$CoordinateSystem;
                    int i614 = i613 + 2;
                    this.FastBitmap$CoordinateSystem = i614;
                    iArr230[i614 - 1] = iArr230[i614 - 3];
                    iArr230[i613] = iArr230[i614 - 4];
                    int i615 = i614 - 1;
                    this.FastBitmap$CoordinateSystem = i615;
                    iArr230[i615 - 1] = iArr230[i615] | iArr230[i615 - 1];
                    return 0;
                case 280:
                    int[] iArr231 = this.values;
                    int i616 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i616 + 1;
                    iArr231[i616] = iArr231[15];
                    return 0;
                case 281:
                    int i617 = this.FastBitmap$CoordinateSystem - 2;
                    this.FastBitmap$CoordinateSystem = i617;
                    int[] iArr232 = this.values;
                    this.setMax = iArr232[i617] == iArr232[i617 + 1] ? 1 : 0;
                    return 0;
                case 282:
                    long[] jArr2 = this.toDoubleRange;
                    int i618 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i618 + 1;
                    jArr2[i618] = this.setMin;
                    return 0;
                case 283:
                    int[] iArr233 = this.values;
                    int i619 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i619 + 1;
                    iArr233[i619] = 83;
                    return 0;
                case 284:
                    int[] iArr234 = this.values;
                    int i620 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i620 + 1;
                    iArr234[i620] = 85;
                    return 0;
                case 285:
                    int[] iArr235 = this.values;
                    int i621 = this.FastBitmap$CoordinateSystem;
                    int i622 = i621 + 1;
                    this.FastBitmap$CoordinateSystem = i622;
                    iArr235[i621] = 1;
                    int i623 = i622 - 1;
                    this.FastBitmap$CoordinateSystem = i623;
                    iArr235[i623 - 1] = iArr235[i623 - 1] << iArr235[i623];
                    int i624 = i623 + 2;
                    this.FastBitmap$CoordinateSystem = i624;
                    iArr235[i624 - 1] = iArr235[i624 - 3];
                    iArr235[i623] = iArr235[i624 - 4];
                    return 0;
                case 286:
                    int[] iArr236 = this.values;
                    int i625 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i625 + 1;
                    iArr236[i625] = 84;
                    return 0;
                case 287:
                    int[] iArr237 = this.values;
                    int i626 = this.FastBitmap$CoordinateSystem;
                    int i627 = i626 + 1;
                    this.FastBitmap$CoordinateSystem = i627;
                    iArr237[i626] = 31;
                    int i628 = i627 + 2;
                    this.FastBitmap$CoordinateSystem = i628;
                    iArr237[i628 - 1] = iArr237[i628 - 3];
                    iArr237[i627] = iArr237[i628 - 4];
                    return 0;
                case 288:
                    int i629 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i629;
                    int[] iArr238 = this.values;
                    iArr238[i629 - 1] = iArr238[i629 - 1] | iArr238[i629];
                    int i630 = i629 - 1;
                    this.FastBitmap$CoordinateSystem = i630;
                    iArr238[i630 - 1] = iArr238[i630 - 1] + iArr238[i630];
                    return 0;
                case 289:
                    int[] iArr239 = this.values;
                    int i631 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i631 + 1;
                    iArr239[i631] = 23;
                    return 0;
                case 290:
                    int[] iArr240 = this.values;
                    int i632 = this.FastBitmap$CoordinateSystem;
                    int i633 = i632 + 1;
                    this.FastBitmap$CoordinateSystem = i633;
                    iArr240[i632] = -1;
                    int i634 = i633 + 2;
                    this.FastBitmap$CoordinateSystem = i634;
                    iArr240[i634 - 1] = iArr240[i634 - 3];
                    iArr240[i633] = iArr240[i634 - 4];
                    this.FastBitmap$CoordinateSystem = i634 + 1;
                    iArr240[i634] = -1;
                    return 0;
                case 291:
                    int i635 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i635;
                    int[] iArr241 = this.values;
                    iArr241[i635 - 1] = iArr241[i635 - 1] & iArr241[i635];
                    int i636 = i635 - 1;
                    this.FastBitmap$CoordinateSystem = i636;
                    iArr241[i636 - 1] = iArr241[i636 - 1] | iArr241[i636];
                    int i637 = iArr241[i636 - 1];
                    iArr241[i636 - 1] = iArr241[i636 - 2];
                    iArr241[i636 - 2] = i637;
                    return 0;
                case BuildConfig.VERSION_CODE /*292*/:
                    int[] iArr242 = this.values;
                    int i638 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i638 + 1;
                    iArr242[i638] = 18;
                    return 0;
                case 293:
                    Object[] objArr47 = this.invokeSuspend;
                    int i639 = this.FastBitmap$CoordinateSystem;
                    int i640 = i639 + 1;
                    this.FastBitmap$CoordinateSystem = i640;
                    objArr47[i639] = objArr47[14];
                    this.FastBitmap$CoordinateSystem = i640 + 1;
                    objArr47[i640] = objArr47[17];
                    return 0;
                case 294:
                    int[] iArr243 = this.values;
                    int i641 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i641 + 1;
                    iArr243[i641] = 16;
                    return 0;
                case 295:
                    int[] iArr244 = this.values;
                    int i642 = this.FastBitmap$CoordinateSystem;
                    int i643 = i642 + 1;
                    this.FastBitmap$CoordinateSystem = i643;
                    iArr244[i642] = 47;
                    iArr244[i643 - 1] = -iArr244[i643 - 1];
                    int i644 = i643 + 2;
                    this.FastBitmap$CoordinateSystem = i644;
                    iArr244[i644 - 1] = iArr244[i644 - 3];
                    iArr244[i643] = iArr244[i644 - 4];
                    return 0;
                case 296:
                    int[] iArr245 = this.values;
                    int i645 = this.FastBitmap$CoordinateSystem;
                    int i646 = i645 + 2;
                    this.FastBitmap$CoordinateSystem = i646;
                    iArr245[i646 - 1] = iArr245[i646 - 3];
                    iArr245[i645] = iArr245[i646 - 4];
                    int i647 = i646 - 1;
                    this.FastBitmap$CoordinateSystem = i647;
                    iArr245[i647 - 1] = iArr245[i647] ^ iArr245[i647 - 1];
                    return 0;
                case 297:
                    int[] iArr246 = this.values;
                    int i648 = this.FastBitmap$CoordinateSystem;
                    int i649 = i648 + 1;
                    this.FastBitmap$CoordinateSystem = i649;
                    iArr246[i648] = 3;
                    int i650 = i649 + 2;
                    this.FastBitmap$CoordinateSystem = i650;
                    iArr246[i650 - 1] = iArr246[i650 - 3];
                    iArr246[i649] = iArr246[i650 - 4];
                    int i651 = i650 + 2;
                    this.FastBitmap$CoordinateSystem = i651;
                    iArr246[i651 - 1] = iArr246[i651 - 3];
                    iArr246[i650] = iArr246[i651 - 4];
                    return 0;
                case 298:
                    int[] iArr247 = this.values;
                    int i652 = this.FastBitmap$CoordinateSystem;
                    int i653 = i652 + 1;
                    this.FastBitmap$CoordinateSystem = i653;
                    iArr247[i652] = 1;
                    int i654 = i653 - 1;
                    this.FastBitmap$CoordinateSystem = i654;
                    iArr247[i654 - 1] = iArr247[i654 - 1] << iArr247[i654];
                    int i655 = i654 + 1;
                    this.FastBitmap$CoordinateSystem = i655;
                    iArr247[i654] = iArr247[i655 - 2];
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_STORE_UNKNOWN_ERROR /*299*/:
                    int[] iArr248 = this.values;
                    int i656 = this.FastBitmap$CoordinateSystem;
                    int i657 = i656 + 1;
                    this.FastBitmap$CoordinateSystem = i657;
                    iArr248[i656] = 103;
                    int i658 = i657 + 1;
                    this.FastBitmap$CoordinateSystem = i658;
                    iArr248[i657] = iArr248[i658 - 2];
                    this.FastBitmap$CoordinateSystem = i658 + 1;
                    iArr248[i658] = -1;
                    return 0;
                case 300:
                    int[] iArr249 = this.values;
                    int i659 = this.FastBitmap$CoordinateSystem;
                    int i660 = i659 + 1;
                    this.FastBitmap$CoordinateSystem = i660;
                    iArr249[i659] = 1;
                    int i661 = i660 - 1;
                    this.FastBitmap$CoordinateSystem = i661;
                    iArr249[i661 - 1] = iArr249[i661 - 1] - iArr249[i661];
                    int i662 = i661 + 1;
                    this.FastBitmap$CoordinateSystem = i662;
                    iArr249[i661] = iArr249[i662 - 2];
                    return 0;
                case 301:
                    int[] iArr250 = this.values;
                    int i663 = this.FastBitmap$CoordinateSystem;
                    int i664 = i663 + 1;
                    this.FastBitmap$CoordinateSystem = i664;
                    iArr250[i663] = iArr250[20];
                    this.toDoubleRange[i664 - 1] = (long) iArr250[i664 - 1];
                    return 0;
                case 302:
                    int i665 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i665;
                    Object[] objArr48 = this.invokeSuspend;
                    Object obj25 = objArr48[i665];
                    objArr48[i665] = null;
                    objArr48[20] = obj25;
                    int i666 = i665 + 1;
                    this.FastBitmap$CoordinateSystem = i666;
                    objArr48[i665] = objArr48[20];
                    this.FastBitmap$CoordinateSystem = i666 + 1;
                    objArr48[i666] = objArr48[17];
                    return 0;
                case 303:
                    Object[] objArr49 = this.invokeSuspend;
                    int i667 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i667 + 1;
                    objArr49[i667] = objArr49[19];
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE /*304*/:
                    int[] iArr251 = this.values;
                    int i668 = this.FastBitmap$CoordinateSystem;
                    int i669 = i668 + 1;
                    this.FastBitmap$CoordinateSystem = i669;
                    iArr251[i668] = 49;
                    iArr251[i669 - 1] = -iArr251[i669 - 1];
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE_DATA /*305*/:
                    int[] iArr252 = this.values;
                    int i670 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i670 + 1;
                    iArr252[i670] = 76;
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_KEY_NOT_EXISTED /*306*/:
                    int[] iArr253 = this.values;
                    int i671 = this.FastBitmap$CoordinateSystem;
                    int i672 = i671 + 1;
                    this.FastBitmap$CoordinateSystem = i672;
                    iArr253[i671] = 2;
                    this.FastBitmap$CoordinateSystem = i672 + 1;
                    iArr253[i672] = 5;
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_ILLEGEL_KEY /*307*/:
                    int i673 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i673;
                    int[] iArr254 = this.values;
                    iArr254[i673 - 1] = iArr254[i673 - 1] >>> iArr254[i673];
                    int i674 = i673 - 1;
                    this.FastBitmap$CoordinateSystem = i674;
                    this.invokeSuspend[i674] = null;
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_NO_MEMORY /*308*/:
                    Object[] objArr50 = this.invokeSuspend;
                    int i675 = this.FastBitmap$CoordinateSystem;
                    int i676 = i675 + 1;
                    this.FastBitmap$CoordinateSystem = i676;
                    objArr50[i675] = objArr50[15];
                    int i677 = i676 + 1;
                    this.FastBitmap$CoordinateSystem = i677;
                    objArr50[i676] = objArr50[16];
                    this.FastBitmap$CoordinateSystem = i677 + 1;
                    objArr50[i677] = objArr50[18];
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_NO_SUCH_INDEX /*309*/:
                    int[] iArr255 = this.values;
                    int i678 = this.FastBitmap$CoordinateSystem;
                    int i679 = i678 + 1;
                    this.FastBitmap$CoordinateSystem = i679;
                    iArr255[i678] = 92;
                    this.FastBitmap$CoordinateSystem = i679 + 1;
                    iArr255[i679] = 0;
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_INVALID_ENCRYPTED_DATA /*310*/:
                    int[] iArr256 = this.values;
                    int i680 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i680 + 1;
                    iArr256[i680] = 31;
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_DECRYPT_MISMATCH_KEY_DATA /*311*/:
                    int[] iArr257 = this.values;
                    int i681 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i681 + 1;
                    iArr257[i681] = 15;
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_LOW_VERSION_DATA_FILE /*312*/:
                    int[] iArr258 = this.values;
                    int i682 = this.FastBitmap$CoordinateSystem;
                    int i683 = i682 + 1;
                    this.FastBitmap$CoordinateSystem = i683;
                    iArr258[i682] = 25;
                    int i684 = i683 - 1;
                    this.FastBitmap$CoordinateSystem = i684;
                    iArr258[i684 - 1] = iArr258[i684 - 1] + iArr258[i684];
                    int i685 = i684 + 1;
                    this.FastBitmap$CoordinateSystem = i685;
                    iArr258[i684] = iArr258[i685 - 2];
                    return 0;
                case 313:
                    int i686 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i686;
                    int[] iArr259 = this.values;
                    iArr259[i686 - 1] = iArr259[i686 - 1] & iArr259[i686];
                    int i687 = i686 - 1;
                    this.FastBitmap$CoordinateSystem = i687;
                    iArr259[i687 - 1] = iArr259[i687 - 1] | iArr259[i687];
                    int i688 = i687 + 1;
                    this.FastBitmap$CoordinateSystem = i688;
                    iArr259[i687] = iArr259[i688 - 2];
                    return 0;
                case 314:
                    Object[] objArr51 = this.invokeSuspend;
                    int i689 = this.FastBitmap$CoordinateSystem;
                    int i690 = i689 + 1;
                    this.FastBitmap$CoordinateSystem = i690;
                    objArr51[i689] = objArr51[16];
                    this.FastBitmap$CoordinateSystem = i690 + 1;
                    objArr51[i690] = objArr51[18];
                    return 0;
                case 315:
                    int i691 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i691;
                    Object[] objArr52 = this.invokeSuspend;
                    Object obj26 = objArr52[i691];
                    objArr52[i691] = null;
                    objArr52[17] = obj26;
                    int i692 = i691 - 1;
                    this.FastBitmap$CoordinateSystem = i692;
                    Object obj27 = objArr52[i692];
                    objArr52[i692] = null;
                    objArr52[20] = obj27;
                    return 0;
                case 316:
                    int i693 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i693;
                    Object[] objArr53 = this.invokeSuspend;
                    Object obj28 = objArr53[i693];
                    objArr53[i693] = null;
                    objArr53[15] = obj28;
                    int i694 = i693 - 1;
                    this.FastBitmap$CoordinateSystem = i694;
                    Object obj29 = objArr53[i694];
                    objArr53[i694] = null;
                    objArr53[16] = obj29;
                    return 0;
                case 317:
                    int i695 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i695;
                    Object[] objArr54 = this.invokeSuspend;
                    Object obj30 = objArr54[i695];
                    objArr54[i695] = null;
                    objArr54[18] = obj30;
                    this.FastBitmap$CoordinateSystem = i695 + 1;
                    objArr54[i695] = objArr54[18];
                    return 0;
                case 318:
                    Object[] objArr55 = this.invokeSuspend;
                    int i696 = this.FastBitmap$CoordinateSystem;
                    int i697 = i696 + 1;
                    this.FastBitmap$CoordinateSystem = i697;
                    objArr55[i696] = objArr55[20];
                    this.FastBitmap$CoordinateSystem = i697 + 1;
                    objArr55[i697] = objArr55[17];
                    return 0;
                case 319:
                    int[] iArr260 = this.values;
                    int i698 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i698 + 1;
                    iArr260[i698] = 33;
                    return 0;
                case 320:
                    this.setMax = this.values[this.FastBitmap$CoordinateSystem - 1];
                    return 0;
                case 321:
                    int[] iArr261 = this.values;
                    int i699 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i699 + 1;
                    iArr261[i699] = 47;
                    return 0;
                case 322:
                    int[] iArr262 = this.values;
                    int i700 = this.FastBitmap$CoordinateSystem;
                    int i701 = i700 + 1;
                    this.FastBitmap$CoordinateSystem = i701;
                    iArr262[i700] = 61;
                    iArr262[i701 - 1] = -iArr262[i701 - 1];
                    return 0;
                case 323:
                    int[] iArr263 = this.values;
                    int i702 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i702 + 1;
                    iArr263[i702] = 41;
                    return 0;
                case 324:
                    int i703 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i703;
                    this.invokeSuspend[i703] = null;
                    int i704 = i703 - 1;
                    this.FastBitmap$CoordinateSystem = i704;
                    int[] iArr264 = this.values;
                    iArr264[i704 - 1] = iArr264[i704] ^ iArr264[i704 - 1];
                    return 0;
                case 325:
                    int[] iArr265 = this.values;
                    int i705 = this.FastBitmap$CoordinateSystem;
                    int i706 = i705 + 1;
                    this.FastBitmap$CoordinateSystem = i706;
                    iArr265[i705] = 101;
                    iArr265[i706 - 1] = -iArr265[i706 - 1];
                    int i707 = i706 + 2;
                    this.FastBitmap$CoordinateSystem = i707;
                    iArr265[i707 - 1] = iArr265[i707 - 3];
                    iArr265[i706] = iArr265[i707 - 4];
                    return 0;
                case 326:
                    int[] iArr266 = this.values;
                    int i708 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i708 + 1;
                    iArr266[i708] = 6;
                    return 0;
                case 327:
                    int[] iArr267 = this.values;
                    int i709 = this.FastBitmap$CoordinateSystem;
                    int i710 = i709 + 1;
                    this.FastBitmap$CoordinateSystem = i710;
                    iArr267[i709] = 37;
                    int i711 = i710 + 2;
                    this.FastBitmap$CoordinateSystem = i711;
                    iArr267[i711 - 1] = iArr267[i711 - 3];
                    iArr267[i710] = iArr267[i711 - 4];
                    int i712 = i711 - 1;
                    this.FastBitmap$CoordinateSystem = i712;
                    iArr267[i712 - 1] = iArr267[i712] | iArr267[i712 - 1];
                    return 0;
                case 328:
                    int i713 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i713;
                    this.invokeSuspend[i713] = null;
                    int[] iArr268 = this.values;
                    int i714 = i713 + 2;
                    this.FastBitmap$CoordinateSystem = i714;
                    iArr268[i714 - 1] = iArr268[i714 - 3];
                    iArr268[i713] = iArr268[i714 - 4];
                    int i715 = i714 - 1;
                    this.FastBitmap$CoordinateSystem = i715;
                    iArr268[i715 - 1] = iArr268[i715] & iArr268[i715 - 1];
                    return 0;
                case 329:
                    int i716 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i716;
                    int[] iArr269 = this.values;
                    iArr269[i716 - 1] = iArr269[i716 - 1] | iArr269[i716];
                    int i717 = i716 - 1;
                    this.FastBitmap$CoordinateSystem = i717;
                    iArr269[i717 - 1] = iArr269[i717 - 1] & iArr269[i717];
                    iArr269[i717 - 1] = -iArr269[i717 - 1];
                    return 0;
                case 330:
                    int i718 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i718;
                    int[] iArr270 = this.values;
                    iArr270[i718 - 1] = iArr270[i718 - 1] << iArr270[i718];
                    int i719 = i718 + 2;
                    this.FastBitmap$CoordinateSystem = i719;
                    iArr270[i719 - 1] = iArr270[i719 - 3];
                    iArr270[i718] = iArr270[i719 - 4];
                    return 0;
                case 331:
                    int i720 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i720;
                    long[] jArr3 = this.toDoubleRange;
                    jArr3[i720 - 1] = jArr3[i720 - 1] - jArr3[i720];
                    return 0;
                case 332:
                    int i721 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i721;
                    this.setMax = this.values[i721] < 0 ? 1 : 0;
                    return 0;
                case 333:
                    int i722 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i722;
                    long[] jArr4 = this.toDoubleRange;
                    this.values[i722 - 1] = (jArr4[i722 - 1] > jArr4[i722] ? 1 : (jArr4[i722 - 1] == jArr4[i722] ? 0 : -1));
                    return 0;
                case 334:
                    int i723 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i723;
                    long[] jArr5 = this.toDoubleRange;
                    jArr5[i723 - 1] = jArr5[i723 - 1] ^ jArr5[i723];
                    return 0;
                case 335:
                    int[] iArr271 = this.values;
                    int i724 = this.FastBitmap$CoordinateSystem;
                    int i725 = i724 + 1;
                    this.FastBitmap$CoordinateSystem = i725;
                    iArr271[i724] = 75;
                    int i726 = i725 + 2;
                    this.FastBitmap$CoordinateSystem = i726;
                    iArr271[i726 - 1] = iArr271[i726 - 3];
                    iArr271[i725] = iArr271[i726 - 4];
                    int i727 = i726 + 2;
                    this.FastBitmap$CoordinateSystem = i727;
                    iArr271[i727 - 1] = iArr271[i727 - 3];
                    iArr271[i726] = iArr271[i727 - 4];
                    return 0;
                case 336:
                    int[] iArr272 = this.values;
                    int i728 = this.FastBitmap$CoordinateSystem;
                    int i729 = i728 + 1;
                    this.FastBitmap$CoordinateSystem = i729;
                    iArr272[i728] = 63;
                    int i730 = i729 + 2;
                    this.FastBitmap$CoordinateSystem = i730;
                    iArr272[i730 - 1] = iArr272[i730 - 3];
                    iArr272[i729] = iArr272[i730 - 4];
                    int i731 = i730 + 2;
                    this.FastBitmap$CoordinateSystem = i731;
                    iArr272[i731 - 1] = iArr272[i731 - 3];
                    iArr272[i730] = iArr272[i731 - 4];
                    return 0;
                case 337:
                    int i732 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i732;
                    int[] iArr273 = this.values;
                    iArr273[i732 - 1] = iArr273[i732 - 1] << iArr273[i732];
                    iArr273[i732 - 1] = -iArr273[i732 - 1];
                    int i733 = i732 + 2;
                    this.FastBitmap$CoordinateSystem = i733;
                    iArr273[i733 - 1] = iArr273[i733 - 3];
                    iArr273[i732] = iArr273[i733 - 4];
                    return 0;
                case 338:
                    int[] iArr274 = this.values;
                    int i734 = this.FastBitmap$CoordinateSystem;
                    int i735 = iArr274[i734 - 1];
                    iArr274[i734 - 1] = iArr274[i734 - 2];
                    iArr274[i734 - 2] = i735;
                    int i736 = i734 + 1;
                    this.FastBitmap$CoordinateSystem = i736;
                    iArr274[i734] = -1;
                    int i737 = i736 - 1;
                    this.FastBitmap$CoordinateSystem = i737;
                    iArr274[i737 - 1] = iArr274[i737] ^ iArr274[i737 - 1];
                    return 0;
                case 339:
                    int[] iArr275 = this.values;
                    int i738 = this.FastBitmap$CoordinateSystem;
                    int i739 = i738 + 2;
                    this.FastBitmap$CoordinateSystem = i739;
                    iArr275[i739 - 1] = iArr275[i739 - 3];
                    iArr275[i738] = iArr275[i739 - 4];
                    iArr275[i739 - 1] = -iArr275[i739 - 1];
                    int i740 = i739 - 1;
                    this.FastBitmap$CoordinateSystem = i740;
                    iArr275[i740 - 1] = iArr275[i740] & iArr275[i740 - 1];
                    return 0;
                case 340:
                    int[] iArr276 = this.values;
                    int i741 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i741 + 1;
                    iArr276[i741] = 1;
                    return 0;
                case 341:
                    Object[] objArr56 = this.invokeSuspend;
                    int i742 = this.FastBitmap$CoordinateSystem;
                    int i743 = i742 + 1;
                    this.FastBitmap$CoordinateSystem = i743;
                    objArr56[i742] = objArr56[15];
                    this.FastBitmap$CoordinateSystem = i743 + 1;
                    objArr56[i743] = objArr56[16];
                    return 0;
                case 342:
                    int[] iArr277 = this.values;
                    int i744 = this.FastBitmap$CoordinateSystem;
                    int i745 = i744 + 1;
                    this.FastBitmap$CoordinateSystem = i745;
                    iArr277[i744] = 45;
                    int i746 = i745 + 1;
                    this.FastBitmap$CoordinateSystem = i746;
                    iArr277[i745] = iArr277[i746 - 2];
                    return 0;
                case 343:
                    int[] iArr278 = this.values;
                    int i747 = this.FastBitmap$CoordinateSystem;
                    int i748 = iArr278[i747 - 1];
                    iArr278[i747 - 1] = iArr278[i747 - 2];
                    iArr278[i747 - 2] = i748;
                    int i749 = i747 - 1;
                    this.FastBitmap$CoordinateSystem = i749;
                    this.invokeSuspend[i749] = null;
                    int i750 = i749 + 2;
                    this.FastBitmap$CoordinateSystem = i750;
                    iArr278[i750 - 1] = iArr278[i750 - 3];
                    iArr278[i749] = iArr278[i750 - 4];
                    return 0;
                case 344:
                    int[] iArr279 = this.values;
                    int i751 = this.FastBitmap$CoordinateSystem;
                    iArr279[i751 - 1] = -iArr279[i751 - 1];
                    int i752 = i751 - 1;
                    this.FastBitmap$CoordinateSystem = i752;
                    iArr279[i752 - 1] = iArr279[i752 - 1] | iArr279[i752];
                    int i753 = i752 - 1;
                    this.FastBitmap$CoordinateSystem = i753;
                    iArr279[i753 - 1] = iArr279[i753 - 1] + iArr279[i753];
                    return 0;
                case 345:
                    int[] iArr280 = this.values;
                    int i754 = this.FastBitmap$CoordinateSystem;
                    int i755 = i754 + 1;
                    this.FastBitmap$CoordinateSystem = i755;
                    iArr280[i754] = 2;
                    this.FastBitmap$CoordinateSystem = i755 + 1;
                    iArr280[i755] = 3;
                    return 0;
                case 346:
                    int i756 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i756;
                    int[] iArr281 = this.values;
                    iArr281[i756 - 1] = iArr281[i756 - 1] * iArr281[i756];
                    int i757 = i756 - 1;
                    this.FastBitmap$CoordinateSystem = i757;
                    this.invokeSuspend[i757] = null;
                    return 0;
                case 347:
                    int[] iArr282 = this.values;
                    int i758 = this.FastBitmap$CoordinateSystem;
                    int i759 = i758 + 1;
                    this.FastBitmap$CoordinateSystem = i759;
                    iArr282[i758] = 90;
                    int i760 = i759 + 1;
                    this.FastBitmap$CoordinateSystem = i760;
                    iArr282[i759] = 0;
                    int i761 = i760 - 1;
                    this.FastBitmap$CoordinateSystem = i761;
                    iArr282[i761 - 1] = iArr282[i761 - 1] / iArr282[i761];
                    return 0;
                case 348:
                    int[] iArr283 = this.values;
                    int i762 = this.FastBitmap$CoordinateSystem;
                    int i763 = i762 + 1;
                    this.FastBitmap$CoordinateSystem = i763;
                    iArr283[i762] = 105;
                    iArr283[i763 - 1] = -iArr283[i763 - 1];
                    int i764 = i763 + 1;
                    this.FastBitmap$CoordinateSystem = i764;
                    iArr283[i763] = iArr283[i764 - 2];
                    return 0;
                case 349:
                    Object[] objArr57 = this.invokeSuspend;
                    int i765 = this.FastBitmap$CoordinateSystem;
                    int i766 = i765 + 1;
                    this.FastBitmap$CoordinateSystem = i766;
                    objArr57[i765] = objArr57[15];
                    int[] iArr284 = this.values;
                    this.FastBitmap$CoordinateSystem = i766 + 1;
                    iArr284[i766] = 0;
                    return 0;
                case 350:
                    int i767 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i767;
                    int[] iArr285 = this.values;
                    iArr285[i767 - 1] = iArr285[i767 - 1] | iArr285[i767];
                    int i768 = i767 + 2;
                    this.FastBitmap$CoordinateSystem = i768;
                    iArr285[i768 - 1] = iArr285[i768 - 3];
                    iArr285[i767] = iArr285[i768 - 4];
                    int i769 = i768 - 1;
                    this.FastBitmap$CoordinateSystem = i769;
                    iArr285[i769 - 1] = iArr285[i769] | iArr285[i769 - 1];
                    return 0;
                case 351:
                    int i770 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i770;
                    this.invokeSuspend[i770] = null;
                    int i771 = i770 - 1;
                    this.FastBitmap$CoordinateSystem = i771;
                    int[] iArr286 = this.values;
                    iArr286[i771 - 1] = iArr286[i771 - 1] ^ iArr286[i771];
                    int i772 = i771 - 1;
                    this.FastBitmap$CoordinateSystem = i772;
                    iArr286[i772 - 1] = iArr286[i772 - 1] - iArr286[i772];
                    return 0;
                case 352:
                    int[] iArr287 = this.values;
                    int i773 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i773 + 1;
                    iArr287[i773] = 88;
                    return 0;
                case 353:
                    int[] iArr288 = this.values;
                    int i774 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i774 + 1;
                    iArr288[i774] = 45;
                    return 0;
                case 354:
                    int[] iArr289 = this.values;
                    int i775 = this.FastBitmap$CoordinateSystem;
                    int i776 = i775 + 2;
                    this.FastBitmap$CoordinateSystem = i776;
                    iArr289[i776 - 1] = iArr289[i776 - 3];
                    iArr289[i775] = iArr289[i776 - 4];
                    int i777 = i776 + 2;
                    this.FastBitmap$CoordinateSystem = i777;
                    iArr289[i777 - 1] = iArr289[i777 - 3];
                    iArr289[i776] = iArr289[i777 - 4];
                    int i778 = i777 - 1;
                    this.FastBitmap$CoordinateSystem = i778;
                    iArr289[i778 - 1] = iArr289[i778] ^ iArr289[i778 - 1];
                    return 0;
                case 355:
                    int i779 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i779;
                    int[] iArr290 = this.values;
                    iArr290[i779 - 1] = iArr290[i779 - 1] & iArr290[i779];
                    int i780 = i779 + 2;
                    this.FastBitmap$CoordinateSystem = i780;
                    iArr290[i780 - 1] = iArr290[i780 - 3];
                    iArr290[i779] = iArr290[i780 - 4];
                    iArr290[i780 - 1] = -iArr290[i780 - 1];
                    return 0;
                case 356:
                    int[] iArr291 = this.values;
                    int i781 = this.FastBitmap$CoordinateSystem;
                    int i782 = i781 + 1;
                    this.FastBitmap$CoordinateSystem = i782;
                    iArr291[i781] = 39;
                    iArr291[i782 - 1] = -iArr291[i782 - 1];
                    int i783 = i782 + 2;
                    this.FastBitmap$CoordinateSystem = i783;
                    iArr291[i783 - 1] = iArr291[i783 - 3];
                    iArr291[i782] = iArr291[i783 - 4];
                    return 0;
                case 357:
                    int i784 = this.FastBitmap$CoordinateSystem - 2;
                    this.FastBitmap$CoordinateSystem = i784;
                    int[] iArr292 = this.values;
                    this.setMax = iArr292[i784] > iArr292[i784 + 1] ? 1 : 0;
                    return 0;
                case 358:
                    Object[] objArr58 = this.invokeSuspend;
                    int i785 = this.FastBitmap$CoordinateSystem;
                    int i786 = i785 + 1;
                    this.FastBitmap$CoordinateSystem = i786;
                    objArr58[i785] = objArr58[15];
                    this.FastBitmap$CoordinateSystem = i786 + 1;
                    objArr58[i786] = null;
                    return 0;
                case 359:
                    int[] iArr293 = this.values;
                    int i787 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i787 + 1;
                    iArr293[i787] = 72;
                    return 0;
                case AUScreenAdaptTool.WIDTH_BASE /*360*/:
                    int[] iArr294 = this.values;
                    int i788 = this.FastBitmap$CoordinateSystem;
                    int i789 = i788 + 1;
                    this.FastBitmap$CoordinateSystem = i789;
                    iArr294[i788] = -1;
                    int i790 = i789 + 2;
                    this.FastBitmap$CoordinateSystem = i790;
                    iArr294[i790 - 1] = iArr294[i790 - 3];
                    iArr294[i789] = iArr294[i790 - 4];
                    int i791 = i790 - 1;
                    this.FastBitmap$CoordinateSystem = i791;
                    iArr294[i791 - 1] = iArr294[i791] & iArr294[i791 - 1];
                    return 0;
                case 361:
                    int i792 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i792;
                    int[] iArr295 = this.values;
                    iArr295[i792 - 1] = iArr295[i792 - 1] | iArr295[i792];
                    int i793 = i792 - 1;
                    this.FastBitmap$CoordinateSystem = i793;
                    iArr295[i793 - 1] = iArr295[i793] & iArr295[i793 - 1];
                    return 0;
                case 362:
                    int[] iArr296 = this.values;
                    int i794 = this.FastBitmap$CoordinateSystem;
                    int i795 = iArr296[i794 - 1];
                    iArr296[i794 - 1] = iArr296[i794 - 2];
                    iArr296[i794 - 2] = i795;
                    int i796 = i794 - 1;
                    this.FastBitmap$CoordinateSystem = i796;
                    this.invokeSuspend[i796] = null;
                    iArr296[i796 - 1] = -iArr296[i796 - 1];
                    return 0;
                case 363:
                    int[] iArr297 = this.values;
                    int i797 = this.FastBitmap$CoordinateSystem;
                    int i798 = i797 + 1;
                    this.FastBitmap$CoordinateSystem = i798;
                    iArr297[i797] = 1;
                    int i799 = i798 + 1;
                    this.FastBitmap$CoordinateSystem = i799;
                    iArr297[i798] = iArr297[i799 - 2];
                    return 0;
                case 364:
                    int[] iArr298 = this.values;
                    int i800 = this.FastBitmap$CoordinateSystem;
                    int i801 = i800 + 1;
                    this.FastBitmap$CoordinateSystem = i801;
                    iArr298[i800] = 45;
                    iArr298[i801 - 1] = -iArr298[i801 - 1];
                    return 0;
                case 365:
                    int[] iArr299 = this.values;
                    int i802 = this.FastBitmap$CoordinateSystem;
                    iArr299[i802 - 1] = -iArr299[i802 - 1];
                    this.FastBitmap$CoordinateSystem = i802 + 1;
                    iArr299[i802] = -1;
                    return 0;
                case 366:
                    int[] iArr300 = this.values;
                    int i803 = this.FastBitmap$CoordinateSystem;
                    iArr300[i803 - 1] = -iArr300[i803 - 1];
                    int i804 = i803 + 1;
                    this.FastBitmap$CoordinateSystem = i804;
                    iArr300[i803] = iArr300[i804 - 2];
                    this.FastBitmap$CoordinateSystem = i804 + 1;
                    iArr300[i804] = -1;
                    return 0;
                case 367:
                    int[] iArr301 = this.values;
                    int i805 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i805 + 1;
                    iArr301[i805] = 87;
                    return 0;
                case 368:
                    int[] iArr302 = this.values;
                    int i806 = this.FastBitmap$CoordinateSystem;
                    int i807 = i806 + 1;
                    this.FastBitmap$CoordinateSystem = i807;
                    iArr302[i806] = 1;
                    int i808 = i807 - 1;
                    this.FastBitmap$CoordinateSystem = i808;
                    iArr302[i808 - 1] = iArr302[i808 - 1] << iArr302[i808];
                    iArr302[i808 - 1] = -iArr302[i808 - 1];
                    return 0;
                case 369:
                    int[] iArr303 = this.values;
                    int i809 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i809 + 1;
                    iArr303[i809] = 80;
                    return 0;
                case 370:
                    int[] iArr304 = this.values;
                    int i810 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i810 + 1;
                    iArr304[i810] = 3;
                    return 0;
                case 371:
                    int[] iArr305 = this.values;
                    int i811 = this.FastBitmap$CoordinateSystem;
                    int i812 = i811 + 1;
                    this.FastBitmap$CoordinateSystem = i812;
                    iArr305[i811] = 4;
                    int i813 = i812 - 1;
                    this.FastBitmap$CoordinateSystem = i813;
                    iArr305[i813 - 1] = iArr305[i813 - 1] / iArr305[i813];
                    int i814 = i813 - 1;
                    this.FastBitmap$CoordinateSystem = i814;
                    this.invokeSuspend[i814] = null;
                    return 0;
                case 372:
                    int[] iArr306 = this.values;
                    int i815 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i815 + 1;
                    iArr306[i815] = 13;
                    return 0;
                case 373:
                    int[] iArr307 = this.values;
                    int i816 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i816 + 1;
                    iArr307[i816] = 71;
                    return 0;
                case 374:
                    int[] iArr308 = this.values;
                    int i817 = this.FastBitmap$CoordinateSystem;
                    iArr308[i817 - 1] = -iArr308[i817 - 1];
                    int i818 = i817 + 1;
                    this.FastBitmap$CoordinateSystem = i818;
                    iArr308[i817] = iArr308[i818 - 2];
                    iArr308[i818 - 1] = -iArr308[i818 - 1];
                    return 0;
                case 375:
                    int[] iArr309 = this.values;
                    int i819 = this.FastBitmap$CoordinateSystem;
                    int i820 = i819 + 1;
                    this.FastBitmap$CoordinateSystem = i820;
                    iArr309[i819] = 39;
                    int i821 = i820 + 1;
                    this.FastBitmap$CoordinateSystem = i821;
                    iArr309[i820] = 0;
                    int i822 = i821 - 1;
                    this.FastBitmap$CoordinateSystem = i822;
                    iArr309[i822 - 1] = iArr309[i822 - 1] / iArr309[i822];
                    return 0;
                case 376:
                    int[] iArr310 = this.values;
                    int i823 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i823 + 1;
                    iArr310[i823] = iArr310[21];
                    return 0;
                case 377:
                    int[] iArr311 = this.values;
                    int i824 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i824 + 1;
                    iArr311[i824] = 2;
                    return 0;
                case 378:
                    int[] iArr312 = this.values;
                    int i825 = this.FastBitmap$CoordinateSystem;
                    int i826 = i825 + 1;
                    this.FastBitmap$CoordinateSystem = i826;
                    iArr312[i825] = 0;
                    int i827 = i826 - 1;
                    this.FastBitmap$CoordinateSystem = i827;
                    iArr312[i827 - 1] = iArr312[i827 - 1] / iArr312[i827];
                    int i828 = i827 - 1;
                    this.FastBitmap$CoordinateSystem = i828;
                    this.invokeSuspend[i828] = null;
                    return 0;
                case 379:
                    Object[] objArr59 = this.invokeSuspend;
                    int i829 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i829 + 1;
                    objArr59[i829] = objArr59[20];
                    return 0;
                case 380:
                    int[] iArr313 = this.values;
                    int i830 = this.FastBitmap$CoordinateSystem;
                    int i831 = i830 + 1;
                    this.FastBitmap$CoordinateSystem = i831;
                    iArr313[i830] = 95;
                    int i832 = i831 + 1;
                    this.FastBitmap$CoordinateSystem = i832;
                    iArr313[i831] = iArr313[i832 - 2];
                    this.FastBitmap$CoordinateSystem = i832 + 1;
                    iArr313[i832] = -1;
                    return 0;
                case 381:
                    int[] iArr314 = this.values;
                    int i833 = this.FastBitmap$CoordinateSystem;
                    int i834 = i833 + 1;
                    this.FastBitmap$CoordinateSystem = i834;
                    iArr314[i833] = 111;
                    int i835 = i834 + 2;
                    this.FastBitmap$CoordinateSystem = i835;
                    iArr314[i835 - 1] = iArr314[i835 - 3];
                    iArr314[i834] = iArr314[i835 - 4];
                    int i836 = i835 - 1;
                    this.FastBitmap$CoordinateSystem = i836;
                    iArr314[i836 - 1] = iArr314[i836] & iArr314[i836 - 1];
                    return 0;
                case 382:
                    int[] iArr315 = this.values;
                    int i837 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i837 + 1;
                    iArr315[i837] = 99;
                    return 0;
                case 383:
                    int[] iArr316 = this.values;
                    int i838 = this.FastBitmap$CoordinateSystem;
                    int i839 = i838 + 1;
                    this.FastBitmap$CoordinateSystem = i839;
                    iArr316[i838] = 0;
                    int i840 = i839 - 1;
                    this.FastBitmap$CoordinateSystem = i840;
                    iArr316[i840 - 1] = iArr316[i840 - 1] / iArr316[i840];
                    return 0;
                case 384:
                    Object[] objArr60 = this.invokeSuspend;
                    int i841 = this.FastBitmap$CoordinateSystem;
                    int i842 = i841 + 1;
                    this.FastBitmap$CoordinateSystem = i842;
                    objArr60[i841] = objArr60[18];
                    this.FastBitmap$CoordinateSystem = i842 + 1;
                    objArr60[i842] = objArr60[19];
                    return 0;
                case 385:
                    int i843 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i843;
                    Object[] objArr61 = this.invokeSuspend;
                    Object obj31 = objArr61[i843];
                    objArr61[i843] = null;
                    objArr61[20] = obj31;
                    int[] iArr317 = this.values;
                    this.FastBitmap$CoordinateSystem = i843 + 1;
                    iArr317[i843] = -1;
                    return 0;
                case 386:
                    int i844 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i844;
                    int[] iArr318 = this.values;
                    iArr318[21] = iArr318[i844];
                    return 0;
                case 387:
                    int[] iArr319 = this.values;
                    int i845 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i845 + 1;
                    iArr319[i845] = 4;
                    return 0;
                case 388:
                    int i846 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i846;
                    int[] iArr320 = this.values;
                    iArr320[i846 - 1] = iArr320[i846 - 1] >> iArr320[i846];
                    int i847 = i846 - 1;
                    this.FastBitmap$CoordinateSystem = i847;
                    this.invokeSuspend[i847] = null;
                    return 0;
                case 389:
                    int[] iArr321 = this.values;
                    int i848 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i848 + 1;
                    iArr321[i848] = 62;
                    return 0;
                case 390:
                    int[] iArr322 = this.values;
                    int i849 = this.FastBitmap$CoordinateSystem;
                    int i850 = i849 + 1;
                    this.FastBitmap$CoordinateSystem = i850;
                    iArr322[i849] = 7;
                    int i851 = i850 + 2;
                    this.FastBitmap$CoordinateSystem = i851;
                    iArr322[i851 - 1] = iArr322[i851 - 3];
                    iArr322[i850] = iArr322[i851 - 4];
                    int i852 = i851 + 2;
                    this.FastBitmap$CoordinateSystem = i852;
                    iArr322[i852 - 1] = iArr322[i852 - 3];
                    iArr322[i851] = iArr322[i852 - 4];
                    return 0;
                case 391:
                    int i853 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i853;
                    int[] iArr323 = this.values;
                    iArr323[i853 - 1] = iArr323[i853 - 1] | iArr323[i853];
                    iArr323[i853 - 1] = -iArr323[i853 - 1];
                    int i854 = i853 + 2;
                    this.FastBitmap$CoordinateSystem = i854;
                    iArr323[i854 - 1] = iArr323[i854 - 3];
                    iArr323[i853] = iArr323[i854 - 4];
                    return 0;
                case 392:
                    int[] iArr324 = this.values;
                    int i855 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i855 + 1;
                    iArr324[i855] = 59;
                    return 0;
                case 393:
                    int i856 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i856;
                    int[] iArr325 = this.values;
                    iArr325[i856 - 1] = iArr325[i856 - 1] | iArr325[i856];
                    int i857 = i856 - 1;
                    this.FastBitmap$CoordinateSystem = i857;
                    iArr325[i857 - 1] = iArr325[i857 - 1] & iArr325[i857];
                    int i858 = i857 + 1;
                    this.FastBitmap$CoordinateSystem = i858;
                    int i859 = iArr325[i858 - 2];
                    iArr325[i857] = i859;
                    iArr325[i858 - 2] = iArr325[i858 - 3];
                    iArr325[i858 - 3] = iArr325[i858 - 4];
                    iArr325[i858 - 4] = i859;
                    return 0;
                case 394:
                    Object[] objArr62 = this.invokeSuspend;
                    int i860 = this.FastBitmap$CoordinateSystem;
                    int i861 = i860 + 1;
                    this.FastBitmap$CoordinateSystem = i861;
                    objArr62[i860] = objArr62[15];
                    this.FastBitmap$CoordinateSystem = i861 + 1;
                    objArr62[i861] = objArr62[14];
                    return 0;
                case 395:
                    int i862 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i862;
                    int[] iArr326 = this.values;
                    iArr326[i862 - 1] = iArr326[i862 - 1] ^ iArr326[i862];
                    int i863 = i862 + 2;
                    this.FastBitmap$CoordinateSystem = i863;
                    iArr326[i863 - 1] = iArr326[i863 - 3];
                    iArr326[i862] = iArr326[i863 - 4];
                    iArr326[i863 - 1] = -iArr326[i863 - 1];
                    return 0;
                case 396:
                    int[] iArr327 = this.values;
                    int i864 = this.FastBitmap$CoordinateSystem;
                    int i865 = i864 + 1;
                    this.FastBitmap$CoordinateSystem = i865;
                    iArr327[i864] = 0;
                    int i866 = i865 - 1;
                    this.FastBitmap$CoordinateSystem = i866;
                    iArr327[21] = iArr327[i866];
                    return 0;
                case 397:
                    int[] iArr328 = this.values;
                    int i867 = this.FastBitmap$CoordinateSystem;
                    int i868 = i867 + 1;
                    this.FastBitmap$CoordinateSystem = i868;
                    iArr328[i867] = 1;
                    int i869 = i868 - 1;
                    this.FastBitmap$CoordinateSystem = i869;
                    iArr328[21] = iArr328[i869];
                    return 0;
                case 398:
                    int[] iArr329 = this.values;
                    int i870 = this.FastBitmap$CoordinateSystem;
                    int i871 = iArr329[i870 - 1];
                    iArr329[i870 - 1] = iArr329[i870 - 2];
                    iArr329[i870 - 2] = i871;
                    this.FastBitmap$CoordinateSystem = i870 + 1;
                    iArr329[i870] = -1;
                    return 0;
                case SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR /*399*/:
                    int i872 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i872;
                    int[] iArr330 = this.values;
                    iArr330[i872 - 1] = iArr330[i872 - 1] ^ iArr330[i872];
                    int i873 = i872 - 1;
                    this.FastBitmap$CoordinateSystem = i873;
                    iArr330[i873 - 1] = iArr330[i873 - 1] - iArr330[i873];
                    this.FastBitmap$CoordinateSystem = i873 + 1;
                    iArr330[i873] = 1;
                    return 0;
                case 400:
                    int[] iArr331 = this.values;
                    int i874 = this.FastBitmap$CoordinateSystem;
                    int i875 = i874 + 1;
                    this.FastBitmap$CoordinateSystem = i875;
                    iArr331[i874] = 69;
                    iArr331[i875 - 1] = -iArr331[i875 - 1];
                    return 0;
                case 401:
                    int[] iArr332 = this.values;
                    int i876 = this.FastBitmap$CoordinateSystem;
                    int i877 = i876 + 1;
                    this.FastBitmap$CoordinateSystem = i877;
                    iArr332[i876] = iArr332[i877 - 2];
                    iArr332[i877 - 1] = -iArr332[i877 - 1];
                    this.FastBitmap$CoordinateSystem = i877 + 1;
                    iArr332[i877] = -1;
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_ENC_NO_MEMORY /*402*/:
                    int[] iArr333 = this.values;
                    int i878 = this.FastBitmap$CoordinateSystem;
                    iArr333[i878 - 1] = -iArr333[i878 - 1];
                    int i879 = i878 - 1;
                    this.FastBitmap$CoordinateSystem = i879;
                    iArr333[i879 - 1] = iArr333[i879 - 1] & iArr333[i879];
                    this.FastBitmap$CoordinateSystem = i879 + 1;
                    iArr333[i879] = 1;
                    return 0;
                case 403:
                    int[] iArr334 = this.values;
                    int i880 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i880 + 1;
                    iArr334[i880] = 36;
                    return 0;
                case 404:
                    int[] iArr335 = this.values;
                    int i881 = this.FastBitmap$CoordinateSystem;
                    int i882 = i881 + 1;
                    this.FastBitmap$CoordinateSystem = i882;
                    iArr335[i881] = 39;
                    int i883 = i882 + 2;
                    this.FastBitmap$CoordinateSystem = i883;
                    iArr335[i883 - 1] = iArr335[i883 - 3];
                    iArr335[i882] = iArr335[i883 - 4];
                    int i884 = i883 + 2;
                    this.FastBitmap$CoordinateSystem = i884;
                    iArr335[i884 - 1] = iArr335[i884 - 3];
                    iArr335[i883] = iArr335[i884 - 4];
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_ENC_GET_ENCRYPT_KEY_FAILED /*405*/:
                    int i885 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i885;
                    int[] iArr336 = this.values;
                    iArr336[i885 - 1] = iArr336[i885 - 1] | iArr336[i885];
                    int i886 = i885 - 1;
                    this.FastBitmap$CoordinateSystem = i886;
                    iArr336[i886 - 1] = iArr336[i886 - 1] & iArr336[i886];
                    int i887 = i886 + 1;
                    this.FastBitmap$CoordinateSystem = i887;
                    iArr336[i886] = iArr336[i887 - 2];
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_ENC_INVALID_ENCRYPTED_DATA /*406*/:
                    int[] iArr337 = this.values;
                    int i888 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i888 + 1;
                    iArr337[i888] = iArr337[16];
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_ENC_DECRYPT_MISMATCH_KEY_DATA /*407*/:
                    int[] iArr338 = this.values;
                    int i889 = this.FastBitmap$CoordinateSystem;
                    int i890 = i889 + 1;
                    this.FastBitmap$CoordinateSystem = i890;
                    iArr338[i889] = 3;
                    iArr338[i890 - 1] = -iArr338[i890 - 1];
                    return 0;
                case 408:
                    int i891 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i891;
                    int[] iArr339 = this.values;
                    iArr339[i891 - 1] = iArr339[i891 - 1] + iArr339[i891];
                    this.FastBitmap$CoordinateSystem = i891 + 1;
                    iArr339[i891] = 1;
                    return 0;
                case 409:
                    int[] iArr340 = this.values;
                    int i892 = this.FastBitmap$CoordinateSystem;
                    int i893 = i892 + 1;
                    this.FastBitmap$CoordinateSystem = i893;
                    iArr340[i892] = 13;
                    iArr340[i893 - 1] = -iArr340[i893 - 1];
                    int i894 = i893 + 2;
                    this.FastBitmap$CoordinateSystem = i894;
                    iArr340[i894 - 1] = iArr340[i894 - 3];
                    iArr340[i893] = iArr340[i894 - 4];
                    return 0;
                case 410:
                    int[] iArr341 = this.values;
                    int i895 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i895 + 1;
                    iArr341[i895] = 95;
                    return 0;
                case 411:
                    Object[] objArr63 = this.invokeSuspend;
                    int i896 = this.FastBitmap$CoordinateSystem;
                    int i897 = i896 + 1;
                    this.FastBitmap$CoordinateSystem = i897;
                    objArr63[i896] = objArr63[17];
                    int i898 = i897 + 1;
                    this.FastBitmap$CoordinateSystem = i898;
                    objArr63[i897] = objArr63[18];
                    this.FastBitmap$CoordinateSystem = i898 + 1;
                    objArr63[i898] = objArr63[19];
                    return 0;
                case 412:
                    int[] iArr342 = this.values;
                    int i899 = this.FastBitmap$CoordinateSystem;
                    int i900 = i899 + 1;
                    this.FastBitmap$CoordinateSystem = i900;
                    iArr342[i899] = 33;
                    iArr342[i900 - 1] = -iArr342[i900 - 1];
                    return 0;
                case 413:
                    Object[] objArr64 = this.invokeSuspend;
                    int i901 = this.FastBitmap$CoordinateSystem;
                    int i902 = i901 + 1;
                    this.FastBitmap$CoordinateSystem = i902;
                    objArr64[i901] = objArr64[17];
                    this.FastBitmap$CoordinateSystem = i902 + 1;
                    objArr64[i902] = objArr64[18];
                    return 0;
                case 414:
                    int[] iArr343 = this.values;
                    int i903 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i903 + 1;
                    iArr343[i903] = 75;
                    return 0;
                case 415:
                    int[] iArr344 = this.values;
                    int i904 = this.FastBitmap$CoordinateSystem;
                    int i905 = i904 + 1;
                    this.FastBitmap$CoordinateSystem = i905;
                    iArr344[i904] = 119;
                    int i906 = i905 + 2;
                    this.FastBitmap$CoordinateSystem = i906;
                    iArr344[i906 - 1] = iArr344[i906 - 3];
                    iArr344[i905] = iArr344[i906 - 4];
                    int i907 = i906 + 2;
                    this.FastBitmap$CoordinateSystem = i907;
                    iArr344[i907 - 1] = iArr344[i907 - 3];
                    iArr344[i906] = iArr344[i907 - 4];
                    return 0;
                case 416:
                    int i908 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i908;
                    int[] iArr345 = this.values;
                    iArr345[i908 - 1] = iArr345[i908 - 1] | iArr345[i908];
                    int i909 = i908 + 2;
                    this.FastBitmap$CoordinateSystem = i909;
                    iArr345[i909 - 1] = iArr345[i909 - 3];
                    iArr345[i908] = iArr345[i909 - 4];
                    return 0;
                case 417:
                    int[] iArr346 = this.values;
                    int i910 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i910 + 1;
                    iArr346[i910] = 94;
                    return 0;
                case 418:
                    int[] iArr347 = this.values;
                    int i911 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i911 + 1;
                    iArr347[i911] = 66;
                    return 0;
                case 419:
                    int[] iArr348 = this.values;
                    int i912 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i912 + 1;
                    iArr348[i912] = 24;
                    return 0;
                case 420:
                    int[] iArr349 = this.values;
                    int i913 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i913 + 1;
                    iArr349[i913] = 79;
                    return 0;
                case 421:
                    int[] iArr350 = this.values;
                    int i914 = this.FastBitmap$CoordinateSystem;
                    int i915 = i914 + 1;
                    this.FastBitmap$CoordinateSystem = i915;
                    iArr350[i914] = 107;
                    int i916 = i915 + 2;
                    this.FastBitmap$CoordinateSystem = i916;
                    iArr350[i916 - 1] = iArr350[i916 - 3];
                    iArr350[i915] = iArr350[i916 - 4];
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_ENC_DECRYPT_FAILED /*422*/:
                    int[] iArr351 = this.values;
                    int i917 = this.FastBitmap$CoordinateSystem;
                    iArr351[i917 - 1] = -iArr351[i917 - 1];
                    int i918 = i917 - 1;
                    this.FastBitmap$CoordinateSystem = i918;
                    iArr351[i918 - 1] = iArr351[i918 - 1] | iArr351[i918];
                    iArr351[i918 - 1] = -iArr351[i918 - 1];
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_ENC_BASE64_DECODE_FAILED /*423*/:
                    int[] iArr352 = this.values;
                    int i919 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i919 + 1;
                    iArr352[i919] = 109;
                    return 0;
                case 424:
                    int i920 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i920;
                    int[] iArr353 = this.values;
                    iArr353[i920 - 1] = iArr353[i920 - 1] | iArr353[i920];
                    int i921 = iArr353[i920 - 1];
                    iArr353[i920 - 1] = iArr353[i920 - 2];
                    iArr353[i920 - 2] = i921;
                    return 0;
                case 425:
                    int[] iArr354 = this.values;
                    int i922 = this.FastBitmap$CoordinateSystem;
                    int i923 = i922 + 1;
                    this.FastBitmap$CoordinateSystem = i923;
                    iArr354[i922] = 1;
                    int i924 = i923 + 2;
                    this.FastBitmap$CoordinateSystem = i924;
                    iArr354[i924 - 1] = iArr354[i924 - 3];
                    iArr354[i923] = iArr354[i924 - 4];
                    iArr354[i924 - 1] = -iArr354[i924 - 1];
                    return 0;
                case 426:
                    int[] iArr355 = this.values;
                    int i925 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i925 + 1;
                    iArr355[i925] = 46;
                    return 0;
                case 427:
                    int[] iArr356 = this.values;
                    int i926 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i926 + 1;
                    iArr356[i926] = 96;
                    return 0;
                case 428:
                    int[] iArr357 = this.values;
                    int i927 = this.FastBitmap$CoordinateSystem;
                    iArr357[i927 - 1] = -iArr357[i927 - 1];
                    int i928 = i927 + 2;
                    this.FastBitmap$CoordinateSystem = i928;
                    iArr357[i928 - 1] = iArr357[i928 - 3];
                    iArr357[i927] = iArr357[i928 - 4];
                    int i929 = i928 - 1;
                    this.FastBitmap$CoordinateSystem = i929;
                    iArr357[i929 - 1] = iArr357[i929] | iArr357[i929 - 1];
                    return 0;
                case 429:
                    int[] iArr358 = this.values;
                    int i930 = this.FastBitmap$CoordinateSystem;
                    int i931 = i930 + 1;
                    this.FastBitmap$CoordinateSystem = i931;
                    iArr358[i930] = 39;
                    this.FastBitmap$CoordinateSystem = i931 + 1;
                    iArr358[i931] = 0;
                    return 0;
                case 430:
                    int[] iArr359 = this.values;
                    int i932 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i932 + 1;
                    iArr359[i932] = 61;
                    return 0;
                case 431:
                    int[] iArr360 = this.values;
                    int i933 = this.FastBitmap$CoordinateSystem;
                    int i934 = i933 + 1;
                    this.FastBitmap$CoordinateSystem = i934;
                    iArr360[i933] = 69;
                    int i935 = i934 + 2;
                    this.FastBitmap$CoordinateSystem = i935;
                    iArr360[i935 - 1] = iArr360[i935 - 3];
                    iArr360[i934] = iArr360[i935 - 4];
                    return 0;
                case 432:
                    int[] iArr361 = this.values;
                    int i936 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i936 + 1;
                    iArr361[i936] = 42;
                    return 0;
                case 433:
                    int[] iArr362 = this.values;
                    int i937 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i937 + 1;
                    iArr362[i937] = 26;
                    return 0;
                case 434:
                    int[] iArr363 = this.values;
                    int i938 = this.FastBitmap$CoordinateSystem;
                    int i939 = i938 + 1;
                    this.FastBitmap$CoordinateSystem = i939;
                    iArr363[i938] = 11;
                    int i940 = i939 + 2;
                    this.FastBitmap$CoordinateSystem = i940;
                    iArr363[i940 - 1] = iArr363[i940 - 3];
                    iArr363[i939] = iArr363[i940 - 4];
                    return 0;
                case 435:
                    int i941 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i941;
                    int[] iArr364 = this.values;
                    iArr364[i941 - 1] = iArr364[i941 - 1] | iArr364[i941];
                    iArr364[i941 - 1] = -iArr364[i941 - 1];
                    int i942 = i941 + 1;
                    this.FastBitmap$CoordinateSystem = i942;
                    iArr364[i941] = iArr364[i942 - 2];
                    return 0;
                case 436:
                    Object[] objArr65 = this.invokeSuspend;
                    int i943 = this.FastBitmap$CoordinateSystem;
                    int i944 = i943 + 1;
                    this.FastBitmap$CoordinateSystem = i944;
                    objArr65[i943] = objArr65[14];
                    int i945 = i944 + 1;
                    this.FastBitmap$CoordinateSystem = i945;
                    objArr65[i944] = objArr65[15];
                    this.FastBitmap$CoordinateSystem = i945 + 1;
                    objArr65[i945] = objArr65[16];
                    return 0;
                case 437:
                    int i946 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i946;
                    Object[] objArr66 = this.invokeSuspend;
                    Object obj32 = objArr66[i946];
                    objArr66[i946] = null;
                    objArr66[15] = obj32;
                    int i947 = i946 - 1;
                    this.FastBitmap$CoordinateSystem = i947;
                    Object obj33 = objArr66[i947];
                    objArr66[i947] = null;
                    objArr66[16] = obj33;
                    int i948 = i947 - 1;
                    this.FastBitmap$CoordinateSystem = i948;
                    Object obj34 = objArr66[i948];
                    objArr66[i948] = null;
                    objArr66[17] = obj34;
                    return 0;
                case 438:
                    Object[] objArr67 = this.invokeSuspend;
                    int i949 = this.FastBitmap$CoordinateSystem;
                    int i950 = i949 + 1;
                    this.FastBitmap$CoordinateSystem = i950;
                    objArr67[i949] = objArr67[16];
                    int i951 = i950 + 1;
                    this.FastBitmap$CoordinateSystem = i951;
                    objArr67[i950] = objArr67[17];
                    this.FastBitmap$CoordinateSystem = i951 + 1;
                    objArr67[i951] = objArr67[18];
                    return 0;
                case 439:
                    int[] iArr365 = this.values;
                    int i952 = this.FastBitmap$CoordinateSystem;
                    int i953 = i952 + 1;
                    this.FastBitmap$CoordinateSystem = i953;
                    iArr365[i952] = 65;
                    int i954 = i953 + 1;
                    this.FastBitmap$CoordinateSystem = i954;
                    iArr365[i953] = iArr365[i954 - 2];
                    this.FastBitmap$CoordinateSystem = i954 + 1;
                    iArr365[i954] = -1;
                    return 0;
                case 440:
                    Object[] objArr68 = this.invokeSuspend;
                    int i955 = this.FastBitmap$CoordinateSystem;
                    int i956 = i955 + 1;
                    this.FastBitmap$CoordinateSystem = i956;
                    objArr68[i955] = objArr68[19];
                    int i957 = i956 + 1;
                    this.FastBitmap$CoordinateSystem = i957;
                    objArr68[i956] = objArr68[18];
                    this.FastBitmap$CoordinateSystem = i957 + 1;
                    objArr68[i957] = objArr68[17];
                    return 0;
                case 441:
                    int[] iArr366 = this.values;
                    int i958 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i958 + 1;
                    iArr366[i958] = 73;
                    return 0;
                case 442:
                    int[] iArr367 = this.values;
                    int i959 = this.FastBitmap$CoordinateSystem;
                    int i960 = i959 + 1;
                    this.FastBitmap$CoordinateSystem = i960;
                    iArr367[i959] = 35;
                    int i961 = i960 + 2;
                    this.FastBitmap$CoordinateSystem = i961;
                    iArr367[i961 - 1] = iArr367[i961 - 3];
                    iArr367[i960] = iArr367[i961 - 4];
                    int i962 = i961 - 1;
                    this.FastBitmap$CoordinateSystem = i962;
                    iArr367[i962 - 1] = iArr367[i962] & iArr367[i962 - 1];
                    return 0;
                case WebSocket.DEFAULT_WSS_PORT /*443*/:
                    int[] iArr368 = this.values;
                    int i963 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i963 + 1;
                    iArr368[i963] = 56;
                    return 0;
                case 444:
                    int[] iArr369 = this.values;
                    int i964 = this.FastBitmap$CoordinateSystem;
                    iArr369[i964 - 1] = -iArr369[i964 - 1];
                    int i965 = i964 + 1;
                    this.FastBitmap$CoordinateSystem = i965;
                    iArr369[i964] = -1;
                    int i966 = i965 - 1;
                    this.FastBitmap$CoordinateSystem = i966;
                    iArr369[i966 - 1] = iArr369[i966] ^ iArr369[i966 - 1];
                    return 0;
                case 445:
                    int i967 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i967;
                    int[] iArr370 = this.values;
                    iArr370[i967 - 1] = iArr370[i967 - 1] | iArr370[i967];
                    int i968 = i967 - 1;
                    this.FastBitmap$CoordinateSystem = i968;
                    iArr370[i968 - 1] = iArr370[i968 - 1] + iArr370[i968];
                    this.FastBitmap$CoordinateSystem = i968 + 1;
                    iArr370[i968] = 1;
                    return 0;
                case 446:
                    int[] iArr371 = this.values;
                    int i969 = this.FastBitmap$CoordinateSystem;
                    iArr371[i969 - 1] = -iArr371[i969 - 1];
                    int i970 = i969 + 2;
                    this.FastBitmap$CoordinateSystem = i970;
                    iArr371[i970 - 1] = iArr371[i970 - 3];
                    iArr371[i969] = iArr371[i970 - 4];
                    int i971 = i970 - 1;
                    this.FastBitmap$CoordinateSystem = i971;
                    iArr371[i971 - 1] = iArr371[i971] & iArr371[i971 - 1];
                    return 0;
                case 447:
                    int[] iArr372 = this.values;
                    int i972 = this.FastBitmap$CoordinateSystem;
                    int i973 = i972 + 1;
                    this.FastBitmap$CoordinateSystem = i973;
                    iArr372[i972] = 125;
                    iArr372[i973 - 1] = -iArr372[i973 - 1];
                    return 0;
                case 448:
                    int[] iArr373 = this.values;
                    int i974 = this.FastBitmap$CoordinateSystem;
                    int i975 = i974 + 1;
                    this.FastBitmap$CoordinateSystem = i975;
                    iArr373[i974] = 97;
                    int i976 = i975 + 2;
                    this.FastBitmap$CoordinateSystem = i976;
                    iArr373[i976 - 1] = iArr373[i976 - 3];
                    iArr373[i975] = iArr373[i976 - 4];
                    return 0;
                case 449:
                    Object[] objArr69 = this.invokeSuspend;
                    int i977 = this.FastBitmap$CoordinateSystem;
                    int i978 = i977 + 1;
                    this.FastBitmap$CoordinateSystem = i978;
                    objArr69[i977] = objArr69[16];
                    int i979 = i978 + 1;
                    this.FastBitmap$CoordinateSystem = i979;
                    objArr69[i978] = objArr69[18];
                    this.FastBitmap$CoordinateSystem = i979 + 1;
                    objArr69[i979] = objArr69[17];
                    return 0;
                case 450:
                    int i980 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i980;
                    Object[] objArr70 = this.invokeSuspend;
                    Object obj35 = objArr70[i980];
                    objArr70[i980] = null;
                    objArr70[17] = obj35;
                    int i981 = i980 - 1;
                    this.FastBitmap$CoordinateSystem = i981;
                    Object obj36 = objArr70[i981];
                    objArr70[i981] = null;
                    objArr70[18] = obj36;
                    int i982 = i981 - 1;
                    this.FastBitmap$CoordinateSystem = i982;
                    Object obj37 = objArr70[i982];
                    objArr70[i982] = null;
                    objArr70[19] = obj37;
                    return 0;
                case 451:
                    int[] iArr374 = this.values;
                    int i983 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i983 + 1;
                    iArr374[i983] = 34;
                    return 0;
                case 452:
                    int[] iArr375 = this.values;
                    int i984 = this.FastBitmap$CoordinateSystem;
                    int i985 = i984 + 1;
                    this.FastBitmap$CoordinateSystem = i985;
                    iArr375[i984] = 27;
                    int i986 = i985 + 1;
                    this.FastBitmap$CoordinateSystem = i986;
                    iArr375[i985] = iArr375[i986 - 2];
                    this.FastBitmap$CoordinateSystem = i986 + 1;
                    iArr375[i986] = -1;
                    return 0;
                case 453:
                    int[] iArr376 = this.values;
                    int i987 = this.FastBitmap$CoordinateSystem;
                    int i988 = i987 + 1;
                    this.FastBitmap$CoordinateSystem = i988;
                    iArr376[i987] = 59;
                    int i989 = i988 + 2;
                    this.FastBitmap$CoordinateSystem = i989;
                    iArr376[i989 - 1] = iArr376[i989 - 3];
                    iArr376[i988] = iArr376[i989 - 4];
                    int i990 = i989 + 2;
                    this.FastBitmap$CoordinateSystem = i990;
                    iArr376[i990 - 1] = iArr376[i990 - 3];
                    iArr376[i989] = iArr376[i990 - 4];
                    return 0;
                case 454:
                    int i991 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i991;
                    int[] iArr377 = this.values;
                    iArr377[i991 - 1] = iArr377[i991 - 1] | iArr377[i991];
                    iArr377[i991 - 1] = -iArr377[i991 - 1];
                    return 0;
                case 455:
                    Object[] objArr71 = this.invokeSuspend;
                    int i992 = this.FastBitmap$CoordinateSystem;
                    int i993 = i992 + 1;
                    this.FastBitmap$CoordinateSystem = i993;
                    objArr71[i992] = objArr71[14];
                    int i994 = i993 + 1;
                    this.FastBitmap$CoordinateSystem = i994;
                    objArr71[i993] = objArr71[18];
                    this.FastBitmap$CoordinateSystem = i994 + 1;
                    objArr71[i994] = objArr71[16];
                    return 0;
                case 456:
                    int[] iArr378 = this.values;
                    int i995 = this.FastBitmap$CoordinateSystem;
                    int i996 = i995 + 1;
                    this.FastBitmap$CoordinateSystem = i996;
                    iArr378[i995] = 59;
                    int i997 = i996 + 2;
                    this.FastBitmap$CoordinateSystem = i997;
                    iArr378[i997 - 1] = iArr378[i997 - 3];
                    iArr378[i996] = iArr378[i997 - 4];
                    int i998 = i997 - 1;
                    this.FastBitmap$CoordinateSystem = i998;
                    iArr378[i998 - 1] = iArr378[i998] | iArr378[i998 - 1];
                    return 0;
                case 457:
                    int[] iArr379 = this.values;
                    int i999 = this.FastBitmap$CoordinateSystem;
                    int i1000 = i999 + 1;
                    this.FastBitmap$CoordinateSystem = i1000;
                    iArr379[i999] = 109;
                    int i1001 = i1000 + 2;
                    this.FastBitmap$CoordinateSystem = i1001;
                    iArr379[i1001 - 1] = iArr379[i1001 - 3];
                    iArr379[i1000] = iArr379[i1001 - 4];
                    int i1002 = i1001 + 2;
                    this.FastBitmap$CoordinateSystem = i1002;
                    iArr379[i1002 - 1] = iArr379[i1002 - 3];
                    iArr379[i1001] = iArr379[i1002 - 4];
                    return 0;
                case 458:
                    int[] iArr380 = this.values;
                    int i1003 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1003 + 1;
                    iArr380[i1003] = 10;
                    return 0;
                case 459:
                    int[] iArr381 = this.values;
                    int i1004 = this.FastBitmap$CoordinateSystem;
                    int i1005 = i1004 + 1;
                    this.FastBitmap$CoordinateSystem = i1005;
                    iArr381[i1004] = 28;
                    int i1006 = i1005 + 1;
                    this.FastBitmap$CoordinateSystem = i1006;
                    iArr381[i1005] = 0;
                    int i1007 = i1006 - 1;
                    this.FastBitmap$CoordinateSystem = i1007;
                    iArr381[i1007 - 1] = iArr381[i1007 - 1] / iArr381[i1007];
                    return 0;
                case 460:
                    int i1008 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1008;
                    Object[] objArr72 = this.invokeSuspend;
                    Object obj38 = objArr72[i1008];
                    objArr72[i1008] = null;
                    objArr72[16] = obj38;
                    int i1009 = i1008 + 1;
                    this.FastBitmap$CoordinateSystem = i1009;
                    objArr72[i1008] = objArr72[16];
                    this.FastBitmap$CoordinateSystem = i1009 + 1;
                    objArr72[i1009] = objArr72[15];
                    return 0;
                case 461:
                    Object[] objArr73 = this.invokeSuspend;
                    int i1010 = this.FastBitmap$CoordinateSystem;
                    int i1011 = i1010 + 1;
                    this.FastBitmap$CoordinateSystem = i1011;
                    objArr73[i1010] = objArr73[16];
                    int i1012 = i1011 - 1;
                    this.FastBitmap$CoordinateSystem = i1012;
                    Object obj39 = objArr73[i1012];
                    objArr73[i1012] = null;
                    objArr73[15] = obj39;
                    int i1013 = i1012 - 1;
                    this.FastBitmap$CoordinateSystem = i1013;
                    Object obj40 = objArr73[i1013];
                    objArr73[i1013] = null;
                    objArr73[16] = obj40;
                    return 0;
                case 462:
                    int i1014 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1014;
                    Object[] objArr74 = this.invokeSuspend;
                    Object obj41 = objArr74[i1014];
                    objArr74[i1014] = null;
                    objArr74[17] = obj41;
                    this.FastBitmap$CoordinateSystem = i1014 + 1;
                    objArr74[i1014] = objArr74[17];
                    return 0;
                case 463:
                    int[] iArr382 = this.values;
                    int i1015 = this.FastBitmap$CoordinateSystem;
                    int i1016 = i1015 + 1;
                    this.FastBitmap$CoordinateSystem = i1016;
                    iArr382[i1015] = 41;
                    int i1017 = i1016 + 2;
                    this.FastBitmap$CoordinateSystem = i1017;
                    iArr382[i1017 - 1] = iArr382[i1017 - 3];
                    iArr382[i1016] = iArr382[i1017 - 4];
                    int i1018 = i1017 + 2;
                    this.FastBitmap$CoordinateSystem = i1018;
                    iArr382[i1018 - 1] = iArr382[i1018 - 3];
                    iArr382[i1017] = iArr382[i1018 - 4];
                    return 0;
                case 464:
                    int[] iArr383 = this.values;
                    int i1019 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1019 + 1;
                    iArr383[i1019] = 11;
                    return 0;
                case 465:
                    int[] iArr384 = this.values;
                    int i1020 = this.FastBitmap$CoordinateSystem;
                    int i1021 = i1020 + 1;
                    this.FastBitmap$CoordinateSystem = i1021;
                    iArr384[i1020] = 35;
                    iArr384[i1021 - 1] = -iArr384[i1021 - 1];
                    return 0;
                case 466:
                    Object[] objArr75 = this.invokeSuspend;
                    int i1022 = this.FastBitmap$CoordinateSystem;
                    int i1023 = i1022 + 1;
                    this.FastBitmap$CoordinateSystem = i1023;
                    objArr75[i1022] = objArr75[14];
                    int i1024 = i1023 - 1;
                    this.FastBitmap$CoordinateSystem = i1024;
                    Object obj42 = objArr75[i1024];
                    objArr75[i1024] = null;
                    objArr75[17] = obj42;
                    return 0;
                case 467:
                    Object[] objArr76 = this.invokeSuspend;
                    int i1025 = this.FastBitmap$CoordinateSystem;
                    int i1026 = i1025 + 1;
                    this.FastBitmap$CoordinateSystem = i1026;
                    objArr76[i1025] = objArr76[17];
                    int i1027 = i1026 + 1;
                    this.FastBitmap$CoordinateSystem = i1027;
                    objArr76[i1026] = objArr76[16];
                    this.FastBitmap$CoordinateSystem = i1027 + 1;
                    objArr76[i1027] = objArr76[15];
                    return 0;
                case 468:
                    int[] iArr385 = this.values;
                    int i1028 = this.FastBitmap$CoordinateSystem;
                    int i1029 = i1028 + 1;
                    this.FastBitmap$CoordinateSystem = i1029;
                    iArr385[i1028] = 113;
                    int i1030 = i1029 + 1;
                    this.FastBitmap$CoordinateSystem = i1030;
                    iArr385[i1029] = iArr385[i1030 - 2];
                    return 0;
                case 469:
                    int i1031 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1031;
                    int[] iArr386 = this.values;
                    iArr386[i1031 - 1] = iArr386[i1031 - 1] + iArr386[i1031];
                    int i1032 = i1031 + 1;
                    this.FastBitmap$CoordinateSystem = i1032;
                    iArr386[i1031] = 1;
                    iArr386[i1032 - 1] = -iArr386[i1032 - 1];
                    return 0;
                case 470:
                    int i1033 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1033;
                    Object[] objArr77 = this.invokeSuspend;
                    Object obj43 = objArr77[i1033];
                    objArr77[i1033] = null;
                    objArr77[16] = obj43;
                    int i1034 = i1033 - 1;
                    this.FastBitmap$CoordinateSystem = i1034;
                    Object obj44 = objArr77[i1034];
                    objArr77[i1034] = null;
                    objArr77[17] = obj44;
                    int i1035 = i1034 - 1;
                    this.FastBitmap$CoordinateSystem = i1035;
                    Object obj45 = objArr77[i1035];
                    objArr77[i1035] = null;
                    objArr77[18] = obj45;
                    return 0;
                case 471:
                    int i1036 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1036;
                    Object[] objArr78 = this.invokeSuspend;
                    Object obj46 = objArr78[i1036];
                    objArr78[i1036] = null;
                    objArr78[19] = obj46;
                    return 0;
                case 472:
                    int i1037 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1037;
                    Object[] objArr79 = this.invokeSuspend;
                    Object obj47 = objArr79[i1037];
                    objArr79[i1037] = null;
                    objArr79[20] = obj47;
                    return 0;
                case 473:
                    Object[] objArr80 = this.invokeSuspend;
                    int i1038 = this.FastBitmap$CoordinateSystem;
                    int i1039 = i1038 + 1;
                    this.FastBitmap$CoordinateSystem = i1039;
                    objArr80[i1038] = objArr80[20];
                    this.FastBitmap$CoordinateSystem = i1039 + 1;
                    objArr80[i1039] = objArr80[19];
                    return 0;
                case 474:
                    Object[] objArr81 = this.invokeSuspend;
                    int i1040 = this.FastBitmap$CoordinateSystem;
                    int i1041 = i1040 + 1;
                    this.FastBitmap$CoordinateSystem = i1041;
                    objArr81[i1040] = objArr81[18];
                    int i1042 = i1041 + 1;
                    this.FastBitmap$CoordinateSystem = i1042;
                    objArr81[i1041] = objArr81[17];
                    this.FastBitmap$CoordinateSystem = i1042 + 1;
                    objArr81[i1042] = objArr81[16];
                    return 0;
                case 475:
                    int[] iArr387 = this.values;
                    int i1043 = this.FastBitmap$CoordinateSystem;
                    int i1044 = i1043 + 1;
                    this.FastBitmap$CoordinateSystem = i1044;
                    iArr387[i1043] = 45;
                    iArr387[i1044 - 1] = -iArr387[i1044 - 1];
                    int i1045 = i1044 + 2;
                    this.FastBitmap$CoordinateSystem = i1045;
                    iArr387[i1045 - 1] = iArr387[i1045 - 3];
                    iArr387[i1044] = iArr387[i1045 - 4];
                    return 0;
                case 476:
                    int[] iArr388 = this.values;
                    int i1046 = this.FastBitmap$CoordinateSystem;
                    int i1047 = i1046 + 1;
                    this.FastBitmap$CoordinateSystem = i1047;
                    iArr388[i1046] = 57;
                    int i1048 = i1047 + 2;
                    this.FastBitmap$CoordinateSystem = i1048;
                    iArr388[i1048 - 1] = iArr388[i1048 - 3];
                    iArr388[i1047] = iArr388[i1048 - 4];
                    return 0;
                case 477:
                    int i1049 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1049;
                    int[] iArr389 = this.values;
                    iArr389[i1049 - 1] = iArr389[i1049 - 1] << iArr389[i1049];
                    int i1050 = i1049 + 2;
                    this.FastBitmap$CoordinateSystem = i1050;
                    iArr389[i1050 - 1] = iArr389[i1050 - 3];
                    iArr389[i1049] = iArr389[i1050 - 4];
                    int i1051 = i1050 - 1;
                    this.FastBitmap$CoordinateSystem = i1051;
                    iArr389[i1051 - 1] = iArr389[i1051] | iArr389[i1051 - 1];
                    return 0;
                case 478:
                    Object[] objArr82 = this.invokeSuspend;
                    int i1052 = this.FastBitmap$CoordinateSystem;
                    int i1053 = i1052 + 1;
                    this.FastBitmap$CoordinateSystem = i1053;
                    objArr82[i1052] = objArr82[15];
                    int i1054 = i1053 + 1;
                    this.FastBitmap$CoordinateSystem = i1054;
                    objArr82[i1053] = objArr82[16];
                    this.FastBitmap$CoordinateSystem = i1054 + 1;
                    objArr82[i1054] = objArr82[17];
                    return 0;
                case 479:
                    Object[] objArr83 = this.invokeSuspend;
                    int i1055 = this.FastBitmap$CoordinateSystem;
                    int i1056 = i1055 + 1;
                    this.FastBitmap$CoordinateSystem = i1056;
                    objArr83[i1055] = objArr83[19];
                    this.FastBitmap$CoordinateSystem = i1056 + 1;
                    objArr83[i1056] = objArr83[20];
                    return 0;
                case 480:
                    int[] iArr390 = this.values;
                    int i1057 = this.FastBitmap$CoordinateSystem;
                    int i1058 = i1057 + 1;
                    this.FastBitmap$CoordinateSystem = i1058;
                    iArr390[i1057] = 23;
                    int i1059 = i1058 + 2;
                    this.FastBitmap$CoordinateSystem = i1059;
                    iArr390[i1059 - 1] = iArr390[i1059 - 3];
                    iArr390[i1058] = iArr390[i1059 - 4];
                    return 0;
                case 481:
                    int i1060 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1060;
                    Object[] objArr84 = this.invokeSuspend;
                    Object obj48 = objArr84[i1060];
                    objArr84[i1060] = null;
                    objArr84[15] = obj48;
                    this.FastBitmap$CoordinateSystem = i1060 + 1;
                    objArr84[i1060] = objArr84[16];
                    return 0;
                case 482:
                    int[] iArr391 = this.values;
                    int i1061 = this.FastBitmap$CoordinateSystem;
                    int i1062 = i1061 + 1;
                    this.FastBitmap$CoordinateSystem = i1062;
                    iArr391[i1061] = 57;
                    int i1063 = i1062 + 1;
                    this.FastBitmap$CoordinateSystem = i1063;
                    iArr391[i1062] = iArr391[i1063 - 2];
                    return 0;
                case 483:
                    int i1064 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1064;
                    Object[] objArr85 = this.invokeSuspend;
                    Object obj49 = objArr85[i1064];
                    objArr85[i1064] = null;
                    objArr85[16] = obj49;
                    this.FastBitmap$CoordinateSystem = i1064 + 1;
                    objArr85[i1064] = objArr85[15];
                    return 0;
                case 484:
                    int[] iArr392 = this.values;
                    int i1065 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1065 + 1;
                    iArr392[i1065] = 58;
                    return 0;
                case 485:
                    int[] iArr393 = this.values;
                    int i1066 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1066 + 1;
                    iArr393[i1066] = 37;
                    return 0;
                case 486:
                    int[] iArr394 = this.values;
                    int i1067 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1067 + 1;
                    iArr394[i1067] = 125;
                    return 0;
                case 487:
                    Object[] objArr86 = this.invokeSuspend;
                    int i1068 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1068 + 1;
                    objArr86[i1068] = objArr86[21];
                    return 0;
                case 488:
                    int[] iArr395 = this.values;
                    int i1069 = this.FastBitmap$CoordinateSystem;
                    int i1070 = i1069 + 1;
                    this.FastBitmap$CoordinateSystem = i1070;
                    iArr395[i1069] = 3;
                    this.FastBitmap$CoordinateSystem = i1070 + 1;
                    iArr395[i1070] = 3;
                    return 0;
                case 489:
                    int i1071 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1071;
                    Object[] objArr87 = this.invokeSuspend;
                    Object obj50 = objArr87[i1071];
                    objArr87[i1071] = null;
                    objArr87[21] = obj50;
                    return 0;
                case 490:
                    int[] iArr396 = this.values;
                    int i1072 = this.FastBitmap$CoordinateSystem;
                    int i1073 = i1072 + 1;
                    this.FastBitmap$CoordinateSystem = i1073;
                    iArr396[i1072] = -1;
                    int i1074 = i1073 - 1;
                    this.FastBitmap$CoordinateSystem = i1074;
                    iArr396[22] = iArr396[i1074];
                    Object[] objArr88 = this.invokeSuspend;
                    this.FastBitmap$CoordinateSystem = i1074 + 1;
                    objArr88[i1074] = objArr88[21];
                    return 0;
                case 491:
                    int i1075 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1075;
                    int[] iArr397 = this.values;
                    iArr397[22] = iArr397[i1075];
                    return 0;
                case 492:
                    int[] iArr398 = this.values;
                    int i1076 = this.FastBitmap$CoordinateSystem;
                    int i1077 = i1076 + 1;
                    this.FastBitmap$CoordinateSystem = i1077;
                    iArr398[i1076] = 111;
                    int i1078 = i1077 + 2;
                    this.FastBitmap$CoordinateSystem = i1078;
                    iArr398[i1078 - 1] = iArr398[i1078 - 3];
                    iArr398[i1077] = iArr398[i1078 - 4];
                    int i1079 = i1078 + 2;
                    this.FastBitmap$CoordinateSystem = i1079;
                    iArr398[i1079 - 1] = iArr398[i1079 - 3];
                    iArr398[i1078] = iArr398[i1079 - 4];
                    return 0;
                case 493:
                    int[] iArr399 = this.values;
                    int i1080 = this.FastBitmap$CoordinateSystem;
                    int i1081 = i1080 + 1;
                    this.FastBitmap$CoordinateSystem = i1081;
                    iArr399[i1080] = 0;
                    int i1082 = i1081 - 1;
                    this.FastBitmap$CoordinateSystem = i1082;
                    iArr399[22] = iArr399[i1082];
                    return 0;
                case 494:
                    int[] iArr400 = this.values;
                    int i1083 = this.FastBitmap$CoordinateSystem;
                    int i1084 = i1083 + 1;
                    this.FastBitmap$CoordinateSystem = i1084;
                    iArr400[i1083] = 59;
                    int i1085 = i1084 + 1;
                    this.FastBitmap$CoordinateSystem = i1085;
                    iArr400[i1084] = iArr400[i1085 - 2];
                    this.FastBitmap$CoordinateSystem = i1085 + 1;
                    iArr400[i1085] = -1;
                    return 0;
                case 495:
                    int[] iArr401 = this.values;
                    int i1086 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1086 + 1;
                    iArr401[i1086] = 60;
                    return 0;
                case 496:
                    int[] iArr402 = this.values;
                    int i1087 = this.FastBitmap$CoordinateSystem;
                    int i1088 = i1087 + 1;
                    this.FastBitmap$CoordinateSystem = i1088;
                    iArr402[i1087] = 70;
                    int i1089 = i1088 + 1;
                    this.FastBitmap$CoordinateSystem = i1089;
                    iArr402[i1088] = 0;
                    int i1090 = i1089 - 1;
                    this.FastBitmap$CoordinateSystem = i1090;
                    iArr402[i1090 - 1] = iArr402[i1090 - 1] / iArr402[i1090];
                    return 0;
                case 497:
                    int[] iArr403 = this.values;
                    int i1091 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1091 + 1;
                    iArr403[i1091] = iArr403[22];
                    return 0;
                case 498:
                    Object[] objArr89 = this.invokeSuspend;
                    int i1092 = this.FastBitmap$CoordinateSystem;
                    int i1093 = i1092 + 1;
                    this.FastBitmap$CoordinateSystem = i1093;
                    objArr89[i1092] = objArr89[18];
                    int i1094 = i1093 + 1;
                    this.FastBitmap$CoordinateSystem = i1094;
                    objArr89[i1093] = objArr89[19];
                    this.FastBitmap$CoordinateSystem = i1094 + 1;
                    objArr89[i1094] = objArr89[20];
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_ENC_UNKNOWN_ERROR /*499*/:
                    int[] iArr404 = this.values;
                    int i1095 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1095 + 1;
                    iArr404[i1095] = 98;
                    return 0;
                case 500:
                    int i1096 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1096;
                    int[] iArr405 = this.values;
                    iArr405[i1096 - 1] = iArr405[i1096 - 1] << iArr405[i1096];
                    int i1097 = i1096 + 2;
                    this.FastBitmap$CoordinateSystem = i1097;
                    iArr405[i1097 - 1] = iArr405[i1097 - 3];
                    iArr405[i1096] = iArr405[i1097 - 4];
                    int i1098 = i1097 - 1;
                    this.FastBitmap$CoordinateSystem = i1098;
                    iArr405[i1098 - 1] = iArr405[i1098] ^ iArr405[i1098 - 1];
                    return 0;
                case 501:
                    int[] iArr406 = this.values;
                    int i1099 = this.FastBitmap$CoordinateSystem;
                    int i1100 = i1099 + 1;
                    this.FastBitmap$CoordinateSystem = i1100;
                    iArr406[i1099] = 63;
                    iArr406[i1100 - 1] = -iArr406[i1100 - 1];
                    return 0;
                case 502:
                    int i1101 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1101;
                    int[] iArr407 = this.values;
                    iArr407[i1101 - 1] = iArr407[i1101 - 1] - iArr407[i1101];
                    int i1102 = i1101 + 1;
                    this.FastBitmap$CoordinateSystem = i1102;
                    iArr407[i1101] = 1;
                    iArr407[i1102 - 1] = -iArr407[i1102 - 1];
                    return 0;
                case 503:
                    int[] iArr408 = this.values;
                    int i1103 = this.FastBitmap$CoordinateSystem;
                    int i1104 = i1103 + 1;
                    this.FastBitmap$CoordinateSystem = i1104;
                    iArr408[i1103] = 7;
                    int i1105 = i1104 + 2;
                    this.FastBitmap$CoordinateSystem = i1105;
                    iArr408[i1105 - 1] = iArr408[i1105 - 3];
                    iArr408[i1104] = iArr408[i1105 - 4];
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_STORE_GET_DATA_FILE_KEY_FAILED /*504*/:
                    int[] iArr409 = this.values;
                    int i1106 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1106 + 1;
                    iArr409[i1106] = 113;
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_STORE_GET_ENCRYPT_KEY_FAILED /*505*/:
                    int i1107 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1107;
                    int[] iArr410 = this.values;
                    iArr410[i1107 - 1] = iArr410[i1107 - 1] | iArr410[i1107];
                    int i1108 = i1107 - 1;
                    this.FastBitmap$CoordinateSystem = i1108;
                    iArr410[i1108 - 1] = iArr410[i1108 - 1] & iArr410[i1108];
                    int i1109 = i1108 - 1;
                    this.FastBitmap$CoordinateSystem = i1109;
                    iArr410[i1109 - 1] = iArr410[i1109 - 1] - iArr410[i1109];
                    return 0;
                case 506:
                    int[] iArr411 = this.values;
                    int i1110 = this.FastBitmap$CoordinateSystem;
                    int i1111 = i1110 + 1;
                    this.FastBitmap$CoordinateSystem = i1111;
                    iArr411[i1110] = 1;
                    int i1112 = i1111 + 2;
                    this.FastBitmap$CoordinateSystem = i1112;
                    iArr411[i1112 - 1] = iArr411[i1112 - 3];
                    iArr411[i1111] = iArr411[i1112 - 4];
                    return 0;
                case 507:
                    int[] iArr412 = this.values;
                    int i1113 = this.FastBitmap$CoordinateSystem;
                    int i1114 = i1113 + 1;
                    this.FastBitmap$CoordinateSystem = i1114;
                    iArr412[i1113] = 91;
                    int i1115 = i1114 + 1;
                    this.FastBitmap$CoordinateSystem = i1115;
                    iArr412[i1114] = iArr412[i1115 - 2];
                    this.FastBitmap$CoordinateSystem = i1115 + 1;
                    iArr412[i1115] = -1;
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_STORE_DDPEX_KEY_VALUE_NOT_EXSIT /*508*/:
                    int[] iArr413 = this.values;
                    int i1116 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1116 + 1;
                    iArr413[i1116] = 123;
                    return 0;
                case 509:
                    int[] iArr414 = this.values;
                    int i1117 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1117 + 1;
                    iArr414[i1117] = 117;
                    return 0;
                case 510:
                    int[] iArr415 = this.values;
                    int i1118 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1118 + 1;
                    iArr415[i1118] = 30;
                    return 0;
                case 511:
                    int i1119 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1119;
                    long[] jArr6 = this.toDoubleRange;
                    jArr6[i1119 - 1] = jArr6[i1119 - 1] * jArr6[i1119];
                    return 0;
                case 512:
                    int[] iArr416 = this.values;
                    int i1120 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1120 + 1;
                    iArr416[i1120] = 4640;
                    return 0;
                case 513:
                    long[] jArr7 = this.toDoubleRange;
                    int i1121 = this.FastBitmap$CoordinateSystem;
                    int[] iArr417 = this.values;
                    jArr7[i1121 - 1] = (long) iArr417[i1121 - 1];
                    int i1122 = i1121 - 1;
                    this.FastBitmap$CoordinateSystem = i1122;
                    iArr417[i1122 - 1] = (jArr7[i1122 - 1] > jArr7[i1122] ? 1 : (jArr7[i1122 - 1] == jArr7[i1122] ? 0 : -1));
                    return 0;
                case 514:
                    int[] iArr418 = this.values;
                    int i1123 = this.FastBitmap$CoordinateSystem;
                    int i1124 = i1123 + 1;
                    this.FastBitmap$CoordinateSystem = i1124;
                    iArr418[i1123] = 85;
                    int i1125 = i1124 + 1;
                    this.FastBitmap$CoordinateSystem = i1125;
                    iArr418[i1124] = iArr418[i1125 - 2];
                    return 0;
                case 515:
                    int[] iArr419 = this.values;
                    int i1126 = this.FastBitmap$CoordinateSystem;
                    int i1127 = i1126 + 1;
                    this.FastBitmap$CoordinateSystem = i1127;
                    iArr419[i1126] = 1000;
                    iArr419[i1127 - 1] = -iArr419[i1127 - 1];
                    int i1128 = i1127 + 1;
                    this.FastBitmap$CoordinateSystem = i1128;
                    iArr419[i1127] = iArr419[i1128 - 2];
                    return 0;
                case 516:
                    int[] iArr420 = this.values;
                    int i1129 = this.FastBitmap$CoordinateSystem;
                    int i1130 = i1129 + 1;
                    this.FastBitmap$CoordinateSystem = i1130;
                    iArr420[i1129] = 1;
                    int i1131 = i1130 - 1;
                    this.FastBitmap$CoordinateSystem = i1131;
                    iArr420[i1131 - 1] = iArr420[i1131 - 1] - iArr420[i1131];
                    this.toDoubleRange[i1131 - 1] = (long) iArr420[i1131 - 1];
                    return 0;
                case 517:
                    Object[] objArr90 = this.invokeSuspend;
                    int i1132 = this.FastBitmap$CoordinateSystem;
                    int i1133 = i1132 + 1;
                    this.FastBitmap$CoordinateSystem = i1133;
                    objArr90[i1132] = objArr90[17];
                    this.FastBitmap$CoordinateSystem = i1133 + 1;
                    objArr90[i1133] = objArr90[16];
                    return 0;
                case 518:
                    int[] iArr421 = this.values;
                    int i1134 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1134 + 1;
                    iArr421[i1134] = 107;
                    return 0;
                case 519:
                    int[] iArr422 = this.values;
                    int i1135 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1135 + 1;
                    iArr422[i1135] = 38;
                    return 0;
                case 520:
                    int[] iArr423 = this.values;
                    int i1136 = this.FastBitmap$CoordinateSystem;
                    int i1137 = i1136 + 1;
                    this.FastBitmap$CoordinateSystem = i1137;
                    iArr423[i1136] = 55;
                    int i1138 = i1137 + 1;
                    this.FastBitmap$CoordinateSystem = i1138;
                    iArr423[i1137] = iArr423[i1138 - 2];
                    return 0;
                case 521:
                    int[] iArr424 = this.values;
                    int i1139 = this.FastBitmap$CoordinateSystem;
                    int i1140 = i1139 + 1;
                    this.FastBitmap$CoordinateSystem = i1140;
                    iArr424[i1139] = 119;
                    iArr424[i1140 - 1] = -iArr424[i1140 - 1];
                    int i1141 = i1140 + 1;
                    this.FastBitmap$CoordinateSystem = i1141;
                    iArr424[i1140] = iArr424[i1141 - 2];
                    return 0;
                case 522:
                    int[] iArr425 = this.values;
                    int i1142 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1142 + 1;
                    iArr425[i1142] = 22;
                    return 0;
                case 523:
                    int[] iArr426 = this.values;
                    int i1143 = this.FastBitmap$CoordinateSystem;
                    int i1144 = i1143 + 1;
                    this.FastBitmap$CoordinateSystem = i1144;
                    iArr426[i1143] = 25;
                    int i1145 = i1144 + 1;
                    this.FastBitmap$CoordinateSystem = i1145;
                    iArr426[i1144] = 0;
                    int i1146 = i1145 - 1;
                    this.FastBitmap$CoordinateSystem = i1146;
                    iArr426[i1146 - 1] = iArr426[i1146 - 1] / iArr426[i1146];
                    return 0;
                case 524:
                    int[] iArr427 = this.values;
                    int i1147 = this.FastBitmap$CoordinateSystem;
                    int i1148 = i1147 + 1;
                    this.FastBitmap$CoordinateSystem = i1148;
                    iArr427[i1147] = 43;
                    this.FastBitmap$CoordinateSystem = i1148 + 1;
                    iArr427[i1148] = 0;
                    return 0;
                case 525:
                    int[] iArr428 = this.values;
                    int i1149 = this.FastBitmap$CoordinateSystem;
                    int i1150 = i1149 + 1;
                    this.FastBitmap$CoordinateSystem = i1150;
                    iArr428[i1149] = 81;
                    iArr428[i1150 - 1] = -iArr428[i1150 - 1];
                    return 0;
                case 526:
                    Object[] objArr91 = this.invokeSuspend;
                    int i1151 = this.FastBitmap$CoordinateSystem;
                    int i1152 = i1151 + 1;
                    this.FastBitmap$CoordinateSystem = i1152;
                    objArr91[i1151] = objArr91[14];
                    int i1153 = i1152 - 1;
                    this.FastBitmap$CoordinateSystem = i1153;
                    Object obj51 = objArr91[i1153];
                    objArr91[i1153] = null;
                    objArr91[15] = obj51;
                    this.FastBitmap$CoordinateSystem = i1153 + 1;
                    objArr91[i1153] = objArr91[15];
                    return 0;
                case 527:
                    int[] iArr429 = this.values;
                    int i1154 = this.FastBitmap$CoordinateSystem;
                    int i1155 = i1154 + 1;
                    this.FastBitmap$CoordinateSystem = i1155;
                    iArr429[i1154] = 79;
                    iArr429[i1155 - 1] = -iArr429[i1155 - 1];
                    return 0;
                case 528:
                    int[] iArr430 = this.values;
                    int i1156 = this.FastBitmap$CoordinateSystem;
                    int i1157 = i1156 + 1;
                    this.FastBitmap$CoordinateSystem = i1157;
                    iArr430[i1156] = 41;
                    iArr430[i1157 - 1] = -iArr430[i1157 - 1];
                    return 0;
                case 529:
                    int[] iArr431 = this.values;
                    int i1158 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1158 + 1;
                    iArr431[i1158] = 52;
                    return 0;
                case 530:
                    Object[] objArr92 = this.invokeSuspend;
                    int i1159 = this.FastBitmap$CoordinateSystem;
                    int i1160 = i1159 + 1;
                    this.FastBitmap$CoordinateSystem = i1160;
                    objArr92[i1159] = objArr92[15];
                    int i1161 = i1160 + 1;
                    this.FastBitmap$CoordinateSystem = i1161;
                    objArr92[i1160] = objArr92[16];
                    int i1162 = i1161 - 1;
                    this.FastBitmap$CoordinateSystem = i1162;
                    Object obj52 = objArr92[i1162];
                    objArr92[i1162] = null;
                    objArr92[15] = obj52;
                    return 0;
                case 531:
                    int i1163 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1163;
                    Object[] objArr93 = this.invokeSuspend;
                    Object obj53 = objArr93[i1163];
                    objArr93[i1163] = null;
                    objArr93[17] = obj53;
                    return 0;
                case 532:
                    int[] iArr432 = this.values;
                    int i1164 = this.FastBitmap$CoordinateSystem;
                    int i1165 = i1164 + 1;
                    this.FastBitmap$CoordinateSystem = i1165;
                    iArr432[i1164] = -1;
                    int i1166 = i1165 - 1;
                    this.FastBitmap$CoordinateSystem = i1166;
                    iArr432[i1166 - 1] = iArr432[i1166 - 1] ^ iArr432[i1166];
                    int i1167 = i1166 + 1;
                    this.FastBitmap$CoordinateSystem = i1167;
                    int i1168 = iArr432[i1167 - 2];
                    iArr432[i1166] = i1168;
                    iArr432[i1167 - 2] = iArr432[i1167 - 3];
                    iArr432[i1167 - 3] = iArr432[i1167 - 4];
                    iArr432[i1167 - 4] = i1168;
                    return 0;
                case 533:
                    int[] iArr433 = this.values;
                    int i1169 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1169 + 1;
                    iArr433[i1169] = 12;
                    return 0;
                case 534:
                    int[] iArr434 = this.values;
                    int i1170 = this.FastBitmap$CoordinateSystem;
                    int i1171 = i1170 + 1;
                    this.FastBitmap$CoordinateSystem = i1171;
                    iArr434[i1170] = 17;
                    int i1172 = i1171 - 1;
                    this.FastBitmap$CoordinateSystem = i1172;
                    iArr434[i1172 - 1] = iArr434[i1172 - 1] + iArr434[i1172];
                    return 0;
                case 535:
                    int[] iArr435 = this.values;
                    int i1173 = this.FastBitmap$CoordinateSystem;
                    int i1174 = i1173 + 1;
                    this.FastBitmap$CoordinateSystem = i1174;
                    iArr435[i1173] = 115;
                    int i1175 = i1174 + 2;
                    this.FastBitmap$CoordinateSystem = i1175;
                    iArr435[i1175 - 1] = iArr435[i1175 - 3];
                    iArr435[i1174] = iArr435[i1175 - 4];
                    int i1176 = i1175 - 1;
                    this.FastBitmap$CoordinateSystem = i1176;
                    iArr435[i1176 - 1] = iArr435[i1176] & iArr435[i1176 - 1];
                    return 0;
                case 536:
                    int i1177 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1177;
                    int[] iArr436 = this.values;
                    iArr436[i1177 - 1] = iArr436[i1177 - 1] | iArr436[i1177];
                    int i1178 = i1177 + 2;
                    this.FastBitmap$CoordinateSystem = i1178;
                    iArr436[i1178 - 1] = iArr436[i1178 - 3];
                    iArr436[i1177] = iArr436[i1178 - 4];
                    iArr436[i1178 - 1] = -iArr436[i1178 - 1];
                    return 0;
                case 537:
                    int[] iArr437 = this.values;
                    int i1179 = this.FastBitmap$CoordinateSystem;
                    int i1180 = i1179 + 1;
                    this.FastBitmap$CoordinateSystem = i1180;
                    iArr437[i1179] = 1;
                    iArr437[i1180 - 1] = -iArr437[i1180 - 1];
                    return 0;
                case 538:
                    int[] iArr438 = this.values;
                    int i1181 = this.FastBitmap$CoordinateSystem;
                    int i1182 = i1181 + 1;
                    this.FastBitmap$CoordinateSystem = i1182;
                    iArr438[i1181] = 51;
                    int i1183 = i1182 + 1;
                    this.FastBitmap$CoordinateSystem = i1183;
                    iArr438[i1182] = iArr438[i1183 - 2];
                    return 0;
                case 539:
                    int[] iArr439 = this.values;
                    int i1184 = this.FastBitmap$CoordinateSystem;
                    int i1185 = i1184 + 1;
                    this.FastBitmap$CoordinateSystem = i1185;
                    iArr439[i1184] = 77;
                    iArr439[i1185 - 1] = -iArr439[i1185 - 1];
                    int i1186 = i1185 + 2;
                    this.FastBitmap$CoordinateSystem = i1186;
                    iArr439[i1186 - 1] = iArr439[i1186 - 3];
                    iArr439[i1185] = iArr439[i1186 - 4];
                    return 0;
                case 540:
                    int i1187 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1187;
                    int[] iArr440 = this.values;
                    iArr440[i1187 - 1] = iArr440[i1187 - 1] | iArr440[i1187];
                    int i1188 = i1187 + 1;
                    this.FastBitmap$CoordinateSystem = i1188;
                    iArr440[i1187] = iArr440[i1188 - 2];
                    this.FastBitmap$CoordinateSystem = i1188 + 1;
                    iArr440[i1188] = -1;
                    return 0;
                case 541:
                    int[] iArr441 = this.values;
                    int i1189 = this.FastBitmap$CoordinateSystem;
                    int i1190 = i1189 + 1;
                    this.FastBitmap$CoordinateSystem = i1190;
                    iArr441[i1189] = 68;
                    this.FastBitmap$CoordinateSystem = i1190 + 1;
                    iArr441[i1190] = 0;
                    return 0;
                case 542:
                    int[] iArr442 = this.values;
                    int i1191 = this.FastBitmap$CoordinateSystem;
                    int i1192 = i1191 + 2;
                    this.FastBitmap$CoordinateSystem = i1192;
                    iArr442[i1192 - 1] = iArr442[i1192 - 3];
                    iArr442[i1191] = iArr442[i1192 - 4];
                    int i1193 = i1192 + 2;
                    this.FastBitmap$CoordinateSystem = i1193;
                    iArr442[i1193 - 1] = iArr442[i1193 - 3];
                    iArr442[i1192] = iArr442[i1193 - 4];
                    int i1194 = i1193 - 1;
                    this.FastBitmap$CoordinateSystem = i1194;
                    iArr442[i1194 - 1] = iArr442[i1194] & iArr442[i1194 - 1];
                    return 0;
                case 543:
                    int[] iArr443 = this.values;
                    int i1195 = this.FastBitmap$CoordinateSystem;
                    int i1196 = i1195 + 1;
                    this.FastBitmap$CoordinateSystem = i1196;
                    iArr443[i1195] = 29;
                    iArr443[i1196 - 1] = -iArr443[i1196 - 1];
                    return 0;
                case 544:
                    int[] iArr444 = this.values;
                    int i1197 = this.FastBitmap$CoordinateSystem;
                    int i1198 = i1197 + 1;
                    this.FastBitmap$CoordinateSystem = i1198;
                    iArr444[i1197] = 7;
                    int i1199 = i1198 + 1;
                    this.FastBitmap$CoordinateSystem = i1199;
                    iArr444[i1198] = 0;
                    int i1200 = i1199 - 1;
                    this.FastBitmap$CoordinateSystem = i1200;
                    iArr444[i1200 - 1] = iArr444[i1200 - 1] / iArr444[i1200];
                    return 0;
                case 545:
                    int[] iArr445 = this.values;
                    int i1201 = this.FastBitmap$CoordinateSystem;
                    int i1202 = i1201 + 1;
                    this.FastBitmap$CoordinateSystem = i1202;
                    iArr445[i1201] = 29;
                    int i1203 = i1202 + 2;
                    this.FastBitmap$CoordinateSystem = i1203;
                    iArr445[i1203 - 1] = iArr445[i1203 - 3];
                    iArr445[i1202] = iArr445[i1203 - 4];
                    int i1204 = i1203 + 2;
                    this.FastBitmap$CoordinateSystem = i1204;
                    iArr445[i1204 - 1] = iArr445[i1204 - 3];
                    iArr445[i1203] = iArr445[i1204 - 4];
                    return 0;
                case 546:
                    int i1205 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1205;
                    int[] iArr446 = this.values;
                    iArr446[i1205 - 1] = iArr446[i1205 - 1] ^ iArr446[i1205];
                    iArr446[i1205 - 1] = -iArr446[i1205 - 1];
                    return 0;
                case 547:
                    int[] iArr447 = this.values;
                    int i1206 = this.FastBitmap$CoordinateSystem;
                    int i1207 = i1206 + 1;
                    this.FastBitmap$CoordinateSystem = i1207;
                    iArr447[i1206] = 21;
                    int i1208 = i1207 + 1;
                    this.FastBitmap$CoordinateSystem = i1208;
                    iArr447[i1207] = 0;
                    int i1209 = i1208 - 1;
                    this.FastBitmap$CoordinateSystem = i1209;
                    iArr447[i1209 - 1] = iArr447[i1209 - 1] / iArr447[i1209];
                    return 0;
                case 548:
                    int[] iArr448 = this.values;
                    int i1210 = this.FastBitmap$CoordinateSystem;
                    int i1211 = i1210 + 1;
                    this.FastBitmap$CoordinateSystem = i1211;
                    iArr448[i1210] = 123;
                    int i1212 = i1211 + 2;
                    this.FastBitmap$CoordinateSystem = i1212;
                    iArr448[i1212 - 1] = iArr448[i1212 - 3];
                    iArr448[i1211] = iArr448[i1212 - 4];
                    int i1213 = i1212 + 2;
                    this.FastBitmap$CoordinateSystem = i1213;
                    iArr448[i1213 - 1] = iArr448[i1213 - 3];
                    iArr448[i1212] = iArr448[i1213 - 4];
                    return 0;
                case 549:
                    int[] iArr449 = this.values;
                    int i1214 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1214 + 1;
                    iArr449[i1214] = 57;
                    return 0;
                case 550:
                    int[] iArr450 = this.values;
                    int i1215 = this.FastBitmap$CoordinateSystem;
                    int i1216 = i1215 + 1;
                    this.FastBitmap$CoordinateSystem = i1216;
                    iArr450[i1215] = 5;
                    int i1217 = i1216 + 2;
                    this.FastBitmap$CoordinateSystem = i1217;
                    iArr450[i1217 - 1] = iArr450[i1217 - 3];
                    iArr450[i1216] = iArr450[i1217 - 4];
                    int i1218 = i1217 + 2;
                    this.FastBitmap$CoordinateSystem = i1218;
                    iArr450[i1218 - 1] = iArr450[i1218 - 3];
                    iArr450[i1217] = iArr450[i1218 - 4];
                    return 0;
                case 551:
                    int[] iArr451 = this.values;
                    int i1219 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1219 + 1;
                    iArr451[i1219] = 74;
                    return 0;
                case 552:
                    int[] iArr452 = this.values;
                    int i1220 = this.FastBitmap$CoordinateSystem;
                    int i1221 = i1220 + 1;
                    this.FastBitmap$CoordinateSystem = i1221;
                    iArr452[i1220] = 53;
                    int i1222 = i1221 + 2;
                    this.FastBitmap$CoordinateSystem = i1222;
                    iArr452[i1222 - 1] = iArr452[i1222 - 3];
                    iArr452[i1221] = iArr452[i1222 - 4];
                    return 0;
                case 553:
                    int[] iArr453 = this.values;
                    int i1223 = this.FastBitmap$CoordinateSystem;
                    int i1224 = i1223 + 1;
                    this.FastBitmap$CoordinateSystem = i1224;
                    iArr453[i1223] = 52;
                    int i1225 = i1224 + 1;
                    this.FastBitmap$CoordinateSystem = i1225;
                    iArr453[i1224] = 0;
                    int i1226 = i1225 - 1;
                    this.FastBitmap$CoordinateSystem = i1226;
                    iArr453[i1226 - 1] = iArr453[i1226 - 1] / iArr453[i1226];
                    return 0;
                case 554:
                    Object[] objArr94 = this.invokeSuspend;
                    int i1227 = this.FastBitmap$CoordinateSystem;
                    int i1228 = i1227 + 1;
                    this.FastBitmap$CoordinateSystem = i1228;
                    objArr94[i1227] = objArr94[15];
                    int i1229 = i1228 - 1;
                    this.FastBitmap$CoordinateSystem = i1229;
                    Object obj54 = objArr94[i1229];
                    objArr94[i1229] = null;
                    objArr94[16] = obj54;
                    return 0;
                case 555:
                    int[] iArr454 = this.values;
                    int i1230 = this.FastBitmap$CoordinateSystem;
                    int i1231 = i1230 + 1;
                    this.FastBitmap$CoordinateSystem = i1231;
                    iArr454[i1230] = 111;
                    int i1232 = i1231 - 1;
                    this.FastBitmap$CoordinateSystem = i1232;
                    iArr454[i1232 - 1] = iArr454[i1232 - 1] + iArr454[i1232];
                    return 0;
                case 556:
                    int[] iArr455 = this.values;
                    int i1233 = this.FastBitmap$CoordinateSystem;
                    int i1234 = i1233 + 1;
                    this.FastBitmap$CoordinateSystem = i1234;
                    iArr455[i1233] = 111;
                    iArr455[i1234 - 1] = -iArr455[i1234 - 1];
                    int i1235 = i1234 + 1;
                    this.FastBitmap$CoordinateSystem = i1235;
                    iArr455[i1234] = iArr455[i1235 - 2];
                    return 0;
                case 557:
                    int[] iArr456 = this.values;
                    int i1236 = this.FastBitmap$CoordinateSystem;
                    int i1237 = i1236 + 1;
                    this.FastBitmap$CoordinateSystem = i1237;
                    iArr456[i1236] = 7;
                    iArr456[i1237 - 1] = -iArr456[i1237 - 1];
                    return 0;
                case 558:
                    int[] iArr457 = this.values;
                    int i1238 = this.FastBitmap$CoordinateSystem;
                    int i1239 = i1238 + 1;
                    this.FastBitmap$CoordinateSystem = i1239;
                    iArr457[i1238] = 1;
                    int i1240 = i1239 + 2;
                    this.FastBitmap$CoordinateSystem = i1240;
                    iArr457[i1240 - 1] = iArr457[i1240 - 3];
                    iArr457[i1239] = iArr457[i1240 - 4];
                    return 0;
                case 559:
                    int[] iArr458 = this.values;
                    int i1241 = this.FastBitmap$CoordinateSystem;
                    int i1242 = i1241 + 1;
                    this.FastBitmap$CoordinateSystem = i1242;
                    iArr458[i1241] = 83;
                    int i1243 = i1242 + 2;
                    this.FastBitmap$CoordinateSystem = i1243;
                    iArr458[i1243 - 1] = iArr458[i1243 - 3];
                    iArr458[i1242] = iArr458[i1243 - 4];
                    int i1244 = i1243 - 1;
                    this.FastBitmap$CoordinateSystem = i1244;
                    iArr458[i1244 - 1] = iArr458[i1244] & iArr458[i1244 - 1];
                    return 0;
                case 560:
                    int[] iArr459 = this.values;
                    int i1245 = this.FastBitmap$CoordinateSystem;
                    int i1246 = i1245 + 1;
                    this.FastBitmap$CoordinateSystem = i1246;
                    iArr459[i1245] = 121;
                    iArr459[i1246 - 1] = -iArr459[i1246 - 1];
                    int i1247 = i1246 + 1;
                    this.FastBitmap$CoordinateSystem = i1247;
                    iArr459[i1246] = iArr459[i1247 - 2];
                    return 0;
                case 561:
                    int i1248 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1248;
                    int[] iArr460 = this.values;
                    iArr460[i1248 - 1] = iArr460[i1248 - 1] | iArr460[i1248];
                    int i1249 = i1248 - 1;
                    this.FastBitmap$CoordinateSystem = i1249;
                    iArr460[i1249 - 1] = iArr460[i1249 - 1] - iArr460[i1249];
                    int i1250 = i1249 + 1;
                    this.FastBitmap$CoordinateSystem = i1250;
                    iArr460[i1249] = iArr460[i1250 - 2];
                    return 0;
                case 562:
                    int[] iArr461 = this.values;
                    int i1251 = this.FastBitmap$CoordinateSystem;
                    int i1252 = i1251 + 1;
                    this.FastBitmap$CoordinateSystem = i1252;
                    iArr461[i1251] = 31;
                    iArr461[i1252 - 1] = -iArr461[i1252 - 1];
                    int i1253 = i1252 + 2;
                    this.FastBitmap$CoordinateSystem = i1253;
                    iArr461[i1253 - 1] = iArr461[i1253 - 3];
                    iArr461[i1252] = iArr461[i1253 - 4];
                    return 0;
                case 563:
                    int[] iArr462 = this.values;
                    int i1254 = this.FastBitmap$CoordinateSystem;
                    int i1255 = i1254 + 1;
                    this.FastBitmap$CoordinateSystem = i1255;
                    iArr462[i1254] = 57;
                    this.FastBitmap$CoordinateSystem = i1255 + 1;
                    iArr462[i1255] = 0;
                    return 0;
                case 564:
                    int[] iArr463 = this.values;
                    int i1256 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1256 + 1;
                    iArr463[i1256] = 5;
                    return 0;
                case 565:
                    int[] iArr464 = this.values;
                    int i1257 = this.FastBitmap$CoordinateSystem;
                    int i1258 = i1257 + 1;
                    this.FastBitmap$CoordinateSystem = i1258;
                    iArr464[i1257] = 91;
                    iArr464[i1258 - 1] = -iArr464[i1258 - 1];
                    return 0;
                case 566:
                    Object[] objArr95 = this.invokeSuspend;
                    int i1259 = this.FastBitmap$CoordinateSystem;
                    int i1260 = i1259 + 1;
                    this.FastBitmap$CoordinateSystem = i1260;
                    objArr95[i1259] = objArr95[15];
                    int i1261 = i1260 - 1;
                    this.FastBitmap$CoordinateSystem = i1261;
                    Object obj55 = objArr95[i1261];
                    objArr95[i1261] = null;
                    objArr95[16] = obj55;
                    this.FastBitmap$CoordinateSystem = i1261 + 1;
                    objArr95[i1261] = objArr95[16];
                    return 0;
                case 567:
                    int[] iArr465 = this.values;
                    int i1262 = this.FastBitmap$CoordinateSystem;
                    int i1263 = i1262 + 1;
                    this.FastBitmap$CoordinateSystem = i1263;
                    iArr465[i1262] = 3;
                    this.FastBitmap$CoordinateSystem = i1263 + 1;
                    iArr465[i1263] = 0;
                    return 0;
                case 568:
                    int i1264 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1264;
                    int[] iArr466 = this.values;
                    iArr466[i1264 - 1] = iArr466[i1264 - 1] & iArr466[i1264];
                    int i1265 = i1264 + 2;
                    this.FastBitmap$CoordinateSystem = i1265;
                    iArr466[i1265 - 1] = iArr466[i1265 - 3];
                    iArr466[i1264] = iArr466[i1265 - 4];
                    return 0;
                case 569:
                    int[] iArr467 = this.values;
                    int i1266 = this.FastBitmap$CoordinateSystem;
                    int i1267 = i1266 + 1;
                    this.FastBitmap$CoordinateSystem = i1267;
                    iArr467[i1266] = 59;
                    iArr467[i1267 - 1] = -iArr467[i1267 - 1];
                    return 0;
                case 570:
                    int[] iArr468 = this.values;
                    int i1268 = this.FastBitmap$CoordinateSystem;
                    int i1269 = i1268 + 2;
                    this.FastBitmap$CoordinateSystem = i1269;
                    iArr468[i1269 - 1] = iArr468[i1269 - 3];
                    iArr468[i1268] = iArr468[i1269 - 4];
                    iArr468[i1269 - 1] = -iArr468[i1269 - 1];
                    int i1270 = i1269 + 2;
                    this.FastBitmap$CoordinateSystem = i1270;
                    iArr468[i1270 - 1] = iArr468[i1270 - 3];
                    iArr468[i1269] = iArr468[i1270 - 4];
                    return 0;
                case 571:
                    int[] iArr469 = this.values;
                    int i1271 = this.FastBitmap$CoordinateSystem;
                    iArr469[i1271 - 1] = -iArr469[i1271 - 1];
                    int i1272 = i1271 - 1;
                    this.FastBitmap$CoordinateSystem = i1272;
                    iArr469[i1272 - 1] = iArr469[i1272 - 1] ^ iArr469[i1272];
                    iArr469[i1272 - 1] = -iArr469[i1272 - 1];
                    return 0;
                case 572:
                    int[] iArr470 = this.values;
                    int i1273 = this.FastBitmap$CoordinateSystem;
                    int i1274 = i1273 + 1;
                    this.FastBitmap$CoordinateSystem = i1274;
                    iArr470[i1273] = 50;
                    int i1275 = i1274 + 1;
                    this.FastBitmap$CoordinateSystem = i1275;
                    iArr470[i1274] = 0;
                    int i1276 = i1275 - 1;
                    this.FastBitmap$CoordinateSystem = i1276;
                    iArr470[i1276 - 1] = iArr470[i1276 - 1] / iArr470[i1276];
                    return 0;
                case 573:
                    int i1277 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1277;
                    int[] iArr471 = this.values;
                    iArr471[i1277 - 1] = iArr471[i1277 - 1] | iArr471[i1277];
                    int i1278 = i1277 - 1;
                    this.FastBitmap$CoordinateSystem = i1278;
                    iArr471[i1278 - 1] = iArr471[i1278 - 1] & iArr471[i1278];
                    int i1279 = i1278 + 2;
                    this.FastBitmap$CoordinateSystem = i1279;
                    iArr471[i1279 - 1] = iArr471[i1279 - 3];
                    iArr471[i1278] = iArr471[i1279 - 4];
                    return 0;
                case 574:
                    int[] iArr472 = this.values;
                    int i1280 = this.FastBitmap$CoordinateSystem;
                    int i1281 = i1280 + 1;
                    this.FastBitmap$CoordinateSystem = i1281;
                    iArr472[i1280] = 96;
                    this.FastBitmap$CoordinateSystem = i1281 + 1;
                    iArr472[i1281] = 0;
                    return 0;
                case 575:
                    long[] jArr8 = this.toDoubleRange;
                    int i1282 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1282 + 1;
                    jArr8[i1282] = 0;
                    return 0;
                case 576:
                    int[] iArr473 = this.values;
                    int i1283 = this.FastBitmap$CoordinateSystem;
                    int i1284 = i1283 + 1;
                    this.FastBitmap$CoordinateSystem = i1284;
                    iArr473[i1283] = 41;
                    iArr473[i1284 - 1] = -iArr473[i1284 - 1];
                    int i1285 = i1284 + 2;
                    this.FastBitmap$CoordinateSystem = i1285;
                    iArr473[i1285 - 1] = iArr473[i1285 - 3];
                    iArr473[i1284] = iArr473[i1285 - 4];
                    return 0;
                case 577:
                    int[] iArr474 = this.values;
                    int i1286 = this.FastBitmap$CoordinateSystem;
                    int i1287 = i1286 + 1;
                    this.FastBitmap$CoordinateSystem = i1287;
                    iArr474[i1286] = 21;
                    int i1288 = i1287 + 2;
                    this.FastBitmap$CoordinateSystem = i1288;
                    iArr474[i1288 - 1] = iArr474[i1288 - 3];
                    iArr474[i1287] = iArr474[i1288 - 4];
                    return 0;
                case 578:
                    int[] iArr475 = this.values;
                    int i1289 = this.FastBitmap$CoordinateSystem;
                    int i1290 = i1289 + 1;
                    this.FastBitmap$CoordinateSystem = i1290;
                    iArr475[i1289] = 111;
                    int i1291 = i1290 + 1;
                    this.FastBitmap$CoordinateSystem = i1291;
                    iArr475[i1290] = iArr475[i1291 - 2];
                    this.FastBitmap$CoordinateSystem = i1291 + 1;
                    iArr475[i1291] = -1;
                    return 0;
                case 579:
                    int i1292 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1292;
                    int[] iArr476 = this.values;
                    iArr476[i1292 - 1] = iArr476[i1292 - 1] | iArr476[i1292];
                    int i1293 = iArr476[i1292 - 1];
                    iArr476[i1292 - 1] = iArr476[i1292 - 2];
                    iArr476[i1292 - 2] = i1293;
                    int i1294 = i1292 - 1;
                    this.FastBitmap$CoordinateSystem = i1294;
                    this.invokeSuspend[i1294] = null;
                    return 0;
                case 580:
                    int[] iArr477 = this.values;
                    int i1295 = this.FastBitmap$CoordinateSystem;
                    int i1296 = i1295 + 1;
                    this.FastBitmap$CoordinateSystem = i1296;
                    iArr477[i1295] = 9;
                    int i1297 = i1296 + 2;
                    this.FastBitmap$CoordinateSystem = i1297;
                    iArr477[i1297 - 1] = iArr477[i1297 - 3];
                    iArr477[i1296] = iArr477[i1297 - 4];
                    int i1298 = i1297 - 1;
                    this.FastBitmap$CoordinateSystem = i1298;
                    iArr477[i1298 - 1] = iArr477[i1298] & iArr477[i1298 - 1];
                    return 0;
                case 581:
                    int[] iArr478 = this.values;
                    int i1299 = this.FastBitmap$CoordinateSystem;
                    int i1300 = i1299 + 1;
                    this.FastBitmap$CoordinateSystem = i1300;
                    iArr478[i1299] = 109;
                    int i1301 = i1300 + 2;
                    this.FastBitmap$CoordinateSystem = i1301;
                    iArr478[i1301 - 1] = iArr478[i1301 - 3];
                    iArr478[i1300] = iArr478[i1301 - 4];
                    return 0;
                case 582:
                    Object[] objArr96 = this.invokeSuspend;
                    int i1302 = this.FastBitmap$CoordinateSystem;
                    int i1303 = i1302 + 1;
                    this.FastBitmap$CoordinateSystem = i1303;
                    objArr96[i1302] = objArr96[14];
                    int i1304 = i1303 - 1;
                    this.FastBitmap$CoordinateSystem = i1304;
                    Object obj56 = objArr96[i1304];
                    objArr96[i1304] = null;
                    objArr96[16] = obj56;
                    this.FastBitmap$CoordinateSystem = i1304 + 1;
                    objArr96[i1304] = objArr96[16];
                    return 0;
                case 583:
                    int[] iArr479 = this.values;
                    int i1305 = this.FastBitmap$CoordinateSystem;
                    int i1306 = i1305 + 1;
                    this.FastBitmap$CoordinateSystem = i1306;
                    iArr479[i1305] = 39;
                    iArr479[i1306 - 1] = -iArr479[i1306 - 1];
                    return 0;
                case 584:
                    int[] iArr480 = this.values;
                    int i1307 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1307 + 1;
                    iArr480[i1307] = 19;
                    return 0;
                case 585:
                    int[] iArr481 = this.values;
                    int i1308 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1308 + 1;
                    iArr481[i1308] = 14;
                    return 0;
                case 586:
                    int i1309 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1309;
                    Object[] objArr97 = this.invokeSuspend;
                    objArr97[i1309] = null;
                    this.FastBitmap$CoordinateSystem = i1309 + 1;
                    objArr97[i1309] = objArr97[14];
                    return 0;
                case 587:
                    int i1310 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1310;
                    int[] iArr482 = this.values;
                    iArr482[i1310 - 1] = iArr482[i1310 - 1] & iArr482[i1310];
                    int i1311 = i1310 - 1;
                    this.FastBitmap$CoordinateSystem = i1311;
                    iArr482[i1311 - 1] = iArr482[i1311 - 1] | iArr482[i1311];
                    int i1312 = i1311 + 1;
                    this.FastBitmap$CoordinateSystem = i1312;
                    int i1313 = iArr482[i1312 - 2];
                    iArr482[i1311] = i1313;
                    iArr482[i1312 - 2] = iArr482[i1312 - 3];
                    iArr482[i1312 - 3] = iArr482[i1312 - 4];
                    iArr482[i1312 - 4] = i1313;
                    return 0;
                case 588:
                    int[] iArr483 = this.values;
                    int i1314 = this.FastBitmap$CoordinateSystem;
                    int i1315 = i1314 + 1;
                    this.FastBitmap$CoordinateSystem = i1315;
                    iArr483[i1314] = 117;
                    iArr483[i1315 - 1] = -iArr483[i1315 - 1];
                    int i1316 = i1315 + 1;
                    this.FastBitmap$CoordinateSystem = i1316;
                    iArr483[i1315] = iArr483[i1316 - 2];
                    return 0;
                case 589:
                    int i1317 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1317;
                    int[] iArr484 = this.values;
                    iArr484[i1317 - 1] = iArr484[i1317 - 1] | iArr484[i1317];
                    int i1318 = i1317 + 2;
                    this.FastBitmap$CoordinateSystem = i1318;
                    iArr484[i1318 - 1] = iArr484[i1318 - 3];
                    iArr484[i1317] = iArr484[i1318 - 4];
                    int i1319 = i1318 - 1;
                    this.FastBitmap$CoordinateSystem = i1319;
                    iArr484[i1319 - 1] = iArr484[i1319] & iArr484[i1319 - 1];
                    return 0;
                case 590:
                    int[] iArr485 = this.values;
                    int i1320 = this.FastBitmap$CoordinateSystem;
                    int i1321 = i1320 + 1;
                    this.FastBitmap$CoordinateSystem = i1321;
                    iArr485[i1320] = 75;
                    int i1322 = i1321 + 2;
                    this.FastBitmap$CoordinateSystem = i1322;
                    iArr485[i1322 - 1] = iArr485[i1322 - 3];
                    iArr485[i1321] = iArr485[i1322 - 4];
                    return 0;
                case 591:
                    int i1323 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1323;
                    Object[] objArr98 = this.invokeSuspend;
                    Object obj57 = objArr98[i1323];
                    objArr98[i1323] = null;
                    objArr98[17] = obj57;
                    this.FastBitmap$CoordinateSystem = i1323 + 1;
                    objArr98[i1323] = null;
                    return 0;
                case 592:
                    Object[] objArr99 = this.invokeSuspend;
                    int i1324 = this.FastBitmap$CoordinateSystem;
                    int i1325 = i1324 + 1;
                    this.FastBitmap$CoordinateSystem = i1325;
                    objArr99[i1324] = objArr99[18];
                    this.FastBitmap$CoordinateSystem = i1325 + 1;
                    objArr99[i1325] = objArr99[14];
                    return 0;
                case 593:
                    int i1326 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1326;
                    Object[] objArr100 = this.invokeSuspend;
                    Object obj58 = objArr100[i1326];
                    objArr100[i1326] = null;
                    objArr100[17] = obj58;
                    int i1327 = i1326 + 1;
                    this.FastBitmap$CoordinateSystem = i1327;
                    objArr100[i1326] = null;
                    int i1328 = i1327 - 1;
                    this.FastBitmap$CoordinateSystem = i1328;
                    Object obj59 = objArr100[i1328];
                    objArr100[i1328] = null;
                    objArr100[18] = obj59;
                    return 0;
                case 594:
                    int[] iArr486 = this.values;
                    int i1329 = this.FastBitmap$CoordinateSystem;
                    int i1330 = i1329 + 1;
                    this.FastBitmap$CoordinateSystem = i1330;
                    iArr486[i1329] = 53;
                    iArr486[i1330 - 1] = -iArr486[i1330 - 1];
                    return 0;
                case 595:
                    int i1331 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1331;
                    Object[] objArr101 = this.invokeSuspend;
                    Object obj60 = objArr101[i1331];
                    objArr101[i1331] = null;
                    objArr101[17] = obj60;
                    this.FastBitmap$CoordinateSystem = i1331 + 1;
                    objArr101[i1331] = objArr101[16];
                    return 0;
                case 596:
                    int[] iArr487 = this.values;
                    int i1332 = this.FastBitmap$CoordinateSystem;
                    int i1333 = i1332 + 1;
                    this.FastBitmap$CoordinateSystem = i1333;
                    iArr487[i1332] = 115;
                    iArr487[i1333 - 1] = -iArr487[i1333 - 1];
                    return 0;
                case 597:
                    int[] iArr488 = this.values;
                    int i1334 = this.FastBitmap$CoordinateSystem;
                    int i1335 = i1334 + 1;
                    this.FastBitmap$CoordinateSystem = i1335;
                    iArr488[i1334] = 49;
                    int i1336 = i1335 + 2;
                    this.FastBitmap$CoordinateSystem = i1336;
                    iArr488[i1336 - 1] = iArr488[i1336 - 3];
                    iArr488[i1335] = iArr488[i1336 - 4];
                    int i1337 = i1336 - 1;
                    this.FastBitmap$CoordinateSystem = i1337;
                    iArr488[i1337 - 1] = iArr488[i1337] ^ iArr488[i1337 - 1];
                    return 0;
                case 598:
                    int[] iArr489 = this.values;
                    int i1338 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1338 + 1;
                    iArr489[i1338] = 44;
                    return 0;
                case SecExceptionCode.SEC_ERROR_DYN_STORE_UNKNOWN_ERROR /*599*/:
                    int[] iArr490 = this.values;
                    int i1339 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1339 + 1;
                    iArr490[i1339] = 40;
                    return 0;
                case 600:
                    int[] iArr491 = this.values;
                    int i1340 = this.FastBitmap$CoordinateSystem;
                    int i1341 = i1340 + 1;
                    this.FastBitmap$CoordinateSystem = i1341;
                    iArr491[i1340] = 3;
                    this.FastBitmap$CoordinateSystem = i1341 + 1;
                    iArr491[i1341] = 2;
                    return 0;
                case 601:
                    int[] iArr492 = this.values;
                    int i1342 = this.FastBitmap$CoordinateSystem;
                    int i1343 = i1342 + 1;
                    this.FastBitmap$CoordinateSystem = i1343;
                    iArr492[i1342] = 103;
                    iArr492[i1343 - 1] = -iArr492[i1343 - 1];
                    return 0;
                case 602:
                    int[] iArr493 = this.values;
                    int i1344 = this.FastBitmap$CoordinateSystem;
                    int i1345 = i1344 + 1;
                    this.FastBitmap$CoordinateSystem = i1345;
                    iArr493[i1344] = iArr493[i1345 - 2];
                    int i1346 = i1345 + 1;
                    this.FastBitmap$CoordinateSystem = i1346;
                    iArr493[i1345] = -1;
                    int i1347 = i1346 + 2;
                    this.FastBitmap$CoordinateSystem = i1347;
                    iArr493[i1347 - 1] = iArr493[i1347 - 3];
                    iArr493[i1346] = iArr493[i1347 - 4];
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_HASHHEX_FAILED /*603*/:
                    int[] iArr494 = this.values;
                    int i1348 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1348 + 1;
                    iArr494[i1348] = 50;
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_BASE64_FAILED /*604*/:
                    int[] iArr495 = this.values;
                    int i1349 = this.FastBitmap$CoordinateSystem;
                    int i1350 = i1349 + 1;
                    this.FastBitmap$CoordinateSystem = i1350;
                    iArr495[i1349] = 69;
                    int i1351 = i1350 + 1;
                    this.FastBitmap$CoordinateSystem = i1351;
                    iArr495[i1350] = iArr495[i1351 - 2];
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_CONFUSE_FAILED /*605*/:
                    int[] iArr496 = this.values;
                    int i1352 = this.FastBitmap$CoordinateSystem;
                    int i1353 = i1352 + 1;
                    this.FastBitmap$CoordinateSystem = i1353;
                    iArr496[i1352] = 18;
                    this.FastBitmap$CoordinateSystem = i1353 + 1;
                    iArr496[i1353] = 0;
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_NO_SEEDSECRET /*606*/:
                    int i1354 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1354;
                    int[] iArr497 = this.values;
                    iArr497[i1354 - 1] = iArr497[i1354 - 1] & iArr497[i1354];
                    int i1355 = iArr497[i1354 - 1];
                    iArr497[i1354 - 1] = iArr497[i1354 - 2];
                    iArr497[i1354 - 2] = i1355;
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_DATA_FILE_MISMATCH /*607*/:
                    int[] iArr498 = this.values;
                    int i1356 = this.FastBitmap$CoordinateSystem;
                    int i1357 = i1356 + 1;
                    this.FastBitmap$CoordinateSystem = i1357;
                    iArr498[i1356] = 1;
                    int i1358 = i1357 + 1;
                    this.FastBitmap$CoordinateSystem = i1358;
                    iArr498[i1357] = iArr498[i1358 - 2];
                    iArr498[i1358 - 1] = -iArr498[i1358 - 1];
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_NO_DATA_FILE /*608*/:
                    int[] iArr499 = this.values;
                    int i1359 = this.FastBitmap$CoordinateSystem;
                    int i1360 = i1359 + 1;
                    this.FastBitmap$CoordinateSystem = i1360;
                    iArr499[i1359] = 39;
                    int i1361 = i1360 + 2;
                    this.FastBitmap$CoordinateSystem = i1361;
                    iArr499[i1361 - 1] = iArr499[i1361 - 3];
                    iArr499[i1360] = iArr499[i1361 - 4];
                    int i1362 = i1361 - 1;
                    this.FastBitmap$CoordinateSystem = i1362;
                    iArr499[i1362 - 1] = iArr499[i1362] & iArr499[i1362 - 1];
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_INCORRECT_DATA_FILE /*609*/:
                    int[] iArr500 = this.values;
                    int i1363 = this.FastBitmap$CoordinateSystem;
                    int i1364 = i1363 + 1;
                    this.FastBitmap$CoordinateSystem = i1364;
                    iArr500[i1363] = 125;
                    iArr500[i1364 - 1] = -iArr500[i1364 - 1];
                    int i1365 = i1364 + 2;
                    this.FastBitmap$CoordinateSystem = i1365;
                    iArr500[i1365 - 1] = iArr500[i1365 - 3];
                    iArr500[i1364] = iArr500[i1365 - 4];
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_INCORRECT_DATA_FILE_DATA /*610*/:
                    Object[] objArr102 = this.invokeSuspend;
                    int i1366 = this.FastBitmap$CoordinateSystem;
                    int i1367 = i1366 + 1;
                    this.FastBitmap$CoordinateSystem = i1367;
                    objArr102[i1366] = objArr102[18];
                    int i1368 = i1367 + 1;
                    this.FastBitmap$CoordinateSystem = i1368;
                    objArr102[i1367] = objArr102[15];
                    this.FastBitmap$CoordinateSystem = i1368 + 1;
                    objArr102[i1368] = objArr102[14];
                    return 0;
                case 611:
                    int[] iArr501 = this.values;
                    int i1369 = this.FastBitmap$CoordinateSystem;
                    int i1370 = i1369 + 1;
                    this.FastBitmap$CoordinateSystem = i1370;
                    iArr501[i1369] = 9;
                    int i1371 = i1370 + 2;
                    this.FastBitmap$CoordinateSystem = i1371;
                    iArr501[i1371 - 1] = iArr501[i1371 - 3];
                    iArr501[i1370] = iArr501[i1371 - 4];
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_ILLEGEL_KEY /*612*/:
                    int[] iArr502 = this.values;
                    int i1372 = this.FastBitmap$CoordinateSystem;
                    int i1373 = i1372 + 1;
                    this.FastBitmap$CoordinateSystem = i1373;
                    iArr502[i1372] = 27;
                    int i1374 = i1373 - 1;
                    this.FastBitmap$CoordinateSystem = i1374;
                    iArr502[i1374 - 1] = iArr502[i1374 - 1] + iArr502[i1374];
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_ATLAS_KEY_NOT_EXSITED /*613*/:
                    int[] iArr503 = this.values;
                    int i1375 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1375 + 1;
                    iArr503[i1375] = 82;
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_BLOWFISH_FAILED /*614*/:
                    Object[] objArr103 = this.invokeSuspend;
                    int i1376 = this.FastBitmap$CoordinateSystem;
                    int i1377 = i1376 + 1;
                    this.FastBitmap$CoordinateSystem = i1377;
                    objArr103[i1376] = objArr103[14];
                    int i1378 = i1377 - 1;
                    this.FastBitmap$CoordinateSystem = i1378;
                    Object obj61 = objArr103[i1378];
                    objArr103[i1378] = null;
                    objArr103[18] = obj61;
                    return 0;
                case SecExceptionCode.SEC_ERROR_SIGNATURE_LOW_VERSION_DATA_FILE /*615*/:
                    int i1379 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1379;
                    int[] iArr504 = this.values;
                    iArr504[i1379 - 1] = iArr504[i1379 - 1] | iArr504[i1379];
                    int i1380 = i1379 + 1;
                    this.FastBitmap$CoordinateSystem = i1380;
                    iArr504[i1379] = iArr504[i1380 - 2];
                    return 0;
                case 616:
                    Object[] objArr104 = this.invokeSuspend;
                    int i1381 = this.FastBitmap$CoordinateSystem;
                    int i1382 = i1381 + 1;
                    this.FastBitmap$CoordinateSystem = i1382;
                    objArr104[i1381] = objArr104[16];
                    this.FastBitmap$CoordinateSystem = i1382 + 1;
                    objArr104[i1382] = objArr104[17];
                    return 0;
                case 617:
                    Object[] objArr105 = this.invokeSuspend;
                    int i1383 = this.FastBitmap$CoordinateSystem;
                    int i1384 = i1383 + 1;
                    this.FastBitmap$CoordinateSystem = i1384;
                    objArr105[i1383] = objArr105[15];
                    int i1385 = i1384 + 1;
                    this.FastBitmap$CoordinateSystem = i1385;
                    objArr105[i1384] = objArr105[18];
                    this.FastBitmap$CoordinateSystem = i1385 + 1;
                    objArr105[i1385] = objArr105[16];
                    return 0;
                case 618:
                    int[] iArr505 = this.values;
                    int i1386 = this.FastBitmap$CoordinateSystem;
                    int i1387 = i1386 + 1;
                    this.FastBitmap$CoordinateSystem = i1387;
                    iArr505[i1386] = 123;
                    int i1388 = i1387 + 2;
                    this.FastBitmap$CoordinateSystem = i1388;
                    iArr505[i1388 - 1] = iArr505[i1388 - 3];
                    iArr505[i1387] = iArr505[i1388 - 4];
                    int i1389 = i1388 - 1;
                    this.FastBitmap$CoordinateSystem = i1389;
                    iArr505[i1389 - 1] = iArr505[i1389] ^ iArr505[i1389 - 1];
                    return 0;
                case 619:
                    Object[] objArr106 = this.invokeSuspend;
                    int i1390 = this.FastBitmap$CoordinateSystem;
                    int i1391 = i1390 + 1;
                    this.FastBitmap$CoordinateSystem = i1391;
                    objArr106[i1390] = objArr106[18];
                    this.FastBitmap$CoordinateSystem = i1391 + 1;
                    objArr106[i1391] = objArr106[17];
                    return 0;
                case 620:
                    int[] iArr506 = this.values;
                    int i1392 = this.FastBitmap$CoordinateSystem;
                    int i1393 = i1392 + 1;
                    this.FastBitmap$CoordinateSystem = i1393;
                    iArr506[i1392] = 105;
                    int i1394 = i1393 + 1;
                    this.FastBitmap$CoordinateSystem = i1394;
                    iArr506[i1393] = iArr506[i1394 - 2];
                    this.FastBitmap$CoordinateSystem = i1394 + 1;
                    iArr506[i1394] = -1;
                    return 0;
                case 621:
                    int[] iArr507 = this.values;
                    int i1395 = this.FastBitmap$CoordinateSystem;
                    int i1396 = i1395 + 1;
                    this.FastBitmap$CoordinateSystem = i1396;
                    iArr507[i1395] = 3;
                    int i1397 = i1396 + 2;
                    this.FastBitmap$CoordinateSystem = i1397;
                    iArr507[i1397 - 1] = iArr507[i1397 - 3];
                    iArr507[i1396] = iArr507[i1397 - 4];
                    return 0;
                case 622:
                    int[] iArr508 = this.values;
                    int i1398 = this.FastBitmap$CoordinateSystem;
                    int i1399 = i1398 + 1;
                    this.FastBitmap$CoordinateSystem = i1399;
                    iArr508[i1398] = 97;
                    iArr508[i1399 - 1] = -iArr508[i1399 - 1];
                    int i1400 = i1399 + 2;
                    this.FastBitmap$CoordinateSystem = i1400;
                    iArr508[i1400 - 1] = iArr508[i1400 - 3];
                    iArr508[i1399] = iArr508[i1400 - 4];
                    return 0;
                case 623:
                    int[] iArr509 = this.values;
                    int i1401 = this.FastBitmap$CoordinateSystem;
                    int i1402 = i1401 + 1;
                    this.FastBitmap$CoordinateSystem = i1402;
                    iArr509[i1401] = 121;
                    int i1403 = i1402 + 2;
                    this.FastBitmap$CoordinateSystem = i1403;
                    iArr509[i1403 - 1] = iArr509[i1403 - 3];
                    iArr509[i1402] = iArr509[i1403 - 4];
                    return 0;
                case 624:
                    int[] iArr510 = this.values;
                    int i1404 = this.FastBitmap$CoordinateSystem;
                    int i1405 = i1404 + 1;
                    this.FastBitmap$CoordinateSystem = i1405;
                    iArr510[i1404] = 59;
                    int i1406 = i1405 + 2;
                    this.FastBitmap$CoordinateSystem = i1406;
                    iArr510[i1406 - 1] = iArr510[i1406 - 3];
                    iArr510[i1405] = iArr510[i1406 - 4];
                    return 0;
                case 625:
                    int[] iArr511 = this.values;
                    int i1407 = this.FastBitmap$CoordinateSystem;
                    int i1408 = i1407 + 1;
                    this.FastBitmap$CoordinateSystem = i1408;
                    iArr511[i1407] = 119;
                    int i1409 = i1408 + 2;
                    this.FastBitmap$CoordinateSystem = i1409;
                    iArr511[i1409 - 1] = iArr511[i1409 - 3];
                    iArr511[i1408] = iArr511[i1409 - 4];
                    return 0;
                case 626:
                    int[] iArr512 = this.values;
                    int i1410 = this.FastBitmap$CoordinateSystem;
                    int i1411 = i1410 + 1;
                    this.FastBitmap$CoordinateSystem = i1411;
                    iArr512[i1410] = iArr512[i1411 - 2];
                    int i1412 = i1411 - 1;
                    this.FastBitmap$CoordinateSystem = i1412;
                    iArr512[20] = iArr512[i1412];
                    return 0;
                case 627:
                    int[] iArr513 = this.values;
                    int i1413 = this.FastBitmap$CoordinateSystem;
                    int i1414 = i1413 + 1;
                    this.FastBitmap$CoordinateSystem = i1414;
                    iArr513[i1413] = iArr513[20];
                    this.FastBitmap$CoordinateSystem = i1414 + 1;
                    iArr513[i1414] = iArr513[21];
                    return 0;
                case 628:
                    int i1415 = this.FastBitmap$CoordinateSystem - 2;
                    this.FastBitmap$CoordinateSystem = i1415;
                    int[] iArr514 = this.values;
                    this.setMax = iArr514[i1415] != iArr514[i1415 + 1] ? 1 : 0;
                    return 0;
                case 629:
                    int[] iArr515 = this.values;
                    int i1416 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1416 + 1;
                    iArr515[i1416] = iArr515[20];
                    return 0;
                case 630:
                    int[] iArr516 = this.values;
                    int i1417 = this.FastBitmap$CoordinateSystem;
                    this.FastBitmap$CoordinateSystem = i1417 + 1;
                    iArr516[i1417] = 101;
                    return 0;
                case 631:
                    Object[] objArr107 = this.invokeSuspend;
                    int i1418 = this.FastBitmap$CoordinateSystem;
                    int i1419 = i1418 + 1;
                    this.FastBitmap$CoordinateSystem = i1419;
                    objArr107[i1418] = objArr107[19];
                    this.FastBitmap$CoordinateSystem = i1419 + 1;
                    objArr107[i1419] = objArr107[17];
                    return 0;
                case 632:
                    Object[] objArr108 = this.invokeSuspend;
                    int i1420 = this.FastBitmap$CoordinateSystem;
                    int i1421 = i1420 + 1;
                    this.FastBitmap$CoordinateSystem = i1421;
                    objArr108[i1420] = objArr108[14];
                    int i1422 = i1421 + 1;
                    this.FastBitmap$CoordinateSystem = i1422;
                    objArr108[i1421] = objArr108[15];
                    this.FastBitmap$CoordinateSystem = i1422 + 1;
                    objArr108[i1422] = objArr108[19];
                    return 0;
                case 633:
                    int[] iArr517 = this.values;
                    int i1423 = this.FastBitmap$CoordinateSystem;
                    int i1424 = i1423 + 1;
                    this.FastBitmap$CoordinateSystem = i1424;
                    iArr517[i1423] = 111;
                    int i1425 = i1424 + 2;
                    this.FastBitmap$CoordinateSystem = i1425;
                    iArr517[i1425 - 1] = iArr517[i1425 - 3];
                    iArr517[i1424] = iArr517[i1425 - 4];
                    return 0;
                case 634:
                    int[] iArr518 = this.values;
                    int i1426 = this.FastBitmap$CoordinateSystem;
                    int i1427 = i1426 + 1;
                    this.FastBitmap$CoordinateSystem = i1427;
                    iArr518[i1426] = 89;
                    iArr518[i1427 - 1] = -iArr518[i1427 - 1];
                    return 0;
                case 635:
                    int[] iArr519 = this.values;
                    int i1428 = this.FastBitmap$CoordinateSystem;
                    int i1429 = i1428 + 1;
                    this.FastBitmap$CoordinateSystem = i1429;
                    iArr519[i1428] = 63;
                    int i1430 = i1429 - 1;
                    this.FastBitmap$CoordinateSystem = i1430;
                    iArr519[i1430 - 1] = iArr519[i1430 - 1] + iArr519[i1430];
                    int i1431 = i1430 + 1;
                    this.FastBitmap$CoordinateSystem = i1431;
                    iArr519[i1430] = iArr519[i1431 - 2];
                    return 0;
                case 636:
                    int[] iArr520 = this.values;
                    int i1432 = this.FastBitmap$CoordinateSystem;
                    int i1433 = i1432 + 1;
                    this.FastBitmap$CoordinateSystem = i1433;
                    iArr520[i1432] = 113;
                    int i1434 = i1433 - 1;
                    this.FastBitmap$CoordinateSystem = i1434;
                    iArr520[i1434 - 1] = iArr520[i1434 - 1] + iArr520[i1434];
                    return 0;
                case 637:
                    int[] iArr521 = this.values;
                    int i1435 = this.FastBitmap$CoordinateSystem;
                    int i1436 = i1435 + 1;
                    this.FastBitmap$CoordinateSystem = i1436;
                    iArr521[i1435] = 19;
                    int i1437 = i1436 + 1;
                    this.FastBitmap$CoordinateSystem = i1437;
                    iArr521[i1436] = iArr521[i1437 - 2];
                    return 0;
                case 638:
                    int[] iArr522 = this.values;
                    int i1438 = this.FastBitmap$CoordinateSystem;
                    int i1439 = i1438 + 1;
                    this.FastBitmap$CoordinateSystem = i1439;
                    iArr522[i1438] = 23;
                    iArr522[i1439 - 1] = -iArr522[i1439 - 1];
                    return 0;
                case 639:
                    int[] iArr523 = this.values;
                    int i1440 = this.FastBitmap$CoordinateSystem;
                    int i1441 = i1440 + 1;
                    this.FastBitmap$CoordinateSystem = i1441;
                    iArr523[i1440] = 21;
                    int i1442 = i1441 + 2;
                    this.FastBitmap$CoordinateSystem = i1442;
                    iArr523[i1442 - 1] = iArr523[i1442 - 3];
                    iArr523[i1441] = iArr523[i1442 - 4];
                    int i1443 = i1442 + 2;
                    this.FastBitmap$CoordinateSystem = i1443;
                    iArr523[i1443 - 1] = iArr523[i1443 - 3];
                    iArr523[i1442] = iArr523[i1443 - 4];
                    return 0;
                case 640:
                    Object[] objArr109 = this.invokeSuspend;
                    int i1444 = this.FastBitmap$CoordinateSystem;
                    int i1445 = i1444 + 1;
                    this.FastBitmap$CoordinateSystem = i1445;
                    objArr109[i1444] = objArr109[14];
                    int i1446 = i1445 + 1;
                    this.FastBitmap$CoordinateSystem = i1446;
                    objArr109[i1445] = objArr109[19];
                    this.FastBitmap$CoordinateSystem = i1446 + 1;
                    objArr109[i1446] = objArr109[15];
                    return 0;
                case 641:
                    int[] iArr524 = this.values;
                    int i1447 = this.FastBitmap$CoordinateSystem;
                    int i1448 = i1447 + 1;
                    this.FastBitmap$CoordinateSystem = i1448;
                    iArr524[i1447] = 69;
                    iArr524[i1448 - 1] = -iArr524[i1448 - 1];
                    int i1449 = i1448 + 2;
                    this.FastBitmap$CoordinateSystem = i1449;
                    iArr524[i1449 - 1] = iArr524[i1449 - 3];
                    iArr524[i1448] = iArr524[i1449 - 4];
                    return 0;
                case 642:
                    int[] iArr525 = this.values;
                    int i1450 = this.FastBitmap$CoordinateSystem;
                    int i1451 = i1450 + 1;
                    this.FastBitmap$CoordinateSystem = i1451;
                    iArr525[i1450] = 5;
                    int i1452 = i1451 + 2;
                    this.FastBitmap$CoordinateSystem = i1452;
                    iArr525[i1452 - 1] = iArr525[i1452 - 3];
                    iArr525[i1451] = iArr525[i1452 - 4];
                    return 0;
                case 643:
                    int[] iArr526 = this.values;
                    int i1453 = this.FastBitmap$CoordinateSystem;
                    int i1454 = i1453 + 1;
                    this.FastBitmap$CoordinateSystem = i1454;
                    iArr526[i1453] = 79;
                    int i1455 = i1454 - 1;
                    this.FastBitmap$CoordinateSystem = i1455;
                    iArr526[i1455 - 1] = iArr526[i1455 - 1] + iArr526[i1455];
                    int i1456 = i1455 + 1;
                    this.FastBitmap$CoordinateSystem = i1456;
                    iArr526[i1455] = iArr526[i1456 - 2];
                    return 0;
                case 644:
                    int[] iArr527 = this.values;
                    int i1457 = this.FastBitmap$CoordinateSystem;
                    int i1458 = i1457 + 1;
                    this.FastBitmap$CoordinateSystem = i1458;
                    iArr527[i1457] = 85;
                    this.FastBitmap$CoordinateSystem = i1458 + 1;
                    iArr527[i1458] = 0;
                    return 0;
                case 645:
                    int[] iArr528 = this.values;
                    int i1459 = this.FastBitmap$CoordinateSystem;
                    int i1460 = i1459 + 1;
                    this.FastBitmap$CoordinateSystem = i1460;
                    iArr528[i1459] = 35;
                    int i1461 = i1460 + 2;
                    this.FastBitmap$CoordinateSystem = i1461;
                    iArr528[i1461 - 1] = iArr528[i1461 - 3];
                    iArr528[i1460] = iArr528[i1461 - 4];
                    return 0;
                case 646:
                    Object[] objArr110 = this.invokeSuspend;
                    int i1462 = this.FastBitmap$CoordinateSystem;
                    int i1463 = i1462 + 1;
                    this.FastBitmap$CoordinateSystem = i1463;
                    objArr110[i1462] = objArr110[i1463 - 2];
                    int i1464 = i1463 - 1;
                    this.FastBitmap$CoordinateSystem = i1464;
                    Object obj62 = objArr110[i1464];
                    objArr110[i1464] = null;
                    objArr110[16] = obj62;
                    return 0;
                case 647:
                    int[] iArr529 = this.values;
                    int i1465 = this.FastBitmap$CoordinateSystem;
                    int i1466 = i1465 + 1;
                    this.FastBitmap$CoordinateSystem = i1466;
                    iArr529[i1465] = 39;
                    int i1467 = i1466 + 2;
                    this.FastBitmap$CoordinateSystem = i1467;
                    iArr529[i1467 - 1] = iArr529[i1467 - 3];
                    iArr529[i1466] = iArr529[i1467 - 4];
                    int i1468 = i1467 - 1;
                    this.FastBitmap$CoordinateSystem = i1468;
                    iArr529[i1468 - 1] = iArr529[i1468] | iArr529[i1468 - 1];
                    return 0;
                case 648:
                    int[] iArr530 = this.values;
                    int i1469 = this.FastBitmap$CoordinateSystem;
                    int i1470 = i1469 + 1;
                    this.FastBitmap$CoordinateSystem = i1470;
                    iArr530[i1469] = 43;
                    int i1471 = i1470 + 1;
                    this.FastBitmap$CoordinateSystem = i1471;
                    iArr530[i1470] = 0;
                    int i1472 = i1471 - 1;
                    this.FastBitmap$CoordinateSystem = i1472;
                    iArr530[i1472 - 1] = iArr530[i1472 - 1] / iArr530[i1472];
                    return 0;
                case 649:
                    int[] iArr531 = this.values;
                    int i1473 = this.FastBitmap$CoordinateSystem;
                    int i1474 = i1473 + 1;
                    this.FastBitmap$CoordinateSystem = i1474;
                    iArr531[i1473] = 89;
                    int i1475 = i1474 + 2;
                    this.FastBitmap$CoordinateSystem = i1475;
                    iArr531[i1475 - 1] = iArr531[i1475 - 3];
                    iArr531[i1474] = iArr531[i1475 - 4];
                    return 0;
                case 650:
                    Object[] objArr111 = this.invokeSuspend;
                    int i1476 = this.FastBitmap$CoordinateSystem;
                    int i1477 = i1476 + 1;
                    this.FastBitmap$CoordinateSystem = i1477;
                    objArr111[i1476] = objArr111[i1477 - 2];
                    int i1478 = i1477 - 1;
                    this.FastBitmap$CoordinateSystem = i1478;
                    Object obj63 = objArr111[i1478];
                    objArr111[i1478] = null;
                    objArr111[15] = obj63;
                    return 0;
                case 651:
                    int[] iArr532 = this.values;
                    int i1479 = this.FastBitmap$CoordinateSystem;
                    int i1480 = i1479 + 1;
                    this.FastBitmap$CoordinateSystem = i1480;
                    iArr532[i1479] = 113;
                    iArr532[i1480 - 1] = -iArr532[i1480 - 1];
                    return 0;
                case 652:
                    int i1481 = this.FastBitmap$CoordinateSystem - 1;
                    this.FastBitmap$CoordinateSystem = i1481;
                    Object[] objArr112 = this.invokeSuspend;
                    Object obj64 = objArr112[i1481];
                    objArr112[i1481] = null;
                    objArr112[16] = obj64;
                    this.FastBitmap$CoordinateSystem = i1481 + 1;
                    objArr112[i1481] = objArr112[14];
                    return 0;
                case 653:
                    int[] iArr533 = this.values;
                    int i1482 = this.FastBitmap$CoordinateSystem;
                    int i1483 = i1482 + 1;
                    this.FastBitmap$CoordinateSystem = i1483;
                    iArr533[i1482] = 59;
                    int i1484 = i1483 + 1;
                    this.FastBitmap$CoordinateSystem = i1484;
                    iArr533[i1483] = 0;
                    int i1485 = i1484 - 1;
                    this.FastBitmap$CoordinateSystem = i1485;
                    iArr533[i1485 - 1] = iArr533[i1485 - 1] / iArr533[i1485];
                    return 0;
                case 654:
                    int[] iArr534 = this.values;
                    int i1486 = this.FastBitmap$CoordinateSystem;
                    int i1487 = i1486 + 1;
                    this.FastBitmap$CoordinateSystem = i1487;
                    iArr534[i1486] = 77;
                    int i1488 = i1487 + 2;
                    this.FastBitmap$CoordinateSystem = i1488;
                    iArr534[i1488 - 1] = iArr534[i1488 - 3];
                    iArr534[i1487] = iArr534[i1488 - 4];
                    return 0;
                case 655:
                    int[] iArr535 = this.values;
                    int i1489 = this.FastBitmap$CoordinateSystem;
                    int i1490 = i1489 + 1;
                    this.FastBitmap$CoordinateSystem = i1490;
                    iArr535[i1489] = 57;
                    iArr535[i1490 - 1] = -iArr535[i1490 - 1];
                    return 0;
                case 656:
                    int[] iArr536 = this.values;
                    int i1491 = this.FastBitmap$CoordinateSystem;
                    int i1492 = i1491 + 1;
                    this.FastBitmap$CoordinateSystem = i1492;
                    iArr536[i1491] = 27;
                    this.FastBitmap$CoordinateSystem = i1492 + 1;
                    iArr536[i1492] = 0;
                    return 0;
                case 657:
                    int[] iArr537 = this.values;
                    int i1493 = this.FastBitmap$CoordinateSystem;
                    int i1494 = i1493 + 1;
                    this.FastBitmap$CoordinateSystem = i1494;
                    iArr537[i1493] = 43;
                    iArr537[i1494 - 1] = -iArr537[i1494 - 1];
                    return 0;
                case 658:
                    int[] iArr538 = this.values;
                    int i1495 = this.FastBitmap$CoordinateSystem;
                    int i1496 = i1495 + 1;
                    this.FastBitmap$CoordinateSystem = i1496;
                    iArr538[i1495] = 63;
                    iArr538[i1496 - 1] = -iArr538[i1496 - 1];
                    int i1497 = i1496 + 2;
                    this.FastBitmap$CoordinateSystem = i1497;
                    iArr538[i1497 - 1] = iArr538[i1497 - 3];
                    iArr538[i1496] = iArr538[i1497 - 4];
                    return 0;
                case 659:
                    Object[] objArr113 = this.invokeSuspend;
                    int i1498 = this.FastBitmap$CoordinateSystem;
                    int i1499 = i1498 + 1;
                    this.FastBitmap$CoordinateSystem = i1499;
                    objArr113[i1498] = objArr113[14];
                    this.FastBitmap$CoordinateSystem = i1499 + 1;
                    objArr113[i1499] = objArr113[19];
                    return 0;
                case 660:
                    int[] iArr539 = this.values;
                    int i1500 = this.FastBitmap$CoordinateSystem;
                    int i1501 = i1500 + 1;
                    this.FastBitmap$CoordinateSystem = i1501;
                    iArr539[i1500] = 49;
                    int i1502 = i1501 + 2;
                    this.FastBitmap$CoordinateSystem = i1502;
                    iArr539[i1502 - 1] = iArr539[i1502 - 3];
                    iArr539[i1501] = iArr539[i1502 - 4];
                    int i1503 = i1502 + 2;
                    this.FastBitmap$CoordinateSystem = i1503;
                    iArr539[i1503 - 1] = iArr539[i1503 - 3];
                    iArr539[i1502] = iArr539[i1503 - 4];
                    return 0;
                case 661:
                    int[] iArr540 = this.values;
                    int i1504 = this.FastBitmap$CoordinateSystem;
                    int i1505 = i1504 + 1;
                    this.FastBitmap$CoordinateSystem = i1505;
                    iArr540[i1504] = 105;
                    int i1506 = i1505 + 1;
                    this.FastBitmap$CoordinateSystem = i1506;
                    iArr540[i1505] = iArr540[i1506 - 2];
                    return 0;
                case 662:
                    int[] iArr541 = this.values;
                    int i1507 = this.FastBitmap$CoordinateSystem;
                    int i1508 = i1507 + 1;
                    this.FastBitmap$CoordinateSystem = i1508;
                    iArr541[i1507] = 1;
                    int i1509 = i1508 + 2;
                    this.FastBitmap$CoordinateSystem = i1509;
                    iArr541[i1509 - 1] = iArr541[i1509 - 3];
                    iArr541[i1508] = iArr541[i1509 - 4];
                    int i1510 = i1509 + 2;
                    this.FastBitmap$CoordinateSystem = i1510;
                    iArr541[i1510 - 1] = iArr541[i1510 - 3];
                    iArr541[i1509] = iArr541[i1510 - 4];
                    return 0;
                case 663:
                    int[] iArr542 = this.values;
                    int i1511 = this.FastBitmap$CoordinateSystem;
                    int i1512 = i1511 + 1;
                    this.FastBitmap$CoordinateSystem = i1512;
                    iArr542[i1511] = 53;
                    this.FastBitmap$CoordinateSystem = i1512 + 1;
                    iArr542[i1512] = 0;
                    return 0;
                default:
                    return i;
            }
            return 0;
        }
    }

    public static /* synthetic */ a copy$default(a aVar, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aVar.density;
        }
        if ((i5 & 2) != 0) {
            i2 = aVar.dpi;
        }
        if ((i5 & 4) != 0) {
            i3 = aVar.height;
        }
        if ((i5 & 8) != 0) {
            i4 = aVar.width;
        }
        return aVar.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.density;
    }

    public final int component2() {
        return this.dpi;
    }

    public final int component3() {
        return this.height;
    }

    public final int component4() {
        return this.width;
    }

    @NotNull
    public final a copy(@JSONField(name = "density") int i, @JSONField(name = "dpi") int i2, @JSONField(name = "height") int i3, @JSONField(name = "width") int i4) {
        return new a(i, i2, i3, i4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.density == aVar.density && this.dpi == aVar.dpi && this.height == aVar.height && this.width == aVar.width;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Display(density=");
        sb.append(this.density);
        sb.append(", dpi=");
        sb.append(this.dpi);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.a$a  reason: collision with other inner class name */
    public final class C0056a {
        public List<ShopModel> getMax;
        public boolean length;

        public final boolean getMin() {
            return this.length;
        }
    }

    public a(@JSONField(name = "density") int i, @JSONField(name = "dpi") int i2, @JSONField(name = "height") int i3, @JSONField(name = "width") int i4) {
        this.density = i;
        this.dpi = i2;
        this.height = i3;
        this.width = i4;
    }

    public final int getDensity() {
        return this.density;
    }

    public final int getDpi() {
        return this.dpi;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @NotNull
    public final String densityAndroid() {
        switch (this.dpi) {
            case 120:
                return "LDPI";
            case BlobStatic.MONITOR_IMAGE_WIDTH /*160*/:
                return "MDPI";
            case 213:
            case 240:
                return "HDPI";
            case 260:
            case 280:
            case 300:
                return "HDPI - XHDPI";
            case 320:
                return "XHDPI";
            case 340:
            case AUScreenAdaptTool.WIDTH_BASE /*360*/:
            case 400:
            case 420:
            case 440:
                return "XHDPI - XXHDPI";
            case 480:
                return "XXHDPI";
            default:
                return "UNKNOWN";
        }
    }

    public final int hashCode() {
        return (((((Integer.valueOf(this.density).hashCode() * 31) + Integer.valueOf(this.dpi).hashCode()) * 31) + Integer.valueOf(this.height).hashCode()) * 31) + Integer.valueOf(this.width).hashCode();
    }
}
