package o;

import com.alibaba.griver.base.common.utils.MD5Util;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class printConnMonitorLog implements Serializable, Comparable<printConnMonitorLog> {
    public static final printConnMonitorLog EMPTY = of(new byte[0]);
    static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final long serialVersionUID = 1;
    final byte[] data;
    transient int hashCode;
    transient String utf8;

    public printConnMonitorLog(byte[] bArr) {
        this.data = bArr;
    }

    public static printConnMonitorLog of(byte... bArr) {
        if (bArr != null) {
            return new printConnMonitorLog((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static printConnMonitorLog of(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            MonitorModel.getMax((long) bArr.length, (long) i, (long) i2);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new printConnMonitorLog(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static printConnMonitorLog of(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new printConnMonitorLog(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static printConnMonitorLog encodeUtf8(String str) {
        if (str != null) {
            printConnMonitorLog printconnmonitorlog = new printConnMonitorLog(str.getBytes(MonitorModel.getMax));
            printconnmonitorlog.utf8 = str;
            return printconnmonitorlog;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static printConnMonitorLog encodeString(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new printConnMonitorLog(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    public String utf8() {
        String str = this.utf8;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.data, MonitorModel.getMax);
        this.utf8 = str2;
        return str2;
    }

    public String string(Charset charset) {
        if (charset != null) {
            return new String(this.data, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String base64() {
        return submitSerial.getMin(this.data);
    }

    public printConnMonitorLog md5() {
        return digest(MD5Util.ALGORIGTHM_MD5);
    }

    public printConnMonitorLog sha1() {
        return digest("SHA-1");
    }

    public printConnMonitorLog sha256() {
        return digest("SHA-256");
    }

    public printConnMonitorLog sha512() {
        return digest("SHA-512");
    }

    private printConnMonitorLog digest(String str) {
        try {
            return of(MessageDigest.getInstance(str).digest(this.data));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public printConnMonitorLog hmacSha1(printConnMonitorLog printconnmonitorlog) {
        return hmac("HmacSHA1", printconnmonitorlog);
    }

    public printConnMonitorLog hmacSha256(printConnMonitorLog printconnmonitorlog) {
        return hmac(getTabbarModel.HASHING_ALGORITHM, printconnmonitorlog);
    }

    public printConnMonitorLog hmacSha512(printConnMonitorLog printconnmonitorlog) {
        return hmac("HmacSHA512", printconnmonitorlog);
    }

    private printConnMonitorLog hmac(String str, printConnMonitorLog printconnmonitorlog) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(printconnmonitorlog.toByteArray(), str));
            return of(instance.doFinal(this.data));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public String base64Url() {
        return submitSerial.getMax(this.data);
    }

    @Nullable
    public static printConnMonitorLog decodeBase64(String str) {
        if (str != null) {
            byte[] max = submitSerial.getMax(str);
            if (max != null) {
                return new printConnMonitorLog(max);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public String hex() {
        byte[] bArr = this.data;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public static printConnMonitorLog decodeHex(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
            }
            return of(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)));
        }
    }

    private static int decodeHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
            }
        }
        return (c - c2) + 10;
    }

    public static printConnMonitorLog read(InputStream inputStream, int i) throws IOException {
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
            return new printConnMonitorLog(bArr);
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i)));
        }
    }

    public printConnMonitorLog toAsciiLowercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new printConnMonitorLog(bArr2);
            }
        }
    }

    public printConnMonitorLog toAsciiUppercase() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 97 || b > 122) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArr2[i2] = (byte) (b2 - 32);
                    }
                }
                return new printConnMonitorLog(bArr2);
            }
        }
    }

    public printConnMonitorLog substring(int i) {
        return substring(i, this.data.length);
    }

    public printConnMonitorLog substring(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.data;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.data, i, bArr2, 0, i3);
                    return new printConnMonitorLog(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder("endIndex > length(");
                sb.append(this.data.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public byte getByte(int i) {
        return this.data[i];
    }

    public int size() {
        return this.data.length;
    }

    public byte[] toByteArray() {
        return (byte[]) this.data.clone();
    }

    /* access modifiers changed from: package-private */
    public byte[] internalArray() {
        return this.data;
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }

    public void write(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.data);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public void write(submitLazy submitlazy) {
        byte[] bArr = this.data;
        submitlazy.length(bArr, 0, bArr.length);
    }

    public boolean rangeEquals(int i, printConnMonitorLog printconnmonitorlog, int i2, int i3) {
        return printconnmonitorlog.rangeEquals(i2, this.data, i, i3);
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.data;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && MonitorModel.getMin(bArr2, i, bArr, i2, i3);
    }

    public final boolean startsWith(printConnMonitorLog printconnmonitorlog) {
        return rangeEquals(0, printconnmonitorlog, 0, printconnmonitorlog.size());
    }

    public final boolean startsWith(byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public final boolean endsWith(printConnMonitorLog printconnmonitorlog) {
        return rangeEquals(size() - printconnmonitorlog.size(), printconnmonitorlog, 0, printconnmonitorlog.size());
    }

    public final boolean endsWith(byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(printConnMonitorLog printconnmonitorlog) {
        return indexOf(printconnmonitorlog.internalArray(), 0);
    }

    public final int indexOf(printConnMonitorLog printconnmonitorlog, int i) {
        return indexOf(printconnmonitorlog.internalArray(), i);
    }

    public final int indexOf(byte[] bArr) {
        return indexOf(bArr, 0);
    }

    public int indexOf(byte[] bArr, int i) {
        int length = this.data.length - bArr.length;
        for (int max = Math.max(i, 0); max <= length; max++) {
            if (MonitorModel.getMin(this.data, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    public final int lastIndexOf(printConnMonitorLog printconnmonitorlog) {
        return lastIndexOf(printconnmonitorlog.internalArray(), size());
    }

    public final int lastIndexOf(printConnMonitorLog printconnmonitorlog, int i) {
        return lastIndexOf(printconnmonitorlog.internalArray(), i);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf(bArr, size());
    }

    public int lastIndexOf(byte[] bArr, int i) {
        for (int min = Math.min(i, this.data.length - bArr.length); min >= 0; min--) {
            if (MonitorModel.getMin(this.data, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof printConnMonitorLog) {
            printConnMonitorLog printconnmonitorlog = (printConnMonitorLog) obj;
            int size = printconnmonitorlog.size();
            byte[] bArr = this.data;
            return size == bArr.length && printconnmonitorlog.rangeEquals(0, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode2 = Arrays.hashCode(this.data);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public int compareTo(printConnMonitorLog printconnmonitorlog) {
        int size = size();
        int size2 = printconnmonitorlog.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            byte b = getByte(i) & 255;
            byte b2 = printconnmonitorlog.getByte(i) & 255;
            if (b != b2) {
                return b < b2 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String utf82 = utf8();
        int codePointIndexToCharIndex = codePointIndexToCharIndex(utf82, 64);
        if (codePointIndexToCharIndex != -1) {
            String replace = utf82.substring(0, codePointIndexToCharIndex).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (codePointIndexToCharIndex < utf82.length()) {
                StringBuilder sb = new StringBuilder("[size=");
                sb.append(this.data.length);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("[text=");
            sb2.append(replace);
            sb2.append("]");
            return sb2.toString();
        } else if (this.data.length <= 64) {
            StringBuilder sb3 = new StringBuilder("[hex=");
            sb3.append(hex());
            sb3.append("]");
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder("[size=");
            sb4.append(this.data.length);
            sb4.append(" hex=");
            sb4.append(substring(0, 64).hex());
            sb4.append("…]");
            return sb4.toString();
        }
    }

    static int codePointIndexToCharIndex(String str, int i) {
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

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        printConnMonitorLog read = read(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = printConnMonitorLog.class.getDeclaredField("data");
            declaredField.setAccessible(true);
            declaredField.set(this, read.data);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }
}
