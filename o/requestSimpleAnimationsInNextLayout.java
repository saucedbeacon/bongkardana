package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zhuinden.statebundle.StateBundle;

public interface requestSimpleAnimationsInNextLayout {
    void fromBundle(@Nullable StateBundle stateBundle);

    @NonNull
    StateBundle toBundle();
}
