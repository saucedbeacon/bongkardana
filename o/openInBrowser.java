package o;

import id.dana.promoquest.model.MissionModel;
import id.dana.promoquest.model.QuestModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0007J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0007J\f\u0010\u0011\u001a\u00020\u0004*\u00020\u0006H\u0002J\f\u0010\u0012\u001a\u00020\u000e*\u00020\u0010H\u0002J\f\u0010\u0013\u001a\u00020\b*\u00020\nH\u0002¨\u0006\u0014"}, d2 = {"Lid/dana/promoquest/mapper/PromoQuestMapper;", "", "()V", "transform", "Lid/dana/promoquest/model/MissionModel;", "mission", "Lid/dana/domain/promoquest/model/Mission;", "", "Lid/dana/promoquest/model/QuestModel;", "questList", "Lid/dana/domain/promoquest/model/Quest;", "transformMission", "missionList", "transformMissionSummary", "Lid/dana/promoquest/model/MissionSummaryModel;", "missionSummaries", "Lid/dana/domain/promoquest/model/MissionSummary;", "toMissionModel", "toMissionSummaryModel", "toQuestModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class openInBrowser {
    @NotNull
    private static List<QuestModel> length(@Nullable List<GriverAppInfoStorage> list) {
        List<QuestModel> list2;
        List filterNotNull;
        if (list == null || (filterNotNull = CollectionsKt.filterNotNull(list)) == null) {
            list2 = null;
        } else {
            Iterable<GriverAppInfoStorage> iterable = filterNotNull;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (GriverAppInfoStorage griverAppInfoStorage : iterable) {
                arrayList.add(new QuestModel(griverAppInfoStorage.getId(), griverAppInfoStorage.getName(), griverAppInfoStorage.getDescription(), griverAppInfoStorage.getStatus(), griverAppInfoStorage.getActionType(), griverAppInfoStorage.getRedirectType(), griverAppInfoStorage.getRedirectValue(), griverAppInfoStorage.isPriceStatus()));
            }
            list2 = (List) arrayList;
        }
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }

    @NotNull
    public static List<MissionModel> setMax(@Nullable List<queryAppAppInfos> list) {
        List<MissionModel> list2;
        List filterNotNull;
        if (list == null || (filterNotNull = CollectionsKt.filterNotNull(list)) == null) {
            list2 = null;
        } else {
            Iterable<queryAppAppInfos> iterable = filterNotNull;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (queryAppAppInfos max : iterable) {
                arrayList.add(setMax(max));
            }
            list2 = (List) arrayList;
        }
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }

    public static MissionModel setMax(queryAppAppInfos queryappappinfos) {
        Date date;
        String str;
        String missionDescription = queryappappinfos.getMissionDescription();
        String missionId = queryappappinfos.getMissionId();
        String missionImage = queryappappinfos.getMissionImage();
        String missionFinishImage = queryappappinfos.getMissionFinishImage();
        String missionName = queryappappinfos.getMissionName();
        String missionThumbnail = queryappappinfos.getMissionThumbnail();
        boolean hasPrize = queryappappinfos.getHasPrize();
        List<QuestModel> length = length(queryappappinfos.getQuestList());
        long currentTimeMillis = System.currentTimeMillis();
        Date missionExpireTime = queryappappinfos.getMissionExpireTime();
        if (currentTimeMillis > (missionExpireTime != null ? missionExpireTime.getTime() : 0)) {
            date = new Date();
        } else {
            date = queryappappinfos.getMissionExpireTime();
            if (date == null) {
                date = new Date();
            }
        }
        Date date2 = date;
        long currentTimeMillis2 = System.currentTimeMillis();
        Date missionExpireTime2 = queryappappinfos.getMissionExpireTime();
        Intrinsics.checkNotNull(missionExpireTime2);
        if (currentTimeMillis2 <= missionExpireTime2.getTime() || !(!Intrinsics.areEqual((Object) queryappappinfos.getMissionStatus(), (Object) "FINISH"))) {
            str = queryappappinfos.getMissionStatus();
        } else {
            str = "CLOSE";
        }
        return new MissionModel(missionId, missionName, str, missionDescription, date2, missionFinishImage, missionImage, missionThumbnail, hasPrize, length, queryappappinfos.isMissionFlexible(), queryappappinfos.getMissionTnc());
    }
}
