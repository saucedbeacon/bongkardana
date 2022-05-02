package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class isAnyConsumerBound extends parseFailed<Boolean, Void> {
    private final setDefaultFontSize featureConfigRepository;

    @Inject
    public isAnyConsumerBound(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        super(appxloadfailed, getscheme);
        this.featureConfigRepository = setdefaultfontsize;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.featureConfigRepository.isX2XVoucherEnable().zipWith(this.featureConfigRepository.isX2PEnable(), checkAvailability.setMin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$buildUseCaseObservable$0(Boolean bool, Boolean bool2) throws Exception {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }
}
