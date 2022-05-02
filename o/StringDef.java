package o;

import android.content.res.Configuration;
import android.os.Build;
import androidx.annotation.NonNull;

public final class StringDef {
    @NonNull
    public static TransitionRes getMin(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return TransitionRes.getMax(configuration.getLocales());
        }
        return TransitionRes.setMin(configuration.locale);
    }
}
