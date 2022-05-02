package o;

import id.dana.model.SendMoneyHomeMenuModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class onProviderEnabled {
    private static boolean length(Integer num) {
        return num != null && num.intValue() > 0;
    }

    public static SendMoneyHomeMenuModel getMax(List<SendMoneyHomeMenuModel> list, int i) {
        SendMoneyHomeMenuModel sendMoneyHomeMenuModel;
        Iterator<SendMoneyHomeMenuModel> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                sendMoneyHomeMenuModel = null;
                break;
            }
            sendMoneyHomeMenuModel = it.next();
            if (sendMoneyHomeMenuModel.getMax()) {
                break;
            }
        }
        if (sendMoneyHomeMenuModel == null) {
            return sendMoneyHomeMenuModel;
        }
        if (length(Integer.valueOf(i))) {
            Integer valueOf = Integer.valueOf(i);
            sendMoneyHomeMenuModel.getMin = true;
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append("X");
            String obj = sb.toString();
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            sendMoneyHomeMenuModel.IsOverlapping = obj;
        } else {
            sendMoneyHomeMenuModel.getMin = false;
        }
        return sendMoneyHomeMenuModel;
    }
}
