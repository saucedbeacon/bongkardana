package o;

import android.text.TextUtils;
import com.iap.ac.config.lite.ConfigCenter;
import java.io.IOException;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.Draft_75;
import o.InvalidDataException;
import o.increaseBuffer;
import o.translateHandshake;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\u000b"}, d2 = {"Lid/dana/data/network/interceptor/ETagCacheInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isOpenETagCache", "", "url", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SendToNativeCallback implements increaseBuffer {
    @NotNull
    public final InvalidHandshakeException getMax(@NotNull increaseBuffer.setMax setmax) throws IOException {
        Intrinsics.checkNotNullParameter(setmax, "chain");
        InvalidDataException min = setmax.getMin();
        InvalidDataException.getMin getmin = new InvalidDataException.getMin(min);
        if (!getMin(min.setMin.getMax().toString())) {
            translateHandshake.setMin setmin = new translateHandshake.setMin();
            setmin.getMin = true;
            String obj = new translateHandshake(setmin).toString();
            if (obj.isEmpty()) {
                getmin.setMin.getMax("Cache-Control");
            } else {
                Draft_75.length length = getmin.setMin;
                Draft_75.setMin("Cache-Control");
                Draft_75.setMax(obj, "Cache-Control");
                length.getMax("Cache-Control");
                length.setMin.add("Cache-Control");
                length.setMin.add(obj.trim());
            }
        }
        if (getmin.getMin != null) {
            InvalidHandshakeException max = setmax.getMax(new InvalidDataException(getmin));
            Intrinsics.checkNotNullExpressionValue(max, "chain.proceed(reqBuilder.build())");
            return max;
        }
        throw new IllegalStateException("url == null");
    }

    private static boolean getMin(String str) {
        JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig("aphome_etag_whitelist");
        if (!(str == null || jSONArrayConfig == null)) {
            try {
                int length = jSONArrayConfig.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArrayConfig.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        Intrinsics.checkNotNullExpressionValue(string, "path");
                        if (StringsKt.startsWith$default(str, string, false, 2, (Object) null)) {
                            return true;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
