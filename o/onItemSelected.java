package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import o.setInputType;

public final class onItemSelected implements removeTabAt, setInputType.getMin, onNothingSelected {
    private final List<setImeOptions> IsOverlapping = new ArrayList();
    private final setInputType<Integer, Integer> equals;
    private final Path getMax = new Path();
    private final onKeyPreIme getMin;
    private final LottieDrawable isInside;
    private final String length;
    private final boolean setMax;
    private final Paint setMin = new clearSelection(1);
    private final setInputType<Integer, Integer> toFloatRange;
    @Nullable
    private setInputType<ColorFilter, ColorFilter> toIntRange;

    public onItemSelected(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, setImeVisibility setimevisibility) {
        this.getMin = onkeypreime;
        this.length = setimevisibility.setMin;
        this.setMax = setimevisibility.length();
        this.isInside = lottieDrawable;
        if (setimevisibility.length == null || setimevisibility.setMax == null) {
            this.toFloatRange = null;
            this.equals = null;
            return;
        }
        this.getMax.setFillType(setimevisibility.getMax);
        getInputType getinputtype = new getInputType(setimevisibility.length.setMin);
        this.toFloatRange = getinputtype;
        getinputtype.getMin.add(this);
        setInputType<Integer, Integer> setinputtype = this.toFloatRange;
        if (setinputtype != null) {
            onkeypreime.setMax.add(setinputtype);
        }
        setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener = new setOnQueryTextFocusChangeListener(setimevisibility.setMax.setMin);
        this.equals = setonquerytextfocuschangelistener;
        setonquerytextfocuschangelistener.getMin.add(this);
        setInputType<Integer, Integer> setinputtype2 = this.equals;
        if (setinputtype2 != null) {
            onkeypreime.setMax.add(setinputtype2);
        }
    }

    public final void setMax() {
        this.isInside.invalidateSelf();
    }

    public final void setMax(List<animateToTab> list, List<animateToTab> list2) {
        for (int i = 0; i < list2.size(); i++) {
            animateToTab animatetotab = list2.get(i);
            if (animatetotab instanceof setImeOptions) {
                this.IsOverlapping.add((setImeOptions) animatetotab);
            }
        }
    }

    public final String setMin() {
        return this.length;
    }

    public final void setMax(Canvas canvas, Matrix matrix, int i) {
        if (!this.setMax) {
            setChildFrame.getMin("FillContent#draw");
            this.setMin.setColor(((getInputType) this.toFloatRange).toIntRange());
            this.setMin.setAlpha(getTitleMarginTop.getMin((int) ((((((float) i) / 255.0f) * ((float) this.equals.equals().intValue())) / 100.0f) * 255.0f)));
            setInputType<ColorFilter, ColorFilter> setinputtype = this.toIntRange;
            if (setinputtype != null) {
                this.setMin.setColorFilter(setinputtype.equals());
            }
            this.getMax.reset();
            for (int i2 = 0; i2 < this.IsOverlapping.size(); i2++) {
                this.getMax.addPath(this.IsOverlapping.get(i2).getMax(), matrix);
            }
            canvas.drawPath(this.getMax, this.setMin);
            setChildFrame.length("FillContent#draw");
        }
    }

    public final void setMin(RectF rectF, Matrix matrix, boolean z) {
        this.getMax.reset();
        for (int i = 0; i < this.IsOverlapping.size(); i++) {
            this.getMax.addPath(this.IsOverlapping.get(i).getMax(), matrix);
        }
        this.getMax.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final void setMax(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1361000798, oncanceled);
            onCancelLoad.getMin(-1361000798, oncanceled);
        }
        getTitleMarginTop.getMin(setmaxwidth, i, list, setmaxwidth2, this);
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        if (t == MenuPopupWindow$MenuDropDownListView.setMin) {
            this.toFloatRange.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.getMin) {
            this.equals.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.asBinder) {
            setInputType<ColorFilter, ColorFilter> setinputtype = this.toIntRange;
            if (setinputtype != null) {
                this.getMin.setMax.remove(setinputtype);
            }
            if (settitlemarginbottom == null) {
                this.toIntRange = null;
                return;
            }
            isSubmitButtonEnabled issubmitbuttonenabled = new isSubmitButtonEnabled(settitlemarginbottom);
            this.toIntRange = issubmitbuttonenabled;
            issubmitbuttonenabled.getMin.add(this);
            onKeyPreIme onkeypreime = this.getMin;
            setInputType<ColorFilter, ColorFilter> setinputtype2 = this.toIntRange;
            if (setinputtype2 != null) {
                onkeypreime.setMax.add(setinputtype2);
            }
        }
    }
}
