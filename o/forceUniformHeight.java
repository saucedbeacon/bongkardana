package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.AttrRes;
import androidx.annotation.CheckResult;
import androidx.annotation.FontRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0002\u001a+\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"safeGetFont", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "res", "", "font", "Lcom/afollestad/materialdialogs/MaterialDialog;", "attr", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/graphics/Typeface;", "core"}, k = 2, mv = {1, 1, 16})
public final class forceUniformHeight {
    public static /* synthetic */ Typeface font$default(isBaselineAligned isbaselinealigned, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return font(isbaselinealigned, num, num2);
    }

    /* JADX INFO: finally extract failed */
    @CheckResult
    @Nullable
    public static final Typeface font(@NotNull isBaselineAligned isbaselinealigned, @FontRes @Nullable Integer num, @Nullable @AttrRes Integer num2) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$font");
        layoutVertical.INSTANCE.assertOneSet("font", num2, num);
        if (num != null) {
            return safeGetFont(isbaselinealigned.getWindowContext(), num.intValue());
        }
        if (num2 != null) {
            TypedArray obtainStyledAttributes = isbaselinealigned.getWindowContext().getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId == 0) {
                    obtainStyledAttributes.recycle();
                    return null;
                }
                Typeface safeGetFont = safeGetFont(isbaselinealigned.getWindowContext(), resourceId);
                obtainStyledAttributes.recycle();
                return safeGetFont;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private static final Typeface safeGetFont(Context context, @FontRes int i) {
        try {
            return OptIn.length(context, i);
        } catch (Throwable unused) {
            return null;
        }
    }
}
