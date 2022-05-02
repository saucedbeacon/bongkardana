package o;

import android.text.TextUtils;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.splitbill.model.SplitBillPayerModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class setTextBold extends setSpeed<List<RecipientModel>, List<SplitBillPayerModel>> {
    public /* synthetic */ Object map(Object obj) {
        List<RecipientModel> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (RecipientModel recipientModel : list) {
                SplitBillPayerModel splitBillPayerModel = null;
                if (recipientModel != null) {
                    splitBillPayerModel = new SplitBillPayerModel();
                    splitBillPayerModel.setMin = recipientModel.length();
                    splitBillPayerModel.getMax = recipientModel.isInside;
                    splitBillPayerModel.setMax = recipientModel.getMax();
                    splitBillPayerModel.getMin = recipientModel.create;
                    if (!TextUtils.isEmpty(recipientModel.onPostMessage)) {
                        splitBillPayerModel.length = recipientModel.onPostMessage;
                    }
                }
                arrayList.add(splitBillPayerModel);
            }
        }
        return arrayList;
    }

    @Inject
    setTextBold() {
    }
}
