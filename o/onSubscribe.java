package o;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class onSubscribe extends setSessionToken {
    private final int actionId;
    private final KeyEvent keyEvent;
    private final TextView view;

    onSubscribe(TextView textView, int i, @Nullable KeyEvent keyEvent2) {
        if (textView != null) {
            this.view = textView;
            this.actionId = i;
            this.keyEvent = keyEvent2;
            return;
        }
        throw new NullPointerException("Null view");
    }

    @NonNull
    public final TextView view() {
        return this.view;
    }

    public final int actionId() {
        return this.actionId;
    }

    @Nullable
    public final KeyEvent keyEvent() {
        return this.keyEvent;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextViewEditorActionEvent{view=");
        sb.append(this.view);
        sb.append(", actionId=");
        sb.append(this.actionId);
        sb.append(", keyEvent=");
        sb.append(this.keyEvent);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r1 = r4.keyEvent;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof o.setSessionToken
            r2 = 0
            if (r1 == 0) goto L_0x0035
            o.setSessionToken r5 = (o.setSessionToken) r5
            android.widget.TextView r1 = r4.view
            android.widget.TextView r3 = r5.view()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0035
            int r1 = r4.actionId
            int r3 = r5.actionId()
            if (r1 != r3) goto L_0x0035
            android.view.KeyEvent r1 = r4.keyEvent
            if (r1 != 0) goto L_0x002a
            android.view.KeyEvent r5 = r5.keyEvent()
            if (r5 != 0) goto L_0x0035
            goto L_0x0034
        L_0x002a:
            android.view.KeyEvent r5 = r5.keyEvent()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0035
        L_0x0034:
            return r0
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onSubscribe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((this.view.hashCode() ^ 1000003) * 1000003) ^ this.actionId) * 1000003;
        KeyEvent keyEvent2 = this.keyEvent;
        return hashCode ^ (keyEvent2 == null ? 0 : keyEvent2.hashCode());
    }
}
