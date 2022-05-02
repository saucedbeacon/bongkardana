package o;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;

final class getConstraintSet implements getTargetPosition {
    private final getMin getMax = new getMin();
    private final getEndState<setMax, Bitmap> getMin = new getEndState<>();

    getConstraintSet() {
    }

    public final void length(Bitmap bitmap) {
        getMin getmin = this.getMax;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        setInteractionEnabled setinteractionenabled = (setInteractionEnabled) getmin.setMax.poll();
        if (setinteractionenabled == null) {
            setinteractionenabled = getmin.getMin();
        }
        setMax setmax = (setMax) setinteractionenabled;
        setmax.length = width;
        setmax.getMax = height;
        setmax.setMin = config;
        this.getMin.setMin(setmax, bitmap);
    }

    public final Bitmap setMax(int i, int i2, Bitmap.Config config) {
        getMin getmin = this.getMax;
        setInteractionEnabled setinteractionenabled = (setInteractionEnabled) getmin.setMax.poll();
        if (setinteractionenabled == null) {
            setinteractionenabled = getmin.getMin();
        }
        setMax setmax = (setMax) setinteractionenabled;
        setmax.length = i;
        setmax.getMax = i2;
        setmax.setMin = config;
        return this.getMin.getMin(setmax);
    }

    public final Bitmap length() {
        return this.getMin.setMax();
    }

    public final String getMax(int i, int i2, Bitmap.Config config) {
        return length(i, i2, config);
    }

    public final int getMax(Bitmap bitmap) {
        return getDependents.getMin(bitmap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttributeStrategy:\n  ");
        sb.append(this.getMin);
        return sb.toString();
    }

    static String length(int i, int i2, Bitmap.Config config) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("], ");
        sb.append(config);
        return sb.toString();
    }

    @VisibleForTesting
    static class getMin extends getConstraintSetIds<setMax> {
        getMin() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ setInteractionEnabled getMin() {
            return new setMax(this);
        }
    }

    @VisibleForTesting
    static class setMax implements setInteractionEnabled {
        int getMax;
        int length;
        private final getMin setMax;
        Bitmap.Config setMin;

        public setMax(getMin getmin) {
            this.setMax = getmin;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof setMax) {
                setMax setmax = (setMax) obj;
                if (this.length == setmax.length && this.getMax == setmax.getMax && this.setMin == setmax.setMin) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.length * 31) + this.getMax) * 31;
            Bitmap.Config config = this.setMin;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return getConstraintSet.length(this.length, this.getMax, this.setMin);
        }

        public final void getMax() {
            getMin getmin = this.setMax;
            if (getmin.setMax.size() < 20) {
                getmin.setMax.offer(this);
            }
        }
    }

    public final String setMin(Bitmap bitmap) {
        return length(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }
}
