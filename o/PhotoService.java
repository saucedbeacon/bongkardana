package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.sendmoney.model.PayOptionDTO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.PhotoContext;

public final class PhotoService extends setSpeed<getPowerCorrection, CloudConfig> {
    private final PhotoContext.AnonymousClass2 getMax;

    public final /* synthetic */ Object map(Object obj) {
        PayOptionDTO payOptionDTO;
        getPowerCorrection getpowercorrection = (getPowerCorrection) obj;
        ArrayList arrayList = null;
        if (getpowercorrection == null) {
            return null;
        }
        CloudConfig cloudConfig = new CloudConfig();
        stopBleScan payerMinAmount = getpowercorrection.getPayerMinAmount();
        cloudConfig.isInside = payerMinAmount != null ? new CurrencyAmountModel(payerMinAmount.getAmount(), payerMinAmount.getCurrency(), payerMinAmount.isPlaceholder()) : null;
        stopBleScan payerMaxAmount = getpowercorrection.getPayerMaxAmount();
        cloudConfig.toFloatRange = payerMaxAmount != null ? new CurrencyAmountModel(payerMaxAmount.getAmount(), payerMaxAmount.getCurrency(), payerMaxAmount.isPlaceholder()) : null;
        cloudConfig.toIntRange = getpowercorrection.getAmount();
        String currency = getpowercorrection.getCurrency();
        int i = 0;
        int length = currency != null ? currency.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1131089043, oncanceled);
            onCancelLoad.getMin(1131089043, oncanceled);
        }
        cloudConfig.equals = currency;
        String payeeUserId = getpowercorrection.getPayeeUserId();
        if (payeeUserId != null) {
            i = payeeUserId.length();
        }
        int max2 = dispatchOnCancelled.setMax(i);
        if (i != max2) {
            onCanceled oncanceled2 = new onCanceled(i, max2, 1);
            onCancelLoad.setMax(1562134075, oncanceled2);
            onCancelLoad.getMin(1562134075, oncanceled2);
        }
        cloudConfig.IsOverlapping = payeeUserId;
        cloudConfig.getMin = getpowercorrection.getPayeeMaskedPhoneNumber();
        cloudConfig.length = getpowercorrection.getPayeeMaskedNickname();
        List<getIdentifierByteCount> payOptions = getpowercorrection.getPayOptions();
        if (payOptions != null && !payOptions.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (getIdentifierByteCount next : payOptions) {
                if (next.isPayMethodFlag()) {
                    if (next != null) {
                        payOptionDTO = new PayOptionDTO();
                        payOptionDTO.setMin = next.getPayMethod();
                        stopBleScan payerMaxAmount2 = next.getPayerMaxAmount();
                        payOptionDTO.getMax = payerMaxAmount2 != null ? new CurrencyAmountModel(payerMaxAmount2.getAmount(), payerMaxAmount2.getCurrency(), payerMaxAmount2.isPlaceholder()) : null;
                        stopBleScan payerMinAmount2 = next.getPayerMinAmount();
                        payOptionDTO.length = payerMinAmount2 != null ? new CurrencyAmountModel(payerMinAmount2.getAmount(), payerMinAmount2.getCurrency(), payerMinAmount2.isPlaceholder()) : null;
                    } else {
                        payOptionDTO = null;
                    }
                    arrayList2.add(payOptionDTO);
                }
            }
            arrayList = arrayList2;
        }
        cloudConfig.setMax = arrayList;
        cloudConfig.setMin = getpowercorrection.getAvatarUrl();
        cloudConfig.getMax = getpowercorrection.getKyc().getLevel();
        return cloudConfig;
    }

    @Inject
    public PhotoService(PhotoContext.AnonymousClass2 r1) {
        this.getMax = r1;
    }
}
