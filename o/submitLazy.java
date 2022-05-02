package o;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import kotlin.text.Typography;

public final class submitLazy implements schedule, executeSerial, Cloneable, ByteChannel {
    private static final byte[] getMax = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public long setMax;
    @Nullable
    recordStartConnAllTime setMin;

    public final /* bridge */ /* synthetic */ executeSerial ICustomTabsCallback() throws IOException {
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final submitLazy getMax() {
        return this;
    }

    public final boolean isOpen() {
        return true;
    }

    public final boolean setMax() {
        return this.setMax == 0;
    }

    public final void setMin(long j) throws EOFException {
        if (this.setMax < j) {
            throw new EOFException();
        }
    }

    public final boolean getMin(long j) {
        return this.setMax >= j;
    }

    public final schedule length() {
        return recordMonitorOfSndMsg.setMin((recordWsHsTime) new createMonitorModel(this));
    }

    public final InputStream setMin() {
        return new InputStream() {
            public final void close() {
            }

            public final int read() {
                if (submitLazy.this.setMax > 0) {
                    return submitLazy.this.IsOverlapping() & 255;
                }
                return -1;
            }

            public final int read(byte[] bArr, int i, int i2) {
                return submitLazy.this.setMax(bArr, i, i2);
            }

            public final int available() {
                return (int) Math.min(submitLazy.this.setMax, 2147483647L);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(submitLazy.this);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }

    public final submitLazy getMax(submitLazy submitlazy, long j, long j2) {
        if (submitlazy != null) {
            MonitorModel.getMax(this.setMax, j, j2);
            if (j2 == 0) {
                return this;
            }
            submitlazy.setMax += j2;
            recordStartConnAllTime recordstartconnalltime = this.setMin;
            while (j >= ((long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin))) {
                j -= (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
                recordstartconnalltime = recordstartconnalltime.toFloatRange;
            }
            while (j2 > 0) {
                recordstartconnalltime.length = true;
                recordStartConnAllTime recordstartconnalltime2 = new recordStartConnAllTime(recordstartconnalltime.getMax, recordstartconnalltime.setMin, recordstartconnalltime.setMax);
                recordstartconnalltime2.setMin = (int) (((long) recordstartconnalltime2.setMin) + j);
                recordstartconnalltime2.setMax = Math.min(recordstartconnalltime2.setMin + ((int) j2), recordstartconnalltime2.setMax);
                recordStartConnAllTime recordstartconnalltime3 = submitlazy.setMin;
                if (recordstartconnalltime3 == null) {
                    recordstartconnalltime2.toIntRange = recordstartconnalltime2;
                    recordstartconnalltime2.toFloatRange = recordstartconnalltime2;
                    submitlazy.setMin = recordstartconnalltime2;
                } else {
                    recordStartConnAllTime recordstartconnalltime4 = recordstartconnalltime3.toIntRange;
                    recordstartconnalltime2.toIntRange = recordstartconnalltime4;
                    recordstartconnalltime2.toFloatRange = recordstartconnalltime4.toFloatRange;
                    recordstartconnalltime4.toFloatRange.toIntRange = recordstartconnalltime2;
                    recordstartconnalltime4.toFloatRange = recordstartconnalltime2;
                }
                j2 -= (long) (recordstartconnalltime2.setMax - recordstartconnalltime2.setMin);
                recordstartconnalltime = recordstartconnalltime.toFloatRange;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final long toFloatRange() {
        long j = this.setMax;
        if (j == 0) {
            return 0;
        }
        recordStartConnAllTime recordstartconnalltime = this.setMin.toIntRange;
        return (recordstartconnalltime.setMax >= 8192 || !recordstartconnalltime.getMin) ? j : j - ((long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin));
    }

    public final byte IsOverlapping() {
        if (this.setMax != 0) {
            recordStartConnAllTime recordstartconnalltime = this.setMin;
            int i = recordstartconnalltime.setMin;
            int i2 = recordstartconnalltime.setMax;
            int i3 = i + 1;
            byte b = recordstartconnalltime.getMax[i];
            this.setMax--;
            if (i3 == i2) {
                this.setMin = recordstartconnalltime.setMax();
                getSimpleStatistical.setMax(recordstartconnalltime);
            } else {
                recordstartconnalltime.setMin = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public final byte getMax(long j) {
        MonitorModel.getMax(this.setMax, j, 1);
        long j2 = this.setMax;
        if (j2 - j > j) {
            recordStartConnAllTime recordstartconnalltime = this.setMin;
            while (true) {
                long j3 = (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
                if (j < j3) {
                    return recordstartconnalltime.getMax[recordstartconnalltime.setMin + ((int) j)];
                }
                j -= j3;
                recordstartconnalltime = recordstartconnalltime.toFloatRange;
            }
        } else {
            long j4 = j - j2;
            recordStartConnAllTime recordstartconnalltime2 = this.setMin;
            do {
                recordstartconnalltime2 = recordstartconnalltime2.toIntRange;
                j4 += (long) (recordstartconnalltime2.setMax - recordstartconnalltime2.setMin);
            } while (j4 < 0);
            return recordstartconnalltime2.getMax[recordstartconnalltime2.setMin + ((int) j4)];
        }
    }

    public final short isInside() {
        if (this.setMax >= 2) {
            recordStartConnAllTime recordstartconnalltime = this.setMin;
            int i = recordstartconnalltime.setMin;
            int i2 = recordstartconnalltime.setMax;
            if (i2 - i < 2) {
                return (short) (((IsOverlapping() & 255) << 8) | (IsOverlapping() & 255));
            }
            byte[] bArr = recordstartconnalltime.getMax;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.setMax -= 2;
            if (i4 == i2) {
                this.setMin = recordstartconnalltime.setMax();
                getSimpleStatistical.setMax(recordstartconnalltime);
            } else {
                recordstartconnalltime.setMin = i4;
            }
            return (short) b;
        }
        StringBuilder sb = new StringBuilder("size < 2: ");
        sb.append(this.setMax);
        throw new IllegalStateException(sb.toString());
    }

    public final int toIntRange() {
        if (this.setMax >= 4) {
            recordStartConnAllTime recordstartconnalltime = this.setMin;
            int i = recordstartconnalltime.setMin;
            int i2 = recordstartconnalltime.setMax;
            if (i2 - i < 4) {
                return ((IsOverlapping() & 255) << Ascii.CAN) | ((IsOverlapping() & 255) << Ascii.DLE) | ((IsOverlapping() & 255) << 8) | (IsOverlapping() & 255);
            }
            byte[] bArr = recordstartconnalltime.getMax;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i3] & 255) << Ascii.DLE);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.setMax -= 4;
            if (i6 == i2) {
                this.setMin = recordstartconnalltime.setMax();
                getSimpleStatistical.setMax(recordstartconnalltime);
            } else {
                recordstartconnalltime.setMin = i6;
            }
            return b3;
        }
        StringBuilder sb = new StringBuilder("size < 4: ");
        sb.append(this.setMax);
        throw new IllegalStateException(sb.toString());
    }

    public final short equals() {
        return MonitorModel.length(isInside());
    }

    public final int toDoubleRange() {
        return MonitorModel.getMax(toIntRange());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if (r10 != r11) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        r0.setMin = r16.setMax();
        o.getSimpleStatistical.setMax(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        r16.setMin = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (r7 != false) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long FastBitmap$CoordinateSystem() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.setMax
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00c1
            r1 = -7
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000f:
            o.recordStartConnAllTime r8 = r0.setMin
            byte[] r9 = r8.getMax
            int r10 = r8.setMin
            int r11 = r8.setMax
        L_0x0017:
            r12 = 1
            if (r10 >= r11) goto L_0x009d
            byte r13 = r9[r10]
            r14 = 48
            if (r13 < r14) goto L_0x006c
            r15 = 57
            if (r13 > r15) goto L_0x006c
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0042
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            r15 = r7
            r16 = r8
            if (r12 != 0) goto L_0x003b
            long r7 = (long) r14
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x003b
            goto L_0x0042
        L_0x003b:
            r7 = 10
            long r3 = r3 * r7
            long r7 = (long) r14
            long r3 = r3 + r7
            goto L_0x0079
        L_0x0042:
            o.submitLazy r1 = new o.submitLazy
            r1.<init>()
            o.submitLazy r1 = r1.toDoubleRange((long) r3)
            o.submitLazy r1 = r1.equals((int) r13)
            if (r6 != 0) goto L_0x0054
            r1.IsOverlapping()
        L_0x0054:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Number too large: "
            r3.<init>(r4)
            java.lang.String r1 = r1.invokeSuspend()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006c:
            r15 = r7
            r16 = r8
            r7 = 45
            if (r13 != r7) goto L_0x0081
            if (r5 != 0) goto L_0x0081
            r6 = 1
            long r1 = r1 - r6
            r6 = 1
        L_0x0079:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r7 = r15
            r8 = r16
            goto L_0x0017
        L_0x0081:
            if (r5 == 0) goto L_0x0085
            r7 = 1
            goto L_0x00a0
        L_0x0085:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.<init>(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009d:
            r15 = r7
            r16 = r8
        L_0x00a0:
            if (r10 != r11) goto L_0x00ac
            o.recordStartConnAllTime r8 = r16.setMax()
            r0.setMin = r8
            o.getSimpleStatistical.setMax(r16)
            goto L_0x00b0
        L_0x00ac:
            r8 = r16
            r8.setMin = r10
        L_0x00b0:
            if (r7 != 0) goto L_0x00b6
            o.recordStartConnAllTime r8 = r0.setMin
            if (r8 != 0) goto L_0x000f
        L_0x00b6:
            long r1 = r0.setMax
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.setMax = r1
            if (r6 == 0) goto L_0x00bf
            return r3
        L_0x00bf:
            long r1 = -r3
            return r1
        L_0x00c1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            goto L_0x00ca
        L_0x00c9:
            throw r1
        L_0x00ca:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.submitLazy.FastBitmap$CoordinateSystem():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        r15.setMin = r6.setMax();
        o.getSimpleStatistical.setMax(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        r6.setMin = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r1 != false) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long invoke() {
        /*
            r15 = this;
            long r0 = r15.setMax
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a6
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            o.recordStartConnAllTime r6 = r15.setMin
            byte[] r7 = r6.getMax
            int r8 = r6.setMin
            int r9 = r6.setMax
        L_0x0013:
            if (r8 >= r9) goto L_0x008b
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x006f
            r11 = 70
            if (r10 > r11) goto L_0x006f
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            o.submitLazy r0 = new o.submitLazy
            r0.<init>()
            o.submitLazy r0 = r0.hashCode((long) r4)
            o.submitLazy r0 = r0.equals((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.invokeSuspend()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006f:
            if (r0 == 0) goto L_0x0073
            r1 = 1
            goto L_0x008b
        L_0x0073:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008b:
            if (r8 != r9) goto L_0x0097
            o.recordStartConnAllTime r7 = r6.setMax()
            r15.setMin = r7
            o.getSimpleStatistical.setMax(r6)
            goto L_0x0099
        L_0x0097:
            r6.setMin = r8
        L_0x0099:
            if (r1 != 0) goto L_0x009f
            o.recordStartConnAllTime r6 = r15.setMin
            if (r6 != 0) goto L_0x000b
        L_0x009f:
            long r1 = r15.setMax
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setMax = r1
            return r4
        L_0x00a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00af
        L_0x00ae:
            throw r0
        L_0x00af:
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: o.submitLazy.invoke():long");
    }

    public final printConnMonitorLog length(long j) throws EOFException {
        return new printConnMonitorLog(toFloatRange(j));
    }

    public final int getMax(recordMonitorOfRecvMsg recordmonitorofrecvmsg) {
        int length = length(recordmonitorofrecvmsg, false);
        if (length == -1) {
            return -1;
        }
        try {
            isInside((long) recordmonitorofrecvmsg.setMin[length].size());
            return length;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public final int length(recordMonitorOfRecvMsg recordmonitorofrecvmsg, boolean z) {
        int i;
        int i2;
        int i3;
        recordStartConnAllTime recordstartconnalltime;
        int i4;
        recordMonitorOfRecvMsg recordmonitorofrecvmsg2 = recordmonitorofrecvmsg;
        recordStartConnAllTime recordstartconnalltime2 = this.setMin;
        if (recordstartconnalltime2 != null) {
            byte[] bArr = recordstartconnalltime2.getMax;
            int i5 = recordstartconnalltime2.setMin;
            int i6 = recordstartconnalltime2.setMax;
            int[] iArr = recordmonitorofrecvmsg2.setMax;
            recordStartConnAllTime recordstartconnalltime3 = recordstartconnalltime2;
            int i7 = 0;
            int i8 = -1;
            loop0:
            while (true) {
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                int i11 = i9 + 1;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i8 = i12;
                }
                if (recordstartconnalltime3 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = i11 + (i10 * -1);
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr[i5] & 255) != iArr[i11]) {
                            return i8;
                        }
                        boolean z2 = i15 == i13;
                        if (i14 == i6) {
                            recordStartConnAllTime recordstartconnalltime4 = recordstartconnalltime3.toFloatRange;
                            i4 = recordstartconnalltime4.setMin;
                            byte[] bArr2 = recordstartconnalltime4.getMax;
                            i3 = recordstartconnalltime4.setMax;
                            if (recordstartconnalltime4 == recordstartconnalltime2) {
                                if (!z2) {
                                    break loop0;
                                }
                                bArr = bArr2;
                                recordstartconnalltime = null;
                            } else {
                                byte[] bArr3 = bArr2;
                                recordstartconnalltime = recordstartconnalltime4;
                                bArr = bArr3;
                            }
                        } else {
                            recordStartConnAllTime recordstartconnalltime5 = recordstartconnalltime3;
                            i3 = i6;
                            i4 = i14;
                            recordstartconnalltime = recordstartconnalltime5;
                        }
                        if (z2) {
                            i2 = iArr[i15];
                            i = i4;
                            i6 = i3;
                            recordstartconnalltime3 = recordstartconnalltime;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i11 = i15;
                        recordstartconnalltime3 = recordstartconnalltime;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & 255;
                    int i16 = i11 + i10;
                    while (i11 != i16) {
                        if (b == iArr[i11]) {
                            i2 = iArr[i11 + i10];
                            if (i == i6) {
                                recordstartconnalltime3 = recordstartconnalltime3.toFloatRange;
                                i = recordstartconnalltime3.setMin;
                                bArr = recordstartconnalltime3.getMax;
                                i6 = recordstartconnalltime3.setMax;
                                if (recordstartconnalltime3 == recordstartconnalltime2) {
                                    recordstartconnalltime3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i8;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i7 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i8;
        } else if (z) {
            return -2;
        } else {
            return recordmonitorofrecvmsg2.indexOf(printConnMonitorLog.EMPTY);
        }
    }

    public final long getMax(recordDnsTime recorddnstime) throws IOException {
        long j = this.setMax;
        if (j > 0) {
            recorddnstime.setMin(this, j);
        }
        return j;
    }

    public final String invokeSuspend() {
        try {
            return setMin(this.setMax, MonitorModel.getMax);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String setMin(Charset charset) {
        try {
            return setMin(this.setMax, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String setMin(long j, Charset charset) throws EOFException {
        MonitorModel.getMax(this.setMax, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return "";
        } else {
            recordStartConnAllTime recordstartconnalltime = this.setMin;
            if (((long) recordstartconnalltime.setMin) + j > ((long) recordstartconnalltime.setMax)) {
                return new String(toFloatRange(j), charset);
            }
            String str = new String(recordstartconnalltime.getMax, recordstartconnalltime.setMin, (int) j, charset);
            recordstartconnalltime.setMin = (int) (((long) recordstartconnalltime.setMin) + j);
            this.setMax -= j;
            if (recordstartconnalltime.setMin == recordstartconnalltime.setMax) {
                this.setMin = recordstartconnalltime.setMax();
                getSimpleStatistical.setMax(recordstartconnalltime);
            }
            return str;
        }
    }

    public final String Grayscale$Algorithm() throws EOFException {
        return setMax(Long.MAX_VALUE);
    }

    public final String setMax(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long min = getMin((byte) 10, 0, j2);
            if (min != -1) {
                return IsOverlapping(min);
            }
            if (j2 < this.setMax && getMax(j2 - 1) == 13 && getMax(j2) == 10) {
                return IsOverlapping(j2);
            }
            submitLazy submitlazy = new submitLazy();
            getMax(submitlazy, 0, Math.min(32, this.setMax));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.setMax, j));
            sb.append(" content=");
            sb.append(new printConnMonitorLog(submitlazy.valueOf()).hex());
            sb.append(Typography.ellipsis);
            throw new EOFException(sb.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
    }

    /* access modifiers changed from: package-private */
    public final String IsOverlapping(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (getMax(j2) == 13) {
                String min = setMin(j2, MonitorModel.getMax);
                isInside(2);
                return min;
            }
        }
        String min2 = setMin(j, MonitorModel.getMax);
        isInside(1);
        return min2;
    }

    public final byte[] valueOf() {
        try {
            return toFloatRange(this.setMax);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] toFloatRange(long j) throws EOFException {
        MonitorModel.getMax(this.setMax, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            setMin(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    public final void setMin(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int max = setMax(bArr, i, bArr.length - i);
            if (max != -1) {
                i += max;
            } else {
                throw new EOFException();
            }
        }
    }

    public final int setMax(byte[] bArr, int i, int i2) {
        MonitorModel.getMax((long) bArr.length, (long) i, (long) i2);
        recordStartConnAllTime recordstartconnalltime = this.setMin;
        if (recordstartconnalltime == null) {
            return -1;
        }
        int min = Math.min(i2, recordstartconnalltime.setMax - recordstartconnalltime.setMin);
        System.arraycopy(recordstartconnalltime.getMax, recordstartconnalltime.setMin, bArr, i, min);
        recordstartconnalltime.setMin += min;
        this.setMax -= (long) min;
        if (recordstartconnalltime.setMin == recordstartconnalltime.setMax) {
            this.setMin = recordstartconnalltime.setMax();
            getSimpleStatistical.setMax(recordstartconnalltime);
        }
        return min;
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        recordStartConnAllTime recordstartconnalltime = this.setMin;
        if (recordstartconnalltime == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), recordstartconnalltime.setMax - recordstartconnalltime.setMin);
        byteBuffer.put(recordstartconnalltime.getMax, recordstartconnalltime.setMin, min);
        recordstartconnalltime.setMin += min;
        this.setMax -= (long) min;
        if (recordstartconnalltime.setMin == recordstartconnalltime.setMax) {
            this.setMin = recordstartconnalltime.setMax();
            getSimpleStatistical.setMax(recordstartconnalltime);
        }
        return min;
    }

    public final void Mean$Arithmetic() {
        try {
            isInside(this.setMax);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void isInside(long j) throws EOFException {
        while (j > 0) {
            recordStartConnAllTime recordstartconnalltime = this.setMin;
            if (recordstartconnalltime != null) {
                int min = (int) Math.min(j, (long) (recordstartconnalltime.setMax - this.setMin.setMin));
                long j2 = (long) min;
                this.setMax -= j2;
                j -= j2;
                this.setMin.setMin += min;
                if (this.setMin.setMin == this.setMin.setMax) {
                    recordStartConnAllTime recordstartconnalltime2 = this.setMin;
                    this.setMin = recordstartconnalltime2.setMax();
                    getSimpleStatistical.setMax(recordstartconnalltime2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final submitLazy setMax(String str) {
        return setMin(str, 0, str.length());
    }

    /* renamed from: length */
    public final submitLazy setMin(String str, int i, int i2) {
        char c;
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        } else if (i2 < i) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    recordStartConnAllTime max = setMax(1);
                    byte[] bArr = max.getMax;
                    int i3 = max.setMax - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i5 = (i3 + i) - max.setMax;
                            max.setMax += i5;
                            this.setMax += (long) i5;
                        } else {
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                    }
                    int i52 = (i3 + i) - max.setMax;
                    max.setMax += i52;
                    this.setMax += (long) i52;
                } else {
                    if (charAt2 < 2048) {
                        equals((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        equals((int) (charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        equals((charAt2 >> 12) | 224);
                        equals(((charAt2 >> 6) & 63) | 128);
                        equals((int) (charAt2 & '?') | 128);
                    } else {
                        int i6 = i + 1;
                        if (i6 < i2) {
                            c = str.charAt(i6);
                        } else {
                            c = 0;
                        }
                        if (charAt2 > 56319 || c < 56320 || c > 57343) {
                            equals(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt2 & 10239) << 10) | (9215 & c)) + 0;
                            equals((i7 >> 18) | 240);
                            equals(((i7 >> 12) & 63) | 128);
                            equals(((i7 >> 6) & 63) | 128);
                            equals((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final submitLazy getMin(int i) {
        if (i < 128) {
            equals(i);
        } else if (i < 2048) {
            equals((i >> 6) | PsExtractor.AUDIO_STREAM);
            equals((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                equals((i >> 12) | 224);
                equals(((i >> 6) & 63) | 128);
                equals((i & 63) | 128);
            } else {
                equals(63);
            }
        } else if (i <= 1114111) {
            equals((i >> 18) | 240);
            equals(((i >> 12) & 63) | 128);
            equals(((i >> 6) & 63) | 128);
            equals((i & 63) | 128);
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    /* renamed from: getMin */
    public final submitLazy length(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            MonitorModel.getMax((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                recordStartConnAllTime max = setMax(1);
                int min = Math.min(i3 - i, 8192 - max.setMax);
                System.arraycopy(bArr, i, max.getMax, max.setMax, min);
                i += min;
                max.setMax += min;
            }
            this.setMax += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                recordStartConnAllTime max = setMax(1);
                int min = Math.min(i, 8192 - max.setMax);
                byteBuffer.get(max.getMax, max.setMax, min);
                i -= min;
                max.setMax += min;
            }
            this.setMax += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long getMin(recordWsHsTime recordwshstime) throws IOException {
        if (recordwshstime != null) {
            long j = 0;
            while (true) {
                long a_ = recordwshstime.a_(this, 8192);
                if (a_ == -1) {
                    return j;
                }
                j += a_;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: getMax */
    public final submitLazy equals(int i) {
        recordStartConnAllTime max = setMax(1);
        byte[] bArr = max.getMax;
        int i2 = max.setMax;
        max.setMax = i2 + 1;
        bArr[i2] = (byte) i;
        this.setMax++;
        return this;
    }

    /* renamed from: length */
    public final submitLazy toFloatRange(int i) {
        recordStartConnAllTime max = setMax(2);
        byte[] bArr = max.getMax;
        int i2 = max.setMax;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        max.setMax = i3 + 1;
        this.setMax += 2;
        return this;
    }

    /* renamed from: setMin */
    public final submitLazy toIntRange(int i) {
        recordStartConnAllTime max = setMax(4);
        byte[] bArr = max.getMax;
        int i2 = max.setMax;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        max.setMax = i5 + 1;
        this.setMax += 4;
        return this;
    }

    /* renamed from: equals */
    public final submitLazy toDoubleRange(long j) {
        if (j == 0) {
            return equals(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return setMin("-9223372036854775808", 0, 20);
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < C.NANOS_PER_SECOND ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        recordStartConnAllTime max = setMax(i);
        byte[] bArr = max.getMax;
        int i2 = max.setMax + i;
        while (j != 0) {
            i2--;
            bArr[i2] = getMax[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = Framer.STDIN_FRAME_PREFIX;
        }
        max.setMax += i;
        this.setMax += (long) i;
        return this;
    }

    /* renamed from: toIntRange */
    public final submitLazy hashCode(long j) {
        if (j == 0) {
            return equals(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        recordStartConnAllTime max = setMax(numberOfTrailingZeros);
        byte[] bArr = max.getMax;
        int i = max.setMax;
        for (int i2 = (max.setMax + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = getMax[(int) (15 & j)];
            j >>>= 4;
        }
        max.setMax += numberOfTrailingZeros;
        this.setMax += (long) numberOfTrailingZeros;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final recordStartConnAllTime setMax(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        recordStartConnAllTime recordstartconnalltime = this.setMin;
        if (recordstartconnalltime == null) {
            recordStartConnAllTime min = getSimpleStatistical.getMin();
            this.setMin = min;
            min.toIntRange = min;
            min.toFloatRange = min;
            return min;
        }
        recordStartConnAllTime recordstartconnalltime2 = recordstartconnalltime.toIntRange;
        if (recordstartconnalltime2.setMax + i <= 8192 && recordstartconnalltime2.getMin) {
            return recordstartconnalltime2;
        }
        recordStartConnAllTime min2 = getSimpleStatistical.getMin();
        min2.toIntRange = recordstartconnalltime2;
        min2.toFloatRange = recordstartconnalltime2.toFloatRange;
        recordstartconnalltime2.toFloatRange.toIntRange = min2;
        recordstartconnalltime2.toFloatRange = min2;
        return min2;
    }

    public final void setMin(submitLazy submitlazy, long j) {
        recordStartConnAllTime recordstartconnalltime;
        int i;
        if (submitlazy == null) {
            throw new IllegalArgumentException("source == null");
        } else if (submitlazy != this) {
            MonitorModel.getMax(submitlazy.setMax, 0, j);
            while (j > 0) {
                int i2 = 0;
                if (j < ((long) (submitlazy.setMin.setMax - submitlazy.setMin.setMin))) {
                    recordStartConnAllTime recordstartconnalltime2 = this.setMin;
                    recordStartConnAllTime recordstartconnalltime3 = recordstartconnalltime2 != null ? recordstartconnalltime2.toIntRange : null;
                    if (recordstartconnalltime3 != null && recordstartconnalltime3.getMin) {
                        long j2 = ((long) recordstartconnalltime3.setMax) + j;
                        if (recordstartconnalltime3.length) {
                            i = 0;
                        } else {
                            i = recordstartconnalltime3.setMin;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            submitlazy.setMin.setMin(recordstartconnalltime3, (int) j);
                            submitlazy.setMax -= j;
                            this.setMax += j;
                            return;
                        }
                    }
                    recordStartConnAllTime recordstartconnalltime4 = submitlazy.setMin;
                    int i3 = (int) j;
                    if (i3 <= 0 || i3 > recordstartconnalltime4.setMax - recordstartconnalltime4.setMin) {
                        throw new IllegalArgumentException();
                    }
                    if (i3 >= 1024) {
                        recordstartconnalltime4.length = true;
                        recordstartconnalltime = new recordStartConnAllTime(recordstartconnalltime4.getMax, recordstartconnalltime4.setMin, recordstartconnalltime4.setMax);
                    } else {
                        recordstartconnalltime = getSimpleStatistical.getMin();
                        System.arraycopy(recordstartconnalltime4.getMax, recordstartconnalltime4.setMin, recordstartconnalltime.getMax, 0, i3);
                    }
                    recordstartconnalltime.setMax = recordstartconnalltime.setMin + i3;
                    recordstartconnalltime4.setMin += i3;
                    recordStartConnAllTime recordstartconnalltime5 = recordstartconnalltime4.toIntRange;
                    recordstartconnalltime.toIntRange = recordstartconnalltime5;
                    recordstartconnalltime.toFloatRange = recordstartconnalltime5.toFloatRange;
                    recordstartconnalltime5.toFloatRange.toIntRange = recordstartconnalltime;
                    recordstartconnalltime5.toFloatRange = recordstartconnalltime;
                    submitlazy.setMin = recordstartconnalltime;
                }
                recordStartConnAllTime recordstartconnalltime6 = submitlazy.setMin;
                long j3 = (long) (recordstartconnalltime6.setMax - recordstartconnalltime6.setMin);
                submitlazy.setMin = recordstartconnalltime6.setMax();
                recordStartConnAllTime recordstartconnalltime7 = this.setMin;
                if (recordstartconnalltime7 == null) {
                    this.setMin = recordstartconnalltime6;
                    recordstartconnalltime6.toIntRange = recordstartconnalltime6;
                    recordstartconnalltime6.toFloatRange = recordstartconnalltime6;
                } else {
                    recordStartConnAllTime recordstartconnalltime8 = recordstartconnalltime7.toIntRange;
                    recordstartconnalltime6.toIntRange = recordstartconnalltime8;
                    recordstartconnalltime6.toFloatRange = recordstartconnalltime8.toFloatRange;
                    recordstartconnalltime8.toFloatRange.toIntRange = recordstartconnalltime6;
                    recordstartconnalltime8.toFloatRange = recordstartconnalltime6;
                    if (recordstartconnalltime6.toIntRange == recordstartconnalltime6) {
                        throw new IllegalStateException();
                    } else if (recordstartconnalltime6.toIntRange.getMin) {
                        int i4 = recordstartconnalltime6.setMax - recordstartconnalltime6.setMin;
                        int i5 = 8192 - recordstartconnalltime6.toIntRange.setMax;
                        if (!recordstartconnalltime6.toIntRange.length) {
                            i2 = recordstartconnalltime6.toIntRange.setMin;
                        }
                        if (i4 <= i5 + i2) {
                            recordstartconnalltime6.setMin(recordstartconnalltime6.toIntRange, i4);
                            recordstartconnalltime6.setMax();
                            getSimpleStatistical.setMax(recordstartconnalltime6);
                        }
                    }
                }
                submitlazy.setMax -= j3;
                this.setMax += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final long a_(submitLazy submitlazy, long j) {
        if (submitlazy == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.setMax;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            submitlazy.setMin(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
    }

    public final long getCause() {
        return getMin((byte) 0, 0, Long.MAX_VALUE);
    }

    public final long getMin(byte b, long j, long j2) {
        recordStartConnAllTime recordstartconnalltime;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.setMax), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.setMax;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (recordstartconnalltime = this.setMin) == null) {
            return -1;
        }
        long j5 = this.setMax;
        if (j5 - j < j) {
            while (j5 > j) {
                recordstartconnalltime = recordstartconnalltime.toIntRange;
                j5 -= (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
            }
        } else {
            while (true) {
                long j6 = ((long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin)) + j3;
                if (j6 >= j) {
                    break;
                }
                recordstartconnalltime = recordstartconnalltime.toFloatRange;
                j3 = j6;
            }
            j5 = j3;
        }
        long j7 = j;
        while (j5 < j4) {
            byte[] bArr = recordstartconnalltime.getMax;
            int min = (int) Math.min((long) recordstartconnalltime.setMax, (((long) recordstartconnalltime.setMin) + j4) - j5);
            for (int i = (int) ((((long) recordstartconnalltime.setMin) + j7) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - recordstartconnalltime.setMin)) + j5;
                }
            }
            byte b2 = b;
            j5 += (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
            recordstartconnalltime = recordstartconnalltime.toFloatRange;
            j7 = j5;
        }
        return -1;
    }

    public final long setMin(printConnMonitorLog printconnmonitorlog) throws IOException {
        return length(printconnmonitorlog, 0);
    }

    public final long length(printConnMonitorLog printconnmonitorlog, long j) throws IOException {
        printConnMonitorLog printconnmonitorlog2 = printconnmonitorlog;
        if (printconnmonitorlog.size() != 0) {
            long j2 = 0;
            if (j >= 0) {
                recordStartConnAllTime recordstartconnalltime = this.setMin;
                long j3 = -1;
                if (recordstartconnalltime == null) {
                    return -1;
                }
                long j4 = this.setMax;
                if (j4 - j < j) {
                    while (j4 > j) {
                        recordstartconnalltime = recordstartconnalltime.toIntRange;
                        j4 -= (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin)) + j2;
                        if (j5 >= j) {
                            break;
                        }
                        recordstartconnalltime = recordstartconnalltime.toFloatRange;
                        j2 = j5;
                    }
                    j4 = j2;
                }
                byte b = printconnmonitorlog2.getByte(0);
                int size = printconnmonitorlog.size();
                long j6 = (this.setMax - ((long) size)) + 1;
                long j7 = j4;
                long j8 = j;
                while (j7 < j6) {
                    byte[] bArr = recordstartconnalltime.getMax;
                    int min = (int) Math.min((long) recordstartconnalltime.setMax, (((long) recordstartconnalltime.setMin) + j6) - j7);
                    for (int i = (int) ((((long) recordstartconnalltime.setMin) + j8) - j7); i < min; i++) {
                        if (bArr[i] == b && length(recordstartconnalltime, i + 1, printconnmonitorlog2, size)) {
                            return ((long) (i - recordstartconnalltime.setMin)) + j7;
                        }
                    }
                    j7 += (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
                    recordstartconnalltime = recordstartconnalltime.toFloatRange;
                    j8 = j7;
                    j3 = -1;
                }
                return j3;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    public final long getMax(printConnMonitorLog printconnmonitorlog) {
        return setMax(printconnmonitorlog, 0);
    }

    public final long setMax(printConnMonitorLog printconnmonitorlog, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            recordStartConnAllTime recordstartconnalltime = this.setMin;
            if (recordstartconnalltime == null) {
                return -1;
            }
            long j3 = this.setMax;
            if (j3 - j < j) {
                while (j3 > j) {
                    recordstartconnalltime = recordstartconnalltime.toIntRange;
                    j3 -= (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
                }
            } else {
                while (true) {
                    long j4 = ((long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin)) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    recordstartconnalltime = recordstartconnalltime.toFloatRange;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (printconnmonitorlog.size() == 2) {
                byte b = printconnmonitorlog.getByte(0);
                byte b2 = printconnmonitorlog.getByte(1);
                while (j3 < this.setMax) {
                    byte[] bArr = recordstartconnalltime.getMax;
                    i = (int) ((((long) recordstartconnalltime.setMin) + j) - j3);
                    int i3 = recordstartconnalltime.setMax;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 == b || b3 == b2) {
                            i2 = recordstartconnalltime.setMin;
                        } else {
                            i++;
                        }
                    }
                    j3 += (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
                    recordstartconnalltime = recordstartconnalltime.toFloatRange;
                    j = j3;
                }
                return -1;
            }
            byte[] internalArray = printconnmonitorlog.internalArray();
            while (j3 < this.setMax) {
                byte[] bArr2 = recordstartconnalltime.getMax;
                int i4 = (int) ((((long) recordstartconnalltime.setMin) + j) - j3);
                int i5 = recordstartconnalltime.setMax;
                while (i < i5) {
                    byte b4 = bArr2[i];
                    int length = internalArray.length;
                    int i6 = 0;
                    while (i6 < length) {
                        if (b4 == internalArray[i6]) {
                            i2 = recordstartconnalltime.setMin;
                        } else {
                            i6++;
                        }
                    }
                    i4 = i + 1;
                }
                j3 += (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
                recordstartconnalltime = recordstartconnalltime.toFloatRange;
                j = j3;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public final boolean setMax(printConnMonitorLog printconnmonitorlog) {
        return setMax(printconnmonitorlog, printconnmonitorlog.size());
    }

    private boolean setMax(printConnMonitorLog printconnmonitorlog, int i) {
        if (i < 0 || this.setMax - 0 < ((long) i) || printconnmonitorlog.size() - 0 < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (getMax(((long) i2) + 0) != printconnmonitorlog.getByte(i2 + 0)) {
                return false;
            }
        }
        return true;
    }

    private static boolean length(recordStartConnAllTime recordstartconnalltime, int i, printConnMonitorLog printconnmonitorlog, int i2) {
        int i3 = recordstartconnalltime.setMax;
        byte[] bArr = recordstartconnalltime.getMax;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                recordstartconnalltime = recordstartconnalltime.toFloatRange;
                byte[] bArr2 = recordstartconnalltime.getMax;
                int i5 = recordstartconnalltime.setMin;
                bArr = bArr2;
                i = i5;
                i3 = recordstartconnalltime.setMax;
            }
            if (bArr[i] != printconnmonitorlog.getByte(i4)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final recordSSLTime getMin() {
        return recordSSLTime.setMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof submitLazy)) {
            return false;
        }
        submitLazy submitlazy = (submitLazy) obj;
        long j = this.setMax;
        if (j != submitlazy.setMax) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        recordStartConnAllTime recordstartconnalltime = this.setMin;
        recordStartConnAllTime recordstartconnalltime2 = submitlazy.setMin;
        int i = recordstartconnalltime.setMin;
        int i2 = recordstartconnalltime2.setMin;
        while (j2 < this.setMax) {
            long min = (long) Math.min(recordstartconnalltime.setMax - i, recordstartconnalltime2.setMax - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (recordstartconnalltime.getMax[i] != recordstartconnalltime2.getMax[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == recordstartconnalltime.setMax) {
                recordstartconnalltime = recordstartconnalltime.toFloatRange;
                i = recordstartconnalltime.setMin;
            }
            if (i2 == recordstartconnalltime2.setMax) {
                recordstartconnalltime2 = recordstartconnalltime2.toFloatRange;
                i2 = recordstartconnalltime2.setMin;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        recordStartConnAllTime recordstartconnalltime = this.setMin;
        if (recordstartconnalltime == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = recordstartconnalltime.setMax;
            for (int i3 = recordstartconnalltime.setMin; i3 < i2; i3++) {
                i = (i * 31) + recordstartconnalltime.getMax[i3];
            }
            recordstartconnalltime = recordstartconnalltime.toFloatRange;
        } while (recordstartconnalltime != this.setMin);
        return i;
    }

    /* renamed from: onNavigationEvent */
    public final submitLazy clone() {
        submitLazy submitlazy = new submitLazy();
        if (this.setMax == 0) {
            return submitlazy;
        }
        recordStartConnAllTime recordstartconnalltime = this.setMin;
        recordstartconnalltime.length = true;
        recordStartConnAllTime recordstartconnalltime2 = new recordStartConnAllTime(recordstartconnalltime.getMax, recordstartconnalltime.setMin, recordstartconnalltime.setMax);
        submitlazy.setMin = recordstartconnalltime2;
        recordstartconnalltime2.toIntRange = recordstartconnalltime2;
        recordstartconnalltime2.toFloatRange = recordstartconnalltime2;
        recordStartConnAllTime recordstartconnalltime3 = this.setMin;
        while (true) {
            recordstartconnalltime3 = recordstartconnalltime3.toFloatRange;
            if (recordstartconnalltime3 != this.setMin) {
                recordStartConnAllTime recordstartconnalltime4 = submitlazy.setMin.toIntRange;
                recordstartconnalltime3.length = true;
                recordStartConnAllTime recordstartconnalltime5 = new recordStartConnAllTime(recordstartconnalltime3.getMax, recordstartconnalltime3.setMin, recordstartconnalltime3.setMax);
                recordstartconnalltime5.toIntRange = recordstartconnalltime4;
                recordstartconnalltime5.toFloatRange = recordstartconnalltime4.toFloatRange;
                recordstartconnalltime4.toFloatRange.toIntRange = recordstartconnalltime5;
                recordstartconnalltime4.toFloatRange = recordstartconnalltime5;
            } else {
                submitlazy.setMax = this.setMax;
                return submitlazy;
            }
        }
    }

    public final long values() {
        long j;
        if (this.setMax >= 8) {
            recordStartConnAllTime recordstartconnalltime = this.setMin;
            int i = recordstartconnalltime.setMin;
            int i2 = recordstartconnalltime.setMax;
            if (i2 - i < 8) {
                j = ((((long) toIntRange()) & 4294967295L) << 32) | (4294967295L & ((long) toIntRange()));
            } else {
                byte[] bArr = recordstartconnalltime.getMax;
                int i3 = i + 1;
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                long j3 = (((long) bArr[i9]) & 255) | ((((long) bArr[i8]) & 255) << 8) | j2;
                this.setMax -= 8;
                if (i10 == i2) {
                    this.setMin = recordstartconnalltime.setMax();
                    getSimpleStatistical.setMax(recordstartconnalltime);
                } else {
                    recordstartconnalltime.setMin = i10;
                }
                j = j3;
            }
            return MonitorModel.getMax(j);
        }
        StringBuilder sb = new StringBuilder("size < 8: ");
        sb.append(this.setMax);
        throw new IllegalStateException(sb.toString());
    }

    public final String toString() {
        Object obj;
        long j = this.setMax;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                obj = printConnMonitorLog.EMPTY;
            } else {
                obj = new recordConnectedTime(this, i);
            }
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder("size > Integer.MAX_VALUE: ");
        sb.append(this.setMax);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* synthetic */ executeSerial setMin(String str) throws IOException {
        return setMin(str, 0, str.length());
    }

    public final /* synthetic */ executeSerial setMax(byte[] bArr) throws IOException {
        if (bArr != null) {
            return length(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final /* synthetic */ executeSerial length(printConnMonitorLog printconnmonitorlog) throws IOException {
        if (printconnmonitorlog != null) {
            printconnmonitorlog.write(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }
}
