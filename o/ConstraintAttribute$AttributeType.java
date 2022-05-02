package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class ConstraintAttribute$AttributeType extends setType {
    private static final byte[] getMax = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(setMin);
    private final float getMin;
    private final float length;
    private final float setMax = 0.0f;
    private final float toFloatRange = 0.0f;

    public ConstraintAttribute$AttributeType(float f, float f2) {
        this.getMin = f;
        this.length = f2;
    }

    /* access modifiers changed from: protected */
    public final Bitmap setMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i, int i2) {
        return setTag.setMax(rebuildscene, bitmap, this.getMin, this.length, this.setMax, this.toFloatRange);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConstraintAttribute$AttributeType) {
            ConstraintAttribute$AttributeType constraintAttribute$AttributeType = (ConstraintAttribute$AttributeType) obj;
            if (this.getMin == constraintAttribute$AttributeType.getMin && this.length == constraintAttribute$AttributeType.length && this.setMax == constraintAttribute$AttributeType.setMax && this.toFloatRange == constraintAttribute$AttributeType.toFloatRange) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return getDependents.length(this.toFloatRange, getDependents.length(this.setMax, getDependents.length(this.length, getDependents.setMax("com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".hashCode(), getDependents.getMax(this.getMin)))));
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        messageDigest.update(getMax);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.getMin).putFloat(this.length).putFloat(this.setMax).putFloat(this.toFloatRange).array());
    }
}
