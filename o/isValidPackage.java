package o;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isValidPackage {
    public abstract int before();

    public abstract int count();

    public abstract int start();

    @NonNull
    public abstract CharSequence text();

    @NonNull
    public abstract TextView view();

    @CheckResult
    @NonNull
    public static isValidPackage create(@NonNull TextView textView, @NonNull CharSequence charSequence, int i, int i2, int i3) {
        return new onUnsubscribe(textView, charSequence, i, i2, i3);
    }

    isValidPackage() {
    }
}
