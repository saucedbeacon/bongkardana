package io.split.android.client.exceptions;

public class ChangeNumberExceptionWrapper extends Exception {
    private final long _changeNumber;
    private final Exception _delegate;

    public ChangeNumberExceptionWrapper(Exception exc, long j) {
        this._delegate = exc;
        this._changeNumber = j;
    }

    public Exception wrappedException() {
        return this._delegate;
    }

    public long changeNumber() {
        return this._changeNumber;
    }
}
