package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class uploadMonitorEvent extends parseFailed<Boolean, Void> {
    private final setFireMoment qrPayRepository;

    @Inject
    public uploadMonitorEvent(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
        super(appxloadfailed, getscheme);
        this.qrPayRepository = setfiremoment;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.qrPayRepository.restart();
    }
}
