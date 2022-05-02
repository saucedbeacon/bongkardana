package o;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.addPreDrawListener;
import o.isPointInChildBounds;
import o.setPositiveButtonIcon;

public final class access$800 {
    private final setPositiveButtonIcon.length<length> getMax = addPreDrawListener.getMin(10, new addPreDrawListener.getMax<length>() {
        public final /* synthetic */ Object setMax() {
            return setMin();
        }

        private static length setMin() {
            try {
                return new length(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    });
    private final getDependencies<setPivotY, String> getMin = new getDependencies<>(1000);

    public final String setMax(setPivotY setpivoty) {
        String max;
        synchronized (this.getMin) {
            max = this.getMin.getMax(setpivoty);
        }
        if (max == null) {
            max = getMin(setpivoty);
        }
        synchronized (this.getMin) {
            this.getMin.length(setpivoty, max);
        }
        return max;
    }

    private String getMin(setPivotY setpivoty) {
        length max = this.getMax.getMax();
        if (max != null) {
            length length2 = max;
            try {
                setpivoty.setMax(length2.getMin);
                return getDependents.length(length2.getMin.digest());
            } finally {
                this.getMax.getMin(length2);
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    static final class length implements addPreDrawListener.getMin {
        final MessageDigest getMin;
        private final isPointInChildBounds setMax = new isPointInChildBounds.length();

        length(MessageDigest messageDigest) {
            this.getMin = messageDigest;
        }

        @NonNull
        public final isPointInChildBounds j_() {
            return this.setMax;
        }
    }
}
