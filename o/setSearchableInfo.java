package o;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;
import o.setInputType;

public final class setSearchableInfo implements setInputType.getMin, onNothingSelected, setImeOptions {
    private boolean IsOverlapping;
    private final setInputType<?, Float> equals;
    private final LottieDrawable getMax;
    private final Path getMin = new Path();
    private final setInputType<?, PointF> isInside;
    private final boolean length;
    private final RectF setMax = new RectF();
    private final String setMin;
    private addTab toFloatRange = new addTab();
    private final setInputType<?, PointF> toIntRange;

    public setSearchableInfo(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, replaceText replacetext) {
        this.setMin = replacetext.setMax;
        this.length = replacetext.length();
        this.getMax = lottieDrawable;
        this.toIntRange = replacetext.getMax.getMax();
        this.isInside = replacetext.setMin.getMax();
        this.equals = new setOnQueryTextListener(replacetext.getMin.setMin);
        setInputType<?, PointF> setinputtype = this.toIntRange;
        if (setinputtype != null) {
            onkeypreime.setMax.add(setinputtype);
        }
        setInputType<?, PointF> setinputtype2 = this.isInside;
        if (setinputtype2 != null) {
            onkeypreime.setMax.add(setinputtype2);
        }
        setInputType<?, Float> setinputtype3 = this.equals;
        if (setinputtype3 != null) {
            onkeypreime.setMax.add(setinputtype3);
        }
        this.toIntRange.getMin.add(this);
        this.isInside.getMin.add(this);
        this.equals.getMin.add(this);
    }

    public final String setMin() {
        return this.setMin;
    }

    public final void setMax(List<animateToTab> list, List<animateToTab> list2) {
        for (int i = 0; i < list.size(); i++) {
            animateToTab animatetotab = list.get(i);
            if (animatetotab instanceof getImeOptions) {
                getImeOptions getimeoptions = (getImeOptions) animatetotab;
                if (getimeoptions.setMin == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.toFloatRange.setMin.add(getimeoptions);
                    getimeoptions.length.add(this);
                }
            }
        }
    }

    public final Path getMax() {
        float f;
        if (this.IsOverlapping) {
            return this.getMin;
        }
        this.getMin.reset();
        if (this.length) {
            this.IsOverlapping = true;
            return this.getMin;
        }
        PointF equals2 = this.isInside.equals();
        float f2 = equals2.x / 2.0f;
        float f3 = equals2.y / 2.0f;
        setInputType<?, Float> setinputtype = this.equals;
        if (setinputtype == null) {
            f = 0.0f;
        } else {
            f = ((setOnQueryTextListener) setinputtype).isInside();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF equals3 = this.toIntRange.equals();
        this.getMin.moveTo(equals3.x + f2, (equals3.y - f3) + f);
        this.getMin.lineTo(equals3.x + f2, (equals3.y + f3) - f);
        if (f > 0.0f) {
            float f4 = f * 2.0f;
            this.setMax.set((equals3.x + f2) - f4, (equals3.y + f3) - f4, equals3.x + f2, equals3.y + f3);
            this.getMin.arcTo(this.setMax, 0.0f, 90.0f, false);
        }
        this.getMin.lineTo((equals3.x - f2) + f, equals3.y + f3);
        if (f > 0.0f) {
            float f5 = f * 2.0f;
            this.setMax.set(equals3.x - f2, (equals3.y + f3) - f5, (equals3.x - f2) + f5, equals3.y + f3);
            this.getMin.arcTo(this.setMax, 90.0f, 90.0f, false);
        }
        this.getMin.lineTo(equals3.x - f2, (equals3.y - f3) + f);
        if (f > 0.0f) {
            float f6 = f * 2.0f;
            this.setMax.set(equals3.x - f2, equals3.y - f3, (equals3.x - f2) + f6, (equals3.y - f3) + f6);
            this.getMin.arcTo(this.setMax, 180.0f, 90.0f, false);
        }
        this.getMin.lineTo((equals3.x + f2) - f, equals3.y - f3);
        if (f > 0.0f) {
            float f7 = f * 2.0f;
            this.setMax.set((equals3.x + f2) - f7, equals3.y - f3, equals3.x + f2, (equals3.y - f3) + f7);
            this.getMin.arcTo(this.setMax, 270.0f, 90.0f, false);
        }
        this.getMin.close();
        this.toFloatRange.getMin(this.getMin);
        this.IsOverlapping = true;
        return this.getMin;
    }

    public final void setMax(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
        getTitleMarginTop.getMin(setmaxwidth, i, list, setmaxwidth2, this);
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        if (t == MenuPopupWindow$MenuDropDownListView.IsOverlapping) {
            this.isInside.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.toDoubleRange) {
            this.toIntRange.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.hashCode) {
            this.equals.getMin(settitlemarginbottom);
        }
    }

    public final void setMax() {
        this.IsOverlapping = false;
        this.getMax.invalidateSelf();
    }
}
