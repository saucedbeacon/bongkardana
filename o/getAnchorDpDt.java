package o;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;

public final class getAnchorDpDt implements setPivotY {
    private final Class<?> IsOverlapping;
    private final Map<Class<?>, updatePostLayout<?>> equals;
    private final int getMax;
    private final Class<?> getMin;
    private int isInside;
    private final int length;
    private final Object setMax;
    private final setPivotY toFloatRange;
    private final MotionHelper toIntRange;

    getAnchorDpDt(Object obj, setPivotY setpivoty, int i, int i2, Map<Class<?>, updatePostLayout<?>> map, Class<?> cls, Class<?> cls2, MotionHelper motionHelper) {
        if (obj != null) {
            this.setMax = obj;
            if (setpivoty != null) {
                this.toFloatRange = setpivoty;
                this.length = i;
                this.getMax = i2;
                if (map != null) {
                    this.equals = map;
                    if (cls != null) {
                        this.getMin = cls;
                        if (cls2 != null) {
                            this.IsOverlapping = cls2;
                            if (motionHelper != null) {
                                this.toIntRange = motionHelper;
                                return;
                            }
                            throw new NullPointerException("Argument must not be null");
                        }
                        throw new NullPointerException("Transcode class must not be null");
                    }
                    throw new NullPointerException("Resource class must not be null");
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Signature must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getAnchorDpDt) {
            getAnchorDpDt getanchordpdt = (getAnchorDpDt) obj;
            if (!this.setMax.equals(getanchordpdt.setMax) || !this.toFloatRange.equals(getanchordpdt.toFloatRange) || this.getMax != getanchordpdt.getMax || this.length != getanchordpdt.length || !this.equals.equals(getanchordpdt.equals) || !this.getMin.equals(getanchordpdt.getMin) || !this.IsOverlapping.equals(getanchordpdt.IsOverlapping) || !this.toIntRange.equals(getanchordpdt.toIntRange)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.isInside == 0) {
            int hashCode = this.setMax.hashCode();
            this.isInside = hashCode;
            int hashCode2 = (hashCode * 31) + this.toFloatRange.hashCode();
            this.isInside = hashCode2;
            int i = (hashCode2 * 31) + this.length;
            this.isInside = i;
            int i2 = (i * 31) + this.getMax;
            this.isInside = i2;
            int hashCode3 = (i2 * 31) + this.equals.hashCode();
            this.isInside = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.getMin.hashCode();
            this.isInside = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.IsOverlapping.hashCode();
            this.isInside = hashCode5;
            this.isInside = (hashCode5 * 31) + this.toIntRange.hashCode();
        }
        return this.isInside;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EngineKey{model=");
        sb.append(this.setMax);
        sb.append(", width=");
        sb.append(this.length);
        sb.append(", height=");
        sb.append(this.getMax);
        sb.append(", resourceClass=");
        sb.append(this.getMin);
        sb.append(", transcodeClass=");
        sb.append(this.IsOverlapping);
        sb.append(", signature=");
        sb.append(this.toFloatRange);
        sb.append(", hashCode=");
        sb.append(this.isInside);
        sb.append(", transformations=");
        sb.append(this.equals);
        sb.append(", options=");
        sb.append(this.toIntRange);
        sb.append('}');
        return sb.toString();
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
