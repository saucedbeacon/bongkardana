package io.split.android.client.storage.mysegments;

import androidx.annotation.NonNull;
import java.util.List;

public interface PersistentMySegmentsStorage {
    void close();

    List<String> getSnapshot();

    void set(@NonNull List<String> list);
}
