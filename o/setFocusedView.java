package o;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

public final class setFocusedView implements ComponentFactory {
    private final Object setMax;

    public setFocusedView(Object obj) {
        this.setMax = obj;
    }

    public final Object create(ComponentContainer componentContainer) {
        return Component.lambda$of$1(this.setMax, componentContainer);
    }
}
