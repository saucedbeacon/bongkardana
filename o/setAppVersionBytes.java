package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

public final class setAppVersionBytes implements LeadingMarginSpan {
    private static final int[] getMin = new int[0];
    private static final int[] setMin = {16842912};
    private final int getMax;
    private final maybeForceBuilderInitialization length;
    private final boolean setMax;

    public setAppVersionBytes(@NonNull maybeForceBuilderInitialization maybeforcebuilderinitialization, int i, boolean z) {
        this.length = maybeforcebuilderinitialization;
        this.getMax = i;
        this.setMax = z;
    }

    public final int getLeadingMargin(boolean z) {
        return this.length.length() * this.getMax;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Drawable min;
        int i8;
        int i9;
        int[] iArr;
        if (z && parsePartialFrom.setMax(i6, charSequence, this) && (min = this.length.setMin()) != null) {
            int save = canvas.save();
            try {
                int length2 = this.length.length();
                int i10 = i5 - i3;
                int i11 = (int) ((((float) length2) * 0.75f) + 0.5f);
                int i12 = (int) ((((float) i10) * 0.75f) + 0.5f);
                min.setBounds(0, 0, i11, i12);
                if (min.isStateful()) {
                    if (this.setMax) {
                        iArr = setMin;
                    } else {
                        iArr = getMin;
                    }
                    min.setState(iArr);
                }
                if (i2 > 0) {
                    i8 = i + ((this.getMax - 1) * length2);
                    i9 = (length2 - i11) / 2;
                } else {
                    i8 = i - (this.getMax * length2);
                    i9 = (length2 - i11) / 2;
                }
                canvas.translate((float) (i8 + i9), (float) (i3 + ((i10 - i12) / 2)));
                min.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }
}
