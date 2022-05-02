package o;

import android.graphics.Canvas;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import com.facebook.litho.displaylist.DisplayListException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

public class performActionForHost implements requestAccessibilityFocus {
    private static Method getMax = null;
    private static Class getMin = null;
    protected static boolean length = false;
    protected static boolean setMin = false;
    protected final RenderNode setMax;

    protected static void getMax() throws Exception {
        if (!length && !setMin) {
            Class<?> cls = Class.forName("android.view.RenderNode");
            getMin = cls;
            getMax = cls.getDeclaredMethod("start", new Class[]{Integer.TYPE, Integer.TYPE});
            length = true;
        }
    }

    @Nullable
    public static requestAccessibilityFocus setMax(String str) {
        try {
            getMax();
            if (length) {
                return new performActionForHost(RenderNode.create(str, (View) null));
            }
        } catch (Throwable unused) {
            setMin = true;
        }
        return null;
    }

    performActionForHost(RenderNode renderNode) {
        this.setMax = renderNode;
    }

    public final Canvas getMax(int i, int i2) throws DisplayListException {
        return (Canvas) clearAccessibilityFocus.setMin(getMax, this.setMax, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void length(Canvas canvas) {
        this.setMax.end((DisplayListCanvas) canvas);
    }

    public final void setMin(Canvas canvas) throws DisplayListException {
        if (canvas instanceof DisplayListCanvas) {
            ((DisplayListCanvas) canvas).drawRenderNode(this.setMax);
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
