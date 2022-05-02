package id.dana.danah5;

import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverAmcsLiteConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0017¨\u0006\u0006"}, d2 = {"id/dana/danah5/DanaH5Injector$mockConfigProxy$1", "Lcom/alibaba/griver/base/common/config/GriverAmcsLiteConfig;", "getConfig", "", "key", "defaultValue", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaH5Injector$mockConfigProxy$1 extends GriverAmcsLiteConfig {
    @Nullable
    @androidx.annotation.Nullable
    public final String getConfig(@NotNull String str, @Nullable @androidx.annotation.Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        if (Intrinsics.areEqual((Object) GriverConfigConstants.KEY_REQUEST_HTTP_CONTROL, (Object) str)) {
            return "{\"enable\":true,\"whitelist\":[]}";
        }
        return super.getConfig(str, str2);
    }
}
