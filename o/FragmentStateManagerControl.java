package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;

public final class FragmentStateManagerControl implements ComponentFactory {
    public static final FragmentStateManagerControl length = new FragmentStateManagerControl();

    public final Object create(ComponentContainer componentContainer) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
    }
}
