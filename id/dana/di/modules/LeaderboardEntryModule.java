package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.APTakePictureOption;
import o.getDataType;

@Module
public class LeaderboardEntryModule {
    private getDataType.getMax setMax;

    @Provides
    public getDataType.setMax getMax(APTakePictureOption aPTakePictureOption) {
        return aPTakePictureOption;
    }

    public LeaderboardEntryModule(getDataType.getMax getmax) {
        this.setMax = getmax;
    }

    @Provides
    public getDataType.getMax setMax() {
        return this.setMax;
    }
}
