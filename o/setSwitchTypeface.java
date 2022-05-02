package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;

public final class setSwitchTypeface extends onKeyPreIme {
    /* access modifiers changed from: package-private */
    public final void getMin(Canvas canvas, Matrix matrix, int i) {
    }

    setSwitchTypeface(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
    }

    public final void setMin(RectF rectF, Matrix matrix, boolean z) {
        super.setMin(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
