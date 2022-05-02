package o;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

public interface setShowingForActionMode<T> {
    @NonNull
    List<Class<? extends setShowingForActionMode<?>>> getMin();

    @NonNull
    T setMin(@NonNull Context context);
}
