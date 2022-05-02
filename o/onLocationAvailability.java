package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class onLocationAvailability<T> extends getSystemLocation {
    @Nullable
    public T setMax;

    public onLocationAvailability(@NonNull String str, @Nullable T t) {
        super(str, (String) null);
        this.setMax = t;
    }
}
