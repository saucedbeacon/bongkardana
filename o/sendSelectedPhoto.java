package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.sendmoney.model.CouponPayMethodInfoModel;
import javax.inject.Inject;
import o.PhotoContext;

public final class sendSelectedPhoto extends setSpeed<getMatchingBeaconTypeCodeStartOffset, CouponPayMethodInfoModel> {
    private final PhotoContext.AnonymousClass2 setMin;

    public final /* synthetic */ Object map(Object obj) {
        return length((getMatchingBeaconTypeCodeStartOffset) obj);
    }

    @Inject
    public sendSelectedPhoto(PhotoContext.AnonymousClass2 r1) {
        this.setMin = r1;
    }

    protected static CouponPayMethodInfoModel length(getMatchingBeaconTypeCodeStartOffset getmatchingbeacontypecodestartoffset) {
        CurrencyAmountModel currencyAmountModel = null;
        if (getmatchingbeacontypecodestartoffset == null) {
            return null;
        }
        CouponPayMethodInfoModel couponPayMethodInfoModel = new CouponPayMethodInfoModel();
        couponPayMethodInfoModel.getMin = getmatchingbeacontypecodestartoffset.getPayMethod();
        couponPayMethodInfoModel.setMax = getmatchingbeacontypecodestartoffset.getCardBin();
        couponPayMethodInfoModel.setMin = getmatchingbeacontypecodestartoffset.isRecommended();
        stopBleScan recommendedAmount = getmatchingbeacontypecodestartoffset.getRecommendedAmount();
        if (recommendedAmount != null) {
            currencyAmountModel = new CurrencyAmountModel(recommendedAmount.getAmount(), recommendedAmount.getCurrency(), recommendedAmount.isPlaceholder());
        }
        couponPayMethodInfoModel.getMax = currencyAmountModel;
        couponPayMethodInfoModel.length = getmatchingbeacontypecodestartoffset.isEligible();
        int priority = getmatchingbeacontypecodestartoffset.getPriority();
        int max = dispatchOnCancelled.setMax(priority);
        if (priority != max) {
            onCanceled oncanceled = new onCanceled(priority, max, 1);
            onCancelLoad.setMax(-196864513, oncanceled);
            onCancelLoad.getMin(-196864513, oncanceled);
        }
        couponPayMethodInfoModel.equals = priority;
        return couponPayMethodInfoModel;
    }
}
