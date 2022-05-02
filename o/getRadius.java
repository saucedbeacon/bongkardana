package o;

import com.alibaba.griver.h5.permission.GriverJSAPIPermission;
import com.bca.xco.widget.connection.httpclient.p;
import java.util.Collections;
import o.setCardElevation;

public final class getRadius {
    final Object getMax;
    public final get getMin;
    public final p length;
    public final String setMax;
    public final setCardElevation setMin;
    public volatile getLayoutResource toFloatRange;

    public /* synthetic */ getRadius(length length2, byte b) {
        this(length2);
    }

    private getRadius(length length2) {
        Object obj;
        this.length = length2.getMin;
        this.setMax = length2.length;
        this.setMin = new setCardElevation(length2.getMax, (byte) 0);
        this.getMin = length2.setMax;
        if (length2.setMin != null) {
            obj = length2.setMin;
        } else {
            obj = this;
        }
        this.getMax = obj;
    }

    public final boolean setMax() {
        return this.length.setMin();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.setMax);
        sb.append(", url=");
        sb.append(this.length);
        sb.append(", tag=");
        Object obj = this.getMax;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public static class length {
        public setCardElevation.setMax getMax;
        public p getMin;
        String length;
        get setMax;
        Object setMin;

        public /* synthetic */ length(getRadius getradius, byte b) {
            this(getradius);
        }

        public length() {
            this.length = "GET";
            this.getMax = new setCardElevation.setMax();
        }

        private length(getRadius getradius) {
            this.getMin = getradius.length;
            this.length = getradius.setMax;
            this.setMax = getradius.getMin;
            this.setMin = getradius.getMax;
            setCardElevation setcardelevation = getradius.setMin;
            setCardElevation.setMax setmax = new setCardElevation.setMax();
            Collections.addAll(setmax.getMax, setcardelevation.setMin);
            this.getMax = setmax;
        }

        public final length setMin(String str) {
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
                p length2 = p.length(str);
                if (length2 == null) {
                    throw new IllegalArgumentException("unexpected url: ".concat(String.valueOf(str)));
                } else if (length2 != null) {
                    this.getMin = length2;
                    return this;
                } else {
                    throw new NullPointerException("url == null");
                }
            } else {
                throw new NullPointerException("url == null");
            }
        }

        public final length setMax(String str, String str2) {
            this.getMax.length(str, str2);
            return this;
        }

        public final length setMax(String str) {
            this.getMax.getMin(str);
            return this;
        }

        public final length length(String str, get get) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (get != null && !onGetSmallIconBitmap.setMax(str)) {
                StringBuilder sb = new StringBuilder("method ");
                sb.append(str);
                sb.append(" must not have a request body.");
                throw new IllegalArgumentException(sb.toString());
            } else if (get != null || !onGetSmallIconBitmap.length(str)) {
                this.length = str;
                this.setMax = get;
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
