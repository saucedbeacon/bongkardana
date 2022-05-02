package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;

public final class SwitchCompat extends onKeyPreIme {
    private final float[] IsOverlapping = new float[8];
    private final RectF equals = new RectF();
    private final Path hashCode = new Path();
    private final Paint toIntRange = new clearSelection();
    private final Layer toString;
    @Nullable
    private setInputType<ColorFilter, ColorFilter> values;

    SwitchCompat(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.toString = layer;
        this.toIntRange.setAlpha(0);
        this.toIntRange.setStyle(Paint.Style.FILL);
        this.toIntRange.setColor(layer.FastBitmap$CoordinateSystem);
    }

    public final void getMin(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.toString.FastBitmap$CoordinateSystem);
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.isInside.setMax == null ? 100 : this.isInside.setMax.equals().intValue()))) / 100.0f) * 255.0f);
            this.toIntRange.setAlpha(intValue);
            setInputType<ColorFilter, ColorFilter> setinputtype = this.values;
            if (setinputtype != null) {
                this.toIntRange.setColorFilter(setinputtype.equals());
            }
            if (intValue > 0) {
                float[] fArr = this.IsOverlapping;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.toString.isInside;
                float[] fArr2 = this.IsOverlapping;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.toString.isInside;
                this.IsOverlapping[5] = (float) this.toString.toDoubleRange;
                float[] fArr3 = this.IsOverlapping;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.toString.toDoubleRange;
                matrix.mapPoints(this.IsOverlapping);
                this.hashCode.reset();
                Path path = this.hashCode;
                float[] fArr4 = this.IsOverlapping;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.hashCode;
                float[] fArr5 = this.IsOverlapping;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.hashCode;
                float[] fArr6 = this.IsOverlapping;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.hashCode;
                float[] fArr7 = this.IsOverlapping;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.hashCode;
                float[] fArr8 = this.IsOverlapping;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.hashCode.close();
                canvas.drawPath(this.hashCode, this.toIntRange);
            }
        }
    }

    public final void setMin(RectF rectF, Matrix matrix, boolean z) {
        super.setMin(rectF, matrix, z);
        this.equals.set(0.0f, 0.0f, (float) this.toString.isInside, (float) this.toString.toDoubleRange);
        this.setMin.mapRect(this.equals);
        rectF.set(this.equals);
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        super.length(t, settitlemarginbottom);
        if (t != MenuPopupWindow$MenuDropDownListView.asBinder) {
            return;
        }
        if (settitlemarginbottom == null) {
            this.values = null;
        } else {
            this.values = new isSubmitButtonEnabled(settitlemarginbottom);
        }
    }
}
