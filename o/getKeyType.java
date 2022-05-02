package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.storage.events.PersistentEventsStorage;
import io.split.android.client.storage.impressions.PersistentImpressionsCountStorage;
import io.split.android.client.storage.impressions.PersistentImpressionsStorage;
import io.split.android.client.storage.mysegments.MySegmentsStorage;
import io.split.android.client.storage.splits.PersistentSplitsStorage;
import io.split.android.client.storage.splits.SplitsStorage;

public class getKeyType {
    private final MySegmentsStorage mMySegmentsStorage;
    private final PersistentEventsStorage mPersistentEventsStorage;
    private final PersistentImpressionsCountStorage mPersistentImpressionsCountStorage;
    private final PersistentImpressionsStorage mPersistentImpressionsStorage;
    private final PersistentSplitsStorage mPersistentSplitsStorage;
    private final SplitsStorage mSplitStorage;

    public getKeyType(@NonNull SplitsStorage splitsStorage, @NonNull MySegmentsStorage mySegmentsStorage, @NonNull PersistentSplitsStorage persistentSplitsStorage, @NonNull PersistentEventsStorage persistentEventsStorage, @NonNull PersistentImpressionsStorage persistentImpressionsStorage, @NonNull PersistentImpressionsCountStorage persistentImpressionsCountStorage) {
        this.mSplitStorage = (SplitsStorage) Preconditions.checkNotNull(splitsStorage);
        this.mMySegmentsStorage = (MySegmentsStorage) Preconditions.checkNotNull(mySegmentsStorage);
        this.mPersistentSplitsStorage = (PersistentSplitsStorage) Preconditions.checkNotNull(persistentSplitsStorage);
        this.mPersistentEventsStorage = (PersistentEventsStorage) Preconditions.checkNotNull(persistentEventsStorage);
        this.mPersistentImpressionsStorage = (PersistentImpressionsStorage) Preconditions.checkNotNull(persistentImpressionsStorage);
        this.mPersistentImpressionsCountStorage = (PersistentImpressionsCountStorage) Preconditions.checkNotNull(persistentImpressionsCountStorage);
    }

    public SplitsStorage getSplitsStorage() {
        return this.mSplitStorage;
    }

    public MySegmentsStorage getMySegmentsStorage() {
        return this.mMySegmentsStorage;
    }

    public PersistentSplitsStorage getPersistentSplitsStorage() {
        return this.mPersistentSplitsStorage;
    }

    public PersistentEventsStorage getEventsStorage() {
        return this.mPersistentEventsStorage;
    }

    public PersistentImpressionsStorage getImpressionsStorage() {
        return this.mPersistentImpressionsStorage;
    }

    public PersistentImpressionsCountStorage getImpressionsCountStorage() {
        return this.mPersistentImpressionsCountStorage;
    }
}
