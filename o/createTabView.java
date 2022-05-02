package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import o.setInputType;

public final class createTabView implements removeTabAt, setImeOptions, setInputType.getMin, getMaxWidth {
    private final RectF IsOverlapping;
    private final boolean equals;
    private Paint getMax;
    @Nullable
    setSubmitButtonEnabled getMin;
    private final LottieDrawable isInside;
    private RectF length;
    final Matrix setMax;
    private final Path setMin;
    private final String toFloatRange;
    private final List<animateToTab> toIntRange;
    @Nullable
    private List<setImeOptions> toString;

    private static List<animateToTab> setMin(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, List<isLandscapeMode> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            animateToTab length2 = list.get(i).length(lottieDrawable, onkeypreime);
            if (length2 != null) {
                arrayList.add(length2);
            }
        }
        return arrayList;
    }

    @Nullable
    private static forceSuggestionQuery getMax(List<isLandscapeMode> list) {
        for (int i = 0; i < list.size(); i++) {
            isLandscapeMode islandscapemode = list.get(i);
            if (islandscapemode instanceof forceSuggestionQuery) {
                return (forceSuggestionQuery) islandscapemode;
            }
        }
        return null;
    }

    createTabView(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, String str, boolean z, List<animateToTab> list, @Nullable forceSuggestionQuery forcesuggestionquery) {
        this.getMax = new clearSelection();
        this.length = new RectF();
        this.setMax = new Matrix();
        this.setMin = new Path();
        this.IsOverlapping = new RectF();
        this.toFloatRange = str;
        this.isInside = lottieDrawable;
        this.equals = z;
        this.toIntRange = list;
        if (forcesuggestionquery != null) {
            setSubmitButtonEnabled setsubmitbuttonenabled = new setSubmitButtonEnabled(forcesuggestionquery);
            this.getMin = setsubmitbuttonenabled;
            setsubmitbuttonenabled.length(onkeypreime);
            this.getMin.length((setInputType.getMin) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            animateToTab animatetotab = list.get(size);
            if (animatetotab instanceof removeAllTabs) {
                arrayList.add((removeAllTabs) animatetotab);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((removeAllTabs) arrayList.get(size2)).length(list.listIterator(list.size()));
        }
    }

    public final void setMax() {
        this.isInside.invalidateSelf();
    }

    public final String setMin() {
        return this.toFloatRange;
    }

    public final void setMax(List<animateToTab> list, List<animateToTab> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.toIntRange.size());
        arrayList.addAll(list);
        for (int size = this.toIntRange.size() - 1; size >= 0; size--) {
            animateToTab animatetotab = this.toIntRange.get(size);
            animatetotab.setMax(arrayList, this.toIntRange.subList(0, size));
            arrayList.add(animatetotab);
        }
    }

    /* access modifiers changed from: package-private */
    public final List<setImeOptions> getMin() {
        if (this.toString == null) {
            this.toString = new ArrayList();
            for (int i = 0; i < this.toIntRange.size(); i++) {
                animateToTab animatetotab = this.toIntRange.get(i);
                if (animatetotab instanceof setImeOptions) {
                    this.toString.add((setImeOptions) animatetotab);
                }
            }
        }
        return this.toString;
    }

    public final Path getMax() {
        this.setMax.reset();
        setSubmitButtonEnabled setsubmitbuttonenabled = this.getMin;
        if (setsubmitbuttonenabled != null) {
            this.setMax.set(setsubmitbuttonenabled.length());
        }
        this.setMin.reset();
        if (this.equals) {
            return this.setMin;
        }
        for (int size = this.toIntRange.size() - 1; size >= 0; size--) {
            animateToTab animatetotab = this.toIntRange.get(size);
            if (animatetotab instanceof setImeOptions) {
                this.setMin.addPath(((setImeOptions) animatetotab).getMax(), this.setMax);
            }
        }
        return this.setMin;
    }

    public final void setMax(Canvas canvas, Matrix matrix, int i) {
        if (!this.equals) {
            this.setMax.set(matrix);
            setSubmitButtonEnabled setsubmitbuttonenabled = this.getMin;
            if (setsubmitbuttonenabled != null) {
                this.setMax.preConcat(setsubmitbuttonenabled.length());
                i = (int) ((((((float) (this.getMin.setMax == null ? 100 : this.getMin.setMax.equals().intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z = this.isInside.getMax() && length() && i != 255;
            if (z) {
                this.length.set(0.0f, 0.0f, 0.0f, 0.0f);
                setMin(this.length, this.setMax, true);
                this.getMax.setAlpha(i);
                setTitleMarginStart.length(canvas, this.length, this.getMax);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.toIntRange.size() - 1; size >= 0; size--) {
                animateToTab animatetotab = this.toIntRange.get(size);
                if (animatetotab instanceof removeTabAt) {
                    ((removeTabAt) animatetotab).setMax(canvas, this.setMax, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    private boolean length() {
        int i = 0;
        for (int i2 = 0; i2 < this.toIntRange.size(); i2++) {
            if ((this.toIntRange.get(i2) instanceof removeTabAt) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public final void setMin(RectF rectF, Matrix matrix, boolean z) {
        this.setMax.set(matrix);
        setSubmitButtonEnabled setsubmitbuttonenabled = this.getMin;
        if (setsubmitbuttonenabled != null) {
            this.setMax.preConcat(setsubmitbuttonenabled.length());
        }
        this.IsOverlapping.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.toIntRange.size() - 1; size >= 0; size--) {
            animateToTab animatetotab = this.toIntRange.get(size);
            if (animatetotab instanceof removeTabAt) {
                ((removeTabAt) animatetotab).setMin(this.IsOverlapping, this.setMax, z);
                rectF.union(this.IsOverlapping);
            }
        }
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        setSubmitButtonEnabled setsubmitbuttonenabled = this.getMin;
        if (setsubmitbuttonenabled != null) {
            setsubmitbuttonenabled.setMin(t, settitlemarginbottom);
        }
    }

    public createTabView(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, showSoftInputIfNecessary showsoftinputifnecessary) {
        this(lottieDrawable, onkeypreime, showsoftinputifnecessary.length, showsoftinputifnecessary.setMin(), setMin(lottieDrawable, onkeypreime, showsoftinputifnecessary.getMin), getMax(showsoftinputifnecessary.getMin));
    }

    public final void setMax(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
        if (setmaxwidth.getMax(this.toFloatRange, i) || "__container".equals(this.toFloatRange)) {
            if (!"__container".equals(this.toFloatRange)) {
                setmaxwidth2 = setmaxwidth2.setMax(this.toFloatRange);
                if (setmaxwidth.length(this.toFloatRange, i)) {
                    setMaxWidth setmaxwidth3 = new setMaxWidth(setmaxwidth2);
                    setmaxwidth3.getMin = this;
                    list.add(setmaxwidth3);
                }
            }
            if (setmaxwidth.setMax(this.toFloatRange, i)) {
                int min = i + setmaxwidth.setMin(this.toFloatRange, i);
                for (int i2 = 0; i2 < this.toIntRange.size(); i2++) {
                    animateToTab animatetotab = this.toIntRange.get(i2);
                    if (animatetotab instanceof getMaxWidth) {
                        ((getMaxWidth) animatetotab).setMax(setmaxwidth, min, list, setmaxwidth2);
                    }
                }
            }
        }
    }
}
