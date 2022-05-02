package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class updatePostConstraints extends setType {
    private static final byte[] length = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(setMin);
    private final int setMax;

    public updatePostConstraints(int i) {
        if (i > 0) {
            this.setMax = i;
            return;
        }
        throw new IllegalArgumentException("roundingRadius must be greater than 0.");
    }

    /* access modifiers changed from: protected */
    public final Bitmap setMax(@NonNull rebuildScene rebuildscene, @NonNull Bitmap bitmap, int i, int i2) {
        return setTag.setMax(rebuildscene, bitmap, this.setMax);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof updatePostConstraints) || this.setMax != ((updatePostConstraints) obj).setMax) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return getDependents.setMax("com.bumptech.glide.load.resource.bitmap.RoundedCorners".hashCode(), getDependents.getMax(this.setMax));
    }

    public final void setMax(@NonNull MessageDigest messageDigest) {
        messageDigest.update(length);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.setMax).array());
    }
}
