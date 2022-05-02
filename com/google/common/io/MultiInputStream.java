package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
final class MultiInputStream extends InputStream {
    @NullableDecl

    /* renamed from: in  reason: collision with root package name */
    private InputStream f11028in;
    private Iterator<? extends ByteSource> it;

    public final boolean markSupported() {
        return false;
    }

    public MultiInputStream(Iterator<? extends ByteSource> it2) throws IOException {
        this.it = (Iterator) Preconditions.checkNotNull(it2);
        advance();
    }

    public final void close() throws IOException {
        InputStream inputStream = this.f11028in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f11028in = null;
            }
        }
    }

    private void advance() throws IOException {
        close();
        if (this.it.hasNext()) {
            this.f11028in = ((ByteSource) this.it.next()).openStream();
        }
    }

    public final int available() throws IOException {
        InputStream inputStream = this.f11028in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f11028in;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            advance();
        }
    }

    public final int read(@NullableDecl byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            InputStream inputStream = this.f11028in;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                return read;
            }
            advance();
        }
    }

    public final long skip(long j) throws IOException {
        InputStream inputStream = this.f11028in;
        if (inputStream == null || j <= 0) {
            return 0;
        }
        long skip = inputStream.skip(j);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0;
        }
        return this.f11028in.skip(j - 1) + 1;
    }
}
