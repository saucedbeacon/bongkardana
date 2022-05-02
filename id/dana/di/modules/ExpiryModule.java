package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.CombineContinuationsWorker;
import o.onExecuted;

@Module
public class ExpiryModule {
    private final onExecuted.length getMin;

    @PerActivity
    @Provides
    public onExecuted.getMin length(CombineContinuationsWorker combineContinuationsWorker) {
        return combineContinuationsWorker;
    }

    public ExpiryModule(onExecuted.length length) {
        this.getMin = length;
    }

    @PerActivity
    @Provides
    public onExecuted.length setMin() {
        return this.getMin;
    }
}
