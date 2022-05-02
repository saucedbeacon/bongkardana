package o;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

public final class prepareCallInternal implements Provider {
    private final Component getMax;
    private final ComponentRuntime length;

    public prepareCallInternal(ComponentRuntime componentRuntime, Component component) {
        this.length = componentRuntime;
        this.getMax = component;
    }

    public final Object get() {
        return this.length.lambda$discoverComponents$0(this.getMax);
    }
}
