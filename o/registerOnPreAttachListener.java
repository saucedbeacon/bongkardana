package o;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

public final class registerOnPreAttachListener implements Provider {
    private final ComponentRegistrar getMin;

    public registerOnPreAttachListener(ComponentRegistrar componentRegistrar) {
        this.getMin = componentRegistrar;
    }

    public final Object get() {
        return ComponentRuntime.lambda$toProviders$1(this.getMin);
    }
}
