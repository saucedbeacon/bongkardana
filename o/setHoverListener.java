package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import o.setInputType;

public abstract class setHoverListener implements setInputType.getMin, onNothingSelected, removeTabAt {
    private final RectF IsOverlapping = new RectF();
    private final float[] equals;
    protected final onKeyPreIme getMax;
    private final Path getMin = new Path();
    private final List<setInputType<?, Float>> hashCode;
    private final LottieDrawable isInside;
    private final Path length = new Path();
    private final PathMeasure setMax = new PathMeasure();
    final Paint setMin;
    private final setInputType<?, Integer> toDoubleRange;
    private final List<getMax> toFloatRange = new ArrayList();
    private final setInputType<?, Float> toIntRange;
    @Nullable
    private final setInputType<?, Float> toString;
    @Nullable
    private setInputType<ColorFilter, ColorFilter> values;

    setHoverListener(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, Paint.Cap cap, Paint.Join join, float f, onCloseClicked oncloseclicked, onTextFocusChanged ontextfocuschanged, List<onTextFocusChanged> list, onTextFocusChanged ontextfocuschanged2) {
        clearSelection clearselection = new clearSelection(1);
        this.setMin = clearselection;
        this.isInside = lottieDrawable;
        this.getMax = onkeypreime;
        clearselection.setStyle(Paint.Style.STROKE);
        this.setMin.setStrokeCap(cap);
        this.setMin.setStrokeJoin(join);
        this.setMin.setStrokeMiter(f);
        this.toDoubleRange = new setOnQueryTextFocusChangeListener(oncloseclicked.setMin);
        this.toIntRange = new setOnQueryTextListener(ontextfocuschanged.setMin);
        if (ontextfocuschanged2 == null) {
            this.toString = null;
        } else {
            this.toString = new setOnQueryTextListener(ontextfocuschanged2.setMin);
        }
        this.hashCode = new ArrayList(list.size());
        this.equals = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.hashCode.add(new setOnQueryTextListener(list.get(i).setMin));
        }
        setInputType<?, Integer> setinputtype = this.toDoubleRange;
        if (setinputtype != null) {
            onkeypreime.setMax.add(setinputtype);
        }
        setInputType<?, Float> setinputtype2 = this.toIntRange;
        if (setinputtype2 != null) {
            onkeypreime.setMax.add(setinputtype2);
        }
        for (int i2 = 0; i2 < this.hashCode.size(); i2++) {
            setInputType setinputtype3 = this.hashCode.get(i2);
            if (setinputtype3 != null) {
                onkeypreime.setMax.add(setinputtype3);
            }
        }
        setInputType<?, Float> setinputtype4 = this.toString;
        if (!(setinputtype4 == null || setinputtype4 == null)) {
            onkeypreime.setMax.add(setinputtype4);
        }
        this.toDoubleRange.getMin.add(this);
        this.toIntRange.getMin.add(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.hashCode.get(i3).getMin.add(this);
        }
        setInputType<?, Float> setinputtype5 = this.toString;
        if (setinputtype5 != null) {
            setinputtype5.getMin.add(this);
        }
    }

    public final void setMax() {
        this.isInside.invalidateSelf();
    }

    public final void setMax(List<animateToTab> list, List<animateToTab> list2) {
        getMax getmax = null;
        getImeOptions getimeoptions = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            animateToTab animatetotab = list.get(size);
            if (animatetotab instanceof getImeOptions) {
                getImeOptions getimeoptions2 = (getImeOptions) animatetotab;
                if (getimeoptions2.setMin == ShapeTrimPath.Type.INDIVIDUALLY) {
                    getimeoptions = getimeoptions2;
                }
            }
        }
        if (getimeoptions != null) {
            getimeoptions.length.add(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            animateToTab animatetotab2 = list2.get(size2);
            if (animatetotab2 instanceof getImeOptions) {
                getImeOptions getimeoptions3 = (getImeOptions) animatetotab2;
                if (getimeoptions3.setMin == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (getmax != null) {
                        this.toFloatRange.add(getmax);
                    }
                    getMax getmax2 = new getMax(getimeoptions3, (byte) 0);
                    getimeoptions3.length.add(this);
                    getmax = getmax2;
                }
            }
            if (animatetotab2 instanceof setImeOptions) {
                if (getmax == null) {
                    getmax = new getMax(getimeoptions, (byte) 0);
                }
                getmax.setMin.add((setImeOptions) animatetotab2);
            }
        }
        if (getmax != null) {
            this.toFloatRange.add(getmax);
        }
    }

    public void setMax(Canvas canvas, Matrix matrix, int i) {
        setChildFrame.getMin("StrokeContent#draw");
        if (setTitleMarginStart.getMax(matrix)) {
            setChildFrame.length("StrokeContent#draw");
            return;
        }
        this.setMin.setAlpha(getTitleMarginTop.getMin((int) ((((((float) i) / 255.0f) * ((float) ((setOnQueryTextFocusChangeListener) this.toDoubleRange).isInside())) / 100.0f) * 255.0f)));
        this.setMin.setStrokeWidth(((setOnQueryTextListener) this.toIntRange).isInside() * setTitleMarginStart.getMin(matrix));
        float f = 0.0f;
        if (this.setMin.getStrokeWidth() <= 0.0f) {
            setChildFrame.length("StrokeContent#draw");
            return;
        }
        setChildFrame.getMin("StrokeContent#applyDashPattern");
        if (this.hashCode.isEmpty()) {
            setChildFrame.length("StrokeContent#applyDashPattern");
        } else {
            float min = setTitleMarginStart.getMin(matrix);
            for (int i2 = 0; i2 < this.hashCode.size(); i2++) {
                this.equals[i2] = ((Float) this.hashCode.get(i2).equals()).floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr = this.equals;
                    if (fArr[i2] < 1.0f) {
                        fArr[i2] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.equals;
                    if (fArr2[i2] < 0.1f) {
                        fArr2[i2] = 0.1f;
                    }
                }
                float[] fArr3 = this.equals;
                fArr3[i2] = fArr3[i2] * min;
            }
            setInputType<?, Float> setinputtype = this.toString;
            if (setinputtype != null) {
                f = setinputtype.equals().floatValue() * min;
            }
            this.setMin.setPathEffect(new DashPathEffect(this.equals, f));
            setChildFrame.length("StrokeContent#applyDashPattern");
        }
        setInputType<ColorFilter, ColorFilter> setinputtype2 = this.values;
        if (setinputtype2 != null) {
            this.setMin.setColorFilter(setinputtype2.equals());
        }
        for (int i3 = 0; i3 < this.toFloatRange.size(); i3++) {
            getMax getmax = this.toFloatRange.get(i3);
            if (getmax.setMax != null) {
                getMin(canvas, getmax, matrix);
            } else {
                setChildFrame.getMin("StrokeContent#buildPath");
                this.getMin.reset();
                for (int size = getmax.setMin.size() - 1; size >= 0; size--) {
                    this.getMin.addPath(getmax.setMin.get(size).getMax(), matrix);
                }
                setChildFrame.length("StrokeContent#buildPath");
                setChildFrame.getMin("StrokeContent#drawPath");
                canvas.drawPath(this.getMin, this.setMin);
                setChildFrame.length("StrokeContent#drawPath");
            }
        }
        setChildFrame.length("StrokeContent#draw");
    }

    private void getMin(Canvas canvas, getMax getmax, Matrix matrix) {
        float f;
        setChildFrame.getMin("StrokeContent#applyTrimPath");
        if (getmax.setMax == null) {
            setChildFrame.length("StrokeContent#applyTrimPath");
            return;
        }
        this.getMin.reset();
        for (int size = getmax.setMin.size() - 1; size >= 0; size--) {
            this.getMin.addPath(getmax.setMin.get(size).getMax(), matrix);
        }
        this.setMax.setPath(this.getMin, false);
        float length2 = this.setMax.getLength();
        while (this.setMax.nextContour()) {
            length2 += this.setMax.getLength();
        }
        float floatValue = (getmax.setMax.getMax.equals().floatValue() * length2) / 360.0f;
        float floatValue2 = ((getmax.setMax.setMax.equals().floatValue() * length2) / 100.0f) + floatValue;
        float floatValue3 = ((getmax.setMax.getMin.equals().floatValue() * length2) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = getmax.setMin.size() - 1; size2 >= 0; size2--) {
            this.length.set(getmax.setMin.get(size2).getMax());
            this.length.transform(matrix);
            this.setMax.setPath(this.length, false);
            float length3 = this.setMax.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length2) {
                float f4 = floatValue3 - length2;
                if (f4 < f2 + length3 && f2 < f4) {
                    f = floatValue2 > length2 ? (floatValue2 - length2) / length3 : 0.0f;
                    f3 = Math.min(f4 / length3, 1.0f);
                    setTitleMarginStart.getMax(this.length, f, f3, 0.0f);
                    canvas.drawPath(this.length, this.setMin);
                    f2 += length3;
                }
            }
            float f5 = f2 + length3;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 > floatValue3 || floatValue2 >= f2) {
                    f = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length3;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length3;
                    }
                    setTitleMarginStart.getMax(this.length, f, f3, 0.0f);
                    canvas.drawPath(this.length, this.setMin);
                } else {
                    canvas.drawPath(this.length, this.setMin);
                }
            }
            f2 += length3;
        }
        setChildFrame.length("StrokeContent#applyTrimPath");
    }

    public final void setMin(RectF rectF, Matrix matrix, boolean z) {
        setChildFrame.getMin("StrokeContent#getBounds");
        this.getMin.reset();
        for (int i = 0; i < this.toFloatRange.size(); i++) {
            getMax getmax = this.toFloatRange.get(i);
            for (int i2 = 0; i2 < getmax.setMin.size(); i2++) {
                this.getMin.addPath(getmax.setMin.get(i2).getMax(), matrix);
            }
        }
        this.getMin.computeBounds(this.IsOverlapping, false);
        float isInside2 = ((setOnQueryTextListener) this.toIntRange).isInside();
        RectF rectF2 = this.IsOverlapping;
        float f = isInside2 / 2.0f;
        rectF2.set(rectF2.left - f, this.IsOverlapping.top - f, this.IsOverlapping.right + f, this.IsOverlapping.bottom + f);
        rectF.set(this.IsOverlapping);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        setChildFrame.length("StrokeContent#getBounds");
    }

    public final void setMax(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
        getTitleMarginTop.getMin(setmaxwidth, i, list, setmaxwidth2, this);
    }

    @CallSuper
    public <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        if (t == MenuPopupWindow$MenuDropDownListView.getMin) {
            this.toDoubleRange.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.Grayscale$Algorithm) {
            this.toIntRange.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.asBinder) {
            setInputType<ColorFilter, ColorFilter> setinputtype = this.values;
            if (setinputtype != null) {
                this.getMax.setMax.remove(setinputtype);
            }
            if (settitlemarginbottom == null) {
                this.values = null;
                return;
            }
            isSubmitButtonEnabled issubmitbuttonenabled = new isSubmitButtonEnabled(settitlemarginbottom);
            this.values = issubmitbuttonenabled;
            issubmitbuttonenabled.getMin.add(this);
            onKeyPreIme onkeypreime = this.getMax;
            setInputType<ColorFilter, ColorFilter> setinputtype2 = this.values;
            if (setinputtype2 != null) {
                onkeypreime.setMax.add(setinputtype2);
            }
        }
    }

    static final class getMax {
        @Nullable
        final getImeOptions setMax;
        final List<setImeOptions> setMin;

        /* synthetic */ getMax(getImeOptions getimeoptions, byte b) {
            this(getimeoptions);
        }

        private getMax(@Nullable getImeOptions getimeoptions) {
            this.setMin = new ArrayList();
            this.setMax = getimeoptions;
        }
    }
}
