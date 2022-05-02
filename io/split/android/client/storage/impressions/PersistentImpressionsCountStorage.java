package io.split.android.client.storage.impressions;

import androidx.annotation.NonNull;
import io.split.android.client.storage.StoragePusher;
import java.util.List;
import o.reloadLiteVMInstance;

public interface PersistentImpressionsCountStorage extends StoragePusher<reloadLiteVMInstance> {
    void delete(@NonNull List<reloadLiteVMInstance> list);

    void deleteInvalid(long j);

    List<reloadLiteVMInstance> pop(int i);

    void pushMany(@NonNull List<reloadLiteVMInstance> list);

    void setActive(@NonNull List<reloadLiteVMInstance> list);
}
