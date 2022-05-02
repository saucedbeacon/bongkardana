package o;

import com.google.firebase.components.OptionalProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final class dispatchFragmentsOnCreateView implements Deferred.DeferredHandler {
    public static final dispatchFragmentsOnCreateView getMax = new dispatchFragmentsOnCreateView();

    public final void handle(Provider provider) {
        OptionalProvider.lambda$static$0(provider);
    }
}
