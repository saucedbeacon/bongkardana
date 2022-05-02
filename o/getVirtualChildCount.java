package o;

import androidx.annotation.RestrictTo;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0003"}, d2 = {"shouldBeVisible", "", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "core"}, k = 2, mv = {1, 1, 16})
public final class getVirtualChildCount {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean shouldBeVisible(@Nullable DialogActionButtonLayout dialogActionButtonLayout) {
        if (dialogActionButtonLayout == null) {
            return false;
        }
        return ((dialogActionButtonLayout.getVisibleButtons().length == 0) ^ true) || layoutHorizontal.isVisible(dialogActionButtonLayout.getCheckBoxPrompt());
    }
}
