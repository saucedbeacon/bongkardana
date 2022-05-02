package o;

import id.dana.sendmoney.model.RecentBankModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;

public final class setSelectedPhotoPaths extends setSpeed<List<ErrorPageUtils>, List<RecentBankModel>> {
    public final /* synthetic */ Object apply(Object obj) {
        return setMin((List) obj);
    }

    public final /* synthetic */ Object map(Object obj) {
        return setMin((List) obj);
    }

    @Inject
    setSelectedPhotoPaths() {
    }

    public static List<RecentBankModel> setMin(List<ErrorPageUtils> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ErrorPageUtils next : list) {
            RecentBankModel recentBankModel = new RecentBankModel();
            recentBankModel.toIntRange = next.getBankName();
            recentBankModel.getMax = next.getBankNumber();
            String recipientName = next.getRecipientName();
            if (recipientName == null) {
                recipientName = "";
            }
            recentBankModel.equals = recipientName;
            recentBankModel.Mean$Arithmetic = next.getBankLogo();
            recentBankModel.Grayscale$Algorithm = next.getAlias();
            recentBankModel.getMin = next.getInstId();
            recentBankModel.setMax(next.getInstLocalName());
            recentBankModel.toFloatRange = next.getPayMethod();
            recentBankModel.IsOverlapping = next.getPayOption();
            recentBankModel.isInside = next.getSenderName();
            recentBankModel.length = next.getCardIndexNo();
            recentBankModel.toString = next.getPrefix();
            recentBankModel.FastBitmap$CoordinateSystem = next.getTransactionCount();
            recentBankModel.valueOf = Long.valueOf(next.getLastUpdated());
            recentBankModel.values = next.isVisibleInQuickSend();
            arrayList.add(recentBankModel);
        }
        return arrayList;
    }
}
