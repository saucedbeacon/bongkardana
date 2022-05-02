package com.google.protobuf;

import com.google.protobuf.Internal;

public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int NULL_VALUE_VALUE = 0;
    private static final Internal.EnumLiteMap<NullValue> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<NullValue>() {
            public final NullValue findValueByNumber(int i) {
                return NullValue.forNumber(i);
            }
        };
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static Internal.EnumLiteMap<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return NullValueVerifier.INSTANCE;
    }

    static final class NullValueVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private NullValueVerifier() {
        }

        static {
            INSTANCE = new NullValueVerifier();
        }

        public final boolean isInRange(int i) {
            return NullValue.forNumber(i) != null;
        }
    }

    private NullValue(int i) {
        this.value = i;
    }
}
