package o;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class setSessionToken {
    public abstract int actionId();

    @Nullable
    public abstract KeyEvent keyEvent();

    @NonNull
    public abstract TextView view();

    @CheckResult
    @NonNull
    public static setSessionToken create(@NonNull TextView textView, int i, @Nullable KeyEvent keyEvent) {
        return new onSubscribe(textView, i, keyEvent);
    }

    setSessionToken() {
    }
}
