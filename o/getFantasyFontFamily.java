package o;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0003¨\u0006\u0006"}, d2 = {"toMutableListOfJSONObject", "", "Lcom/alibaba/fastjson/JSONObject;", "Lcom/alibaba/fastjson/JSONArray;", "toMutableListOfString", "", "domain_release"}, k = 2, mv = {1, 4, 2})
public final class getFantasyFontFamily {
    @NotNull
    public static final List<String> toMutableListOfString(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "$this$toMutableListOfString");
        int size = jSONArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    @NotNull
    public static final List<JSONObject> toMutableListOfJSONObject(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "$this$toMutableListOfJSONObject");
        int size = jSONArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(jSONArray.getJSONObject(i));
        }
        return arrayList;
    }
}
