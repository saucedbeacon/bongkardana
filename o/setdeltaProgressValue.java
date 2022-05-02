package o;

import io.reactivex.annotations.NonNull;

public final class setdeltaProgressValue extends setPeriodValue<removeStateDidChangeHandler> {
    private static final long serialVersionUID = -8219729196779211169L;

    public setdeltaProgressValue(removeStateDidChangeHandler removestatedidchangehandler) {
        super(removestatedidchangehandler);
    }

    /* access modifiers changed from: protected */
    public final void onDisposed(@NonNull removeStateDidChangeHandler removestatedidchangehandler) {
        try {
            removestatedidchangehandler.getMax();
        } catch (Throwable th) {
            throw utAvaiable.getMin(th);
        }
    }
}
