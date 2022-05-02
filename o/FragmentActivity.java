package o;

import com.google.firebase.components.OptionalProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final class FragmentActivity implements Deferred.DeferredHandler {
    private final Deferred.DeferredHandler getMax;
    private final Deferred.DeferredHandler setMax;

    public FragmentActivity(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2) {
        this.getMax = deferredHandler;
        this.setMax = deferredHandler2;
    }

    public final void handle(Provider provider) {
        OptionalProvider.lambda$whenAvailable$2(this.getMax, this.setMax, provider);
    }
}
