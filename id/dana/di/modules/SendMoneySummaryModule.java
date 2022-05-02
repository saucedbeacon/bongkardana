package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getPhotoPreview;
import o.setProxy;

@Module
public class SendMoneySummaryModule {
    private final setProxy.setMax setMin;

    @PerActivity
    @Provides
    public setProxy.length setMax(getPhotoPreview getphotopreview) {
        return getphotopreview;
    }

    public SendMoneySummaryModule(setProxy.setMax setmax) {
        this.setMin = setmax;
    }

    @PerActivity
    @Provides
    public setProxy.setMax getMin() {
        return this.setMin;
    }
}
