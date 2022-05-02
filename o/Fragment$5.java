package o;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

public final class Fragment$5 implements ComponentFactory {
    private final Object setMax;

    public Fragment$5(Object obj) {
        this.setMax = obj;
    }

    public final Object create(ComponentContainer componentContainer) {
        return Component.lambda$intoSet$2(this.setMax, componentContainer);
    }
}
