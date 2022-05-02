package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class savePresetConfiguration extends parseFailed<List<ErrorPageUtils>, setMin> {
    private final GriverWhiteScreenStageMonitor recentRecipientRepository;

    @Inject
    public savePresetConfiguration(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        super(appxloadfailed, getscheme);
        this.recentRecipientRepository = griverWhiteScreenStageMonitor;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<ErrorPageUtils>> buildUseCaseObservable(setMin setmin) {
        return this.recentRecipientRepository.getRecentBank(setmin.filter);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public String filter;

        public setMin(String str) {
            this.filter = str;
        }

        public static setMin forSaveRecentBank(String str) {
            return new setMin(str);
        }
    }
}
