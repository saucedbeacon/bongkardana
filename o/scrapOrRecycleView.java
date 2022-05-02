package o;

import android.net.Uri;
import com.twilio.verify.networking.HttpMethod;
import com.twilio.verify.networking.MediaTypeHeader;
import com.twilio.verify.networking.MediaTypeValue;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0019BK\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u001e\u0010\u0016\u001a\u00020\b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0002J \u0010\u0018\u001a\u0004\u0018\u00010\b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0002R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/twilio/verify/networking/Request;", "", "httpMethod", "Lcom/twilio/verify/networking/HttpMethod;", "url", "Ljava/net/URL;", "body", "", "", "headers", "tag", "(Lcom/twilio/verify/networking/HttpMethod;Ljava/net/URL;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "getBody", "()Ljava/util/Map;", "getHeaders", "getHttpMethod", "()Lcom/twilio/verify/networking/HttpMethod;", "getTag", "()Ljava/lang/String;", "getUrl", "()Ljava/net/URL;", "getParams", "jsonParams", "params", "queryParams", "Builder", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class scrapOrRecycleView {
    @NotNull
    final HttpMethod getMax;
    @NotNull
    final URL getMin;
    @Nullable
    private final Map<String, Object> length;
    @NotNull
    final Map<String, String> setMax;
    @NotNull
    private final String setMin;

    public scrapOrRecycleView(@NotNull HttpMethod httpMethod, @NotNull URL url, @Nullable Map<String, ? extends Object> map, @NotNull Map<String, String> map2, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(httpMethod, "httpMethod");
        Intrinsics.checkParameterIsNotNull(url, "url");
        Intrinsics.checkParameterIsNotNull(map2, "headers");
        Intrinsics.checkParameterIsNotNull(str, "tag");
        this.getMax = httpMethod;
        this.getMin = url;
        this.length = map;
        this.setMax = map2;
        this.setMin = str;
    }

    @Nullable
    public final String getMax() {
        if (this.length == null) {
            return "";
        }
        if (Intrinsics.areEqual((Object) this.setMax.get(MediaTypeHeader.ContentType.getType()), (Object) MediaTypeValue.UrlEncoded.getType())) {
            return setMin(this.length);
        }
        return Intrinsics.areEqual((Object) this.setMax.get(MediaTypeHeader.ContentType.getType()), (Object) MediaTypeValue.Json.getType()) ? setMax(this.length) : "";
    }

    private static String setMin(Map<String, ? extends Object> map) {
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry next : map.entrySet()) {
            builder.appendQueryParameter((String) next.getKey(), String.valueOf(next.getValue()));
        }
        Uri build = builder.build();
        Intrinsics.checkExpressionValueIsNotNull(build, "builder.build()");
        return build.getEncodedQuery();
    }

    private static String setMax(Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            jSONObject.put((String) next.getKey(), next.getValue());
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010%\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0005H\u0002J\u001c\u0010\b\u001a\u00020\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÂ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tHÂ\u0003J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tHÂ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÂ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001eJ\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\n\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/twilio/verify/networking/Request$Builder;", "", "requestHelper", "Lcom/twilio/verify/networking/RequestHelper;", "url", "", "httpMethod", "Lcom/twilio/verify/networking/HttpMethod;", "body", "", "query", "headers", "tag", "(Lcom/twilio/verify/networking/RequestHelper;Ljava/lang/String;Lcom/twilio/verify/networking/HttpMethod;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "addQueryParams", "build", "Lcom/twilio/verify/networking/Request;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "", "toString", "verify_release"}, k = 1, mv = {1, 1, 16})
    public static final class setMin {
        private Map<String, String> equals;
        public Map<String, ? extends Object> getMax;
        private final isMeasurementCacheEnabled getMin;
        private final String length;
        private Map<String, ? extends Object> setMax;
        public HttpMethod setMin;
        private String toIntRange;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            return Intrinsics.areEqual((Object) this.getMin, (Object) setmin.getMin) && Intrinsics.areEqual((Object) this.length, (Object) setmin.length) && Intrinsics.areEqual((Object) this.setMin, (Object) setmin.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) setmin.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) setmin.setMax) && Intrinsics.areEqual((Object) this.equals, (Object) setmin.equals) && Intrinsics.areEqual((Object) this.toIntRange, (Object) setmin.toIntRange);
        }

        public final int hashCode() {
            isMeasurementCacheEnabled ismeasurementcacheenabled = this.getMin;
            int i = 0;
            int hashCode = (ismeasurementcacheenabled != null ? ismeasurementcacheenabled.hashCode() : 0) * 31;
            String str = this.length;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            HttpMethod httpMethod = this.setMin;
            int hashCode3 = (hashCode2 + (httpMethod != null ? httpMethod.hashCode() : 0)) * 31;
            Map<String, ? extends Object> map = this.getMax;
            int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
            Map<String, ? extends Object> map2 = this.setMax;
            int hashCode5 = (hashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31;
            Map<String, String> map3 = this.equals;
            int hashCode6 = (hashCode5 + (map3 != null ? map3.hashCode() : 0)) * 31;
            String str2 = this.toIntRange;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode6 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Builder(requestHelper=");
            sb.append(this.getMin);
            sb.append(", url=");
            sb.append(this.length);
            sb.append(", httpMethod=");
            sb.append(this.setMin);
            sb.append(", body=");
            sb.append(this.getMax);
            sb.append(", query=");
            sb.append(this.setMax);
            sb.append(", headers=");
            sb.append(this.equals);
            sb.append(", tag=");
            sb.append(this.toIntRange);
            sb.append(")");
            return sb.toString();
        }

        private setMin(@NotNull isMeasurementCacheEnabled ismeasurementcacheenabled, @NotNull String str, @NotNull HttpMethod httpMethod) {
            Intrinsics.checkParameterIsNotNull(ismeasurementcacheenabled, "requestHelper");
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(httpMethod, "httpMethod");
            this.getMin = ismeasurementcacheenabled;
            this.length = str;
            this.setMin = httpMethod;
            this.getMax = null;
            this.setMax = null;
            this.equals = null;
            this.toIntRange = null;
        }

        public /* synthetic */ setMin(isMeasurementCacheEnabled ismeasurementcacheenabled, String str) {
            this(ismeasurementcacheenabled, str, HttpMethod.Get);
        }

        @NotNull
        public final scrapOrRecycleView length() throws MalformedURLException {
            Map<String, String> map;
            HttpMethod httpMethod = this.setMin;
            URL url = new URL(getMax());
            Map<String, ? extends Object> map2 = this.getMax;
            Map<String, String> map3 = this.equals;
            if (map3 == null || (map = MapsKt.plus(this.getMin.setMax(this.setMin), map3)) == null) {
                map = this.getMin.setMax(this.setMin);
            }
            Map<String, String> map4 = map;
            String str = this.toIntRange;
            if (str == null) {
                str = "";
            }
            return new scrapOrRecycleView(httpMethod, url, map2, map4, str);
        }

        private final String getMax() {
            Uri.Builder buildUpon = Uri.parse(this.length).buildUpon();
            Map<String, ? extends Object> map = this.setMax;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    buildUpon.appendQueryParameter((String) next.getKey(), String.valueOf(next.getValue()));
                }
            }
            String obj = buildUpon.build().toString();
            Intrinsics.checkExpressionValueIsNotNull(obj, "builder.build()\n        .toString()");
            return obj;
        }
    }
}
