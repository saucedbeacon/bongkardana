package o;

import com.iap.ac.config.lite.ConfigCenter;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/data/util/ConfigCenterHelper;", "", "()V", "getSection", "Lorg/json/JSONObject;", "section", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class fromString {
    @NotNull
    public static final fromString INSTANCE = new fromString();

    private fromString() {
    }

    @JvmStatic
    @Nullable
    public static final JSONObject getSection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "section");
        return ConfigCenter.getInstance().getSectionConfig(str);
    }
}
