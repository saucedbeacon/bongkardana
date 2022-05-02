package o;

import com.google.firebase.components.OptionalProvider;
import com.google.firebase.inject.Provider;

public final class generateActivityResultKey implements Runnable {
    private final OptionalProvider getMax;
    private final Provider setMin;

    public generateActivityResultKey(OptionalProvider optionalProvider, Provider provider) {
        this.getMax = optionalProvider;
        this.setMin = provider;
    }

    public final void run() {
        this.getMax.set(this.setMin);
    }
}
