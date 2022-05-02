package o;

import com.google.common.base.Ascii;
import o.SimplePassword;
import org.mozilla.classfile.ClassFileWriter;

public final class SecureMoneyKeyboard {
    private SimplePassword.TextWatcherImpl FastBitmap$CoordinateSystem = new SimplePassword.TextWatcherImpl();
    private SimplePassword.TextWatcherImpl IsOverlapping = new SimplePassword.TextWatcherImpl();
    public byte[] equals;
    public switchOff getMax = new switchOff();
    public int getMin;
    private SimplePassword.TextWatcherImpl isInside = new SimplePassword.TextWatcherImpl();
    public switchOff length = new switchOff();
    public switchOff setMax = new switchOff();
    public int setMin;
    private SimplePassword.TextWatcherImpl toDoubleRange = new SimplePassword.TextWatcherImpl();
    private SimplePassword.TextWatcherImpl toFloatRange = new SimplePassword.TextWatcherImpl();
    private ClassFileWriter toIntRange;

    public SecureMoneyKeyboard(ClassFileWriter classFileWriter) {
        this.toIntRange = classFileWriter;
        this.setMin = 1;
        this.equals = new byte[256];
        this.getMin = 0;
    }

    public static int getMax(String str, int i, int i2) {
        int i3 = 65535;
        if ((i2 - i) * 3 <= 65535) {
            return i2;
        }
        while (i != i2) {
            char charAt = str.charAt(i);
            i3 = (charAt == 0 || charAt > 127) ? charAt < 2047 ? i3 - 2 : i3 - 3 : i3 - 1;
            if (i3 < 0) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final short setMin(java.lang.String r13) {
        /*
            r12 = this;
            o.SimplePassword$TextWatcherImpl r0 = r12.IsOverlapping
            r1 = -1
            int r0 = r0.get(r13, r1)
            r2 = 1
            if (r0 != r1) goto L_0x00b1
            int r1 = r13.length()
            r3 = 65535(0xffff, float:9.1834E-41)
            r4 = 0
            if (r1 <= r3) goto L_0x0017
        L_0x0014:
            r4 = 1
            goto L_0x00a6
        L_0x0017:
            int r5 = r1 * 3
            int r5 = r5 + 3
            r12.setMin((int) r5)
            int r5 = r12.getMin
            byte[] r6 = r12.equals
            int r7 = r5 + 1
            r6[r5] = r2
            int r7 = r7 + 2
            org.mozilla.classfile.ClassFileWriter r5 = r12.toIntRange
            char[] r5 = r5.isInside((int) r1)
            r13.getChars(r4, r1, r5, r4)
            r6 = 0
        L_0x0032:
            if (r6 == r1) goto L_0x0080
            char r8 = r5[r6]
            if (r8 == 0) goto L_0x0044
            r9 = 127(0x7f, float:1.78E-43)
            if (r8 > r9) goto L_0x0044
            byte[] r9 = r12.equals
            int r10 = r7 + 1
            byte r8 = (byte) r8
            r9[r7] = r8
            goto L_0x0067
        L_0x0044:
            r9 = 2047(0x7ff, float:2.868E-42)
            if (r8 <= r9) goto L_0x0069
            byte[] r9 = r12.equals
            int r10 = r7 + 1
            int r11 = r8 >> 12
            r11 = r11 | 224(0xe0, float:3.14E-43)
            byte r11 = (byte) r11
            r9[r7] = r11
            int r7 = r10 + 1
            int r11 = r8 >> 6
            r11 = r11 & 63
            r11 = r11 | 128(0x80, float:1.794E-43)
            byte r11 = (byte) r11
            r9[r10] = r11
            int r10 = r7 + 1
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r9[r7] = r8
        L_0x0067:
            r7 = r10
            goto L_0x007d
        L_0x0069:
            byte[] r9 = r12.equals
            int r10 = r7 + 1
            int r11 = r8 >> 6
            r11 = r11 | 192(0xc0, float:2.69E-43)
            byte r11 = (byte) r11
            r9[r7] = r11
            int r7 = r10 + 1
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r9[r10] = r8
        L_0x007d:
            int r6 = r6 + 1
            goto L_0x0032
        L_0x0080:
            int r1 = r12.getMin
            int r5 = r1 + 1
            int r5 = r5 + 2
            int r5 = r7 - r5
            if (r5 <= r3) goto L_0x008b
            goto L_0x0014
        L_0x008b:
            byte[] r0 = r12.equals
            int r3 = r1 + 1
            int r6 = r5 >>> 8
            byte r6 = (byte) r6
            r0[r3] = r6
            int r1 = r1 + 2
            byte r3 = (byte) r5
            r0[r1] = r3
            r12.getMin = r7
            int r0 = r12.setMin
            int r1 = r0 + 1
            r12.setMin = r1
            o.SimplePassword$TextWatcherImpl r1 = r12.IsOverlapping
            r1.put(r13, r0)
        L_0x00a6:
            if (r4 != 0) goto L_0x00a9
            goto L_0x00b1
        L_0x00a9:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Too big string"
            r13.<init>(r0)
            throw r13
        L_0x00b1:
            o.switchOff r1 = r12.length
            r1.put((int) r0, (java.lang.Object) r13)
            o.switchOff r13 = r12.getMax
            r13.put((int) r0, (int) r2)
            short r13 = (short) r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SecureMoneyKeyboard.setMin(java.lang.String):short");
    }

    private short setMin(String str, String str2) {
        short min = setMin(str);
        short min2 = setMin(str2);
        setMin(5);
        byte[] bArr = this.equals;
        int i = this.getMin;
        int i2 = i + 1;
        this.getMin = i2;
        bArr[i] = Ascii.FF;
        int min3 = ClassFileWriter.getMin((int) min, bArr, i2);
        this.getMin = min3;
        this.getMin = ClassFileWriter.getMin((int) min2, this.equals, min3);
        this.getMax.put(this.setMin, 12);
        int i3 = this.setMin;
        this.setMin = i3 + 1;
        return (short) i3;
    }

    public final short length(String str) {
        String str2;
        int i = this.FastBitmap$CoordinateSystem.get(str, -1);
        if (i == -1) {
            if (str.indexOf(46) > 0) {
                String max = ClassFileWriter.getMax(str);
                int i2 = this.FastBitmap$CoordinateSystem.get(max, -1);
                if (i2 != -1) {
                    this.FastBitmap$CoordinateSystem.put(str, i2);
                }
                int i3 = i2;
                str2 = max;
                i = i3;
            } else {
                str2 = str;
            }
            if (i == -1) {
                short min = setMin(str2);
                setMin(3);
                byte[] bArr = this.equals;
                int i4 = this.getMin;
                int i5 = i4 + 1;
                this.getMin = i5;
                bArr[i4] = 7;
                this.getMin = ClassFileWriter.getMin((int) min, bArr, i5);
                i = this.setMin;
                this.setMin = i + 1;
                this.FastBitmap$CoordinateSystem.put(str2, i);
                if (!str.equals(str2)) {
                    this.FastBitmap$CoordinateSystem.put(str, i);
                }
            }
        }
        this.length.put(i, (Object) str);
        this.getMax.put(i, 7);
        return (short) i;
    }

    public final short getMax(String str, String str2, String str3) {
        handleAccessiBilityEvent handleaccessibilityevent = new handleAccessiBilityEvent(str, str2, str3);
        int i = this.isInside.get(handleaccessibilityevent, -1);
        if (i == -1) {
            short min = setMin(str2, str3);
            short length2 = length(str);
            setMin(5);
            byte[] bArr = this.equals;
            int i2 = this.getMin;
            int i3 = i2 + 1;
            this.getMin = i3;
            bArr[i2] = 9;
            int min2 = ClassFileWriter.getMin((int) length2, bArr, i3);
            this.getMin = min2;
            this.getMin = ClassFileWriter.getMin((int) min, this.equals, min2);
            i = this.setMin;
            this.setMin = i + 1;
            this.isInside.put(handleaccessibilityevent, i);
        }
        this.length.put(i, (Object) handleaccessibilityevent);
        this.getMax.put(i, 9);
        return (short) i;
    }

    public final short getMin(String str, String str2, String str3) {
        handleAccessiBilityEvent handleaccessibilityevent = new handleAccessiBilityEvent(str, str2, str3);
        int i = this.toFloatRange.get(handleaccessibilityevent, -1);
        if (i == -1) {
            short min = setMin(str2, str3);
            short length2 = length(str);
            setMin(5);
            byte[] bArr = this.equals;
            int i2 = this.getMin;
            int i3 = i2 + 1;
            this.getMin = i3;
            bArr[i2] = 10;
            int min2 = ClassFileWriter.getMin((int) length2, bArr, i3);
            this.getMin = min2;
            this.getMin = ClassFileWriter.getMin((int) min, this.equals, min2);
            i = this.setMin;
            this.setMin = i + 1;
            this.toFloatRange.put(handleaccessibilityevent, i);
        }
        this.length.put(i, (Object) handleaccessibilityevent);
        this.getMax.put(i, 10);
        return (short) i;
    }

    public final short setMin(String str, String str2, String str3) {
        short min = setMin(str2, str3);
        short length2 = length(str);
        setMin(5);
        byte[] bArr = this.equals;
        int i = this.getMin;
        int i2 = i + 1;
        this.getMin = i2;
        bArr[i] = Ascii.VT;
        int min2 = ClassFileWriter.getMin((int) length2, bArr, i2);
        this.getMin = min2;
        this.getMin = ClassFileWriter.getMin((int) min, this.equals, min2);
        handleAccessiBilityEvent handleaccessibilityevent = new handleAccessiBilityEvent(str, str2, str3);
        this.length.put(this.setMin, (Object) handleaccessibilityevent);
        this.getMax.put(this.setMin, 11);
        int i3 = this.setMin;
        this.setMin = i3 + 1;
        return (short) i3;
    }

    public final byte length(int i) {
        return (byte) this.getMax.getInt(i, 0);
    }

    public final void setMin(int i) {
        int i2 = this.getMin;
        int i3 = i2 + i;
        byte[] bArr = this.equals;
        if (i3 > bArr.length) {
            int length2 = bArr.length * 2;
            if (i2 + i > length2) {
                length2 = i2 + i;
            }
            byte[] bArr2 = new byte[length2];
            System.arraycopy(this.equals, 0, bArr2, 0, this.getMin);
            this.equals = bArr2;
        }
    }
}
