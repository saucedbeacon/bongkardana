package o;

import io.split.android.client.Evaluator;
import java.util.Map;

public final class setTranslucentForImageView {
    private final transparentStatusBar setMax;
    private final String setMin;

    public setTranslucentForImageView(String str, transparentStatusBar transparentstatusbar, boolean z) {
        this.setMin = str;
        this.setMax = new length(transparentstatusbar, z);
    }

    public final boolean getMax(String str, String str2, Map<String, Object> map, Evaluator evaluator) {
        Object obj;
        String str3 = this.setMin;
        if (str3 == null) {
            return this.setMax.length(str, str2, map, evaluator);
        }
        if (map == null || (obj = map.get(str3)) == null) {
            return false;
        }
        return this.setMax.length(obj, str2, (Map<String, Object>) null, (Evaluator) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setTranslucentForImageView settranslucentforimageview = (setTranslucentForImageView) obj;
        String str = this.setMin;
        if (str == null ? settranslucentforimageview.setMin == null : str.equals(settranslucentforimageview.setMin)) {
            return this.setMax.equals(settranslucentforimageview.setMax);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.setMin;
        return ((str != null ? str.hashCode() : 0) * 31) + this.setMax.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("key");
        if (this.setMin != null) {
            sb.append(".");
            sb.append(this.setMin);
        }
        sb.append(" is");
        sb.append(this.setMax);
        return sb.toString();
    }

    public static final class length implements transparentStatusBar {
        private final boolean getMin;
        private final transparentStatusBar length;

        public length(transparentStatusBar transparentstatusbar, boolean z) {
            this.getMin = z;
            this.length = transparentstatusbar;
        }

        public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
            return this.getMin != this.length.length(obj, str, map, evaluator);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.getMin) {
                sb.append(" not");
            }
            sb.append(" ");
            sb.append(this.length);
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            length length2 = (length) obj;
            if (this.getMin != length2.getMin) {
                return false;
            }
            return this.length.equals(length2.length);
        }

        public final int hashCode() {
            return ((this.getMin ? 1 : 0) * true) + this.length.hashCode();
        }
    }
}
