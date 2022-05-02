package o;

import com.alibaba.fastjson.JSONObject;
import com.iap.ac.config.lite.ConfigCenter;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lid/dana/util/AmcsConfigUtils;", "", "()V", "getNumberConfig", "", "key", "", "defa", "getObjectConfig", "Lcom/alibaba/fastjson/JSONObject;", "default", "section", "getStringConfig", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setLeftSelected {
    @NotNull
    public static final setLeftSelected getMin = new setLeftSelected();

    private setLeftSelected() {
    }

    @JvmStatic
    @NotNull
    public static final Number getMin(@NotNull String str, @NotNull Number number) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(number, "defa");
        Number numberConfig = ConfigCenter.getInstance().getNumberConfig(str, number);
        Intrinsics.checkNotNullExpressionValue(numberConfig, "ConfigCenter.getInstance…etNumberConfig(key, defa)");
        return numberConfig;
    }

    @JvmStatic
    @Nullable
    public static final JSONObject setMin(@NotNull String str, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(jSONObject, "default");
        return getPositiveString.parseObject(ConfigCenter.getInstance().getJSONConfig(str, getPositiveString.parseObject(jSONObject)));
    }
}
