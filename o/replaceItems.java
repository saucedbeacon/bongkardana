package o;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductResultFactory;", "", "()V", "getFailedResult", "Lcom/alibaba/fastjson/JSONObject;", "errorMessage", "", "getSuccessResult", "verifySecurityProductResult", "Lid/dana/danah5/twilioverifysecurityproduct/VerifySecurityProductResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class replaceItems {
    @NotNull
    public static final replaceItems INSTANCE = new replaceItems();

    private replaceItems() {
    }

    @NotNull
    public final JSONObject getSuccessResult(@NotNull checkAllItems checkallitems) {
        Intrinsics.checkNotNullParameter(checkallitems, "verifySecurityProductResult");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        jSONObject.put("data", JSON.toJSON(checkallitems));
        return jSONObject;
    }

    @NotNull
    public final JSONObject getFailedResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorMessage");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) str);
        return jSONObject;
    }
}
