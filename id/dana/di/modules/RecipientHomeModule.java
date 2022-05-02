package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getModifiedTime;
import o.setRightText;

@Module
public class RecipientHomeModule {
    private getModifiedTime.getMax getMin;

    @PerActivity
    @Provides
    public getModifiedTime.getMin setMax(setRightText setrighttext) {
        return setrighttext;
    }

    public RecipientHomeModule(getModifiedTime.getMax getmax) {
        this.getMin = getmax;
    }

    @PerActivity
    @Provides
    public getModifiedTime.getMax getMin() {
        return this.getMin;
    }
}
