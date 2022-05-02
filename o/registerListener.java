package o;

import android.os.Build;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Set;
import o.unregisterListener;

final class registerListener {
    private static Set<BigInteger> FastBitmap$CoordinateSystem = null;
    private static String IsOverlapping = null;
    private static String equals = null;
    static BigInteger getMax = null;
    static BigInteger getMin = null;
    private static final unregisterListener.length hashCode = new unregisterListener.length();
    private static int invokeSuspend = 1;
    private static final unregisterListener.length isInside = new unregisterListener.length();
    static BigInteger length;
    public static final int setMax = 0;
    private static BigInteger setMin;
    private static int toDoubleRange;
    private static final String[] toFloatRange;
    private static BigInteger toIntRange;
    private static byte[] toString;
    private static final unregisterListener.length values = new unregisterListener.length();

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r7v0 ?, r7v1 ?, r7v5 ?, r7v3 ?, r7v2 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    private static java.lang.String getMin(
/*
Method generation error in method: o.registerListener.getMin(int, short, byte):java.lang.String, dex: classes2.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
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
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    private static void length() {
        toString = new byte[]{65, 70, 79, -115, -10, -4, 58, -73, -9, -4, 4, -24, Ascii.VT, -24, 63, -70, 5, -20, -14, 8, -2, -9, -24, -8, -4, 6, -20, 2, -28, Ascii.SO, 44, -76, 7, -5, -25, -4, 2, -18, -12, 68, -38, -31, -21, -7, Ascii.VT, -13, -5, Ascii.SUB, -44, -5, -5, -21, -8, -11, -56, -6, -6, 41, -8, -54, 40, -53, -5, 38, -3, -12, -54, -4, 38, -56, 40, -50, -7, Framer.ENTER_FRAME_PREFIX, -6, 1, -12, -54, -4, -12, Framer.STDIN_FRAME_PREFIX, -59, -3, -11, -59, -17, 2, -15, -4, -12, 2, -4, 58, -59, -26, 5, -10, 1, 47, -65, -14, -11, -8, -9, -52, -10, 39, -9, -5, -54, -5, 36, -2, -56, 36, 2, -11, -6, -8, -10, -51, 39, -51, Framer.ENTER_FRAME_PREFIX, 1, -12, -50, -9, -6, -10, Framer.STDIN_FRAME_PREFIX, -13, -7, -9, -72, -9, -4, 5, -75, -13, -1, -8, 8, -15, 55, -58, -26, 5, -10, 1, 47, -73, -9, -4, -8, -12, -5, -5, -21, -8, -72, -9, -4, 5, Framer.STDIN_FRAME_PREFIX, -5, -8, 0, -8, -57, -6, 34, -3, -10, -50, 38, -10, -50, 39, -5, -54, -8, 40, -11, -1, -6, -7, -57, -9, -6, -4, -6, -9, -9, -6, -8, 38, -6, -4, -12, -5, -53, -7, -9, Framer.STDIN_FRAME_PREFIX, -56, 35, -4, -50, Framer.ENTER_FRAME_PREFIX, -47, Framer.ENTER_FRAME_PREFIX, 0, -59, -4, 40, -53, -8, 36, -53, 39, -1, -14, 1, -13, -3, -55, -4, 58, -73, -9, -4, 4, -24, Ascii.VT, -24, 63, -70, -9, 4, -8, -14, -10, 76, -20, -27, -15, -1, -12, -4, -51, -7, -12, -3, -7, 39, -8, -4, -59, 44, -13, -48, 38, -2, -14, -9, -3, -3, -9, -58, 41, -7, -9, -49, -7, -10, -4, -5, -22, 36, -44, -12, -8, Ascii.FF, -20, 4, -9, 35, -50, 36, -1, -10, -7, -56, -6, -4, -8, 38, -52, 40, -9, -50, 39, -57, 42, -6, -54, 40, -10, -10, 0, -7, -10, -54, -8, -6, 42, -57, 2, 8};
        setMax = 112;
    }

    registerListener() {
    }

    static {
        length();
        byte[] bArr = toString;
        getMax = new BigInteger(getMin((byte) (-bArr[54]), 153, (byte) (-bArr[41])), 16);
        byte[] bArr2 = toString;
        setMin = new BigInteger(getMin((byte) (-bArr2[273]), (short) (-bArr2[134]), (byte) (-bArr2[41])), 16);
        byte[] bArr3 = toString;
        toIntRange = new BigInteger(getMin((byte) (-bArr3[71]), 215, (byte) (-bArr3[41])), 16);
        short s = (short) (-toString[41]);
        length = new BigInteger(getMin(98, s, (byte) s), 16);
        int i = setMax;
        getMin = new BigInteger(getMin(100, (short) ((i & 10) | (i ^ 10)), (byte) (-toString[41])), 16);
        byte[] bArr4 = toString;
        new BigInteger(getMin((byte) (-bArr4[273]), 265, (byte) (-bArr4[41])), 16);
        int i2 = setMax;
        int i3 = setMax;
        int i4 = setMax;
        toFloatRange = new String[]{getMin((byte) (((i2 | 2) << 1) - (i2 ^ 2)), 227, (byte) toString[283]), getMin((byte) ((i3 & 2) + (i3 | 2)), 91, (byte) (-toString[87])), getMin((byte) ((i4 ^ 2) + ((i4 & 2) << 1)), 313, (byte) (-toString[278]))};
        int i5 = toDoubleRange;
        int i6 = (i5 ^ 57) + ((i5 & 57) << 1);
        invokeSuspend = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(3:20|21|22)|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0078 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[SYNTHETIC, Splitter:B:20:0x006b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set<java.math.BigInteger> setMin(android.content.Context r10, o.unregisterListener.length r11) {
        /*
            int r0 = toDoubleRange
            int r0 = r0 + 107
            int r1 = r0 % 128
            invokeSuspend = r1
            r1 = 2
            int r0 = r0 % r1
            java.util.Set<java.math.BigInteger> r0 = FastBitmap$CoordinateSystem
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x012a
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            FastBitmap$CoordinateSystem = r0
            byte[] r0 = toString     // Catch:{  }
            r4 = 98
            byte r0 = r0[r4]     // Catch:{  }
            byte r0 = (byte) r0     // Catch:{  }
            r4 = 180(0xb4, float:2.52E-43)
            byte[] r5 = toString     // Catch:{  }
            r6 = 85
            byte r5 = r5[r6]     // Catch:{  }
            int r5 = -r5
            byte r5 = (byte) r5     // Catch:{  }
            java.lang.String r0 = getMin(r0, r4, r5)     // Catch:{  }
            o.unregisterListener$length r4 = hashCode     // Catch:{  }
            java.io.File r0 = o.unregisterListener.setMin(r0, r4)     // Catch:{  }
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0068 }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ all -> 0x0068 }
            r6.<init>(r0)     // Catch:{ all -> 0x0068 }
            r5.<init>(r6)     // Catch:{ all -> 0x0068 }
        L_0x003d:
            java.lang.String r0 = r5.readLine()     // Catch:{ all -> 0x0065 }
            byte[] r0 = length((java.lang.String) r0)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x005f
            java.util.Set<java.math.BigInteger> r4 = FastBitmap$CoordinateSystem     // Catch:{ all -> 0x0065 }
            java.math.BigInteger r6 = new java.math.BigInteger     // Catch:{ all -> 0x0065 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0065 }
            r4.add(r6)     // Catch:{ all -> 0x0065 }
            int r0 = toDoubleRange
            r4 = r0 | 51
            int r4 = r4 << r3
            r0 = r0 ^ 51
            int r4 = r4 - r0
            int r0 = r4 % 128
            invokeSuspend = r0
            int r4 = r4 % r1
            goto L_0x003d
        L_0x005f:
            r5.close()     // Catch:{ Exception -> 0x0063 }
            goto L_0x0079
        L_0x0063:
            goto L_0x0079
        L_0x0065:
            r0 = move-exception
            r4 = r5
            goto L_0x0069
        L_0x0068:
            r0 = move-exception
        L_0x0069:
            if (r4 == 0) goto L_0x0078
            r4.close()     // Catch:{ IOException -> 0x0078 }
            int r4 = invokeSuspend
            int r4 = r4 + 70
            int r4 = r4 - r3
            int r5 = r4 % 128
            toDoubleRange = r5
            int r4 = r4 % r1
        L_0x0078:
            throw r0     // Catch:{  }
        L_0x0079:
            java.util.Set<java.math.BigInteger> r0 = FastBitmap$CoordinateSystem
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0083
            r0 = 0
            goto L_0x0084
        L_0x0083:
            r0 = 1
        L_0x0084:
            if (r0 == r3) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            r0 = 0
        L_0x0088:
            java.lang.String[] r4 = toFloatRange
            int r4 = r4.length
            if (r0 < r4) goto L_0x00b0
        L_0x008d:
            java.util.Set<java.math.BigInteger> r10 = FastBitmap$CoordinateSystem
            r0 = 5
            java.math.BigInteger[] r0 = new java.math.BigInteger[r0]
            java.math.BigInteger r4 = getMax
            r0[r2] = r4
            java.math.BigInteger r4 = setMin
            r0[r3] = r4
            java.math.BigInteger r4 = toIntRange
            r0[r1] = r4
            r4 = 3
            java.math.BigInteger r5 = length
            r0[r4] = r5
            r4 = 4
            java.math.BigInteger r5 = getMin
            r0[r4] = r5
            java.util.List r0 = java.util.Arrays.asList(r0)
            r10.retainAll(r0)
            goto L_0x012a
        L_0x00b0:
            int r4 = invokeSuspend
            r5 = r4 | 25
            int r5 = r5 << r3
            r4 = r4 ^ 25
            int r5 = r5 - r4
            int r4 = r5 % 128
            toDoubleRange = r4
            int r5 = r5 % r1
            java.lang.String[] r4 = toFloatRange
            r4 = r4[r0]
            o.unregisterListener$length r5 = hashCode
            java.lang.String r4 = o.unregisterListener.getMax((android.content.Context) r10, (java.lang.String) r4, (o.unregisterListener.length) r5)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0111
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String[] r6 = toFloatRange
            r6 = r6[r0]
            r5.append(r6)
            r6 = 61
            byte[] r7 = toString
            r8 = 41
            byte r8 = r7[r8]
            int r8 = -r8
            short r8 = (short) r8
            r9 = 167(0xa7, float:2.34E-43)
            byte r7 = r7[r9]
            byte r7 = (byte) r7
            java.lang.String r6 = getMin(r6, r8, r7)
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            byte[] r4 = length((java.lang.String) r4)
            java.util.Set<java.math.BigInteger> r5 = FastBitmap$CoordinateSystem
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r3, r4)
            r5.add(r6)
            int r4 = toDoubleRange
            r5 = r4 | 23
            int r5 = r5 << r3
            r4 = r4 ^ 23
            int r5 = r5 - r4
            int r4 = r5 % 128
            invokeSuspend = r4
            int r5 = r5 % r1
        L_0x0111:
            r4 = r0 ^ -48
            r0 = r0 & -48
            int r0 = r0 << r3
            int r4 = r4 + r0
            r0 = r4 & 49
            r4 = r4 | 49
            int r0 = r0 + r4
            int r4 = invokeSuspend
            r5 = r4 & 19
            r4 = r4 | 19
            int r5 = r5 + r4
            int r4 = r5 % 128
            toDoubleRange = r4
            int r5 = r5 % r1
            goto L_0x0088
        L_0x012a:
            if (r11 != 0) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r2 = 1
        L_0x012e:
            if (r2 == 0) goto L_0x0147
            int r10 = invokeSuspend
            int r10 = r10 + 83
            int r0 = r10 % 128
            toDoubleRange = r0
            int r10 = r10 % r1
            o.unregisterListener$length r10 = hashCode
            r11.getMax(r10)
            int r10 = toDoubleRange
            int r10 = r10 + 75
            int r11 = r10 % 128
            invokeSuspend = r11
            int r10 = r10 % r1
        L_0x0147:
            java.util.Set<java.math.BigInteger> r10 = FastBitmap$CoordinateSystem
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.registerListener.setMin(android.content.Context, o.unregisterListener$length):java.util.Set");
    }

    public static String setMin(unregisterListener.length length2) throws Exception {
        if (equals == null) {
            int i = invokeSuspend;
            int i2 = (i & 83) + (i | 83);
            toDoubleRange = i2 % 128;
            int i3 = i2 % 2;
            if ((Build.VERSION.SDK_INT > 26 ? '*' : 'Z') != '*') {
                int i4 = invokeSuspend;
                int i5 = (i4 & 11) + (i4 | 11);
                toDoubleRange = i5 % 128;
                int i6 = i5 % 2;
                equals = unregisterListener.getMax(getMin((byte) setMax, 314, (byte) toString[75]), false, isInside);
            } else {
                byte[] bArr = toString;
                equals = unregisterListener.getMax(getMin((byte) setMax, (short) bArr[243], (byte) bArr[10]), false, isInside);
                int i7 = invokeSuspend;
                int i8 = ((i7 | 73) << 1) - (i7 ^ 73);
                toDoubleRange = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        if ((length2 == null ? 'b' : '\'') != 'b') {
            int i10 = (invokeSuspend + 56) - 1;
            toDoubleRange = i10 % 128;
            int i11 = i10 % 2;
            length2.getMax(isInside);
            int i12 = invokeSuspend;
            int i13 = ((i12 | 37) << 1) - (i12 ^ 37);
            toDoubleRange = i13 % 128;
            int i14 = i13 % 2;
        }
        String str = equals;
        int i15 = invokeSuspend;
        int i16 = ((i15 | 69) << 1) - (i15 ^ 69);
        toDoubleRange = i16 % 128;
        int i17 = i16 % 2;
        return str;
    }

    public static String length(unregisterListener.length length2) {
        int i = (toDoubleRange + 112) - 1;
        invokeSuspend = i % 128;
        char c = 16;
        boolean z = false;
        if ((i % 2 != 0 ? '\\' : 'W') == 'W' ? IsOverlapping == null : IsOverlapping == null) {
            byte[] bArr = toString;
            String[] list = new File(getMin((byte) bArr[98], 184, (byte) bArr[10])).list();
            int length3 = list.length;
            int i2 = invokeSuspend;
            int i3 = (i2 & 11) + (i2 | 11);
            toDoubleRange = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length3) {
                String str = list[i5];
                StringBuilder sb = new StringBuilder();
                byte[] bArr2 = toString;
                sb.append(getMin((byte) bArr2[98], 158, (byte) bArr2[16]));
                sb.append(str);
                byte[] bArr3 = toString;
                sb.append(getMin((byte) bArr3[98], 234, (byte) bArr3[32]));
                String obj = sb.toString();
                byte[] bArr4 = toString;
                byte b = (byte) bArr4[167];
                String min = unregisterListener.getMin(obj, getMin(b, (short) ((b ^ 314) | (b & 314)), (byte) bArr4[167]), values);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(IsOverlapping);
                String str2 = "";
                if (!(TextUtils.isEmpty(min))) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(min);
                    byte[] bArr5 = toString;
                    byte b2 = (byte) (-bArr5[4]);
                    sb3.append(getMin(b2, (short) ((b2 ^ 224) | (b2 & 224)), (byte) bArr5[167]));
                    str2 = sb3.toString();
                } else {
                    int i6 = invokeSuspend + 55;
                    toDoubleRange = i6 % 128;
                    int i7 = i6 % 2;
                }
                sb2.append(str2);
                IsOverlapping = sb2.toString();
                i5++;
                int i8 = (invokeSuspend + 56) - 1;
                toDoubleRange = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        if (length2 != null) {
            c = '_';
        }
        if (c == '_') {
            int i10 = (invokeSuspend + 102) - 1;
            toDoubleRange = i10 % 128;
            if (i10 % 2 != 0) {
                z = true;
            }
            if (!z) {
                length2.getMax(values);
            } else {
                length2.getMax(values);
                Object obj2 = null;
                super.hashCode();
            }
        }
        return IsOverlapping;
    }

    private static byte[] length(String str) {
        int i = toDoubleRange + 119;
        invokeSuspend = i % 128;
        int i2 = i % 2;
        try {
            String min = getMin((byte) (toString[243] + 1), (short) toString[167], (byte) toString[27]);
            int i3 = toDoubleRange;
            int i4 = (i3 ^ 9) + ((i3 & 9) << 1);
            invokeSuspend = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {min};
            Class[] clsArr = null;
            MessageDigest messageDigest = (MessageDigest) Class.forName(getMin(106, 291, (byte) toString[47])).getMethod(getMin(103, (short) toString[57], (byte) (-toString[4])), new Class[]{String.class}).invoke(clsArr, objArr);
            messageDigest.update(str.getBytes());
            int i6 = invokeSuspend;
            int i7 = ((i6 | 67) << 1) - (i6 ^ 67);
            toDoubleRange = i7 % 128;
            int i8 = i7 % 2;
            byte[] bArr = (byte[]) Class.forName(getMin(106, 291, (byte) toString[47])).getMethod(getMin(100, 163, (byte) toString[16]), clsArr).invoke(messageDigest, clsArr);
            int i9 = toDoubleRange;
            int i10 = ((i9 | 47) << 1) - (i9 ^ 47);
            invokeSuspend = i10 % 128;
            if ((i10 % 2 != 0 ? '*' : 'X') == '*') {
                return bArr;
            }
            super.hashCode();
            return bArr;
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
