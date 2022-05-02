package o;

import id.dana.data.ProductFlavor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/globalnetwork/UserAgentFactoryUtil;", "", "()V", "H5_ONLINE_LOCALHOST", "", "getUserAgent", "userAgent", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBLEConnectMaxTimeout {
    @NotNull
    public static final getBLEConnectMaxTimeout length = new getBLEConnectMaxTimeout();

    private getBLEConnectMaxTimeout() {
    }

    @JvmStatic
    @NotNull
    public static final String length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userAgent");
        if (Intrinsics.areEqual((Object) "production", (Object) "production") || Intrinsics.areEqual((Object) ProductFlavor.PREPROD, (Object) "production")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" incontainerdebug/1.0.0");
        String obj = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "sbH5OnlineLocalhost.appe…INE_LOCALHOST).toString()");
        return obj;
    }
}
