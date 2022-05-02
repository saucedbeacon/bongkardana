package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f9570a;

    public a(ByteBuffer byteBuffer) {
        this.f9570a = byteBuffer.slice();
    }

    public final long a() {
        return (long) this.f9570a.capacity();
    }

    public final void a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f9570a) {
            int i2 = (int) j;
            this.f9570a.position(i2);
            this.f9570a.limit(i2 + i);
            slice = this.f9570a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }
}
