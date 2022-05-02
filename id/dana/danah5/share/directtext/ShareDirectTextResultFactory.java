package id.dana.danah5.share.directtext;

import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lid/dana/danah5/share/directtext/ShareDirectTextResultFactory;", "", "()V", "getResult", "Lcom/alibaba/fastjson/JSONObject;", "errorType", "", "ErrorCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ShareDirectTextResultFactory {
    @NotNull
    public static final ShareDirectTextResultFactory INSTANCE = new ShareDirectTextResultFactory();

    private ShareDirectTextResultFactory() {
    }

    @NotNull
    public final JSONObject getResult(@Nullable String str) {
        String str2;
        if (Intrinsics.areEqual((Object) str, (Object) "SUCCESS")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", Boolean.TRUE);
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        Map map = jSONObject2;
        map.put("success", Boolean.FALSE);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -768805241) {
                if (hashCode == 532999017 && str.equals("NO_MESSAGE")) {
                    str2 = "003";
                    map.put("error", str2);
                    return jSONObject2;
                }
            } else if (str.equals("APPLICATION_NOT_FOUND")) {
                str2 = "004";
                map.put("error", str2);
                return jSONObject2;
            }
        }
        str2 = "001";
        map.put("error", str2);
        return jSONObject2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/danah5/share/directtext/ShareDirectTextResultFactory$ErrorCode;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    @interface ErrorCode {
        @NotNull
        public static final String APPLICATION_NOT_FOUND = "004";
        @NotNull
        public static final setMax Companion = setMax.$$INSTANCE;
        @NotNull
        public static final String ERROR_CODE_NO_MESSAGE = "003";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/share/directtext/ShareDirectTextResultFactory$ErrorCode$Companion;", "", "()V", "APPLICATION_NOT_FOUND", "", "ERROR_CODE_NO_MESSAGE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax {
            static final /* synthetic */ setMax $$INSTANCE = new setMax();
            @NotNull
            public static final String APPLICATION_NOT_FOUND = "004";
            @NotNull
            public static final String ERROR_CODE_NO_MESSAGE = "003";

            private setMax() {
            }
        }
    }
}
