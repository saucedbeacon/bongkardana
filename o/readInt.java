package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import o.Pool;

@Singleton
public class readInt {
    public List<GriverAppPreDownloadSQLiteStorage> transform(List<getFree> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (getFree transform : list) {
            arrayList.add(transform(transform));
        }
        return arrayList;
    }

    public GriverAppPreDownloadSQLiteStorage transform(getFree getfree) {
        if (getfree == null) {
            return null;
        }
        GriverAppPreDownloadSQLiteStorage griverAppPreDownloadSQLiteStorage = new GriverAppPreDownloadSQLiteStorage();
        griverAppPreDownloadSQLiteStorage.setId(getfree.getMissionId());
        griverAppPreDownloadSQLiteStorage.setExpireTime(getfree.getMissionExpireTime());
        griverAppPreDownloadSQLiteStorage.setQuest(transform(getfree.getActiveQuest()));
        griverAppPreDownloadSQLiteStorage.setStatus(getfree.getMissionStatus());
        griverAppPreDownloadSQLiteStorage.setThumbnail(getfree.getMissionThumbnail());
        return griverAppPreDownloadSQLiteStorage;
    }

    public GriverAppInfoStorage transform(DefaultClassLoaderFactory defaultClassLoaderFactory) {
        if (defaultClassLoaderFactory == null) {
            return null;
        }
        GriverAppInfoStorage griverAppInfoStorage = new GriverAppInfoStorage();
        griverAppInfoStorage.setActionType(defaultClassLoaderFactory.getQuestActionType());
        griverAppInfoStorage.setDescription(defaultClassLoaderFactory.getQuestDescription());
        griverAppInfoStorage.setId(defaultClassLoaderFactory.getQuestId());
        griverAppInfoStorage.setPriceStatus(defaultClassLoaderFactory.isHasPrize());
        griverAppInfoStorage.setName(defaultClassLoaderFactory.getQuestName());
        griverAppInfoStorage.setRedirectType(defaultClassLoaderFactory.getQuestRedirectType());
        griverAppInfoStorage.setRedirectValue(defaultClassLoaderFactory.getQuestRedirectValue());
        griverAppInfoStorage.setStatus(defaultClassLoaderFactory.getQuestStatus());
        return griverAppInfoStorage;
    }

    public GriverAppInfoDBHelper transform(Pool.Poolable poolable) {
        if (poolable == null) {
            return null;
        }
        GriverAppInfoDBHelper griverAppInfoDBHelper = new GriverAppInfoDBHelper();
        griverAppInfoDBHelper.setQuestRedirectType(poolable.getQuestRedirectType());
        griverAppInfoDBHelper.setQuestRedirectValue(poolable.getQuestRedirectValue());
        griverAppInfoDBHelper.setRedeemResult(poolable.isRedeemResult());
        griverAppInfoDBHelper.setTrackResult(poolable.isTrackResult());
        return griverAppInfoDBHelper;
    }
}
