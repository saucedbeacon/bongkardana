package o;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;
import o.setInputType;

public final class isIconified extends setInputType<PointF, PointF> {
    private final setInputType<Float, Float> IsOverlapping;
    private final setInputType<Float, Float> equals;
    @Nullable
    protected setTitleMarginBottom<Float> getMax;
    private final PointF isInside = new PointF();
    @Nullable
    protected setTitleMarginBottom<Float> toFloatRange;
    private final PointF toIntRange = new PointF();

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object getMax(setTitleMarginTop settitlemargintop, float f) {
        return length(f);
    }

    public isIconified(setInputType<Float, Float> setinputtype, setInputType<Float, Float> setinputtype2) {
        super(Collections.emptyList());
        this.equals = setinputtype;
        this.IsOverlapping = setinputtype2;
        setMax(IsOverlapping());
    }

    public final void length(@Nullable setTitleMarginBottom<Float> settitlemarginbottom) {
        setTitleMarginBottom<Float> settitlemarginbottom2 = this.getMax;
        if (settitlemarginbottom2 != null) {
            settitlemarginbottom2.setMin = null;
        }
        this.getMax = settitlemarginbottom;
        if (settitlemarginbottom != null) {
            settitlemarginbottom.setMin = this;
        }
    }

    public final void setMin(@Nullable setTitleMarginBottom<Float> settitlemarginbottom) {
        setTitleMarginBottom<Float> settitlemarginbottom2 = this.toFloatRange;
        if (settitlemarginbottom2 != null) {
            settitlemarginbottom2.setMin = null;
        }
        this.toFloatRange = settitlemarginbottom;
        if (settitlemarginbottom != null) {
            settitlemarginbottom.setMin = this;
        }
    }

    public final void setMax(float f) {
        this.equals.setMax(f);
        this.IsOverlapping.setMax(f);
        this.isInside.set(this.equals.equals().floatValue(), this.IsOverlapping.equals().floatValue());
        for (int i = 0; i < this.getMin.size(); i++) {
            ((setInputType.getMin) this.getMin.get(i)).setMax();
        }
    }

    private PointF length(float f) {
        Float f2;
        setTitleMarginTop<Float> max;
        float f3;
        setTitleMarginTop<Float> max2;
        float f4;
        Float f5 = null;
        if (this.getMax == null || (max2 = this.equals.getMax()) == null) {
            f2 = null;
        } else {
            float min = this.equals.setMin();
            Float f6 = max2.toIntRange;
            setTitleMarginBottom<Float> settitlemarginbottom = this.getMax;
            float f7 = max2.equals;
            if (f6 == null) {
                f4 = max2.equals;
            } else {
                f4 = f6.floatValue();
            }
            settitlemarginbottom.setMax.length(f7, f4, max2.setMax, max2.getMin, f, f, min);
            f2 = settitlemarginbottom.getMax();
        }
        if (!(this.toFloatRange == null || (max = this.IsOverlapping.getMax()) == null)) {
            float min2 = this.IsOverlapping.setMin();
            Float f8 = max.toIntRange;
            setTitleMarginBottom<Float> settitlemarginbottom2 = this.toFloatRange;
            float f9 = max.equals;
            if (f8 == null) {
                f3 = max.equals;
            } else {
                f3 = f8.floatValue();
            }
            settitlemarginbottom2.setMax.length(f9, f3, max.setMax, max.getMin, f, f, min2);
            f5 = settitlemarginbottom2.getMax();
        }
        if (f2 == null) {
            this.toIntRange.set(this.isInside.x, 0.0f);
        } else {
            this.toIntRange.set(f2.floatValue(), 0.0f);
        }
        if (f5 == null) {
            PointF pointF = this.toIntRange;
            pointF.set(pointF.x, this.isInside.y);
        } else {
            PointF pointF2 = this.toIntRange;
            pointF2.set(pointF2.x, f5.floatValue());
        }
        return this.toIntRange;
    }

    public final /* synthetic */ Object equals() {
        return length(0.0f);
    }
}
