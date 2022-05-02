package com.google.protobuf;

interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = new MutabilityOracle() {
        public final void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    };

    void ensureMutable();
}
