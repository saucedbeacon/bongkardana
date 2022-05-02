package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class DownloadAction {
    @Nullable
    private static Deserializer[] defaultDeserializers;
    public final byte[] data;
    public final boolean isRemoveAction;
    public final String type;
    public final Uri uri;
    public final int version;

    public abstract Downloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper);

    /* access modifiers changed from: protected */
    public abstract void writeToStream(DataOutputStream dataOutputStream) throws IOException;

    public static abstract class Deserializer {
        public final String type;
        public final int version;

        public abstract DownloadAction readFromStream(int i, DataInputStream dataInputStream) throws IOException;

        public Deserializer(String str, int i) {
            this.type = str;
            this.version = i;
        }
    }

    public static synchronized Deserializer[] getDefaultDeserializers() {
        int i;
        int i2;
        int i3;
        synchronized (DownloadAction.class) {
            if (defaultDeserializers != null) {
                Deserializer[] deserializerArr = defaultDeserializers;
                return deserializerArr;
            }
            Deserializer[] deserializerArr2 = new Deserializer[4];
            deserializerArr2[0] = ProgressiveDownloadAction.DESERIALIZER;
            int i4 = 1;
            try {
                i = 2;
                try {
                    deserializerArr2[1] = getDeserializer(Class.forName("com.google.android.exoplayer2.source.dash.offline.DashDownloadAction"));
                } catch (Exception unused) {
                    i4 = 2;
                }
            } catch (Exception unused2) {
                i = i4;
                i2 = i + 1;
                deserializerArr2[i] = getDeserializer(Class.forName("com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction"));
                i3 = i2 + 1;
                deserializerArr2[i2] = getDeserializer(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloadAction"));
                Deserializer[] deserializerArr3 = (Deserializer[]) Arrays.copyOf((Object[]) Assertions.checkNotNull(deserializerArr2), i3);
                defaultDeserializers = deserializerArr3;
                return deserializerArr3;
            }
            try {
                i2 = i + 1;
                try {
                    deserializerArr2[i] = getDeserializer(Class.forName("com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction"));
                } catch (Exception unused3) {
                    i = i2;
                }
            } catch (Exception unused4) {
                i2 = i;
                i3 = i2 + 1;
                deserializerArr2[i2] = getDeserializer(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloadAction"));
                Deserializer[] deserializerArr32 = (Deserializer[]) Arrays.copyOf((Object[]) Assertions.checkNotNull(deserializerArr2), i3);
                defaultDeserializers = deserializerArr32;
                return deserializerArr32;
            }
            try {
                i3 = i2 + 1;
                try {
                    deserializerArr2[i2] = getDeserializer(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloadAction"));
                } catch (Exception unused5) {
                    i2 = i3;
                }
            } catch (Exception unused6) {
                i3 = i2;
                Deserializer[] deserializerArr322 = (Deserializer[]) Arrays.copyOf((Object[]) Assertions.checkNotNull(deserializerArr2), i3);
                defaultDeserializers = deserializerArr322;
                return deserializerArr322;
            }
            Deserializer[] deserializerArr3222 = (Deserializer[]) Arrays.copyOf((Object[]) Assertions.checkNotNull(deserializerArr2), i3);
            defaultDeserializers = deserializerArr3222;
            return deserializerArr3222;
        }
    }

    public static DownloadAction deserializeFromStream(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String readUTF = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (readUTF.equals(deserializer.type) && deserializer.version >= readInt) {
                return deserializer.readFromStream(readInt, dataInputStream);
            }
        }
        StringBuilder sb = new StringBuilder("No deserializer found for:");
        sb.append(readUTF);
        sb.append(", ");
        sb.append(readInt);
        throw new DownloadException(sb.toString());
    }

    public static void serializeToStream(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.type);
        dataOutputStream.writeInt(downloadAction.version);
        downloadAction.writeToStream(dataOutputStream);
        dataOutputStream.flush();
    }

    protected DownloadAction(String str, int i, Uri uri2, boolean z, @Nullable byte[] bArr) {
        this.type = str;
        this.version = i;
        this.uri = uri2;
        this.isRemoveAction = z;
        this.data = bArr == null ? Util.EMPTY_BYTE_ARRAY : bArr;
    }

    public final byte[] toByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            serializeToStream(this, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException();
        }
    }

    public boolean isSameMedia(DownloadAction downloadAction) {
        return this.uri.equals(downloadAction.uri);
    }

    public List<StreamKey> getKeys() {
        return Collections.emptyList();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            DownloadAction downloadAction = (DownloadAction) obj;
            if (!this.type.equals(downloadAction.type) || this.version != downloadAction.version || !this.uri.equals(downloadAction.uri) || this.isRemoveAction != downloadAction.isRemoveAction || !Arrays.equals(this.data, downloadAction.data)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.uri.hashCode() * 31) + (this.isRemoveAction ? 1 : 0)) * 31) + Arrays.hashCode(this.data);
    }

    private static Deserializer getDeserializer(Class<?> cls) throws NoSuchFieldException, IllegalAccessException {
        return (Deserializer) Assertions.checkNotNull(cls.getDeclaredField("DESERIALIZER").get((Object) null));
    }
}
