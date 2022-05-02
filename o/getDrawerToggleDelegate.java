package o;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;

public final class getDrawerToggleDelegate {
    private EdgeEffect length;

    @Deprecated
    public getDrawerToggleDelegate(Context context) {
        this.length = new EdgeEffect(context);
    }

    @Deprecated
    public final void getMin(int i, int i2) {
        this.length.setSize(i, i2);
    }

    @Deprecated
    public final boolean setMax() {
        return this.length.isFinished();
    }

    @Deprecated
    public final void setMin() {
        this.length.finish();
    }

    @Deprecated
    public final boolean length(float f) {
        this.length.onPull(f);
        return true;
    }

    public static void length(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    @Deprecated
    public final boolean getMin() {
        this.length.onRelease();
        return this.length.isFinished();
    }

    @Deprecated
    public final boolean getMax(int i) {
        this.length.onAbsorb(i);
        return true;
    }

    @Deprecated
    public final boolean length(Canvas canvas) {
        return this.length.draw(canvas);
    }
}
