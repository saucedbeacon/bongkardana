package o;

import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class putCount {
    static final Logger length = Logger.getLogger(putCount.class.getName());

    private putCount() {
    }

    public static put getMax(safeSizeOf safesizeof) {
        return new createCount(safesizeof);
    }

    public static resize getMax(entryRemoved entryremoved) {
        return new snapshot(entryremoved);
    }

    static boolean setMin(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static entryRemoved setMin(final Socket socket) {
        if (socket != null) {
            final AnonymousClass5 r0 = new remove() {
                /* access modifiers changed from: protected */
                public final IOException getMax(IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                /* access modifiers changed from: protected */
                public final void getMax() {
                    try {
                        socket.close();
                    } catch (Exception e) {
                        Logger logger = putCount.length;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                        sb.append(socket);
                        logger.log(level, sb.toString(), e);
                    } catch (AssertionError e2) {
                        if (putCount.setMin(e2)) {
                            Logger logger2 = putCount.length;
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
            final OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new entryRemoved(new entryRemoved() {
                    public final void setMax(maxSize maxsize, long j) {
                        setPaddingLeft.getMax(maxsize.setMax, 0, j);
                        while (j > 0) {
                            r0.isInside();
                            fillInStackTrace fillinstacktrace = maxsize.length;
                            int min = (int) Math.min(j, (long) (fillinstacktrace.setMin - fillinstacktrace.getMin));
                            outputStream.write(fillinstacktrace.setMax, fillinstacktrace.getMin, min);
                            fillinstacktrace.getMin += min;
                            long j2 = (long) min;
                            j -= j2;
                            maxsize.setMax -= j2;
                            if (fillinstacktrace.getMin == fillinstacktrace.setMin) {
                                maxsize.length = fillinstacktrace.setMin();
                                Flow.setMin(fillinstacktrace);
                            }
                        }
                    }

                    public final void flush() {
                        outputStream.flush();
                    }

                    public final void close() {
                        outputStream.close();
                    }

                    public final loadParameters setMin() {
                        return r0;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("sink(");
                        sb.append(outputStream);
                        sb.append(")");
                        return sb.toString();
                    }
                }) {
                    final /* synthetic */ entryRemoved getMin;

                    {
                        this.getMin = r2;
                    }

                    public final void setMax(maxSize maxsize, long j) {
                        setPaddingLeft.getMax(maxsize.setMax, 0, j);
                        while (true) {
                            long j2 = 0;
                            if (j > 0) {
                                while (true) {
                                    if (j2 >= 65536) {
                                        break;
                                    }
                                    j2 += (long) (maxsize.length.setMin - maxsize.length.getMin);
                                    if (j2 >= j) {
                                        j2 = j;
                                        break;
                                    }
                                }
                                remove.this.getMin();
                                try {
                                    this.getMin.setMax(maxsize, j2);
                                    j -= j2;
                                    remove.this.setMax(true);
                                } catch (IOException e) {
                                    throw remove.this.length(e);
                                } catch (Throwable th) {
                                    remove.this.setMax(false);
                                    throw th;
                                }
                            } else {
                                return;
                            }
                        }
                    }

                    public final void flush() {
                        remove.this.getMin();
                        try {
                            this.getMin.flush();
                            remove.this.setMax(true);
                        } catch (IOException e) {
                            throw remove.this.length(e);
                        } catch (Throwable th) {
                            remove.this.setMax(false);
                            throw th;
                        }
                    }

                    public final void close() {
                        remove.this.getMin();
                        try {
                            this.getMin.close();
                            remove.this.setMax(true);
                        } catch (IOException e) {
                            throw remove.this.length(e);
                        } catch (Throwable th) {
                            remove.this.setMax(false);
                            throw th;
                        }
                    }

                    public final loadParameters setMin() {
                        return remove.this;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
                        sb.append(this.getMin);
                        sb.append(")");
                        return sb.toString();
                    }
                };
            }
            throw new IllegalArgumentException("out == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static safeSizeOf setMax(final Socket socket) {
        if (socket != null) {
            final AnonymousClass5 r0 = new remove() {
                /* access modifiers changed from: protected */
                public final IOException getMax(IOException iOException) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
                    if (iOException != null) {
                        socketTimeoutException.initCause(iOException);
                    }
                    return socketTimeoutException;
                }

                /* access modifiers changed from: protected */
                public final void getMax() {
                    try {
                        socket.close();
                    } catch (Exception e) {
                        Logger logger = putCount.length;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                        sb.append(socket);
                        logger.log(level, sb.toString(), e);
                    } catch (AssertionError e2) {
                        if (putCount.setMin(e2)) {
                            Logger logger2 = putCount.length;
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
                return new safeSizeOf(new safeSizeOf() {
                    public final long length(maxSize maxsize, long j) {
                        if (j < 0) {
                            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                        } else if (j == 0) {
                            return 0;
                        } else {
                            try {
                                r0.isInside();
                                fillInStackTrace floatRange = maxsize.toFloatRange(1);
                                int read = inputStream.read(floatRange.setMax, floatRange.setMin, (int) Math.min(j, (long) (8192 - floatRange.setMin)));
                                if (read == -1) {
                                    return -1;
                                }
                                floatRange.setMin += read;
                                long j2 = (long) read;
                                maxsize.setMax += j2;
                                return j2;
                            } catch (AssertionError e) {
                                if (putCount.setMin(e)) {
                                    throw new IOException(e);
                                }
                                throw e;
                            }
                        }
                    }

                    public final void close() {
                        inputStream.close();
                    }

                    public final loadParameters setMin() {
                        return r0;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("source(");
                        sb.append(inputStream);
                        sb.append(")");
                        return sb.toString();
                    }
                }) {
                    final /* synthetic */ safeSizeOf length;

                    {
                        this.length = r2;
                    }

                    public final long length(maxSize maxsize, long j) {
                        remove.this.getMin();
                        try {
                            long length2 = this.length.length(maxsize, j);
                            remove.this.setMax(true);
                            return length2;
                        } catch (IOException e) {
                            throw remove.this.length(e);
                        } catch (Throwable th) {
                            remove.this.setMax(false);
                            throw th;
                        }
                    }

                    public final void close() {
                        try {
                            this.length.close();
                            remove.this.setMax(true);
                        } catch (IOException e) {
                            throw remove.this.length(e);
                        } catch (Throwable th) {
                            remove.this.setMax(false);
                            throw th;
                        }
                    }

                    public final loadParameters setMin() {
                        return remove.this;
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
        }
        throw new IllegalArgumentException("socket == null");
    }
}
