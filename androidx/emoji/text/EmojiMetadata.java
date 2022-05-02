package androidx.emoji.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.createMultiAutoCompleteTextView;
import o.fitSystemWindows;

@RequiresApi(19)
@AnyThread
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class EmojiMetadata {
    private static final ThreadLocal<fitSystemWindows> getMax = new ThreadLocal<>();
    private final createMultiAutoCompleteTextView getMin;
    private volatile int length = 0;
    private final int setMax;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    public EmojiMetadata(@NonNull createMultiAutoCompleteTextView createmultiautocompletetextview, @IntRange(from = 0) int i) {
        this.getMin = createmultiautocompletetextview;
        this.setMax = i;
    }

    public void setMax(@NonNull Canvas canvas, float f, float f2, @NonNull Paint paint) {
        Typeface min = this.getMin.setMin();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(min);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.getMin.getMax(), this.setMax * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    private fitSystemWindows IsOverlapping() {
        fitSystemWindows fitsystemwindows = getMax.get();
        if (fitsystemwindows == null) {
            fitsystemwindows = new fitSystemWindows();
            getMax.set(fitsystemwindows);
        }
        this.getMin.getMin().setMin(fitsystemwindows, this.setMax);
        return fitsystemwindows;
    }

    public int getMax() {
        return IsOverlapping().length();
    }

    public short setMin() {
        return IsOverlapping().getMin();
    }

    public short setMax() {
        return IsOverlapping().setMin();
    }

    public short length() {
        return IsOverlapping().setMax();
    }

    public int getMin() {
        return this.length;
    }

    public void setMin(boolean z) {
        this.length = z ? 2 : 1;
    }

    public boolean toFloatRange() {
        return IsOverlapping().getMax();
    }

    public int getMax(int i) {
        return IsOverlapping().getMax(i);
    }

    public int equals() {
        return IsOverlapping().isInside();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(getMax()));
        sb.append(", codepoints:");
        int equals = equals();
        for (int i = 0; i < equals; i++) {
            sb.append(Integer.toHexString(getMax(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
