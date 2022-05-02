package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class TinyAppFileUtils extends parseFailed<Boolean, Void> {
    private final isDynamicDelivery payAssetRepository;

    @Inject
    public TinyAppFileUtils(appxLoadFailed appxloadfailed, getScheme getscheme, isDynamicDelivery isdynamicdelivery) {
        super(appxloadfailed, getscheme);
        this.payAssetRepository = isdynamicdelivery;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.payAssetRepository.getEnableAddNewCard();
    }
}
