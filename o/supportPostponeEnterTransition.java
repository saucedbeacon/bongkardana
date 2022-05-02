package o;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

public final class supportPostponeEnterTransition implements Provider {
    private final ComponentRegistrar getMin;

    public supportPostponeEnterTransition(ComponentRegistrar componentRegistrar) {
        this.getMin = componentRegistrar;
    }

    public final Object get() {
        return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.getMin);
    }
}
