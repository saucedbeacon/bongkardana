package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import java.util.Collections;
import java.util.List;

public final class setSwitchPadding extends onKeyPreIme {
    private final createTabView toIntRange;

    setSwitchPadding(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        createTabView createtabview = new createTabView(lottieDrawable, this, new showSoftInputIfNecessary("__container", layer.setMin, false));
        this.toIntRange = createtabview;
        createtabview.setMax(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    public final void getMin(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.toIntRange.setMax(canvas, matrix, i);
    }

    public final void setMin(RectF rectF, Matrix matrix, boolean z) {
        super.setMin(rectF, matrix, z);
        this.toIntRange.setMin(rectF, this.setMin, z);
    }

    /* access modifiers changed from: protected */
    public final void length(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
        this.toIntRange.setMax(setmaxwidth, i, list, setmaxwidth2);
    }
}
