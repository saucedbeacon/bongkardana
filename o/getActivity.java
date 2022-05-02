package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;

public class getActivity {
    protected Matrix IsOverlapping = new Matrix();
    private Matrix equals = new Matrix();
    protected Matrix getMax = new Matrix();
    protected float[] getMin = new float[1];
    protected float[] isInside = new float[1];
    protected setTargetFragment length;
    protected float[] setMax = new float[1];
    protected Matrix setMin = new Matrix();
    float[] toFloatRange = new float[2];
    protected float[] toIntRange = new float[1];
    private Matrix values = new Matrix();

    public getActivity(setTargetFragment settargetfragment) {
        this.length = settargetfragment;
    }

    public final void getMin(float f, float f2, float f3, float f4) {
        float IsOverlapping2 = this.length.IsOverlapping() / f2;
        float values2 = this.length.values() / f3;
        if (Float.isInfinite(IsOverlapping2)) {
            IsOverlapping2 = 0.0f;
        }
        if (Float.isInfinite(values2)) {
            values2 = 0.0f;
        }
        this.getMax.reset();
        this.getMax.postTranslate(-f, -f4);
        this.getMax.postScale(IsOverlapping2, -values2);
    }

    public void getMax(boolean z) {
        this.setMin.reset();
        if (!z) {
            this.setMin.postTranslate(this.length.setMin(), this.length.Grayscale$Algorithm() - this.length.getMin());
            return;
        }
        this.setMin.setTranslate(this.length.setMin(), -this.length.setMax());
        this.setMin.postScale(1.0f, -1.0f);
    }

    public final float[] setMin(EmojiExtractEditText emojiExtractEditText, float f, float f2, int i, int i2) {
        int i3 = ((int) ((((float) (i2 - i)) * f) + 1.0f)) * 2;
        if (this.setMax.length != i3) {
            this.setMax = new float[i3];
        }
        float[] fArr = this.setMax;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            Entry intRange = emojiExtractEditText.toIntRange((i4 / 2) + i);
            if (intRange != null) {
                fArr[i4] = intRange.length();
                fArr[i4 + 1] = intRange.getMin() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        length().mapPoints(fArr);
        return fArr;
    }

    public final float[] length(EmojiButton emojiButton, float f, int i, int i2) {
        int i3 = ((i2 - i) + 1) * 2;
        if (this.getMin.length != i3) {
            this.getMin = new float[i3];
        }
        float[] fArr = this.getMin;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            Entry intRange = emojiButton.toIntRange((i4 / 2) + i);
            if (intRange != null) {
                fArr[i4] = intRange.length();
                fArr[i4 + 1] = intRange.getMin() * f;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        length().mapPoints(fArr);
        return fArr;
    }

    public final float[] length(setMaxEmojiCount setmaxemojicount, float f, float f2, int i, int i2) {
        int i3 = (((int) (((float) (i2 - i)) * f)) + 1) * 2;
        if (this.isInside.length != i3) {
            this.isInside = new float[i3];
        }
        float[] fArr = this.isInside;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            Entry intRange = setmaxemojicount.toIntRange((i4 / 2) + i);
            if (intRange != null) {
                fArr[i4] = intRange.length();
                fArr[i4 + 1] = intRange.getMin() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        length().mapPoints(fArr);
        return fArr;
    }

    public final float[] getMin(getMaxEmojiCount getmaxemojicount, float f, float f2, int i, int i2) {
        int i3 = ((int) ((((float) (i2 - i)) * f) + 1.0f)) * 2;
        if (this.toIntRange.length != i3) {
            this.toIntRange = new float[i3];
        }
        float[] fArr = this.toIntRange;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            CandleEntry candleEntry = (CandleEntry) getmaxemojicount.toIntRange((i4 / 2) + i);
            if (candleEntry != null) {
                fArr[i4] = candleEntry.length();
                fArr[i4 + 1] = candleEntry.setMax * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        length().mapPoints(fArr);
        return fArr;
    }

    public final void setMin(Path path) {
        path.transform(this.getMax);
        path.transform(this.length.Mean$Arithmetic());
        path.transform(this.setMin);
    }

    public final void length(float[] fArr) {
        this.getMax.mapPoints(fArr);
        this.length.Mean$Arithmetic().mapPoints(fArr);
        this.setMin.mapPoints(fArr);
    }

    public final void setMax(RectF rectF) {
        this.getMax.mapRect(rectF);
        this.length.Mean$Arithmetic().mapRect(rectF);
        this.setMin.mapRect(rectF);
    }

    public final void setMin(RectF rectF, float f) {
        rectF.top *= f;
        rectF.bottom *= f;
        this.getMax.mapRect(rectF);
        this.length.Mean$Arithmetic().mapRect(rectF);
        this.setMin.mapRect(rectF);
    }

    public final void length(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.getMax.mapRect(rectF);
        this.length.Mean$Arithmetic().mapRect(rectF);
        this.setMin.mapRect(rectF);
    }

    public final void setMax(float[] fArr) {
        Matrix matrix = this.IsOverlapping;
        matrix.reset();
        this.setMin.invert(matrix);
        matrix.mapPoints(fArr);
        this.length.Mean$Arithmetic().invert(matrix);
        matrix.mapPoints(fArr);
        this.getMax.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public final void length(float f, float f2, isStateSaved isstatesaved) {
        float[] fArr = this.toFloatRange;
        fArr[0] = f;
        fArr[1] = f2;
        setMax(fArr);
        isstatesaved.length = (double) this.toFloatRange[0];
        isstatesaved.getMin = (double) this.toFloatRange[1];
    }

    public final isStateSaved getMax(float f, float f2) {
        float[] fArr = this.toFloatRange;
        fArr[0] = f;
        fArr[1] = f2;
        this.getMax.mapPoints(fArr);
        this.length.Mean$Arithmetic().mapPoints(fArr);
        this.setMin.mapPoints(fArr);
        float[] fArr2 = this.toFloatRange;
        return isStateSaved.getMin((double) fArr2[0], (double) fArr2[1]);
    }

    private Matrix length() {
        this.equals.set(this.getMax);
        this.equals.postConcat(this.length.setMax);
        this.equals.postConcat(this.setMin);
        return this.equals;
    }
}
