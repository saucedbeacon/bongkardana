package id.dana.base;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import id.dana.base.Key;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H$J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lid/dana/base/BaseKey;", "Lid/dana/base/Key;", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "getFragmentTag", "", "newFragment", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class BaseKey implements Key {
    /* access modifiers changed from: protected */
    @NotNull
    public abstract Fragment getMin();

    @NotNull
    public final Fragment getMax() {
        Fragment min = getMin();
        Bundle arguments = min.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Intrinsics.checkNotNullExpressionValue(arguments, "fragment.arguments ?: Bundle()");
        arguments.putParcelable(Key.setMin.setMax(), this);
        min.setArguments(arguments);
        return min;
    }
}
