package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.gson.reflect.TypeToken;
import io.split.android.client.storage.db.MySegmentEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.mysegments.PersistentMySegmentsStorage;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class setOnlineHost implements PersistentMySegmentsStorage {
    private static final Type MY_SEGMENTS_LIST_TYPE = new TypeToken<List<String>>() {
    }.getType();
    final SplitRoomDatabase mDatabase;
    final showTipToast mStringHelper = new showTipToast();
    final String mUserKey;

    public final void close() {
    }

    public setOnlineHost(@NonNull SplitRoomDatabase splitRoomDatabase, @NonNull String str) {
        this.mDatabase = (SplitRoomDatabase) Preconditions.checkNotNull(splitRoomDatabase);
        this.mUserKey = (String) Preconditions.checkNotNull(str);
    }

    public final void set(List<String> list) {
        if (list != null) {
            MySegmentEntity mySegmentEntity = new MySegmentEntity();
            mySegmentEntity.setUserKey(this.mUserKey);
            mySegmentEntity.setSegmentList(this.mStringHelper.join(",", list));
            mySegmentEntity.setUpdatedAt(System.currentTimeMillis() / 1000);
            this.mDatabase.mySegmentDao().update(mySegmentEntity);
        }
    }

    public final List<String> getSnapshot() {
        return getMySegmentsFromEntity(this.mDatabase.mySegmentDao().getByUserKeys(this.mUserKey));
    }

    private List<String> getMySegmentsFromEntity(MySegmentEntity mySegmentEntity) {
        if (mySegmentEntity == null || Strings.isNullOrEmpty(mySegmentEntity.getSegmentList())) {
            return new ArrayList();
        }
        return Arrays.asList(mySegmentEntity.getSegmentList().split(","));
    }
}
