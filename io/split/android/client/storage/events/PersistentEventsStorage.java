package io.split.android.client.storage.events;

import androidx.annotation.NonNull;
import io.split.android.client.dtos.Event;
import io.split.android.client.storage.StoragePusher;
import java.util.List;

public interface PersistentEventsStorage extends StoragePusher<Event> {
    void delete(@NonNull List<Event> list);

    void deleteInvalid(long j);

    List<Event> pop(int i);

    void setActive(@NonNull List<Event> list);
}
