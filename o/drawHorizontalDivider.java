package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bH&J\"\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH&J1\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\r2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"Lcom/afollestad/materialdialogs/DialogBehavior;", "", "createView", "Landroid/view/ViewGroup;", "creatingContext", "Landroid/content/Context;", "dialogWindow", "Landroid/view/Window;", "layoutInflater", "Landroid/view/LayoutInflater;", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getDialogLayout", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "root", "getThemeRes", "", "isDark", "", "onDismiss", "onPostShow", "", "onPreShow", "setBackgroundColor", "view", "color", "cornerRadius", "", "setWindowConstraints", "context", "window", "maxWidth", "(Landroid/content/Context;Landroid/view/Window;Lcom/afollestad/materialdialogs/internal/main/DialogLayout;Ljava/lang/Integer;)V", "core"}, k = 1, mv = {1, 1, 16})
public interface drawHorizontalDivider {
    @NotNull
    ViewGroup createView(@NotNull Context context, @NotNull Window window, @NotNull LayoutInflater layoutInflater, @NotNull isBaselineAligned isbaselinealigned);

    @NotNull
    DialogLayout getDialogLayout(@NotNull ViewGroup viewGroup);

    @StyleRes
    int getThemeRes(boolean z);

    boolean onDismiss();

    void onPostShow(@NotNull isBaselineAligned isbaselinealigned);

    void onPreShow(@NotNull isBaselineAligned isbaselinealigned);

    void setBackgroundColor(@NotNull DialogLayout dialogLayout, @ColorInt int i, float f);

    void setWindowConstraints(@NotNull Context context, @NotNull Window window, @NotNull DialogLayout dialogLayout, @Px @Nullable Integer num);
}
