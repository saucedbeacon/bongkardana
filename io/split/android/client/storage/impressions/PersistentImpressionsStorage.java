package io.split.android.client.storage.impressions;

import androidx.annotation.NonNull;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.storage.StoragePusher;
import java.util.List;

public interface PersistentImpressionsStorage extends StoragePusher<KeyImpression> {
    void delete(@NonNull List<KeyImpression> list);

    void deleteInvalid(long j);

    List<KeyImpression> pop(int i);

    void pushMany(@NonNull List<KeyImpression> list);

    void setActive(@NonNull List<KeyImpression> list);
}
