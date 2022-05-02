package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;

public final class FileDataSourceFactory implements DataSource.Factory {
    @Nullable
    private final TransferListener listener;

    public FileDataSourceFactory() {
        this((TransferListener) null);
    }

    public FileDataSourceFactory(@Nullable TransferListener transferListener) {
        this.listener = transferListener;
    }

    public final DataSource createDataSource() {
        FileDataSource fileDataSource = new FileDataSource();
        TransferListener transferListener = this.listener;
        if (transferListener != null) {
            fileDataSource.addTransferListener(transferListener);
        }
        return fileDataSource;
    }
}
