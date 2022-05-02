package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.splitbill.model.PayerModel;
import id.dana.splitbill.model.SplitBillPayerModel;
import java.util.ArrayList;
import java.util.List;

public class IconfontInfo extends setSpeed<List<SplitBillPayerModel>, List<PayerModel>> {
    public /* synthetic */ Object map(Object obj) {
        String str;
        List<SplitBillPayerModel> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (SplitBillPayerModel splitBillPayerModel : list) {
                PayerModel payerModel = null;
                if (splitBillPayerModel != null) {
                    String str2 = splitBillPayerModel.setMax;
                    CurrencyAmountModel currencyAmountModel = splitBillPayerModel.equals;
                    String str3 = splitBillPayerModel.getMax;
                    if (splitBillPayerModel.setMin.equals("-")) {
                        str = splitBillPayerModel.getMin;
                    } else {
                        str = splitBillPayerModel.setMin;
                    }
                    payerModel = new PayerModel(str2, currencyAmountModel, str3, str, splitBillPayerModel.length, splitBillPayerModel.hashCode);
                }
                arrayList.add(payerModel);
            }
        }
        return arrayList;
    }
}
