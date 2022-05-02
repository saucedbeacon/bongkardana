package o;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

public final class isPostponed implements ComponentFactory {
    private final Object getMax;

    public isPostponed(Object obj) {
        this.getMax = obj;
    }

    public final Object create(ComponentContainer componentContainer) {
        return Component.lambda$of$0(this.getMax, componentContainer);
    }
}
