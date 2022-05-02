package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public class zzvi extends IOException {
    private zzwi zzcap = null;

    public zzvi(String str) {
        super(str);
    }

    public final zzvi zzg(zzwi zzwi) {
        this.zzcap = zzwi;
        return this;
    }

    static zzvi zztp() {
        return new zzvi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzvi zztq() {
        return new zzvi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzvi zztr() {
        return new zzvi("Protocol message contained an invalid tag (zero).");
    }

    static zzvh zzts() {
        return new zzvh("Protocol message tag had invalid wire type.");
    }

    static zzvi zztt() {
        return new zzvi("Failed to parse the message.");
    }

    static zzvi zztu() {
        return new zzvi("Protocol message had invalid UTF-8.");
    }
}
