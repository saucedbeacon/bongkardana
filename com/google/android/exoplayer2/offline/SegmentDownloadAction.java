package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.util.Assertions;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class SegmentDownloadAction extends DownloadAction {
    public final List<StreamKey> keys;

    public static abstract class SegmentDownloadActionDeserializer extends DownloadAction.Deserializer {
        /* access modifiers changed from: protected */
        public abstract DownloadAction createDownloadAction(Uri uri, boolean z, byte[] bArr, List<StreamKey> list);

        public SegmentDownloadActionDeserializer(String str, int i) {
            super(str, i);
        }

        public final DownloadAction readFromStream(int i, DataInputStream dataInputStream) throws IOException {
            Uri parse = Uri.parse(dataInputStream.readUTF());
            boolean readBoolean = dataInputStream.readBoolean();
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            int readInt = dataInputStream.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(readKey(i, dataInputStream));
            }
            return createDownloadAction(parse, readBoolean, bArr, arrayList);
        }

        public StreamKey readKey(int i, DataInputStream dataInputStream) throws IOException {
            return new StreamKey(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
        }
    }

    public SegmentDownloadAction(String str, int i, Uri uri, boolean z, @Nullable byte[] bArr, List<StreamKey> list) {
        super(str, i, uri, z, bArr);
        if (z) {
            Assertions.checkArgument(list.isEmpty());
            this.keys = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.keys = Collections.unmodifiableList(arrayList);
    }

    public List<StreamKey> getKeys() {
        return this.keys;
    }

    public final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.uri.toString());
        dataOutputStream.writeBoolean(this.isRemoveAction);
        dataOutputStream.writeInt(this.data.length);
        dataOutputStream.write(this.data);
        dataOutputStream.writeInt(this.keys.size());
        for (int i = 0; i < this.keys.size(); i++) {
            writeKey(dataOutputStream, this.keys.get(i));
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return this.keys.equals(((SegmentDownloadAction) obj).keys);
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.keys.hashCode();
    }

    private void writeKey(DataOutputStream dataOutputStream, StreamKey streamKey) throws IOException {
        dataOutputStream.writeInt(streamKey.periodIndex);
        dataOutputStream.writeInt(streamKey.groupIndex);
        dataOutputStream.writeInt(streamKey.trackIndex);
    }
}
