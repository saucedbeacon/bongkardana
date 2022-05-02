package o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;

public final class getProgress extends OutputStream {
    private int getMax;
    private byte[] getMin;
    @NonNull
    private final OutputStream length;
    private setOnHide setMax;

    public getProgress(@NonNull OutputStream outputStream, @NonNull setOnHide setonhide) {
        this(outputStream, setonhide, (byte) 0);
    }

    @VisibleForTesting
    private getProgress(@NonNull OutputStream outputStream, setOnHide setonhide, byte b) {
        this.length = outputStream;
        this.setMax = setonhide;
        this.getMin = (byte[]) setonhide.length(65536, byte[].class);
    }

    public final void write(int i) throws IOException {
        byte[] bArr = this.getMin;
        int i2 = this.getMax;
        int i3 = i2 + 1;
        this.getMax = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length && i3 > 0) {
            this.length.write(bArr, 0, i3);
            this.getMax = 0;
        }
    }

    public final void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.getMax != 0 || i4 < this.getMin.length) {
                int min = Math.min(i4, this.getMin.length - this.getMax);
                System.arraycopy(bArr, i5, this.getMin, this.getMax, min);
                int i6 = this.getMax + min;
                this.getMax = i6;
                i3 += min;
                byte[] bArr2 = this.getMin;
                if (i6 == bArr2.length && i6 > 0) {
                    this.length.write(bArr2, 0, i6);
                    this.getMax = 0;
                    continue;
                }
            } else {
                this.length.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }

    /* JADX INFO: finally extract failed */
    public final void close() throws IOException {
        try {
            flush();
            this.length.close();
            byte[] bArr = this.getMin;
            if (bArr != null) {
                this.setMax.setMin(bArr);
                this.getMin = null;
            }
        } catch (Throwable th) {
            this.length.close();
            throw th;
        }
    }

    public final void flush() throws IOException {
        int i = this.getMax;
        if (i > 0) {
            this.length.write(this.getMin, 0, i);
            this.getMax = 0;
        }
        this.length.flush();
    }
}
