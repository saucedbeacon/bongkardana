package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@Beta
public final class HashingOutputStream extends FilterOutputStream {
    private final Hasher hasher;

    public HashingOutputStream(HashFunction hashFunction, OutputStream outputStream) {
        super((OutputStream) Preconditions.checkNotNull(outputStream));
        this.hasher = (Hasher) Preconditions.checkNotNull(hashFunction.newHasher());
    }

    public final void write(int i) throws IOException {
        this.hasher.putByte((byte) i);
        this.out.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1337416572, oncanceled);
            onCancelLoad.getMin(-1337416572, oncanceled);
        }
        this.hasher.putBytes(bArr, i, i2);
        this.out.write(bArr, i, i2);
    }

    public final HashCode hash() {
        return this.hasher.hash();
    }

    public final void close() throws IOException {
        this.out.close();
    }
}
