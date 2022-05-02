package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class previous {
    public abstract void getMin(@NonNull Runnable runnable);

    public abstract boolean getMin();

    public abstract void setMax(@NonNull Runnable runnable);
}
