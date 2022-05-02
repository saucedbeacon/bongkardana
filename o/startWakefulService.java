package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

public final class startWakefulService implements ComponentFactory {
    public static final startWakefulService setMin = new startWakefulService();

    public final Object create(ComponentContainer componentContainer) {
        return RemoteConfigRegistrar.lambda$getComponents$0(componentContainer);
    }
}
