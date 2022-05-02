package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

public abstract class onDismiss extends onGetLayoutInflater {
    public onDismiss(setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
    }

    /* access modifiers changed from: protected */
    public final void getMax(Canvas canvas, Path path, Drawable drawable) {
        if (length()) {
            int save = canvas.save();
            canvas.clipPath(path);
            drawable.setBounds((int) this.invokeSuspend.isInside(), (int) this.invokeSuspend.toIntRange(), (int) this.invokeSuspend.equals(), (int) this.invokeSuspend.toFloatRange());
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        StringBuilder sb = new StringBuilder("Fill-drawables not (yet) supported below API level 18, this code was run on API level ");
        sb.append(getTargetFragment.getMax());
        sb.append(".");
        throw new RuntimeException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void getMin(Canvas canvas, Path path, int i, int i2) {
        int i3 = (i & FlexItem.MAX_SIZE) | (i2 << 24);
        if (length()) {
            int save = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i3);
            canvas.restoreToCount(save);
            return;
        }
        Paint.Style style = this.toFloatRange.getStyle();
        int color = this.toFloatRange.getColor();
        this.toFloatRange.setStyle(Paint.Style.FILL);
        this.toFloatRange.setColor(i3);
        canvas.drawPath(path, this.toFloatRange);
        this.toFloatRange.setColor(color);
        this.toFloatRange.setStyle(style);
    }

    private static boolean length() {
        return getTargetFragment.getMax() >= 18;
    }
}
