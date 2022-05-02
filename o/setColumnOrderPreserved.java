package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

public final class setColumnOrderPreserved implements ComponentFactory {
    public static final setColumnOrderPreserved getMax = new setColumnOrderPreserved();

    public final Object create(ComponentContainer componentContainer) {
        return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
    }
}
