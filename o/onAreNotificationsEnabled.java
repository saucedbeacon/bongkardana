package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import javax.security.auth.x500.X500Principal;

final class onAreNotificationsEnabled {
    int equals;
    int getMax;
    final int getMin;
    char[] isInside;
    int length;
    int setMax;
    final String setMin;

    public onAreNotificationsEnabled(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.setMin = name;
        this.getMin = name.length();
    }

    /* access modifiers changed from: package-private */
    public final String setMin() {
        int i;
        while (true) {
            int i2 = this.getMax;
            if (i2 >= this.getMin || this.isInside[i2] != ' ') {
                int i3 = this.getMax;
            } else {
                this.getMax = i2 + 1;
            }
        }
        int i32 = this.getMax;
        if (i32 == this.getMin) {
            return null;
        }
        this.setMax = i32;
        this.getMax = i32 + 1;
        while (true) {
            int i4 = this.getMax;
            if (i4 >= this.getMin) {
                break;
            }
            char[] cArr = this.isInside;
            if (cArr[i4] == '=' || cArr[i4] == ' ') {
                break;
            }
            this.getMax = i4 + 1;
        }
        int i5 = this.getMax;
        if (i5 < this.getMin) {
            this.length = i5;
            if (this.isInside[i5] == ' ') {
                while (true) {
                    int i6 = this.getMax;
                    if (i6 >= this.getMin) {
                        break;
                    }
                    char[] cArr2 = this.isInside;
                    if (cArr2[i6] == '=' || cArr2[i6] != ' ') {
                        break;
                    }
                    this.getMax = i6 + 1;
                }
                char[] cArr3 = this.isInside;
                int i7 = this.getMax;
                if (cArr3[i7] != '=' || i7 == this.getMin) {
                    StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
                    sb.append(this.setMin);
                    throw new IllegalStateException(sb.toString());
                }
            }
            do {
                i = this.getMax + 1;
                this.getMax = i;
                if (i >= this.getMin || this.isInside[i] != ' ') {
                    int i8 = this.length;
                    int i9 = this.setMax;
                }
                i = this.getMax + 1;
                this.getMax = i;
                break;
            } while (this.isInside[i] != ' ');
            int i82 = this.length;
            int i92 = this.setMax;
            if (i82 - i92 > 4) {
                char[] cArr4 = this.isInside;
                if (cArr4[i92 + 3] == '.' && (cArr4[i92] == 'O' || cArr4[i92] == 'o')) {
                    char[] cArr5 = this.isInside;
                    int i10 = this.setMax;
                    if (cArr5[i10 + 1] == 'I' || cArr5[i10 + 1] == 'i') {
                        char[] cArr6 = this.isInside;
                        int i11 = this.setMax;
                        if (cArr6[i11 + 2] == 'D' || cArr6[i11 + 2] == 'd') {
                            this.setMax += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.isInside;
            int i12 = this.setMax;
            return new String(cArr7, i12, this.length - i12);
        }
        StringBuilder sb2 = new StringBuilder("Unexpected end of DN: ");
        sb2.append(this.setMin);
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public final String getMin() {
        int i = this.getMax;
        if (i + 4 < this.getMin) {
            this.setMax = i;
            this.getMax = i + 1;
            while (true) {
                int i2 = this.getMax;
                if (i2 == this.getMin) {
                    break;
                }
                char[] cArr = this.isInside;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.length = i2;
                    this.getMax = i2 + 1;
                    while (true) {
                        int i3 = this.getMax;
                        if (i3 >= this.getMin || this.isInside[i3] != ' ') {
                            break;
                        }
                        this.getMax = i3 + 1;
                    }
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + ' ');
                    }
                    this.getMax++;
                }
            }
            this.length = this.getMax;
            int i4 = this.length;
            int i5 = this.setMax;
            int i6 = i4 - i5;
            if (i6 < 5 || (i6 & 1) == 0) {
                StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
                sb.append(this.setMin);
                throw new IllegalStateException(sb.toString());
            }
            int i7 = i6 / 2;
            byte[] bArr = new byte[i7];
            int i8 = i5 + 1;
            for (int i9 = 0; i9 < i7; i9++) {
                bArr[i9] = (byte) length(i8);
                i8 += 2;
            }
            return new String(this.isInside, this.setMax, i6);
        }
        StringBuilder sb2 = new StringBuilder("Unexpected end of DN: ");
        sb2.append(this.setMin);
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r1 = r8.isInside;
        r2 = r8.setMax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        return new java.lang.String(r1, r2, r8.equals - r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMax() {
        /*
            r8 = this;
            int r0 = r8.getMax
            r8.setMax = r0
            r8.length = r0
        L_0x0006:
            int r0 = r8.getMax
            int r1 = r8.getMin
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.isInside
            int r2 = r8.setMax
            int r3 = r8.length
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.isInside
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x0060
            if (r2 == r5) goto L_0x0053
            r5 = 92
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0053
            if (r2 == r3) goto L_0x0053
            int r2 = r8.length
            int r3 = r2 + 1
            r8.length = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.getMax = r0
            goto L_0x0006
        L_0x0040:
            int r0 = r8.length
            int r2 = r0 + 1
            r8.length = r2
            char r2 = r8.length()
            r1[r0] = r2
            int r0 = r8.getMax
            int r0 = r0 + 1
            r8.getMax = r0
            goto L_0x0006
        L_0x0053:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.isInside
            int r2 = r8.setMax
            int r3 = r8.length
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0060:
            int r2 = r8.length
            r8.equals = r2
            int r0 = r0 + 1
            r8.getMax = r0
            int r0 = r2 + 1
            r8.length = r0
            r1[r2] = r6
        L_0x006e:
            int r0 = r8.getMax
            int r1 = r8.getMin
            if (r0 >= r1) goto L_0x0087
            char[] r1 = r8.isInside
            char r2 = r1[r0]
            if (r2 != r6) goto L_0x0087
            int r2 = r8.length
            int r7 = r2 + 1
            r8.length = r7
            r1[r2] = r6
            int r0 = r0 + 1
            r8.getMax = r0
            goto L_0x006e
        L_0x0087:
            int r0 = r8.getMax
            int r1 = r8.getMin
            if (r0 == r1) goto L_0x009b
            char[] r1 = r8.isInside
            char r2 = r1[r0]
            if (r2 == r3) goto L_0x009b
            char r2 = r1[r0]
            if (r2 == r4) goto L_0x009b
            char r0 = r1[r0]
            if (r0 != r5) goto L_0x0006
        L_0x009b:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.isInside
            int r2 = r8.setMax
            int r3 = r8.equals
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onAreNotificationsEnabled.getMax():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final char length() {
        int i = this.getMax + 1;
        this.getMax = i;
        if (i != this.getMin) {
            char c = this.isInside[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return setMax();
                        }
                }
            }
            return this.isInside[this.getMax];
        }
        StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
        sb.append(this.setMin);
        throw new IllegalStateException(sb.toString());
    }

    private char setMax() {
        int i;
        int i2;
        int length2 = length(this.getMax);
        this.getMax++;
        if (length2 < 128) {
            return (char) length2;
        }
        if (length2 < 192 || length2 > 247) {
            return '?';
        }
        if (length2 <= 223) {
            i2 = length2 & 31;
            i = 1;
        } else if (length2 <= 239) {
            i = 2;
            i2 = length2 & 15;
        } else {
            i = 3;
            i2 = length2 & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.getMax + 1;
            this.getMax = i4;
            if (i4 == this.getMin || this.isInside[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.getMax = i5;
            int length3 = length(i5);
            this.getMax++;
            if ((length3 & PsExtractor.AUDIO_STREAM) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (length3 & 63);
        }
        return (char) i2;
    }

    private int length(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.getMin) {
            char c = this.isInside[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                StringBuilder sb = new StringBuilder("Malformed DN: ");
                sb.append(this.setMin);
                throw new IllegalStateException(sb.toString());
            } else {
                i2 = c - '7';
            }
            char c2 = this.isInside[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                StringBuilder sb2 = new StringBuilder("Malformed DN: ");
                sb2.append(this.setMin);
                throw new IllegalStateException(sb2.toString());
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        StringBuilder sb3 = new StringBuilder("Malformed DN: ");
        sb3.append(this.setMin);
        throw new IllegalStateException(sb3.toString());
    }
}
