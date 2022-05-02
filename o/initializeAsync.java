package o;

import androidx.annotation.NonNull;
import io.split.android.client.dtos.Event;
import io.split.android.client.service.http.HttpRequestBodySerializer;
import java.util.List;

public final class initializeAsync implements HttpRequestBodySerializer<List<Event>> {
    public final String serialize(@NonNull List<Event> list) {
        return IUMIDInitListenerEx.toJson(list);
    }
}
