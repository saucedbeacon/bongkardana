package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;
import o.setInputType;

public final class setAppSearchData implements removeTabAt, setImeOptions, removeAllTabs, setInputType.getMin, onNothingSelected {
    private final boolean IsOverlapping;
    private final setSubmitButtonEnabled equals;
    private final Matrix getMax = new Matrix();
    private final Path getMin = new Path();
    private final setInputType<Float, Float> isInside;
    private final onKeyPreIme length;
    private final LottieDrawable setMax;
    private final String setMin;
    private createTabView toFloatRange;
    private final setInputType<Float, Float> toIntRange;

    public setAppSearchData(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, setThreshold setthreshold) {
        this.setMax = lottieDrawable;
        this.length = onkeypreime;
        this.setMin = setthreshold.getMin;
        this.IsOverlapping = setthreshold.getMin();
        setOnQueryTextListener setonquerytextlistener = new setOnQueryTextListener(setthreshold.getMax.setMin);
        this.isInside = setonquerytextlistener;
        if (setonquerytextlistener != null) {
            onkeypreime.setMax.add(setonquerytextlistener);
        }
        this.isInside.getMin.add(this);
        setOnQueryTextListener setonquerytextlistener2 = new setOnQueryTextListener(setthreshold.length.setMin);
        this.toIntRange = setonquerytextlistener2;
        if (setonquerytextlistener2 != null) {
            onkeypreime.setMax.add(setonquerytextlistener2);
        }
        this.toIntRange.getMin.add(this);
        setSubmitButtonEnabled setsubmitbuttonenabled = new setSubmitButtonEnabled(setthreshold.setMax);
        this.equals = setsubmitbuttonenabled;
        setsubmitbuttonenabled.length(onkeypreime);
        this.equals.length((setInputType.getMin) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(java.util.ListIterator<o.animateToTab> r9) {
        /*
            r8 = this;
            o.createTabView r0 = r8.toFloatRange
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r9.previous()
            if (r0 != r8) goto L_0x0005
        L_0x0011:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0016:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r6)
            o.createTabView r9 = new o.createTabView
            com.airbnb.lottie.LottieDrawable r2 = r8.setMax
            o.onKeyPreIme r3 = r8.length
            boolean r5 = r8.IsOverlapping
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.toFloatRange = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAppSearchData.length(java.util.ListIterator):void");
    }

    public final String setMin() {
        return this.setMin;
    }

    public final void setMax(List<animateToTab> list, List<animateToTab> list2) {
        this.toFloatRange.setMax(list, list2);
    }

    public final Path getMax() {
        Path max = this.toFloatRange.getMax();
        this.getMin.reset();
        float floatValue = this.isInside.equals().floatValue();
        float floatValue2 = this.toIntRange.equals().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.getMax.set(this.equals.setMin(((float) i) + floatValue2));
            this.getMin.addPath(max, this.getMax);
        }
        return this.getMin;
    }

    public final void setMax(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.isInside.equals().floatValue();
        float floatValue2 = this.toIntRange.equals().floatValue();
        float floatValue3 = this.equals.toFloatRange.equals().floatValue() / 100.0f;
        float floatValue4 = this.equals.IsOverlapping.equals().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.getMax.set(matrix);
            float f = (float) i2;
            this.getMax.preConcat(this.equals.setMin(f + floatValue2));
            this.toFloatRange.setMax(canvas, this.getMax, (int) (((float) i) * getTitleMarginTop.getMin(floatValue3, floatValue4, f / floatValue)));
        }
    }

    public final void setMin(RectF rectF, Matrix matrix, boolean z) {
        this.toFloatRange.setMin(rectF, matrix, z);
    }

    public final void setMax() {
        this.setMax.invalidateSelf();
    }

    public final void setMax(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
        getTitleMarginTop.getMin(setmaxwidth, i, list, setmaxwidth2, this);
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        if (!this.equals.setMin(t, settitlemarginbottom)) {
            if (t == MenuPopupWindow$MenuDropDownListView.invoke) {
                this.isInside.getMin(settitlemarginbottom);
            } else if (t == MenuPopupWindow$MenuDropDownListView.valueOf) {
                this.toIntRange.getMin(settitlemarginbottom);
            }
        }
    }
}
