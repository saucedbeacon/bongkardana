package com.alibaba.griver.bluetooth.altbeacon.beacon;

import android.annotation.TargetApi;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothLeUtils;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.UUID;
import java.util.regex.Pattern;

public class Identifier implements Serializable, Comparable<Identifier> {
    private static final Pattern DECIMAL_PATTERN = Pattern.compile("^0|[1-9][0-9]*$");
    private static final Pattern HEX_PATTERN = Pattern.compile("^0x[0-9A-Fa-f]*$");
    private static final Pattern HEX_PATTERN_NO_PREFIX = Pattern.compile("^[0-9A-Fa-f]*$");
    private static final int MAX_INTEGER = 65535;
    private static final Pattern UUID_PATTERN = Pattern.compile("^[0-9A-Fa-f]{8}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{12}$");
    private final byte[] mValue;

    @Deprecated
    public Identifier(Identifier identifier) {
        if (identifier != null) {
            this.mValue = identifier.mValue;
            return;
        }
        throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"identifier\" is null.");
    }

    protected Identifier(byte[] bArr) {
        if (bArr != null) {
            this.mValue = bArr;
            return;
        }
        throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"value\" is null.");
    }

    public static Identifier parse(String str) {
        return parse(str, -1);
    }

    public static Identifier parse(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"stringValue\" is null.");
        } else if (HEX_PATTERN.matcher(str).matches()) {
            return parseHex(str.substring(2), i);
        } else {
            if (UUID_PATTERN.matcher(str).matches()) {
                return parseHex(str.replace("-", ""), i);
            }
            if (DECIMAL_PATTERN.matcher(str).matches()) {
                try {
                    int intValue = Integer.valueOf(str).intValue();
                    if (i <= 0 || i == 2) {
                        return fromInt(intValue);
                    }
                    return fromLong((long) intValue, i);
                } catch (Throwable th) {
                    throw new IllegalArgumentException("Unable to parse Identifier in decimal format.", th);
                }
            } else if (HEX_PATTERN_NO_PREFIX.matcher(str).matches()) {
                return parseHex(str, i);
            } else {
                throw new IllegalArgumentException("Unable to parse Identifier.");
            }
        }
    }

    private static Identifier parseHex(String str, int i) {
        String str2 = str.length() % 2 == 0 ? "" : "0";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str.toUpperCase());
        String obj = sb.toString();
        if (i > 0 && i < obj.length() / 2) {
            obj = obj.substring(obj.length() - (i * 2));
        }
        if (i > 0 && i > obj.length() / 2) {
            int length = (i * 2) - obj.length();
            StringBuilder sb2 = new StringBuilder();
            while (sb2.length() < length) {
                sb2.append("0");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2.toString());
            sb3.append(obj);
            obj = sb3.toString();
        }
        int length2 = obj.length() / 2;
        byte[] bArr = new byte[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (BluetoothLeUtils.safeParseInt(obj.substring(i3, i3 + 2), 16) & 255);
        }
        return new Identifier(bArr);
    }

    public static Identifier fromLong(long j, int i) {
        if (i >= 0) {
            byte[] bArr = new byte[i];
            for (int i2 = i - 1; i2 >= 0; i2--) {
                bArr[i2] = (byte) ((int) (255 & j));
                j >>= 8;
            }
            return new Identifier(bArr);
        }
        throw new IllegalArgumentException("Identifier length must be > 0.");
    }

    public static Identifier fromInt(int i) {
        if (i < 0 || i > MAX_INTEGER) {
            throw new IllegalArgumentException("Identifiers can only be constructed from integers between 0 and 65535 (inclusive).");
        }
        return new Identifier(new byte[]{(byte) (i >> 8), (byte) i});
    }

    @TargetApi(9)
    public static Identifier fromBytes(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"bytes\" is null.");
        } else if (i < 0 || i > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("start < 0 || start > bytes.length");
        } else if (i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("end > bytes.length");
        } else if (i <= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            if (z) {
                reverseArray(copyOfRange);
            }
            return new Identifier(copyOfRange);
        } else {
            throw new IllegalArgumentException("start > end");
        }
    }

    public static Identifier fromUuid(UUID uuid) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        return new Identifier(allocate.array());
    }

    private static void reverseArray(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int length = (bArr.length - i) - 1;
            byte b = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b;
        }
    }

    public String toString() {
        byte[] bArr = this.mValue;
        if (bArr.length == 2) {
            return Integer.toString(toInt());
        }
        if (bArr.length == 16) {
            return toUuid().toString();
        }
        return toHexString();
    }

    public int toInt() {
        if (this.mValue.length <= 2) {
            int i = 0;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.mValue;
                if (i >= bArr.length) {
                    return i2;
                }
                i2 |= (bArr[i] & 255) << (((bArr.length - i) - 1) * 8);
                i++;
            }
        } else {
            throw new UnsupportedOperationException("Only supported for Identifiers with max byte length of 2");
        }
    }

    @TargetApi(9)
    public byte[] toByteArrayOfSpecifiedEndianness(boolean z) {
        byte[] bArr = this.mValue;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (!z) {
            reverseArray(copyOf);
        }
        return copyOf;
    }

    public int getByteCount() {
        return this.mValue.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mValue);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Identifier)) {
            return false;
        }
        return Arrays.equals(this.mValue, ((Identifier) obj).mValue);
    }

    public String toHexString() {
        StringBuilder sb = new StringBuilder((this.mValue.length * 2) + 2);
        sb.append("0x");
        byte[] bArr = this.mValue;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    @Deprecated
    public String toUuidString() {
        return toUuid().toString();
    }

    public UUID toUuid() {
        byte[] bArr = this.mValue;
        if (bArr.length == 16) {
            LongBuffer asLongBuffer = ByteBuffer.wrap(bArr).asLongBuffer();
            return new UUID(asLongBuffer.get(), asLongBuffer.get());
        }
        throw new UnsupportedOperationException("Only Identifiers backed by a byte array with length of exactly 16 can be UUIDs.");
    }

    public byte[] toByteArray() {
        return (byte[]) this.mValue.clone();
    }

    public int compareTo(Identifier identifier) {
        byte[] bArr = this.mValue;
        int length = bArr.length;
        byte[] bArr2 = identifier.mValue;
        if (length != bArr2.length) {
            return bArr.length < bArr2.length ? -1 : 1;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.mValue;
            if (i >= bArr3.length) {
                return 0;
            }
            byte b = bArr3[i];
            byte[] bArr4 = identifier.mValue;
            if (b != bArr4[i]) {
                return bArr3[i] < bArr4[i] ? -1 : 1;
            }
            i++;
        }
    }
}
