package o;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

public interface AppCompatButton {
    @NonNull
    ListenableFuture<Void> getMax(@NonNull UUID uuid, @NonNull updateAppearance updateappearance);
}
