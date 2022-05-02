package o;

import com.alibaba.griver.base.common.utils.MD5Util;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class evictAll implements Serializable, Comparable<evictAll> {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f10814a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final evictAll b = a(new byte[0]);
    private static final long serialVersionUID = 1;
    final byte[] c;
    transient int d;
    transient String e;

    public evictAll(byte[] bArr) {
        this.c = bArr;
    }

    public static evictAll a(byte... bArr) {
        if (bArr != null) {
            return new evictAll((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static evictAll a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            setPaddingLeft.getMax((long) bArr.length, (long) i, (long) i2);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new evictAll(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static evictAll a(String str) {
        if (str != null) {
            evictAll evictall = new evictAll(str.getBytes(setPaddingLeft.length));
            evictall.e = str;
            return evictall;
        }
        throw new IllegalArgumentException("s == null");
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, setPaddingLeft.length);
        this.e = str2;
        return str2;
    }

    public String b() {
        return trimToSize.getMin(this.c);
    }

    public evictAll c() {
        return d(MD5Util.ALGORIGTHM_MD5);
    }

    public evictAll d() {
        return d("SHA-1");
    }

    public evictAll e() {
        return d("SHA-256");
    }

    private evictAll d(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.c));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public String f() {
        return trimToSize.setMin(this.c);
    }

    public static evictAll b(String str) {
        if (str != null) {
            byte[] min = trimToSize.setMin(str);
            if (min != null) {
                return new evictAll(min);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public String g() {
        byte[] bArr = this.c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f10814a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static evictAll c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
            }
            return a(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)));
        }
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c2)));
            }
        }
        return (c2 - c3) + 10;
    }

    public static evictAll a(InputStream inputStream, int i) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new evictAll(bArr);
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i)));
        }
    }

    public evictAll h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 < 65 || b2 > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new evictAll(bArr2);
            }
        }
    }

    public evictAll i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 < 97 || b2 > 122) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 97 && b3 <= 122) {
                        bArr2[i2] = (byte) (b3 - 32);
                    }
                }
                return new evictAll(bArr2);
            }
        }
    }

    public evictAll a(int i) {
        return a(i, this.c.length);
    }

    public evictAll a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.c, i, bArr2, 0, i3);
                    return new evictAll(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder("endIndex > length(");
                sb.append(this.c.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public byte b(int i) {
        return this.c[i];
    }

    public int j() {
        return this.c.length;
    }

    public byte[] k() {
        return (byte[]) this.c.clone();
    }

    /* access modifiers changed from: package-private */
    public byte[] l() {
        return this.c;
    }

    public ByteBuffer m() {
        return ByteBuffer.wrap(this.c).asReadOnlyBuffer();
    }

    public void a(OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.write(this.c);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public void a(maxSize maxsize) {
        byte[] bArr = this.c;
        maxsize.setMin(bArr, 0, bArr.length);
    }

    public boolean a(int i, evictAll evictall, int i2, int i3) {
        return evictall.a(i2, this.c, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && setPaddingLeft.length(bArr2, i, bArr, i2, i3);
    }

    public final boolean a(evictAll evictall) {
        return a(0, evictall, 0, evictall.j());
    }

    public final boolean b(byte[] bArr) {
        return a(0, bArr, 0, bArr.length);
    }

    public final boolean b(evictAll evictall) {
        return a(j() - evictall.j(), evictall, 0, evictall.j());
    }

    public final boolean c(byte[] bArr) {
        return a(j() - bArr.length, bArr, 0, bArr.length);
    }

    public final int c(evictAll evictall) {
        return a(evictall.l(), 0);
    }

    public final int a(evictAll evictall, int i) {
        return a(evictall.l(), i);
    }

    public final int d(byte[] bArr) {
        return a(bArr, 0);
    }

    public int a(byte[] bArr, int i) {
        int length = this.c.length - bArr.length;
        for (int max = Math.max(i, 0); max <= length; max++) {
            if (setPaddingLeft.length(this.c, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    public final int d(evictAll evictall) {
        return b(evictall.l(), j());
    }

    public final int b(evictAll evictall, int i) {
        return b(evictall.l(), i);
    }

    public final int e(byte[] bArr) {
        return b(bArr, j());
    }

    public int b(byte[] bArr, int i) {
        for (int min = Math.min(i, this.c.length - bArr.length); min >= 0; min--) {
            if (setPaddingLeft.length(this.c, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evictAll) {
            evictAll evictall = (evictAll) obj;
            int j = evictall.j();
            byte[] bArr = this.c;
            return j == bArr.length && evictall.a(0, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    /* renamed from: e */
    public int compareTo(evictAll evictall) {
        int j = j();
        int j2 = evictall.j();
        int min = Math.min(j, j2);
        for (int i = 0; i < min; i++) {
            byte b2 = b(i) & 255;
            byte b3 = evictall.b(i) & 255;
            if (b2 != b3) {
                return b2 < b3 ? -1 : 1;
            }
        }
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int a3 = a(a2, 64);
        if (a3 != -1) {
            String replace = a2.substring(0, a3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (a3 < a2.length()) {
                StringBuilder sb = new StringBuilder("[size=");
                sb.append(this.c.length);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("[text=");
            sb2.append(replace);
            sb2.append("]");
            return sb2.toString();
        } else if (this.c.length <= 64) {
            StringBuilder sb3 = new StringBuilder("[hex=");
            sb3.append(g());
            sb3.append("]");
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder("[size=");
            sb4.append(this.c.length);
            sb4.append(" hex=");
            sb4.append(a(0, 64).g());
            sb4.append("…]");
            return sb4.toString();
        }
    }

    static int a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        evictAll a2 = a((InputStream) objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = evictAll.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, a2.c);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }
}
