package com.google.android.gms.internal.firebase_ml;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class zzgw extends FilterInputStream {
    private long zzyx = 0;
    private final /* synthetic */ zzgx zzyy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgw(zzgx zzgx, InputStream inputStream) {
        super(inputStream);
        this.zzyy = zzgx;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            zzgf();
        } else {
            this.zzyx += (long) read;
        }
        return read;
    }

    public final int read() throws IOException {
        int read = this.in.read();
        if (read == -1) {
            zzgf();
        } else {
            this.zzyx++;
        }
        return read;
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(j);
        this.zzyx += skip;
        return skip;
    }

    private final void zzgf() throws IOException {
        long contentLength = this.zzyy.getContentLength();
        if (contentLength != -1) {
            long j = this.zzyx;
            if (j != 0 && j < contentLength) {
                long j2 = this.zzyx;
                StringBuilder sb = new StringBuilder(102);
                sb.append("Connection closed prematurely: bytesRead = ");
                sb.append(j2);
                sb.append(", Content-Length = ");
                sb.append(contentLength);
                throw new IOException(sb.toString());
            }
        }
    }
}
