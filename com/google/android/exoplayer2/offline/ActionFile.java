package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.Util;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class ActionFile {
    static final int VERSION = 0;
    private final File actionFile;
    private final AtomicFile atomicFile;

    public ActionFile(File file) {
        this.actionFile = file;
        this.atomicFile = new AtomicFile(file);
    }

    public final DownloadAction[] load(DownloadAction.Deserializer... deserializerArr) throws IOException {
        if (!this.actionFile.exists()) {
            return new DownloadAction[0];
        }
        InputStream inputStream = null;
        try {
            inputStream = this.atomicFile.openRead();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                int readInt2 = dataInputStream.readInt();
                DownloadAction[] downloadActionArr = new DownloadAction[readInt2];
                for (int i = 0; i < readInt2; i++) {
                    downloadActionArr[i] = DownloadAction.deserializeFromStream(deserializerArr, dataInputStream);
                }
                return downloadActionArr;
            }
            throw new IOException("Unsupported action file version: ".concat(String.valueOf(readInt)));
        } finally {
            Util.closeQuietly((Closeable) inputStream);
        }
    }

    public final void store(DownloadAction... downloadActionArr) throws IOException {
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.atomicFile.startWrite());
            try {
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(downloadActionArr.length);
                for (DownloadAction serializeToStream : downloadActionArr) {
                    DownloadAction.serializeToStream(serializeToStream, dataOutputStream2);
                }
                this.atomicFile.endWrite(dataOutputStream2);
                Util.closeQuietly((Closeable) null);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                Util.closeQuietly((Closeable) dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Util.closeQuietly((Closeable) dataOutputStream);
            throw th;
        }
    }
}
