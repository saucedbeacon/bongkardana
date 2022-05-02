package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ContentInfoCompat;

public interface onPostCreate {
    @Nullable
    ContentInfoCompat onReceiveContent(@NonNull ContentInfoCompat contentInfoCompat);
}
