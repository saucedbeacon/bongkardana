package o;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.StyleRes;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\b"}, d2 = {"inferTheme", "", "context", "Landroid/content/Context;", "dialogBehavior", "Lcom/afollestad/materialdialogs/DialogBehavior;", "inferThemeIsLight", "", "core"}, k = 2, mv = {1, 1, 16})
public final class setMeasureWithLargestChildEnabled {
    @CheckResult
    @StyleRes
    public static final int inferTheme(@NotNull Context context, @NotNull drawHorizontalDivider drawhorizontaldivider) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(drawhorizontaldivider, "dialogBehavior");
        return drawhorizontaldivider.getThemeRes(!inferThemeIsLight(context));
    }

    @CheckResult
    public static final boolean inferThemeIsLight(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        layoutVertical layoutvertical = layoutVertical.INSTANCE;
        return layoutVertical.isColorDark$default(layoutvertical, layoutVertical.resolveColor$default(layoutvertical, context, (Integer) null, 16842806, (Function0) null, 10, (Object) null), 0.0d, 1, (Object) null);
    }
}
