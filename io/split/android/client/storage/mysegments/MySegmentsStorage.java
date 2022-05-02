package io.split.android.client.storage.mysegments;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;

public interface MySegmentsStorage {
    void clear();

    Set<String> getAll();

    void loadLocal();

    void set(@NonNull List<String> list);
}
