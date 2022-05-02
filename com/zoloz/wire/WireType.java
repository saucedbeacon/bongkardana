package com.zoloz.wire;

import java.io.IOException;

public enum WireType {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    START_GROUP(3),
    END_GROUP(4),
    FIXED32(5);
    
    public static final int FIXED_32_SIZE = 4;
    public static final int FIXED_64_SIZE = 8;
    public static final int TAG_TYPE_BITS = 3;
    private static final int TAG_TYPE_MASK = 7;
    private final int value;

    public static WireType valueOf(int i) throws IOException {
        int i2 = i & 7;
        if (i2 == 0) {
            return VARINT;
        }
        if (i2 == 1) {
            return FIXED64;
        }
        if (i2 == 2) {
            return LENGTH_DELIMITED;
        }
        if (i2 == 3) {
            return START_GROUP;
        }
        if (i2 == 4) {
            return END_GROUP;
        }
        if (i2 == 5) {
            return FIXED32;
        }
        StringBuilder sb = new StringBuilder("No WireType for type ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    private WireType(int i) {
        this.value = i;
    }

    public final int value() {
        return this.value;
    }
}
