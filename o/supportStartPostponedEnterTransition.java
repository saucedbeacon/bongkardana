package o;

import com.google.firebase.components.OptionalProvider;
import com.google.firebase.inject.Provider;

public final class supportStartPostponedEnterTransition implements Provider {
    public static final supportStartPostponedEnterTransition getMax = new supportStartPostponedEnterTransition();

    public final Object get() {
        return OptionalProvider.lambda$static$1();
    }
}
