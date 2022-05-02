package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

public abstract class getInterface<T, R> implements switchTheme<T>, changeStyle<R> {
    protected changeStyle<T> getMax;
    protected boolean getMin;
    protected final getbEva<? super R> setMax;
    protected getFmt setMin;
    protected int toIntRange;

    public getInterface(getbEva<? super R> getbeva) {
        this.setMax = getbeva;
    }

    public final void onSubscribe(getFmt getfmt) {
        if (SubscriptionHelper.validate(this.setMin, getfmt)) {
            this.setMin = getfmt;
            if (getfmt instanceof changeStyle) {
                this.getMax = (changeStyle) getfmt;
            }
            this.setMax.onSubscribe(this);
        }
    }

    public void onError(Throwable th) {
        if (this.getMin) {
            SecuritySignature.getMax(th);
            return;
        }
        this.getMin = true;
        this.setMax.onError(th);
    }

    /* access modifiers changed from: protected */
    public final void getMin(Throwable th) {
        registerNode.getMax(th);
        this.setMin.cancel();
        onError(th);
    }

    public void onComplete() {
        if (!this.getMin) {
            this.getMin = true;
            this.setMax.onComplete();
        }
    }

    /* access modifiers changed from: protected */
    public final int getMin(int i) {
        changeStyle<T> changestyle = this.getMax;
        if (changestyle == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = changestyle.requestFusion(i);
        if (requestFusion != 0) {
            this.toIntRange = requestFusion;
        }
        return requestFusion;
    }

    public void request(long j) {
        this.setMin.request(j);
    }

    public void cancel() {
        this.setMin.cancel();
    }

    public boolean isEmpty() {
        return this.getMax.isEmpty();
    }

    public void clear() {
        this.getMax.clear();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
