package o;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class onViewRemoved implements setPivotY {
    private static final getDependencies<Class<?>, byte[]> getMax = new getDependencies<>(50);
    private final Class<?> IsOverlapping;
    private final int equals;
    private final setPivotY getMin;
    private final MotionHelper isInside;
    private final setPivotY length;
    private final setOnHide setMax;
    private final int toFloatRange;
    private final updatePostLayout<?> toIntRange;

    public onViewRemoved(setOnHide setonhide, setPivotY setpivoty, setPivotY setpivoty2, int i, int i2, updatePostLayout<?> updatepostlayout, Class<?> cls, MotionHelper motionHelper) {
        this.setMax = setonhide;
        this.length = setpivoty;
        this.getMin = setpivoty2;
        this.toFloatRange = i;
        this.equals = i2;
        this.toIntRange = updatepostlayout;
        this.IsOverlapping = cls;
        this.isInside = motionHelper;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof onViewRemoved) {
            onViewRemoved onviewremoved = (onViewRemoved) obj;
            if (this.equals != onviewremoved.equals || this.toFloatRange != onviewremoved.toFloatRange || !getDependents.setMin(this.toIntRange, onviewremoved.toIntRange) || !this.IsOverlapping.equals(onviewremoved.IsOverlapping) || !this.length.equals(onviewremoved.length) || !this.getMin.equals(onviewremoved.getMin) || !this.isInside.equals(onviewremoved.isInside)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.length.hashCode() * 31) + this.getMin.hashCode()) * 31) + this.toFloatRange) * 31) + this.equals;
        updatePostLayout<?> updatepostlayout = this.toIntRange;
        if (updatepostlayout != null) {
            hashCode = (hashCode * 31) + updatepostlayout.hashCode();
        }
        return (((hashCode * 31) + this.IsOverlapping.hashCode()) * 31) + this.isInside.hashCode();
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.setMax.getMax(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.toFloatRange).putInt(this.equals).array();
        this.getMin.setMax(messageDigest);
        this.length.setMax(messageDigest);
        messageDigest.update(bArr);
        updatePostLayout<?> updatepostlayout = this.toIntRange;
        if (updatepostlayout != null) {
            updatepostlayout.setMax(messageDigest);
        }
        this.isInside.setMax(messageDigest);
        messageDigest.update(setMin());
        this.setMax.setMin(bArr);
    }

    private byte[] setMin() {
        byte[] max = getMax.getMax(this.IsOverlapping);
        if (max != null) {
            return max;
        }
        byte[] bytes = this.IsOverlapping.getName().getBytes(setMin);
        getMax.length(this.IsOverlapping, bytes);
        return bytes;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceCacheKey{sourceKey=");
        sb.append(this.length);
        sb.append(", signature=");
        sb.append(this.getMin);
        sb.append(", width=");
        sb.append(this.toFloatRange);
        sb.append(", height=");
        sb.append(this.equals);
        sb.append(", decodedResourceClass=");
        sb.append(this.IsOverlapping);
        sb.append(", transformation='");
        sb.append(this.toIntRange);
        sb.append('\'');
        sb.append(", options=");
        sb.append(this.isInside);
        sb.append('}');
        return sb.toString();
    }
}
