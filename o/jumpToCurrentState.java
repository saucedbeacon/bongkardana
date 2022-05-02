package o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class jumpToCurrentState {
    @Nullable
    public abstract View getMin(@IdRes int i);

    public abstract boolean setMin();

    @NonNull
    @Deprecated
    public static Fragment getMax(@NonNull Context context, @NonNull String str) {
        return Fragment.instantiate(context, str, (Bundle) null);
    }
}
