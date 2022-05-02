package o;

import id.dana.sendmoney.model.RecipientModel;
import id.dana.splitbill.model.SplitBillPayerModel;
import javax.inject.Inject;

public class IconInfo extends setSpeed<SplitBillPayerModel, RecipientModel> {
    public /* synthetic */ Object map(Object obj) {
        SplitBillPayerModel splitBillPayerModel = (SplitBillPayerModel) obj;
        if (splitBillPayerModel == null) {
            return null;
        }
        RecipientModel recipientModel = new RecipientModel("contact");
        recipientModel.isInside = splitBillPayerModel.getMax;
        return recipientModel;
    }

    @Inject
    IconInfo() {
    }
}
