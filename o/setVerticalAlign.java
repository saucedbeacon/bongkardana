package o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

final class setVerticalAlign implements Closeable {
    final Charset getMax;
    private int getMin;
    private int length;
    private final InputStream setMax;
    private byte[] setMin;

    public setVerticalAlign(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private setVerticalAlign(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (charset.equals(updatePreDraw.getMax)) {
            this.setMax = inputStream;
            this.getMax = charset;
            this.setMin = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() throws IOException {
        synchronized (this.setMax) {
            if (this.setMin != null) {
                this.setMin = null;
                this.setMax.close();
            }
        }
    }

    public final String getMin() throws IOException {
        int i;
        int i2;
        synchronized (this.setMax) {
            if (this.setMin != null) {
                if (this.length >= this.getMin) {
                    setMax();
                }
                for (int i3 = this.length; i3 != this.getMin; i3++) {
                    if (this.setMin[i3] == 10) {
                        if (i3 != this.length) {
                            i2 = i3 - 1;
                            if (this.setMin[i2] == 13) {
                                byte[] bArr = this.setMin;
                                int i4 = this.length;
                                String str = new String(bArr, i4, i2 - i4, this.getMax.name());
                                this.length = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr2 = this.setMin;
                        int i42 = this.length;
                        String str2 = new String(bArr2, i42, i2 - i42, this.getMax.name());
                        this.length = i3 + 1;
                        return str2;
                    }
                }
                AnonymousClass2 r1 = new ByteArrayOutputStream((this.getMin - this.length) + 80) {
                    public final String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, setVerticalAlign.this.getMax.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.setMin, this.length, this.getMin - this.length);
                    this.getMin = -1;
                    setMax();
                    i = this.length;
                    while (true) {
                        if (i != this.getMin) {
                            if (this.setMin[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.length) {
                    byte[] bArr3 = this.setMin;
                    int i5 = this.length;
                    r1.write(bArr3, i5, i - i5);
                }
                this.length = i + 1;
                String obj = r1.toString();
                return obj;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public final boolean setMin() {
        return this.getMin == -1;
    }

    private void setMax() throws IOException {
        InputStream inputStream = this.setMax;
        byte[] bArr = this.setMin;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.length = 0;
            this.getMin = read;
            return;
        }
        throw new EOFException();
    }
}
