package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.sendmoney.model.PayOptionDTO;
import java.util.List;

public final class setGridListener extends setSpeed<CloudConfig, onLoadProgress> {
    public final /* synthetic */ Object map(Object obj) {
        CloudConfig cloudConfig = (CloudConfig) obj;
        onLoadProgress onloadprogress = new onLoadProgress();
        List<PayOptionDTO> list = cloudConfig.setMax;
        CurrencyAmountModel currencyAmountModel = list.get(0).getMax;
        for (PayOptionDTO payOptionDTO : list) {
            CurrencyAmountModel currencyAmountModel2 = payOptionDTO.getMax;
            if (currencyAmountModel2.length(currencyAmountModel)) {
                currencyAmountModel = currencyAmountModel2;
            }
        }
        onloadprogress.getMin = currencyAmountModel;
        List<PayOptionDTO> list2 = cloudConfig.setMax;
        CurrencyAmountModel currencyAmountModel3 = list2.get(0).length;
        for (PayOptionDTO payOptionDTO2 : list2) {
            CurrencyAmountModel currencyAmountModel4 = payOptionDTO2.length;
            if (currencyAmountModel4.getMin(currencyAmountModel3)) {
                currencyAmountModel3 = currencyAmountModel4;
            }
        }
        CurrencyAmountModel currencyAmountModel5 = new CurrencyAmountModel("1");
        if (currencyAmountModel3.getMin(currencyAmountModel5)) {
            currencyAmountModel3 = currencyAmountModel5;
        }
        onloadprogress.setMax = currencyAmountModel3;
        return onloadprogress;
    }
}
