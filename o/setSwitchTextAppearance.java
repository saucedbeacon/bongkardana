package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;

public final class setSwitchTextAppearance extends onKeyPreIme {
    private final Rect IsOverlapping = new Rect();
    private final Rect equals = new Rect();
    private final Paint toIntRange = new clearSelection(3);
    @Nullable
    private setInputType<ColorFilter, ColorFilter> toString;

    setSwitchTextAppearance(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
    }

    public final void setMin(RectF rectF, Matrix matrix, boolean z) {
        super.setMin(rectF, matrix, z);
        Bitmap min = this.getMax.getMin(this.length.toIntRange);
        if (min != null) {
            rectF.set(0.0f, 0.0f, ((float) min.getWidth()) * setTitleMarginStart.getMax(), ((float) min.getHeight()) * setTitleMarginStart.getMax());
            this.setMin.mapRect(rectF);
        }
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        super.length(t, settitlemarginbottom);
        if (t != MenuPopupWindow$MenuDropDownListView.asBinder) {
            return;
        }
        if (settitlemarginbottom == null) {
            this.toString = null;
        } else {
            this.toString = new isSubmitButtonEnabled(settitlemarginbottom);
        }
    }

    public final void getMin(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap min = this.getMax.getMin(this.length.toIntRange);
        if (min != null && !min.isRecycled()) {
            float max = setTitleMarginStart.getMax();
            this.toIntRange.setAlpha(i);
            setInputType<ColorFilter, ColorFilter> setinputtype = this.toString;
            if (setinputtype != null) {
                this.toIntRange.setColorFilter(setinputtype.equals());
            }
            canvas.save();
            canvas.concat(matrix);
            this.IsOverlapping.set(0, 0, min.getWidth(), min.getHeight());
            this.equals.set(0, 0, (int) (((float) min.getWidth()) * max), (int) (((float) min.getHeight()) * max));
            canvas.drawBitmap(min, this.IsOverlapping, this.equals, this.toIntRange);
            canvas.restore();
        }
    }
}
