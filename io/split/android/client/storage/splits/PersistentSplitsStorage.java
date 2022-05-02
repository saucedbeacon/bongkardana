package io.split.android.client.storage.splits;

import io.split.android.client.dtos.Split;
import java.util.List;
import o.getSecurityToken;
import o.registerInitListener;

public interface PersistentSplitsStorage {
    void clear();

    void close();

    void delete(List<String> list);

    List<Split> getAll();

    String getFilterQueryString();

    registerInitListener getSnapshot();

    void update(Split split);

    boolean update(getSecurityToken getsecuritytoken);

    void updateFilterQueryString(String str);
}
