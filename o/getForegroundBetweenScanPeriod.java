package o;

import javax.inject.Inject;
import o.GriverAppXInterceptor;
import o.TitleBarRightButtonView;

public class getForegroundBetweenScanPeriod extends parseFailed<Integer, Void> {
    private final GriverAppXInterceptor.AnonymousClass1 promotionRepository;

    @Inject
    public getForegroundBetweenScanPeriod(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAppXInterceptor.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.promotionRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Integer> buildUseCaseObservable(Void voidR) {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Integer> freeTransferCount = this.promotionRepository.getFreeTransferCount("BANK_TRANSFER");
        if (freeTransferCount instanceof getSecondFloorView) {
            return ((getSecondFloorView) freeTransferCount).setMax();
        }
        setTitleLoading settitleloading = new setTitleLoading(freeTransferCount);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
    }
}
