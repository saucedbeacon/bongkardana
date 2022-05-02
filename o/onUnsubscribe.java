package o;

import android.widget.TextView;
import androidx.annotation.NonNull;

final class onUnsubscribe extends isValidPackage {
    private final int before;
    private final int count;
    private final int start;
    private final CharSequence text;
    private final TextView view;

    onUnsubscribe(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        if (textView != null) {
            this.view = textView;
            if (charSequence != null) {
                this.text = charSequence;
                this.start = i;
                this.before = i2;
                this.count = i3;
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

    public final int before() {
        return this.before;
    }

    public final int count() {
        return this.count;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextViewTextChangeEvent{view=");
        sb.append(this.view);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", before=");
        sb.append(this.before);
        sb.append(", count=");
        sb.append(this.count);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof isValidPackage) {
            isValidPackage isvalidpackage = (isValidPackage) obj;
            return this.view.equals(isvalidpackage.view()) && this.text.equals(isvalidpackage.text()) && this.start == isvalidpackage.start() && this.before == isvalidpackage.before() && this.count == isvalidpackage.count();
        }
    }

    public final int hashCode() {
        return ((((((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003) ^ this.start) * 1000003) ^ this.before) * 1000003) ^ this.count;
    }
}
