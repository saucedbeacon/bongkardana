package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.execute;
import o.getTags;

@Module
public class PromoCenterModule {
    private execute.setMax getMin;

    @Provides
    public execute.getMin length(getTags gettags) {
        return gettags;
    }

    public PromoCenterModule(execute.setMax setmax) {
        this.getMin = setmax;
    }

    @Provides
    public execute.setMax getMin() {
        return this.getMin;
    }
}
