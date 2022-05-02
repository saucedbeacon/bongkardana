package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class PrepareContextUitls extends parseFailed<List<getMonitorToken>, setMax> {
    private final GriverWhiteScreenStageMonitor recentRecipientRepository;

    @Inject
    public PrepareContextUitls(appxLoadFailed appxloadfailed, getScheme getscheme, GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        super(appxloadfailed, getscheme);
        this.recentRecipientRepository = griverWhiteScreenStageMonitor;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<getMonitorToken>> buildUseCaseObservable(setMax setmax) {
        return this.recentRecipientRepository.getSecureRecentRecipient(setmax.maxRecentRecipient, setmax.contactType, setmax.recentContactType);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public int contactType;
        /* access modifiers changed from: private */
        public int maxRecentRecipient;
        /* access modifiers changed from: private */
        public int recentContactType;

        private setMax(int i, int i2, int i3) {
            this.maxRecentRecipient = i;
            this.contactType = i2;
            this.recentContactType = i3;
        }

        public static setMax forGetRecentRecipient(int i, int i2, int i3) {
            return new setMax(i, i2, i3);
        }
    }
}
