package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface isInteractionEnabled {

    public interface setMin {
        void getMin(@NonNull fireTrigger<?> firetrigger);
    }

    void getMax();

    void getMax(int i);

    void getMax(@NonNull setMin setmin);

    @Nullable
    fireTrigger<?> length(@NonNull setPivotY setpivoty);

    @Nullable
    fireTrigger<?> setMin(@NonNull setPivotY setpivoty, @Nullable fireTrigger<?> firetrigger);
}
