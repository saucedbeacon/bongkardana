package o;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.emoji.text.EmojiMetadata;
import java.io.IOException;
import java.nio.ByteBuffer;

@RequiresApi(19)
@AnyThread
public final class createMultiAutoCompleteTextView {
    private final onApplyWindowInsets getMax;
    private final getMax getMin;
    private final char[] length;
    private final Typeface setMax;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    createMultiAutoCompleteTextView() {
        this.setMax = null;
        this.getMax = null;
        this.getMin = new getMax(1024);
        this.length = new char[0];
    }

    private createMultiAutoCompleteTextView(@NonNull Typeface typeface, @NonNull onApplyWindowInsets onapplywindowinsets) {
        this.setMax = typeface;
        this.getMax = onapplywindowinsets;
        this.getMin = new getMax(1024);
        this.length = new char[(this.getMax.getMin() * 2)];
        setMin(this.getMax);
    }

    public static createMultiAutoCompleteTextView getMax(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        return new createMultiAutoCompleteTextView(typeface, createAutoCompleteTextView.getMin(byteBuffer));
    }

    private void setMin(onApplyWindowInsets onapplywindowinsets) {
        int min = onapplywindowinsets.getMin();
        for (int i = 0; i < min; i++) {
            EmojiMetadata emojiMetadata = new EmojiMetadata(this, i);
            Character.toChars(emojiMetadata.getMax(), this.length, i * 2);
            setMin(emojiMetadata);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Typeface setMin() {
        return this.setMax;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int setMax() {
        return this.getMax.setMax();
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final getMax length() {
        return this.getMin;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final char[] getMax() {
        return this.length;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final onApplyWindowInsets getMin() {
        return this.getMax;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setMin(@NonNull EmojiMetadata emojiMetadata) {
        if (emojiMetadata != null) {
            if (emojiMetadata.equals() > 0) {
                this.getMin.setMin(emojiMetadata, 0, emojiMetadata.equals() - 1);
                return;
            }
            throw new IllegalArgumentException("invalid metadata codepoint length");
        }
        throw new NullPointerException("emoji metadata cannot be null");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static class getMax {
        final SparseArray<getMax> getMax;
        EmojiMetadata getMin;

        private getMax() {
            this(1);
        }

        getMax(int i) {
            this.getMax = new SparseArray<>(i);
        }

        /* access modifiers changed from: package-private */
        public final void setMin(@NonNull EmojiMetadata emojiMetadata, int i, int i2) {
            getMax getmax = this;
            while (true) {
                int max = emojiMetadata.getMax(i);
                SparseArray<getMax> sparseArray = getmax.getMax;
                getMax getmax2 = sparseArray == null ? null : sparseArray.get(max);
                if (getmax2 == null) {
                    getmax2 = new getMax();
                    getmax.getMax.put(emojiMetadata.getMax(i), getmax2);
                }
                getmax = getmax2;
                if (i2 > i) {
                    i++;
                } else {
                    getmax.getMin = emojiMetadata;
                    return;
                }
            }
        }
    }
}
