package com.iap.ac.android.common.task.async;

import androidx.annotation.Nullable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class IAPFuture<T> implements Future<T>, IAPAsyncCallback<T> {
    private Exception mError;
    private final String mName;
    private T mResult;
    private boolean mResultReceived;

    public boolean cancel(boolean z) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    private IAPFuture(String str) {
        this.mName = str;
    }

    public static <T> IAPFuture<T> newFuture(String str) {
        return new IAPFuture<>(str);
    }

    public synchronized boolean isDone() {
        return this.mResultReceived || this.mError != null;
    }

    public T get() throws InterruptedException, IAPExecutionException {
        try {
            return doGet((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Nullable
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, IAPExecutionException, TimeoutException {
        return doGet(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    @Nullable
    private synchronized T doGet(Long l) throws InterruptedException, IAPExecutionException, TimeoutException {
        if (this.mError != null) {
            throw new IAPExecutionException(this.mName, this.mError);
        } else if (!this.mResultReceived) {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                wait(l.longValue());
            }
            if (this.mError != null) {
                throw new IAPExecutionException(this.mName, this.mError);
            } else if (!this.mResultReceived) {
                throw new TimeoutException();
            } else if (!isCancelled()) {
                return this.mResult;
            } else {
                throw new CancellationException();
            }
        } else if (!isCancelled()) {
            return this.mResult;
        } else {
            throw new CancellationException();
        }
    }

    public synchronized void onSuccess(@Nullable T t) {
        this.mResultReceived = true;
        this.mResult = t;
        notifyAll();
    }

    public synchronized void onFailure(Exception exc) {
        this.mError = exc;
        notifyAll();
    }

    public static final class IAPExecutionException extends ExecutionException {
        public final Exception error;
        public final String name;

        public IAPExecutionException(String str, Exception exc) {
            this.name = str;
            this.error = exc;
        }
    }
}
