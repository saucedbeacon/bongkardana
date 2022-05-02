package o;

import com.bca.xco.widget.connection.httpclient.s;
import java.io.Closeable;
import java.util.Collections;
import o.setCardElevation;

public final class getPreventCornerOverlap implements Closeable {
    public final setPreventCornerOverlap IsOverlapping;
    final getPreventCornerOverlap equals;
    public final getContentPaddingRight getMax;
    public final getRadius getMin;
    final getPreventCornerOverlap isInside;
    public final int length;
    final String setMax;
    final s setMin;
    public final long toDoubleRange;
    public final setCardElevation toFloatRange;
    final getPreventCornerOverlap toIntRange;
    public final long toString;
    public volatile getLayoutResource values;

    /* synthetic */ getPreventCornerOverlap(setMax setmax, byte b) {
        this(setmax);
    }

    private getPreventCornerOverlap(setMax setmax) {
        this.getMin = setmax.setMax;
        this.setMin = setmax.setMin;
        this.length = setmax.getMax;
        this.setMax = setmax.getMin;
        this.getMax = setmax.length;
        this.toFloatRange = new setCardElevation(setmax.IsOverlapping, (byte) 0);
        this.IsOverlapping = setmax.toIntRange;
        this.isInside = setmax.equals;
        this.equals = setmax.toFloatRange;
        this.toIntRange = setmax.isInside;
        this.toDoubleRange = setmax.toString;
        this.toString = setmax.toDoubleRange;
    }

    public final String setMax(String str) {
        String max = setCardElevation.setMax(this.toFloatRange.setMin, str);
        if (max != null) {
            return max;
        }
        return null;
    }

    public final void close() {
        this.IsOverlapping.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.setMin);
        sb.append(", code=");
        sb.append(this.length);
        sb.append(", message=");
        sb.append(this.setMax);
        sb.append(", url=");
        sb.append(this.getMin.length);
        sb.append('}');
        return sb.toString();
    }

    public static class setMax {
        public setCardElevation.setMax IsOverlapping;
        public getPreventCornerOverlap equals;
        public int getMax;
        public String getMin;
        public getPreventCornerOverlap isInside;
        public getContentPaddingRight length;
        public getRadius setMax;
        public s setMin;
        public long toDoubleRange;
        public getPreventCornerOverlap toFloatRange;
        public setPreventCornerOverlap toIntRange;
        public long toString;

        public /* synthetic */ setMax(getPreventCornerOverlap getpreventcorneroverlap, byte b) {
            this(getpreventcorneroverlap);
        }

        public setMax() {
            this.getMax = -1;
            this.IsOverlapping = new setCardElevation.setMax();
        }

        private setMax(getPreventCornerOverlap getpreventcorneroverlap) {
            this.getMax = -1;
            this.setMax = getpreventcorneroverlap.getMin;
            this.setMin = getpreventcorneroverlap.setMin;
            this.getMax = getpreventcorneroverlap.length;
            this.getMin = getpreventcorneroverlap.setMax;
            this.length = getpreventcorneroverlap.getMax;
            setCardElevation setcardelevation = getpreventcorneroverlap.toFloatRange;
            setCardElevation.setMax setmax = new setCardElevation.setMax();
            Collections.addAll(setmax.getMax, setcardelevation.setMin);
            this.IsOverlapping = setmax;
            this.toIntRange = getpreventcorneroverlap.IsOverlapping;
            this.equals = getpreventcorneroverlap.isInside;
            this.toFloatRange = getpreventcorneroverlap.equals;
            this.isInside = getpreventcorneroverlap.toIntRange;
            this.toString = getpreventcorneroverlap.toDoubleRange;
            this.toDoubleRange = getpreventcorneroverlap.toString;
        }

        public final setMax getMax(String str, String str2) {
            this.IsOverlapping.setMax(str, str2);
            return this;
        }

        public final getPreventCornerOverlap getMin() {
            if (this.setMax == null) {
                throw new IllegalStateException("request == null");
            } else if (this.setMin == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.getMax >= 0) {
                return new getPreventCornerOverlap(this, (byte) 0);
            } else {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.getMax);
                throw new IllegalStateException(sb.toString());
            }
        }

        public static void setMax(String str, getPreventCornerOverlap getpreventcorneroverlap) {
            if (getpreventcorneroverlap.IsOverlapping != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (getpreventcorneroverlap.isInside != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (getpreventcorneroverlap.equals != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (getpreventcorneroverlap.toIntRange != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
    }
}
