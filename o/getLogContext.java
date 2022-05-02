package o;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import o.InvalidHandshakeException;

public final class getLogContext<T> implements initLater<T> {
    @GuardedBy("this")
    private boolean equals;
    @GuardedBy("this")
    @Nullable
    private checkAlloc getMax;
    @Nullable
    private final Object[] getMin;
    private volatile boolean length;
    @GuardedBy("this")
    @Nullable
    private Throwable setMax;
    private final getInnerTraceLogger<T, ?> setMin;

    public getLogContext(getInnerTraceLogger<T, ?> getinnertracelogger, @Nullable Object[] objArr) {
        this.setMin = getinnertracelogger;
        this.getMin = objArr;
    }

    public final void setMin(final initToolsProcessIfNeeded<T> inittoolsprocessifneeded) {
        checkAlloc checkalloc;
        Throwable th;
        ProcessInfoImpl.getMin(inittoolsprocessifneeded, "callback == null");
        synchronized (this) {
            if (!this.equals) {
                this.equals = true;
                checkalloc = this.getMax;
                th = this.setMax;
                if (checkalloc == null && th == null) {
                    try {
                        checkAlloc max = setMax();
                        this.getMax = max;
                        checkalloc = max;
                    } catch (Throwable th2) {
                        th = th2;
                        ProcessInfoImpl.getMax(th);
                        this.setMax = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            inittoolsprocessifneeded.setMax(this, th);
            return;
        }
        if (this.length) {
            checkalloc.setMax();
        }
        FirebasePerfOkHttpClient.enqueue(checkalloc, new getRole() {
            public final void onResponse(checkAlloc checkalloc, InvalidHandshakeException invalidHandshakeException) {
                try {
                    try {
                        inittoolsprocessifneeded.getMin(getLogContext.this.length(invalidHandshakeException));
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }

            public final void onFailure(checkAlloc checkalloc, IOException iOException) {
                try {
                    inittoolsprocessifneeded.setMax(getLogContext.this, iOException);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public final getAppenderManager<T> getMax() throws IOException {
        checkAlloc checkalloc;
        synchronized (this) {
            if (!this.equals) {
                this.equals = true;
                if (this.setMax == null) {
                    checkalloc = this.getMax;
                    if (checkalloc == null) {
                        try {
                            checkalloc = setMax();
                            this.getMax = checkalloc;
                        } catch (IOException | Error | RuntimeException e) {
                            ProcessInfoImpl.getMax(e);
                            this.setMax = e;
                            throw e;
                        }
                    }
                } else if (this.setMax instanceof IOException) {
                    throw ((IOException) this.setMax);
                } else if (this.setMax instanceof RuntimeException) {
                    throw ((RuntimeException) this.setMax);
                } else {
                    throw ((Error) this.setMax);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.length) {
            checkalloc.setMax();
        }
        return length(FirebasePerfOkHttpClient.execute(checkalloc));
    }

    private checkAlloc setMax() throws IOException {
        checkAlloc min = this.setMin.getMin(this.getMin);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final void length() {
        checkAlloc checkalloc;
        this.length = true;
        synchronized (this) {
            checkalloc = this.getMax;
        }
        if (checkalloc != null) {
            checkalloc.setMax();
        }
    }

    public final boolean getMin() {
        boolean z = true;
        if (this.length) {
            return true;
        }
        synchronized (this) {
            if (this.getMax == null || !this.getMax.getMax()) {
                z = false;
            }
        }
        return z;
    }

    static final class getMax extends NotSendableException {
        private final long setMax;
        private final translateRegularFrame setMin;

        getMax(translateRegularFrame translateregularframe, long j) {
            this.setMin = translateregularframe;
            this.setMax = j;
        }

        public final translateRegularFrame getMin() {
            return this.setMin;
        }

        public final long setMax() {
            return this.setMax;
        }

        public final schedule getMax() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    static final class getMin extends NotSendableException {
        private final NotSendableException getMax;
        IOException getMin;

        getMin(NotSendableException notSendableException) {
            this.getMax = notSendableException;
        }

        public final translateRegularFrame getMin() {
            return this.getMax.getMin();
        }

        public final long setMax() {
            return this.getMax.setMax();
        }

        public final schedule getMax() {
            return recordMonitorOfSndMsg.setMin((recordWsHsTime) new DataflowMonitorModel(this.getMax.getMax()) {
                public final long a_(submitLazy submitlazy, long j) throws IOException {
                    try {
                        return super.a_(submitlazy, j);
                    } catch (IOException e) {
                        getMin.this.getMin = e;
                        throw e;
                    }
                }
            });
        }

        public final void close() {
            this.getMax.close();
        }
    }

    /* access modifiers changed from: package-private */
    public final getAppenderManager<T> length(InvalidHandshakeException invalidHandshakeException) throws IOException {
        NotSendableException notSendableException = invalidHandshakeException.toFloatRange;
        InvalidHandshakeException.getMin getmin = new InvalidHandshakeException.getMin(invalidHandshakeException);
        getmin.toIntRange = new getMax(notSendableException.getMin(), notSendableException.setMax());
        InvalidHandshakeException length2 = getmin.length();
        int i = length2.getMax;
        if (i < 200 || i >= 300) {
            try {
                return getAppenderManager.setMin(ProcessInfoImpl.setMin(notSendableException), length2);
            } finally {
                notSendableException.close();
            }
        } else if (i == 204 || i == 205) {
            notSendableException.close();
            return getAppenderManager.getMax(null, length2);
        } else {
            getMin getmin2 = new getMin(notSendableException);
            try {
                return getAppenderManager.getMax(this.setMin.setMax.getMax(getmin2), length2);
            } catch (RuntimeException e) {
                if (getmin2.getMin != null) {
                    throw getmin2.getMin;
                }
                throw e;
            }
        }
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new getLogContext(this.setMin, this.getMin);
    }

    public final /* synthetic */ initLater setMin() {
        return new getLogContext(this.setMin, this.getMin);
    }
}
