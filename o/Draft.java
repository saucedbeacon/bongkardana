package o;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import kotlin.Metadata;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import o.CloseFrameBuilder;
import o.Draft_75;
import o.InvalidDataException;
import o.InvalidHandshakeException;
import okhttp3.Protocol;
import okhttp3.TlsVersion;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class Draft {
    public static final /* synthetic */ int[] length;

    public interface HandshakeState {
        Protocol getMax();
    }

    static {
        int[] iArr = new int[CoroutineScheduler.WorkerState.values().length];
        length = iArr;
        iArr[CoroutineScheduler.WorkerState.PARKING.ordinal()] = 1;
        length[CoroutineScheduler.WorkerState.BLOCKING.ordinal()] = 2;
        length[CoroutineScheduler.WorkerState.CPU_ACQUIRED.ordinal()] = 3;
        length[CoroutineScheduler.WorkerState.DORMANT.ordinal()] = 4;
        length[CoroutineScheduler.WorkerState.TERMINATED.ordinal()] = 5;
    }

    public final class CloseHandshakeType implements Closeable, Flushable {
        private int IsOverlapping;
        final getPayloadData getMax;
        int getMin;
        private int length;
        final CloseFrameBuilder setMax;
        int setMin;
        private int toFloatRange;

        public CloseHandshakeType(File file) {
            this(file, verbose.length);
        }

        private CloseHandshakeType(File file, verbose verbose) {
            this.getMax = new getPayloadData() {
                public final InvalidHandshakeException setMax(InvalidDataException invalidDataException) throws IOException {
                    return CloseHandshakeType.this.getMin(invalidDataException);
                }

                public final WebsocketNotConnectedException setMax(InvalidHandshakeException invalidHandshakeException) throws IOException {
                    return CloseHandshakeType.this.getMin(invalidHandshakeException);
                }

                public final void length(InvalidDataException invalidDataException) throws IOException {
                    CloseHandshakeType.this.setMax.getMax(printConnMonitorLog.encodeUtf8(invalidDataException.setMin.toString()).md5().hex());
                }

                public final void setMax() {
                    CloseHandshakeType.this.getMin();
                }

                public final void length(setCodeAndMessage setcodeandmessage) {
                    CloseHandshakeType.this.setMax(setcodeandmessage);
                }

                public final void setMin(InvalidHandshakeException invalidHandshakeException, InvalidHandshakeException invalidHandshakeException2) {
                    CloseFrameBuilder.setMin setmin;
                    setMax setmax = new setMax(invalidHandshakeException2);
                    CloseFrameBuilder.setMax setmax2 = ((getMin) invalidHandshakeException.toFloatRange).getMin;
                    try {
                        setmin = CloseFrameBuilder.this.length(setmax2.getMin, setmax2.setMin);
                        if (setmin != null) {
                            try {
                                setmax.setMin(setmin);
                                setmin.setMin();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException unused2) {
                        setmin = null;
                        CloseHandshakeType.setMin(setmin);
                    }
                }
            };
            this.setMax = CloseFrameBuilder.setMax(verbose, file);
        }

        static void setMin(@Nullable CloseFrameBuilder.setMin setmin) {
            if (setmin != null) {
                try {
                    setmin.setMax();
                } catch (IOException unused) {
                }
            }
        }

        public final void flush() throws IOException {
            this.setMax.flush();
        }

        public final void close() throws IOException {
            this.setMax.close();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void setMax(o.setCodeAndMessage r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                int r0 = r1.IsOverlapping     // Catch:{ all -> 0x001f }
                int r0 = r0 + 1
                r1.IsOverlapping = r0     // Catch:{ all -> 0x001f }
                o.InvalidDataException r0 = r2.getMin     // Catch:{ all -> 0x001f }
                if (r0 == 0) goto L_0x0013
                int r2 = r1.length     // Catch:{ all -> 0x001f }
                int r2 = r2 + 1
                r1.length = r2     // Catch:{ all -> 0x001f }
                monitor-exit(r1)
                return
            L_0x0013:
                o.InvalidHandshakeException r2 = r2.getMax     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001d
                int r2 = r1.toFloatRange     // Catch:{ all -> 0x001f }
                int r2 = r2 + 1
                r1.toFloatRange = r2     // Catch:{ all -> 0x001f }
            L_0x001d:
                monitor-exit(r1)
                return
            L_0x001f:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Draft.CloseHandshakeType.setMax(o.setCodeAndMessage):void");
        }

        /* access modifiers changed from: package-private */
        public final synchronized void getMin() {
            this.toFloatRange++;
        }

        final class length implements WebsocketNotConnectedException {
            private recordDnsTime getMax;
            boolean getMin;
            private recordDnsTime setMax;
            private final CloseFrameBuilder.setMin setMin;

            length(final CloseFrameBuilder.setMin setmin) {
                this.setMin = setmin;
                recordDnsTime min = setmin.getMin(1);
                this.getMax = min;
                this.setMax = new scheduleAtFixedRate(min, CloseHandshakeType.this) {
                    public final void close() throws IOException {
                        synchronized (CloseHandshakeType.this) {
                            if (!length.this.getMin) {
                                length.this.getMin = true;
                                CloseHandshakeType.this.getMin++;
                                super.close();
                                setmin.setMin();
                            }
                        }
                    }
                };
            }

            public final void setMin() {
                synchronized (CloseHandshakeType.this) {
                    if (!this.getMin) {
                        this.getMin = true;
                        CloseHandshakeType.this.setMin++;
                        initCloseCode.getMin((Closeable) this.getMax);
                        try {
                            this.setMin.setMax();
                        } catch (IOException unused) {
                        }
                    }
                }
            }

            public final recordDnsTime length() {
                return this.setMax;
            }
        }

        static final class setMax {
            private static final String FastBitmap$CoordinateSystem;
            private static final String toString;
            final long IsOverlapping;
            final long equals;
            final Protocol getMax;
            final Draft_75 getMin;
            final Draft_75 isInside;
            final String length;
            final int setMax;
            final String setMin;
            final String toFloatRange;
            @Nullable
            final createBuffer toIntRange;

            static {
                StringBuilder sb = new StringBuilder();
                MPaaSSCLogCatImpl.toIntRange();
                sb.append(MPaaSSCLogCatImpl.toFloatRange());
                sb.append("-Sent-Millis");
                FastBitmap$CoordinateSystem = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                MPaaSSCLogCatImpl.toIntRange();
                sb2.append(MPaaSSCLogCatImpl.toFloatRange());
                sb2.append("-Received-Millis");
                toString = sb2.toString();
            }

            setMax(recordWsHsTime recordwshstime) throws IOException {
                TlsVersion tlsVersion;
                try {
                    schedule min = recordMonitorOfSndMsg.setMin(recordwshstime);
                    this.setMin = min.Grayscale$Algorithm();
                    this.length = min.Grayscale$Algorithm();
                    Draft_75.length length2 = new Draft_75.length();
                    int max = CloseHandshakeType.getMax(min);
                    for (int i = 0; i < max; i++) {
                        length2.length(min.Grayscale$Algorithm());
                    }
                    this.getMin = new Draft_75(length2);
                    getHttpStatusMessage max2 = getHttpStatusMessage.setMax(min.Grayscale$Algorithm());
                    this.getMax = max2.length;
                    this.setMax = max2.getMin;
                    this.toFloatRange = max2.setMin;
                    Draft_75.length length3 = new Draft_75.length();
                    int max3 = CloseHandshakeType.getMax(min);
                    for (int i2 = 0; i2 < max3; i2++) {
                        length3.length(min.Grayscale$Algorithm());
                    }
                    String min2 = length3.setMin(FastBitmap$CoordinateSystem);
                    String min3 = length3.setMin(toString);
                    length3.getMax(FastBitmap$CoordinateSystem);
                    length3.getMax(toString);
                    long j = 0;
                    this.IsOverlapping = min2 != null ? Long.parseLong(min2) : 0;
                    this.equals = min3 != null ? Long.parseLong(min3) : j;
                    this.isInside = new Draft_75(length3);
                    if (setMin()) {
                        String Grayscale$Algorithm = min.Grayscale$Algorithm();
                        if (Grayscale$Algorithm.length() <= 0) {
                            readVersion max4 = readVersion.getMax(min.Grayscale$Algorithm());
                            List<Certificate> max5 = setMax(min);
                            List<Certificate> max6 = setMax(min);
                            if (!min.setMax()) {
                                tlsVersion = TlsVersion.forJavaName(min.Grayscale$Algorithm());
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.toIntRange = createBuffer.setMin(tlsVersion, max4, max5, max6);
                        } else {
                            StringBuilder sb = new StringBuilder("expected \"\" but was \"");
                            sb.append(Grayscale$Algorithm);
                            sb.append("\"");
                            throw new IOException(sb.toString());
                        }
                    } else {
                        this.toIntRange = null;
                    }
                } finally {
                    recordwshstime.close();
                }
            }

            setMax(InvalidHandshakeException invalidHandshakeException) {
                this.setMin = invalidHandshakeException.getMin.setMin.toString();
                this.getMin = ClientHandshake.setMin(invalidHandshakeException);
                this.length = invalidHandshakeException.getMin.getMin;
                this.getMax = invalidHandshakeException.setMax;
                this.setMax = invalidHandshakeException.getMax;
                this.toFloatRange = invalidHandshakeException.length;
                this.isInside = invalidHandshakeException.toIntRange;
                this.toIntRange = invalidHandshakeException.setMin;
                this.IsOverlapping = invalidHandshakeException.toDoubleRange;
                this.equals = invalidHandshakeException.hashCode;
            }

            public final void setMin(CloseFrameBuilder.setMin setmin) throws IOException {
                executeSerial max = recordMonitorOfSndMsg.getMax(setmin.getMin(0));
                max.setMin(this.setMin).equals(10);
                max.setMin(this.length).equals(10);
                max.toDoubleRange((long) (this.getMin.length.length / 2)).equals(10);
                int length2 = this.getMin.length.length / 2;
                for (int i = 0; i < length2; i++) {
                    int i2 = i * 2;
                    max.setMin(this.getMin.length[i2]).setMin(": ").setMin(this.getMin.length[i2 + 1]).equals(10);
                }
                max.setMin(new getHttpStatusMessage(this.getMax, this.setMax, this.toFloatRange).toString()).equals(10);
                max.toDoubleRange((long) ((this.isInside.length.length / 2) + 2)).equals(10);
                int length3 = this.isInside.length.length / 2;
                for (int i3 = 0; i3 < length3; i3++) {
                    int i4 = i3 * 2;
                    max.setMin(this.isInside.length[i4]).setMin(": ").setMin(this.isInside.length[i4 + 1]).equals(10);
                }
                max.setMin(FastBitmap$CoordinateSystem).setMin(": ").toDoubleRange(this.IsOverlapping).equals(10);
                max.setMin(toString).setMin(": ").toDoubleRange(this.equals).equals(10);
                if (setMin()) {
                    max.equals(10);
                    max.setMin(this.toIntRange.getMax.getVolumeAttributes).equals(10);
                    setMin(max, this.toIntRange.getMin);
                    setMin(max, this.toIntRange.length);
                    max.setMin(this.toIntRange.setMin.javaName()).equals(10);
                }
                max.close();
            }

            private boolean setMin() {
                return this.setMin.startsWith("https://");
            }

            private static List<Certificate> setMax(schedule schedule) throws IOException {
                int max = CloseHandshakeType.getMax(schedule);
                if (max == -1) {
                    return Collections.emptyList();
                }
                try {
                    CertificateFactory instance = CertificateFactory.getInstance("X.509");
                    ArrayList arrayList = new ArrayList(max);
                    int i = 0;
                    while (i < max) {
                        String Grayscale$Algorithm = schedule.Grayscale$Algorithm();
                        submitLazy submitlazy = new submitLazy();
                        printConnMonitorLog decodeBase64 = printConnMonitorLog.decodeBase64(Grayscale$Algorithm);
                        if (decodeBase64 != null) {
                            decodeBase64.write(submitlazy);
                            arrayList.add(instance.generateCertificate(new InputStream() {
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
                            }));
                            i++;
                        } else {
                            throw new IllegalArgumentException("byteString == null");
                        }
                    }
                    return arrayList;
                } catch (CertificateException e) {
                    throw new IOException(e.getMessage());
                }
            }

            private static void setMin(executeSerial executeserial, List<Certificate> list) throws IOException {
                try {
                    executeserial.toDoubleRange((long) list.size()).equals(10);
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        executeserial.setMin(printConnMonitorLog.of(list.get(i).getEncoded()).base64()).equals(10);
                    }
                } catch (CertificateEncodingException e) {
                    throw new IOException(e.getMessage());
                }
            }

            public final boolean setMax(InvalidDataException invalidDataException, InvalidHandshakeException invalidHandshakeException) {
                return this.setMin.equals(invalidDataException.setMin.toString()) && this.length.equals(invalidDataException.getMin) && ClientHandshake.length(invalidHandshakeException, this.getMin, invalidDataException);
            }
        }

        static int getMax(schedule schedule) throws IOException {
            try {
                long FastBitmap$CoordinateSystem = schedule.FastBitmap$CoordinateSystem();
                String Grayscale$Algorithm = schedule.Grayscale$Algorithm();
                if (FastBitmap$CoordinateSystem >= 0 && FastBitmap$CoordinateSystem <= 2147483647L && Grayscale$Algorithm.isEmpty()) {
                    return (int) FastBitmap$CoordinateSystem;
                }
                StringBuilder sb = new StringBuilder("expected an int but was \"");
                sb.append(FastBitmap$CoordinateSystem);
                sb.append(Grayscale$Algorithm);
                sb.append("\"");
                throw new IOException(sb.toString());
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        static class getMin extends NotSendableException {
            @Nullable
            private final String getMax;
            final CloseFrameBuilder.setMax getMin;
            @Nullable
            private final String setMax;
            private final schedule setMin;

            getMin(final CloseFrameBuilder.setMax setmax, String str, String str2) {
                this.getMin = setmax;
                this.setMax = str;
                this.getMax = str2;
                this.setMin = recordMonitorOfSndMsg.setMin((recordWsHsTime) new DataflowMonitorModel(setmax.getMax[1]) {
                    public final void close() throws IOException {
                        setmax.close();
                        super.close();
                    }
                });
            }

            public final translateRegularFrame getMin() {
                String str = this.setMax;
                if (str != null) {
                    return translateRegularFrame.length(str);
                }
                return null;
            }

            public final long setMax() {
                try {
                    if (this.getMax != null) {
                        return Long.parseLong(this.getMax);
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final schedule getMax() {
                return this.setMin;
            }
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public final InvalidHandshakeException getMin(InvalidDataException invalidDataException) {
            try {
                CloseFrameBuilder.setMax min = this.setMax.getMin(printConnMonitorLog.encodeUtf8(invalidDataException.setMin.toString()).md5().hex());
                if (min == null) {
                    return null;
                }
                try {
                    setMax setmax = new setMax(min.getMax[0]);
                    String length2 = setmax.isInside.length("Content-Type");
                    String length3 = setmax.isInside.length("Content-Length");
                    InvalidDataException.getMin length4 = new InvalidDataException.getMin().setMax(setmax.setMin).length(setmax.length, (getPart) null);
                    Draft_75 draft_75 = setmax.getMin;
                    Draft_75.length length5 = new Draft_75.length();
                    Collections.addAll(length5.setMin, draft_75.length);
                    length4.setMin = length5;
                    if (length4.getMin != null) {
                        InvalidDataException invalidDataException2 = new InvalidDataException(length4);
                        InvalidHandshakeException.getMin getmin = new InvalidHandshakeException.getMin();
                        getmin.setMin = invalidDataException2;
                        getmin.getMax = setmax.getMax;
                        getmin.getMin = setmax.setMax;
                        getmin.setMax = setmax.toFloatRange;
                        Draft_75 draft_752 = setmax.isInside;
                        Draft_75.length length6 = new Draft_75.length();
                        Collections.addAll(length6.setMin, draft_752.length);
                        getmin.equals = length6;
                        getmin.toIntRange = new getMin(min, length2, length3);
                        getmin.length = setmax.toIntRange;
                        getmin.toString = setmax.IsOverlapping;
                        getmin.values = setmax.equals;
                        InvalidHandshakeException length7 = getmin.length();
                        if (setmax.setMax(invalidDataException, length7)) {
                            return length7;
                        }
                        initCloseCode.getMin((Closeable) length7.toFloatRange);
                        return null;
                    }
                    throw new IllegalStateException("url == null");
                } catch (IOException unused) {
                    initCloseCode.getMin((Closeable) min);
                    return null;
                }
            } catch (IOException unused2) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[SYNTHETIC, Splitter:B:24:0x0069] */
        @javax.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final o.WebsocketNotConnectedException getMin(o.InvalidHandshakeException r6) {
            /*
                r5 = this;
                o.InvalidDataException r0 = r6.getMin
                java.lang.String r0 = r0.getMin
                o.InvalidDataException r1 = r6.getMin
                java.lang.String r1 = r1.getMin
                boolean r1 = o.ClientHandshakeBuilder.setMin(r1)
                r2 = 0
                if (r1 == 0) goto L_0x0029
                o.InvalidDataException r6 = r6.getMin     // Catch:{ IOException -> 0x0028 }
                o.CloseFrameBuilder r0 = r5.setMax     // Catch:{ IOException -> 0x0028 }
                o.Draft_76 r6 = r6.setMin     // Catch:{ IOException -> 0x0028 }
                java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0028 }
                o.printConnMonitorLog r6 = o.printConnMonitorLog.encodeUtf8(r6)     // Catch:{ IOException -> 0x0028 }
                o.printConnMonitorLog r6 = r6.md5()     // Catch:{ IOException -> 0x0028 }
                java.lang.String r6 = r6.hex()     // Catch:{ IOException -> 0x0028 }
                r0.getMax((java.lang.String) r6)     // Catch:{ IOException -> 0x0028 }
            L_0x0028:
                return r2
            L_0x0029:
                java.lang.String r1 = "GET"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0032
                return r2
            L_0x0032:
                boolean r0 = o.ClientHandshake.getMin(r6)
                if (r0 == 0) goto L_0x0039
                return r2
            L_0x0039:
                o.Draft$CloseHandshakeType$setMax r0 = new o.Draft$CloseHandshakeType$setMax
                r0.<init>((o.InvalidHandshakeException) r6)
                o.CloseFrameBuilder r1 = r5.setMax     // Catch:{ IOException -> 0x0066 }
                o.InvalidDataException r6 = r6.getMin     // Catch:{ IOException -> 0x0066 }
                o.Draft_76 r6 = r6.setMin     // Catch:{ IOException -> 0x0066 }
                java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0066 }
                o.printConnMonitorLog r6 = o.printConnMonitorLog.encodeUtf8(r6)     // Catch:{ IOException -> 0x0066 }
                o.printConnMonitorLog r6 = r6.md5()     // Catch:{ IOException -> 0x0066 }
                java.lang.String r6 = r6.hex()     // Catch:{ IOException -> 0x0066 }
                r3 = -1
                o.CloseFrameBuilder$setMin r6 = r1.length(r6, r3)     // Catch:{ IOException -> 0x0066 }
                if (r6 != 0) goto L_0x005d
                return r2
            L_0x005d:
                r0.setMin(r6)     // Catch:{ IOException -> 0x0067 }
                o.Draft$CloseHandshakeType$length r0 = new o.Draft$CloseHandshakeType$length     // Catch:{ IOException -> 0x0067 }
                r0.<init>(r6)     // Catch:{ IOException -> 0x0067 }
                return r0
            L_0x0066:
                r6 = r2
            L_0x0067:
                if (r6 == 0) goto L_0x006c
                r6.setMax()     // Catch:{ IOException -> 0x006c }
            L_0x006c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Draft.CloseHandshakeType.getMin(o.InvalidHandshakeException):o.WebsocketNotConnectedException");
        }
    }
}
