package id.dana.contract.payasset;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.fakeDragBy;
import o.pageLeft;

@Module
public class QueryPayMethodModule {
    private final fakeDragBy.getMin length;

    @PerActivity
    @Provides
    public fakeDragBy.length getMax(pageLeft pageleft) {
        return pageleft;
    }

    public QueryPayMethodModule(fakeDragBy.getMin getmin) {
        this.length = getmin;
    }

    @PerActivity
    @Provides
    public fakeDragBy.getMin length() {
        return this.length;
    }
}
