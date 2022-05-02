package o;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/twilio/verify/networking/FailureResponse;", "", "responseCode", "", "errorBody", "", "headers", "", "", "(ILjava/lang/String;Ljava/util/Map;)V", "getErrorBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getResponseCode", "()I", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class stopIgnoringView {
    public final int getMax;
    @Nullable
    public final Map<String, List<String>> setMax;
    @Nullable
    public final String setMin;

    public stopIgnoringView(int i, @Nullable String str, @Nullable Map<String, ? extends List<String>> map) {
        this.getMax = i;
        this.setMin = str;
        this.setMax = map;
    }
}
