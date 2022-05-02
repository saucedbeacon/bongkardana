package o;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.LogItem;
import o.SecureTextView;
import o.SimplePassword;
import o.getStringId;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.WrappedException;

public class SecureQwertyKeyboard implements Serializable {
    private static final Object AKEY = "ClassCache";
    private static final long serialVersionUID = -8866246036237312215L;
    private LogUtils associatedScope;
    private volatile boolean cachingIsEnabled = true;
    private transient Map<getStringId.length, Class<?>> classAdapterCache;
    private transient Map<Class<?>, getDrawableId> classTable;
    private int generatedClassSerial;
    private transient Map<Class<?>, Object> interfaceAdapterCache;

    @Deprecated
    public boolean isInvokerOptimizationEnabled() {
        return false;
    }

    final class ShiftType implements getPublicKeyFromX509 {
        static final ShiftType setMin = new ShiftType();
        private getPublicKeyFromX509 getMin;
        private boolean setMax;

        private ShiftType() {
        }

        static getPublicKeyFromX509 length(getPublicKeyFromX509 getpublickeyfromx509) {
            ShiftType shiftType = new ShiftType();
            shiftType.setMax = true;
            shiftType.getMin = getpublickeyfromx509;
            return shiftType;
        }

        public final void length(String str, String str2, int i, String str3, int i2) {
            String str4;
            if (this.setMax) {
                if (str.startsWith("TypeError: ")) {
                    str = str.substring(11);
                    str4 = "TypeError";
                } else {
                    str4 = "SyntaxError";
                }
                throw LogItem.getMax(str4, str, str2, i, str3, i2);
            }
            getPublicKeyFromX509 getpublickeyfromx509 = this.getMin;
            if (getpublickeyfromx509 != null) {
                getpublickeyfromx509.length(str, str2, i, str3, i2);
                return;
            }
            throw getMax(str, str2, i, str3, i2);
        }

        public final EvaluatorException getMax(String str, String str2, int i, String str3, int i2) {
            getPublicKeyFromX509 getpublickeyfromx509 = this.getMin;
            if (getpublickeyfromx509 != null) {
                return getpublickeyfromx509.getMax(str, str2, i, str3, i2);
            }
            return new EvaluatorException(str, str2, i, str3, i2);
        }
    }

    final class QwertType {
        private static final double[] getMin = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
        private static final int[] length = {0, 0, 3, 2, 2};
        private static final double[] setMin = {1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};

        private static int getMax(int i) {
            int i2 = 0;
            if ((i & 7) == 0) {
                if ((65535 & i) == 0) {
                    i >>>= 16;
                    i2 = 16;
                }
                if ((i & 255) == 0) {
                    i2 += 8;
                    i >>>= 8;
                }
                if ((i & 15) == 0) {
                    i2 += 4;
                    i >>>= 4;
                }
                if ((i & 3) == 0) {
                    i2 += 2;
                    i >>>= 2;
                }
                if ((i & 1) == 0) {
                    i2++;
                    if (((i >>> 1) & 1) == 0) {
                        return 32;
                    }
                }
                return i2;
            } else if ((i & 1) != 0) {
                return 0;
            } else {
                return (i & 2) != 0 ? 1 : 2;
            }
        }

        private static char getMin(int i) {
            return (char) (i >= 10 ? i + 87 : i + 48);
        }

        private static int setMax(int i) {
            int i2;
            if ((-65536 & i) == 0) {
                i <<= 16;
                i2 = 16;
            } else {
                i2 = 0;
            }
            if ((-16777216 & i) == 0) {
                i2 += 8;
                i <<= 8;
            }
            if ((-268435456 & i) == 0) {
                i2 += 4;
                i <<= 4;
            }
            if ((-1073741824 & i) == 0) {
                i2 += 2;
                i <<= 2;
            }
            if ((Integer.MIN_VALUE & i) == 0) {
                i2++;
                if ((i & 1073741824) == 0) {
                    return 32;
                }
            }
            return i2;
        }

        QwertType() {
        }

