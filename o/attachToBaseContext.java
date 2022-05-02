package o;

import android.text.Editable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class attachToBaseContext extends onCustomAction {
    private final Editable editable;
    private final TextView view;

    attachToBaseContext(TextView textView, @Nullable Editable editable2) {
        if (textView != null) {
            this.view = textView;
            this.editable = editable2;
            return;
        }
        throw new NullPointerException("Null view");
    }

    @NonNull
    public final TextView view() {
        return this.view;
    }

    @Nullable
    public final Editable editable() {
        return this.editable;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextViewAfterTextChangeEvent{view=");
        sb.append(this.view);
        sb.append(", editable=");
        sb.append(this.editable);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.editable;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof o.onCustomAction
            r2 = 0
            if (r1 == 0) goto L_0x002d
            o.onCustomAction r5 = (o.onCustomAction) r5
            android.widget.TextView r1 = r4.view
            android.widget.TextView r3 = r5.view()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            android.text.Editable r1 = r4.editable
            if (r1 != 0) goto L_0x0022
            android.text.Editable r5 = r5.editable()
            if (r5 != 0) goto L_0x002d
            goto L_0x002c
        L_0x0022:
            android.text.Editable r5 = r5.editable()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.attachToBaseContext.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.view.hashCode() ^ 1000003) * 1000003;
        Editable editable2 = this.editable;
        return hashCode ^ (editable2 == null ? 0 : editable2.hashCode());
    }
}
