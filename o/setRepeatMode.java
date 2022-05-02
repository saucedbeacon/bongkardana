package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class setRepeatMode {
    @Nullable
    private List<byte[]> getMax;
    @Nullable
    String getMin;
    @NonNull
    private final byte[] setMin;

    setRepeatMode(@NonNull byte[] bArr, @NonNull String str, @NonNull List<byte[]> list) {
        this.setMin = bArr;
        this.getMin = str;
        this.getMax = new ArrayList(list.size());
        for (byte[] next : list) {
            this.getMax.add(Arrays.copyOf(next, next.length));
        }
    }

    @NonNull
    public final byte[] setMin() throws IOException {
        getMin();
        List<byte[]> list = this.getMax;
        if (list != null) {
            return Arrays.copyOf(list.get(0), this.getMax.get(0).length);
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.setMin, ((setRepeatMode) obj).setMin);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.setMin);
    }

    @NonNull
    static byte[] getMin(@NonNull String str, @NonNull List<byte[]> list) throws IOException {
        Collections.sort(list, MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.getMin);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] next : list) {
            dataOutputStream.writeInt(next.length);
            dataOutputStream.write(next);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: package-private */
    public final void getMin() throws IOException {
        if (this.getMin == null) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.setMin));
            this.getMin = dataInputStream.readUTF();
            int readInt = dataInputStream.readInt();
            this.getMax = new ArrayList(readInt);
            int i = 0;
            while (i < readInt) {
                int readInt2 = dataInputStream.readInt();
                byte[] bArr = new byte[readInt2];
                if (dataInputStream.read(bArr) == readInt2) {
                    this.getMax.add(bArr);
                    i++;
                } else {
                    throw new IllegalStateException("Could not read fingerprint");
                }
            }
        }
    }
}
