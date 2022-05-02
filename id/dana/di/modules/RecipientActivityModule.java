package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.cancelUniqueWork;
import o.enqueueWorkRequests;

@Module
public class RecipientActivityModule {
    private final enqueueWorkRequests.setMax getMax;

    @PerActivity
    @Provides
    public enqueueWorkRequests.length getMax(cancelUniqueWork canceluniquework) {
        return canceluniquework;
    }

    public RecipientActivityModule(enqueueWorkRequests.setMax setmax) {
        this.getMax = setmax;
    }

    @PerActivity
    @Provides
    public enqueueWorkRequests.setMax length() {
        return this.getMax;
    }
}
