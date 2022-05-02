package o;

import com.alibaba.griver.h5.permission.GriverJSAPIPermission;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import o.Draft_75;

public final class InvalidDataException {
    final Map<Class<?>, Object> getMax;
    public final String getMin;
    @Nullable
    public volatile translateHandshake isInside;
    public final Draft_75 length;
    @Nullable
    public final getPart setMax;
    public final Draft_76 setMin;

    public InvalidDataException(getMin getmin) {
        this.setMin = getmin.getMin;
        this.getMin = getmin.length;
        this.length = new Draft_75(getmin.setMin);
        this.setMax = getmin.getMax;
        this.getMax = initCloseCode.setMin(getmin.setMax);
    }

    @Nullable
    public final String setMin(String str) {
        return this.length.length(str);
    }

    public final boolean getMax() {
        return this.setMin.setMin();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.getMin);
        sb.append(", url=");
        sb.append(this.setMin);
        sb.append(", tags=");
        sb.append(this.getMax);
        sb.append('}');
        return sb.toString();
    }

    public static class getMin {
        @Nullable
        getPart getMax;
        @Nullable
        public Draft_76 getMin;
        String length;
        Map<Class<?>, Object> setMax;
        public Draft_75.length setMin;

        public getMin() {
            this.setMax = Collections.emptyMap();
            this.length = "GET";
            this.setMin = new Draft_75.length();
        }

        public getMin(InvalidDataException invalidDataException) {
            Map<Class<?>, Object> map;
            this.setMax = Collections.emptyMap();
            this.getMin = invalidDataException.setMin;
            this.length = invalidDataException.getMin;
            this.getMax = invalidDataException.setMax;
            if (invalidDataException.getMax.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(invalidDataException.getMax);
            }
            this.setMax = map;
            Draft_75 draft_75 = invalidDataException.length;
            Draft_75.length length2 = new Draft_75.length();
            Collections.addAll(length2.setMin, draft_75.length);
            this.setMin = length2;
        }

        public final getMin setMax(String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(499194414, oncanceled);
                onCancelLoad.getMin(499194414, oncanceled);
            }
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder(GriverJSAPIPermission.PROTOCOL_HTTP);
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    StringBuilder sb2 = new StringBuilder(GriverJSAPIPermission.PROTOCOL_HTTPS);
                    sb2.append(str.substring(4));
                    str = sb2.toString();
                }
                Draft_76 min = Draft_76.getMin(str);
                if (min != null) {
                    this.getMin = min;
                    return this;
                }
                throw new NullPointerException("url == null");
            }
            throw new NullPointerException("url == null");
        }

        public final getMin setMax(String str, String str2) {
            this.setMin.setMin(str, str2);
            return this;
        }

        public final getMin length(String str, String str2) {
            this.setMin.getMax(str, str2);
            return this;
        }

        public final getMin getMax(String str) {
            this.setMin.getMax(str);
            return this;
        }

        public final getMin length(String str, @Nullable getPart getpart) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (getpart != null && !ClientHandshakeBuilder.length(str)) {
                StringBuilder sb = new StringBuilder("method ");
                sb.append(str);
                sb.append(" must not have a request body.");
                throw new IllegalArgumentException(sb.toString());
            } else if (getpart != null || !ClientHandshakeBuilder.setMax(str)) {
                this.length = str;
                this.getMax = getpart;
                return this;
            } else {
                StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(str);
                sb2.append(" must have a request body.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }
}
