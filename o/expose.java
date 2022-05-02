package o;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lid/dana/utils/RegexUtil;", "", "()V", "numberToPin", "", "pin", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class expose {
    @NotNull
    public static final expose getMax = new expose();

    private expose() {
    }

    @JvmStatic
    @Nullable
    public static final String length(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return new Regex("[0-9]").replace((CharSequence) str, "*");
    }
}
