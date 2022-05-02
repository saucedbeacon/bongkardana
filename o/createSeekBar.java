package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji.text.EmojiCompat;
import androidx.emoji.text.EmojiMetadata;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class createSeekBar extends createRatingBar {
    private static Paint length;

    public createSeekBar(EmojiMetadata emojiMetadata) {
        super(emojiMetadata);
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        if (EmojiCompat.getMax().length()) {
            canvas.drawRect(f, (float) i3, f + ((float) getMax()), (float) i5, length());
        }
        setMin().setMax(canvas, f, (float) i4, paint);
    }

    private static Paint length() {
        if (length == null) {
            TextPaint textPaint = new TextPaint();
            length = textPaint;
            textPaint.setColor(EmojiCompat.getMax().setMin());
            length.setStyle(Paint.Style.FILL);
        }
        return length;
    }
}
