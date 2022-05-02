package o;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji.text.EmojiMetadata;

@RequiresApi(19)
public abstract class createRatingBar extends ReplacementSpan {
    private short getMax = -1;
    private final EmojiMetadata getMin;
    private float length = 1.0f;
    private short setMax = -1;
    private final Paint.FontMetricsInt setMin = new Paint.FontMetricsInt();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    createRatingBar(@NonNull EmojiMetadata emojiMetadata) {
        if (emojiMetadata != null) {
            this.getMin = emojiMetadata;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.setMin);
        this.length = (((float) Math.abs(this.setMin.descent - this.setMin.ascent)) * 1.0f) / ((float) this.getMin.setMax());
        this.getMax = (short) ((int) (((float) this.getMin.setMax()) * this.length));
        this.setMax = (short) ((int) (((float) this.getMin.setMin()) * this.length));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.setMin.ascent;
            fontMetricsInt.descent = this.setMin.descent;
            fontMetricsInt.top = this.setMin.top;
            fontMetricsInt.bottom = this.setMin.bottom;
        }
        return this.setMax;
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final EmojiMetadata setMin() {
        return this.getMin;
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int getMax() {
        return this.setMax;
    }
}
