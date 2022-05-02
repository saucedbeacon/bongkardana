package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.perf.FirebasePerfRegistrar;

public final class onTabChanged implements ComponentFactory {
    public static final onTabChanged getMin = new onTabChanged();

    public final Object create(ComponentContainer componentContainer) {
        return FirebasePerfRegistrar.providesFirebasePerformance(componentContainer);
    }
}
