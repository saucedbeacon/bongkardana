package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onCommonConfigChanged extends parseFailed<Boolean, Void> {
    private final GriverHttpRequestAPIExtension h5EventRepository;

    @Inject
    public onCommonConfigChanged(appxLoadFailed appxloadfailed, getScheme getscheme, GriverHttpRequestAPIExtension griverHttpRequestAPIExtension) {
        super(appxloadfailed, getscheme);
        this.h5EventRepository = griverHttpRequestAPIExtension;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.h5EventRepository.getCheckoutH5Event();
    }
}
