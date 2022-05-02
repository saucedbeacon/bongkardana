package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.gson.JsonSyntaxException;
import io.split.android.client.dtos.Split;
import io.split.android.client.storage.db.GeneralInfoEntity;
import io.split.android.client.storage.db.SplitEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.splits.PersistentSplitsStorage;
import java.util.ArrayList;
import java.util.List;

public class IUMIDInitListener implements PersistentSplitsStorage {
    private static final int MAX_ROWS_PER_QUERY = 100;
    private static final int SQL_PARAM_BIND_SIZE = 20;
    SplitRoomDatabase mDatabase;

    public void close() {
    }

    public IUMIDInitListener(@NonNull SplitRoomDatabase splitRoomDatabase) {
        this.mDatabase = (SplitRoomDatabase) Preconditions.checkNotNull(splitRoomDatabase);
    }

    public boolean update(final getSecurityToken getsecuritytoken) {
        if (getsecuritytoken == null) {
            return false;
        }
        final List<String> splitNameList = splitNameList(getsecuritytoken.getArchivedSplits());
        final List<SplitEntity> convertSplitListToEntities = convertSplitListToEntities(getsecuritytoken.getActiveSplits());
        this.mDatabase.runInTransaction((Runnable) new Runnable() {
            public final void run() {
                IUMIDInitListener.this.mDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.CHANGE_NUMBER_INFO, getsecuritytoken.getChangeNumber()));
                IUMIDInitListener.this.mDatabase.splitDao().insert(convertSplitListToEntities);
                IUMIDInitListener.this.mDatabase.splitDao().delete(splitNameList);
                IUMIDInitListener.this.mDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.SPLITS_UPDATE_TIMESTAMP, getsecuritytoken.getUpdateTimestamp()));
            }
        });
        return true;
    }

    public registerInitListener getSnapshot() {
        length length2 = new length(this.mDatabase);
        this.mDatabase.runInTransaction((Runnable) length2);
        return new registerInitListener(loadSplits(), length2.getChangeNumber().longValue(), length2.getUpdateTimestamp().longValue(), length2.getSplitsFilterQueryString());
    }

    public void update(Split split) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(split);
        this.mDatabase.splitDao().insert(convertSplitListToEntities(arrayList));
    }

    public void updateFilterQueryString(String str) {
        this.mDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.SPLITS_FILTER_QUERY_STRING, str));
    }

    public void delete(List<String> list) {
        for (List<T> delete : Lists.partition(list, 20)) {
            this.mDatabase.splitDao().delete(delete);
        }
    }

    public void clear() {
        this.mDatabase.runInTransaction((Runnable) new Runnable() {
            public final void run() {
                IUMIDInitListener.this.mDatabase.generalInfoDao().update(new GeneralInfoEntity(GeneralInfoEntity.CHANGE_NUMBER_INFO, -1));
                IUMIDInitListener.this.mDatabase.splitDao().deleteAll();
            }
        });
    }

    public List<Split> getAll() {
        return loadSplits();
    }

    @Nullable
    public String getFilterQueryString() {
        GeneralInfoEntity byName = this.mDatabase.generalInfoDao().getByName(GeneralInfoEntity.SPLITS_FILTER_QUERY_STRING);
        if (byName != null) {
            return byName.getStringValue();
        }
        return null;
    }

    private List<Split> loadSplits() {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 1;
        while (i > 0) {
            List<SplitEntity> list = this.mDatabase.splitQueryDao().get(j, 100);
            arrayList.addAll(convertEntitiesToSplitList(list));
            int size = list.size();
            if (size > 0) {
                j = list.get(list.size() - 1).getRowId();
            }
            i = size;
        }
        return arrayList;
    }

    private List<SplitEntity> convertSplitListToEntities(List<Split> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (Split next : list) {
            SplitEntity splitEntity = new SplitEntity();
            splitEntity.setName(next.name);
            splitEntity.setBody(IUMIDInitListenerEx.toJson(next));
            splitEntity.setUpdatedAt(System.currentTimeMillis() / 1000);
            arrayList.add(splitEntity);
        }
        return arrayList;
    }

    private List<Split> convertEntitiesToSplitList(List<SplitEntity> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (SplitEntity next : list) {
            try {
                arrayList.add((Split) IUMIDInitListenerEx.fromJson(next.getBody(), Split.class));
            } catch (JsonSyntaxException unused) {
                StringBuilder sb = new StringBuilder("Could not parse entity to split: ");
                sb.append(next.getName());
                createLoadingDialog.e(sb.toString());
            }
        }
        return arrayList;
    }

    private List<String> splitNameList(List<Split> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (Split split : list) {
            arrayList.add(split.name);
        }
        return arrayList;
    }

    static class length implements Runnable {
        private Long mChangeNumber = -1L;
        private SplitRoomDatabase mDatabase;
        private String mSplitsFilterQueryString = "";
        private Long mUpdateTimestamp = 0L;

        public length(SplitRoomDatabase splitRoomDatabase) {
            this.mDatabase = splitRoomDatabase;
        }

        public final void run() {
            GeneralInfoEntity byName = this.mDatabase.generalInfoDao().getByName(GeneralInfoEntity.SPLITS_UPDATE_TIMESTAMP);
            GeneralInfoEntity byName2 = this.mDatabase.generalInfoDao().getByName(GeneralInfoEntity.CHANGE_NUMBER_INFO);
            GeneralInfoEntity byName3 = this.mDatabase.generalInfoDao().getByName(GeneralInfoEntity.SPLITS_FILTER_QUERY_STRING);
            if (byName2 != null) {
                this.mChangeNumber = Long.valueOf(byName2.getLongValue());
            }
            if (byName != null) {
                this.mUpdateTimestamp = Long.valueOf(byName.getLongValue());
            }
            if (byName3 != null) {
                this.mSplitsFilterQueryString = byName3.getStringValue();
            }
        }

        public final Long getChangeNumber() {
            return this.mChangeNumber;
        }

        public final Long getUpdateTimestamp() {
            return this.mUpdateTimestamp;
        }

        public final String getSplitsFilterQueryString() {
            return this.mSplitsFilterQueryString;
        }
    }
}
