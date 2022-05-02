package o;

import android.graphics.Canvas;
import android.view.HardwareCanvas;
import android.view.RenderNode;
import com.facebook.litho.displaylist.DisplayListException;

public final class isVisibleToUser implements requestAccessibilityFocus {
    private final RenderNode setMax;

    public isVisibleToUser(RenderNode renderNode) {
        this.setMax = renderNode;
    }

    public final Canvas getMax(int i, int i2) {
        return this.setMax.start(i, i2);
    }

    public final void length(Canvas canvas) {
        this.setMax.end((HardwareCanvas) canvas);
    }

    public final void setMin(Canvas canvas) throws DisplayListException {
        if (canvas instanceof HardwareCanvas) {
            ((HardwareCanvas) canvas).drawRenderNode(this.setMax);
            return;
        }
        throw new DisplayListException(new ClassCastException());
    }

    public final void length(int i, int i2, int i3, int i4) {
        this.setMax.setLeftTopRightBottom(i, i2, i3, i4);
        this.setMax.setClipToBounds(false);
    }

    public final void setMax(float f) {
        this.setMax.setTranslationX(f);
    }

    public final void getMin(float f) {
        this.setMax.setTranslationY(f);
    }

    public final boolean getMin() {
        return this.setMax.isValid();
    }
}
