package o;

import com.iap.ac.android.acs.plugin.utils.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"USER_CITY", "", "setUserCity", "", "cityName", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class desc {
    @NotNull
    public static final String USER_CITY = "city";

    @Nullable
    public static final String setUserCity(@NotNull Map<String, String> map, @NotNull String str) {
        Intrinsics.checkNotNullParameter(map, "$this$setUserCity");
        Intrinsics.checkNotNullParameter(str, Constants.KEY_CITY_NAME);
        return map.put(USER_CITY, str);
    }
}
