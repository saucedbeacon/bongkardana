package o;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public final class DiagnoseLogAppender implements Appendable, CharSequence {
    private final Deque<getMax> getMax;
    public final StringBuilder setMin;

    private static boolean getMax(int i, int i2, int i3) {
        return i3 > i2 && i2 >= 0 && i3 <= i;
    }

    public static void getMax(@NonNull DiagnoseLogAppender diagnoseLogAppender, @Nullable Object obj, int i, int i2) {
        if (obj != null && getMax(diagnoseLogAppender.length(), i, i2)) {
            if (obj.getClass().isArray()) {
                for (Object getmax : (Object[]) obj) {
                    diagnoseLogAppender.getMax.push(new getMax(getmax, i, i2, 33));
                }
                return;
            }
            diagnoseLogAppender.getMax.push(new getMax(obj, i, i2, 33));
        }
    }

    public DiagnoseLogAppender() {
        this("");
    }

    private DiagnoseLogAppender(@NonNull CharSequence charSequence) {
        this.getMax = new ArrayDeque(8);
        this.setMin = new StringBuilder(charSequence);
        getMax(0, charSequence);
    }

    public final int length() {
        return this.setMin.length();
    }

    public final char charAt(int i) {
        return this.setMin.charAt(i);
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.setMin.subSequence(i, i2);
    }

    public final char getMin() {
        return this.setMin.charAt(length() - 1);
    }

    @NonNull
    public final CharSequence getMax(int i) {
        getMax next;
        int length = length();
        appendBufferToFile appendbuffertofile = new appendBufferToFile(this.setMin.subSequence(i, length));
        Iterator<getMax> it = this.getMax.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (next.setMin >= i && next.setMax <= length) {
                appendbuffertofile.setSpan(next.getMax, next.setMin - i, next.setMax - i, 33);
                it.remove();
            }
        }
        this.setMin.replace(i, length, "");
        return appendbuffertofile;
    }

    @NonNull
    public final String toString() {
        return this.setMin.toString();
    }

    @NonNull
    public final SpannableStringBuilder setMax() {
        appendBufferToFile appendbuffertofile = new appendBufferToFile(this.setMin);
        for (getMax next : this.getMax) {
            appendbuffertofile.setSpan(next.getMax, next.setMin, next.setMax, next.length);
        }
        return appendbuffertofile;
    }

    public final void getMax(int i, @Nullable CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof cleanExcessFiles;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length <= 0) {
                return;
            }
            if (z) {
                for (int i2 = length - 1; i2 >= 0; i2--) {
                    Object obj = spans[i2];
                    this.getMax.push(new getMax(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj)));
                }
                return;
            }
            for (int i3 = 0; i3 < length; i3++) {
                Object obj2 = spans[i3];
                this.getMax.push(new getMax(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2)));
            }
        }
    }

    static class getMax {
        final Object getMax;
        final int length;
        int setMax;
        int setMin;

        getMax(@NonNull Object obj, int i, int i2, int i3) {
            this.getMax = obj;
            this.setMin = i;
            this.setMax = i2;
            this.length = i3;
        }
    }

    @NonNull
    public final /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
        this.setMin.append(c);
        return this;
    }

    @NonNull
    public final /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        getMax(length(), subSequence);
        this.setMin.append(subSequence);
        return this;
    }

    @NonNull
    public final /* synthetic */ Appendable append(@NonNull CharSequence charSequence) throws IOException {
        getMax(length(), charSequence);
        this.setMin.append(charSequence);
        return this;
    }
}
