package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.AUNoticeDialog;

@Module
public class SplitBillHistoryModule {
    private final AUNoticeDialog.AnonymousClass1.getMax length;

    @Provides
    public AUNoticeDialog.AnonymousClass1.setMax setMax(AUNoticeDialog.OnClickPositiveListener onClickPositiveListener) {
        return onClickPositiveListener;
    }

    public SplitBillHistoryModule(AUNoticeDialog.AnonymousClass1.getMax getmax) {
        this.length = getmax;
    }

    @Provides
    public AUNoticeDialog.AnonymousClass1.getMax length() {
        return this.length;
    }
}
