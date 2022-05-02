package com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class DistinctPacketDetector {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final Set<ByteBuffer> f10273a = new HashSet();

    public void clearDetections() {
        this.f10273a.clear();
    }

    public boolean isPacketDistinct(@NonNull String str, @NonNull byte[] bArr) {
        byte[] bytes = str.getBytes();
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + bArr.length);
        allocate.put(bytes);
        allocate.put(bArr);
        allocate.rewind();
        if (this.f10273a.size() == 1000) {
            return this.f10273a.contains(allocate);
        }
        return this.f10273a.add(allocate);
    }
}
