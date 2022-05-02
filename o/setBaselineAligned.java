package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import o.isMeasureWithLargestChildEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J/\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"Lcom/afollestad/materialdialogs/ModalDialog;", "Lcom/afollestad/materialdialogs/DialogBehavior;", "()V", "createView", "Landroid/view/ViewGroup;", "creatingContext", "Landroid/content/Context;", "dialogWindow", "Landroid/view/Window;", "layoutInflater", "Landroid/view/LayoutInflater;", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getDialogLayout", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "root", "getThemeRes", "", "isDark", "", "onDismiss", "onPostShow", "", "onPreShow", "setBackgroundColor", "view", "color", "cornerRadius", "", "setWindowConstraints", "context", "window", "maxWidth", "(Landroid/content/Context;Landroid/view/Window;Lcom/afollestad/materialdialogs/internal/main/DialogLayout;Ljava/lang/Integer;)V", "core"}, k = 1, mv = {1, 1, 16})
public final class setBaselineAligned implements drawHorizontalDivider {
    public static final setBaselineAligned INSTANCE = new setBaselineAligned();

    public final boolean onDismiss() {
        return false;
    }

    public final void onPreShow(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, ImagePickerEvent.DIALOG);
    }

    private setBaselineAligned() {
    }

    public final int getThemeRes(boolean z) {
        if (z) {
            return isMeasureWithLargestChildEnabled.toIntRange.MD_Dark;
        }
        return isMeasureWithLargestChildEnabled.toIntRange.MD_Light;
    }

    @NotNull
    @SuppressLint({"InflateParams"})
    public final ViewGroup createView(@NotNull Context context, @NotNull Window window, @NotNull LayoutInflater layoutInflater, @NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(context, "creatingContext");
        Intrinsics.checkParameterIsNotNull(window, "dialogWindow");
        Intrinsics.checkParameterIsNotNull(layoutInflater, "layoutInflater");
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, ImagePickerEvent.DIALOG);
        View inflate = layoutInflater.inflate(isMeasureWithLargestChildEnabled.setMin.md_dialog_base, (ViewGroup) null, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @NotNull
    public final DialogLayout getDialogLayout(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "root");
        return (DialogLayout) viewGroup;
    }

    public final void setWindowConstraints(@NotNull Context context, @NotNull Window window, @NotNull DialogLayout dialogLayout, @Nullable Integer num) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(1501063488, oncanceled);
            onCancelLoad.getMin(1501063488, oncanceled);
        }
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(window, "window");
        Intrinsics.checkParameterIsNotNull(dialogLayout, "view");
        if (num == null || num.intValue() != 0) {
            window.setSoftInputMode(16);
            WindowManager windowManager = window.getWindowManager();
            if (windowManager != null) {
                Resources resources = context.getResources();
                Pair<Integer, Integer> widthAndHeight = layoutVertical.INSTANCE.getWidthAndHeight(windowManager);
                int intValue = widthAndHeight.component1().intValue();
                dialogLayout.setMaxHeight(widthAndHeight.component2().intValue() - (resources.getDimensionPixelSize(isMeasureWithLargestChildEnabled.setMax.md_dialog_vertical_margin) * 2));
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = Math.min(num != null ? num.intValue() : resources.getDimensionPixelSize(isMeasureWithLargestChildEnabled.setMax.md_dialog_max_width), intValue - (resources.getDimensionPixelSize(isMeasureWithLargestChildEnabled.setMax.md_dialog_horizontal_margin) * 2));
                window.setAttributes(layoutParams);
            }
        }
    }

    public final void setBackgroundColor(@NotNull DialogLayout dialogLayout, @ColorInt int i, float f) {
        Intrinsics.checkParameterIsNotNull(dialogLayout, "view");
        dialogLayout.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        dialogLayout.setBackground(gradientDrawable);
    }

    public final void onPostShow(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, ImagePickerEvent.DIALOG);
        DialogActionButton actionButton = getBaselineAlignedChildIndex.getActionButton(isbaselinealigned, WhichButton.NEGATIVE);
        if (layoutHorizontal.isVisible(actionButton)) {
            actionButton.post(new getMin(actionButton));
            return;
        }
        DialogActionButton actionButton2 = getBaselineAlignedChildIndex.getActionButton(isbaselinealigned, WhichButton.POSITIVE);
        if (layoutHorizontal.isVisible(actionButton2)) {
            actionButton2.post(new setMax(actionButton2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
    static final class getMin implements Runnable {
        final /* synthetic */ DialogActionButton $negativeBtn;

        getMin(DialogActionButton dialogActionButton) {
            this.$negativeBtn = dialogActionButton;
        }

        public final void run() {
            this.$negativeBtn.requestFocus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
    static final class setMax implements Runnable {
        final /* synthetic */ DialogActionButton $positiveBtn;

        setMax(DialogActionButton dialogActionButton) {
            this.$positiveBtn = dialogActionButton;
        }

        public final void run() {
            this.$positiveBtn.requestFocus();
        }
    }
}
