package o;

import com.google.firebase.components.LazySet;
import com.google.firebase.inject.Provider;

public final class supportFinishAfterTransition implements Runnable {
    private final LazySet getMax;
    private final Provider setMin;

    public supportFinishAfterTransition(LazySet lazySet, Provider provider) {
        this.getMax = lazySet;
        this.setMin = provider;
    }

    public final void run() {
        this.getMax.add(this.setMin);
    }
}
