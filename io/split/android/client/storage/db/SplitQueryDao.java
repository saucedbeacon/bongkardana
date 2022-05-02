package io.split.android.client.storage.db;

import java.util.List;

public interface SplitQueryDao {
    List<SplitEntity> get(long j, int i);
}
