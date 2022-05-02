package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class refreshAppPreDownloadConfig extends parseFailed<Boolean, Void> {
    private final setFireMoment qrPayRepository;

    @Inject
    public refreshAppPreDownloadConfig(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
        super(appxloadfailed, getscheme);
        this.qrPayRepository = setfiremoment;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.qrPayRepository.initOfflinePay();
    }
}
