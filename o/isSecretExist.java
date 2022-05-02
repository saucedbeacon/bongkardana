package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.gson.JsonParseException;
import io.split.android.client.dtos.DeprecatedKeyImpression;
import io.split.android.client.dtos.Identifiable;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.storage.db.ImpressionDao;
import io.split.android.client.storage.db.ImpressionEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.impressions.PersistentImpressionsStorage;
import java.util.List;
import o.saveSecret;

public final class isSecretExist extends saveSecret<ImpressionEntity, KeyImpression> implements PersistentImpressionsStorage {
    final ImpressionDao mDao;
    final SplitRoomDatabase mDatabase;

    public final /* bridge */ /* synthetic */ void push(@NonNull Object obj) {
        super.push((Identifiable) obj);
    }

    public isSecretExist(@NonNull SplitRoomDatabase splitRoomDatabase, long j) {
        super(j);
        SplitRoomDatabase splitRoomDatabase2 = (SplitRoomDatabase) Preconditions.checkNotNull(splitRoomDatabase);
        this.mDatabase = splitRoomDatabase2;
        this.mDao = splitRoomDatabase2.impressionDao();
    }

    /* access modifiers changed from: protected */
    public final void insert(@NonNull ImpressionEntity impressionEntity) {
        this.mDao.insert(impressionEntity);
    }

    public final void insert(@NonNull List<ImpressionEntity> list) {
        this.mDao.insert(list);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final ImpressionEntity entityForModel(@NonNull KeyImpression keyImpression) {
        ImpressionEntity impressionEntity = new ImpressionEntity();
        impressionEntity.setStatus(0);
        impressionEntity.setBody(IUMIDInitListenerEx.toJson(keyImpression));
        impressionEntity.setTestName(keyImpression.feature);
        impressionEntity.setCreatedAt(System.currentTimeMillis() / 1000);
        return impressionEntity;
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

    public final void updateStatus(@NonNull List<Long> list, int i) {
        this.mDao.updateStatus(list, i);
    }

    public final void runInTransaction(List<ImpressionEntity> list, int i, long j) {
        this.mDatabase.runInTransaction((Runnable) new getMin(this.mDao, list, i, j));
    }

    /* access modifiers changed from: protected */
    public final KeyImpression entityToModel(ImpressionEntity impressionEntity) throws JsonParseException {
        KeyImpression keyImpression;
        try {
            keyImpression = (KeyImpression) IUMIDInitListenerEx.fromJson(impressionEntity.getBody(), KeyImpression.class);
            keyImpression.feature = impressionEntity.getTestName();
        } catch (JsonParseException unused) {
            keyImpression = updateImpression((DeprecatedKeyImpression) IUMIDInitListenerEx.fromJson(impressionEntity.getBody(), DeprecatedKeyImpression.class));
        }
        if (keyImpression != null) {
            keyImpression.storageId = impressionEntity.getId();
            return keyImpression;
        }
        throw new JsonParseException("Error parsing stored impression");
    }

    private KeyImpression updateImpression(DeprecatedKeyImpression deprecatedKeyImpression) {
        KeyImpression keyImpression = new KeyImpression();
        keyImpression.feature = deprecatedKeyImpression.feature;
        keyImpression.bucketingKey = deprecatedKeyImpression.bucketingKey;
        keyImpression.changeNumber = deprecatedKeyImpression.changeNumber;
        keyImpression.keyName = deprecatedKeyImpression.keyName;
        keyImpression.label = deprecatedKeyImpression.label;
        keyImpression.time = deprecatedKeyImpression.time;
        keyImpression.treatment = deprecatedKeyImpression.treatment;
        return keyImpression;
    }

    static class getMin extends saveSecret.length<ImpressionEntity, KeyImpression> {
        final ImpressionDao mDao;

        public getMin(ImpressionDao impressionDao, List<ImpressionEntity> list, int i, long j) {
            super(list, i, j);
            this.mDao = impressionDao;
        }

        public final List<ImpressionEntity> getBy(long j, int i, int i2) {
            return this.mDao.getBy(j, i, i2);
        }

        public final void updateStatus(List<Long> list, int i) {
            this.mDao.updateStatus(list, i);
        }
    }
}
