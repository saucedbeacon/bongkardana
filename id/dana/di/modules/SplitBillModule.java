package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.AUNoticeDialog;
import o.setTitleTextSize;

@Module
public class SplitBillModule {
    private AUNoticeDialog.OnClickNegativeListener.setMax setMax;

    @PerActivity
    @Provides
    public AUNoticeDialog.OnClickNegativeListener.setMin getMin(setTitleTextSize settitletextsize) {
        return settitletextsize;
    }

    public SplitBillModule(AUNoticeDialog.OnClickNegativeListener.setMax setmax) {
        this.setMax = setmax;
    }

    @PerActivity
    @Provides
    public AUNoticeDialog.OnClickNegativeListener.setMax setMin() {
        return this.setMax;
    }
}
