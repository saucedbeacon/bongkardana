package o;

import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

public final class getFocusedView implements ComponentFactory {
    public static final getFocusedView setMin = new getFocusedView();

    public final Object create(ComponentContainer componentContainer) {
        return AbtRegistrar.lambda$getComponents$0(componentContainer);
    }
}
