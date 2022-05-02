package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007¨\u0006\b"}, d2 = {"transform", "", "Lid/dana/social/model/ActivityReactionsUserModel;", "activityReactionsUser", "Lid/dana/domain/social/model/ActivityReactionsUser;", "toActivityReactionsModel", "Lid/dana/social/model/ActivityReactionsModel;", "Lid/dana/domain/social/model/ActivityReactions;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setSelectionInt {
    public static final List<recycleOnMeasure> setMax(List<markOutsideIfExpired> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (markOutsideIfExpired next : list) {
            recycleOnMeasure recycleonmeasure = new recycleOnMeasure((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
            recycleonmeasure.setMax = next.getDisplayName();
            recycleonmeasure.setMin = next.getPhoneNumber();
            recycleonmeasure.getMax = next.getId();
            recycleonmeasure.getMin = next.getNickName();
            recycleonmeasure.length = next.getKycStatus();
            recycleonmeasure.toIntRange = next.getProfilePictureUrl();
            arrayList.add(recycleonmeasure);
        }
        return arrayList;
    }
}
