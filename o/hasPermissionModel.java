package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007¨\u0006\b"}, d2 = {"transform", "", "Lid/dana/domain/social/model/ActivityReactionsUser;", "activityReactionsUserResult", "Lid/dana/data/social/model/ActivityReactionsUserResult;", "toActivityReactions", "Lid/dana/domain/social/model/ActivityReactions;", "Lid/dana/data/social/model/ActivityReactionsResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class hasPermissionModel {
    @NotNull
    public static final markInside toActivityReactions(@NotNull executeAuth executeauth) {
        Intrinsics.checkNotNullParameter(executeauth, "$this$toActivityReactions");
        String kind = executeauth.getKind();
        List<markOutsideIfExpired> transform = transform(executeauth.getUsers());
        String maxId = executeauth.getMaxId();
        if (maxId == null) {
            maxId = "";
        }
        return new markInside(kind, transform, maxId, executeauth.getHasNext());
    }

    private static final List<markOutsideIfExpired> transform(List<getExtendDescriptionInSetting> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (getExtendDescriptionInSetting next : list) {
            markOutsideIfExpired markoutsideifexpired = new markOutsideIfExpired((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
            markoutsideifexpired.setDisplayName(next.getDisplayName());
            markoutsideifexpired.setPhoneNumber(next.getPhoneNumber());
            markoutsideifexpired.setId(next.getId());
            markoutsideifexpired.setNickName(next.getNickName());
            markoutsideifexpired.setKycStatus(next.getKycStatus());
            markoutsideifexpired.setProfilePictureUrl(next.getProfilePictureUrl());
            markoutsideifexpired.setUsername(next.getUsername());
            arrayList.add(markoutsideifexpired);
        }
        return arrayList;
    }
}
