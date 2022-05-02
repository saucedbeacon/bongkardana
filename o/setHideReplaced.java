package o;

import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.inject.Provider;

public final class setHideReplaced implements Provider {
    private final String setMax;

    public setHideReplaced(String str) {
        this.setMax = str;
    }

    public final Object get() {
        return ComponentDiscovery.instantiate(this.setMax);
    }
}
