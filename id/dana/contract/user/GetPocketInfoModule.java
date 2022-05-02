package id.dana.contract.user;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.LayoutMode;
import o.getDialogLayout;

@Module
public class GetPocketInfoModule {
    private final getDialogLayout.getMax getMin;

    @PerActivity
    @Provides
    public getDialogLayout.length getMax(LayoutMode layoutMode) {
        return layoutMode;
    }

    public GetPocketInfoModule(getDialogLayout.getMax getmax) {
        this.getMin = getmax;
    }

    @PerActivity
    @Provides
    public getDialogLayout.getMax length() {
        return this.getMin;
    }
}
