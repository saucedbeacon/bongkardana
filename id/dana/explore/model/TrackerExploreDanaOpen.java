package id.dana.explore.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/explore/model/TrackerExploreDanaOpen;", "", "()V", "exploreDanaSourceType", "", "getExploreDanaSourceType", "setExploreDanaOpen", "", "source", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class TrackerExploreDanaOpen {
    @NotNull
    public static final TrackerExploreDanaOpen INSTANCE = new TrackerExploreDanaOpen();
    private static String exploreDanaSourceType = "Home";

    private TrackerExploreDanaOpen() {
    }

    @NotNull
    public final String getExploreDanaSourceType() {
        return exploreDanaSourceType;
    }

    @JvmStatic
    public static final void setExploreDanaOpen(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        exploreDanaSourceType = str;
    }
}
