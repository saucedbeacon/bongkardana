package o;

import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/utils/DanaTextWatcher;", "", "()V", "isTextWatcherAdded", "", "addTextChangedListener", "", "editText", "Landroid/widget/EditText;", "textWatcher", "Landroid/text/TextWatcher;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onSubmit {
    private boolean setMin;

    public final void getMax(@NotNull EditText editText, @NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        if (!this.setMin) {
            try {
                editText.addTextChangedListener(textWatcher);
            } catch (IndexOutOfBoundsException unused) {
            }
            this.setMin = true;
        }
    }
}
