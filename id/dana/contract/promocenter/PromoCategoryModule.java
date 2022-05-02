package id.dana.contract.promocenter;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.BackoffPolicy;
import o.DirectExecutor;

@Module
public class PromoCategoryModule {
    private final BackoffPolicy.setMax setMin;

    @PerActivity
    @Provides
    public BackoffPolicy.length getMax(DirectExecutor directExecutor) {
        return directExecutor;
    }

    public PromoCategoryModule(BackoffPolicy.setMax setmax) {
        this.setMin = setmax;
    }

    @PerActivity
    @Provides
    public BackoffPolicy.setMax length() {
        return this.setMin;
    }
}
