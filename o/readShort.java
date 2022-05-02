package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\f\u0010\b\u001a\u00020\u0005*\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lid/dana/data/promoquest/mapper/PromoQuestEntityMapper;", "", "()V", "transform", "", "Lid/dana/domain/promoquest/model/Mission;", "listOfMissionResult", "Lid/dana/data/promoquest/repository/source/network/result/ListOfMissionResult;", "toMission", "Lid/dana/data/promoquest/repository/source/network/result/MissionEntityResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class readShort {
    @NotNull
    public final List<queryAppAppInfos> transform(@Nullable freeAll freeall) {
        List<queryAppAppInfos> list;
        List<getClassLoader> missionInfoList;
        List filterNotNull;
        if (freeall == null || (missionInfoList = freeall.getMissionInfoList()) == null || (filterNotNull = CollectionsKt.filterNotNull(missionInfoList)) == null) {
            list = null;
        } else {
            Iterable<getClassLoader> iterable = filterNotNull;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (getClassLoader mission : iterable) {
                arrayList.add(toMission(mission));
            }
            list = (List) arrayList;
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    private final queryAppAppInfos toMission(getClassLoader getclassloader) {
        String missionDescription = getclassloader.getMissionDescription();
        Date missionExpireTime = getclassloader.getMissionExpireTime();
        String missionId = getclassloader.getMissionId();
        String missionActiveImage = getclassloader.getMissionActiveImage();
        String missionFinishImage = getclassloader.getMissionFinishImage();
        String missionName = getclassloader.getMissionName();
        String missionStatus = getclassloader.getMissionStatus();
        String missionThumbnail = getclassloader.getMissionThumbnail();
        boolean hasPrize = getclassloader.getHasPrize();
        String missionType = getclassloader.getMissionType();
        String missionTnc = getclassloader.getMissionTnc();
        if (missionTnc == null) {
            missionTnc = "";
        }
        return new queryAppAppInfos(missionId, missionName, missionDescription, missionExpireTime, missionStatus, missionFinishImage, missionActiveImage, missionThumbnail, (List) null, hasPrize, missionType, missionTnc, 256, (DefaultConstructorMarker) null);
    }
}
