package com.alipay.imobile.network.quake;

import java.io.Serializable;
import java.util.Map;

public class NetworkResponse implements Serializable {
    public final byte[] data;
    public final Map<String, String> extData;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    public NetworkResponse(int i, byte[] bArr) {
        this(i, bArr, (Map<String, String>) null, false, 0);
    }

    public NetworkResponse(int i, byte[] bArr, Map<String, String> map) {
        this(i, bArr, map, false, 0);
    }

    public NetworkResponse(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.statusCode = i;
        this.data = bArr;
        this.extData = map;
        this.notModified = z;
        this.networkTimeMs = j;
    }

    public NetworkResponse(int i, byte[] bArr, boolean z) {
        this(i, bArr, (Map<String, String>) null, z, 0);
    }

    public NetworkResponse(byte[] bArr) {
        this(0, bArr, (Map<String, String>) null, false, 0);
    }
}
