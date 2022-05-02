package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class initFields extends Drawable {
    private Drawable equals;
    private final getUploadFile getMax;
    float getMin;
    private final onAppendLog isInside;
    private final String length;
    private final setMax setMax;
    int setMin;

    public interface setMax {
    }

    public final void setAlpha(@IntRange(from = 0, to = 255) int i) {
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public initFields(@NonNull String str, @NonNull setMax setmax, @Nullable onAppendLog onappendlog, @Nullable getUploadFile getuploadfile) {
        this.length = str;
        this.setMax = setmax;
        this.isInside = onappendlog;
        this.getMax = getuploadfile;
    }

    public final boolean getMax() {
        return this.equals != null;
    }

    public final void draw(@NonNull Canvas canvas) {
        if (getMax()) {
            this.equals.draw(canvas);
        }
    }

    public final int getOpacity() {
        if (getMax()) {
            return this.equals.getOpacity();
        }
        return -2;
    }

    public final int getIntrinsicWidth() {
        if (getMax()) {
            return this.equals.getIntrinsicWidth();
        }
        return 0;
    }

    public final int getIntrinsicHeight() {
        if (getMax()) {
            return this.equals.getIntrinsicHeight();
        }
        return 0;
    }
}
