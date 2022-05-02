package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.splitbill.model.PayerModel;
import id.dana.splitbill.model.SplitBillHistoryModel;
import java.util.ArrayList;
import java.util.List;

public final class AUListView extends setSpeed<setLastScanStartTimeMillis, SplitBillHistoryModel> {
    public final /* synthetic */ Object map(Object obj) {
        setLastScanStartTimeMillis setlastscanstarttimemillis = (setLastScanStartTimeMillis) obj;
        if (setlastscanstarttimemillis == null) {
            return null;
        }
        SplitBillHistoryModel splitBillHistoryModel = new SplitBillHistoryModel();
        splitBillHistoryModel.length = setlastscanstarttimemillis.getSplitBillId();
        splitBillHistoryModel.getMax = setlastscanstarttimemillis.getDeeplink();
        String status = setlastscanstarttimemillis.getStatus();
        int i = 0;
        int length = status != null ? status.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1312090981, oncanceled);
            onCancelLoad.getMin(-1312090981, oncanceled);
        }
        splitBillHistoryModel.toFloatRange = status;
        String comment = setlastscanstarttimemillis.getComment();
        if (comment != null) {
            i = comment.length();
        }
        int max2 = dispatchOnCancelled.setMax(i);
        if (i != max2) {
            onCanceled oncanceled2 = new onCanceled(i, max2, 1);
            onCancelLoad.setMax(-1375584590, oncanceled2);
            onCancelLoad.getMin(-1375584590, oncanceled2);
        }
        splitBillHistoryModel.getMin = comment;
        List<setExtraBeaconDataTracker> payers = setlastscanstarttimemillis.getPayers();
        ArrayList arrayList = new ArrayList();
        if (payers != null) {
            for (setExtraBeaconDataTracker next : payers) {
                if (next != null) {
                    arrayList.add(new PayerModel(next.getImageUrl(), new CurrencyAmountModel(next.getFundAmount(), "Rp"), next.getLoginId(), next.getName(), next.getUserId(), next.getStatus()));
                }
            }
        }
        splitBillHistoryModel.setMin = arrayList;
        splitBillHistoryModel.setMax = getMax(setlastscanstarttimemillis.getPayers());
        return splitBillHistoryModel;
    }

    private static String getMax(List<setExtraBeaconDataTracker> list) {
        long j = 0;
        for (setExtraBeaconDataTracker fundAmount : list) {
            j += Long.valueOf(fundAmount.getFundAmount()).longValue();
        }
        return String.valueOf(j);
    }
}
