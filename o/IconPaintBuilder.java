package o;

import android.text.TextUtils;
import id.dana.splitbill.model.SplitBillPayerModel;
import java.util.ArrayList;
import java.util.List;

public class IconPaintBuilder extends setSpeed<List<SplitBillPayerModel>, List<setExtraBeaconDataTracker>> {
    public /* synthetic */ Object map(Object obj) {
        String str;
        String str2;
        String str3;
        List<SplitBillPayerModel> list = (List) obj;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (SplitBillPayerModel splitBillPayerModel : list) {
            if (splitBillPayerModel.IsOverlapping == 0) {
                setExtraBeaconDataTracker setextrabeacondatatracker = new setExtraBeaconDataTracker();
                if (splitBillPayerModel.setMin.equals("-")) {
                    str = splitBillPayerModel.getMin;
                } else {
                    str = splitBillPayerModel.setMin;
                }
                if (!setMax(str)) {
                    if (splitBillPayerModel.setMin.equals("-")) {
                        str3 = splitBillPayerModel.getMin;
                    } else {
                        str3 = splitBillPayerModel.setMin;
                    }
                    setextrabeacondatatracker.setName(str3);
                }
                setextrabeacondatatracker.setUserId(splitBillPayerModel.length);
                setextrabeacondatatracker.setFundAmount(isOriginHasAppInfo.getCleanDot(splitBillPayerModel.equals.getMax));
                if (!setMax(splitBillPayerModel.getMax)) {
                    setextrabeacondatatracker.setLoginId(splitBillPayerModel.getMax);
                }
                setextrabeacondatatracker.setImageUrl(splitBillPayerModel.setMax);
                if (splitBillPayerModel.setMin.equals("-")) {
                    str2 = splitBillPayerModel.getMin;
                } else {
                    str2 = splitBillPayerModel.setMin;
                }
                setextrabeacondatatracker.setShownName(str2);
                setextrabeacondatatracker.setShownNumber(splitBillPayerModel.getMax);
                arrayList.add(setextrabeacondatatracker);
            }
        }
        return arrayList;
    }

    private static boolean setMax(String str) {
        return !TextUtils.isEmpty(str) && str.contains("*");
    }
}
