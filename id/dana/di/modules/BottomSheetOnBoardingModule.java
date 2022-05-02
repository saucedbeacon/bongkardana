package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getSelectedIndex;
import o.setOnOptionPickListener;

@Module
public class BottomSheetOnBoardingModule {
    private getSelectedIndex.setMax length;

    @PerActivity
    @Provides
    public getSelectedIndex.length getMax(setOnOptionPickListener setonoptionpicklistener) {
        return setonoptionpicklistener;
    }

    public BottomSheetOnBoardingModule(getSelectedIndex.setMax setmax) {
        this.length = setmax;
    }

    @PerActivity
    @Provides
    public getSelectedIndex.setMax getMin() {
        return this.length;
    }
}
