package o;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

final class recordConnectedTime extends printConnMonitorLog {
    final transient int[] directory;
    final transient byte[][] segments;

    recordConnectedTime(submitLazy submitlazy, int i) {
        super((byte[]) null);
        MonitorModel.getMax(submitlazy.setMax, 0, (long) i);
        recordStartConnAllTime recordstartconnalltime = submitlazy.setMin;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (recordstartconnalltime.setMax != recordstartconnalltime.setMin) {
                i3 += recordstartconnalltime.setMax - recordstartconnalltime.setMin;
                i4++;
                recordstartconnalltime = recordstartconnalltime.toFloatRange;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.segments = new byte[i4][];
        this.directory = new int[(i4 * 2)];
        recordStartConnAllTime recordstartconnalltime2 = submitlazy.setMin;
        int i5 = 0;
        while (i2 < i) {
            this.segments[i5] = recordstartconnalltime2.getMax;
            i2 += recordstartconnalltime2.setMax - recordstartconnalltime2.setMin;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.directory;
            iArr[i5] = i2;
            iArr[this.segments.length + i5] = recordstartconnalltime2.setMin;
            recordstartconnalltime2.length = true;
            i5++;
            recordstartconnalltime2 = recordstartconnalltime2.toFloatRange;
        }
    }

    public final String utf8() {
        return toByteString().utf8();
    }

    public final String string(Charset charset) {
        return toByteString().string(charset);
    }

    public final String base64() {
        return toByteString().base64();
    }

    public final String hex() {
        return toByteString().hex();
    }

    public final printConnMonitorLog toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    public final printConnMonitorLog toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    public final printConnMonitorLog md5() {
        return toByteString().md5();
    }

    public final printConnMonitorLog sha1() {
        return toByteString().sha1();
    }

    public final printConnMonitorLog sha256() {
        return toByteString().sha256();
    }

    public final printConnMonitorLog hmacSha1(printConnMonitorLog printconnmonitorlog) {
        return toByteString().hmacSha1(printconnmonitorlog);
    }

    public final printConnMonitorLog hmacSha256(printConnMonitorLog printconnmonitorlog) {
        return toByteString().hmacSha256(printconnmonitorlog);
    }

    public final String base64Url() {
        return toByteString().base64Url();
    }

    public final printConnMonitorLog substring(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1314641781, oncanceled);
            onCancelLoad.getMin(-1314641781, oncanceled);
        }
        return toByteString().substring(i);
    }

    public final printConnMonitorLog substring(int i, int i2) {
        return toByteString().substring(i, i2);
    }

    public final byte getByte(int i) {
        int i2;
        MonitorModel.getMax((long) this.directory[this.segments.length - 1], (long) i, 1);
        int segment = segment(i);
        if (segment == 0) {
            i2 = 0;
        } else {
            i2 = this.directory[segment - 1];
        }
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[segment][(i - i2) + iArr[bArr.length + segment]];
    }

    private int segment(int i) {
        int binarySearch = Arrays.binarySearch(this.directory, 0, this.segments.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    public final int size() {
        return this.directory[this.segments.length - 1];
    }

    public final byte[] toByteArray() {
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.directory;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.segments[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public final ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    public final void write(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.segments.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = this.directory;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                outputStream.write(this.segments[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* access modifiers changed from: package-private */
    public final void write(submitLazy submitlazy) {
        int length = this.segments.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.directory;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            recordStartConnAllTime recordstartconnalltime = new recordStartConnAllTime(this.segments[i], i3, (i3 + i4) - i2);
            if (submitlazy.setMin == null) {
                recordstartconnalltime.toIntRange = recordstartconnalltime;
                recordstartconnalltime.toFloatRange = recordstartconnalltime;
                submitlazy.setMin = recordstartconnalltime;
            } else {
                recordStartConnAllTime recordstartconnalltime2 = submitlazy.setMin.toIntRange;
                recordstartconnalltime.toIntRange = recordstartconnalltime2;
                recordstartconnalltime.toFloatRange = recordstartconnalltime2.toFloatRange;
                recordstartconnalltime2.toFloatRange.toIntRange = recordstartconnalltime;
                recordstartconnalltime2.toFloatRange = recordstartconnalltime;
            }
            i++;
            i2 = i4;
        }
        submitlazy.setMax += (long) i2;
    }

    public final boolean rangeEquals(int i, printConnMonitorLog printconnmonitorlog, int i2, int i3) {
        int i4;
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int segment = segment(i);
        while (i3 > 0) {
            if (segment == 0) {
                i4 = 0;
            } else {
                i4 = this.directory[segment - 1];
            }
            int min = Math.min(i3, ((this.directory[segment] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr = this.segments;
            if (!printconnmonitorlog.rangeEquals(i2, bArr[segment], (i - i4) + iArr[bArr.length + segment], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            segment++;
        }
        return true;
    }

    public final boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int segment = segment(i);
        while (i3 > 0) {
            if (segment == 0) {
                i4 = 0;
            } else {
                i4 = this.directory[segment - 1];
            }
            int min = Math.min(i3, ((this.directory[segment] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr2 = this.segments;
            if (!MonitorModel.getMin(bArr2[segment], (i - i4) + iArr[bArr2.length + segment], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            segment++;
        }
        return true;
    }

    public final int indexOf(byte[] bArr, int i) {
        return toByteString().indexOf(bArr, i);
    }

    public final int lastIndexOf(byte[] bArr, int i) {
        return toByteString().lastIndexOf(bArr, i);
    }

    private printConnMonitorLog toByteString() {
        return new printConnMonitorLog(toByteArray());
    }

    /* access modifiers changed from: package-private */
    public final byte[] internalArray() {
        return toByteArray();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof printConnMonitorLog) {
            printConnMonitorLog printconnmonitorlog = (printConnMonitorLog) obj;
            return printconnmonitorlog.size() == size() && rangeEquals(0, printconnmonitorlog, 0, size());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int length = this.segments.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.segments[i2];
            int[] iArr = this.directory;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.hashCode = i4;
        return i4;
    }

    public final String toString() {
        return toByteString().toString();
    }

    private Object writeReplace() {
        return toByteString();
    }
}
