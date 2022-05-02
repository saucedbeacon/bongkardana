package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.FalconFacade;
import o.cutImageKeepRatio_new;
import o.makeTakenPicturePath;
import o.setIsUseNewMethod;

@Module
public class SendMoneyConfirmationModule {
    private makeTakenPicturePath.setMin length;
    private cutImageKeepRatio_new.setMax setMin;

    @PerActivity
    @Provides
    public makeTakenPicturePath.setMax length(FalconFacade.FalconInterface falconInterface) {
        return falconInterface;
    }

    @PerActivity
    @Provides
    public cutImageKeepRatio_new.getMax setMin(setIsUseNewMethod setisusenewmethod) {
        return setisusenewmethod;
    }

    public SendMoneyConfirmationModule(makeTakenPicturePath.setMin setmin, cutImageKeepRatio_new.setMax setmax) {
        this.length = setmin;
        this.setMin = setmax;
    }

    @PerActivity
    @Provides
    public makeTakenPicturePath.setMin setMin() {
        return this.length;
    }

    @PerActivity
    @Provides
    public cutImageKeepRatio_new.setMax getMax() {
        return this.setMin;
    }
}
