package o;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u001a\u001e\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u001a%\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\f\"\u00020\n¢\u0006\u0002\u0010\r\u001a\n\u0010\u000e\u001a\u00020\t*\u00020\n\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002\u001a\u001c\u0010\u0014\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0017\u001a\n\u0010\u0018\u001a\u00020\u0002*\u00020\u0002¨\u0006\u0019"}, d2 = {"bold", "Landroid/text/SpannableStringBuilder;", "", "targetText", "resultSpannable", "constructUrl", "params", "", "equalsAny", "", "", "find", "", "(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Z", "isAlphanumeric", "localize", "valInd", "setBoldedText", "Landroid/text/Spannable;", "boldedText", "setColoredText", "coloredText", "colorRes", "", "trimWhitespaces", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class MyBeaconServiceImpl {
    public static final boolean getMin(@Nullable CharSequence charSequence, @NotNull CharSequence... charSequenceArr) {
        Intrinsics.checkNotNullParameter(charSequenceArr, "find");
        return ArraysKt.contains((T[]) charSequenceArr, charSequence);
    }

    public static final boolean getMin(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "$this$isAlphanumeric");
        return new Regex("[A-Za-z0-9]+").matches(charSequence);
    }

    @NotNull
    public static final String length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$trimWhitespaces");
        CharSequence charSequence = str;
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) charSequence.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        return charSequence.subSequence(i, length + 1).toString();
    }
}
