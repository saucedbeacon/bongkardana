package o;

import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

public final class recordMonitorOfSndMsg {
    static final Logger length = Logger.getLogger(recordMonitorOfSndMsg.class.getName());

    private recordMonitorOfSndMsg() {
    }

    public static schedule setMin(recordWsHsTime recordwshstime) {
        return new recordTargetHost(recordwshstime);
    }

    public static executeSerial getMax(recordDnsTime recorddnstime) {
        return new printErrorMonitorLog(recorddnstime);
    }

    public static recordDnsTime length(final OutputStream outputStream) {
        final recordSSLTime recordssltime = new recordSSLTime();
        if (outputStream != null) {
            return new recordDnsTime() {
                public final void setMin(submitLazy submitlazy, long j) throws IOException {
                    MonitorModel.getMax(submitlazy.setMax, 0, j);
                    while (j > 0) {
                        recordSSLTime.this.IsOverlapping();
                        recordStartConnAllTime recordstartconnalltime = submitlazy.setMin;
                        int min = (int) Math.min(j, (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin));
                        outputStream.write(recordstartconnalltime.getMax, recordstartconnalltime.setMin, min);
                        recordstartconnalltime.setMin += min;
                        long j2 = (long) min;
                        j -= j2;
                        submitlazy.setMax -= j2;
                        if (recordstartconnalltime.setMin == recordstartconnalltime.setMax) {
                            submitlazy.setMin = recordstartconnalltime.setMax();
                            getSimpleStatistical.setMax(recordstartconnalltime);
                        }
                    }
                }

                public final void flush() throws IOException {
                    outputStream.flush();
                }

                public final void close() throws IOException {
                    outputStream.close();
                }

                public final recordSSLTime getMin() {
                    return recordSSLTime.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("sink(");
                    sb.append(outputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }

    public static recordDnsTime getMax(final Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            final AnonymousClass4 r0 = new submit() {
                /* access modifiers changed from: protected */
                public final IOException setMin(@Nullable IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                /* access modifiers changed from: protected */
                public final void setMax() {
                    try {
                        r2.close();
                    } catch (Exception e) {
                        Logger logger = recordMonitorOfSndMsg.length;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                        sb.append(r2);
                        logger.log(level, sb.toString(), e);
                    } catch (AssertionError e2) {
                        if (recordMonitorOfSndMsg.setMax(e2)) {
                            Logger logger2 = recordMonitorOfSndMsg.length;
                            Level level2 = Level.WARNING;
                            StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
                            sb2.append(r2);
                            logger2.log(level2, sb2.toString(), e2);
                            return;
                        }
                        throw e2;
                    }
                }
            };
            final OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new recordDnsTime(new recordDnsTime() {
                    public final void setMin(submitLazy submitlazy, long j) throws IOException {
                        MonitorModel.getMax(submitlazy.setMax, 0, j);
                        while (j > 0) {
                            recordSSLTime.this.IsOverlapping();
                            recordStartConnAllTime recordstartconnalltime = submitlazy.setMin;
                            int min = (int) Math.min(j, (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin));
                            outputStream.write(recordstartconnalltime.getMax, recordstartconnalltime.setMin, min);
                            recordstartconnalltime.setMin += min;
                            long j2 = (long) min;
                            j -= j2;
                            submitlazy.setMax -= j2;
                            if (recordstartconnalltime.setMin == recordstartconnalltime.setMax) {
                                submitlazy.setMin = recordstartconnalltime.setMax();
                                getSimpleStatistical.setMax(recordstartconnalltime);
                            }
                        }
                    }

                    public final void flush() throws IOException {
                        outputStream.flush();
                    }

                    public final void close() throws IOException {
                        outputStream.close();
                    }

                    public final recordSSLTime getMin() {
                        return recordSSLTime.this;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("sink(");
                        sb.append(outputStream);
                        sb.append(")");
                        return sb.toString();
                    }
                }) {
                    final /* synthetic */ recordDnsTime length;

                    {
                        this.length = r2;
                    }

                    public final void setMin(submitLazy submitlazy, long j) throws IOException {
                        MonitorModel.getMax(submitlazy.setMax, 0, j);
                        while (true) {
                            long j2 = 0;
                            if (j > 0) {
                                recordStartConnAllTime recordstartconnalltime = submitlazy.setMin;
                                while (true) {
                                    if (j2 >= 65536) {
                                        break;
                                    }
                                    j2 += (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin);
                                    if (j2 >= j) {
                                        j2 = j;
                                        break;
                                    }
                                    recordstartconnalltime = recordstartconnalltime.toFloatRange;
                                }
                                submit.this.setMin();
                                try {
                                    this.length.setMin(submitlazy, j2);
                                    j -= j2;
                                    submit.this.getMax(true);
                                } catch (IOException e) {
                                    throw submit.this.getMax(e);
                                } catch (Throwable th) {
                                    submit.this.getMax(false);
                                    throw th;
                                }
                            } else {
                                return;
                            }
                        }
                    }

                    public final void flush() throws IOException {
                        submit.this.setMin();
                        try {
                            this.length.flush();
                            submit.this.getMax(true);
                        } catch (IOException e) {
                            throw submit.this.getMax(e);
                        } catch (Throwable th) {
                            submit.this.getMax(false);
                            throw th;
                        }
                    }

                    public final void close() throws IOException {
                        submit.this.setMin();
                        try {
                            this.length.close();
                            submit.this.getMax(true);
                        } catch (IOException e) {
                            throw submit.this.getMax(e);
                        } catch (Throwable th) {
                            submit.this.getMax(false);
                            throw th;
                        }
                    }

                    public final recordSSLTime getMin() {
                        return submit.this;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
                        sb.append(this.length);
                        sb.append(")");
                        return sb.toString();
                    }
                };
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static recordWsHsTime getMin(final InputStream inputStream) {
        final recordSSLTime recordssltime = new recordSSLTime();
        if (inputStream != null) {
            return new recordWsHsTime() {
                public final long a_(submitLazy submitlazy, long j) throws IOException {
                    if (j < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                    } else if (j == 0) {
                        return 0;
                    } else {
                        try {
                            recordSSLTime.this.IsOverlapping();
                            recordStartConnAllTime max = submitlazy.setMax(1);
                            int read = r0.read(max.getMax, max.setMax, (int) Math.min(j, (long) (8192 - max.setMax)));
                            if (read == -1) {
                                return -1;
                            }
                            max.setMax += read;
                            long j2 = (long) read;
                            submitlazy.setMax += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (recordMonitorOfSndMsg.setMax(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final void close() throws IOException {
                    r0.close();
                }

                public final recordSSLTime getMin() {
                    return recordSSLTime.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("source(");
                    sb.append(r0);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }

    public static recordWsHsTime setMin(File file) throws FileNotFoundException {
        if (file != null) {
            final FileInputStream fileInputStream = new FileInputStream(file);
            final recordSSLTime recordssltime = new recordSSLTime();
            return new recordWsHsTime() {
                public final long a_(submitLazy submitlazy, long j) throws IOException {
                    if (j < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                    } else if (j == 0) {
                        return 0;
                    } else {
                        try {
                            recordSSLTime.this.IsOverlapping();
                            recordStartConnAllTime max = submitlazy.setMax(1);
                            int read = fileInputStream.read(max.getMax, max.setMax, (int) Math.min(j, (long) (8192 - max.setMax)));
                            if (read == -1) {
                                return -1;
                            }
                            max.setMax += read;
                            long j2 = (long) read;
                            submitlazy.setMax += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (recordMonitorOfSndMsg.setMax(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final void close() throws IOException {
                    fileInputStream.close();
                }

                public final recordSSLTime getMin() {
                    return recordSSLTime.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("source(");
                    sb.append(fileInputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("file == null");
    }

    public static recordDnsTime getMax(File file) throws FileNotFoundException {
        if (file != null) {
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            final recordSSLTime recordssltime = new recordSSLTime();
            return new recordDnsTime() {
                public final void setMin(submitLazy submitlazy, long j) throws IOException {
                    MonitorModel.getMax(submitlazy.setMax, 0, j);
                    while (j > 0) {
                        recordSSLTime.this.IsOverlapping();
                        recordStartConnAllTime recordstartconnalltime = submitlazy.setMin;
                        int min = (int) Math.min(j, (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin));
                        outputStream.write(recordstartconnalltime.getMax, recordstartconnalltime.setMin, min);
                        recordstartconnalltime.setMin += min;
                        long j2 = (long) min;
                        j -= j2;
                        submitlazy.setMax -= j2;
                        if (recordstartconnalltime.setMin == recordstartconnalltime.setMax) {
                            submitlazy.setMin = recordstartconnalltime.setMax();
                            getSimpleStatistical.setMax(recordstartconnalltime);
                        }
                    }
                }

                public final void flush() throws IOException {
                    outputStream.flush();
                }

                public final void close() throws IOException {
                    outputStream.close();
                }

                public final recordSSLTime getMin() {
                    return recordSSLTime.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("sink(");
                    sb.append(outputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("file == null");
    }

    public static recordDnsTime getMin(File file) throws FileNotFoundException {
        if (file != null) {
            final FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            final recordSSLTime recordssltime = new recordSSLTime();
            return new recordDnsTime() {
                public final void setMin(submitLazy submitlazy, long j) throws IOException {
                    MonitorModel.getMax(submitlazy.setMax, 0, j);
                    while (j > 0) {
                        recordSSLTime.this.IsOverlapping();
                        recordStartConnAllTime recordstartconnalltime = submitlazy.setMin;
                        int min = (int) Math.min(j, (long) (recordstartconnalltime.setMax - recordstartconnalltime.setMin));
                        outputStream.write(recordstartconnalltime.getMax, recordstartconnalltime.setMin, min);
                        recordstartconnalltime.setMin += min;
                        long j2 = (long) min;
                        j -= j2;
                        submitlazy.setMax -= j2;
                        if (recordstartconnalltime.setMin == recordstartconnalltime.setMax) {
                            submitlazy.setMin = recordstartconnalltime.setMax();
                            getSimpleStatistical.setMax(recordstartconnalltime);
                        }
                    }
                }

                public final void flush() throws IOException {
                    outputStream.flush();
                }

                public final void close() throws IOException {
                    outputStream.close();
                }

                public final recordSSLTime getMin() {
                    return recordSSLTime.this;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("sink(");
                    sb.append(outputStream);
                    sb.append(")");
                    return sb.toString();
                }
            };
        }
        throw new IllegalArgumentException("file == null");
    }

    public static recordDnsTime getMin() {
        return new recordDnsTime() {
            public final void close() throws IOException {
            }

            public final void flush() throws IOException {
            }

            public final void setMin(submitLazy submitlazy, long j) throws IOException {
                submitlazy.isInside(j);
            }

            public final recordSSLTime getMin() {
                return recordSSLTime.setMax;
            }
        };
    }

    public static recordWsHsTime setMax(final Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            final AnonymousClass4 r0 = new submit() {
                /* access modifiers changed from: protected */
                public final IOException setMin(@Nullable IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                /* access modifiers changed from: protected */
                public final void setMax() {
                    try {
                        socket.close();
                    } catch (Exception e) {
                        Logger logger = recordMonitorOfSndMsg.length;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                        sb.append(socket);
                        logger.log(level, sb.toString(), e);
                    } catch (AssertionError e2) {
                        if (recordMonitorOfSndMsg.setMax(e2)) {
                            Logger logger2 = recordMonitorOfSndMsg.length;
                            Level level2 = Level.WARNING;
                            StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
                            sb2.append(socket);
                            logger2.log(level2, sb2.toString(), e2);
                            return;
                        }
                        throw e2;
                    }
                }
            };
            final InputStream inputStream = socket.getInputStream();
            if (inputStream != null) {
                return new recordWsHsTime(new recordWsHsTime() {
                    public final long a_(submitLazy submitlazy, long j) throws IOException {
                        if (j < 0) {
                            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                        } else if (j == 0) {
                            return 0;
                        } else {
                            try {
                                recordSSLTime.this.IsOverlapping();
                                recordStartConnAllTime max = submitlazy.setMax(1);
                                int read = fileInputStream.read(max.getMax, max.setMax, (int) Math.min(j, (long) (8192 - max.setMax)));
                                if (read == -1) {
                                    return -1;
                                }
                                max.setMax += read;
                                long j2 = (long) read;
                                submitlazy.setMax += j2;
                                return j2;
                            } catch (AssertionError e) {
                                if (recordMonitorOfSndMsg.setMax(e)) {
                                    throw new IOException(e);
                                }
                                throw e;
                            }
                        }
                    }

                    public final void close() throws IOException {
                        fileInputStream.close();
                    }

                    public final recordSSLTime getMin() {
                        return recordSSLTime.this;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("source(");
                        sb.append(fileInputStream);
                        sb.append(")");
                        return sb.toString();
                    }
                }) {
                    final /* synthetic */ recordWsHsTime length;

                    {
                        this.length = r2;
                    }

                    public final long a_(submitLazy submitlazy, long j) throws IOException {
                        submit.this.setMin();
                        try {
                            long a_ = this.length.a_(submitlazy, j);
                            submit.this.getMax(true);
                            return a_;
                        } catch (IOException e) {
                            throw submit.this.getMax(e);
                        } catch (Throwable th) {
                            submit.this.getMax(false);
                            throw th;
                        }
                    }

                    public final void close() throws IOException {
                        submit.this.setMin();
                        try {
                            this.length.close();
                            submit.this.getMax(true);
                        } catch (IOException e) {
                            throw submit.this.getMax(e);
                        } catch (Throwable th) {
                            submit.this.getMax(false);
                            throw th;
                        }
                    }

                    public final recordSSLTime getMin() {
                        return submit.this;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
                        sb.append(this.length);
                        sb.append(")");
                        return sb.toString();
                    }
                };
            }
            throw new IllegalArgumentException("in == null");
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    static boolean setMax(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
