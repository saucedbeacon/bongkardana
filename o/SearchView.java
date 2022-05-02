package o;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import java.util.List;
import o.PlaybackStateCompat;

public final class SearchView extends setHoverListener {
    private final setInputType<PointF, PointF> FastBitmap$CoordinateSystem;
    private final RectF IsOverlapping = new RectF();
    private final PlaybackStateCompat.ShuffleMode<RadialGradient> equals = new PlaybackStateCompat.ShuffleMode<>();
    private final PlaybackStateCompat.ShuffleMode<LinearGradient> getMin = new PlaybackStateCompat.ShuffleMode<>();
    private final setInputType<PointF, PointF> hashCode;
    private final int isInside;
    private final String length;
    private final boolean setMax;
    private final setInputType<onFocusChanged, onFocusChanged> toFloatRange;
    private final GradientType toIntRange;
    @Nullable
    private isSubmitButtonEnabled values;

    public interface SavedState<K, A> {
        setInputType<K, A> getMax();

        boolean getMin();

        List<setTitleMarginTop<K>> setMin();
    }

    public final class SearchAutoComplete implements isLandscapeMode {
        private final boolean getMax;
        public final SavedState<PointF, PointF> getMin;
        public final String length;
        public final onSearchClicked setMax;
        private final boolean setMin;

        public SearchAutoComplete(String str, SavedState<PointF, PointF> savedState, onSearchClicked onsearchclicked, boolean z, boolean z2) {
            this.length = str;
            this.getMin = savedState;
            this.setMax = onsearchclicked;
            this.setMin = z;
            this.getMax = z2;
        }

        public final animateToTab length(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime) {
            return new updateTab(lottieDrawable, onkeypreime, this);
        }

        public final boolean length() {
            return this.setMin;
        }

