package o;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/twilio/verify/networking/Response;", "", "body", "", "headers", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class removeAndRecycleScrapInt {
    @NotNull
    public final String getMin;
    @NotNull
    public final Map<String, List<String>> setMax;

    public removeAndRecycleScrapInt(@NotNull String str, @NotNull Map<String, ? extends List<String>> map) {
        Intrinsics.checkParameterIsNotNull(str, TtmlNode.TAG_BODY);
        Intrinsics.checkParameterIsNotNull(map, "headers");
        this.getMin = str;
        this.setMax = map;
    }
}
