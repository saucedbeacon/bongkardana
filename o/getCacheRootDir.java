package o;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TRACKING_SOURCE_PARAMS", "", "TRACKING_SOURCE_REQUEST_MONEY", "addSourceParam", "source", "containSourceParam", "", "removeDeepLinkSourceParam", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getCacheRootDir {
    public static final boolean setMax(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "$this$containSourceParam");
        Intrinsics.checkNotNullParameter(str2, "source");
        String format = String.format("?params=[source=%s]", Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) format, false, 2, (Object) null);
    }

    @NotNull
    public static final String getMax(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "$this$addSourceParam");
        Intrinsics.checkNotNullParameter(str2, "source");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String format = String.format("?params=[source=%s]", Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        sb.append(format);
        return sb.toString();
    }
}
