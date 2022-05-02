package io.split.android.client.storage.db;

import androidx.annotation.RestrictTo;
import io.split.android.client.storage.events.PersistentEventsStorage;
import io.split.android.client.storage.impressions.PersistentImpressionsCountStorage;
import io.split.android.client.storage.impressions.PersistentImpressionsStorage;
import io.split.android.client.storage.mysegments.MySegmentsStorage;
import io.split.android.client.storage.splits.PersistentSplitsStorage;
import io.split.android.client.storage.splits.SplitsStorage;
import o.IUMIDComponent;
import o.IUMIDInitListener;
import o.encryptSecretData;
import o.initUMID;
import o.initUMIDSync;
import o.isSecretExist;
import o.setOnlineHost;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class StorageFactory {
    public static SplitsStorage getSplitsStorage(SplitRoomDatabase splitRoomDatabase) {
        return new initUMIDSync(new IUMIDInitListener(splitRoomDatabase));
    }

    public static MySegmentsStorage getMySegmentsStorage(SplitRoomDatabase splitRoomDatabase, String str) {
        return new initUMID(new setOnlineHost(splitRoomDatabase, str));
    }

    public static PersistentSplitsStorage getPersistentSplitsStorage(SplitRoomDatabase splitRoomDatabase) {
        return new IUMIDInitListener(splitRoomDatabase);
    }

    public static PersistentImpressionsStorage getPersistenImpressionsStorage(SplitRoomDatabase splitRoomDatabase) {
        return new isSecretExist(splitRoomDatabase, 7776000);
    }

    public static PersistentEventsStorage getPersistenEventsStorage(SplitRoomDatabase splitRoomDatabase) {
        return new encryptSecretData(splitRoomDatabase, 7776000);
    }

    public static PersistentImpressionsCountStorage getPersistenImpressionsCountStorage(SplitRoomDatabase splitRoomDatabase) {
        return new IUMIDComponent(splitRoomDatabase, 7776000);
    }
}
