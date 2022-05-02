package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.ToolUtils;
import o.getResourceId;

@Module
public class TncSummaryModules {
    private ToolUtils.length getMin;

    @PerActivity
    @Provides
    public ToolUtils.setMin getMax(getResourceId getresourceid) {
        return getresourceid;
    }

    public TncSummaryModules(ToolUtils.length length) {
        this.getMin = length;
    }

    @PerActivity
    @Provides
    public ToolUtils.length setMin() {
        return this.getMin;
    }
}
