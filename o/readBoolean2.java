package o;

import androidx.annotation.Nullable;
import java.util.ArrayList;

public class readBoolean2 {
    @Nullable
    public queryAppAppInfos transform(getLong getlong) {
        if (getlong == null) {
            return null;
        }
        queryAppAppInfos queryappappinfos = new queryAppAppInfos();
        if (getlong.getMissionInfo() != null) {
            queryappappinfos.setMissionId(getlong.getMissionInfo().getMissionId());
            queryappappinfos.setMissionName(getlong.getMissionInfo().getMissionName());
            queryappappinfos.setMissionDescription(getlong.getMissionInfo().getMissionDescription());
            queryappappinfos.setMissionExpireTime(getlong.getMissionInfo().getMissionExpireTime());
            queryappappinfos.setMissionStatus(getlong.getMissionInfo().getMissionStatus());
            queryappappinfos.setMissionFinishImage(getlong.getMissionInfo().getMissionFinishImage());
            queryappappinfos.setMissionImage(getlong.getMissionInfo().getMissionActiveImage());
            queryappappinfos.setHasPrize(getlong.getMissionInfo().getHasPrize());
            queryappappinfos.setMissionType(getlong.getMissionInfo().getMissionType());
            queryappappinfos.setMissionThumbnail(getlong.getMissionInfo().getMissionThumbnail());
            String missionTnc = getlong.getMissionInfo().getMissionTnc();
            if (missionTnc != null) {
                queryappappinfos.setMissionTnc(missionTnc);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (getlong.getQuestInfoList() != null) {
            for (DefaultClassLoaderFactory transform : getlong.getQuestInfoList()) {
                arrayList.add(transform(transform));
            }
        }
        queryappappinfos.setQuestList(arrayList);
        return queryappappinfos;
    }

    private GriverAppInfoStorage transform(DefaultClassLoaderFactory defaultClassLoaderFactory) {
        if (defaultClassLoaderFactory == null) {
            return null;
        }
        GriverAppInfoStorage griverAppInfoStorage = new GriverAppInfoStorage();
        griverAppInfoStorage.setId(defaultClassLoaderFactory.getQuestId());
        griverAppInfoStorage.setName(defaultClassLoaderFactory.getQuestName());
        griverAppInfoStorage.setDescription(defaultClassLoaderFactory.getQuestDescription());
        griverAppInfoStorage.setStatus(defaultClassLoaderFactory.getQuestStatus());
        griverAppInfoStorage.setActionType(defaultClassLoaderFactory.getQuestActionType());
        griverAppInfoStorage.setRedirectType(defaultClassLoaderFactory.getQuestRedirectType());
        griverAppInfoStorage.setRedirectValue(defaultClassLoaderFactory.getQuestRedirectValue());
        griverAppInfoStorage.setPriceStatus(defaultClassLoaderFactory.isHasPrize());
        return griverAppInfoStorage;
    }
}
