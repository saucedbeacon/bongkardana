package o;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class init extends evictAll {
    final transient byte[][] f;
    final transient int[] g;

    init(maxSize maxsize, int i) {
        super((byte[]) null);
        setPaddingLeft.getMax(maxsize.setMax, 0, (long) i);
        fillInStackTrace fillinstacktrace = maxsize.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (fillinstacktrace.setMin != fillinstacktrace.getMin) {
                i3 += fillinstacktrace.setMin - fillinstacktrace.getMin;
                i4++;
                fillinstacktrace = fillinstacktrace.equals;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f = new byte[i4][];
        this.g = new int[(i4 * 2)];
        fillInStackTrace fillinstacktrace2 = maxsize.length;
        int i5 = 0;
        while (i2 < i) {
            this.f[i5] = fillinstacktrace2.setMax;
            i2 += fillinstacktrace2.setMin - fillinstacktrace2.getMin;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.g;
            iArr[i5] = i2;
            iArr[this.f.length + i5] = fillinstacktrace2.getMin;
            fillinstacktrace2.length = true;
            i5++;
            fillinstacktrace2 = fillinstacktrace2.equals;
        }
    }

    public final String a() {
        return n().a();
    }

    public final String b() {
        return n().b();
    }

    public final String g() {
        return n().g();
    }

    public final evictAll h() {
        return n().h();
    }

    public final evictAll i() {
        return n().i();
    }

    public final evictAll c() {
        return n().c();
    }

    public final evictAll e() {
        return n().e();
    }

    public final String f() {
        return n().f();
    }

    public final evictAll a(int i) {
        return n().a(i);
    }

    public final evictAll a(int i, int i2) {
        return n().a(i, i2);
    }

    public final byte b(int i) {
        int i2;
        setPaddingLeft.getMax((long) this.g[this.f.length - 1], (long) i, 1);
        int c = c(i);
        if (c == 0) {
            i2 = 0;
        } else {
            i2 = this.g[c - 1];
        }
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[c][(i - i2) + iArr[bArr.length + c]];
    }

    private int c(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    public final int j() {
        return this.g[this.f.length - 1];
    }

    public final byte[] k() {
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public final ByteBuffer m() {
        return ByteBuffer.wrap(k()).asReadOnlyBuffer();
    }

    public final void a(OutputStream outputStream) {
        if (outputStream != null) {
            int length = this.f.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = this.g;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                outputStream.write(this.f[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* access modifiers changed from: package-private */
    public final void a(maxSize maxsize) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            fillInStackTrace fillinstacktrace = new fillInStackTrace(this.f[i], i3, (i3 + i4) - i2);
            if (maxsize.length == null) {
                fillinstacktrace.IsOverlapping = fillinstacktrace;
                fillinstacktrace.equals = fillinstacktrace;
                maxsize.length = fillinstacktrace;
            } else {
                fillInStackTrace fillinstacktrace2 = maxsize.length.IsOverlapping;
                fillinstacktrace.IsOverlapping = fillinstacktrace2;
                fillinstacktrace.equals = fillinstacktrace2.equals;
                fillinstacktrace2.equals.IsOverlapping = fillinstacktrace;
                fillinstacktrace2.equals = fillinstacktrace;
            }
            i++;
            i2 = i4;
        }
        maxsize.setMax += (long) i2;
    }

    public final boolean a(int i, evictAll evictall, int i2, int i3) {
        int i4;
        if (i < 0 || i > j() - i3) {
            return false;
        }
        int c = c(i);
        while (i3 > 0) {
            if (c == 0) {
                i4 = 0;
            } else {
                i4 = this.g[c - 1];
            }
            int min = Math.min(i3, ((this.g[c] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!evictall.a(i2, bArr[c], (i - i4) + iArr[bArr.length + c], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            c++;
        }
        return true;
    }

    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > j() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int c = c(i);
        while (i3 > 0) {
            if (c == 0) {
                i4 = 0;
            } else {
                i4 = this.g[c - 1];
            }
            int min = Math.min(i3, ((this.g[c] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!setPaddingLeft.length(bArr2[c], (i - i4) + iArr[bArr2.length + c], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            c++;
        }
        return true;
    }

    public final int a(byte[] bArr, int i) {
        return n().a(bArr, i);
    }

    public final int b(byte[] bArr, int i) {
        return n().b(bArr, i);
    }

    private evictAll n() {
        return new evictAll(k());
    }

    /* access modifiers changed from: package-private */
    public final byte[] l() {
        return k();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evictAll) {
            evictAll evictall = (evictAll) obj;
            return evictall.j() == j() && a(0, evictall, 0, j());
        }
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.d = i4;
        return i4;
    }

    public final String toString() {
        return n().toString();
    }

    private Object writeReplace() {
        return n();
    }
}
