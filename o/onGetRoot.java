package o;

import android.widget.TextView;
import androidx.annotation.NonNull;

final class onGetRoot extends getSessionToken {
    private final int after;
    private final int count;
    private final int start;
    private final CharSequence text;
    private final TextView view;

    onGetRoot(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        if (textView != null) {
            this.view = textView;
            if (charSequence != null) {
                this.text = charSequence;
                this.start = i;
                this.count = i2;
                this.after = i3;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null view");
    }

    @NonNull
    public final TextView view() {
        return this.view;
    }

    @NonNull
    public final CharSequence text() {
        return this.text;
    }

    public final int start() {
        return this.start;
    }

    public final int count() {
        return this.count;
    }

    public final int after() {
        return this.after;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextViewBeforeTextChangeEvent{view=");
        sb.append(this.view);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", after=");
        sb.append(this.after);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getSessionToken) {
            getSessionToken getsessiontoken = (getSessionToken) obj;
            return this.view.equals(getsessiontoken.view()) && this.text.equals(getsessiontoken.text()) && this.start == getsessiontoken.start() && this.count == getsessiontoken.count() && this.after == getsessiontoken.after();
        }
    }

    public final int hashCode() {
        return ((((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003) ^ this.start) * 1000003) ^ this.count) * 1000003) ^ this.after;
    }
}
