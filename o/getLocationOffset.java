package o;

import android.graphics.Color;
import androidx.annotation.AttrRes;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a;\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001a;\u0010\u000b\u001a\u00020\f*\u00020\u00052\u0006\u0010\r\u001a\u00020\f2%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0001¨\u0006\u0012"}, d2 = {"adjustAlpha", "", "alpha", "", "resolveColor", "Lcom/afollestad/materialdialogs/MaterialDialog;", "res", "attr", "fallback", "Lkotlin/Function0;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)I", "resolveColors", "", "attrs", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forAttr", "core"}, k = 2, mv = {1, 1, 16})
public final class getLocationOffset {
    public static /* synthetic */ int resolveColor$default(isBaselineAligned isbaselinealigned, Integer num, Integer num2, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return resolveColor(isbaselinealigned, num, num2, function0);
    }

    @CheckResult
    @ColorInt
    public static final int resolveColor(@NotNull isBaselineAligned isbaselinealigned, @Nullable @ColorRes Integer num, @Nullable @AttrRes Integer num2, @Nullable Function0<Integer> function0) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$resolveColor");
        return layoutVertical.INSTANCE.resolveColor(isbaselinealigned.getWindowContext(), num, num2, function0);
    }

    public static /* synthetic */ int[] resolveColors$default(isBaselineAligned isbaselinealigned, int[] iArr, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return resolveColors(isbaselinealigned, iArr, function1);
    }

    @CheckResult
    @NotNull
    public static final int[] resolveColors(@NotNull isBaselineAligned isbaselinealigned, @NotNull int[] iArr, @Nullable Function1<? super Integer, Integer> function1) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$resolveColors");
        Intrinsics.checkParameterIsNotNull(iArr, "attrs");
        return layoutVertical.INSTANCE.resolveColors(isbaselinealigned.getWindowContext(), iArr, function1);
    }

    @CheckResult
    @ColorInt
    public static final int adjustAlpha(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }
}
