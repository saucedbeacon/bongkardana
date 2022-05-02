package org.mozilla.classfile;

import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.savings.activity.SavingsActivity;
import java.util.Arrays;
import kotlin.UShort;
import o.SecureFrameLayout;
import o.SecureMoneyKeyboard;
import o.dispatchOnCancelled;
import o.getLogs;
import o.initTtsIfTalkBack;
import o.onCancelLoad;
import o.onCanceled;
import o.setEventListener;
import o.switchOff;

public class ClassFileWriter {
    private static final int equals;
    private static final int toFloatRange;
    private static final boolean values;
    private int FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public short Grayscale$Algorithm;
    private short ICustomTabsCallback;
    private char[] ICustomTabsCallback$Default = new char[64];
    /* access modifiers changed from: private */
    public int IsOverlapping = 0;
    private getLogs Mean$Arithmetic = new getLogs();
    private int asBinder = 0;
    private getLogs asInterface;
    private short b;
    /* access modifiers changed from: private */
    public short create;
    private getLogs extraCallback;
    private long[] extraCallbackWithResult;
    private short getCause;
    public SecureMoneyKeyboard getMax;
    public short getMin;
    /* access modifiers changed from: private */
    public int hashCode;
    private setEventListener invoke;
    /* access modifiers changed from: private */
    public short invokeSuspend;
    public getLogs isInside = new getLogs();
    public String length;
    private int[] onMessageChannelReady;
    private getLogs onNavigationEvent = new getLogs();
    private int onPostMessage;
    private int onRelationshipValidationResult;
    public switchOff setMax = null;
    public int setMin;
    private int[] toDoubleRange;
    /* access modifiers changed from: private */
    public int[] toIntRange = null;
    /* access modifiers changed from: private */
    public initTtsIfTalkBack[] toString;
    /* access modifiers changed from: private */
    public byte[] valueOf = new byte[256];

    static /* synthetic */ int toFloatRange(ClassFileWriter classFileWriter) {
        int i = classFileWriter.hashCode;
        classFileWriter.hashCode = i - 1;
        return i;
    }

    public static class ClassFileFormatException extends RuntimeException {
        private static final long serialVersionUID = 1263998431033790599L;

        ClassFileFormatException(String str) {
            super(str);
        }
    }

    public ClassFileWriter(String str, String str2, String str3) {
        this.length = str;
        SecureMoneyKeyboard secureMoneyKeyboard = new SecureMoneyKeyboard(this);
        this.getMax = secureMoneyKeyboard;
        this.create = secureMoneyKeyboard.length(str);
        this.getCause = this.getMax.length(str2);
        if (str3 != null) {
            this.b = this.getMax.setMin(str3);
        }
        this.ICustomTabsCallback = 33;
    }

    public static String getMax(String str) {
        return str.replace('.', '/');
    }

    public static String length(String str) {
        int length2 = str.length();
        int i = length2 + 1;
        int i2 = i + 1;
        char[] cArr = new char[i2];
        cArr[0] = 'L';
        cArr[i] = ';';
        str.getChars(0, length2, cArr, 1);
        for (int i3 = 1; i3 != i; i3++) {
            if (cArr[i3] == '.') {
                cArr[i3] = '/';
            }
        }
        return new String(cArr, 0, i2);
    }

