package o;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;

public final class RemoteInput$Source {
    private static Rect getMax;
    private static Paint getMin;
    private static Paint length;
    public static Paint setMax;
    public static Paint setMin;

    RemoteInput$Source() {
    }

    public static void setMin(ComponentHost componentHost, Canvas canvas) {
        Resources resources = componentHost.getResources();
        if (getMax == null) {
            getMax = new Rect();
        }
        if (getMin == null) {
            Paint paint = new Paint();
            getMin = paint;
            paint.setStyle(Paint.Style.STROKE);
            getMin.setStrokeWidth((float) ((int) ((resources.getDisplayMetrics().density * 1.0f) + 0.5f)));
        }
        if (length == null) {
            Paint paint2 = new Paint();
            length = paint2;
            paint2.setStyle(Paint.Style.FILL);
            length.setStrokeWidth((float) ((int) ((resources.getDisplayMetrics().density * 2.0f) + 0.5f)));
        }
        for (int mountItemCount = componentHost.getMountItemCount() - 1; mountItemCount >= 0; mountItemCount--) {
            WindowInsetsAnimationCompat$Callback$DispatchMode mountItemAt = componentHost.getMountItemAt(mountItemCount);
            isStopped isstopped = mountItemAt.setMin;
            Object obj = mountItemAt.length != null ? mountItemAt.length : mountItemAt.setMax;
            if (getMax(isstopped)) {
                if (obj instanceof View) {
                    View view = (View) obj;
                    getMax.left = view.getLeft();
                    getMax.top = view.getTop();
                    getMax.right = view.getRight();
                    getMax.bottom = view.getBottom();
                } else if (obj instanceof Drawable) {
                    getMax.set(((Drawable) obj).getBounds());
                }
                getMin.setColor(isStopped.setMin(isstopped) ? -1711341313 : -1711341568);
                Paint paint3 = getMin;
                Rect rect = getMax;
                int strokeWidth = ((int) paint3.getStrokeWidth()) / 2;
                canvas.drawRect((float) (rect.left + strokeWidth), (float) (rect.top + strokeWidth), (float) (rect.right - strokeWidth), (float) (rect.bottom - strokeWidth), paint3);
                length.setColor(isStopped.setMin(isstopped) ? -16711681 : -16776961);
                Paint paint4 = length;
                Rect rect2 = getMax;
                int strokeWidth2 = (int) paint4.getStrokeWidth();
                Canvas canvas2 = canvas;
                Paint paint5 = paint4;
                int i = strokeWidth2;
                int min = Math.min(Math.min(getMax.width(), getMax.height()) / 3, (int) ((resources.getDisplayMetrics().density * 12.0f) + 0.5f));
                setMin(canvas2, paint5, rect2.left, rect2.top, i, strokeWidth2, min);
                int i2 = -strokeWidth2;
                setMin(canvas2, paint5, rect2.left, rect2.bottom, i, i2, min);
                int i3 = i2;
                setMin(canvas2, paint5, rect2.right, rect2.top, i3, strokeWidth2, min);
                setMin(canvas2, paint5, rect2.right, rect2.bottom, i3, i2, min);
            }
        }
    }

    private static boolean getMax(isStopped isstopped) {
        return !(isstopped instanceof PermissionInfoCompat$Protection);
    }

    private static void setMin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5) {
        int i6 = 1;
        setMin(canvas, paint, i, i2, i + i3, i2 + ((((float) i4) >= 0.0f ? 1 : -1) * i5));
        if (((float) i3) < 0.0f) {
            i6 = -1;
        }
        setMin(canvas, paint, i, i2, i + (i5 * i6), i2 + i4);
    }

    private static void setMin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4) {
        if (i > i3) {
            int i5 = i3;
            i3 = i;
            i = i5;
        }
        if (i2 > i4) {
            int i6 = i4;
            i4 = i2;
            i2 = i6;
        }
        canvas.drawRect((float) i, (float) i2, (float) i3, (float) i4, paint);
    }

    public static boolean setMax(View view) {
        return (WindowInsetsCompat$Type$InsetsType.setMin(view) == null && WindowInsetsCompat$Type$InsetsType.getMin(view) == null && WindowInsetsCompat$Type$InsetsType.getMax(view) == null) ? false : true;
    }
}
