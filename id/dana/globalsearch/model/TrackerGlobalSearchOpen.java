package id.dana.globalsearch.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/globalsearch/model/TrackerGlobalSearchOpen;", "", "()V", "openGlobalSearchType", "", "getGlobalSearchOpenType", "setGlobalSearchOpen", "", "source", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class TrackerGlobalSearchOpen {
    @NotNull
    public static final TrackerGlobalSearchOpen INSTANCE = new TrackerGlobalSearchOpen();
    private static String openGlobalSearchType = "Deeplink";

    private TrackerGlobalSearchOpen() {
    }

    @NotNull
    public final String getGlobalSearchOpenType() {
        return openGlobalSearchType;
    }

    @JvmStatic
    public static final void setGlobalSearchOpen(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        openGlobalSearchType = str;
    }
}
