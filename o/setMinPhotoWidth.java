package o;

import id.dana.sendmoney.model.RecentContactModel;
import java.util.ArrayList;
import java.util.List;

public final class setMinPhotoWidth extends setSpeed<List<getErrorStatusPageUrl>, List<RecentContactModel>> {
    public final /* synthetic */ Object apply(Object obj) {
        return getMin((List) obj);
    }

    public final /* synthetic */ Object map(Object obj) {
        return getMin((List) obj);
    }

    public static List<RecentContactModel> getMin(List<getErrorStatusPageUrl> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (getErrorStatusPageUrl next : list) {
            RecentContactModel recentContactModel = new RecentContactModel();
            recentContactModel.getMin = next.getUserId();
            recentContactModel.length = next.getUserNickName();
            recentContactModel.setMax = next.getUserAvatar();
            recentContactModel.toFloatRange = next.getUserPhoneNumber();
            recentContactModel.length(2);
            arrayList.add(recentContactModel);
        }
        return arrayList;
    }
}
