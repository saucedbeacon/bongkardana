package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

public abstract class getSGPluginManager<T, R> implements setSecondFloorView<T>, changeStyle<R> {
    protected int equals;
    protected getFmt getMax;
    protected boolean getMin;
    protected changeStyle<T> length;
    protected final setSecondFloorView<? super R> setMin;

    public getSGPluginManager(setSecondFloorView<? super R> setsecondfloorview) {
        this.setMin = setsecondfloorview;
    }

    public final void onSubscribe(getFmt getfmt) {
        if (SubscriptionHelper.validate(this.getMax, getfmt)) {
            this.getMax = getfmt;
            if (getfmt instanceof changeStyle) {
                this.length = (changeStyle) getfmt;
            }
            this.setMin.onSubscribe(this);
        }
    }

    public void onError(Throwable th) {
        if (this.getMin) {
            SecuritySignature.getMax(th);
            return;
        }
        this.getMin = true;
        this.setMin.onError(th);
    }

    /* access modifiers changed from: protected */
    public final void length(Throwable th) {
        registerNode.getMax(th);
        this.getMax.cancel();
        onError(th);
    }

    public void onComplete() {
        if (!this.getMin) {
            this.getMin = true;
            this.setMin.onComplete();
        }
    }

    /* access modifiers changed from: protected */
    public final int getMin(int i) {
        changeStyle<T> changestyle = this.length;
        if (changestyle == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = changestyle.requestFusion(i);
        if (requestFusion != 0) {
            this.equals = requestFusion;
        }
        return requestFusion;
    }

    public void request(long j) {
        this.getMax.request(j);
    }

    public void cancel() {
        this.getMax.cancel();
    }

    public boolean isEmpty() {
        return this.length.isEmpty();
    }

    public void clear() {
        this.length.clear();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
