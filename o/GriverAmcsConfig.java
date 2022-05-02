package o;

import javax.inject.Inject;
import o.GriverHttpRequestAPIExtension;
import o.TitleBarRightButtonView;

public class GriverAmcsConfig extends parseFailed<Boolean, Void> {
    private final GriverHttpRequestAPIExtension.RequestContext changePhoneNumberH5EventRepository;

    @Inject
    public GriverAmcsConfig(appxLoadFailed appxloadfailed, getScheme getscheme, GriverHttpRequestAPIExtension.RequestContext requestContext) {
        super(appxloadfailed, getscheme);
        this.changePhoneNumberH5EventRepository = requestContext;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.changePhoneNumberH5EventRepository.getChangePhoneNumberH5Event();
    }
}
