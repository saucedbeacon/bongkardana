package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.getEnterAnim;

public final class DummyDataSource implements DataSource {
    public static final DataSource.Factory FACTORY = getEnterAnim.setMin;
    public static final DummyDataSource INSTANCE = new DummyDataSource();

    public final void addTransferListener(TransferListener transferListener) {
    }

    public final void close() throws IOException {
    }

    @Nullable
    public final Uri getUri() {
        return null;
    }

    public final long open(DataSpec dataSpec) throws IOException {
        throw new IOException("Dummy source");
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }

    public final Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }
}
