package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import io.split.android.client.storage.mysegments.MySegmentsStorage;
import io.split.android.client.storage.mysegments.PersistentMySegmentsStorage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class initUMID implements MySegmentsStorage {
    private Set<String> mInMemoryMySegments = Sets.newConcurrentHashSet();
    private PersistentMySegmentsStorage mPersistentStorage;

    public initUMID(@NonNull PersistentMySegmentsStorage persistentMySegmentsStorage) {
        this.mPersistentStorage = (PersistentMySegmentsStorage) Preconditions.checkNotNull(persistentMySegmentsStorage);
    }

    public final void loadLocal() {
        this.mInMemoryMySegments.addAll(this.mPersistentStorage.getSnapshot());
    }

    public final Set<String> getAll() {
        return this.mInMemoryMySegments;
    }

    public final void set(List<String> list) {
        if (list != null) {
            this.mInMemoryMySegments.clear();
            this.mInMemoryMySegments.addAll(list);
            this.mPersistentStorage.set(list);
        }
    }

    public final void clear() {
        this.mInMemoryMySegments.clear();
        this.mPersistentStorage.set(new ArrayList());
    }
}
