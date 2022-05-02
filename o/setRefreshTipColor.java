package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;

public abstract class setRefreshTipColor<T, R> implements GriverProgressBar<T>, setRefreshTips<R> {
    protected int getMax;
    protected final GriverProgressBar<? super R> getMin;
    protected setRefreshTips<T> length;
    protected GriverProgressBar.UpdateRunnable setMax;
    protected boolean setMin;

    public setRefreshTipColor(GriverProgressBar<? super R> griverProgressBar) {
        this.getMin = griverProgressBar;
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (DisposableHelper.validate(this.setMax, updateRunnable)) {
            this.setMax = updateRunnable;
            if (updateRunnable instanceof setRefreshTips) {
                this.length = (setRefreshTips) updateRunnable;
            }
            this.getMin.onSubscribe(this);
        }
    }

    public void onError(Throwable th) {
        if (this.setMin) {
            SecuritySignature.getMax(th);
            return;
        }
        this.setMin = true;
        this.getMin.onError(th);
    }

    /* access modifiers changed from: protected */
    public final void setMax(Throwable th) {
        registerNode.getMax(th);
        this.setMax.dispose();
        onError(th);
    }

    public void onComplete() {
        if (!this.setMin) {
            this.setMin = true;
            this.getMin.onComplete();
        }
    }

    /* access modifiers changed from: protected */
    public final int setMax(int i) {
        setRefreshTips<T> setrefreshtips = this.length;
        if (setrefreshtips == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = setrefreshtips.requestFusion(i);
        if (requestFusion != 0) {
            this.getMax = requestFusion;
        }
        return requestFusion;
    }

    public void dispose() {
        this.setMax.dispose();
    }

    public boolean isDisposed() {
        return this.setMax.isDisposed();
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
