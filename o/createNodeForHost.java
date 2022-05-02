package o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DisplayList;
import android.view.HardwareCanvas;
import com.facebook.litho.displaylist.DisplayListException;
import java.lang.reflect.Constructor;
import javax.annotation.Nullable;

public class createNodeForHost implements requestAccessibilityFocus {
    private static Constructor getMax = null;
    private static boolean getMin = false;
    private static boolean setMax = false;
    private static Class setMin;
    protected final DisplayList length;

    @Nullable
    public static requestAccessibilityFocus getMax(String str) {
        DisplayList min = getMin(str);
        if (min == null) {
            return null;
        }
        return new createNodeForHost(min);
    }

    createNodeForHost(DisplayList displayList) {
        this.length = displayList;
    }

    public Canvas getMax(int i, int i2) {
        Canvas start = this.length.start();
        HardwareCanvas hardwareCanvas = (HardwareCanvas) start;
        hardwareCanvas.setViewport(i, i2);
        hardwareCanvas.onPreDraw((Rect) null);
        return start;
    }

    public void length(Canvas canvas) {
        ((HardwareCanvas) canvas).onPostDraw();
        this.length.end();
    }

    public final void setMin(Canvas canvas) throws DisplayListException {
        if (canvas instanceof HardwareCanvas) {
            ((HardwareCanvas) canvas).drawDisplayList(this.length, (Rect) null, 0);
            return;
        }
        throw new DisplayListException(new ClassCastException());
    }

    public void length(int i, int i2, int i3, int i4) {
        this.length.setLeftTopRightBottom(i, i2, i3, i4);
        this.length.setClipChildren(false);
    }

    public final void setMax(float f) {
        this.length.setTranslationX(f);
    }

    public final void getMin(float f) {
        this.length.setTranslationY(f);
    }

    public final boolean getMin() {
        return this.length.isValid();
    }

    @Nullable
    static DisplayList getMin(String str) {
        try {
            if (!setMax) {
                if (!getMin) {
                    Class<?> cls = Class.forName("android.view.GLES20DisplayList");
                    setMin = cls;
                    Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[]{String.class});
                    getMax = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    setMax = true;
                }
            }
            if (!setMax) {
                return null;
            }
        } catch (Throwable unused) {
            getMin = true;
        }
        try {
            return (DisplayList) getMax.newInstance(new Object[]{str});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
