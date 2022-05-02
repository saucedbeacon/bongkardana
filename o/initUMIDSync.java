package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.dtos.Split;
import io.split.android.client.storage.splits.PersistentSplitsStorage;
import io.split.android.client.storage.splits.SplitsStorage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class initUMIDSync implements SplitsStorage {
    private long mChangeNumber;
    private Map<String, Split> mInMemorySplits = new ConcurrentHashMap();
    private PersistentSplitsStorage mPersistentStorage;
    private String mSplitsFilterQueryString;
    private Map<String, Integer> mTrafficTypes = new ConcurrentHashMap();
    private long mUpdateTimestamp;

    public initUMIDSync(@NonNull PersistentSplitsStorage persistentSplitsStorage) {
        this.mPersistentStorage = (PersistentSplitsStorage) Preconditions.checkNotNull(persistentSplitsStorage);
    }

    public final void loadLocal() {
        registerInitListener snapshot = this.mPersistentStorage.getSnapshot();
        List<Split> splits = snapshot.getSplits();
        this.mChangeNumber = snapshot.getChangeNumber();
        this.mUpdateTimestamp = snapshot.getUpdateTimestamp();
        this.mSplitsFilterQueryString = snapshot.getSplitsFilterQueryString();
        for (Split next : splits) {
            this.mInMemorySplits.put(next.name, next);
        }
    }

    public final Split get(@NonNull String str) {
        return this.mInMemorySplits.get(str);
    }

    public final Map<String, Split> getMany(@NonNull List<String> list) {
        HashMap hashMap = new HashMap();
        if (list == null || list.isEmpty()) {
            hashMap.putAll(this.mInMemorySplits);
            return hashMap;
        }
        for (String next : list) {
            Split split = this.mInMemorySplits.get(next);
            if (split != null) {
                hashMap.put(next, split);
            }
        }
        return hashMap;
    }

    public final Map<String, Split> getAll() {
        return getMany((List<String>) null);
    }

    public final void update(getSecurityToken getsecuritytoken) {
        if (getsecuritytoken != null) {
            List<Split> activeSplits = getsecuritytoken.getActiveSplits();
            List<Split> archivedSplits = getsecuritytoken.getArchivedSplits();
            if (activeSplits != null) {
                for (Split next : activeSplits) {
                    Split split = this.mInMemorySplits.get(next.name);
                    if (!(split == null || split.trafficTypeName == null)) {
                        decreaseTrafficTypeCount(split.trafficTypeName);
                    }
                    increaseTrafficTypeCount(next.trafficTypeName);
                    this.mInMemorySplits.put(next.name, next);
                }
            }
            if (archivedSplits != null) {
                for (Split next2 : archivedSplits) {
                    if (this.mInMemorySplits.remove(next2.name) != null) {
                        decreaseTrafficTypeCount(next2.trafficTypeName);
                    }
                }
            }
            this.mChangeNumber = getsecuritytoken.getChangeNumber();
            this.mUpdateTimestamp = getsecuritytoken.getUpdateTimestamp();
            this.mPersistentStorage.update(getsecuritytoken);
        }
    }

    public final void updateWithoutChecks(Split split) {
        this.mInMemorySplits.put(split.name, split);
        this.mPersistentStorage.update(split);
    }

    public final long getTill() {
        return this.mChangeNumber;
    }

    public final long getUpdateTimestamp() {
        return this.mUpdateTimestamp;
    }

    public final String getSplitsFilterQueryString() {
        return this.mSplitsFilterQueryString;
    }

    public final void updateSplitsFilterQueryString(String str) {
        this.mPersistentStorage.updateFilterQueryString(str);
    }

    public final void clear() {
        this.mInMemorySplits.clear();
        this.mChangeNumber = -1;
        this.mPersistentStorage.clear();
    }

    public final boolean isValidTrafficType(String str) {
        return (str == null || this.mTrafficTypes.get(str.toLowerCase()) == null) ? false : true;
    }

    private void increaseTrafficTypeCount(@NonNull String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            this.mTrafficTypes.put(lowerCase, Integer.valueOf(countForTrafficType(lowerCase) + 1));
        }
    }

    private void decreaseTrafficTypeCount(@NonNull String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            int countForTrafficType = countForTrafficType(lowerCase);
            if (countForTrafficType > 1) {
                this.mTrafficTypes.put(lowerCase, Integer.valueOf(countForTrafficType - 1));
            } else {
                this.mTrafficTypes.remove(lowerCase);
            }
        }
    }

    private int countForTrafficType(@NonNull String str) {
        Integer num = this.mTrafficTypes.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
