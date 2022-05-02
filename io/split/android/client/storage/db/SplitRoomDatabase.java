package io.split.android.client.storage.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.google.common.base.Preconditions;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.setPrimaryBackground;

@Database(entities = {MySegmentEntity.class, SplitEntity.class, EventEntity.class, ImpressionEntity.class, GeneralInfoEntity.class, ImpressionsCountEntity.class}, version = 2)
public abstract class SplitRoomDatabase extends RoomDatabase {
    private static volatile Map<String, SplitRoomDatabase> mInstances = new ConcurrentHashMap();
    private volatile SplitQueryDao mSplitQueryDao;

    public abstract EventDao eventDao();

    public abstract GeneralInfoDao generalInfoDao();

    public abstract ImpressionDao impressionDao();

    public abstract ImpressionsCountDao impressionsCountDao();

    public abstract MySegmentDao mySegmentDao();

    public abstract SplitDao splitDao();

    public static SplitRoomDatabase getDatabase(Context context, String str) {
        SplitRoomDatabase splitRoomDatabase;
        Class<SplitRoomDatabase> cls = SplitRoomDatabase.class;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(!str.isEmpty());
        synchronized (cls) {
            splitRoomDatabase = mInstances.get(str);
            if (splitRoomDatabase == null) {
                RoomDatabase.setMax<SplitRoomDatabase> min = setPrimaryBackground.setMin(context.getApplicationContext(), cls, str);
                int[] iArr = {1, 2};
                if (min.equals == null) {
                    min.equals = new HashSet(2);
                }
                for (int i = 0; i < 2; i++) {
                    min.equals.add(Integer.valueOf(iArr[i]));
                }
                splitRoomDatabase = min.getMin();
                mInstances.put(str, splitRoomDatabase);
            }
        }
        return splitRoomDatabase;
    }

    public SplitQueryDao splitQueryDao() {
        SplitQueryDao splitQueryDao;
        if (this.mSplitQueryDao != null) {
            return this.mSplitQueryDao;
        }
        synchronized (this) {
            this.mSplitQueryDao = new SplitQueryDaoImpl(this);
            splitQueryDao = this.mSplitQueryDao;
        }
        return splitQueryDao;
    }
}