    public final void setMax(String str, String str2, short s) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-438422644, oncanceled);
            onCancelLoad.getMin(-438422644, oncanceled);
        }
        this.onNavigationEvent.add(new SecureFrameLayout.SendAccessiBilityEventListener(this.getMax.setMin(str), this.getMax.setMin(str2), s));
    }

    public final void length(String str, String str2, int i, int i2) {
        int[] iArr = {this.getMax.setMin(str), this.getMax.setMin(str2), i, i2};
        if (this.extraCallback == null) {
            this.extraCallback = new getLogs();
        }
        this.extraCallback.add(iArr);
    }

    public final void getMin(String str, String str2, short s) {
        this.invoke = new setEventListener(str, this.getMax.setMin(str), str2, this.getMax.setMin(str2), s);
        this.setMax = new switchOff();
        this.Mean$Arithmetic.add(this.invoke);
        IsOverlapping(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0297  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(short r18) {
        /*
            r17 = this;
            r0 = r17
            o.setEventListener r1 = r0.invoke
            if (r1 == 0) goto L_0x029f
            r17.length()
            r1 = r18
            r0.invokeSuspend = r1
            boolean r1 = values
            if (r1 == 0) goto L_0x001d
            r17.IsOverlapping()
            org.mozilla.classfile.ClassFileWriter$setMin r1 = new org.mozilla.classfile.ClassFileWriter$setMin
            r1.<init>()
            r1.setMax()
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            int[] r3 = r0.toDoubleRange
            r4 = 0
            if (r3 == 0) goto L_0x002a
            int r3 = r0.FastBitmap$CoordinateSystem
            int r3 = r3 * 4
            int r3 = r3 + 8
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            o.getLogs r5 = r0.extraCallback
            if (r5 == 0) goto L_0x0038
            int r5 = r5.size()
            int r5 = r5 * 10
            int r5 = r5 + 8
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0066
            o.SecureMoneyKeyboard$1[] r9 = r1.setMax
            int r9 = r9.length
            int r9 = r9 - r8
            org.mozilla.classfile.ClassFileWriter r10 = org.mozilla.classfile.ClassFileWriter.this
            short r10 = r10.invokeSuspend
            int r10 = r10 * 3
            int r10 = r10 + 7
            org.mozilla.classfile.ClassFileWriter r11 = org.mozilla.classfile.ClassFileWriter.this
            short r11 = r11.Grayscale$Algorithm
            int r11 = r11 * 3
            int r10 = r10 + r11
            int r9 = r9 * r10
            byte[] r9 = new byte[r9]
            r1.length = r9
            r1.setMin()
            int r9 = r1.getMin
            int r9 = r9 + r7
            if (r9 <= 0) goto L_0x0066
            int r9 = r9 + 6
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            int r10 = r0.setMin
            int r10 = r10 + 14
            int r10 = r10 + r7
            int r11 = r0.hashCode
            int r11 = r11 * 8
            int r10 = r10 + r11
            int r10 = r10 + r7
            int r10 = r10 + r3
            int r10 = r10 + r5
            int r10 = r10 + r9
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r10 > r3) goto L_0x0297
            byte[] r3 = new byte[r10]
            o.SecureMoneyKeyboard r5 = r0.getMax
            java.lang.String r11 = "Code"
            short r5 = r5.setMin((java.lang.String) r11)
            int r11 = r5 >>> 8
            byte r11 = (byte) r11
            r3[r4] = r11
            byte r5 = (byte) r5
            r3[r8] = r5
            int r10 = r10 + -6
            int r5 = getMax((int) r10, (byte[]) r3, (int) r7)
            short r10 = r0.Grayscale$Algorithm
            int r11 = r5 + 0
            int r12 = r10 >>> 8
            byte r12 = (byte) r12
            r3[r11] = r12
            int r11 = r5 + 1
            byte r10 = (byte) r10
            r3[r11] = r10
            int r5 = r5 + r7
            short r10 = r0.invokeSuspend
            int r11 = r5 + 0
            int r12 = r10 >>> 8
            byte r12 = (byte) r12
            r3[r11] = r12
            int r11 = r5 + 1
            byte r10 = (byte) r10
            r3[r11] = r10
            int r5 = r5 + r7
            int r10 = r0.setMin
            int r5 = getMax((int) r10, (byte[]) r3, (int) r5)
            byte[] r10 = r0.valueOf
            int r11 = r0.setMin
            java.lang.System.arraycopy(r10, r4, r3, r5, r11)
            int r10 = r0.setMin
            int r5 = r5 + r10
            int r10 = r0.hashCode
            if (r10 <= 0) goto L_0x0147
            int r11 = r5 + 0
            int r12 = r10 >>> 8
            byte r12 = (byte) r12
            r3[r11] = r12
            int r11 = r5 + 1
            byte r10 = (byte) r10
            r3[r11] = r10
            int r5 = r5 + r7
            r10 = 0
        L_0x00d1:
            int r11 = r0.hashCode
            if (r10 >= r11) goto L_0x0150
            o.initTtsIfTalkBack[] r11 = r0.toString
            r11 = r11[r10]
            int r12 = r11.getMax
            int r12 = r0.toIntRange((int) r12)
            short r12 = (short) r12
            int r13 = r11.setMin
            int r13 = r0.toIntRange((int) r13)
            short r13 = (short) r13
            int r14 = r11.length
            int r14 = r0.toIntRange((int) r14)
            short r14 = (short) r14
            short r11 = r11.getMin
            r15 = -1
            if (r12 == r15) goto L_0x013f
            if (r13 == r15) goto L_0x0137
            if (r14 == r15) goto L_0x012f
            int r15 = r5 + 0
            int r2 = r12 >>> 8
            byte r2 = (byte) r2
            r3[r15] = r2
            int r2 = r5 + 1
            byte r12 = (byte) r12
            r3[r2] = r12
            int r5 = r5 + 2
            int r2 = r5 + 0
            int r12 = r13 >>> 8
            byte r12 = (byte) r12
            r3[r2] = r12
            int r2 = r5 + 1
            byte r12 = (byte) r13
            r3[r2] = r12
            int r5 = r5 + r7
            int r2 = r5 + 0
            int r12 = r14 >>> 8
            byte r12 = (byte) r12
            r3[r2] = r12
            int r2 = r5 + 1
            byte r12 = (byte) r14
            r3[r2] = r12
            int r5 = r5 + r7
            int r2 = r5 + 0
            int r12 = r11 >>> 8
            byte r12 = (byte) r12
            r3[r2] = r12
            int r2 = r5 + 1
            byte r11 = (byte) r11
            r3[r2] = r11
            int r5 = r5 + r7
            int r10 = r10 + 1
            goto L_0x00d1
        L_0x012f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "handler label not defined"
            r1.<init>(r2)
            throw r1
        L_0x0137:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "end label not defined"
            r1.<init>(r2)
            throw r1
        L_0x013f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "start label not defined"
            r1.<init>(r2)
            throw r1
        L_0x0147:
            int r2 = r5 + 0
            r3[r2] = r4
            int r2 = r5 + 1
            r3[r2] = r4
            int r5 = r5 + r7
        L_0x0150:
            int[] r2 = r0.toDoubleRange
            if (r2 == 0) goto L_0x0156
            r2 = 1
            goto L_0x0157
        L_0x0156:
            r2 = 0
        L_0x0157:
            o.getLogs r10 = r0.extraCallback
            if (r10 == 0) goto L_0x015d
            int r2 = r2 + 1
        L_0x015d:
            if (r9 <= 0) goto L_0x0161
            int r2 = r2 + 1
        L_0x0161:
            int r10 = r5 + 0
            int r11 = r2 >>> 8
            byte r11 = (byte) r11
            r3[r10] = r11
            int r10 = r5 + 1
            byte r2 = (byte) r2
            r3[r10] = r2
            int r5 = r5 + r7
            int[] r2 = r0.toDoubleRange
            if (r2 == 0) goto L_0x01b1
            o.SecureMoneyKeyboard r2 = r0.getMax
            java.lang.String r10 = "LineNumberTable"
            short r2 = r2.setMin((java.lang.String) r10)
            int r10 = r5 + 0
            int r11 = r2 >>> 8
            byte r11 = (byte) r11
            r3[r10] = r11
            int r10 = r5 + 1
            byte r2 = (byte) r2
            r3[r10] = r2
            int r5 = r5 + 2
            int r2 = r0.FastBitmap$CoordinateSystem
            int r2 = r2 * 4
            int r2 = r2 + r7
            int r2 = getMax((int) r2, (byte[]) r3, (int) r5)
            int r5 = r0.FastBitmap$CoordinateSystem
            int r10 = r2 + 0
            int r11 = r5 >>> 8
            byte r11 = (byte) r11
            r3[r10] = r11
            int r10 = r2 + 1
            byte r5 = (byte) r5
            r3[r10] = r5
            int r2 = r2 + r7
            r5 = r2
            r2 = 0
        L_0x01a2:
            int r10 = r0.FastBitmap$CoordinateSystem
            if (r2 >= r10) goto L_0x01b1
            int[] r10 = r0.toDoubleRange
            r10 = r10[r2]
            int r5 = getMax((int) r10, (byte[]) r3, (int) r5)
            int r2 = r2 + 1
            goto L_0x01a2
        L_0x01b1:
            o.getLogs r2 = r0.extraCallback
            if (r2 == 0) goto L_0x0241
            o.SecureMoneyKeyboard r2 = r0.getMax
            java.lang.String r10 = "LocalVariableTable"
            short r2 = r2.setMin((java.lang.String) r10)
            int r10 = r5 + 0
            int r11 = r2 >>> 8
            byte r11 = (byte) r11
            r3[r10] = r11
            int r10 = r5 + 1
            byte r2 = (byte) r2
            r3[r10] = r2
            int r5 = r5 + 2
            o.getLogs r2 = r0.extraCallback
            int r2 = r2.size()
            int r10 = r2 * 10
            int r10 = r10 + r7
            int r5 = getMax((int) r10, (byte[]) r3, (int) r5)
            int r10 = r5 + 0
            int r11 = r2 >>> 8
            byte r11 = (byte) r11
            r3[r10] = r11
            int r10 = r5 + 1
            byte r11 = (byte) r2
            r3[r10] = r11
            int r5 = r5 + r7
            r10 = 0
        L_0x01e6:
            if (r10 >= r2) goto L_0x0241
            o.getLogs r11 = r0.extraCallback
            java.lang.Object r11 = r11.get(r10)
            int[] r11 = (int[]) r11
            r12 = r11[r4]
            r13 = r11[r8]
            r14 = r11[r7]
            r11 = r11[r6]
            int r15 = r0.setMin
            int r15 = r15 - r14
            int r16 = r5 + 0
            int r6 = r14 >>> 8
            byte r6 = (byte) r6
            r3[r16] = r6
            int r6 = r5 + 1
            byte r14 = (byte) r14
            r3[r6] = r14
            int r5 = r5 + 2
            int r6 = r5 + 0
            int r14 = r15 >>> 8
            byte r14 = (byte) r14
            r3[r6] = r14
            int r6 = r5 + 1
            byte r14 = (byte) r15
            r3[r6] = r14
            int r5 = r5 + r7
            int r6 = r5 + 0
            int r14 = r12 >>> 8
            byte r14 = (byte) r14
            r3[r6] = r14
            int r6 = r5 + 1
            byte r12 = (byte) r12
            r3[r6] = r12
            int r5 = r5 + r7
            int r6 = r5 + 0
            int r12 = r13 >>> 8
            byte r12 = (byte) r12
            r3[r6] = r12
            int r6 = r5 + 1
            byte r12 = (byte) r13
            r3[r6] = r12
            int r5 = r5 + r7
            int r6 = r5 + 0
            int r12 = r11 >>> 8
            byte r12 = (byte) r12
            r3[r6] = r12
            int r6 = r5 + 1
            byte r11 = (byte) r11
            r3[r6] = r11
            int r5 = r5 + r7
            int r10 = r10 + 1
            r6 = 3
            goto L_0x01e6
        L_0x0241:
            if (r9 <= 0) goto L_0x0277
            o.SecureMoneyKeyboard r2 = r0.getMax
            java.lang.String r6 = "StackMapTable"
            short r2 = r2.setMin((java.lang.String) r6)
            int r6 = r5 + 0
            int r9 = r2 >>> 8
            byte r9 = (byte) r9
            r3[r6] = r9
            int r6 = r5 + 1
            byte r2 = (byte) r2
            r3[r6] = r2
            int r5 = r5 + r7
            int r2 = r1.getMin
            int r2 = r2 + r7
            int r2 = getMax((int) r2, (byte[]) r3, (int) r5)
            o.SecureMoneyKeyboard$1[] r5 = r1.setMax
            int r5 = r5.length
            int r5 = r5 - r8
            int r6 = r2 + 0
            int r8 = r5 >>> 8
            byte r8 = (byte) r8
            r3[r6] = r8
            int r6 = r2 + 1
            byte r5 = (byte) r5
            r3[r6] = r5
            int r2 = r2 + r7
            byte[] r5 = r1.length
            int r1 = r1.getMin
            java.lang.System.arraycopy(r5, r4, r3, r2, r1)
        L_0x0277:
            o.setEventListener r1 = r0.invoke
            r1.equals = r3
            r1 = 0
            r0.toString = r1
            r0.hashCode = r4
            r0.FastBitmap$CoordinateSystem = r4
            r0.setMin = r4
            r0.invoke = r1
            r0.Grayscale$Algorithm = r4
            r0.getMin = r4
            r0.onRelationshipValidationResult = r4
            r0.onPostMessage = r4
            r0.extraCallback = r1
            r0.toIntRange = r1
            r0.IsOverlapping = r4
            r0.setMax = r1
            return
        L_0x0297:
            org.mozilla.classfile.ClassFileWriter$ClassFileFormatException r1 = new org.mozilla.classfile.ClassFileWriter$ClassFileFormatException
            java.lang.String r2 = "generated bytecode for method exceeds 64K limit."
            r1.<init>(r2)
            throw r1
        L_0x029f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No method to stop"
            r1.<init>(r2)
            goto L_0x02a8
        L_0x02a7:
            throw r1
        L_0x02a8:
            goto L_0x02a7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.setMin(short):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r12 < 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r12 >= 65536) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r12 < 256) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        r10.valueOf[toString(1)] = -60;
        r10.valueOf[toString(1)] = (byte) r11;
        r11 = toString(2);
        r1 = r10.valueOf;
        r1[r11 + 0] = (byte) (r12 >>> 8);
        r1[r11 + 1] = (byte) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        r10.valueOf[toString(1)] = (byte) r11;
        r10.valueOf[toString(1)] = (byte) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        throw new org.mozilla.classfile.ClassFileWriter.ClassFileFormatException("out of range variable");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(int r11, int r12) {
        /*
            r10 = this;
            short r0 = r10.getMin
            int r1 = FastBitmap$CoordinateSystem((int) r11)
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x000d
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r1 >= r0) goto L_0x0010
        L_0x000d:
            values(r0)
        L_0x0010:
            r1 = 180(0xb4, float:2.52E-43)
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 2
            r4 = 1
            if (r11 == r1) goto L_0x0210
            r1 = 181(0xb5, float:2.54E-43)
            if (r11 == r1) goto L_0x0210
            r1 = 188(0xbc, float:2.63E-43)
            java.lang.String r5 = "out of range index"
            r6 = 256(0x100, float:3.59E-43)
            if (r11 == r1) goto L_0x01f3
            r1 = 198(0xc6, float:2.77E-43)
            if (r11 == r1) goto L_0x0126
            r1 = 199(0xc7, float:2.79E-43)
            if (r11 == r1) goto L_0x0126
            switch(r11) {
                case 16: goto L_0x0107;
                case 17: goto L_0x00e0;
                case 18: goto L_0x008e;
                case 19: goto L_0x008e;
                case 20: goto L_0x008e;
                case 21: goto L_0x0046;
                case 22: goto L_0x0046;
                case 23: goto L_0x0046;
                case 24: goto L_0x0046;
                case 25: goto L_0x0046;
                default: goto L_0x002f;
            }
        L_0x002f:
            switch(r11) {
                case 54: goto L_0x0046;
                case 55: goto L_0x0046;
                case 56: goto L_0x0046;
                case 57: goto L_0x0046;
                case 58: goto L_0x0046;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r11) {
                case 153: goto L_0x0126;
                case 154: goto L_0x0126;
                case 155: goto L_0x0126;
                case 156: goto L_0x0126;
                case 157: goto L_0x0126;
                case 158: goto L_0x0126;
                case 159: goto L_0x0126;
                case 160: goto L_0x0126;
                case 161: goto L_0x0126;
                case 162: goto L_0x0126;
                case 163: goto L_0x0126;
                case 164: goto L_0x0126;
                case 165: goto L_0x0126;
                case 166: goto L_0x0126;
                case 167: goto L_0x003d;
                case 168: goto L_0x0126;
                case 169: goto L_0x0046;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Unexpected opcode for 1 operand"
            r11.<init>(r12)
            throw r11
        L_0x003d:
            int r1 = r10.setMin
            int r1 = r1 + 3
            r10.IsOverlapping((int) r1)
            goto L_0x0126
        L_0x0046:
            if (r12 < 0) goto L_0x0086
            if (r12 >= r2) goto L_0x0086
            if (r12 < r6) goto L_0x0072
            int r1 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            r5 = -60
            r2[r1] = r5
            int r1 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            byte r11 = (byte) r11
            r2[r1] = r11
            int r11 = r10.toString(r3)
            byte[] r1 = r10.valueOf
            int r2 = r11 + 0
            int r3 = r12 >>> 8
            byte r3 = (byte) r3
            r1[r2] = r3
            int r11 = r11 + r4
            byte r12 = (byte) r12
            r1[r11] = r12
            goto L_0x022e
        L_0x0072:
            int r1 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            byte r11 = (byte) r11
            r2[r1] = r11
            int r11 = r10.toString(r4)
            byte[] r1 = r10.valueOf
            byte r12 = (byte) r12
            r1[r11] = r12
            goto L_0x022e
        L_0x0086:
            org.mozilla.classfile.ClassFileWriter$ClassFileFormatException r11 = new org.mozilla.classfile.ClassFileWriter$ClassFileFormatException
            java.lang.String r12 = "out of range variable"
            r11.<init>(r12)
            throw r11
        L_0x008e:
            if (r12 < 0) goto L_0x00da
            if (r12 >= r2) goto L_0x00da
            r1 = 19
            if (r12 >= r6) goto L_0x00b1
            if (r11 == r1) goto L_0x00b1
            r2 = 20
            if (r11 != r2) goto L_0x009d
            goto L_0x00b1
        L_0x009d:
            int r1 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            byte r11 = (byte) r11
            r2[r1] = r11
            int r11 = r10.toString(r4)
            byte[] r1 = r10.valueOf
            byte r12 = (byte) r12
            r1[r11] = r12
            goto L_0x022e
        L_0x00b1:
            r2 = 18
            if (r11 != r2) goto L_0x00be
            int r11 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            r2[r11] = r1
            goto L_0x00c7
        L_0x00be:
            int r1 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            byte r11 = (byte) r11
            r2[r1] = r11
        L_0x00c7:
            int r11 = r10.toString(r3)
            byte[] r1 = r10.valueOf
            int r2 = r11 + 0
            int r3 = r12 >>> 8
            byte r3 = (byte) r3
            r1[r2] = r3
            int r11 = r11 + r4
            byte r12 = (byte) r12
            r1[r11] = r12
            goto L_0x022e
        L_0x00da:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        L_0x00e0:
            short r1 = (short) r12
            if (r1 != r12) goto L_0x00ff
            int r1 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            byte r11 = (byte) r11
            r2[r1] = r11
            int r11 = r10.toString(r3)
            byte[] r1 = r10.valueOf
            int r2 = r11 + 0
            int r3 = r12 >>> 8
            byte r3 = (byte) r3
            r1[r2] = r3
            int r11 = r11 + r4
            byte r12 = (byte) r12
            r1[r11] = r12
            goto L_0x022e
        L_0x00ff:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "out of range short"
            r11.<init>(r12)
            throw r11
        L_0x0107:
            byte r1 = (byte) r12
            if (r1 != r12) goto L_0x011e
            int r12 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            byte r11 = (byte) r11
            r2[r12] = r11
            int r11 = r10.toString(r4)
            byte[] r12 = r10.valueOf
            byte r1 = (byte) r1
            r12[r11] = r1
            goto L_0x022e
        L_0x011e:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "out of range byte"
            r11.<init>(r12)
            throw r11
        L_0x0126:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r12 & r1
            if (r2 == r1) goto L_0x013c
            if (r12 < 0) goto L_0x0134
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r12 > r5) goto L_0x0134
            goto L_0x013c
        L_0x0134:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Bad label for branch"
            r11.<init>(r12)
            throw r11
        L_0x013c:
            int r5 = r10.setMin
            int r6 = r10.toString(r4)
            byte[] r7 = r10.valueOf
            byte r11 = (byte) r11
            r7[r6] = r11
            if (r2 == r1) goto L_0x0165
            int r11 = r10.toString(r3)
            byte[] r1 = r10.valueOf
            int r2 = r11 + 0
            int r3 = r12 >>> 8
            byte r3 = (byte) r3
            r1[r2] = r3
            int r11 = r11 + r4
            byte r2 = (byte) r12
            r1[r11] = r2
            int r12 = r12 + r5
            r10.IsOverlapping((int) r12)
            o.switchOff r11 = r10.setMax
            r11.put((int) r12, (int) r5)
            goto L_0x022e
        L_0x0165:
            int r11 = r10.toIntRange((int) r12)
            r1 = -1
            if (r11 == r1) goto L_0x0189
            int r12 = r11 - r5
            int r1 = r10.toString(r3)
            byte[] r2 = r10.valueOf
            int r3 = r1 + 0
            int r6 = r12 >>> 8
            byte r6 = (byte) r6
            r2[r3] = r6
            int r1 = r1 + r4
            byte r12 = (byte) r12
            r2[r1] = r12
            r10.IsOverlapping((int) r11)
            o.switchOff r12 = r10.setMax
            r12.put((int) r11, (int) r5)
            goto L_0x022e
        L_0x0189:
            int r5 = r5 + r4
            int r11 = o.dispatchOnCancelled.setMax(r12)
            if (r12 == r11) goto L_0x019e
            o.onCanceled r1 = new o.onCanceled
            r1.<init>(r12, r11, r4)
            r11 = 610888951(0x24696cf7, float:5.0616118E-17)
            o.onCancelLoad.setMax(r11, r1)
            o.onCancelLoad.getMin(r11, r1)
        L_0x019e:
            if (r12 >= 0) goto L_0x01eb
            r11 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r12
            int r12 = r10.onRelationshipValidationResult
            if (r11 >= r12) goto L_0x01e3
            int r12 = r10.onPostMessage
            long[] r1 = r10.extraCallbackWithResult
            r2 = 0
            if (r1 == 0) goto L_0x01b2
            int r1 = r1.length
            if (r12 != r1) goto L_0x01c7
        L_0x01b2:
            long[] r1 = r10.extraCallbackWithResult
            if (r1 != 0) goto L_0x01bd
            r1 = 40
            long[] r1 = new long[r1]
            r10.extraCallbackWithResult = r1
            goto L_0x01c7
        L_0x01bd:
            int r6 = r1.length
            int r6 = r6 * 2
            long[] r6 = new long[r6]
            java.lang.System.arraycopy(r1, r2, r6, r2, r12)
            r10.extraCallbackWithResult = r6
        L_0x01c7:
            int r1 = r12 + 1
            r10.onPostMessage = r1
            long[] r1 = r10.extraCallbackWithResult
            long r6 = (long) r11
            r11 = 32
            long r6 = r6 << r11
            long r8 = (long) r5
            long r6 = r6 | r8
            r1[r12] = r6
            int r11 = r10.toString(r3)
            byte[] r12 = r10.valueOf
            int r1 = r11 + 0
            r12[r1] = r2
            int r11 = r11 + r4
            r12[r11] = r2
            goto L_0x022e
        L_0x01e3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Bad label"
            r11.<init>(r12)
            throw r11
        L_0x01eb:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Bad label, no biscuit"
            r11.<init>(r12)
            throw r11
        L_0x01f3:
            if (r12 < 0) goto L_0x020a
            if (r12 >= r6) goto L_0x020a
            int r1 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            byte r11 = (byte) r11
            r2[r1] = r11
            int r11 = r10.toString(r4)
            byte[] r1 = r10.valueOf
            byte r12 = (byte) r12
            r1[r11] = r12
            goto L_0x022e
        L_0x020a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r5)
            throw r11
        L_0x0210:
            if (r12 < 0) goto L_0x0238
            if (r12 >= r2) goto L_0x0238
            int r1 = r10.toString(r4)
            byte[] r2 = r10.valueOf
            byte r11 = (byte) r11
            r2[r1] = r11
            int r11 = r10.toString(r3)
            byte[] r1 = r10.valueOf
            int r2 = r11 + 0
            int r3 = r12 >>> 8
            byte r3 = (byte) r3
            r1[r2] = r3
            int r11 = r11 + r4
            byte r12 = (byte) r12
            r1[r11] = r12
        L_0x022e:
            short r11 = (short) r0
            r10.getMin = r11
            short r12 = r10.Grayscale$Algorithm
            if (r0 <= r12) goto L_0x0237
            r10.Grayscale$Algorithm = r11
        L_0x0237:
            return
        L_0x0238:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "out of range field"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.setMin(int, int):void");
    }

    public final void getMin(int i) {
        if (i == 0) {
            setMax(3);
        } else if (i == 1) {
            setMax(4);
        } else if (i == 2) {
            setMax(5);
        } else if (i == 3) {
            setMax(6);
        } else if (i == 4) {
            setMax(7);
        } else if (i != 5) {
            SecureMoneyKeyboard secureMoneyKeyboard = this.getMax;
            secureMoneyKeyboard.setMin(5);
            byte[] bArr = secureMoneyKeyboard.equals;
            int i2 = secureMoneyKeyboard.getMin;
            secureMoneyKeyboard.getMin = i2 + 1;
            bArr[i2] = 3;
            secureMoneyKeyboard.getMin = getMax(i, secureMoneyKeyboard.equals, secureMoneyKeyboard.getMin);
            secureMoneyKeyboard.getMax.put(secureMoneyKeyboard.setMin, 3);
            int i3 = secureMoneyKeyboard.setMin;
            secureMoneyKeyboard.setMin = i3 + 1;
            setMin(18, (short) i3);
        } else {
            setMax(8);
        }
    }

    public final void setMax(String str) {
        SecureMoneyKeyboard secureMoneyKeyboard = this.getMax;
        short min = secureMoneyKeyboard.setMin(str) & UShort.MAX_VALUE;
        int i = secureMoneyKeyboard.setMax.getInt(min, -1);
        if (i == -1) {
            i = secureMoneyKeyboard.setMin;
            secureMoneyKeyboard.setMin = i + 1;
            secureMoneyKeyboard.setMin(3);
            byte[] bArr = secureMoneyKeyboard.equals;
            int i2 = secureMoneyKeyboard.getMin;
            secureMoneyKeyboard.getMin = i2 + 1;
            bArr[i2] = 8;
            byte[] bArr2 = secureMoneyKeyboard.equals;
            int i3 = secureMoneyKeyboard.getMin;
            bArr2[i3 + 0] = (byte) (min >>> 8);
            bArr2[i3 + 1] = (byte) min;
            secureMoneyKeyboard.getMin = i3 + 2;
            secureMoneyKeyboard.setMax.put((int) min, i);
        }
        secureMoneyKeyboard.getMax.put(i, 8);
        setMin(18, i);
    }

    public final void length(int i, String str) {
        int FastBitmap$CoordinateSystem2 = this.getMin + FastBitmap$CoordinateSystem(i);
        if (FastBitmap$CoordinateSystem2 < 0 || 32767 < FastBitmap$CoordinateSystem2) {
            values(FastBitmap$CoordinateSystem2);
        }
        if (i == 187 || i == 189 || i == 192 || i == 193) {
            short length2 = this.getMax.length(str);
            this.valueOf[toString(1)] = (byte) i;
            int classFileWriter = toString(2);
            byte[] bArr = this.valueOf;
            bArr[classFileWriter + 0] = (byte) (length2 >>> 8);
            bArr[classFileWriter + 1] = (byte) length2;
            short s = (short) FastBitmap$CoordinateSystem2;
            this.getMin = s;
            if (FastBitmap$CoordinateSystem2 > this.Grayscale$Algorithm) {
                this.Grayscale$Algorithm = s;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("bad opcode for class reference");
    }

    public final void getMin(int i, String str, String str2, String str3) {
        int i2;
        int FastBitmap$CoordinateSystem2 = this.getMin + FastBitmap$CoordinateSystem(i);
        char charAt = str3.charAt(0);
        int i3 = (charAt == 'J' || charAt == 'D') ? 2 : 1;
        switch (i) {
            case 178:
            case 180:
                i2 = FastBitmap$CoordinateSystem2 + i3;
                break;
            case 179:
            case 181:
                i2 = FastBitmap$CoordinateSystem2 - i3;
                break;
            default:
                throw new IllegalArgumentException("bad opcode for field reference");
        }
        if (i2 < 0 || 32767 < i2) {
            values(i2);
        }
        short max = this.getMax.getMax(str, str2, str3);
        this.valueOf[toString(1)] = (byte) i;
        int classFileWriter = toString(2);
        byte[] bArr = this.valueOf;
        bArr[classFileWriter + 0] = (byte) (max >>> 8);
        bArr[classFileWriter + 1] = (byte) max;
        short s = (short) i2;
        this.getMin = s;
        if (i2 > this.Grayscale$Algorithm) {
            this.Grayscale$Algorithm = s;
        }
    }

    public final void setMin(int i, String str, String str2, String str3) {
        int intRange = toIntRange(str3);
        int i2 = intRange >>> 16;
        int FastBitmap$CoordinateSystem2 = this.getMin + ((short) intRange) + FastBitmap$CoordinateSystem(i);
        if (FastBitmap$CoordinateSystem2 < 0 || 32767 < FastBitmap$CoordinateSystem2) {
            values(FastBitmap$CoordinateSystem2);
        }
        switch (i) {
            case 182:
            case 183:
            case 184:
            case WSContextConstant.HANDSHAKE_RECEIVE_SIZE:
                this.valueOf[toString(1)] = (byte) i;
                if (i == 185) {
                    short min = this.getMax.setMin(str, str2, str3);
                    int classFileWriter = toString(2);
                    byte[] bArr = this.valueOf;
                    bArr[classFileWriter + 0] = (byte) (min >>> 8);
                    bArr[classFileWriter + 1] = (byte) min;
                    this.valueOf[toString(1)] = (byte) (i2 + 1);
                    this.valueOf[toString(1)] = 0;
                } else {
                    short min2 = this.getMax.getMin(str, str2, str3);
                    int classFileWriter2 = toString(2);
                    byte[] bArr2 = this.valueOf;
                    bArr2[classFileWriter2 + 0] = (byte) (min2 >>> 8);
                    bArr2[classFileWriter2 + 1] = (byte) min2;
                }
                short s = (short) FastBitmap$CoordinateSystem2;
                this.getMin = s;
                if (FastBitmap$CoordinateSystem2 > this.Grayscale$Algorithm) {
                    this.Grayscale$Algorithm = s;
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException("bad opcode for method reference");
        }
    }

    public final void setMin(int i) {
        byte b2 = (byte) i;
        if (b2 != i) {
            short s = (short) i;
            if (s == i) {
                setMin(17, s);
            } else {
                getMin(i);
            }
        } else if (i == -1) {
            setMax(2);
        } else if (i < 0 || i > 5) {
            setMin(16, b2);
        } else {
            setMax((int) (byte) (i + 3));
        }
    }

    public final void length(double d) {
        if (d == 0.0d) {
            setMax(14);
            if (1.0d / d < 0.0d) {
                setMax(119);
            }
        } else if (d == 1.0d || d == -1.0d) {
            setMax(15);
            if (d < 0.0d) {
                setMax(119);
            }
        } else {
            SecureMoneyKeyboard secureMoneyKeyboard = this.getMax;
            secureMoneyKeyboard.setMin(9);
            byte[] bArr = secureMoneyKeyboard.equals;
            int i = secureMoneyKeyboard.getMin;
            secureMoneyKeyboard.getMin = i + 1;
            bArr[i] = 6;
            long doubleToLongBits = Double.doubleToLongBits(d);
            byte[] bArr2 = secureMoneyKeyboard.equals;
            secureMoneyKeyboard.getMin = getMax((int) doubleToLongBits, bArr2, getMax((int) (doubleToLongBits >>> 32), bArr2, secureMoneyKeyboard.getMin));
            int i2 = secureMoneyKeyboard.setMin;
            secureMoneyKeyboard.setMin += 2;
            secureMoneyKeyboard.getMax.put(i2, 6);
            setMin(20, i2);
        }
    }

    public final void getMin(String str) {
        int length2 = str.length();
        int i = 0;
        int max = SecureMoneyKeyboard.getMax(str, 0, length2);
        if (max == length2) {
            setMax(str);
            return;
        }
        length(187, "java/lang/StringBuilder");
        setMax(89);
        setMin(length2);
        setMin(183, "java/lang/StringBuilder", "<init>", "(I)V");
        while (true) {
            setMax(89);
            setMax(str.substring(i, max));
            setMin(182, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
            setMax(87);
            if (max != length2) {
                int i2 = max;
                max = SecureMoneyKeyboard.getMax(str, max, length2);
                i = i2;
            } else {
                setMin(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
                return;
            }
        }
    }

    public final void length(int i) {
        getMax(75, 58, i);
    }

    public final void getMax(int i) {
        getMax(42, 25, i);
    }

    public final void getMax(int i, int i2, int i3) {
        if (i3 == 0) {
            setMax(i);
        } else if (i3 == 1) {
            setMax(i + 1);
        } else if (i3 == 2) {
            setMax(i + 2);
        } else if (i3 != 3) {
            setMin(i2, i3);
        } else {
            setMax(i + 3);
        }
    }

    public final int getMin(int i, int i2) {
        if (i <= i2) {
            int FastBitmap$CoordinateSystem2 = this.getMin + FastBitmap$CoordinateSystem(170);
            if (FastBitmap$CoordinateSystem2 < 0 || 32767 < FastBitmap$CoordinateSystem2) {
                values(FastBitmap$CoordinateSystem2);
            }
            int i3 = (this.setMin ^ -1) & 3;
            int classFileWriter = toString(i3 + 1 + (((i2 - i) + 1 + 3) * 4));
            int i4 = classFileWriter + 1;
            this.valueOf[classFileWriter] = -86;
            while (i3 != 0) {
                this.valueOf[i4] = 0;
                i3--;
                i4++;
            }
            getMax(i2, this.valueOf, getMax(i, this.valueOf, i4 + 4));
            short s = (short) FastBitmap$CoordinateSystem2;
            this.getMin = s;
            if (FastBitmap$CoordinateSystem2 > this.Grayscale$Algorithm) {
                this.Grayscale$Algorithm = s;
            }
            return classFileWriter;
        }
        StringBuilder sb = new StringBuilder("Bad bounds: ");
        sb.append(i);
        sb.append(' ');
        sb.append(i2);
        throw new ClassFileFormatException(sb.toString());
    }

    public final void equals(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1721211499, oncanceled);
            onCancelLoad.getMin(1721211499, oncanceled);
        }
        IsOverlapping(this.setMin);
        this.setMax.put(this.setMin, i);
        setMax(i, -1, this.setMin);
    }

    public final void setMin(int i, int i2, int i3) {
        if (i3 < 0 || i3 > this.Grayscale$Algorithm) {
            throw new IllegalArgumentException("Bad stack index: ".concat(String.valueOf(i3)));
        }
        this.getMin = (short) i3;
        IsOverlapping(this.setMin);
        this.setMax.put(this.setMin, i);
        setMax(i, i2, this.setMin);
    }

    public final void setMax(int i, int i2, int i3) {
        if (i3 < 0 || i3 > this.setMin) {
            throw new IllegalArgumentException("Bad jump target: ".concat(String.valueOf(i3)));
        } else if (i2 >= -1) {
            int i4 = (i ^ -1) & 3;
            int i5 = i2 < 0 ? i + 1 + i4 : i + 1 + i4 + ((i2 + 3) * 4);
            if (i >= 0) {
                int i6 = this.setMin;
                if (i <= ((i6 - 16) - i4) - 1) {
                    byte[] bArr = this.valueOf;
                    if ((bArr[i] & 255) != 170) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        sb.append(" is not offset of tableswitch statement");
                        throw new IllegalArgumentException(sb.toString());
                    } else if (i5 < 0 || i5 + 4 > i6) {
                        throw new ClassFileFormatException("Too big case index: ".concat(String.valueOf(i2)));
                    } else {
                        getMax(i3 - i, bArr, i5);
                        return;
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(" is outside a possible range of tableswitch in already generated code");
            throw new IllegalArgumentException(sb2.toString());
        } else {
            throw new IllegalArgumentException("Bad case index: ".concat(String.valueOf(i2)));
        }
    }

    public final int getMax() {
        int i = this.onRelationshipValidationResult;
        int[] iArr = this.onMessageChannelReady;
        if (iArr == null || i == iArr.length) {
            int[] iArr2 = this.onMessageChannelReady;
            if (iArr2 == null) {
                this.onMessageChannelReady = new int[32];
            } else {
                int[] iArr3 = new int[(iArr2.length * 2)];
                System.arraycopy(iArr2, 0, iArr3, 0, i);
                this.onMessageChannelReady = iArr3;
            }
        }
        this.onRelationshipValidationResult = i + 1;
        this.onMessageChannelReady[i] = -1;
        return i | Integer.MIN_VALUE;
    }

    public final void toFloatRange(int i) {
        if (i < 0) {
            int i2 = i & Integer.MAX_VALUE;
            if (i2 <= this.onRelationshipValidationResult) {
                int[] iArr = this.onMessageChannelReady;
                if (iArr[i2] == -1) {
                    iArr[i2] = this.setMin;
                    return;
                }
                throw new IllegalStateException("Can only mark label once");
            }
            throw new IllegalArgumentException("Bad label");
        }
        throw new IllegalArgumentException("Bad label, no biscuit");
    }

    public final int toIntRange(int i) {
        if (i < 0) {
            int i2 = i & Integer.MAX_VALUE;
            if (i2 < this.onRelationshipValidationResult) {
                return this.onMessageChannelReady[i2];
            }
            throw new IllegalArgumentException("Bad label");
        }
        throw new IllegalArgumentException("Bad label, no biscuit");
    }

    private void length() {
        byte[] bArr = this.valueOf;
        int i = 0;
        while (i < this.onPostMessage) {
            long j = this.extraCallbackWithResult[i];
            int i2 = (int) j;
            int i3 = this.onMessageChannelReady[(int) (j >> 32)];
            if (i3 != -1) {
                IsOverlapping(i3);
                int i4 = i2 - 1;
                this.setMax.put(i3, i4);
                int i5 = i3 - i4;
                if (((short) i5) == i5) {
                    bArr[i2] = (byte) (i5 >> 8);
                    bArr[i2 + 1] = (byte) i5;
                    i++;
                } else {
                    throw new ClassFileFormatException("Program too complex: too big jump offset");
                }
            } else {
                throw new RuntimeException();
            }
        }
        this.onPostMessage = 0;
    }

    public final short getMin() {
        return this.getMin;
    }

    public final void setMin() {
        int i = this.getMin - 1;
        if (i < 0 || 32767 < i) {
            values(i);
        }
        short s = (short) i;
        this.getMin = s;
        if (i > this.Grayscale$Algorithm) {
            this.Grayscale$Algorithm = s;
        }
    }

    private int toString(int i) {
        if (this.invoke != null) {
            int i2 = this.setMin;
            int i3 = i + i2;
            byte[] bArr = this.valueOf;
            if (i3 > bArr.length) {
                int length2 = bArr.length * 2;
                if (i3 > length2) {
                    length2 = i3;
                }
                byte[] bArr2 = new byte[length2];
                System.arraycopy(this.valueOf, 0, bArr2, 0, i2);
                this.valueOf = bArr2;
            }
            this.setMin = i3;
            return i2;
        }
        throw new IllegalArgumentException("No method to add to");
    }

    public final void setMax(int i, int i2, int i3, String str) {
        short s;
        if ((i & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Bad startLabel");
        } else if ((i2 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Bad endLabel");
        } else if ((i3 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            if (str == null) {
                s = 0;
            } else {
                s = this.getMax.length(str);
            }
            initTtsIfTalkBack initttsiftalkback = new initTtsIfTalkBack(i, i2, i3, s);
            int i4 = this.hashCode;
            if (i4 == 0) {
                this.toString = new initTtsIfTalkBack[4];
            } else {
                initTtsIfTalkBack[] initttsiftalkbackArr = this.toString;
                if (i4 == initttsiftalkbackArr.length) {
                    initTtsIfTalkBack[] initttsiftalkbackArr2 = new initTtsIfTalkBack[(i4 * 2)];
                    System.arraycopy(initttsiftalkbackArr, 0, initttsiftalkbackArr2, 0, i4);
                    this.toString = initttsiftalkbackArr2;
                }
            }
            this.toString[i4] = initttsiftalkback;
            this.hashCode = i4 + 1;
        } else {
            throw new IllegalArgumentException("Bad handlerLabel");
        }
    }

    public final void getMax(short s) {
        if (this.invoke != null) {
            int i = this.FastBitmap$CoordinateSystem;
            if (i == 0) {
                this.toDoubleRange = new int[16];
            } else {
                int[] iArr = this.toDoubleRange;
                if (i == iArr.length) {
                    int[] iArr2 = new int[(i * 2)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    this.toDoubleRange = iArr2;
                }
            }
            this.toDoubleRange[i] = (this.setMin << 16) + s;
            this.FastBitmap$CoordinateSystem = i + 1;
            return;
        }
        throw new IllegalArgumentException("No method to stop");
    }

    public final class setMin {
        private int IsOverlapping = 0;
        private int[] equals = null;
        int getMin = 0;
        private SecureMoneyKeyboard.AnonymousClass1[] isInside = null;
        byte[] length = null;
        SecureMoneyKeyboard.AnonymousClass1[] setMax = null;
        private int[] setMin = null;
        private int toFloatRange = 0;
        private int toIntRange = 0;
        private SecureMoneyKeyboard.AnonymousClass1[] toString;
        private boolean values = false;

        private static boolean getMin(int i) {
            switch (i) {
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case BlobStatic.MONITOR_IMAGE_WIDTH:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                    return true;
                default:
                    switch (i) {
                        case 198:
                        case SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR:
                        case 200:
                            return true;
                        default:
                            return false;
                    }
            }
        }

        private static boolean length(int i) {
            if (i == 167 || i == 191 || i == 200 || i == 176 || i == 177) {
                return true;
            }
            switch (i) {
                case 170:
                case 171:
                case 172:
                case 173:
                case 174:
                    return true;
                default:
                    return false;
            }
        }

        setMin() {
        }

        /* access modifiers changed from: package-private */
        public final void setMax() {
            SecureMoneyKeyboard.AnonymousClass1 max;
            int i;
            this.setMax = new SecureMoneyKeyboard.AnonymousClass1[ClassFileWriter.this.IsOverlapping];
            int[] min = ClassFileWriter.setMin(ClassFileWriter.this);
            for (int i2 = 0; i2 < ClassFileWriter.this.IsOverlapping; i2++) {
                int i3 = ClassFileWriter.this.toIntRange[i2];
                if (i2 == ClassFileWriter.this.IsOverlapping - 1) {
                    i = ClassFileWriter.this.setMin;
                } else {
                    i = ClassFileWriter.this.toIntRange[i2 + 1];
                }
                this.setMax[i2] = new Object(i2, i3, i, min) {
                    public boolean IsOverlapping;
                    public int getMax;
                    public int getMin;
                    public int[] length;
                    public int setMax;
                    public int[] setMin;
                    public boolean toIntRange;

                    public final int[] getMax(
/*
Method generation error in method: o.SecureMoneyKeyboard.1.getMax():int[], dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureMoneyKeyboard.1.getMax():int[], class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    public final boolean setMin(
/*
Method generation error in method: o.SecureMoneyKeyboard.1.setMin(int[], int, int[], int, o.SecureMoneyKeyboard):boolean, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureMoneyKeyboard.1.setMin(int[], int, int[], int, o.SecureMoneyKeyboard):boolean, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    private static boolean getMin(
/*
Method generation error in method: o.SecureMoneyKeyboard.1.getMin(int[], int[], int, o.SecureMoneyKeyboard):boolean, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureMoneyKeyboard.1.getMin(int[], int[], int, o.SecureMoneyKeyboard):boolean, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    public final java.lang.String toString(
/*
Method generation error in method: o.SecureMoneyKeyboard.1.toString():java.lang.String, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureMoneyKeyboard.1.toString():java.lang.String, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    public final boolean setMax(
/*
Method generation error in method: o.SecureMoneyKeyboard.1.setMax():boolean, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureMoneyKeyboard.1.setMax():boolean, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    public final boolean length(
/*
Method generation error in method: o.SecureMoneyKeyboard.1.length():boolean, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureMoneyKeyboard.1.length():boolean, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
            }
            SecureMoneyKeyboard.AnonymousClass1[] r0 = new SecureMoneyKeyboard.AnonymousClass1[this.setMax.length];
            for (int i4 = 0; i4 < ClassFileWriter.this.hashCode; i4++) {
                initTtsIfTalkBack initttsiftalkback = ClassFileWriter.this.toString[i4];
                r0[setMax((int) (short) ClassFileWriter.this.toIntRange(initttsiftalkback.length)).setMax] = setMax((int) (short) ClassFileWriter.this.toIntRange(initttsiftalkback.getMax));
            }
            int[] keys = ClassFileWriter.this.setMax.getKeys();
            for (int i5 : keys) {
                r0[setMax(i5).setMax] = setMax(ClassFileWriter.this.setMax.getInt(i5, -1));
            }
            this.toString = r0;
            int[] min2 = ClassFileWriter.setMin(ClassFileWriter.this);
            this.setMax[0].setMin(min2, min2.length, new int[0], 0, ClassFileWriter.this.getMax);
            this.isInside = new SecureMoneyKeyboard.AnonymousClass1[]{this.setMax[0]};
            this.toIntRange = 1;
            getMin();
            int i6 = 0;
            while (true) {
                SecureMoneyKeyboard.AnonymousClass1[] r2 = this.setMax;
                if (i6 < r2.length) {
                    SecureMoneyKeyboard.AnonymousClass1 r22 = r2[i6];
                    if (!r22.setMax()) {
                        int[] iArr = new int[0];
                        int[] iArr2 = {((ClassFileWriter.this.getMax.length("java/lang/Throwable") & UShort.MAX_VALUE) << 8) | 7};
                        int i7 = 0;
                        while (true) {
                            if (i7 >= ClassFileWriter.this.hashCode) {
                                break;
                            }
                            initTtsIfTalkBack initttsiftalkback2 = ClassFileWriter.this.toString[i7];
                            int intRange = ClassFileWriter.this.toIntRange(initttsiftalkback2.getMax);
                            int intRange2 = ClassFileWriter.this.toIntRange(initttsiftalkback2.setMin);
                            max = setMax(ClassFileWriter.this.toIntRange(initttsiftalkback2.length));
                            if ((r22.getMax <= intRange || r22.getMax >= intRange2) && (intRange <= r22.getMax || intRange >= r22.getMin || !max.setMax())) {
                                i7++;
                            }
                        }
                        iArr = new int[max.setMin.length];
                        System.arraycopy(max.setMin, 0, iArr, 0, max.setMin.length);
                        int[] iArr3 = iArr;
                        int i8 = 0;
                        while (i8 < ClassFileWriter.this.hashCode) {
                            if (ClassFileWriter.this.toIntRange(ClassFileWriter.this.toString[i8].getMax) == r22.getMax) {
                                for (int i9 = i8 + 1; i9 < ClassFileWriter.this.hashCode; i9++) {
                                    ClassFileWriter.this.toString[i9 - 1] = ClassFileWriter.this.toString[i9];
                                }
                                ClassFileWriter.toFloatRange(ClassFileWriter.this);
                                i8--;
                            }
                            i8++;
                        }
                        r22.setMin(iArr3, iArr3.length, iArr2, 1, ClassFileWriter.this.getMax);
                        int i10 = r22.getMin - 1;
                        ClassFileWriter.this.valueOf[i10] = -65;
                        for (int i11 = r22.getMax; i11 < i10; i11++) {
                            ClassFileWriter.this.valueOf[i11] = 0;
                        }
                    }
                    i6++;
                } else {
                    getMin();
                    return;
                }
            }
        }

        private SecureMoneyKeyboard.AnonymousClass1 setMax(int i) {
            SecureMoneyKeyboard.AnonymousClass1 r1;
            int i2 = 0;
            while (true) {
                SecureMoneyKeyboard.AnonymousClass1[] r12 = this.setMax;
                if (i2 < r12.length && (r1 = r12[i2]) != null) {
                    if (i >= r1.getMax && i < r1.getMin) {
                        return r1;
                    }
                    i2++;
                }
            }
            throw new IllegalArgumentException("bad offset: ".concat(String.valueOf(i)));
        }

        private SecureMoneyKeyboard.AnonymousClass1 getMax(int i) {
            int i2;
            if ((ClassFileWriter.this.valueOf[i] & 255) == 200) {
                i2 = setMin(i + 1, 4);
            } else {
                i2 = (short) setMin(i + 1, 2);
            }
            return setMax(i + i2);
        }

        private int setMin(int i, int i2) {
            if (i2 <= 4) {
                byte b = 0;
                for (int i3 = 0; i3 < i2; i3++) {
                    b = (b << 8) | (ClassFileWriter.this.valueOf[i + i3] & 255);
                }
                return b;
            }
            throw new IllegalArgumentException("bad operand size");
        }

        private void getMin() {
            while (true) {
                int i = this.toIntRange;
                if (i > 0) {
                    SecureMoneyKeyboard.AnonymousClass1[] r1 = this.isInside;
                    int i2 = i - 1;
                    this.toIntRange = i2;
                    SecureMoneyKeyboard.AnonymousClass1 r0 = r1[i2];
                    r0.IsOverlapping = false;
                    int[] iArr = new int[r0.setMin.length];
                    System.arraycopy(r0.setMin, 0, iArr, 0, r0.setMin.length);
                    this.setMin = iArr;
                    int[] iArr2 = new int[r0.length.length];
                    System.arraycopy(r0.length, 0, iArr2, 0, r0.length.length);
                    this.equals = iArr2;
                    this.IsOverlapping = this.setMin.length;
                    this.toFloatRange = iArr2.length;
                    setMax(r0);
                } else {
                    return;
                }
            }
        }

        private void setMin(SecureMoneyKeyboard.AnonymousClass1 r7) {
            if (r7.setMin(this.setMin, this.IsOverlapping, this.equals, this.toFloatRange, ClassFileWriter.this.getMax)) {
                length(r7);
            }
        }

        private void length(SecureMoneyKeyboard.AnonymousClass1 r5) {
            if (!r5.length()) {
                r5.IsOverlapping = true;
                r5.toIntRange = true;
                int i = this.toIntRange;
                SecureMoneyKeyboard.AnonymousClass1[] r1 = this.isInside;
                if (i == r1.length) {
                    SecureMoneyKeyboard.AnonymousClass1[] r2 = new SecureMoneyKeyboard.AnonymousClass1[(i * 2)];
                    System.arraycopy(r1, 0, r2, 0, i);
                    this.isInside = r2;
                }
                SecureMoneyKeyboard.AnonymousClass1[] r0 = this.isInside;
                int i2 = this.toIntRange;
                this.toIntRange = i2 + 1;
                r0[i2] = r5;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:117:0x048a, code lost:
            r0.toFloatRange--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0496, code lost:
            r0.toFloatRange--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x04a2, code lost:
            r0.toFloatRange--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x04ae, code lost:
            r0.toFloatRange--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0527, code lost:
            equals(3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x052b, code lost:
            equals(2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x052f, code lost:
            equals(4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0533, code lost:
            equals(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x053b, code lost:
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x053c, code lost:
            if (r4 != 0) goto L_0x0544;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x053e, code lost:
            r4 = org.mozilla.classfile.ClassFileWriter.getMin((int) r1, r0.values);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0546, code lost:
            if (r0.values == false) goto L_0x054e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x054a, code lost:
            if (r1 == 196) goto L_0x054e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x054c, code lost:
            r0.values = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x054e, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x019f, code lost:
            equals(o.announceTextOut.getMin(org.mozilla.classfile.ClassFileWriter.toFloatRange(((o.handleAccessiBilityEvent) org.mozilla.classfile.ClassFileWriter.IsOverlapping(r0.getMax).length.getObject(setMin(r18 + 1, 2))).getMin), org.mozilla.classfile.ClassFileWriter.IsOverlapping(r0.getMax)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0380, code lost:
            r0.toFloatRange--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0385, code lost:
            r0.toFloatRange--;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int setMin(int r18) {
            /*
                r17 = this;
                r0 = r17
                org.mozilla.classfile.ClassFileWriter r1 = org.mozilla.classfile.ClassFileWriter.this
                byte[] r1 = r1.valueOf
                byte r1 = r1[r18]
                r1 = r1 & 255(0xff, float:3.57E-43)
                java.lang.String r2 = "V"
                r3 = 41
                r4 = 6
                r6 = 16777215(0xffffff, float:2.3509886E-38)
                r7 = 3
                r8 = 65535(0xffff, float:9.1834E-41)
                r9 = 0
                r12 = 32
                r13 = 4
                r14 = 8
                r15 = 16777215(0xffffff, double:8.2890456E-317)
                r5 = 2
                r10 = 1
                switch(r1) {
                    case 0: goto L_0x053b;
                    case 1: goto L_0x0537;
                    case 2: goto L_0x0533;
                    case 3: goto L_0x0533;
                    case 4: goto L_0x0533;
                    case 5: goto L_0x0533;
                    case 6: goto L_0x0533;
                    case 7: goto L_0x0533;
                    case 8: goto L_0x0533;
                    case 9: goto L_0x052f;
                    case 10: goto L_0x052f;
                    case 11: goto L_0x052b;
                    case 12: goto L_0x052b;
                    case 13: goto L_0x052b;
                    case 14: goto L_0x0527;
                    case 15: goto L_0x0527;
                    case 16: goto L_0x0533;
                    case 17: goto L_0x0533;
                    case 18: goto L_0x04cd;
                    case 19: goto L_0x04cd;
                    case 20: goto L_0x04cd;
                    case 21: goto L_0x0533;
                    case 22: goto L_0x052f;
                    case 23: goto L_0x052b;
                    case 24: goto L_0x0527;
                    case 25: goto L_0x04bc;
                    case 26: goto L_0x0533;
                    case 27: goto L_0x0533;
                    case 28: goto L_0x0533;
                    case 29: goto L_0x0533;
                    case 30: goto L_0x052f;
                    case 31: goto L_0x052f;
                    case 32: goto L_0x052f;
                    case 33: goto L_0x052f;
                    case 34: goto L_0x052b;
                    case 35: goto L_0x052b;
                    case 36: goto L_0x052b;
                    case 37: goto L_0x052b;
                    case 38: goto L_0x0527;
                    case 39: goto L_0x0527;
                    case 40: goto L_0x0527;
                    case 41: goto L_0x0527;
                    case 42: goto L_0x04b5;
                    case 43: goto L_0x04b5;
                    case 44: goto L_0x04b5;
                    case 45: goto L_0x04b5;
                    case 46: goto L_0x04a9;
                    case 47: goto L_0x049d;
                    case 48: goto L_0x0491;
                    case 49: goto L_0x0485;
                    case 50: goto L_0x043f;
                    case 51: goto L_0x04a9;
                    case 52: goto L_0x04a9;
                    case 53: goto L_0x04a9;
                    case 54: goto L_0x0429;
                    case 55: goto L_0x0413;
                    case 56: goto L_0x03fc;
                    case 57: goto L_0x03e6;
                    case 58: goto L_0x03cc;
                    case 59: goto L_0x03c0;
                    case 60: goto L_0x03c0;
                    case 61: goto L_0x03c0;
                    case 62: goto L_0x03c0;
                    case 63: goto L_0x03b4;
                    case 64: goto L_0x03b4;
                    case 65: goto L_0x03b4;
                    case 66: goto L_0x03b4;
                    case 67: goto L_0x03a8;
                    case 68: goto L_0x03a8;
                    case 69: goto L_0x03a8;
                    case 70: goto L_0x03a8;
                    case 71: goto L_0x039c;
                    case 72: goto L_0x039c;
                    case 73: goto L_0x039c;
                    case 74: goto L_0x039c;
                    case 75: goto L_0x038c;
                    case 76: goto L_0x038c;
                    case 77: goto L_0x038c;
                    case 78: goto L_0x038c;
                    case 79: goto L_0x037b;
                    case 80: goto L_0x037b;
                    case 81: goto L_0x037b;
                    case 82: goto L_0x037b;
                    case 83: goto L_0x037b;
                    case 84: goto L_0x037b;
                    case 85: goto L_0x037b;
                    case 86: goto L_0x037b;
                    case 87: goto L_0x0385;
                    case 88: goto L_0x0365;
                    case 89: goto L_0x0354;
                    case 90: goto L_0x033b;
                    case 91: goto L_0x02fd;
                    case 92: goto L_0x02bd;
                    case 93: goto L_0x0271;
                    case 94: goto L_0x0202;
                    case 95: goto L_0x01ec;
                    case 96: goto L_0x04a9;
                    case 97: goto L_0x049d;
                    case 98: goto L_0x0491;
                    case 99: goto L_0x0485;
                    case 100: goto L_0x04a9;
                    case 101: goto L_0x049d;
                    case 102: goto L_0x0491;
                    case 103: goto L_0x0485;
                    case 104: goto L_0x04a9;
                    case 105: goto L_0x049d;
                    case 106: goto L_0x0491;
                    case 107: goto L_0x0485;
                    case 108: goto L_0x04a9;
                    case 109: goto L_0x049d;
                    case 110: goto L_0x0491;
                    case 111: goto L_0x0485;
                    case 112: goto L_0x04a9;
                    case 113: goto L_0x049d;
                    case 114: goto L_0x0491;
                    case 115: goto L_0x0485;
                    case 116: goto L_0x04ae;
                    case 117: goto L_0x04a2;
                    case 118: goto L_0x0496;
                    case 119: goto L_0x048a;
                    case 120: goto L_0x04a9;
                    case 121: goto L_0x049d;
                    case 122: goto L_0x04a9;
                    case 123: goto L_0x049d;
                    case 124: goto L_0x04a9;
                    case 125: goto L_0x049d;
                    case 126: goto L_0x04a9;
                    case 127: goto L_0x049d;
                    case 128: goto L_0x04a9;
                    case 129: goto L_0x049d;
                    case 130: goto L_0x04a9;
                    case 131: goto L_0x049d;
                    case 132: goto L_0x053b;
                    case 133: goto L_0x04a2;
                    case 134: goto L_0x0496;
                    case 135: goto L_0x048a;
                    case 136: goto L_0x04ae;
                    case 137: goto L_0x0496;
                    case 138: goto L_0x048a;
                    case 139: goto L_0x04ae;
                    case 140: goto L_0x04a2;
                    case 141: goto L_0x048a;
                    case 142: goto L_0x04ae;
                    case 143: goto L_0x04a2;
                    case 144: goto L_0x0496;
                    case 145: goto L_0x04ae;
                    case 146: goto L_0x04ae;
                    case 147: goto L_0x04ae;
                    case 148: goto L_0x04a9;
                    case 149: goto L_0x04a9;
                    case 150: goto L_0x04a9;
                    case 151: goto L_0x04a9;
                    case 152: goto L_0x04a9;
                    case 153: goto L_0x0385;
                    case 154: goto L_0x0385;
                    case 155: goto L_0x0385;
                    case 156: goto L_0x0385;
                    case 157: goto L_0x0385;
                    case 158: goto L_0x0385;
                    case 159: goto L_0x0380;
                    case 160: goto L_0x0380;
                    case 161: goto L_0x0380;
                    case 162: goto L_0x0380;
                    case 163: goto L_0x0380;
                    case 164: goto L_0x0380;
                    case 165: goto L_0x0380;
                    case 166: goto L_0x0380;
                    case 167: goto L_0x053b;
                    case 168: goto L_0x0026;
                    case 169: goto L_0x0026;
                    case 170: goto L_0x01cc;
                    case 171: goto L_0x0026;
                    case 172: goto L_0x01c8;
                    case 173: goto L_0x01c8;
                    case 174: goto L_0x01c8;
                    case 175: goto L_0x01c8;
                    case 176: goto L_0x01c8;
                    case 177: goto L_0x01c8;
                    case 178: goto L_0x019f;
                    case 179: goto L_0x0385;
                    case 180: goto L_0x019a;
                    case 181: goto L_0x0380;
                    case 182: goto L_0x011e;
                    case 183: goto L_0x011e;
                    case 184: goto L_0x011e;
                    case 185: goto L_0x011e;
                    case 186: goto L_0x00d7;
                    case 187: goto L_0x00ce;
                    case 188: goto L_0x009d;
                    case 189: goto L_0x005e;
                    case 190: goto L_0x04ae;
                    case 191: goto L_0x004e;
                    case 192: goto L_0x003a;
                    case 193: goto L_0x04ae;
                    case 194: goto L_0x0385;
                    case 195: goto L_0x0385;
                    case 196: goto L_0x0036;
                    case 197: goto L_0x0026;
                    case 198: goto L_0x0385;
                    case 199: goto L_0x0385;
                    case 200: goto L_0x053b;
                    default: goto L_0x0026;
                }
            L_0x0026:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r3 = "bad opcode: "
                java.lang.String r1 = r3.concat(r1)
                r2.<init>(r1)
                throw r2
            L_0x0036:
                r0.values = r10
                goto L_0x053b
            L_0x003a:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                int r2 = r18 + 1
                int r2 = r0.setMin(r2, r5)
                r2 = r2 & r8
                int r2 = r2 << r14
                r2 = r2 | 7
                r0.equals(r2)
                goto L_0x053b
            L_0x004e:
                int[] r2 = r0.equals
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r2 = r2[r3]
                r0.toFloatRange = r9
                r0.equals(r2)
                goto L_0x053b
            L_0x005e:
                int r2 = r18 + 1
                int r2 = r0.setMin(r2, r5)
                org.mozilla.classfile.ClassFileWriter r3 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r3 = r3.getMax
                o.switchOff r3 = r3.length
                java.lang.Object r2 = r3.getObject(r2)
                java.lang.String r2 = (java.lang.String) r2
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "[L"
                r3.<init>(r4)
                r3.append(r2)
                r2 = 59
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                org.mozilla.classfile.ClassFileWriter r3 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r3 = r3.getMax
                short r2 = r3.length((java.lang.String) r2)
                r2 = r2 & r8
                int r2 = r2 << r14
                r2 = r2 | 7
                r0.equals(r2)
                goto L_0x053b
            L_0x009d:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                org.mozilla.classfile.ClassFileWriter r2 = org.mozilla.classfile.ClassFileWriter.this
                byte[] r2 = r2.valueOf
                int r3 = r18 + 1
                byte r2 = r2[r3]
                char r2 = org.mozilla.classfile.ClassFileWriter.toDoubleRange((int) r2)
                org.mozilla.classfile.ClassFileWriter r3 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r3 = r3.getMax
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r4 = "["
                java.lang.String r2 = r4.concat(r2)
                short r2 = r3.length((java.lang.String) r2)
                short r2 = (short) r2
                r2 = r2 & r8
                int r2 = r2 << r14
                r2 = r2 | 7
                r0.equals(r2)
                goto L_0x053b
            L_0x00ce:
                r2 = r18 & r8
                int r2 = r2 << r14
                r2 = r2 | r14
                r0.equals(r2)
                goto L_0x053b
            L_0x00d7:
                int r4 = r18 + 1
                int r4 = r0.setMin(r4, r5)
                org.mozilla.classfile.ClassFileWriter r5 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r5 = r5.getMax
                o.switchOff r5 = r5.length
                java.lang.Object r4 = r5.getObject(r4)
                java.lang.String r4 = (java.lang.String) r4
                int r5 = org.mozilla.classfile.ClassFileWriter.toIntRange((java.lang.String) r4)
                int r5 = r5 >>> 16
                r6 = 0
            L_0x00f2:
                if (r6 >= r5) goto L_0x00fc
                int r7 = r0.toFloatRange
                int r7 = r7 - r10
                r0.toFloatRange = r7
                int r6 = r6 + 1
                goto L_0x00f2
            L_0x00fc:
                int r3 = r4.indexOf(r3)
                int r3 = r3 + r10
                java.lang.String r3 = r4.substring(r3)
                java.lang.String r3 = org.mozilla.classfile.ClassFileWriter.isInside((java.lang.String) r3)
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L_0x053b
                org.mozilla.classfile.ClassFileWriter r2 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r2 = r2.getMax
                int r2 = o.announceTextOut.getMin(r3, r2)
                r0.equals(r2)
                goto L_0x053b
            L_0x011e:
                int r6 = r18 + 1
                int r5 = r0.setMin(r6, r5)
                org.mozilla.classfile.ClassFileWriter r6 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r6 = r6.getMax
                o.switchOff r6 = r6.length
                java.lang.Object r5 = r6.getObject(r5)
                o.handleAccessiBilityEvent r5 = (o.handleAccessiBilityEvent) r5
                java.lang.String r6 = r5.getMin
                java.lang.String r5 = r5.getMax
                int r7 = org.mozilla.classfile.ClassFileWriter.toIntRange((java.lang.String) r6)
                int r7 = r7 >>> 16
                r11 = 0
            L_0x013d:
                if (r11 >= r7) goto L_0x0147
                int r12 = r0.toFloatRange
                int r12 = r12 - r10
                r0.toFloatRange = r12
                int r11 = r11 + 1
                goto L_0x013d
            L_0x0147:
                r7 = 184(0xb8, float:2.58E-43)
                if (r1 == r7) goto L_0x0178
                int[] r7 = r0.equals
                int r11 = r0.toFloatRange
                int r11 = r11 - r10
                r0.toFloatRange = r11
                r7 = r7[r11]
                r11 = r7 & 255(0xff, float:3.57E-43)
                if (r11 == r14) goto L_0x015a
                if (r11 != r4) goto L_0x0178
            L_0x015a:
                java.lang.String r4 = "<init>"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x0170
                org.mozilla.classfile.ClassFileWriter r4 = org.mozilla.classfile.ClassFileWriter.this
                short r4 = r4.create
                r4 = r4 & r8
                int r4 = r4 << r14
                r4 = r4 | 7
                r0.getMax(r7, r4)
                goto L_0x0178
            L_0x0170:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "bad instance"
                r1.<init>(r2)
                throw r1
            L_0x0178:
                int r3 = r6.indexOf(r3)
                int r3 = r3 + r10
                java.lang.String r3 = r6.substring(r3)
                java.lang.String r3 = org.mozilla.classfile.ClassFileWriter.isInside((java.lang.String) r3)
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L_0x053b
                org.mozilla.classfile.ClassFileWriter r2 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r2 = r2.getMax
                int r2 = o.announceTextOut.getMin(r3, r2)
                r0.equals(r2)
                goto L_0x053b
            L_0x019a:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
            L_0x019f:
                int r2 = r18 + 1
                int r2 = r0.setMin(r2, r5)
                org.mozilla.classfile.ClassFileWriter r3 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r3 = r3.getMax
                o.switchOff r3 = r3.length
                java.lang.Object r2 = r3.getObject(r2)
                o.handleAccessiBilityEvent r2 = (o.handleAccessiBilityEvent) r2
                java.lang.String r2 = r2.getMin
                java.lang.String r2 = org.mozilla.classfile.ClassFileWriter.isInside((java.lang.String) r2)
                org.mozilla.classfile.ClassFileWriter r3 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r3 = r3.getMax
                int r2 = o.announceTextOut.getMin(r2, r3)
                r0.equals(r2)
                goto L_0x053b
            L_0x01c8:
                r0.toFloatRange = r9
                goto L_0x053b
            L_0x01cc:
                int r2 = r18 + 1
                r3 = r18 ^ -1
                r3 = r3 & r7
                int r2 = r2 + r3
                int r3 = r2 + 4
                int r3 = r0.setMin(r3, r13)
                int r4 = r2 + 8
                int r4 = r0.setMin(r4, r13)
                int r4 = r4 - r3
                int r4 = r4 + r13
                int r4 = r4 * 4
                int r4 = r4 + r2
                int r4 = r4 - r18
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                goto L_0x053c
            L_0x01ec:
                int[] r2 = r0.equals
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r4 = r2[r3]
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r2 = r2[r3]
                r0.equals(r4)
                r0.equals(r2)
                goto L_0x053b
            L_0x0202:
                int[] r2 = r0.equals
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r2 = r2[r3]
                long r2 = (long) r2
                int r4 = (int) r2
                boolean r4 = o.announceTextOut.getMin(r4)
                if (r4 == 0) goto L_0x0214
                goto L_0x0221
            L_0x0214:
                long r2 = r2 << r12
                int[] r4 = r0.equals
                int r5 = r0.toFloatRange
                int r5 = r5 - r10
                r0.toFloatRange = r5
                r4 = r4[r5]
                r4 = r4 & r6
                long r4 = (long) r4
                long r2 = r2 | r4
            L_0x0221:
                int[] r4 = r0.equals
                int r5 = r0.toFloatRange
                int r5 = r5 - r10
                r0.toFloatRange = r5
                r4 = r4[r5]
                long r4 = (long) r4
                int r7 = (int) r4
                boolean r7 = o.announceTextOut.getMin(r7)
                if (r7 == 0) goto L_0x0233
                goto L_0x0240
            L_0x0233:
                long r4 = r4 << r12
                int[] r7 = r0.equals
                int r8 = r0.toFloatRange
                int r8 = r8 - r10
                r0.toFloatRange = r8
                r7 = r7[r8]
                r6 = r6 & r7
                long r6 = (long) r6
                long r4 = r4 | r6
            L_0x0240:
                long r6 = r2 & r15
                int r7 = (int) r6
                r0.equals(r7)
                long r2 = r2 >>> r12
                r10 = 0
                int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r6 == 0) goto L_0x0253
                long r13 = r2 & r15
                int r6 = (int) r13
                r0.equals(r6)
            L_0x0253:
                long r13 = r4 & r15
                int r6 = (int) r13
                r0.equals(r6)
                long r4 = r4 >>> r12
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 == 0) goto L_0x0263
                long r4 = r4 & r15
                int r5 = (int) r4
                r0.equals(r5)
            L_0x0263:
                r0.equals(r7)
                int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                if (r4 == 0) goto L_0x053b
                long r2 = r2 & r15
                int r3 = (int) r2
                r0.equals(r3)
                goto L_0x053b
            L_0x0271:
                int[] r2 = r0.equals
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r2 = r2[r3]
                long r2 = (long) r2
                int r4 = (int) r2
                boolean r4 = o.announceTextOut.getMin(r4)
                if (r4 == 0) goto L_0x0283
                goto L_0x0290
            L_0x0283:
                long r2 = r2 << r12
                int[] r4 = r0.equals
                int r5 = r0.toFloatRange
                int r5 = r5 - r10
                r0.toFloatRange = r5
                r4 = r4[r5]
                r4 = r4 & r6
                long r4 = (long) r4
                long r2 = r2 | r4
            L_0x0290:
                int[] r4 = r0.equals
                int r5 = r0.toFloatRange
                int r5 = r5 - r10
                r0.toFloatRange = r5
                r4 = r4[r5]
                long r5 = r2 & r15
                int r6 = (int) r5
                r0.equals(r6)
                long r2 = r2 >>> r12
                r7 = 0
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 == 0) goto L_0x02ac
                long r10 = r2 & r15
                int r5 = (int) r10
                r0.equals(r5)
            L_0x02ac:
                r0.equals(r4)
                r0.equals(r6)
                int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r4 == 0) goto L_0x053b
                long r2 = r2 & r15
                int r3 = (int) r2
                r0.equals(r3)
                goto L_0x053b
            L_0x02bd:
                int[] r2 = r0.equals
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r2 = r2[r3]
                long r2 = (long) r2
                int r4 = (int) r2
                boolean r4 = o.announceTextOut.getMin(r4)
                if (r4 == 0) goto L_0x02cf
                goto L_0x02dc
            L_0x02cf:
                long r2 = r2 << r12
                int[] r4 = r0.equals
                int r5 = r0.toFloatRange
                int r5 = r5 - r10
                r0.toFloatRange = r5
                r4 = r4[r5]
                r4 = r4 & r6
                long r4 = (long) r4
                long r2 = r2 | r4
            L_0x02dc:
                long r4 = r2 & r15
                int r5 = (int) r4
                r0.equals(r5)
                long r2 = r2 >>> r12
                r6 = 0
                int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r4 == 0) goto L_0x02ef
                long r10 = r2 & r15
                int r4 = (int) r10
                r0.equals(r4)
            L_0x02ef:
                r0.equals(r5)
                int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r4 == 0) goto L_0x053b
                long r2 = r2 & r15
                int r3 = (int) r2
                r0.equals(r3)
                goto L_0x053b
            L_0x02fd:
                int[] r2 = r0.equals
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r4 = r2[r3]
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r2 = r2[r3]
                long r2 = (long) r2
                int r5 = (int) r2
                boolean r5 = o.announceTextOut.getMin(r5)
                if (r5 == 0) goto L_0x0314
                goto L_0x0321
            L_0x0314:
                long r2 = r2 << r12
                int[] r5 = r0.equals
                int r7 = r0.toFloatRange
                int r7 = r7 - r10
                r0.toFloatRange = r7
                r5 = r5[r7]
                r5 = r5 & r6
                long r5 = (long) r5
                long r2 = r2 | r5
            L_0x0321:
                r0.equals(r4)
                long r5 = r2 & r15
                int r6 = (int) r5
                r0.equals(r6)
                long r2 = r2 >>> r12
                r5 = 0
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x0336
                long r2 = r2 & r15
                int r3 = (int) r2
                r0.equals(r3)
            L_0x0336:
                r0.equals(r4)
                goto L_0x053b
            L_0x033b:
                int[] r2 = r0.equals
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r4 = r2[r3]
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r2 = r2[r3]
                r0.equals(r4)
                r0.equals(r2)
                r0.equals(r4)
                goto L_0x053b
            L_0x0354:
                int[] r2 = r0.equals
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r2 = r2[r3]
                r0.equals(r2)
                r0.equals(r2)
                goto L_0x053b
            L_0x0365:
                int[] r2 = r0.equals
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r2 = r2[r3]
                boolean r2 = o.announceTextOut.getMin(r2)
                if (r2 != 0) goto L_0x053b
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                goto L_0x053b
            L_0x037b:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
            L_0x0380:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
            L_0x0385:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                goto L_0x053b
            L_0x038c:
                int r2 = r1 + -75
                int[] r3 = r0.equals
                int r4 = r0.toFloatRange
                int r4 = r4 - r10
                r0.toFloatRange = r4
                r3 = r3[r4]
                r0.getMin(r2, r3)
                goto L_0x053b
            L_0x039c:
                int r2 = r1 + -71
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r0.getMin(r2, r7)
                goto L_0x053b
            L_0x03a8:
                int r2 = r1 + -67
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r0.getMin(r2, r5)
                goto L_0x053b
            L_0x03b4:
                int r2 = r1 + -63
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r0.getMin(r2, r13)
                goto L_0x053b
            L_0x03c0:
                int r2 = r1 + -59
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r0.getMin(r2, r10)
                goto L_0x053b
            L_0x03cc:
                int r2 = r18 + 1
                boolean r3 = r0.values
                if (r3 == 0) goto L_0x03d3
                goto L_0x03d4
            L_0x03d3:
                r5 = 1
            L_0x03d4:
                int r2 = r0.setMin(r2, r5)
                int[] r3 = r0.equals
                int r4 = r0.toFloatRange
                int r4 = r4 - r10
                r0.toFloatRange = r4
                r3 = r3[r4]
                r0.getMin(r2, r3)
                goto L_0x053b
            L_0x03e6:
                int r2 = r18 + 1
                boolean r3 = r0.values
                if (r3 == 0) goto L_0x03ed
                goto L_0x03ee
            L_0x03ed:
                r5 = 1
            L_0x03ee:
                int r2 = r0.setMin(r2, r5)
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r0.getMin(r2, r7)
                goto L_0x053b
            L_0x03fc:
                int r2 = r18 + 1
                boolean r3 = r0.values
                if (r3 == 0) goto L_0x0404
                r3 = 2
                goto L_0x0405
            L_0x0404:
                r3 = 1
            L_0x0405:
                int r2 = r0.setMin(r2, r3)
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r0.getMin(r2, r5)
                goto L_0x053b
            L_0x0413:
                int r2 = r18 + 1
                boolean r3 = r0.values
                if (r3 == 0) goto L_0x041a
                goto L_0x041b
            L_0x041a:
                r5 = 1
            L_0x041b:
                int r2 = r0.setMin(r2, r5)
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r0.getMin(r2, r13)
                goto L_0x053b
            L_0x0429:
                int r2 = r18 + 1
                boolean r3 = r0.values
                if (r3 == 0) goto L_0x0430
                goto L_0x0431
            L_0x0430:
                r5 = 1
            L_0x0431:
                int r2 = r0.setMin(r2, r5)
                int r3 = r0.toFloatRange
                int r3 = r3 - r10
                r0.toFloatRange = r3
                r0.getMin(r2, r10)
                goto L_0x053b
            L_0x043f:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                int[] r3 = r0.equals
                int r2 = r2 - r10
                r0.toFloatRange = r2
                r2 = r3[r2]
                int r2 = r2 >>> r14
                org.mozilla.classfile.ClassFileWriter r3 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r3 = r3.getMax
                o.switchOff r3 = r3.length
                java.lang.Object r2 = r3.getObject(r2)
                java.lang.String r2 = (java.lang.String) r2
                char r3 = r2.charAt(r9)
                r4 = 91
                if (r3 != r4) goto L_0x047d
                java.lang.String r2 = r2.substring(r10)
                java.lang.String r2 = org.mozilla.classfile.ClassFileWriter.isInside((java.lang.String) r2)
                org.mozilla.classfile.ClassFileWriter r3 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r3 = r3.getMax
                short r2 = r3.length((java.lang.String) r2)
                r2 = r2 & r8
                int r2 = r2 << r14
                r2 = r2 | 7
                r0.equals(r2)
                goto L_0x053b
            L_0x047d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "bad array type"
                r1.<init>(r2)
                throw r1
            L_0x0485:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
            L_0x048a:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                goto L_0x0527
            L_0x0491:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
            L_0x0496:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                goto L_0x052b
            L_0x049d:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
            L_0x04a2:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                goto L_0x052f
            L_0x04a9:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
            L_0x04ae:
                int r2 = r0.toFloatRange
                int r2 = r2 - r10
                r0.toFloatRange = r2
                goto L_0x0533
            L_0x04b5:
                int r2 = r1 + -42
                r0.toFloatRange(r2)
                goto L_0x053b
            L_0x04bc:
                int r2 = r18 + 1
                boolean r3 = r0.values
                if (r3 == 0) goto L_0x04c3
                goto L_0x04c4
            L_0x04c3:
                r5 = 1
            L_0x04c4:
                int r2 = r0.setMin(r2, r5)
                r0.toFloatRange(r2)
                goto L_0x053b
            L_0x04cd:
                r2 = 18
                if (r1 != r2) goto L_0x04d8
                int r2 = r18 + 1
                int r2 = r0.setMin(r2, r10)
                goto L_0x04de
            L_0x04d8:
                int r2 = r18 + 1
                int r2 = r0.setMin(r2, r5)
            L_0x04de:
                org.mozilla.classfile.ClassFileWriter r3 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r3 = r3.getMax
                byte r2 = r3.length((int) r2)
                if (r2 == r7) goto L_0x0523
                if (r2 == r13) goto L_0x051f
                r3 = 5
                if (r2 == r3) goto L_0x051b
                if (r2 == r4) goto L_0x0517
                if (r2 != r14) goto L_0x0507
                org.mozilla.classfile.ClassFileWriter r2 = org.mozilla.classfile.ClassFileWriter.this
                o.SecureMoneyKeyboard r2 = r2.getMax
                java.lang.String r3 = "java/lang/String"
                short r2 = r2.length((java.lang.String) r3)
                r2 = r2 & r8
                int r2 = r2 << r14
                r2 = r2 | 7
                r0.equals(r2)
                goto L_0x053b
            L_0x0507:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r3 = "bad const type "
                java.lang.String r2 = r3.concat(r2)
                r1.<init>(r2)
                throw r1
            L_0x0517:
                r0.equals(r7)
                goto L_0x053b
            L_0x051b:
                r0.equals(r13)
                goto L_0x053b
            L_0x051f:
                r0.equals(r5)
                goto L_0x053b
            L_0x0523:
                r0.equals(r10)
                goto L_0x053b
            L_0x0527:
                r0.equals(r7)
                goto L_0x053b
            L_0x052b:
                r0.equals(r5)
                goto L_0x053b
            L_0x052f:
                r0.equals(r13)
                goto L_0x053b
            L_0x0533:
                r0.equals(r10)
                goto L_0x053b
            L_0x0537:
                r2 = 5
                r0.equals(r2)
            L_0x053b:
                r4 = 0
            L_0x053c:
                if (r4 != 0) goto L_0x0544
                boolean r2 = r0.values
                int r4 = org.mozilla.classfile.ClassFileWriter.getMin((int) r1, (boolean) r2)
            L_0x0544:
                boolean r2 = r0.values
                if (r2 == 0) goto L_0x054e
                r2 = 196(0xc4, float:2.75E-43)
                if (r1 == r2) goto L_0x054e
                r0.values = r9
            L_0x054e:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.setMin.setMin(int):int");
        }

        private void getMax(int i, int i2) {
            int[] iArr = this.setMin;
            int i3 = this.IsOverlapping;
            for (int i4 = 0; i4 < i3; i4++) {
                if (iArr[i4] == i) {
                    iArr[i4] = i2;
                }
            }
            int[] iArr2 = this.equals;
            int i5 = this.toFloatRange;
            for (int i6 = 0; i6 < i5; i6++) {
                if (iArr2[i6] == i) {
                    iArr2[i6] = i2;
                }
            }
        }

        private void getMin(int i, int i2) {
            int i3 = this.IsOverlapping;
            if (i >= i3) {
                int i4 = i + 1;
                int[] iArr = new int[i4];
                System.arraycopy(this.setMin, 0, iArr, 0, i3);
                this.setMin = iArr;
                this.IsOverlapping = i4;
            }
            this.setMin[i] = i2;
        }

        private void equals(int i) {
            int i2 = this.toFloatRange;
            if (i2 == this.equals.length) {
                int[] iArr = new int[Math.max(i2 * 2, 4)];
                System.arraycopy(this.equals, 0, iArr, 0, this.toFloatRange);
                this.equals = iArr;
            }
            int[] iArr2 = this.equals;
            int i3 = this.toFloatRange;
            this.toFloatRange = i3 + 1;
            iArr2[i3] = i;
        }

        /* access modifiers changed from: package-private */
        public final void setMin() {
            int[] max = this.setMax[0].getMax();
            int i = -1;
            int i2 = 1;
            while (true) {
                SecureMoneyKeyboard.AnonymousClass1[] r5 = this.setMax;
                if (i2 < r5.length) {
                    SecureMoneyKeyboard.AnonymousClass1 r52 = r5[i2];
                    int[] max2 = r52.getMax();
                    int length2 = r52.length.length;
                    int[] iArr = new int[length2];
                    System.arraycopy(r52.length, 0, iArr, 0, r52.length.length);
                    int i3 = (r52.getMax - i) - 1;
                    if (length2 == 0) {
                        int length3 = max.length > max2.length ? max2.length : max.length;
                        int abs = Math.abs(max.length - max2.length);
                        int i4 = 0;
                        while (i4 < length3 && max[i4] == max2[i4]) {
                            i4++;
                        }
                        if (i4 == max2.length && abs == 0) {
                            if (i3 <= 63) {
                                byte[] bArr = this.length;
                                int i5 = this.getMin;
                                this.getMin = i5 + 1;
                                bArr[i5] = (byte) i3;
                            } else {
                                byte[] bArr2 = this.length;
                                int i6 = this.getMin;
                                int i7 = i6 + 1;
                                this.getMin = i7;
                                bArr2[i6] = -5;
                                this.getMin = ClassFileWriter.getMin(i3, bArr2, i7);
                            }
                        } else if (i4 == max2.length && abs <= 3) {
                            byte[] bArr3 = this.length;
                            int i8 = this.getMin;
                            int i9 = i8 + 1;
                            this.getMin = i9;
                            bArr3[i8] = (byte) (251 - abs);
                            this.getMin = ClassFileWriter.getMin(i3, bArr3, i9);
                        } else if (i4 != max.length || abs > 3) {
                            length(max2, iArr, i3);
                        } else {
                            byte[] bArr4 = this.length;
                            int i10 = this.getMin;
                            int i11 = i10 + 1;
                            this.getMin = i11;
                            bArr4[i10] = (byte) (abs + 251);
                            this.getMin = ClassFileWriter.getMin(i3, bArr4, i11);
                            for (int length4 = max2.length - abs; length4 < max2.length; length4++) {
                                this.getMin = toIntRange(max2[length4]);
                            }
                            this.getMin = this.getMin;
                        }
                    } else if (length2 != 1) {
                        length(max2, iArr, i3);
                    } else if (Arrays.equals(max, max2)) {
                        if (i3 <= 63) {
                            byte[] bArr5 = this.length;
                            int i12 = this.getMin;
                            this.getMin = i12 + 1;
                            bArr5[i12] = (byte) (i3 + 64);
                        } else {
                            byte[] bArr6 = this.length;
                            int i13 = this.getMin;
                            int i14 = i13 + 1;
                            this.getMin = i14;
                            bArr6[i13] = -9;
                            this.getMin = ClassFileWriter.getMin(i3, bArr6, i14);
                        }
                        toIntRange(iArr[0]);
                    } else {
                        length(max2, iArr, i3);
                    }
                    i = r52.getMax;
                    i2++;
                    max = max2;
                } else {
                    return;
                }
            }
        }

        private void length(int[] iArr, int[] iArr2, int i) {
            byte[] bArr = this.length;
            int i2 = this.getMin;
            int i3 = i2 + 1;
            this.getMin = i3;
            bArr[i2] = -1;
            int min = ClassFileWriter.getMin(i, bArr, i3);
            this.getMin = min;
            this.getMin = ClassFileWriter.getMin(iArr.length, this.length, min);
            for (int intRange : iArr) {
                this.getMin = toIntRange(intRange);
            }
            int i4 = this.getMin;
            this.getMin = i4;
            this.getMin = ClassFileWriter.getMin(iArr2.length, this.length, i4);
            for (int intRange2 : iArr2) {
                this.getMin = toIntRange(intRange2);
            }
            this.getMin = this.getMin;
        }

        private int toIntRange(int i) {
            int i2 = i & 255;
            byte[] bArr = this.length;
            int i3 = this.getMin;
            this.getMin = i3 + 1;
            bArr[i3] = (byte) i2;
            if (i2 == 7 || i2 == 8) {
                this.getMin = ClassFileWriter.getMin(i >>> 8, this.length, this.getMin);
            }
            return this.getMin;
        }

        private void setMax(SecureMoneyKeyboard.AnonymousClass1 r15) {
            short s;
            int i = r15.getMax;
            byte b = 0;
            while (i < r15.getMin) {
                b = ClassFileWriter.this.valueOf[i] & 255;
                int min = setMin(i);
                if (getMin(b)) {
                    setMin(getMax(i));
                } else if (b == 170) {
                    int i2 = i + 1 + ((i ^ -1) & 3);
                    setMin(setMax(setMin(i2, 4) + i));
                    int min2 = (setMin(i2 + 8, 4) - setMin(i2 + 4, 4)) + 1;
                    int i3 = i2 + 12;
                    for (int i4 = 0; i4 < min2; i4++) {
                        setMin(setMax(setMin((i4 * 4) + i3, 4) + i));
                    }
                }
                for (int i5 = 0; i5 < ClassFileWriter.this.hashCode; i5++) {
                    initTtsIfTalkBack initttsiftalkback = ClassFileWriter.this.toString[i5];
                    short intRange = (short) ClassFileWriter.this.toIntRange(initttsiftalkback.getMax);
                    short intRange2 = (short) ClassFileWriter.this.toIntRange(initttsiftalkback.setMin);
                    if (i >= intRange && i < intRange2) {
                        SecureMoneyKeyboard.AnonymousClass1 max = setMax((int) (short) ClassFileWriter.this.toIntRange(initttsiftalkback.length));
                        if (initttsiftalkback.getMin == 0) {
                            s = ClassFileWriter.this.getMax.length("java/lang/Throwable");
                        } else {
                            s = initttsiftalkback.getMin;
                        }
                        SecureMoneyKeyboard.AnonymousClass1 r8 = max;
                        r8.setMin(this.setMin, this.IsOverlapping, new int[]{((s & UShort.MAX_VALUE) << 8) | 7}, 1, ClassFileWriter.this.getMax);
                        length(max);
                    }
                }
                i += min;
            }
            if (!length((int) b)) {
                int i6 = r15.setMax + 1;
                SecureMoneyKeyboard.AnonymousClass1[] r0 = this.setMax;
                if (i6 < r0.length) {
                    setMin(r0[i6]);
                }
            }
        }

        private void toFloatRange(int i) {
            int i2 = i < this.IsOverlapping ? this.setMin[i] : 0;
            int i3 = i2 & 255;
            if (i3 == 7 || i3 == 6 || i3 == 8 || i3 == 5) {
                equals(i2);
                return;
            }
            StringBuilder sb = new StringBuilder("bad local variable type: ");
            sb.append(i2);
            sb.append(" at index: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public static char toDoubleRange(int i) {
        switch (i) {
            case 4:
                return 'Z';
            case 5:
                return 'C';
            case 6:
                return 'F';
            case 7:
                return 'D';
            case 8:
                return 'B';
            case 9:
                return 'S';
            case 10:
                return 'I';
            case 11:
                return 'J';
            default:
                throw new IllegalArgumentException("bad operand");
        }
    }

    /* access modifiers changed from: private */
    public static String isInside(String str) {
        char charAt = str.charAt(0);
        if (charAt == 'F') {
            return str;
        }
        if (charAt == 'L') {
            return str.substring(1, str.length() - 1);
        }
        if (charAt == 'S' || charAt == 'V' || charAt == 'I' || charAt == 'J' || charAt == 'Z' || charAt == '[') {
            return str;
        }
        switch (charAt) {
            case 'B':
            case 'C':
            case 'D':
                return str;
            default:
                throw new IllegalArgumentException("bad descriptor:".concat(String.valueOf(str)));
        }
    }

    public final byte[] setMax() {
        int i;
        short s;
        short s2;
        if (this.asInterface != null) {
            s = this.getMax.setMin("BootstrapMethods");
            i = 1;
        } else {
            s = 0;
            i = 0;
        }
        if (this.b != 0) {
            i++;
            s2 = this.getMax.setMin("SourceFile");
        } else {
            s2 = 0;
        }
        if (this.b != 0) {
            this.getMax.setMin("SourceFile");
        }
        int size = this.getMax.getMin + 2 + 8 + 2 + 2 + 2 + 2 + (this.isInside.size() * 2) + 2;
        for (int i2 = 0; i2 < this.onNavigationEvent.size(); i2++) {
            size += !((SecureFrameLayout.SendAccessiBilityEventListener) this.onNavigationEvent.get(i2)).setMax ? 8 : 16;
        }
        int i3 = size + 2;
        for (int i4 = 0; i4 < this.Mean$Arithmetic.size(); i4++) {
            i3 += ((setEventListener) this.Mean$Arithmetic.get(i4)).equals.length + 8;
        }
        int i5 = i3 + 2;
        if (this.b != 0) {
            i5 = i5 + 2 + 4 + 2;
        }
        if (this.asInterface != null) {
            i5 = i5 + 2 + 4 + 2 + this.asBinder;
        }
        byte[] bArr = new byte[i5];
        int max = getMax(-889275714, bArr, 0);
        int i6 = equals;
        bArr[max + 0] = (byte) (i6 >>> 8);
        bArr[max + 1] = (byte) i6;
        int i7 = max + 2;
        int i8 = toFloatRange;
        bArr[i7 + 0] = (byte) (i8 >>> 8);
        bArr[i7 + 1] = (byte) i8;
        int i9 = i7 + 2;
        SecureMoneyKeyboard secureMoneyKeyboard = this.getMax;
        short s3 = (short) secureMoneyKeyboard.setMin;
        bArr[i9 + 0] = (byte) (s3 >>> 8);
        bArr[i9 + 1] = (byte) s3;
        int i10 = i9 + 2;
        System.arraycopy(secureMoneyKeyboard.equals, 0, bArr, i10, secureMoneyKeyboard.getMin);
        int i11 = i10 + secureMoneyKeyboard.getMin;
        short s4 = this.ICustomTabsCallback;
        bArr[i11 + 0] = (byte) (s4 >>> 8);
        bArr[i11 + 1] = (byte) s4;
        int i12 = i11 + 2;
        short s5 = this.create;
        bArr[i12 + 0] = (byte) (s5 >>> 8);
        bArr[i12 + 1] = (byte) s5;
        int i13 = i12 + 2;
        short s6 = this.getCause;
        bArr[i13 + 0] = (byte) (s6 >>> 8);
        bArr[i13 + 1] = (byte) s6;
        int i14 = i13 + 2;
        int size2 = this.isInside.size();
        bArr[i14 + 0] = (byte) (size2 >>> 8);
        bArr[i14 + 1] = (byte) size2;
        int i15 = i14 + 2;
        for (int i16 = 0; i16 < this.isInside.size(); i16++) {
            short shortValue = ((Short) this.isInside.get(i16)).shortValue();
            bArr[i15 + 0] = (byte) (shortValue >>> 8);
            bArr[i15 + 1] = (byte) shortValue;
            i15 += 2;
        }
        int size3 = this.onNavigationEvent.size();
        bArr[i15 + 0] = (byte) (size3 >>> 8);
        bArr[i15 + 1] = (byte) size3;
        int i17 = i15 + 2;
        for (int i18 = 0; i18 < this.onNavigationEvent.size(); i18++) {
            SecureFrameLayout.SendAccessiBilityEventListener sendAccessiBilityEventListener = (SecureFrameLayout.SendAccessiBilityEventListener) this.onNavigationEvent.get(i18);
            short s7 = sendAccessiBilityEventListener.getMin;
            bArr[i17 + 0] = (byte) (s7 >>> 8);
            bArr[i17 + 1] = (byte) s7;
            int i19 = i17 + 2;
            short s8 = sendAccessiBilityEventListener.length;
            bArr[i19 + 0] = (byte) (s8 >>> 8);
            bArr[i19 + 1] = (byte) s8;
            int i20 = i19 + 2;
            short s9 = sendAccessiBilityEventListener.getMax;
            bArr[i20 + 0] = (byte) (s9 >>> 8);
            bArr[i20 + 1] = (byte) s9;
            int i21 = i20 + 2;
            if (!sendAccessiBilityEventListener.setMax) {
                bArr[i21 + 0] = 0;
                bArr[i21 + 1] = 0;
                i17 = i21 + 2;
            } else {
                bArr[i21 + 0] = 0;
                bArr[i21 + 1] = 1;
                int i22 = i21 + 2;
                short s10 = sendAccessiBilityEventListener.setMin;
                bArr[i22 + 0] = (byte) (s10 >>> 8);
                bArr[i22 + 1] = (byte) s10;
                int i23 = i22 + 2;
                short s11 = sendAccessiBilityEventListener.IsOverlapping;
                bArr[i23 + 0] = (byte) (s11 >>> 8);
                bArr[i23 + 1] = (byte) s11;
                int i24 = i23 + 2;
                short s12 = sendAccessiBilityEventListener.toIntRange;
                bArr[i24 + 0] = (byte) (s12 >>> 8);
                bArr[i24 + 1] = (byte) s12;
                int i25 = i24 + 2;
                int i26 = sendAccessiBilityEventListener.isInside;
                bArr[i25 + 0] = (byte) (i26 >>> 8);
                bArr[i25 + 1] = (byte) i26;
                i17 = i25 + 2;
            }
        }
        int size4 = this.Mean$Arithmetic.size();
        bArr[i17 + 0] = (byte) (size4 >>> 8);
        bArr[i17 + 1] = (byte) size4;
        int i27 = i17 + 2;
        for (int i28 = 0; i28 < this.Mean$Arithmetic.size(); i28++) {
            setEventListener seteventlistener = (setEventListener) this.Mean$Arithmetic.get(i28);
            short s13 = seteventlistener.setMin;
            bArr[i27 + 0] = (byte) (s13 >>> 8);
            bArr[i27 + 1] = (byte) s13;
            int i29 = i27 + 2;
            short s14 = seteventlistener.setMax;
            bArr[i29 + 0] = (byte) (s14 >>> 8);
            bArr[i29 + 1] = (byte) s14;
            int i30 = i29 + 2;
            short s15 = seteventlistener.length;
            bArr[i30 + 0] = (byte) (s15 >>> 8);
            bArr[i30 + 1] = (byte) s15;
            int i31 = i30 + 2;
            bArr[i31 + 0] = 0;
            bArr[i31 + 1] = 1;
            int i32 = i31 + 2;
            System.arraycopy(seteventlistener.equals, 0, bArr, i32, seteventlistener.equals.length);
            i27 = i32 + seteventlistener.equals.length;
        }
        bArr[i27 + 0] = (byte) (i >>> 8);
        bArr[i27 + 1] = (byte) i;
        int i33 = i27 + 2;
        if (this.asInterface != null) {
            bArr[i33 + 0] = (byte) (s >>> 8);
            bArr[i33 + 1] = (byte) s;
            int max2 = getMax(this.asBinder + 2, bArr, i33 + 2);
            int size5 = this.asInterface.size();
            bArr[max2 + 0] = (byte) (size5 >>> 8);
            bArr[max2 + 1] = (byte) size5;
            i33 = max2 + 2;
            for (int i34 = 0; i34 < this.asInterface.size(); i34++) {
                length length2 = (length) this.asInterface.get(i34);
                System.arraycopy(length2.setMin, 0, bArr, i33, length2.setMin.length);
                i33 += length2.setMin.length;
            }
        }
        if (this.b != 0) {
            bArr[i33 + 0] = (byte) (s2 >>> 8);
            bArr[i33 + 1] = (byte) s2;
            int max3 = getMax(2, bArr, i33 + 2);
            short s16 = this.b;
            bArr[max3 + 0] = (byte) (s16 >>> 8);
            bArr[max3 + 1] = (byte) s16;
            i33 = max3 + 2;
        }
        if (i33 == i5) {
            return bArr;
        }
        throw new RuntimeException();
    }

    private static void values(int i) {
        String str;
        if (i < 0) {
            str = "Stack underflow: ".concat(String.valueOf(i));
        } else {
            str = "Too big stack: ".concat(String.valueOf(i));
        }
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int toIntRange(java.lang.String r15) {
        /*
            int r0 = r15.length()
            r1 = 41
            int r1 = r15.lastIndexOf(r1)
            r2 = 3
            if (r2 > r0) goto L_0x00aa
            r2 = 0
            char r3 = r15.charAt(r2)
            r4 = 40
            if (r3 != r4) goto L_0x00aa
            if (r1 <= 0) goto L_0x00aa
            int r3 = r1 + 1
            if (r3 >= r0) goto L_0x00aa
            r0 = 1
            r4 = 1
            r5 = 0
            r6 = 0
        L_0x0020:
            r7 = 91
            r8 = 90
            r9 = 74
            r10 = 73
            r11 = 83
            r12 = 76
            r13 = 70
            if (r4 == r1) goto L_0x007c
            char r14 = r15.charAt(r4)
            if (r14 == r13) goto L_0x0075
            if (r14 == r12) goto L_0x0061
            if (r14 == r11) goto L_0x0075
            if (r14 == r10) goto L_0x0075
            if (r14 == r9) goto L_0x005e
            if (r14 == r8) goto L_0x0075
            if (r14 == r7) goto L_0x0047
            switch(r14) {
                case 66: goto L_0x0075;
                case 67: goto L_0x0075;
                case 68: goto L_0x005e;
                default: goto L_0x0045;
            }
        L_0x0045:
            r1 = 0
            goto L_0x007d
        L_0x0047:
            int r4 = r4 + r0
            char r14 = r15.charAt(r4)
            if (r14 == r7) goto L_0x0047
            if (r14 == r13) goto L_0x0075
            if (r14 == r12) goto L_0x0061
            if (r14 == r11) goto L_0x0075
            if (r14 == r8) goto L_0x0075
            if (r14 == r10) goto L_0x0075
            if (r14 == r9) goto L_0x0075
            switch(r14) {
                case 66: goto L_0x0075;
                case 67: goto L_0x0075;
                case 68: goto L_0x0075;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0045
        L_0x005e:
            int r5 = r5 + -1
            goto L_0x0075
        L_0x0061:
            int r5 = r5 + -1
            int r6 = r6 + 1
            int r4 = r4 + r0
            r14 = 59
            int r14 = r15.indexOf(r14, r4)
            int r4 = r4 + r0
            if (r4 > r14) goto L_0x0045
            if (r14 < r1) goto L_0x0072
            goto L_0x0045
        L_0x0072:
            int r4 = r14 + 1
            goto L_0x0020
        L_0x0075:
            int r5 = r5 + -1
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L_0x0020
        L_0x007c:
            r1 = 1
        L_0x007d:
            if (r1 == 0) goto L_0x00aa
            char r3 = r15.charAt(r3)
            if (r3 == r13) goto L_0x009e
            if (r3 == r12) goto L_0x009e
            if (r3 == r11) goto L_0x009e
            r4 = 86
            if (r3 == r4) goto L_0x009c
            if (r3 == r10) goto L_0x009e
            if (r3 == r9) goto L_0x0099
            if (r3 == r8) goto L_0x009e
            if (r3 == r7) goto L_0x009e
            switch(r3) {
                case 66: goto L_0x009e;
                case 67: goto L_0x009e;
                case 68: goto L_0x0099;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x00a0
        L_0x0099:
            int r5 = r5 + 1
            goto L_0x009e
        L_0x009c:
            r2 = r1
            goto L_0x00a0
        L_0x009e:
            int r5 = r5 + r0
            goto L_0x009c
        L_0x00a0:
            if (r2 == 0) goto L_0x00aa
            int r15 = r6 << 16
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r5
            r15 = r15 | r0
            return r15
        L_0x00aa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "Bad parameter signature: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            goto L_0x00bb
        L_0x00ba:
            throw r0
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.toIntRange(java.lang.String):int");
    }

    public static int getMin(int i, byte[] bArr, int i2) {
        bArr[i2 + 0] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        return i2 + 2;
    }

    public static int getMax(int i, byte[] bArr, int i2) {
        bArr[i2 + 0] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        return i2 + 4;
    }

    private static int FastBitmap$CoordinateSystem(int i) {
        if (i == 254 || i == 255) {
            return 0;
        }
        switch (i) {
            case 0:
            case 47:
            case 49:
            case 95:
            case 116:
            case 117:
            case 118:
            case 119:
            case 132:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
            case TsExtractor.TS_STREAM_TYPE_DTS:
            case 139:
            case 143:
            case 145:
            case 146:
            case 147:
            case 167:
            case 169:
            case 177:
            case 178:
            case 179:
            case 184:
            case 186:
            case TsExtractor.TS_PACKET_SIZE:
            case 189:
            case 190:
            case PsExtractor.AUDIO_STREAM:
            case 193:
            case 196:
            case 200:
            case 202:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 44:
            case 45:
            case 89:
            case 90:
            case 91:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
            case SavingsActivity.RV_BENEFIT_WIDTH:
            case 141:
            case 168:
            case 187:
            case 197:
            case 201:
                return 1;
            case 9:
            case 10:
            case 14:
            case 15:
            case 20:
            case 22:
            case 24:
            case 30:
            case 31:
            case 32:
            case 33:
            case 38:
            case 39:
            case 40:
            case 41:
            case 92:
            case 93:
            case 94:
                return 2;
            case 46:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 67:
            case 68:
            case 69:
            case 70:
            case 75:
            case 76:
            case 77:
            case 78:
            case 87:
            case 96:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 108:
            case 110:
            case 112:
            case 114:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 128:
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
            case 136:
            case 137:
            case 142:
            case 144:
            case 149:
            case 150:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 174:
            case 176:
            case 180:
            case 181:
            case 182:
            case 183:
            case WSContextConstant.HANDSHAKE_RECEIVE_SIZE:
            case 191:
            case 194:
            case 195:
            case 198:
            case SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR:
                return -1;
            case 55:
            case 57:
            case 63:
            case 64:
            case 65:
            case 66:
            case 71:
            case 72:
            case 73:
            case 74:
            case 88:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 109:
            case 111:
            case 113:
            case 115:
            case 127:
            case TsExtractor.TS_STREAM_TYPE_AC3:
            case 131:
            case 159:
            case BlobStatic.MONITOR_IMAGE_WIDTH:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 173:
            case 175:
                return -2;
            case 79:
            case 81:
            case 83:
            case 84:
            case 85:
            case 86:
            case 148:
            case 151:
            case 152:
                return -3;
            case 80:
            case 82:
                return -4;
            default:
                throw new IllegalArgumentException("Bad opcode: ".concat(String.valueOf(i)));
        }
    }

    public final char[] isInside(int i) {
        char[] cArr = this.ICustomTabsCallback$Default;
        if (i > cArr.length) {
            int length2 = cArr.length * 2;
            if (i <= length2) {
                i = length2;
            }
            this.ICustomTabsCallback$Default = new char[i];
        }
        return this.ICustomTabsCallback$Default;
    }

    public final void IsOverlapping(int i) {
        if (values) {
            int[] iArr = this.toIntRange;
            if (iArr == null) {
                this.toIntRange = new int[4];
            } else {
                int length2 = iArr.length;
                int i2 = this.IsOverlapping;
                if (length2 == i2) {
                    int[] iArr2 = new int[(i2 * 2)];
                    System.arraycopy(iArr, 0, iArr2, 0, i2);
                    this.toIntRange = iArr2;
                }
            }
            int[] iArr3 = this.toIntRange;
            int i3 = this.IsOverlapping;
            this.IsOverlapping = i3 + 1;
            iArr3[i3] = i;
        }
    }

    private void IsOverlapping() {
        if (values) {
            for (int i = 0; i < this.hashCode; i++) {
                IsOverlapping((int) (short) toIntRange(this.toString[i].length));
            }
            Arrays.sort(this.toIntRange, 0, this.IsOverlapping);
            int i2 = this.toIntRange[0];
            int i3 = 1;
            for (int i4 = 1; i4 < this.IsOverlapping; i4++) {
                int[] iArr = this.toIntRange;
                int i5 = iArr[i4];
                if (i2 != i5) {
                    if (i3 != i4) {
                        iArr[i3] = i5;
                    }
                    i3++;
                    i2 = i5;
                }
            }
            this.IsOverlapping = i3;
            if (this.toIntRange[i3 - 1] == this.setMin) {
                this.IsOverlapping = i3 - 1;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f A[SYNTHETIC, Splitter:B:30:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c A[SYNTHETIC, Splitter:B:38:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    static {
        /*
            r0 = 48
            r1 = 0
            r2 = 0
            java.lang.Class<org.mozilla.classfile.ClassFileWriter> r3 = org.mozilla.classfile.ClassFileWriter.class
            java.lang.String r4 = "ClassFileWriter.class"
            java.io.InputStream r2 = r3.getResourceAsStream(r4)     // Catch:{ Exception -> 0x0063, all -> 0x0055 }
            if (r2 != 0) goto L_0x0014
            java.lang.String r3 = "org/mozilla/classfile/ClassFileWriter.class"
            java.io.InputStream r2 = java.lang.ClassLoader.getSystemResourceAsStream(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0055 }
        L_0x0014:
            r3 = 8
            byte[] r4 = new byte[r3]     // Catch:{ Exception -> 0x0063, all -> 0x0055 }
            r5 = 0
        L_0x0019:
            if (r5 >= r3) goto L_0x002b
            int r6 = 8 - r5
            int r6 = r2.read(r4, r5, r6)     // Catch:{ Exception -> 0x0063, all -> 0x0055 }
            if (r6 < 0) goto L_0x0025
            int r5 = r5 + r6
            goto L_0x0019
        L_0x0025:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ Exception -> 0x0063, all -> 0x0055 }
            r3.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0055 }
            throw r3     // Catch:{ Exception -> 0x0063, all -> 0x0055 }
        L_0x002b:
            r5 = 4
            byte r5 = r4[r5]     // Catch:{ Exception -> 0x0063, all -> 0x0055 }
            int r5 = r5 << r3
            r6 = 5
            byte r6 = r4[r6]     // Catch:{ Exception -> 0x0063, all -> 0x0055 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            r6 = 6
            byte r6 = r4[r6]     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            int r3 = r6 << 8
            r6 = 7
            byte r0 = r4[r6]     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r3
            equals = r5
            toFloatRange = r0
            r3 = 50
            if (r0 < r3) goto L_0x0049
            r1 = 1
        L_0x0049:
            values = r1
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            return
        L_0x0051:
            r3 = move-exception
            goto L_0x0057
        L_0x0053:
            goto L_0x0064
        L_0x0055:
            r3 = move-exception
            r5 = 0
        L_0x0057:
            equals = r5
            toFloatRange = r0
            values = r1
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            throw r3
        L_0x0063:
            r5 = 0
        L_0x0064:
            equals = r5
            toFloatRange = r0
            values = r1
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.<clinit>():void");
    }

    final class length {
        final byte[] setMin;

        public final boolean equals(Object obj) {
            return (obj instanceof length) && Arrays.equals(this.setMin, ((length) obj).setMin);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.setMin) ^ -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(int r5) {
        /*
            r4 = this;
            r0 = 254(0xfe, float:3.56E-43)
            r1 = 1
            if (r5 == r0) goto L_0x0025
            r0 = 255(0xff, float:3.57E-43)
            if (r5 == r0) goto L_0x0025
            switch(r5) {
                case 0: goto L_0x0025;
                case 1: goto L_0x0025;
                case 2: goto L_0x0025;
                case 3: goto L_0x0025;
                case 4: goto L_0x0025;
                case 5: goto L_0x0025;
                case 6: goto L_0x0025;
                case 7: goto L_0x0025;
                case 8: goto L_0x0025;
                case 9: goto L_0x0025;
                case 10: goto L_0x0025;
                case 11: goto L_0x0025;
                case 12: goto L_0x0025;
                case 13: goto L_0x0025;
                case 14: goto L_0x0025;
                case 15: goto L_0x0025;
                case 16: goto L_0x0023;
                case 17: goto L_0x0023;
                case 18: goto L_0x0023;
                case 19: goto L_0x0023;
                case 20: goto L_0x0023;
                case 21: goto L_0x0023;
                case 22: goto L_0x0023;
                case 23: goto L_0x0023;
                case 24: goto L_0x0023;
                case 25: goto L_0x0023;
                case 26: goto L_0x0025;
                case 27: goto L_0x0025;
                case 28: goto L_0x0025;
                case 29: goto L_0x0025;
                case 30: goto L_0x0025;
                case 31: goto L_0x0025;
                case 32: goto L_0x0025;
                case 33: goto L_0x0025;
                case 34: goto L_0x0025;
                case 35: goto L_0x0025;
                case 36: goto L_0x0025;
                case 37: goto L_0x0025;
                case 38: goto L_0x0025;
                case 39: goto L_0x0025;
                case 40: goto L_0x0025;
                case 41: goto L_0x0025;
                case 42: goto L_0x0025;
                case 43: goto L_0x0025;
                case 44: goto L_0x0025;
                case 45: goto L_0x0025;
                case 46: goto L_0x0025;
                case 47: goto L_0x0025;
                case 48: goto L_0x0025;
                case 49: goto L_0x0025;
                case 50: goto L_0x0025;
                case 51: goto L_0x0025;
                case 52: goto L_0x0025;
                case 53: goto L_0x0025;
                case 54: goto L_0x0023;
                case 55: goto L_0x0023;
                case 56: goto L_0x0023;
                case 57: goto L_0x0023;
                case 58: goto L_0x0023;
                case 59: goto L_0x0025;
                case 60: goto L_0x0025;
                case 61: goto L_0x0025;
                case 62: goto L_0x0025;
                case 63: goto L_0x0025;
                case 64: goto L_0x0025;
                case 65: goto L_0x0025;
                case 66: goto L_0x0025;
                case 67: goto L_0x0025;
                case 68: goto L_0x0025;
                case 69: goto L_0x0025;
                case 70: goto L_0x0025;
                case 71: goto L_0x0025;
                case 72: goto L_0x0025;
                case 73: goto L_0x0025;
                case 74: goto L_0x0025;
                case 75: goto L_0x0025;
                case 76: goto L_0x0025;
                case 77: goto L_0x0025;
                case 78: goto L_0x0025;
                case 79: goto L_0x0025;
                case 80: goto L_0x0025;
                case 81: goto L_0x0025;
                case 82: goto L_0x0025;
                case 83: goto L_0x0025;
                case 84: goto L_0x0025;
                case 85: goto L_0x0025;
                case 86: goto L_0x0025;
                case 87: goto L_0x0025;
                case 88: goto L_0x0025;
                case 89: goto L_0x0025;
                case 90: goto L_0x0025;
                case 91: goto L_0x0025;
                case 92: goto L_0x0025;
                case 93: goto L_0x0025;
                case 94: goto L_0x0025;
                case 95: goto L_0x0025;
                case 96: goto L_0x0025;
                case 97: goto L_0x0025;
                case 98: goto L_0x0025;
                case 99: goto L_0x0025;
                case 100: goto L_0x0025;
                case 101: goto L_0x0025;
                case 102: goto L_0x0025;
                case 103: goto L_0x0025;
                case 104: goto L_0x0025;
                case 105: goto L_0x0025;
                case 106: goto L_0x0025;
                case 107: goto L_0x0025;
                case 108: goto L_0x0025;
                case 109: goto L_0x0025;
                case 110: goto L_0x0025;
                case 111: goto L_0x0025;
                case 112: goto L_0x0025;
                case 113: goto L_0x0025;
                case 114: goto L_0x0025;
                case 115: goto L_0x0025;
                case 116: goto L_0x0025;
                case 117: goto L_0x0025;
                case 118: goto L_0x0025;
                case 119: goto L_0x0025;
                case 120: goto L_0x0025;
                case 121: goto L_0x0025;
                case 122: goto L_0x0025;
                case 123: goto L_0x0025;
                case 124: goto L_0x0025;
                case 125: goto L_0x0025;
                case 126: goto L_0x0025;
                case 127: goto L_0x0025;
                case 128: goto L_0x0025;
                case 129: goto L_0x0025;
                case 130: goto L_0x0025;
                case 131: goto L_0x0025;
                case 132: goto L_0x0021;
                case 133: goto L_0x0025;
                case 134: goto L_0x0025;
                case 135: goto L_0x0025;
                case 136: goto L_0x0025;
                case 137: goto L_0x0025;
                case 138: goto L_0x0025;
                case 139: goto L_0x0025;
                case 140: goto L_0x0025;
                case 141: goto L_0x0025;
                case 142: goto L_0x0025;
                case 143: goto L_0x0025;
                case 144: goto L_0x0025;
                case 145: goto L_0x0025;
                case 146: goto L_0x0025;
                case 147: goto L_0x0025;
                case 148: goto L_0x0025;
                case 149: goto L_0x0025;
                case 150: goto L_0x0025;
                case 151: goto L_0x0025;
                case 152: goto L_0x0025;
                case 153: goto L_0x0023;
                case 154: goto L_0x0023;
                case 155: goto L_0x0023;
                case 156: goto L_0x0023;
                case 157: goto L_0x0023;
                case 158: goto L_0x0023;
                case 159: goto L_0x0023;
                case 160: goto L_0x0023;
                case 161: goto L_0x0023;
                case 162: goto L_0x0023;
                case 163: goto L_0x0023;
                case 164: goto L_0x0023;
                case 165: goto L_0x0023;
                case 166: goto L_0x0023;
                case 167: goto L_0x0023;
                case 168: goto L_0x0023;
                case 169: goto L_0x0023;
                case 170: goto L_0x001f;
                case 171: goto L_0x001f;
                case 172: goto L_0x0025;
                case 173: goto L_0x0025;
                case 174: goto L_0x0025;
                case 175: goto L_0x0025;
                case 176: goto L_0x0025;
                case 177: goto L_0x0025;
                case 178: goto L_0x0023;
                case 179: goto L_0x0023;
                case 180: goto L_0x0023;
                case 181: goto L_0x0023;
                case 182: goto L_0x0023;
                case 183: goto L_0x0023;
                case 184: goto L_0x0023;
                case 185: goto L_0x0023;
                default: goto L_0x000c;
            }
        L_0x000c:
            switch(r5) {
                case 187: goto L_0x0023;
                case 188: goto L_0x0023;
                case 189: goto L_0x0023;
                case 190: goto L_0x0025;
                case 191: goto L_0x0025;
                case 192: goto L_0x0023;
                case 193: goto L_0x0023;
                case 194: goto L_0x0025;
                case 195: goto L_0x0025;
                case 196: goto L_0x0025;
                case 197: goto L_0x0021;
                case 198: goto L_0x0023;
                case 199: goto L_0x0023;
                case 200: goto L_0x0023;
                case 201: goto L_0x0023;
                case 202: goto L_0x0025;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Bad opcode: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L_0x001f:
            r0 = -1
            goto L_0x0026
        L_0x0021:
            r0 = 2
            goto L_0x0026
        L_0x0023:
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 != 0) goto L_0x0054
            short r0 = r4.getMin
            int r2 = FastBitmap$CoordinateSystem((int) r5)
            int r0 = r0 + r2
            if (r0 < 0) goto L_0x0035
            r2 = 32767(0x7fff, float:4.5916E-41)
            if (r2 >= r0) goto L_0x0038
        L_0x0035:
            values(r0)
        L_0x0038:
            int r1 = r4.toString(r1)
            byte[] r2 = r4.valueOf
            byte r3 = (byte) r5
            r2[r1] = r3
            short r1 = (short) r0
            r4.getMin = r1
            short r2 = r4.Grayscale$Algorithm
            if (r0 <= r2) goto L_0x004a
            r4.Grayscale$Algorithm = r1
        L_0x004a:
            r0 = 191(0xbf, float:2.68E-43)
            if (r5 != r0) goto L_0x0053
            int r5 = r4.setMin
            r4.IsOverlapping((int) r5)
        L_0x0053:
            return
        L_0x0054:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unexpected operands"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.setMax(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] setMin(org.mozilla.classfile.ClassFileWriter r10) {
        /*
            short r0 = r10.invokeSuspend
            int[] r0 = new int[r0]
            o.setEventListener r1 = r10.invoke
            short r1 = r1.getMin()
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x002e
            o.setEventListener r1 = r10.invoke
            java.lang.String r1 = r1.getMin
            java.lang.String r4 = "<init>"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0020
            r1 = 6
            r0[r2] = r1
            goto L_0x002c
        L_0x0020:
            short r1 = r10.create
            r4 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r4
            int r1 = r1 << 8
            r1 = r1 | 7
            r0[r2] = r1
        L_0x002c:
            r1 = 1
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            o.setEventListener r4 = r10.invoke
            java.lang.String r4 = r4.getMax
            r5 = 40
            int r5 = r4.indexOf(r5)
            r6 = 41
            int r6 = r4.indexOf(r6)
            if (r5 != 0) goto L_0x00ae
            if (r6 < 0) goto L_0x00ae
            int r5 = r5 + r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        L_0x0049:
            if (r5 >= r6) goto L_0x00ad
            char r8 = r4.charAt(r5)
            r9 = 70
            if (r8 == r9) goto L_0x0085
            r9 = 76
            if (r8 == r9) goto L_0x0075
            r9 = 83
            if (r8 == r9) goto L_0x0085
            r9 = 73
            if (r8 == r9) goto L_0x0085
            r9 = 74
            if (r8 == r9) goto L_0x0085
            r9 = 90
            if (r8 == r9) goto L_0x0085
            r9 = 91
            if (r8 == r9) goto L_0x006f
            switch(r8) {
                case 66: goto L_0x0085;
                case 67: goto L_0x0085;
                case 68: goto L_0x0085;
                default: goto L_0x006e;
            }
        L_0x006e:
            goto L_0x008e
        L_0x006f:
            r7.append(r9)
            int r5 = r5 + 1
            goto L_0x0049
        L_0x0075:
            r8 = 59
            int r8 = r4.indexOf(r8, r5)
            int r8 = r8 + r3
            java.lang.String r5 = r4.substring(r5, r8)
            r7.append(r5)
            r5 = r8
            goto L_0x008e
        L_0x0085:
            char r8 = r4.charAt(r5)
            r7.append(r8)
            int r5 = r5 + 1
        L_0x008e:
            java.lang.String r8 = r7.toString()
            java.lang.String r8 = isInside((java.lang.String) r8)
            o.SecureMoneyKeyboard r9 = r10.getMax
            int r8 = o.announceTextOut.getMin(r8, r9)
            int r9 = r1 + 1
            r0[r1] = r8
            boolean r1 = o.announceTextOut.getMin(r8)
            if (r1 == 0) goto L_0x00a8
            int r9 = r9 + 1
        L_0x00a8:
            r1 = r9
            r7.setLength(r2)
            goto L_0x0049
        L_0x00ad:
            return r0
        L_0x00ae:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bad method type"
            r10.<init>(r0)
            goto L_0x00b7
        L_0x00b6:
            throw r10
        L_0x00b7:
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.setMin(org.mozilla.classfile.ClassFileWriter):int[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        return 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int getMin(int r3, boolean r4) {
        /*
            r0 = 254(0xfe, float:3.56E-43)
            if (r3 == r0) goto L_0x002e
            r0 = 255(0xff, float:3.57E-43)
            if (r3 == r0) goto L_0x002e
            r0 = 5
            r1 = 2
            r2 = 3
            switch(r3) {
                case 0: goto L_0x002e;
                case 1: goto L_0x002e;
                case 2: goto L_0x002e;
                case 3: goto L_0x002e;
                case 4: goto L_0x002e;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                case 7: goto L_0x002e;
                case 8: goto L_0x002e;
                case 9: goto L_0x002e;
                case 10: goto L_0x002e;
                case 11: goto L_0x002e;
                case 12: goto L_0x002e;
                case 13: goto L_0x002e;
                case 14: goto L_0x002e;
                case 15: goto L_0x002e;
                case 16: goto L_0x002d;
                case 17: goto L_0x002c;
                case 18: goto L_0x002d;
                case 19: goto L_0x002c;
                case 20: goto L_0x002c;
                case 21: goto L_0x0028;
                case 22: goto L_0x0028;
                case 23: goto L_0x0028;
                case 24: goto L_0x0028;
                case 25: goto L_0x0028;
                case 26: goto L_0x002e;
                case 27: goto L_0x002e;
                case 28: goto L_0x002e;
                case 29: goto L_0x002e;
                case 30: goto L_0x002e;
                case 31: goto L_0x002e;
                case 32: goto L_0x002e;
                case 33: goto L_0x002e;
                case 34: goto L_0x002e;
                case 35: goto L_0x002e;
                case 36: goto L_0x002e;
                case 37: goto L_0x002e;
                case 38: goto L_0x002e;
                case 39: goto L_0x002e;
                case 40: goto L_0x002e;
                case 41: goto L_0x002e;
                case 42: goto L_0x002e;
                case 43: goto L_0x002e;
                case 44: goto L_0x002e;
                case 45: goto L_0x002e;
                case 46: goto L_0x002e;
                case 47: goto L_0x002e;
                case 48: goto L_0x002e;
                case 49: goto L_0x002e;
                case 50: goto L_0x002e;
                case 51: goto L_0x002e;
                case 52: goto L_0x002e;
                case 53: goto L_0x002e;
                case 54: goto L_0x0028;
                case 55: goto L_0x0028;
                case 56: goto L_0x0028;
                case 57: goto L_0x0028;
                case 58: goto L_0x0028;
                case 59: goto L_0x002e;
                case 60: goto L_0x002e;
                case 61: goto L_0x002e;
                case 62: goto L_0x002e;
                case 63: goto L_0x002e;
                case 64: goto L_0x002e;
                case 65: goto L_0x002e;
                case 66: goto L_0x002e;
                case 67: goto L_0x002e;
                case 68: goto L_0x002e;
                case 69: goto L_0x002e;
                case 70: goto L_0x002e;
                case 71: goto L_0x002e;
                case 72: goto L_0x002e;
                case 73: goto L_0x002e;
                case 74: goto L_0x002e;
                case 75: goto L_0x002e;
                case 76: goto L_0x002e;
                case 77: goto L_0x002e;
                case 78: goto L_0x002e;
                case 79: goto L_0x002e;
                case 80: goto L_0x002e;
                case 81: goto L_0x002e;
                case 82: goto L_0x002e;
                case 83: goto L_0x002e;
                case 84: goto L_0x002e;
                case 85: goto L_0x002e;
                case 86: goto L_0x002e;
                case 87: goto L_0x002e;
                case 88: goto L_0x002e;
                case 89: goto L_0x002e;
                case 90: goto L_0x002e;
                case 91: goto L_0x002e;
                case 92: goto L_0x002e;
                case 93: goto L_0x002e;
                case 94: goto L_0x002e;
                case 95: goto L_0x002e;
                case 96: goto L_0x002e;
                case 97: goto L_0x002e;
                case 98: goto L_0x002e;
                case 99: goto L_0x002e;
                case 100: goto L_0x002e;
                case 101: goto L_0x002e;
                case 102: goto L_0x002e;
                case 103: goto L_0x002e;
                case 104: goto L_0x002e;
                case 105: goto L_0x002e;
                case 106: goto L_0x002e;
                case 107: goto L_0x002e;
                case 108: goto L_0x002e;
                case 109: goto L_0x002e;
                case 110: goto L_0x002e;
                case 111: goto L_0x002e;
                case 112: goto L_0x002e;
                case 113: goto L_0x002e;
                case 114: goto L_0x002e;
                case 115: goto L_0x002e;
                case 116: goto L_0x002e;
                case 117: goto L_0x002e;
                case 118: goto L_0x002e;
                case 119: goto L_0x002e;
                case 120: goto L_0x002e;
                case 121: goto L_0x002e;
                case 122: goto L_0x002e;
                case 123: goto L_0x002e;
                case 124: goto L_0x002e;
                case 125: goto L_0x002e;
                case 126: goto L_0x002e;
                case 127: goto L_0x002e;
                case 128: goto L_0x002e;
                case 129: goto L_0x002e;
                case 130: goto L_0x002e;
                case 131: goto L_0x002e;
                case 132: goto L_0x0024;
                case 133: goto L_0x002e;
                case 134: goto L_0x002e;
                case 135: goto L_0x002e;
                case 136: goto L_0x002e;
                case 137: goto L_0x002e;
                case 138: goto L_0x002e;
                case 139: goto L_0x002e;
                case 140: goto L_0x002e;
                case 141: goto L_0x002e;
                case 142: goto L_0x002e;
                case 143: goto L_0x002e;
                case 144: goto L_0x002e;
                case 145: goto L_0x002e;
                case 146: goto L_0x002e;
                case 147: goto L_0x002e;
                case 148: goto L_0x002e;
                case 149: goto L_0x002e;
                case 150: goto L_0x002e;
                case 151: goto L_0x002e;
                case 152: goto L_0x002e;
                case 153: goto L_0x002c;
                case 154: goto L_0x002c;
                case 155: goto L_0x002c;
                case 156: goto L_0x002c;
                case 157: goto L_0x002c;
                case 158: goto L_0x002c;
                case 159: goto L_0x002c;
                case 160: goto L_0x002c;
                case 161: goto L_0x002c;
                case 162: goto L_0x002c;
                case 163: goto L_0x002c;
                case 164: goto L_0x002c;
                case 165: goto L_0x002c;
                case 166: goto L_0x002c;
                case 167: goto L_0x002c;
                case 168: goto L_0x002c;
                case 169: goto L_0x0028;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r3) {
                case 172: goto L_0x002e;
                case 173: goto L_0x002e;
                case 174: goto L_0x002e;
                case 175: goto L_0x002e;
                case 176: goto L_0x002e;
                case 177: goto L_0x002e;
                case 178: goto L_0x002c;
                case 179: goto L_0x002c;
                case 180: goto L_0x002c;
                case 181: goto L_0x002c;
                case 182: goto L_0x002c;
                case 183: goto L_0x002c;
                case 184: goto L_0x002c;
                case 185: goto L_0x0023;
                case 186: goto L_0x0023;
                case 187: goto L_0x002c;
                case 188: goto L_0x002d;
                case 189: goto L_0x002c;
                case 190: goto L_0x002e;
                case 191: goto L_0x002e;
                case 192: goto L_0x002c;
                case 193: goto L_0x002c;
                case 194: goto L_0x002e;
                case 195: goto L_0x002e;
                case 196: goto L_0x002e;
                case 197: goto L_0x0021;
                case 198: goto L_0x002c;
                case 199: goto L_0x002c;
                case 200: goto L_0x0023;
                case 201: goto L_0x0023;
                case 202: goto L_0x002e;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Bad opcode: "
            java.lang.String r3 = r0.concat(r3)
            r4.<init>(r3)
            throw r4
        L_0x0021:
            r3 = 4
            return r3
        L_0x0023:
            return r0
        L_0x0024:
            if (r4 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        L_0x0028:
            if (r4 == 0) goto L_0x002b
            return r2
        L_0x002b:
            return r1
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        L_0x002e:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.classfile.ClassFileWriter.getMin(int, boolean):int");
    }
}
