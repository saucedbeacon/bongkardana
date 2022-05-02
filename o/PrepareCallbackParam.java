package o;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/data/util/BuildConfigUtils;", "", "()V", "getProductFlavor", "", "isDebugMode", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PrepareCallbackParam {
    @NotNull
    public static final PrepareCallbackParam INSTANCE = new PrepareCallbackParam();

    @JvmStatic
    @NotNull
    public static final String getProductFlavor() {
        return "production";
    }

    @JvmStatic
    public static final boolean isDebugMode() {
        return false;
    }

    private PrepareCallbackParam() {
    }
}
