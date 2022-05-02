package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import io.split.android.client.dtos.Identifiable;
import io.split.android.client.dtos.KeyImpression;
import java.util.ArrayList;
import java.util.List;

public abstract class saveSecret<E extends Identifiable, M extends Identifiable> {
    protected static final int MAX_ROWS_PER_QUERY = 100;
    protected long mExpirationPeriod;

    /* access modifiers changed from: protected */
    public abstract void deleteById(@NonNull List<Long> list);

    /* access modifiers changed from: protected */
    public abstract int deleteByStatus(int i, long j);

    /* access modifiers changed from: protected */
    public abstract void deleteOutdated(long j);

    /* access modifiers changed from: protected */
    @NonNull
    public abstract E entityForModel(@NonNull M m);

    /* access modifiers changed from: protected */
    public abstract M entityToModel(E e) throws JsonParseException;

    /* access modifiers changed from: protected */
    public abstract void insert(@NonNull E e);

    /* access modifiers changed from: protected */
    public abstract void insert(@NonNull List<E> list);

    /* access modifiers changed from: protected */
    public abstract void runInTransaction(List<E> list, int i, long j);

    /* access modifiers changed from: protected */
    public abstract void updateStatus(@NonNull List<Long> list, int i);

    public saveSecret(long j) {
        this.mExpirationPeriod = j;
    }

    public void push(@NonNull M m) {
        if (m != null) {
            insert(entityForModel(m));
        }
    }

    public void pushMany(@NonNull List<M> list) {
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (M entityForModel : list) {
                arrayList.add(entityForModel(entityForModel));
            }
            insert(arrayList);
        }
    }

    public List<M> pop(int i) {
        ArrayList arrayList = new ArrayList();
        do {
            int min = Math.min(100, i);
            ArrayList arrayList2 = new ArrayList();
            runInTransaction(arrayList2, min, this.mExpirationPeriod);
            int size = arrayList2.size();
            i -= size;
            arrayList.addAll(arrayList2);
            if (size <= 0) {
                break;
            }
        } while (i > 0);
        return entitiesToModels(arrayList);
    }

    public void setActive(@NonNull List<M> list) {
        Preconditions.checkNotNull(list);
        if (list.size() != 0) {
            for (List<Long> updateStatus : getIdInChunks(list)) {
                updateStatus(updateStatus, 0);
            }
        }
    }

    public List<KeyImpression> getCritical() {
        return new ArrayList();
    }

    public void delete(@NonNull List<M> list) {
        Preconditions.checkNotNull(list);
        if (list.size() != 0) {
            for (List<Long> deleteById : getIdInChunks(list)) {
                deleteById(deleteById);
            }
        }
    }

    public void deleteInvalid(long j) {
        int i = 1;
        while (i > 0) {
            i = deleteByStatus(1, j);
        }
        deleteOutdated(expirationTime());
    }

    private long expirationTime() {
        return (System.currentTimeMillis() / 1000) - this.mExpirationPeriod;
    }

    private List<M> entitiesToModels(List<E> list) {
        ArrayList arrayList = new ArrayList();
        for (E entityToModel : list) {
            try {
                arrayList.add(entityToModel(entityToModel));
            } catch (JsonParseException e) {
                StringBuilder sb = new StringBuilder("Error parsing stored entity: ");
                sb.append(e.getLocalizedMessage());
                createLoadingDialog.e(sb.toString());
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder("Unknown error parsing stored entity: ");
                sb2.append(e2.getLocalizedMessage());
                createLoadingDialog.e(sb2.toString());
            }
        }
        return arrayList;
    }

    private List<List<Long>> getIdInChunks(List<M> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return new ArrayList();
        }
        for (M id2 : list) {
            arrayList.add(Long.valueOf(id2.getId()));
        }
        return Lists.partition(arrayList, 100);
    }

    public static abstract class length<E extends Identifiable, M> implements Runnable {
        int mCount;
        List<E> mEntities;
        long mExpirationPeriod;

        /* access modifiers changed from: protected */
        public abstract List<E> getBy(long j, int i, int i2);

        /* access modifiers changed from: protected */
        public abstract void updateStatus(List<Long> list, int i);

        public length(List<E> list, int i, long j) {
            this.mEntities = (List) Preconditions.checkNotNull(list);
            this.mCount = i;
            this.mExpirationPeriod = j;
        }

        public void run() {
            this.mEntities.addAll(getBy((System.currentTimeMillis() / 1000) - this.mExpirationPeriod, 0, this.mCount));
            updateStatus(getEntitiesId(this.mEntities), 1);
        }

        private List<Long> getEntitiesId(List<E> list) {
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                return arrayList;
            }
            for (E id2 : list) {
                arrayList.add(Long.valueOf(id2.getId()));
            }
            return arrayList;
        }
    }
}
