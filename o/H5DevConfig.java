package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class H5DevConfig extends parseFailed<setBooleanConfig, setMin> {
    private final resetBugMeSettings pocketRepository;

    @Inject
    public H5DevConfig(appxLoadFailed appxloadfailed, getScheme getscheme, resetBugMeSettings resetbugmesettings) {
        super(appxloadfailed, getscheme);
        this.pocketRepository = resetbugmesettings;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<setBooleanConfig> buildUseCaseObservable(setMin setmin) {
        return this.pocketRepository.getPocketNumUpdated(setmin.lastTimestamp);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public long lastTimestamp;

        public setMin(long j) {
            this.lastTimestamp = j;
        }

        public static setMin forGetPocketNumber(long j) {
            return new setMin(j);
        }
    }
}
