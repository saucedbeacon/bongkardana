package o;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public final class getParentMenu {
    public final RoomDatabase getMax;
    @VisibleForTesting
    final Set<LiveData> getMin = Collections.newSetFromMap(new IdentityHashMap());

    getParentMenu(RoomDatabase roomDatabase) {
        this.getMax = roomDatabase;
    }
}
