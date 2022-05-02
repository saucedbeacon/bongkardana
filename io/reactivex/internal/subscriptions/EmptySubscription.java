package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import o.changeStyle;
import o.getbEva;

public enum EmptySubscription implements changeStyle<Object> {
    INSTANCE;

    public final void cancel() {
    }

    public final void clear() {
    }

    public final boolean isEmpty() {
        return true;
    }

    @Nullable
    public final Object poll() {
        return null;
    }

    public final int requestFusion(int i) {
        return i & 2;
    }

    public final String toString() {
        return "EmptySubscription";
    }

    public final void request(long j) {
        SubscriptionHelper.validate(j);
    }

    public static void error(Throwable th, getbEva<?> getbeva) {
        getbeva.onSubscribe(INSTANCE);
        getbeva.onError(th);
    }

    public static void complete(getbEva<?> getbeva) {
        getbeva.onSubscribe(INSTANCE);
        getbeva.onComplete();
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
