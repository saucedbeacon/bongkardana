package o;

import javax.inject.Inject;
import o.CommonUtil;
import o.TitleBarRightButtonView;

public class stringify extends parseFailed<CommonUtil.AnonymousClass1, Void> {
    private final dynamicProxy playStoreReviewRepository;

    @Inject
    public stringify(appxLoadFailed appxloadfailed, getScheme getscheme, dynamicProxy dynamicproxy) {
        super(appxloadfailed, getscheme);
        this.playStoreReviewRepository = dynamicproxy;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<CommonUtil.AnonymousClass1> buildUseCaseObservable(Void voidR) {
        return this.playStoreReviewRepository.isNeedToShowPlayStoreReview();
    }
}
