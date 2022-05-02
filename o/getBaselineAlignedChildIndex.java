package o;

import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0002\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"getActionButton", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "which", "Lcom/afollestad/materialdialogs/WhichButton;", "hasActionButton", "", "hasActionButtons", "setActionButtonEnabled", "", "enabled", "core"}, k = 2, mv = {1, 1, 16})
public final class getBaselineAlignedChildIndex {
    public static final boolean hasActionButtons(@NotNull isBaselineAligned isbaselinealigned) {
        DialogActionButton[] visibleButtons;
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$hasActionButtons");
        DialogActionButtonLayout buttonsLayout = isbaselinealigned.getView().getButtonsLayout();
        if (!(buttonsLayout == null || (visibleButtons = buttonsLayout.getVisibleButtons()) == null)) {
            if (!(visibleButtons.length == 0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasActionButton(@NotNull isBaselineAligned isbaselinealigned, @NotNull WhichButton whichButton) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$hasActionButton");
        Intrinsics.checkParameterIsNotNull(whichButton, "which");
        return layoutHorizontal.isVisible(getActionButton(isbaselinealigned, whichButton));
    }

    @NotNull
    public static final DialogActionButton getActionButton(@NotNull isBaselineAligned isbaselinealigned, @NotNull WhichButton whichButton) {
        DialogActionButton[] actionButtons;
        DialogActionButton dialogActionButton;
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$getActionButton");
        Intrinsics.checkParameterIsNotNull(whichButton, "which");
        DialogActionButtonLayout buttonsLayout = isbaselinealigned.getView().getButtonsLayout();
        if (buttonsLayout != null && (actionButtons = buttonsLayout.getActionButtons()) != null && (dialogActionButton = actionButtons[whichButton.getIndex()]) != null) {
            return dialogActionButton;
        }
        throw new IllegalStateException("The dialog does not have an attached buttons layout.");
    }

    public static final void setActionButtonEnabled(@NotNull isBaselineAligned isbaselinealigned, @NotNull WhichButton whichButton, boolean z) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$setActionButtonEnabled");
        Intrinsics.checkParameterIsNotNull(whichButton, "which");
        getActionButton(isbaselinealigned, whichButton).setEnabled(z);
    }
}
