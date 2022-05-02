package org.mozilla.javascript;

import o.getPaddingDrawable;

public class ContinuationPending extends RuntimeException {
    private static final long serialVersionUID = 4956008116771118856L;
    private Object applicationState;
    private getPaddingDrawable continuationState;

    protected ContinuationPending(getPaddingDrawable getpaddingdrawable) {
        this.continuationState = getpaddingdrawable;
    }

    public Object getContinuation() {
        return this.continuationState;
    }

    public void setContinuation(getPaddingDrawable getpaddingdrawable) {
        this.continuationState = getpaddingdrawable;
    }

    /* access modifiers changed from: package-private */
    public getPaddingDrawable getContinuationState() {
        return this.continuationState;
    }

    public void setApplicationState(Object obj) {
        this.applicationState = obj;
    }

    public Object getApplicationState() {
        return this.applicationState;
    }
}
