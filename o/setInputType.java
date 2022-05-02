package o;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public abstract class setInputType<K, A> {
    @Nullable
    private A IsOverlapping = null;
    private float equals = -1.0f;
    private final length<K> getMax;
    public final List<getMin> getMin = new ArrayList(1);
    private float isInside = -1.0f;
    @Nullable
    protected setTitleMarginBottom<A> length;
    protected float setMax = 0.0f;
    public boolean setMin = false;

    public interface getMin {
        void setMax();
    }

    interface length<T> {
        @FloatRange(from = 0.0d, to = 1.0d)
        float getMax();

        boolean getMax(float f);

        setTitleMarginTop<T> getMin();

        boolean getMin(float f);

        @FloatRange(from = 0.0d, to = 1.0d)
        float length();

        boolean setMax();
    }

    /* access modifiers changed from: package-private */
    public abstract A getMax(setTitleMarginTop<K> settitlemargintop, float f);

    setInputType(List<? extends setTitleMarginTop<K>> list) {
        length<K> length2;
        length<K> length3;
        if (list.isEmpty()) {
            length2 = new getMax<>((byte) 0);
        } else {
            if (list.size() == 1) {
                length3 = new setMin<>(list);
            } else {
                length3 = new setMax<>(list);
            }
            length2 = length3;
        }
        this.getMax = length2;
    }

    public void setMax(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (!this.getMax.setMax()) {
            if (this.isInside == -1.0f) {
                this.isInside = this.getMax.getMax();
            }
            float f2 = this.isInside;
            if (f < f2) {
                if (f2 == -1.0f) {
                    this.isInside = this.getMax.getMax();
                }
                f = this.isInside;
            } else if (f > getMin()) {
                f = getMin();
            }
            if (f != this.setMax) {
                this.setMax = f;
                if (this.getMax.getMax(f)) {
                    setMax();
                }
            }
        }
    }

    public void setMax() {
        for (int i = 0; i < this.getMin.size(); i++) {
            this.getMin.get(i).setMax();
        }
    }

    /* access modifiers changed from: protected */
    public final setTitleMarginTop<K> getMax() {
        setChildFrame.getMin("BaseKeyframeAnimation#getCurrentKeyframe");
        setTitleMarginTop<K> min = this.getMax.getMin();
        setChildFrame.length("BaseKeyframeAnimation#getCurrentKeyframe");
        return min;
    }

    /* access modifiers changed from: package-private */
    public final float length() {
        if (this.setMin) {
            return 0.0f;
        }
        setChildFrame.getMin("BaseKeyframeAnimation#getCurrentKeyframe");
        setTitleMarginTop<K> min = this.getMax.getMin();
        setChildFrame.length("BaseKeyframeAnimation#getCurrentKeyframe");
        if (min.getMax()) {
            return 0.0f;
        }
        return (this.setMax - min.getMin()) / (min.setMin() - min.getMin());
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getMin() {
        if (this.equals == -1.0f) {
            this.equals = this.getMax.length();
        }
        return this.equals;
    }

    public A equals() {
        A a2;
        float length2 = length();
        if (this.length == null && this.getMax.getMin(length2)) {
            return this.IsOverlapping;
        }
        setChildFrame.getMin("BaseKeyframeAnimation#getCurrentKeyframe");
        setTitleMarginTop<K> min = this.getMax.getMin();
        setChildFrame.length("BaseKeyframeAnimation#getCurrentKeyframe");
        if (min.length == null || min.IsOverlapping == null) {
            a2 = getMax(min, setMin());
        } else {
            a2 = setMax(min, length2, min.length.getInterpolation(length2), min.IsOverlapping.getInterpolation(length2));
        }
        this.IsOverlapping = a2;
        return a2;
    }

    public final float IsOverlapping() {
        return this.setMax;
    }

    public final void getMin(@Nullable setTitleMarginBottom<A> settitlemarginbottom) {
        setTitleMarginBottom<A> settitlemarginbottom2 = this.length;
        if (settitlemarginbottom2 != null) {
            settitlemarginbottom2.setMin = null;
        }
        this.length = settitlemarginbottom;
        if (settitlemarginbottom != null) {
            settitlemarginbottom.setMin = this;
        }
    }

    /* access modifiers changed from: protected */
    public A setMax(setTitleMarginTop<K> settitlemargintop, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    static final class getMax<T> implements length<T> {
        public final float getMax() {
            return 0.0f;
        }

        public final boolean getMax(float f) {
            return false;
        }

        public final float length() {
            return 1.0f;
        }

        public final boolean setMax() {
            return true;
        }

        private getMax() {
        }

        /* synthetic */ getMax(byte b) {
            this();
        }

        public final setTitleMarginTop<T> getMin() {
            throw new IllegalStateException("not implemented");
        }

        public final boolean getMin(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    static final class setMin<T> implements length<T> {
        private float getMax = -1.0f;
        @NonNull
        private final setTitleMarginTop<T> setMax;

        public final boolean setMax() {
            return false;
        }

        setMin(List<? extends setTitleMarginTop<T>> list) {
            this.setMax = (setTitleMarginTop) list.get(0);
        }

        public final boolean getMax(float f) {
            return !this.setMax.getMax();
        }

        public final setTitleMarginTop<T> getMin() {
            return this.setMax;
        }

        public final float getMax() {
            return this.setMax.getMin();
        }

        public final float length() {
            return this.setMax.setMin();
        }

        public final boolean getMin(float f) {
            if (this.getMax == f) {
                return true;
            }
            this.getMax = f;
            return false;
        }
    }

    static final class setMax<T> implements length<T> {
        @NonNull
        private setTitleMarginTop<T> getMin;
        private float length = -1.0f;
        private setTitleMarginTop<T> setMax = null;
        private final List<? extends setTitleMarginTop<T>> setMin;

        public final boolean setMax() {
            return false;
        }

        setMax(List<? extends setTitleMarginTop<T>> list) {
            this.setMin = list;
            this.getMin = length(0.0f);
        }

        public final boolean getMax(float f) {
            if (!this.getMin.getMin(f)) {
                this.getMin = length(f);
                return true;
            } else if (!this.getMin.getMax()) {
                return true;
            } else {
                return false;
            }
        }

        private setTitleMarginTop<T> length(float f) {
            List<? extends setTitleMarginTop<T>> list = this.setMin;
            setTitleMarginTop<T> settitlemargintop = (setTitleMarginTop) list.get(list.size() - 1);
            if (f >= settitlemargintop.getMin()) {
                return settitlemargintop;
            }
            for (int size = this.setMin.size() - 2; size > 0; size--) {
                setTitleMarginTop<T> settitlemargintop2 = (setTitleMarginTop) this.setMin.get(size);
                if (this.getMin != settitlemargintop2 && settitlemargintop2.getMin(f)) {
                    return settitlemargintop2;
                }
            }
            return (setTitleMarginTop) this.setMin.get(0);
        }

        @NonNull
        public final setTitleMarginTop<T> getMin() {
            return this.getMin;
        }

        public final float getMax() {
            return ((setTitleMarginTop) this.setMin.get(0)).getMin();
        }

        public final float length() {
            List<? extends setTitleMarginTop<T>> list = this.setMin;
            return ((setTitleMarginTop) list.get(list.size() - 1)).setMin();
        }

        public final boolean getMin(float f) {
            if (this.setMax == this.getMin && this.length == f) {
                return true;
            }
            this.setMax = this.getMin;
            this.length = f;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final float setMin() {
        setChildFrame.getMin("BaseKeyframeAnimation#getCurrentKeyframe");
        setTitleMarginTop<K> min = this.getMax.getMin();
        setChildFrame.length("BaseKeyframeAnimation#getCurrentKeyframe");
        if (min.getMax()) {
            return 0.0f;
        }
        return min.getMax.getInterpolation(length());
    }
}
