package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.gson.JsonParseException;
import io.split.android.client.dtos.Event;
import io.split.android.client.dtos.Identifiable;
import io.split.android.client.storage.db.EventDao;
import io.split.android.client.storage.db.EventEntity;
import io.split.android.client.storage.db.SplitRoomDatabase;
import io.split.android.client.storage.events.PersistentEventsStorage;
import java.util.List;
import o.saveSecret;

public final class encryptSecretData extends saveSecret<EventEntity, Event> implements PersistentEventsStorage {
    final EventDao mDao;
    final SplitRoomDatabase mDatabase;

    public final void insert(@NonNull List<EventEntity> list) {
    }

    public final /* bridge */ /* synthetic */ void push(@NonNull Object obj) {
        super.push((Identifiable) obj);
    }

    public encryptSecretData(@NonNull SplitRoomDatabase splitRoomDatabase, long j) {
        super(j);
        SplitRoomDatabase splitRoomDatabase2 = (SplitRoomDatabase) Preconditions.checkNotNull(splitRoomDatabase);
        this.mDatabase = splitRoomDatabase2;
        this.mDao = splitRoomDatabase2.eventDao();
    }

    /* access modifiers changed from: protected */
    public final void insert(@NonNull EventEntity eventEntity) {
        this.mDao.insert(eventEntity);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final EventEntity entityForModel(@NonNull Event event) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setStatus(0);
        eventEntity.setBody(IUMIDInitListenerEx.toJson(event));
        eventEntity.setCreatedAt(System.currentTimeMillis() / 1000);
        return eventEntity;
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

    public final void runInTransaction(List<EventEntity> list, int i, long j) {
        this.mDatabase.runInTransaction((Runnable) new getMax(this.mDao, list, i, j));
    }

    /* access modifiers changed from: protected */
    public final Event entityToModel(EventEntity eventEntity) throws JsonParseException {
        Event event = (Event) IUMIDInitListenerEx.fromJson(eventEntity.getBody(), Event.class);
        event.storageId = eventEntity.getId();
        return event;
    }

    static class getMax extends saveSecret.length<EventEntity, Event> {
        final EventDao mDao;

        getMax(EventDao eventDao, List<EventEntity> list, int i, long j) {
            super(list, i, j);
            this.mDao = eventDao;
        }

        public final List<EventEntity> getBy(long j, int i, int i2) {
            return this.mDao.getBy(j, i, i2);
        }

        public final void updateStatus(List<Long> list, int i) {
            this.mDao.updateStatus(list, i);
        }
    }
}
