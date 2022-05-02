package id.dana.contract.inbox;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.restoreState;
import o.setPrimaryItem;

@Module
public class UnreadInboxModule {
    private final restoreState.getMax length;

    @PerActivity
    @Provides
    public restoreState.length setMin(setPrimaryItem setprimaryitem) {
        return setprimaryitem;
    }

    public UnreadInboxModule(restoreState.getMax getmax) {
        this.length = getmax;
    }

    @PerActivity
    @Provides
    public restoreState.getMax setMin() {
        return this.length;
    }
}
