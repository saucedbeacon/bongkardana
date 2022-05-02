package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import o.FragmentActivity;
import o.dispatchFragmentsOnCreateView;
import o.supportStartPostponedEnterTransition;

public class OptionalProvider<T> implements Provider<T>, Deferred<T> {
    private static final Provider<Object> EMPTY_PROVIDER = supportStartPostponedEnterTransition.getMax;
    private static final Deferred.DeferredHandler<Object> NOOP_HANDLER = dispatchFragmentsOnCreateView.getMax;
    private volatile Provider<T> delegate;
    @GuardedBy("this")
    private Deferred.DeferredHandler<T> handler;

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Provider provider) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$1() {
        return null;
    }

    private OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.handler = deferredHandler;
        this.delegate = provider;
    }

    static <T> OptionalProvider<T> empty() {
        return new OptionalProvider<>(NOOP_HANDLER, EMPTY_PROVIDER);
    }

    static <T> OptionalProvider<T> of(Provider<T> provider) {
        return new OptionalProvider<>((Deferred.DeferredHandler) null, provider);
    }

    public T get() {
        return this.delegate.get();
    }

    /* access modifiers changed from: package-private */
    public void set(Provider<T> provider) {
        Deferred.DeferredHandler<T> deferredHandler;
        if (this.delegate == EMPTY_PROVIDER) {
            synchronized (this) {
                deferredHandler = this.handler;
                this.handler = null;
                this.delegate = provider;
            }
            deferredHandler.handle(provider);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    public void whenAvailable(@NonNull Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2 = this.delegate;
        if (provider2 != EMPTY_PROVIDER) {
            deferredHandler.handle(provider2);
            return;
        }
        Provider<T> provider3 = null;
        synchronized (this) {
            provider = this.delegate;
            if (provider != EMPTY_PROVIDER) {
                provider3 = provider;
            } else {
                this.handler = new FragmentActivity(this.handler, deferredHandler);
            }
        }
        if (provider3 != null) {
            deferredHandler.handle(provider);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$whenAvailable$2(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }
}
