package o;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lid/dana/danah5/bioutility/BioUtilityResultFactory;", "", "()V", "getError", "Lcom/alibaba/fastjson/JSONObject;", "errorCode", "", "getResult", "bioUtilitySuccessResult", "Lid/dana/danah5/bioutility/BioUtilitySuccessResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getDismissListeners$core {
    @NotNull
    public static final getDismissListeners$core INSTANCE = new getDismissListeners$core();

    private getDismissListeners$core() {
    }

    @JvmStatic
    @NotNull
    public static final JSONObject getResult(@NotNull getPreShowListeners$core getpreshowlisteners_core) {
        Intrinsics.checkNotNullParameter(getpreshowlisteners_core, "bioUtilitySuccessResult");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        jSONObject.put("data", JSON.toJSON(getpreshowlisteners_core));
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    public static final JSONObject getError(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) str);
        return jSONObject;
    }
}
