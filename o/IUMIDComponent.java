package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.gson.JsonParseException;
import io.split.android.client.dtos.Identifiable;
import io.split.android.client.storage.db.ImpressionsCountDao;
import io.split.android.client.storage.db.ImpressionsCountEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.impressions.PersistentImpressionsCountStorage;
import java.util.List;
import o.saveSecret;
import org.jetbrains.annotations.NotNull;

public final class IUMIDComponent extends saveSecret<ImpressionsCountEntity, reloadLiteVMInstance> implements PersistentImpressionsCountStorage {
    final ImpressionsCountDao mDao;
    final SplitRoomDatabase mDatabase;

    public final /* bridge */ /* synthetic */ void push(@NonNull Object obj) {
        super.push((Identifiable) obj);
    }

    public IUMIDComponent(@NonNull SplitRoomDatabase splitRoomDatabase, long j) {
        super(j);
        SplitRoomDatabase splitRoomDatabase2 = (SplitRoomDatabase) Preconditions.checkNotNull(splitRoomDatabase);
        this.mDatabase = splitRoomDatabase2;
        this.mDao = splitRoomDatabase2.impressionsCountDao();
    }

    /* access modifiers changed from: protected */
    public final void insert(@NonNull ImpressionsCountEntity impressionsCountEntity) {
        this.mDao.insert(impressionsCountEntity);
    }

    public final void insert(@NonNull List<ImpressionsCountEntity> list) {
        this.mDao.insert(list);
    }

    /* access modifiers changed from: protected */
    @NotNull
    @NonNull
    public final ImpressionsCountEntity entityForModel(@NonNull reloadLiteVMInstance reloadlitevminstance) {
        ImpressionsCountEntity impressionsCountEntity = new ImpressionsCountEntity();
        impressionsCountEntity.setStatus(0);
        impressionsCountEntity.setBody(IUMIDInitListenerEx.toJson(reloadlitevminstance));
        impressionsCountEntity.setCreatedAt(System.currentTimeMillis() / 1000);
        return impressionsCountEntity;
    }

    public final int deleteByStatus(int i, long j) {
        return this.mDao.deleteByStatus(i, j, 100);
    }

    public final void deleteOutdated(long j) {
        this.mDao.deleteOutdated(j);
    }

    public final void deleteById(@NonNull List<Long> list) {
        this.mDao.delete(list);
    }

    public final void updateStatus(@NotNull @NonNull List<Long> list, int i) {
        this.mDao.updateStatus(list, i);
    }

    public final void runInTransaction(List<ImpressionsCountEntity> list, int i, long j) {
        this.mDatabase.runInTransaction((Runnable) new length(this.mDao, list, i, j));
    }

    /* access modifiers changed from: protected */
    public final reloadLiteVMInstance entityToModel(ImpressionsCountEntity impressionsCountEntity) throws JsonParseException {
        reloadLiteVMInstance reloadlitevminstance = (reloadLiteVMInstance) IUMIDInitListenerEx.fromJson(impressionsCountEntity.getBody(), reloadLiteVMInstance.class);
        reloadlitevminstance.storageId = impressionsCountEntity.getId();
        return reloadlitevminstance;
    }

    static class length extends saveSecret.length<ImpressionsCountEntity, reloadLiteVMInstance> {
        final ImpressionsCountDao mDao;

        public length(ImpressionsCountDao impressionsCountDao, List<ImpressionsCountEntity> list, int i, long j) {
            super(list, i, j);
            this.mDao = impressionsCountDao;
        }

        public final List<ImpressionsCountEntity> getBy(long j, int i, int i2) {
            return this.mDao.getBy(j, i, i2);
        }

        public final void updateStatus(List<Long> list, int i) {
            this.mDao.updateStatus(list, i);
        }
    }
}
