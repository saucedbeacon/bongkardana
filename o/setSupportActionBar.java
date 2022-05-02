package o;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.RestrictTo;

public final class setSupportActionBar {
    private Object getMin;

    private setSupportActionBar(Object obj) {
        this.getMin = obj;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Object setMax() {
        return this.getMin;
    }

    public static setSupportActionBar getMax(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new setSupportActionBar(PointerIcon.getSystemIcon(context, i));
        }
        return new setSupportActionBar((Object) null);
    }
}
