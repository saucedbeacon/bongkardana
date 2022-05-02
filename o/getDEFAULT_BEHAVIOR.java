package o;

import com.alibaba.fastjson.JSONObject;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lid/dana/danah5/nfcutility/NfcUtilityResultFactory;", "", "()V", "getNfcError", "Lcom/alibaba/fastjson/JSONObject;", "errorCode", "", "getResultSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getDEFAULT_BEHAVIOR {
    @NotNull
    public static final getDEFAULT_BEHAVIOR INSTANCE = new getDEFAULT_BEHAVIOR();

    private getDEFAULT_BEHAVIOR() {
    }

    @JvmStatic
    @NotNull
    public static final JSONObject getResultSuccess() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", Boolean.TRUE);
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    public static final JSONObject getNfcError(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        JSONObject jSONObject = new JSONObject();
        Map map = jSONObject;
        map.put("success", Boolean.FALSE);
        map.put("errorCode", str);
        return jSONObject;
    }
}
