package o;

import java.util.ArrayList;
import java.util.List;
import o.getAbsoluteUrlV2;

public class getAppCurrency extends setSpeed<List<getFileExtensionFromUrl>, List<getAbsoluteUrlV2>> {
    /* access modifiers changed from: protected */
    public List<getAbsoluteUrlV2> map(List<getFileExtensionFromUrl> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (getFileExtensionFromUrl next : list) {
            arrayList.add(new getAbsoluteUrlV2.getMin().setBindingId(next.bindingId).setCardIndexNo(next.cardIndexNo).setCardNoLength(next.cardNoLength).setEnableStatus(next.enableStatus).setHolderName(next.holderName).setMaskedCardNo(next.maskedCardNo).setInstId(next.instId).setInstName(next.instName).setInsLocalName(next.instLocalName).setPayMethod(next.payMethod).setPayOption(next.payOption).setExpiryMonth(next.expiryMonth).setExpiryYear(next.expiryYear).setDefaultCard(next.defaultCard).setPayWithoutCVV(next.payWithoutCVV).setCardScheme(next.cardScheme).build());
        }
        return arrayList;
    }
}