        public final boolean setMin() {
            return this.getMax;
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.setMax
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.IsOverlapping
            r3 = 0
            r0.setMin(r2, r1, r3)
            com.airbnb.lottie.model.content.GradientType r2 = r0.toIntRange
            com.airbnb.lottie.model.content.GradientType r3 = com.airbnb.lottie.model.content.GradientType.LINEAR
            r4 = 0
            if (r2 != r3) goto L_0x005d
            int r2 = r16.getMax()
            o.PlaybackStateCompat$ShuffleMode<android.graphics.LinearGradient> r3 = r0.getMin
            long r5 = (long) r2
            java.lang.Object r2 = r3.getMax(r5, r4)
            android.graphics.LinearGradient r2 = (android.graphics.LinearGradient) r2
            if (r2 == 0) goto L_0x0027
            goto L_0x00ab
        L_0x0027:
            o.setInputType<android.graphics.PointF, android.graphics.PointF> r2 = r0.hashCode
            java.lang.Object r2 = r2.equals()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            o.setInputType<android.graphics.PointF, android.graphics.PointF> r3 = r0.FastBitmap$CoordinateSystem
            java.lang.Object r3 = r3.equals()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            o.setInputType<o.onFocusChanged, o.onFocusChanged> r4 = r0.toFloatRange
            java.lang.Object r4 = r4.equals()
            o.onFocusChanged r4 = (o.onFocusChanged) r4
            int[] r7 = r4.length
            int[] r13 = r0.length(r7)
            float[] r14 = r4.setMin
            float r9 = r2.x
            float r10 = r2.y
            float r11 = r3.x
            float r12 = r3.y
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            o.PlaybackStateCompat$ShuffleMode<android.graphics.LinearGradient> r3 = r0.getMin
            r3.setMax(r5, r2)
            goto L_0x00ab
        L_0x005d:
            int r2 = r16.getMax()
            o.PlaybackStateCompat$ShuffleMode<android.graphics.RadialGradient> r3 = r0.equals
            long r5 = (long) r2
            java.lang.Object r2 = r3.getMax(r5, r4)
            android.graphics.RadialGradient r2 = (android.graphics.RadialGradient) r2
            if (r2 == 0) goto L_0x006d
            goto L_0x00ab
        L_0x006d:
            o.setInputType<android.graphics.PointF, android.graphics.PointF> r2 = r0.hashCode
            java.lang.Object r2 = r2.equals()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            o.setInputType<android.graphics.PointF, android.graphics.PointF> r3 = r0.FastBitmap$CoordinateSystem
            java.lang.Object r3 = r3.equals()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            o.setInputType<o.onFocusChanged, o.onFocusChanged> r4 = r0.toFloatRange
            java.lang.Object r4 = r4.equals()
            o.onFocusChanged r4 = (o.onFocusChanged) r4
            int[] r7 = r4.length
            int[] r12 = r0.length(r7)
            float[] r13 = r4.setMin
            float r9 = r2.x
            float r10 = r2.y
            float r2 = r3.x
            float r3 = r3.y
            float r2 = r2 - r9
            double r7 = (double) r2
            float r3 = r3 - r10
            double r2 = (double) r3
            double r2 = java.lang.Math.hypot(r7, r2)
            float r11 = (float) r2
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            o.PlaybackStateCompat$ShuffleMode<android.graphics.RadialGradient> r3 = r0.equals
            r3.setMax(r5, r2)
        L_0x00ab:
            r2.setLocalMatrix(r1)
            android.graphics.Paint r3 = r0.setMin
            r3.setShader(r2)
            super.setMax(r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SearchView.setMax(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final String setMin() {
        return this.length;
    }

    private int getMax() {
        int round = Math.round(this.hashCode.IsOverlapping() * ((float) this.isInside));
        int round2 = Math.round(this.FastBitmap$CoordinateSystem.IsOverlapping() * ((float) this.isInside));
        int round3 = Math.round(this.toFloatRange.IsOverlapping() * ((float) this.isInside));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] length(int[] iArr) {
        isSubmitButtonEnabled issubmitbuttonenabled = this.values;
        if (issubmitbuttonenabled != null) {
            Integer[] numArr = (Integer[]) issubmitbuttonenabled.equals();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        super.length(t, settitlemarginbottom);
        if (t == MenuPopupWindow$MenuDropDownListView.ICustomTabsCallback$Default) {
            if (this.values != null) {
                onKeyPreIme onkeypreime = this.getMax;
                onkeypreime.setMax.remove(this.values);
            }
            if (settitlemarginbottom == null) {
                this.values = null;
                return;
            }
            isSubmitButtonEnabled issubmitbuttonenabled = new isSubmitButtonEnabled(settitlemarginbottom);
            this.values = issubmitbuttonenabled;
            issubmitbuttonenabled.getMin.add(this);
            onKeyPreIme onkeypreime2 = this.getMax;
            isSubmitButtonEnabled issubmitbuttonenabled2 = this.values;
            if (issubmitbuttonenabled2 != null) {
                onkeypreime2.setMax.add(issubmitbuttonenabled2);
            }
        }
    }

    public SearchView(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, performCompletion performcompletion) {
        super(lottieDrawable, onkeypreime, performcompletion.isInside.toPaintCap(), performcompletion.toFloatRange.toPaintJoin(), performcompletion.toIntRange, performcompletion.setMin, performcompletion.equals, performcompletion.hashCode, performcompletion.toDoubleRange);
        this.length = performcompletion.setMax;
        this.toIntRange = performcompletion.getMax;
        this.setMax = performcompletion.length();
        setVerticalGravity setverticalgravity = lottieDrawable.length;
        this.isInside = (int) (((float) ((long) (((setverticalgravity.toDoubleRange - setverticalgravity.values) / setverticalgravity.toString) * 1000.0f))) / 32.0f);
        setOnSuggestionListener setonsuggestionlistener = new setOnSuggestionListener(performcompletion.getMin.setMin);
        this.toFloatRange = setonsuggestionlistener;
        setonsuggestionlistener.getMin.add(this);
        setInputType<onFocusChanged, onFocusChanged> setinputtype = this.toFloatRange;
        if (setinputtype != null) {
            onkeypreime.setMax.add(setinputtype);
        }
        getQueryHint getqueryhint = new getQueryHint(performcompletion.length.setMin);
        this.hashCode = getqueryhint;
        getqueryhint.getMin.add(this);
        setInputType<PointF, PointF> setinputtype2 = this.hashCode;
        if (setinputtype2 != null) {
            onkeypreime.setMax.add(setinputtype2);
        }
        getQueryHint getqueryhint2 = new getQueryHint(performcompletion.IsOverlapping.setMin);
        this.FastBitmap$CoordinateSystem = getqueryhint2;
        getqueryhint2.getMin.add(this);
        setInputType<PointF, PointF> setinputtype3 = this.FastBitmap$CoordinateSystem;
        if (setinputtype3 != null) {
            onkeypreime.setMax.add(setinputtype3);
        }
    }
}
