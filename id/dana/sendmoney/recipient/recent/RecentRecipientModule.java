package id.dana.sendmoney.recipient.recent;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.setIsPicCurrentlyTaked;
import o.setMediaId;

@Module
public class RecentRecipientModule {
    private final setMediaId.getMin getMin;

    @PerActivity
    @Provides
    public setMediaId.setMax setMax(setIsPicCurrentlyTaked setispiccurrentlytaked) {
        return setispiccurrentlytaked;
    }

    public RecentRecipientModule(setMediaId.getMin getmin) {
        this.getMin = getmin;
    }

    @PerActivity
    @Provides
    public setMediaId.getMin setMax() {
        return this.getMin;
    }
}
