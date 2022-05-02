package o;

import android.text.Editable;
import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class onCustomAction {
    @Nullable
    public abstract Editable editable();

    @NonNull
    public abstract TextView view();

    @CheckResult
    @NonNull
    public static onCustomAction create(@NonNull TextView textView, @Nullable Editable editable) {
        return new attachToBaseContext(textView, editable);
    }

    onCustomAction() {
    }
}
