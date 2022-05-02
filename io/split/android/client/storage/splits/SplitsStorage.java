package io.split.android.client.storage.splits;

import androidx.annotation.NonNull;
import io.split.android.client.dtos.Split;
import java.util.List;
import java.util.Map;
import o.getSecurityToken;

public interface SplitsStorage {
    void clear();

    Split get(@NonNull String str);

    Map<String, Split> getAll();

    Map<String, Split> getMany(@NonNull List<String> list);

    String getSplitsFilterQueryString();

    long getTill();

    long getUpdateTimestamp();

    boolean isValidTrafficType(@NonNull String str);

    void loadLocal();

    void update(getSecurityToken getsecuritytoken);

    void updateSplitsFilterQueryString(String str);

    void updateWithoutChecks(Split split);
}
