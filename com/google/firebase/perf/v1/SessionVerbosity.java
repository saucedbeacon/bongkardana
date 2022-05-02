package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

public enum SessionVerbosity implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<SessionVerbosity> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<SessionVerbosity>() {
            public SessionVerbosity findValueByNumber(int i) {
                return SessionVerbosity.forNumber(i);
            }
        };
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SessionVerbosity valueOf(int i) {
        return forNumber(i);
    }

    public static SessionVerbosity forNumber(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static Internal.EnumLiteMap<SessionVerbosity> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SessionVerbosityVerifier.INSTANCE;
    }

    static final class SessionVerbosityVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private SessionVerbosityVerifier() {
        }

        static {
            INSTANCE = new SessionVerbosityVerifier();
        }

        public final boolean isInRange(int i) {
            return SessionVerbosity.forNumber(i) != null;
        }
    }

    private SessionVerbosity(int i) {
        this.value = i;
    }
}
