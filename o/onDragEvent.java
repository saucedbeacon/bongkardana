package o;

import androidx.annotation.NonNull;
import java.util.List;

public interface onDragEvent {
    void getMax(@NonNull List<String> list);

    void getMin(@NonNull List<String> list);
}