        private static void getMax(byte[] bArr, int i, int i2) {
            bArr[i] = (byte) (i2 >> 24);
            bArr[i + 1] = (byte) (i2 >> 16);
            bArr[i + 2] = (byte) (i2 >> 8);
            bArr[i + 3] = (byte) i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.math.BigInteger getMin(double r8, int[] r10, int[] r11) {
            /*
                long r8 = java.lang.Double.doubleToLongBits(r8)
                r0 = 32
                long r1 = r8 >>> r0
                int r2 = (int) r1
                int r9 = (int) r8
                r8 = 1048575(0xfffff, float:1.469367E-39)
                r8 = r8 & r2
                r1 = 2147483647(0x7fffffff, float:NaN)
                r1 = r1 & r2
                int r1 = r1 >>> 20
                if (r1 == 0) goto L_0x0019
                r2 = 1048576(0x100000, float:1.469368E-39)
                r8 = r8 | r2
            L_0x0019:
                r2 = 1
                r3 = 4
                r4 = 0
                if (r9 == 0) goto L_0x003d
                r5 = 8
                byte[] r5 = new byte[r5]
                int r6 = getMax(r9)
                int r9 = r9 >>> r6
                if (r6 == 0) goto L_0x0033
                int r7 = 32 - r6
                int r7 = r8 << r7
                r9 = r9 | r7
                getMax(r5, r3, r9)
                int r8 = r8 >> r6
                goto L_0x0036
            L_0x0033:
                getMax(r5, r3, r9)
            L_0x0036:
                getMax(r5, r4, r8)
                if (r8 == 0) goto L_0x0049
                r9 = 2
                goto L_0x004a
            L_0x003d:
                byte[] r5 = new byte[r3]
                int r9 = getMax(r8)
                int r8 = r8 >>> r9
                getMax(r5, r4, r8)
                int r6 = r9 + 32
            L_0x0049:
                r9 = 1
            L_0x004a:
                if (r1 == 0) goto L_0x0058
                int r1 = r1 + -1023
                int r1 = r1 + -52
                int r1 = r1 + r6
                r10[r4] = r1
                int r8 = 53 - r6
                r11[r4] = r8
                goto L_0x0069
            L_0x0058:
                int r1 = r1 + -1023
                int r1 = r1 + -52
                int r1 = r1 + r2
                int r1 = r1 + r6
                r10[r4] = r1
                int r9 = r9 * 32
                int r8 = setMax(r8)
                int r9 = r9 - r8
                r11[r4] = r9
            L_0x0069:
                java.math.BigInteger r8 = new java.math.BigInteger
                r8.<init>(r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SecureQwertyKeyboard.QwertType.getMin(double, int[], int[]):java.math.BigInteger");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0117, code lost:
            if (r7 > 0) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0123, code lost:
            if (r9 > 0) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0132, code lost:
            if (r6.compareTo(r4) > 0) goto L_0x0125;
         */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0144 A[LOOP:0: B:52:0x00db->B:78:0x0144, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x013f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static java.lang.String getMax(int r11, double r12) {
            /*
                r0 = 2
                if (r0 > r11) goto L_0x0146
                r0 = 36
                if (r11 > r0) goto L_0x0146
                boolean r0 = java.lang.Double.isNaN(r12)
                if (r0 == 0) goto L_0x0010
                java.lang.String r11 = "NaN"
                return r11
            L_0x0010:
                boolean r0 = java.lang.Double.isInfinite(r12)
                r1 = 0
                if (r0 == 0) goto L_0x0022
                int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x001f
                java.lang.String r11 = "Infinity"
                return r11
            L_0x001f:
                java.lang.String r11 = "-Infinity"
                return r11
            L_0x0022:
                int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r0 != 0) goto L_0x0029
                java.lang.String r11 = "0"
                return r11
            L_0x0029:
                r0 = 0
                r3 = 1
                int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r4 < 0) goto L_0x0031
                r1 = 0
                goto L_0x0033
            L_0x0031:
                double r12 = -r12
                r1 = 1
            L_0x0033:
                double r4 = java.lang.Math.floor(r12)
                long r6 = (long) r4
                double r8 = (double) r6
                int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x0045
                if (r1 == 0) goto L_0x0040
                long r6 = -r6
            L_0x0040:
                java.lang.String r1 = java.lang.Long.toString(r6, r11)
                goto L_0x0079
            L_0x0045:
                long r6 = java.lang.Double.doubleToLongBits(r4)
                r2 = 52
                long r8 = r6 >> r2
                int r2 = (int) r8
                r2 = r2 & 2047(0x7ff, float:2.868E-42)
                r8 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
                if (r2 != 0) goto L_0x005a
                long r6 = r6 & r8
                long r6 = r6 << r3
                goto L_0x005e
            L_0x005a:
                long r6 = r6 & r8
                r8 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
                long r6 = r6 | r8
            L_0x005e:
                if (r1 == 0) goto L_0x0061
                long r6 = -r6
            L_0x0061:
                int r2 = r2 + -1075
                java.math.BigInteger r1 = java.math.BigInteger.valueOf(r6)
                if (r2 <= 0) goto L_0x006e
                java.math.BigInteger r1 = r1.shiftLeft(r2)
                goto L_0x0075
            L_0x006e:
                if (r2 >= 0) goto L_0x0075
                int r2 = -r2
                java.math.BigInteger r1 = r1.shiftRight(r2)
            L_0x0075:
                java.lang.String r1 = r1.toString(r11)
            L_0x0079:
                int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x007e
                return r1
            L_0x007e:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r1 = 46
                r2.append(r1)
                double r4 = r12 - r4
                long r12 = java.lang.Double.doubleToLongBits(r12)
                r1 = 32
                long r6 = r12 >> r1
                int r1 = (int) r6
                int r13 = (int) r12
                int[] r12 = new int[r3]
                int[] r6 = new int[r3]
                java.math.BigInteger r4 = getMin(r4, r12, r6)
                int r5 = r1 >>> 20
                r5 = r5 & 2047(0x7ff, float:2.868E-42)
                int r5 = -r5
                if (r5 != 0) goto L_0x00a7
                r5 = -1
            L_0x00a7:
                int r5 = r5 + 1076
                r6 = 1
                java.math.BigInteger r8 = java.math.BigInteger.valueOf(r6)
                if (r13 != 0) goto L_0x00c5
                r9 = 1048575(0xfffff, float:1.469367E-39)
                r9 = r9 & r1
                if (r9 != 0) goto L_0x00c5
                r9 = 2145386496(0x7fe00000, float:NaN)
                r1 = r1 & r9
                if (r1 == 0) goto L_0x00c5
                int r5 = r5 + 1
                r9 = 2
                java.math.BigInteger r1 = java.math.BigInteger.valueOf(r9)
                goto L_0x00c6
            L_0x00c5:
                r1 = r8
            L_0x00c6:
                r12 = r12[r0]
                int r12 = r12 + r5
                java.math.BigInteger r12 = r4.shiftLeft(r12)
                java.math.BigInteger r4 = java.math.BigInteger.valueOf(r6)
                java.math.BigInteger r4 = r4.shiftLeft(r5)
                long r5 = (long) r11
                java.math.BigInteger r5 = java.math.BigInteger.valueOf(r5)
                r11 = 0
            L_0x00db:
                java.math.BigInteger r12 = r12.multiply(r5)
                java.math.BigInteger[] r12 = r12.divideAndRemainder(r4)
                r6 = r12[r3]
                r12 = r12[r0]
                int r12 = r12.intValue()
                char r12 = (char) r12
                if (r8 != r1) goto L_0x00f4
                java.math.BigInteger r1 = r8.multiply(r5)
                r8 = r1
                goto L_0x00fd
            L_0x00f4:
                java.math.BigInteger r7 = r8.multiply(r5)
                java.math.BigInteger r1 = r1.multiply(r5)
                r8 = r7
            L_0x00fd:
                int r7 = r6.compareTo(r8)
                java.math.BigInteger r9 = r4.subtract(r1)
                int r10 = r9.signum()
                if (r10 > 0) goto L_0x010d
                r9 = 1
                goto L_0x0111
            L_0x010d:
                int r9 = r6.compareTo(r9)
            L_0x0111:
                if (r9 != 0) goto L_0x011a
                r10 = r13 & 1
                if (r10 != 0) goto L_0x011a
                if (r7 <= 0) goto L_0x0135
                goto L_0x0125
            L_0x011a:
                if (r7 < 0) goto L_0x0128
                if (r7 != 0) goto L_0x0123
                r7 = r13 & 1
                if (r7 != 0) goto L_0x0123
                goto L_0x0128
            L_0x0123:
                if (r9 <= 0) goto L_0x0136
            L_0x0125:
                int r12 = r12 + 1
                goto L_0x0135
            L_0x0128:
                if (r9 <= 0) goto L_0x0135
                java.math.BigInteger r6 = r6.shiftLeft(r3)
                int r11 = r6.compareTo(r4)
                if (r11 <= 0) goto L_0x0135
                goto L_0x0125
            L_0x0135:
                r11 = 1
            L_0x0136:
                char r12 = getMin((int) r12)
                r2.append(r12)
                if (r11 == 0) goto L_0x0144
                java.lang.String r11 = r2.toString()
                return r11
            L_0x0144:
                r12 = r6
                goto L_0x00db
            L_0x0146:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r11 = java.lang.String.valueOf(r11)
                java.lang.String r13 = "Bad base: "
                java.lang.String r11 = r13.concat(r11)
                r12.<init>(r11)
                goto L_0x0157
            L_0x0156:
                throw r12
            L_0x0157:
                goto L_0x0156
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SecureQwertyKeyboard.QwertType.getMax(int, double):java.lang.String");
        }

        private static boolean getMin(StringBuilder sb) {
            int length2 = sb.length();
            while (length2 != 0) {
                length2--;
                char charAt = sb.charAt(length2);
                if (charAt != '9') {
                    sb.setCharAt(length2, (char) (charAt + 1));
                    sb.setLength(length2 + 1);
                    return false;
                }
            }
            sb.setLength(0);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0395, code lost:
            if (r40 < (0.5d - r4)) goto L_0x0739;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:402:0x0788, code lost:
            if (r1 > r2) goto L_0x0794;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:411:0x079b, code lost:
            if (r1 <= 21) goto L_0x079e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x02a9  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x02cf  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x02d3  */
        /* JADX WARNING: Removed duplicated region for block: B:167:0x03a5  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x03b0  */
        /* JADX WARNING: Removed duplicated region for block: B:171:0x03b4  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x03da  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x0466  */
        /* JADX WARNING: Removed duplicated region for block: B:261:0x0551  */
        /* JADX WARNING: Removed duplicated region for block: B:266:0x0562  */
        /* JADX WARNING: Removed duplicated region for block: B:267:0x056b  */
        /* JADX WARNING: Removed duplicated region for block: B:270:0x0573  */
        /* JADX WARNING: Removed duplicated region for block: B:273:0x0578  */
        /* JADX WARNING: Removed duplicated region for block: B:275:0x057f  */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x0588  */
        /* JADX WARNING: Removed duplicated region for block: B:281:0x058e  */
        /* JADX WARNING: Removed duplicated region for block: B:286:0x059c  */
        /* JADX WARNING: Removed duplicated region for block: B:291:0x05ba  */
        /* JADX WARNING: Removed duplicated region for block: B:295:0x05c3  */
        /* JADX WARNING: Removed duplicated region for block: B:302:0x05ec  */
        /* JADX WARNING: Removed duplicated region for block: B:388:0x0771  */
        /* JADX WARNING: Removed duplicated region for block: B:415:0x07a4 A[LOOP:12: B:415:0x07a4->B:416:0x07ad, LOOP_START] */
        /* JADX WARNING: Removed duplicated region for block: B:420:0x07b4  */
        /* JADX WARNING: Removed duplicated region for block: B:427:0x07cb  */
        /* JADX WARNING: Removed duplicated region for block: B:438:0x07ec  */
        /* JADX WARNING: Removed duplicated region for block: B:485:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static void getMin(java.lang.StringBuilder r49, int r50, int r51, double r52) {
            /*
                r0 = r49
                r1 = r51
                r2 = 1
                boolean[] r3 = new boolean[r2]
                r4 = 2
                r5 = 0
                r6 = r50
                if (r6 != r4) goto L_0x0020
                r7 = 4921056587992461136(0x444b1ae4d6e2ef50, double:1.0E21)
                int r9 = (r52 > r7 ? 1 : (r52 == r7 ? 0 : -1))
                if (r9 >= 0) goto L_0x001f
                r7 = -4302315448862314672(0xc44b1ae4d6e2ef50, double:-1.0E21)
                int r9 = (r52 > r7 ? 1 : (r52 == r7 ? 0 : -1))
                if (r9 > 0) goto L_0x0020
            L_0x001f:
                r6 = 0
            L_0x0020:
                int[] r7 = length
                r7 = r7[r6]
                if (r6 < r4) goto L_0x0028
                r8 = 1
                goto L_0x0029
            L_0x0028:
                r8 = 0
            L_0x0029:
                int[] r9 = new int[r2]
                int[] r10 = new int[r2]
                long r11 = java.lang.Double.doubleToLongBits(r52)
                r13 = 32
                long r11 = r11 >> r13
                int r12 = (int) r11
                r11 = -2147483648(0xffffffff80000000, float:-0.0)
                r11 = r11 & r12
                r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
                if (r11 == 0) goto L_0x005a
                r3[r5] = r2
                long r11 = java.lang.Double.doubleToLongBits(r52)
                long r11 = r11 >> r13
                int r12 = (int) r11
                r11 = 2147483647(0x7fffffff, float:NaN)
                r11 = r11 & r12
                long r16 = java.lang.Double.doubleToLongBits(r52)
                long r11 = (long) r11
                long r11 = r11 << r13
                long r16 = r16 & r14
                long r11 = r11 | r16
                double r11 = java.lang.Double.longBitsToDouble(r11)
                goto L_0x005e
            L_0x005a:
                r3[r5] = r5
                r11 = r52
            L_0x005e:
                long r16 = java.lang.Double.doubleToLongBits(r11)
                r19 = r3
                long r2 = r16 >> r13
                int r3 = (int) r2
                r2 = 2146435072(0x7ff00000, float:NaN)
                r3 = r3 & r2
                r17 = 1048575(0xfffff, float:1.469367E-39)
                r4 = 48
                if (r3 != r2) goto L_0x0091
                long r7 = java.lang.Double.doubleToLongBits(r11)
                int r3 = (int) r7
                if (r3 != 0) goto L_0x0085
                long r7 = java.lang.Double.doubleToLongBits(r11)
                long r7 = r7 >> r13
                int r3 = (int) r7
                r3 = r3 & r17
                if (r3 != 0) goto L_0x0085
                java.lang.String r3 = "Infinity"
                goto L_0x0087
            L_0x0085:
                java.lang.String r3 = "NaN"
            L_0x0087:
                r0.append(r3)
                r3 = 9999(0x270f, float:1.4012E-41)
                r24 = r6
                r1 = 9999(0x270f, float:1.4012E-41)
                goto L_0x00a0
            L_0x0091:
                r21 = 0
                int r3 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
                if (r3 != 0) goto L_0x00a3
                r0.setLength(r5)
                r0.append(r4)
                r24 = r6
            L_0x009f:
                r1 = 1
            L_0x00a0:
                r2 = 1
                goto L_0x0769
            L_0x00a3:
                java.math.BigInteger r3 = getMin(r11, r9, r10)
                long r23 = java.lang.Double.doubleToLongBits(r11)
                r25 = r3
                long r2 = r23 >> r13
                int r3 = (int) r2
                int r2 = r3 >>> 20
                r2 = r2 & 2047(0x7ff, float:2.868E-42)
                if (r2 == 0) goto L_0x00d6
                long r23 = java.lang.Double.doubleToLongBits(r11)
                long r4 = r23 >> r13
                int r5 = (int) r4
                r4 = r5 & r17
                r5 = 1072693248(0x3ff00000, float:1.875)
                r4 = r4 | r5
                long r23 = java.lang.Double.doubleToLongBits(r11)
                long r4 = (long) r4
                long r4 = r4 << r13
                long r23 = r23 & r14
                long r4 = r4 | r23
                double r4 = java.lang.Double.longBitsToDouble(r4)
                int r2 = r2 + -1023
                r13 = r2
                r3 = r4
                r14 = 0
                goto L_0x0128
            L_0x00d6:
                r2 = 0
                r4 = r10[r2]
                r5 = r9[r2]
                int r4 = r4 + r5
                int r4 = r4 + 1074
                if (r4 <= r13) goto L_0x00fb
                long r23 = java.lang.Double.doubleToLongBits(r11)
                long r14 = r23 >> r13
                int r2 = (int) r14
                long r14 = (long) r2
                int r2 = 64 - r4
                long r14 = r14 << r2
                r23 = r14
                long r13 = java.lang.Double.doubleToLongBits(r11)
                int r5 = (int) r13
                int r13 = r4 + -32
                int r5 = r5 >>> r13
                long r13 = (long) r5
                long r13 = r23 | r13
                r2 = 32
                goto L_0x0106
            L_0x00fb:
                long r13 = java.lang.Double.doubleToLongBits(r11)
                int r5 = (int) r13
                long r13 = (long) r5
                r2 = 32
                int r5 = 32 - r4
                long r13 = r13 << r5
            L_0x0106:
                double r13 = (double) r13
                long r23 = java.lang.Double.doubleToLongBits(r13)
                r15 = r4
                long r3 = r23 >> r2
                int r4 = (int) r3
                r3 = 32505856(0x1f00000, float:8.8162076E-38)
                int r4 = r4 - r3
                long r13 = java.lang.Double.doubleToLongBits(r13)
                long r3 = (long) r4
                long r3 = r3 << r2
                r23 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r13 = r13 & r23
                long r3 = r3 | r13
                double r3 = java.lang.Double.longBitsToDouble(r3)
                r13 = r15
                int r13 = r13 + -1075
                r14 = 1
            L_0x0128:
                r23 = 4609434218613702656(0x3ff8000000000000, double:1.5)
                double r3 = r3 - r23
                r23 = 4598887322496222049(0x3fd287a7636f4361, double:0.289529654602168)
                double r3 = r3 * r23
                r23 = 4595512376519870643(0x3fc68a288b60c8b3, double:0.1760912590558)
                double r3 = r3 + r23
                r15 = r6
                double r5 = (double) r13
                r28 = 4599094494223104507(0x3fd34413509f79fb, double:0.301029995663981)
                java.lang.Double.isNaN(r5)
                double r5 = r5 * r28
                double r3 = r3 + r5
                int r5 = (int) r3
                int r6 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
                if (r6 >= 0) goto L_0x0157
                r6 = r14
                r24 = r15
                double r14 = (double) r5
                int r28 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
                if (r28 == 0) goto L_0x015a
                int r5 = r5 + -1
                goto L_0x015a
            L_0x0157:
                r6 = r14
                r24 = r15
            L_0x015a:
                if (r5 < 0) goto L_0x016e
                r3 = 22
                if (r5 > r3) goto L_0x016e
                double[] r3 = getMin
                r14 = r3[r5]
                int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r3 >= 0) goto L_0x016a
                int r5 = r5 + -1
            L_0x016a:
                r3 = 0
                r23 = 0
                goto L_0x0171
            L_0x016e:
                r3 = 0
                r23 = 1
            L_0x0171:
                r4 = r10[r3]
                int r4 = r4 - r13
                r13 = 1
                int r4 = r4 - r13
                if (r4 < 0) goto L_0x017b
                r13 = r4
                r4 = 0
                goto L_0x017d
            L_0x017b:
                int r4 = -r4
                r13 = 0
            L_0x017d:
                if (r5 < 0) goto L_0x0185
                int r13 = r13 + r5
                r15 = r13
                r14 = 0
                r13 = r4
                r4 = r5
                goto L_0x018a
            L_0x0185:
                int r4 = r4 - r5
                int r14 = -r5
                r15 = r13
                r13 = r4
                r4 = 0
            L_0x018a:
                if (r7 < 0) goto L_0x0190
                r2 = 9
                if (r7 <= r2) goto L_0x0191
            L_0x0190:
                r7 = 0
            L_0x0191:
                r2 = 5
                if (r7 <= r2) goto L_0x0198
                int r7 = r7 + -4
                r2 = 0
                goto L_0x0199
            L_0x0198:
                r2 = 1
            L_0x0199:
                r29 = -1
                if (r7 == 0) goto L_0x01d9
                r3 = 1
                if (r7 == r3) goto L_0x01d9
                r3 = 2
                if (r7 == r3) goto L_0x01ca
                r3 = 3
                if (r7 == r3) goto L_0x01b8
                r3 = 4
                if (r7 == r3) goto L_0x01b6
                r3 = 5
                if (r7 == r3) goto L_0x01b4
                r31 = r1
                r3 = 0
                r29 = 0
            L_0x01b1:
                r32 = 1
                goto L_0x01dd
            L_0x01b4:
                r3 = 1
                goto L_0x01b9
            L_0x01b6:
                r3 = 1
                goto L_0x01cb
            L_0x01b8:
                r3 = 0
            L_0x01b9:
                int r29 = r1 + r5
                r18 = 1
                int r29 = r29 + 1
                int r31 = r29 + -1
                r32 = r3
                r3 = r29
                r29 = r31
                r31 = r1
                goto L_0x01dd
            L_0x01ca:
                r3 = 0
            L_0x01cb:
                if (r1 > 0) goto L_0x01d0
                r29 = 1
                goto L_0x01d2
            L_0x01d0:
                r29 = r1
            L_0x01d2:
                r32 = r3
                r3 = r29
                r31 = r3
                goto L_0x01dd
            L_0x01d9:
                r3 = -1
                r31 = 0
                goto L_0x01b1
            L_0x01dd:
                r33 = 48
                r35 = 4621819117588971520(0x4024000000000000, double:10.0)
                if (r3 < 0) goto L_0x03b9
                r1 = 14
                if (r3 > r1) goto L_0x03b9
                if (r2 == 0) goto L_0x03b9
                if (r5 <= 0) goto L_0x0226
                double[] r1 = getMin
                r2 = r5 & 15
                r37 = r1[r2]
                int r1 = r5 >> 4
                r2 = r1 & 16
                if (r2 == 0) goto L_0x0209
                r1 = r1 & 15
                double[] r2 = setMin
                r20 = 4
                r39 = r2[r20]
                double r39 = r11 / r39
                r40 = r39
                r2 = 0
                r38 = r37
                r37 = 3
                goto L_0x0210
            L_0x0209:
                r40 = r11
                r38 = r37
                r2 = 0
                r37 = 2
            L_0x0210:
                if (r1 == 0) goto L_0x0223
                r42 = r1 & 1
                if (r42 == 0) goto L_0x021e
                int r37 = r37 + 1
                double[] r42 = setMin
                r43 = r42[r2]
                double r38 = r38 * r43
            L_0x021e:
                int r1 = r1 >> 1
                int r2 = r2 + 1
                goto L_0x0210
            L_0x0223:
                double r40 = r40 / r38
                goto L_0x024f
            L_0x0226:
                int r1 = -r5
                if (r1 == 0) goto L_0x024b
                double[] r2 = getMin
                r37 = r1 & 15
                r37 = r2[r37]
                double r37 = r37 * r11
                r2 = 4
                int r1 = r1 >> r2
                r40 = r37
                r2 = 0
                r37 = 2
            L_0x0238:
                if (r1 == 0) goto L_0x024f
                r38 = r1 & 1
                if (r38 == 0) goto L_0x0246
                int r37 = r37 + 1
                double[] r38 = setMin
                r42 = r38[r2]
                double r40 = r40 * r42
            L_0x0246:
                int r1 = r1 >> 1
                int r2 = r2 + 1
                goto L_0x0238
            L_0x024b:
                r40 = r11
                r37 = 2
            L_0x024f:
                if (r23 == 0) goto L_0x0272
                r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r38 = (r40 > r1 ? 1 : (r40 == r1 ? 0 : -1))
                if (r38 >= 0) goto L_0x0272
                if (r3 <= 0) goto L_0x0272
                if (r29 > 0) goto L_0x0265
                r38 = r3
                r1 = r5
                r42 = r11
                r2 = r37
                r37 = 1
                goto L_0x027b
            L_0x0265:
                int r1 = r5 + -1
                double r40 = r40 * r35
                int r37 = r37 + 1
                r38 = r3
                r42 = r11
                r3 = r29
                goto L_0x0277
            L_0x0272:
                r38 = r3
                r1 = r5
                r42 = r11
            L_0x0277:
                r2 = r37
                r37 = 0
            L_0x027b:
                double r11 = (double) r2
                java.lang.Double.isNaN(r11)
                double r11 = r11 * r40
                r44 = 4619567317775286272(0x401c000000000000, double:7.0)
                double r11 = r11 + r44
                long r44 = java.lang.Double.doubleToLongBits(r11)
                r39 = r4
                r28 = r5
                r2 = 32
                long r4 = r44 >> r2
                int r5 = (int) r4
                r4 = 54525952(0x3400000, float:5.642373E-37)
                int r5 = r5 - r4
                long r11 = java.lang.Double.doubleToLongBits(r11)
                long r4 = (long) r5
                long r4 = r4 << r2
                r26 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r11 = r11 & r26
                long r4 = r4 | r11
                double r4 = java.lang.Double.longBitsToDouble(r4)
                if (r3 != 0) goto L_0x02cf
                r11 = 4617315517961601024(0x4014000000000000, double:5.0)
                double r40 = r40 - r11
                int r11 = (r40 > r4 ? 1 : (r40 == r4 ? 0 : -1))
                if (r11 <= 0) goto L_0x02ba
                r11 = 49
                r0.append(r11)
                int r1 = r1 + 1
                goto L_0x03fc
            L_0x02ba:
                double r11 = -r4
                int r26 = (r40 > r11 ? 1 : (r40 == r11 ? 0 : -1))
                if (r26 >= 0) goto L_0x02ca
                r11 = 0
                r0.setLength(r11)
                r1 = 48
                r0.append(r1)
                goto L_0x009f
            L_0x02ca:
                r30 = r38
                r37 = 1
                goto L_0x02d1
            L_0x02cf:
                r30 = r38
            L_0x02d1:
                if (r37 != 0) goto L_0x03a5
                r26 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                if (r32 == 0) goto L_0x0341
                double[] r12 = getMin
                int r37 = r3 + -1
                r37 = r12[r37]
                double r26 = r26 / r37
                double r26 = r26 - r4
                r45 = r3
                r11 = r40
                r4 = 0
            L_0x02e6:
                long r2 = (long) r11
                r47 = r13
                r46 = r14
                double r13 = (double) r2
                java.lang.Double.isNaN(r13)
                double r40 = r11 - r13
                long r2 = r2 + r33
                int r3 = (int) r2
                char r2 = (char) r3
                r0.append(r2)
                int r2 = (r40 > r26 ? 1 : (r40 == r26 ? 0 : -1))
                if (r2 < 0) goto L_0x03fc
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r2 = r2 - r40
                int r5 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
                if (r5 >= 0) goto L_0x032b
            L_0x0304:
                int r2 = r49.length()
                r3 = 1
                int r2 = r2 - r3
                char r2 = r0.charAt(r2)
                int r4 = r49.length()
                int r4 = r4 - r3
                r0.setLength(r4)
                r4 = 57
                if (r2 != r4) goto L_0x0324
                int r2 = r49.length()
                if (r2 != 0) goto L_0x0304
                int r1 = r1 + 1
                r2 = 48
            L_0x0324:
                int r2 = r2 + r3
                char r2 = (char) r2
                r0.append(r2)
                goto L_0x03fc
            L_0x032b:
                r3 = 1
                int r4 = r4 + r3
                r3 = r45
                if (r4 >= r3) goto L_0x033c
                double r26 = r26 * r35
                double r11 = r40 * r35
                r45 = r3
                r14 = r46
                r13 = r47
                goto L_0x02e6
            L_0x033c:
                r45 = r6
                r48 = r7
                goto L_0x0399
            L_0x0341:
                r47 = r13
                r46 = r14
                double[] r2 = getMin
                int r11 = r3 + -1
                r11 = r2[r11]
                double r4 = r4 * r11
                r11 = r40
                r2 = 1
            L_0x0350:
                long r13 = (long) r11
                r45 = r6
                r48 = r7
                double r6 = (double) r13
                java.lang.Double.isNaN(r6)
                double r40 = r11 - r6
                long r13 = r13 + r33
                int r6 = (int) r13
                char r6 = (char) r6
                r0.append(r6)
                if (r2 != r3) goto L_0x039c
                double r6 = r4 + r26
                int r2 = (r40 > r6 ? 1 : (r40 == r6 ? 0 : -1))
                if (r2 <= 0) goto L_0x0391
            L_0x036a:
                int r2 = r49.length()
                r3 = 1
                int r2 = r2 - r3
                char r2 = r0.charAt(r2)
                int r4 = r49.length()
                int r4 = r4 - r3
                r0.setLength(r4)
                r4 = 57
                if (r2 != r4) goto L_0x038a
                int r2 = r49.length()
                if (r2 != 0) goto L_0x036a
                int r1 = r1 + 1
                r2 = 48
            L_0x038a:
                int r2 = r2 + r3
                char r2 = (char) r2
                r0.append(r2)
                goto L_0x03fc
            L_0x0391:
                double r26 = r26 - r4
                int r2 = (r40 > r26 ? 1 : (r40 == r26 ? 0 : -1))
                if (r2 >= 0) goto L_0x0399
                goto L_0x0739
            L_0x0399:
                r37 = 1
                goto L_0x03ad
            L_0x039c:
                int r2 = r2 + 1
                double r11 = r40 * r35
                r6 = r45
                r7 = r48
                goto L_0x0350
            L_0x03a5:
                r45 = r6
                r48 = r7
                r47 = r13
                r46 = r14
            L_0x03ad:
                r2 = 0
                if (r37 == 0) goto L_0x03b4
                r0.setLength(r2)
                goto L_0x03ca
            L_0x03b4:
                r5 = r1
                r1 = r3
                r11 = r40
                goto L_0x03d0
            L_0x03b9:
                r30 = r3
                r39 = r4
                r28 = r5
                r45 = r6
                r48 = r7
                r42 = r11
                r47 = r13
                r46 = r14
                r2 = 0
            L_0x03ca:
                r5 = r28
                r1 = r30
                r11 = r42
            L_0x03d0:
                r4 = r9[r2]
                r6 = 1
                if (r4 < 0) goto L_0x0466
                r2 = 14
                if (r5 > r2) goto L_0x0466
                double[] r2 = getMin
                r9 = r2[r5]
                if (r31 >= 0) goto L_0x040a
                if (r1 > 0) goto L_0x040a
                if (r1 < 0) goto L_0x03ff
                r1 = 4617315517961601024(0x4014000000000000, double:5.0)
                double r9 = r9 * r1
                int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r1 < 0) goto L_0x03ff
                if (r8 != 0) goto L_0x03f3
                int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r1 != 0) goto L_0x03f3
                goto L_0x03ff
            L_0x03f3:
                r1 = 49
                r0.append(r1)
                r1 = 1
                int r2 = r5 + 1
                r1 = r2
            L_0x03fc:
                r2 = 1
                goto L_0x0765
            L_0x03ff:
                r1 = 0
                r0.setLength(r1)
                r1 = 48
                r0.append(r1)
                goto L_0x009f
            L_0x040a:
                r2 = 1
            L_0x040b:
                double r13 = r11 / r9
                long r13 = (long) r13
                double r3 = (double) r13
                java.lang.Double.isNaN(r3)
                double r3 = r3 * r9
                double r11 = r11 - r3
                long r3 = r13 + r33
                int r4 = (int) r3
                char r3 = (char) r4
                r0.append(r3)
                if (r2 != r1) goto L_0x0457
                double r11 = r11 + r11
                int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r1 > 0) goto L_0x0431
                int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r1 != 0) goto L_0x0460
                long r1 = r13 & r6
                r3 = 0
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 != 0) goto L_0x0431
                if (r8 == 0) goto L_0x0460
            L_0x0431:
                int r1 = r49.length()
                r2 = 1
                int r1 = r1 - r2
                char r1 = r0.charAt(r1)
                int r3 = r49.length()
                int r3 = r3 - r2
                r0.setLength(r3)
                r3 = 57
                if (r1 != r3) goto L_0x0451
                int r1 = r49.length()
                if (r1 != 0) goto L_0x0431
                int r5 = r5 + 1
                r1 = 48
            L_0x0451:
                int r1 = r1 + r2
                char r1 = (char) r1
                r0.append(r1)
                goto L_0x0460
            L_0x0457:
                double r11 = r11 * r35
                int r3 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
                if (r3 == 0) goto L_0x0460
                int r2 = r2 + 1
                goto L_0x040b
            L_0x0460:
                r1 = 1
                int r2 = r5 + 1
                r1 = r2
                goto L_0x00a0
            L_0x0466:
                r2 = 0
                if (r32 == 0) goto L_0x04ab
                r4 = r48
                r3 = 2
                if (r4 >= r3) goto L_0x0480
                r2 = 0
                if (r45 == 0) goto L_0x0477
                r3 = r9[r2]
                int r3 = r3 + 1075
                r2 = r3
                goto L_0x047b
            L_0x0477:
                r9 = r10[r2]
                int r2 = 54 - r9
            L_0x047b:
                r14 = r46
                r13 = r47
                goto L_0x049d
            L_0x0480:
                int r2 = r1 + -1
                r14 = r46
                if (r14 < r2) goto L_0x0489
                int r2 = r14 - r2
                goto L_0x0490
            L_0x0489:
                int r2 = r2 - r14
                int r9 = r39 + r2
                int r14 = r14 + r2
                r39 = r9
                r2 = 0
            L_0x0490:
                if (r1 >= 0) goto L_0x0498
                int r13 = r47 - r1
                r46 = r2
                r2 = 0
                goto L_0x049d
            L_0x0498:
                r46 = r2
                r13 = r47
                r2 = r1
            L_0x049d:
                int r9 = r47 + r2
                int r15 = r15 + r2
                java.math.BigInteger r2 = java.math.BigInteger.valueOf(r6)
                r47 = r9
                r9 = r39
                r10 = r46
                goto L_0x04b4
            L_0x04ab:
                r14 = r46
                r4 = r48
                r10 = r14
                r9 = r39
                r13 = r47
            L_0x04b4:
                if (r13 <= 0) goto L_0x04c5
                if (r15 <= 0) goto L_0x04c5
                if (r13 >= r15) goto L_0x04bd
                r21 = r13
                goto L_0x04bf
            L_0x04bd:
                r21 = r15
            L_0x04bf:
                int r47 = r47 - r21
                int r13 = r13 - r21
                int r15 = r15 - r21
            L_0x04c5:
                r21 = 5
                if (r14 <= 0) goto L_0x0501
                if (r32 == 0) goto L_0x04f2
                if (r10 <= 0) goto L_0x04e0
                java.math.BigInteger r3 = java.math.BigInteger.valueOf(r21)
                java.math.BigInteger r3 = r3.pow(r10)
                java.math.BigInteger r2 = r2.multiply(r3)
                r3 = r25
                java.math.BigInteger r3 = r2.multiply(r3)
                goto L_0x04e2
            L_0x04e0:
                r3 = r25
            L_0x04e2:
                int r14 = r14 - r10
                if (r14 == 0) goto L_0x0503
                java.math.BigInteger r10 = java.math.BigInteger.valueOf(r21)
                java.math.BigInteger r10 = r10.pow(r14)
                java.math.BigInteger r3 = r3.multiply(r10)
                goto L_0x0503
            L_0x04f2:
                r3 = r25
                java.math.BigInteger r10 = java.math.BigInteger.valueOf(r21)
                java.math.BigInteger r10 = r10.pow(r14)
                java.math.BigInteger r3 = r3.multiply(r10)
                goto L_0x0503
            L_0x0501:
                r3 = r25
            L_0x0503:
                r10 = r3
                r3 = r2
                java.math.BigInteger r2 = java.math.BigInteger.valueOf(r6)
                if (r9 <= 0) goto L_0x0517
                java.math.BigInteger r6 = java.math.BigInteger.valueOf(r21)
                java.math.BigInteger r6 = r6.pow(r9)
                java.math.BigInteger r2 = r2.multiply(r6)
            L_0x0517:
                r6 = r2
                r2 = 2
                r7 = r1
                if (r4 >= r2) goto L_0x0543
                long r1 = java.lang.Double.doubleToLongBits(r11)
                int r2 = (int) r1
                if (r2 != 0) goto L_0x0543
                long r1 = java.lang.Double.doubleToLongBits(r11)
                r14 = 32
                long r1 = r1 >> r14
                int r2 = (int) r1
                r1 = r2 & r17
                if (r1 != 0) goto L_0x0543
                long r1 = java.lang.Double.doubleToLongBits(r11)
                long r1 = r1 >> r14
                r25 = r3
                r2 = r1
                int r1 = (int) r2
                r2 = 2145386496(0x7fe00000, float:NaN)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0545
                int r47 = r47 + 1
                int r15 = r15 + 1
                r1 = 1
                goto L_0x0546
            L_0x0543:
                r25 = r3
            L_0x0545:
                r1 = 0
            L_0x0546:
                byte[] r2 = r6.toByteArray()
                r26 = r7
                r3 = 0
                r7 = 4
                r14 = 0
            L_0x054f:
                if (r3 >= r7) goto L_0x0560
                int r7 = r14 << 8
                int r14 = r2.length
                if (r3 >= r14) goto L_0x055b
                byte r14 = r2[r3]
                r14 = r14 & 255(0xff, float:3.57E-43)
                r7 = r7 | r14
            L_0x055b:
                r14 = r7
                int r3 = r3 + 1
                r7 = 4
                goto L_0x054f
            L_0x0560:
                if (r9 == 0) goto L_0x056b
                int r2 = setMax(r14)
                r3 = 32
                int r2 = 32 - r2
                goto L_0x056e
            L_0x056b:
                r3 = 32
                r2 = 1
            L_0x056e:
                int r2 = r2 + r15
                r7 = r2 & 31
                if (r7 == 0) goto L_0x0575
                int r7 = 32 - r7
            L_0x0575:
                r3 = 4
                if (r7 <= r3) goto L_0x057f
                int r7 = r7 + -4
            L_0x057a:
                int r47 = r47 + r7
                int r13 = r13 + r7
                int r15 = r15 + r7
                goto L_0x0584
            L_0x057f:
                if (r7 >= r3) goto L_0x0584
                int r7 = r7 + 28
                goto L_0x057a
            L_0x0584:
                r3 = r47
                if (r3 <= 0) goto L_0x058c
                java.math.BigInteger r10 = r10.shiftLeft(r3)
            L_0x058c:
                if (r15 <= 0) goto L_0x0592
                java.math.BigInteger r6 = r6.shiftLeft(r15)
            L_0x0592:
                r14 = 10
                if (r23 == 0) goto L_0x05ba
                int r3 = r10.compareTo(r6)
                if (r3 >= 0) goto L_0x05ba
                int r5 = r5 + -1
                java.math.BigInteger r3 = java.math.BigInteger.valueOf(r14)
                java.math.BigInteger r10 = r10.multiply(r3)
                if (r32 == 0) goto L_0x05b3
                java.math.BigInteger r3 = java.math.BigInteger.valueOf(r14)
                r7 = r25
                java.math.BigInteger r3 = r7.multiply(r3)
                goto L_0x05b6
            L_0x05b3:
                r7 = r25
                r3 = r7
            L_0x05b6:
                r7 = r3
                r9 = r29
                goto L_0x05be
            L_0x05ba:
                r7 = r25
                r9 = r26
            L_0x05be:
                if (r9 > 0) goto L_0x05ec
                r3 = 2
                if (r4 <= r3) goto L_0x05ec
                if (r9 < 0) goto L_0x05e1
                java.math.BigInteger r1 = java.math.BigInteger.valueOf(r21)
                java.math.BigInteger r1 = r6.multiply(r1)
                int r1 = r10.compareTo(r1)
                if (r1 < 0) goto L_0x05e1
                if (r1 != 0) goto L_0x05d8
                if (r8 != 0) goto L_0x05d8
                goto L_0x05e1
            L_0x05d8:
                r1 = 49
                r0.append(r1)
                int r1 = r5 + 1
                goto L_0x03fc
            L_0x05e1:
                r1 = 0
                r0.setLength(r1)
                r1 = 48
                r0.append(r1)
                goto L_0x009f
            L_0x05ec:
                if (r32 == 0) goto L_0x06fc
                if (r13 <= 0) goto L_0x05f4
                java.math.BigInteger r7 = r7.shiftLeft(r13)
            L_0x05f4:
                if (r1 == 0) goto L_0x05fc
                r1 = 1
                java.math.BigInteger r13 = r7.shiftLeft(r1)
                goto L_0x05fe
            L_0x05fc:
                r1 = 1
                r13 = r7
            L_0x05fe:
                r2 = 1
            L_0x05ff:
                java.math.BigInteger[] r10 = r10.divideAndRemainder(r6)
                r3 = r10[r1]
                r1 = 0
                r10 = r10[r1]
                int r10 = r10.intValue()
                r21 = 48
                int r10 = r10 + 48
                char r10 = (char) r10
                int r21 = r3.compareTo(r7)
                java.math.BigInteger r1 = r6.subtract(r13)
                int r22 = r1.signum()
                if (r22 > 0) goto L_0x0621
                r1 = 1
                goto L_0x0625
            L_0x0621:
                int r1 = r3.compareTo(r1)
            L_0x0625:
                if (r1 != 0) goto L_0x0654
                if (r4 != 0) goto L_0x0654
                long r14 = java.lang.Double.doubleToLongBits(r11)
                int r15 = (int) r14
                r14 = 1
                r15 = r15 & r14
                if (r15 != 0) goto L_0x0654
                r15 = 57
                if (r10 != r15) goto L_0x064a
                r0.append(r15)
                boolean r1 = getMin((java.lang.StringBuilder) r49)
                if (r1 == 0) goto L_0x0646
                int r5 = r5 + 1
                r1 = 49
                r0.append(r1)
            L_0x0646:
                int r1 = r5 + 1
                goto L_0x00a0
            L_0x064a:
                if (r21 <= 0) goto L_0x064f
                int r10 = r10 + 1
                char r10 = (char) r10
            L_0x064f:
                r0.append(r10)
                goto L_0x0762
            L_0x0654:
                if (r21 < 0) goto L_0x06c0
                if (r21 != 0) goto L_0x0664
                if (r4 != 0) goto L_0x0664
                long r14 = java.lang.Double.doubleToLongBits(r11)
                int r15 = (int) r14
                r14 = 1
                r15 = r15 & r14
                if (r15 != 0) goto L_0x0664
                goto L_0x06c0
            L_0x0664:
                if (r1 <= 0) goto L_0x0689
                r1 = 57
                if (r10 != r1) goto L_0x0681
                r0.append(r1)
                boolean r1 = getMin((java.lang.StringBuilder) r49)
                if (r1 == 0) goto L_0x067a
                int r5 = r5 + 1
                r1 = 49
                r0.append(r1)
            L_0x067a:
                r1 = 1
                int r18 = r5 + 1
                r1 = r18
                goto L_0x00a0
            L_0x0681:
                r1 = 1
                int r10 = r10 + r1
                char r1 = (char) r10
                r0.append(r1)
                goto L_0x0762
            L_0x0689:
                r0.append(r10)
                if (r2 == r9) goto L_0x06be
                r14 = 10
                java.math.BigInteger r1 = java.math.BigInteger.valueOf(r14)
                java.math.BigInteger r10 = r3.multiply(r1)
                if (r7 != r13) goto L_0x06a5
                java.math.BigInteger r1 = java.math.BigInteger.valueOf(r14)
                java.math.BigInteger r1 = r13.multiply(r1)
                r7 = r1
                r13 = r7
                goto L_0x06b7
            L_0x06a5:
                java.math.BigInteger r1 = java.math.BigInteger.valueOf(r14)
                java.math.BigInteger r1 = r7.multiply(r1)
                java.math.BigInteger r3 = java.math.BigInteger.valueOf(r14)
                java.math.BigInteger r3 = r13.multiply(r3)
                r7 = r1
                r13 = r3
            L_0x06b7:
                int r2 = r2 + 1
                r1 = 1
                r14 = 10
                goto L_0x05ff
            L_0x06be:
                r4 = r3
                goto L_0x0724
            L_0x06c0:
                if (r1 <= 0) goto L_0x06f6
                r1 = 1
                java.math.BigInteger r2 = r3.shiftLeft(r1)
                int r2 = r2.compareTo(r6)
                if (r2 > 0) goto L_0x06d5
                if (r2 != 0) goto L_0x06f6
                r2 = r10 & 1
                if (r2 == r1) goto L_0x06d5
                if (r8 == 0) goto L_0x06f6
            L_0x06d5:
                int r1 = r10 + 1
                char r1 = (char) r1
                r2 = 57
                if (r10 != r2) goto L_0x06f2
                r0.append(r2)
                boolean r1 = getMin((java.lang.StringBuilder) r49)
                if (r1 == 0) goto L_0x06ec
                int r5 = r5 + 1
                r1 = 49
                r0.append(r1)
            L_0x06ec:
                r18 = 1
                int r1 = r5 + 1
                goto L_0x00a0
            L_0x06f2:
                r18 = 1
                r10 = r1
                goto L_0x06f8
            L_0x06f6:
                r18 = 1
            L_0x06f8:
                r0.append(r10)
                goto L_0x0762
            L_0x06fc:
                r18 = 1
                r1 = 1
            L_0x06ff:
                java.math.BigInteger[] r2 = r10.divideAndRemainder(r6)
                r4 = r2[r18]
                r3 = 0
                r2 = r2[r3]
                int r2 = r2.intValue()
                r7 = 48
                int r2 = r2 + r7
                char r10 = (char) r2
                r0.append(r10)
                if (r1 >= r9) goto L_0x0724
                r11 = 10
                java.math.BigInteger r2 = java.math.BigInteger.valueOf(r11)
                java.math.BigInteger r10 = r4.multiply(r2)
                int r1 = r1 + 1
                r18 = 1
                goto L_0x06ff
            L_0x0724:
                r1 = 1
                java.math.BigInteger r2 = r4.shiftLeft(r1)
                int r2 = r2.compareTo(r6)
                if (r2 > 0) goto L_0x0753
                if (r2 != 0) goto L_0x0738
                r2 = r10 & 1
                if (r2 == r1) goto L_0x0753
                if (r8 == 0) goto L_0x0738
                goto L_0x0753
            L_0x0738:
                r1 = r5
            L_0x0739:
                int r2 = r49.length()
            L_0x073d:
                int r4 = r2 + -1
                if (r2 <= 0) goto L_0x074c
                char r2 = r0.charAt(r4)
                r5 = 48
                if (r2 == r5) goto L_0x074a
                goto L_0x074c
            L_0x074a:
                r2 = r4
                goto L_0x073d
            L_0x074c:
                r2 = 1
                int r4 = r4 + r2
                r0.setLength(r4)
                goto L_0x03fc
            L_0x0753:
                boolean r1 = getMin((java.lang.StringBuilder) r49)
                if (r1 == 0) goto L_0x0762
                int r1 = r5 + 1
                r2 = 49
                r0.append(r2)
                goto L_0x03fc
            L_0x0762:
                r1 = r5
                goto L_0x03fc
            L_0x0765:
                int r18 = r1 + 1
                r1 = r18
            L_0x0769:
                int r4 = r49.length()
                r5 = 9999(0x270f, float:1.4012E-41)
                if (r1 == r5) goto L_0x07e7
                if (r24 == 0) goto L_0x0796
                r5 = r24
                if (r5 == r2) goto L_0x07a0
                r2 = 2
                if (r5 == r2) goto L_0x078e
                r2 = 3
                if (r5 == r2) goto L_0x078b
                r2 = 4
                if (r5 == r2) goto L_0x0783
                r2 = 0
            L_0x0781:
                r5 = 0
                goto L_0x07a2
            L_0x0783:
                r2 = -5
                if (r1 < r2) goto L_0x078b
                r2 = r51
                if (r1 <= r2) goto L_0x0781
                goto L_0x0794
            L_0x078b:
                r2 = r51
                goto L_0x0794
            L_0x078e:
                r2 = r51
                if (r2 < 0) goto L_0x079e
                int r2 = r2 + r1
                goto L_0x0781
            L_0x0794:
                r5 = 1
                goto L_0x07a2
            L_0x0796:
                r2 = -5
                if (r1 < r2) goto L_0x07a0
                r2 = 21
                if (r1 <= r2) goto L_0x079e
                goto L_0x07a0
            L_0x079e:
                r2 = r1
                goto L_0x0781
            L_0x07a0:
                r2 = 0
                goto L_0x0794
            L_0x07a2:
                if (r4 >= r2) goto L_0x07b0
            L_0x07a4:
                r4 = 48
                r0.append(r4)
                int r4 = r49.length()
                if (r4 != r2) goto L_0x07a4
                r4 = r2
            L_0x07b0:
                r2 = 46
                if (r5 == 0) goto L_0x07cb
                r5 = 1
                if (r4 == r5) goto L_0x07ba
                r0.insert(r5, r2)
            L_0x07ba:
                r2 = 101(0x65, float:1.42E-43)
                r0.append(r2)
                int r1 = r1 - r5
                if (r1 < 0) goto L_0x07c7
                r2 = 43
                r0.append(r2)
            L_0x07c7:
                r0.append(r1)
                goto L_0x07e7
            L_0x07cb:
                if (r1 == r4) goto L_0x07e7
                if (r1 <= 0) goto L_0x07d3
                r0.insert(r1, r2)
                goto L_0x07e7
            L_0x07d3:
                r4 = 0
                r5 = 1
            L_0x07d5:
                int r6 = 1 - r1
                if (r4 >= r6) goto L_0x07e2
                r3 = 48
                r6 = 0
                r0.insert(r6, r3)
                int r4 = r4 + 1
                goto L_0x07d5
            L_0x07e2:
                r6 = 0
                r0.insert(r5, r2)
                goto L_0x07e8
            L_0x07e7:
                r6 = 0
            L_0x07e8:
                boolean r1 = r19[r6]
                if (r1 == 0) goto L_0x0821
                long r1 = java.lang.Double.doubleToLongBits(r52)
                r4 = 32
                long r1 = r1 >> r4
                int r2 = (int) r1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != r1) goto L_0x07ff
                long r1 = java.lang.Double.doubleToLongBits(r52)
                int r2 = (int) r1
                if (r2 == 0) goto L_0x0821
            L_0x07ff:
                long r1 = java.lang.Double.doubleToLongBits(r52)
                long r1 = r1 >> r4
                int r2 = (int) r1
                r1 = 2146435072(0x7ff00000, float:NaN)
                r2 = r2 & r1
                if (r2 != r1) goto L_0x081b
                long r1 = java.lang.Double.doubleToLongBits(r52)
                int r2 = (int) r1
                if (r2 != 0) goto L_0x0821
                long r1 = java.lang.Double.doubleToLongBits(r52)
                long r1 = r1 >> r4
                int r2 = (int) r1
                r1 = r2 & r17
                if (r1 != 0) goto L_0x0821
            L_0x081b:
                r1 = 45
                r2 = 0
                r0.insert(r2, r1)
            L_0x0821:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SecureQwertyKeyboard.QwertType.getMin(java.lang.StringBuilder, int, int, double):void");
        }
    }

    public static SecureQwertyKeyboard get(LogUtils logUtils) {
        SecureQwertyKeyboard secureQwertyKeyboard = (SecureQwertyKeyboard) ScriptableObject.getTopScopeValue(logUtils, AKEY);
        if (secureQwertyKeyboard != null) {
            return secureQwertyKeyboard;
        }
        throw new RuntimeException("Can't find top level scope for ClassCache.get");
    }

    public boolean associate(ScriptableObject scriptableObject) {
        if (scriptableObject.getParentScope() != null) {
            throw new IllegalArgumentException();
        } else if (this != scriptableObject.associateValue(AKEY, this)) {
            return false;
        } else {
            this.associatedScope = scriptableObject;
            return true;
        }
    }

    public synchronized void clearCaches() {
        this.classTable = null;
        this.classAdapterCache = null;
        this.interfaceAdapterCache = null;
    }

    public final boolean isCachingEnabled() {
        return this.cachingIsEnabled;
    }

    public synchronized void setCachingEnabled(boolean z) {
        if (z != this.cachingIsEnabled) {
            if (!z) {
                clearCaches();
            }
            this.cachingIsEnabled = z;
        }
    }

    /* access modifiers changed from: package-private */
    public Map<Class<?>, getDrawableId> getClassCacheMap() {
        if (this.classTable == null) {
            this.classTable = new ConcurrentHashMap(16, 0.75f, 1);
        }
        return this.classTable;
    }

    /* access modifiers changed from: package-private */
    public Map<getStringId.length, Class<?>> getInterfaceAdapterCacheMap() {
        if (this.classAdapterCache == null) {
            this.classAdapterCache = new ConcurrentHashMap(16, 0.75f, 1);
        }
        return this.classAdapterCache;
    }

    @Deprecated
    public synchronized void setInvokerOptimizationEnabled(boolean z) {
    }

    public final synchronized int newClassSerialNumber() {
        int i;
        i = this.generatedClassSerial + 1;
        this.generatedClassSerial = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    public Object getInterfaceAdapter(Class<?> cls) {
        Map<Class<?>, Object> map = this.interfaceAdapterCache;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    /* access modifiers changed from: package-private */
    public synchronized void cacheInterfaceAdapter(Class<?> cls, Object obj) {
        if (this.cachingIsEnabled) {
            if (this.interfaceAdapterCache == null) {
                this.interfaceAdapterCache = new ConcurrentHashMap(16, 0.75f, 1);
            }
            this.interfaceAdapterCache.put(cls, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public LogUtils getAssociatedScope() {
        return this.associatedScope;
    }

    /* renamed from: o.SecureQwertyKeyboard$1  reason: invalid class name */
    public class AnonymousClass1 {
        private static Class<?> ICustomTabsCallback$Default = getStyleId.getMax("o.getDimenId");
        private static Class<?> extraCallbackWithResult = getStyleId.getMax("o.WaveView$ShapeType");
        public static final Object[] length = LogItem.create;
        boolean FastBitmap$CoordinateSystem;
        MoneyView Grayscale$Algorithm;
        Set<String> ICustomTabsCallback;
        private boolean ICustomTabsCallback$Stub;
        private boolean ICustomTabsService;
        public int IsOverlapping;
        Map<Object, Object> Mean$Arithmetic;
        private Object asBinder;
        private boolean asInterface;
        getLogs b;
        Object create;
        SimplePassword.TextWatcherImpl equals;
        boolean extraCallback;
        int getCause;
        private int getDefaultImpl;
        private ClassLoader getInterfaceDescriptor;
        final SecureTextView.SendAccessiBilityEventListener getMax;
        LogUtils getMin;
        LogPrinterProxy hashCode;
        int invoke;
        int invokeSuspend;
        onInit isInside;
        int onMessageChannelReady;
        int onNavigationEvent;
        LogUtils onPostMessage;
        public boolean onRelationshipValidationResult;
        private SecureNumKeyboard onTransact;
        private boolean setDefaultImpl;
        boolean setMax;
        doAutoSubmit setMin;
        Locale toDoubleRange;
        ZimValidateGwResponse toFloatRange;
        Object toIntRange;
        addTraceInfo toString;
        BisBehavCommon valueOf;
        getPublicKeyFromX509 values;

        @Deprecated
        public AnonymousClass1() {
            this(SecureTextView.SendAccessiBilityEventListener.getMin());
        }

        protected AnonymousClass1(SecureTextView.SendAccessiBilityEventListener sendAccessiBilityEventListener) {
            this.ICustomTabsService = true;
            int i = 0;
            this.onRelationshipValidationResult = false;
            if (sendAccessiBilityEventListener != null) {
                this.getMax = sendAccessiBilityEventListener;
                this.IsOverlapping = 0;
                this.invokeSuspend = extraCallbackWithResult == null ? -1 : i;
                this.invoke = Integer.MAX_VALUE;
                return;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public static AnonymousClass1 setMin() {
            return INotProguard.setMin.getMin(INotProguard.setMin.length());
        }

        static final AnonymousClass1 setMax(SecureTextView.SendAccessiBilityEventListener sendAccessiBilityEventListener) {
            Object length2 = INotProguard.setMin.length();
            AnonymousClass1 min = INotProguard.setMin.getMin(length2);
            if (min == null) {
                min = sendAccessiBilityEventListener.getMax();
                if (min.getDefaultImpl == 0) {
                    sendAccessiBilityEventListener.setMax();
                    if (sendAccessiBilityEventListener.setMin() && !min.FastBitmap$CoordinateSystem()) {
                        if (!min.ICustomTabsCallback$Stub) {
                            min.ICustomTabsCallback$Stub = true;
                            min.asBinder = null;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    INotProguard.setMin.length(length2, min);
                } else {
                    throw new IllegalStateException("factory.makeContext() returned Context instance already associated with some thread");
                }
            }
            min.getDefaultImpl++;
            return min;
        }

        public static void setMax() {
            Object length2 = INotProguard.setMin.length();
            AnonymousClass1 min = INotProguard.setMin.getMin(length2);
            if (min != null) {
                if (min.getDefaultImpl <= 0) {
                    getStyleId.setMin();
                }
                int i = min.getDefaultImpl - 1;
                min.getDefaultImpl = i;
                if (i == 0) {
                    INotProguard.setMin.length(length2, (AnonymousClass1) null);
                    min.getMax.length();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Calling Context.exit without previous Context.enter");
        }

        public static Object getMax(final announceSwitchKeyboard announceswitchkeyboard, final LogUtils logUtils, final LogUtils logUtils2, final Object[] objArr) {
            return setMin(SecureTextView.SendAccessiBilityEventListener.getMin(), (SecureTextView) new SecureTextView() {
                public final Object setMin(AnonymousClass1 r5) {
                    return announceswitchkeyboard.call(r5, logUtils, logUtils2, objArr);
                }
            });
        }

        public static Object setMin(SecureTextView.SendAccessiBilityEventListener sendAccessiBilityEventListener, SecureTextView secureTextView) {
            try {
                return secureTextView.setMin(setMax(sendAccessiBilityEventListener));
            } finally {
                setMax();
            }
        }

        private boolean FastBitmap$CoordinateSystem() {
            return this.ICustomTabsCallback$Stub;
        }

        public static void getMin(String str) {
            int[] iArr = {0};
            String max = setMax(iArr);
            int i = iArr[0];
            AnonymousClass1 min = INotProguard.setMin.getMin(INotProguard.setMin.length());
            if (min == null) {
                throw new RuntimeException("No Context associated with current Thread");
            } else if (min.getMax(12)) {
                AnonymousClass1 min2 = INotProguard.setMin.getMin(INotProguard.setMin.length());
                if (min2 != null) {
                    getPublicKeyFromX509 getpublickeyfromx509 = min2.values;
                    if (getpublickeyfromx509 == null) {
                        getpublickeyfromx509 = ShiftType.setMin;
                    }
                    getpublickeyfromx509.length(str, max, i, (String) null, 0);
                    return;
                }
                throw new EvaluatorException(str, max, i, (String) null, 0);
            } else if (min.values == null) {
                ShiftType shiftType = ShiftType.setMin;
            }
        }

        static EvaluatorException setMin(String str) {
            int[] iArr = {0};
            return getMin(LogItem.getMax(str), setMax(iArr), iArr[0]);
        }

        public static EvaluatorException getMax(String str, Object obj) {
            String min = LogItem.getMin(str, obj);
            int[] iArr = {0};
            return getMin(min, setMax(iArr), iArr[0]);
        }

        public static EvaluatorException getMin(String str, Object obj, Object obj2) {
            String length2 = LogItem.length(str, obj, obj2);
            int[] iArr = {0};
            return getMin(length2, setMax(iArr), iArr[0]);
        }

        static EvaluatorException setMax(String str, Object obj, Object obj2, Object obj3) {
            String length2 = LogItem.length(str, obj, obj2, obj3);
            int[] iArr = {0};
            return getMin(length2, setMax(iArr), iArr[0]);
        }

        static EvaluatorException setMax(String str, Object obj, Object obj2, Object obj3, Object obj4) {
            String length2 = LogItem.length(str, obj, obj2, obj3, obj4);
            int[] iArr = {0};
            return getMin(length2, setMax(iArr), iArr[0]);
        }

        public static EvaluatorException getMax(String str) {
            int[] iArr = {0};
            return getMin(str, setMax(iArr), iArr[0]);
        }

        /* access modifiers changed from: package-private */
        public final LogItem.TracerInfo getMin(String str, LogTracer logTracer, getPublicKeyFromX509 getpublickeyfromx509, String str2) {
            try {
                return (LogItem.TracerInfo) getMax((LogUtils) null, str, str2, false, logTracer, getpublickeyfromx509);
            } catch (IOException unused) {
                throw new RuntimeException();
            }
        }

        /* access modifiers changed from: package-private */
        public final doCheck length(LogUtils logUtils, String str, LogTracer logTracer, getPublicKeyFromX509 getpublickeyfromx509, String str2) {
            try {
                return (doCheck) getMax(logUtils, str, str2, true, logTracer, getpublickeyfromx509);
            } catch (IOException unused) {
                throw new RuntimeException();
            }
        }

        public static LogUtils getMin(LogUtils logUtils) {
            setmSubmitInterface setmsubmitinterface = new setmSubmitInterface();
            LogItem.getMin((ScriptableObject) setmsubmitinterface, logUtils, TopLevel.Builtins.Object);
            return setmsubmitinterface;
        }

        public static LogUtils getMax(LogUtils logUtils, int i) {
            getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = new getResourceDeclareStyleableIntArray((long) i);
            LogItem.getMin((ScriptableObject) getresourcedeclarestyleableintarray, logUtils, TopLevel.Builtins.Array);
            return getresourcedeclarestyleableintarray;
        }

        public static LogUtils getMax(LogUtils logUtils, Object[] objArr) {
            if (objArr.getClass().getComponentType() == LogItem.equals) {
                getResourceDeclareStyleableIntArray getresourcedeclarestyleableintarray = new getResourceDeclareStyleableIntArray(objArr);
                LogItem.getMin((ScriptableObject) getresourcedeclarestyleableintarray, logUtils, TopLevel.Builtins.Array);
                return getresourcedeclarestyleableintarray;
            }
            throw new IllegalArgumentException();
        }

        public static Object[] setMin(LogUtils logUtils) {
            return LogItem.toIntRange(logUtils);
        }

        public static double setMin(Object obj) {
            return LogItem.getMax(obj);
        }

        public static String getMax(Object obj) {
            return LogItem.getMin(obj);
        }

        public static LogUtils getMax(Object obj, LogUtils logUtils) {
            return LogItem.getMax(logUtils, obj);
        }

        public static Object length(Object obj, LogUtils logUtils) {
            if (obj instanceof LogUtils) {
                return obj;
            }
            AnonymousClass1 min = INotProguard.setMin.getMin(INotProguard.setMin.length());
            if (min != null) {
                if (min.Grayscale$Algorithm == null) {
                    min.Grayscale$Algorithm = new MoneyView();
                }
                return min.Grayscale$Algorithm.getMax(logUtils, obj, (Class<?>) null);
            }
            throw new RuntimeException("No Context associated with current Thread");
        }

        public static Object length(Object obj, Class<?> cls) throws EvaluatorException {
            return SimplePassword.coerceTypeImpl(cls, obj);
        }

        public static RuntimeException getMax(Throwable th) {
            while (th instanceof InvocationTargetException) {
                th = ((InvocationTargetException) th).getTargetException();
            }
            if (th instanceof Error) {
                AnonymousClass1 min = INotProguard.setMin.getMin(INotProguard.setMin.length());
                if (min == null) {
                    throw new RuntimeException("No Context associated with current Thread");
                } else if (min == null || !min.getMax(13)) {
                    throw ((Error) th);
                }
            }
            if (th instanceof RhinoException) {
                throw ((RhinoException) th);
            }
            throw new WrappedException(th);
        }

        public final boolean getMax() {
            return this.asInterface;
        }

        public final boolean getMin() {
            return this.ICustomTabsService;
        }

        /* access modifiers changed from: package-private */
        public final synchronized SecureNumKeyboard length() {
            return this.onTransact;
        }

        public final synchronized void setMin(Object obj, Object obj2) {
            if (!this.ICustomTabsCallback$Stub) {
                if (this.Mean$Arithmetic == null) {
                    this.Mean$Arithmetic = new HashMap();
                }
                this.Mean$Arithmetic.put(obj, obj2);
            } else {
                throw new IllegalStateException();
            }
        }

        public final void getMin(Object obj) {
            if (!this.ICustomTabsCallback$Stub) {
                Map<Object, Object> map = this.Mean$Arithmetic;
                if (map != null) {
                    map.remove(obj);
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }

        public final boolean getMax(int i) {
            return SecureTextView.SendAccessiBilityEventListener.getMax(this, i);
        }

        public final ClassLoader equals() {
            if (this.getInterfaceDescriptor == null) {
                SecureTextView.SendAccessiBilityEventListener sendAccessiBilityEventListener = this.getMax;
                ClassLoader classLoader = sendAccessiBilityEventListener.getMax;
                if (classLoader == null) {
                    ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                    if (contextClassLoader != null && getStyleId.setMin(contextClassLoader)) {
                        return contextClassLoader;
                    }
                    Class<?> cls = sendAccessiBilityEventListener.getClass();
                    if (cls != LogItem.toDoubleRange) {
                        classLoader = cls.getClassLoader();
                    } else {
                        classLoader = getClass().getClassLoader();
                    }
                }
                this.getInterfaceDescriptor = classLoader;
            }
            return this.getInterfaceDescriptor;
        }

        private Object getMax(LogUtils logUtils, String str, String str2, boolean z, LogTracer logTracer, getPublicKeyFromX509 getpublickeyfromx509) throws IOException {
            setHasFace sethasface;
            if (str2 == null) {
                str2 = "unnamed script";
            }
            boolean z2 = false;
            if (!(!(str == null))) {
                getStyleId.setMin();
            }
            if (logUtils == null) {
                z2 = true;
            }
            if (!(z2 ^ z)) {
                getStyleId.setMin();
            }
            AnonymousClass2 r0 = new Object() {
                private boolean FastBitmap$CoordinateSystem = false;
                private boolean Grayscale$Algorithm;
                private boolean IsOverlapping = true;
                private boolean equals = false;
                private boolean getMax = true;
                public int getMin = 0;
                private boolean hashCode = false;
                private boolean invokeSuspend;
                private boolean isInside = false;
                Set<String> length;
                getPublicKeyFromX509 setMax = ShiftType.setMin;
                public int setMin = 0;
                private boolean toDoubleRange;
                private boolean toFloatRange = true;
                private boolean toIntRange = true;
                private boolean toString;
                private boolean valueOf = false;
                private boolean values;

                public final boolean setMax() {
                    return this.getMax;
                }

                public final boolean getMax() {
                    return this.toIntRange;
                }

                public final boolean setMin() {
                    return this.isInside;
                }

                public final boolean getMin() {
                    return this.toFloatRange;
                }

                public final boolean length() {
                    return this.IsOverlapping;
                }

                public final boolean equals() {
                    return this.invokeSuspend;
                }

                public final boolean IsOverlapping() {
                    return this.equals;
                }

                public final boolean toIntRange() {
                    return this.FastBitmap$CoordinateSystem;
                }

                public final boolean toFloatRange() {
                    return this.hashCode;
                }

                public final boolean isInside() {
                    return this.toString;
                }

                public final boolean FastBitmap$CoordinateSystem() {
                    return this.values;
                }

                public final boolean toDoubleRange() {
                    return this.toDoubleRange;
                }

                public final boolean values() {
                    return this.Grayscale$Algorithm;
                }

                public final void getMin(AnonymousClass1 r2) {
                    getPublicKeyFromX509 getpublickeyfromx509;
                    if (r2.values == null) {
                        getpublickeyfromx509 = ShiftType.setMin;
                    } else {
                        getpublickeyfromx509 = r2.values;
                    }
                    if (getpublickeyfromx509 != null) {
                        this.setMax = getpublickeyfromx509;
                        this.setMin = r2.IsOverlapping;
                        this.getMax = !r2.values() || r2.getMax();
                        this.toIntRange = r2.getMax(3);
                        this.isInside = r2.getMax(2);
                        this.equals = r2.getMax(11);
                        this.FastBitmap$CoordinateSystem = r2.getMax(12);
                        this.toFloatRange = r2.getMax(6);
                        this.getMin = r2.invokeSuspend;
                        this.IsOverlapping = r2.getMin();
                        this.length = r2.ICustomTabsCallback;
                        this.hashCode = r2.onRelationshipValidationResult;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
            };
            r0.getMin(this);
            if (getpublickeyfromx509 == null) {
                getpublickeyfromx509 = r0.setMax;
            }
            traceTemplate tracetemplate = new traceTemplate(r0, getpublickeyfromx509);
            if (z) {
                tracetemplate.getMax = true;
            }
            if (toDoubleRange()) {
                tracetemplate.values = true;
            }
            if (str != null) {
                sethasface = tracetemplate.getMin(str, str2);
            } else {
                sethasface = tracetemplate.getMax(str2);
            }
            if (!z || (sethasface.setMin() != null && sethasface.setMin().length() == 110)) {
                getCricleColor max = new EditTextManager(r0, getpublickeyfromx509).setMax(sethasface);
                if (logTracer == null) {
                    logTracer = valueOf();
                }
                Object length2 = logTracer.length(r0, max, max.onPostMessage, z);
                if (this.valueOf != null) {
                    if (str == null) {
                        getStyleId.setMin();
                    }
                    if (length2 instanceof paintSquare) {
                        length(this, (paintSquare) length2, str);
                    } else {
                        throw new RuntimeException("NOT SUPPORTED");
                    }
                }
                if (z) {
                    return logTracer.length(this, logUtils, length2);
                }
                return logTracer.length(length2);
            }
            throw new IllegalArgumentException("compileFunction only accepts source with single JS function: ".concat(String.valueOf(str)));
        }

        private static void length(AnonymousClass1 r2, paintSquare paintsquare, String str) {
            for (int i = 0; i != paintsquare.getFunctionCount(); i++) {
                length(r2, paintsquare.getFunction(i), str);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = extraCallbackWithResult;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private o.LogTracer valueOf() {
            /*
                r1 = this;
                int r0 = r1.invokeSuspend
                if (r0 < 0) goto L_0x000f
                java.lang.Class<?> r0 = extraCallbackWithResult
                if (r0 == 0) goto L_0x000f
                java.lang.Object r0 = o.getStyleId.getMin(r0)
                o.LogTracer r0 = (o.LogTracer) r0
                goto L_0x0010
            L_0x000f:
                r0 = 0
            L_0x0010:
                if (r0 != 0) goto L_0x001a
                java.lang.Class<?> r0 = ICustomTabsCallback$Default
                java.lang.Object r0 = o.getStyleId.getMin(r0)
                o.LogTracer r0 = (o.LogTracer) r0
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SecureQwertyKeyboard.AnonymousClass1.valueOf():o.LogTracer");
        }

        public static LogTracer isInside() {
            return (LogTracer) getStyleId.getMin(ICustomTabsCallback$Default);
        }

        /* access modifiers changed from: package-private */
        public final addTraceInfo toIntRange() {
            Class<?> max;
            if (this.toString == null && (max = getStyleId.getMax("o.initStandard")) != null) {
                this.toString = (addTraceInfo) getStyleId.getMin(max);
            }
            return this.toString;
        }

        /* access modifiers changed from: package-private */
        public final boolean IsOverlapping() {
            int i = this.IsOverlapping;
            return i == 0 || i >= 130;
        }

        public final boolean values() {
            return this.setDefaultImpl;
        }

        public final boolean toDoubleRange() {
            if (this.extraCallback) {
                return true;
            }
            doAutoSubmit doautosubmit = this.setMin;
            return doautosubmit != null && doautosubmit.isStrict;
        }

        public static EvaluatorException getMin(String str, String str2, int i) {
            AnonymousClass1 min = INotProguard.setMin.getMin(INotProguard.setMin.length());
            if (min != null) {
                getPublicKeyFromX509 getpublickeyfromx509 = min.values;
                if (getpublickeyfromx509 == null) {
                    getpublickeyfromx509 = ShiftType.setMin;
                }
                return getpublickeyfromx509.getMax(str, str2, i, (String) null, 0);
            }
            throw new EvaluatorException(str, str2, i, (String) null, 0);
        }

        public static AnonymousClass1 toFloatRange() {
            AnonymousClass1 min = INotProguard.setMin.getMin(INotProguard.setMin.length());
            if (min != null) {
                return min;
            }
            throw new RuntimeException("No Context associated with current Thread");
        }

        public static String setMax(int[] iArr) {
            int lineNumber;
            LogTracer logTracer;
            AnonymousClass1 min = INotProguard.setMin.getMin(INotProguard.setMin.length());
            if (min == null) {
                return null;
            }
            if (min.create != null && (logTracer = (LogTracer) getStyleId.getMin(ICustomTabsCallback$Default)) != null) {
                return logTracer.length(min, iArr);
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int length2 = stackTrace.length;
            int i = 0;
            while (i < length2) {
                StackTraceElement stackTraceElement = stackTrace[i];
                String fileName = stackTraceElement.getFileName();
                if (fileName == null || fileName.endsWith(".java") || (lineNumber = stackTraceElement.getLineNumber()) < 0) {
                    i++;
                } else {
                    iArr[0] = lineNumber;
                    return fileName;
                }
            }
            return null;
        }
    }
}
