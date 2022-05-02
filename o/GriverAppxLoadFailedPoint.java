package o;

import id.dana.domain.SynchronizedUseCaseException;

public abstract class GriverAppxLoadFailedPoint<T, P> {
    private static final long MAX_EXECUTE_TIME = 100;

    /* access modifiers changed from: protected */
    public abstract T buildUseCaseObservable(P p) throws SynchronizedUseCaseException;

    public T execute() throws SynchronizedUseCaseException {
        return execute((Object) null);
    }

    public synchronized T execute(P p) throws SynchronizedUseCaseException {
        try {
        } catch (Exception e) {
            throw e;
        }
        return buildUseCaseObservable(p);
    }
}
