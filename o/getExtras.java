package o;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface getExtras {
    void getMax(@NonNull onEvent onevent, @NonNull MenuItem menuItem);

    void getMin(@NonNull onEvent onevent, @NonNull MenuItem menuItem);
}
