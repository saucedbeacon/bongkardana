package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import o.onQueueTitleChanged;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class onMetadataChanged {
    private final int IsOverlapping;
    private final int equals;
    public PopupWindow.OnDismissListener getMax;
    public int getMin;
    private final onEvent isInside;
    public boolean length;
    public onQueueChanged setMax;
    public onQueueTitleChanged.setMax setMin;
    private final PopupWindow.OnDismissListener toDoubleRange;
    private final boolean toFloatRange;
    private final Context toIntRange;
    private View toString;

    public onMetadataChanged(@NonNull Context context, @NonNull onEvent onevent, @NonNull View view, boolean z, @AttrRes int i) {
        this(context, onevent, view, z, i, 0);
    }

    public onMetadataChanged(@NonNull Context context, @NonNull onEvent onevent, @NonNull View view, boolean z, @AttrRes int i, @StyleRes int i2) {
        this.getMin = 8388611;
        this.toDoubleRange = new PopupWindow.OnDismissListener() {
            public final void onDismiss() {
                onMetadataChanged.this.getMin();
            }
        };
        this.toIntRange = context;
        this.isInside = onevent;
        this.toString = view;
        this.toFloatRange = z;
        this.equals = i;
        this.IsOverlapping = i2;
    }

    public final void getMin(@NonNull View view) {
        this.toString = view;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [o.onQueueChanged] */
    /* JADX WARNING: type inference failed for: r7v1, types: [o.onCaptioningEnabledChanged] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.CascadingMenuPopup] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.onQueueChanged getMax() {
        /*
            r14 = this;
            o.onQueueChanged r0 = r14.setMax
            if (r0 != 0) goto L_0x0083
            android.content.Context r0 = r14.toIntRange
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0022
            r0.getRealSize(r1)
            goto L_0x0025
        L_0x0022:
            r0.getSize(r1)
        L_0x0025:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.toIntRange
            android.content.res.Resources r1 = r1.getResources()
            int r2 = o.ITrustedWebActivityCallback.Stub.getMax.getMax
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x0051
            androidx.appcompat.view.menu.CascadingMenuPopup r0 = new androidx.appcompat.view.menu.CascadingMenuPopup
            android.content.Context r2 = r14.toIntRange
            android.view.View r3 = r14.toString
            int r4 = r14.equals
            int r5 = r14.IsOverlapping
            boolean r6 = r14.toFloatRange
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0063
        L_0x0051:
            o.onCaptioningEnabledChanged r0 = new o.onCaptioningEnabledChanged
            android.content.Context r8 = r14.toIntRange
            o.onEvent r9 = r14.isInside
            android.view.View r10 = r14.toString
            int r11 = r14.equals
            int r12 = r14.IsOverlapping
            boolean r13 = r14.toFloatRange
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0063:
            o.onEvent r1 = r14.isInside
            r0.length((o.onEvent) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.toDoubleRange
            r0.getMax((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.toString
            r0.setMin(r1)
            o.onQueueTitleChanged$setMax r1 = r14.setMin
            r0.setCallback(r1)
            boolean r1 = r14.length
            r0.length((boolean) r1)
            int r1 = r14.getMin
            r0.getMax((int) r1)
            r14.setMax = r0
        L_0x0083:
            o.onQueueChanged r0 = r14.setMax
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onMetadataChanged.getMax():o.onQueueChanged");
    }

    public final boolean setMax() {
        if (setMin()) {
            return true;
        }
        if (this.toString == null) {
            return false;
        }
        getMin(0, 0, false, false);
        return true;
    }

    public final boolean setMin(int i, int i2) {
        if (setMin()) {
            return true;
        }
        if (this.toString == null) {
            return false;
        }
        getMin(i, i2, true, true);
        return true;
    }

    private void getMin(int i, int i2, boolean z, boolean z2) {
        onQueueChanged max = getMax();
        max.getMin(z2);
        if (z) {
            if ((setAdapter.length(this.getMin, ViewCompat.IsOverlapping(this.toString)) & 7) == 5) {
                i -= this.toString.getWidth();
            }
            max.length(i);
            max.getMin(i2);
            int i3 = (int) ((this.toIntRange.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            max.IsOverlapping = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        max.b_();
    }

    public void getMin() {
        this.setMax = null;
        PopupWindow.OnDismissListener onDismissListener = this.getMax;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean setMin() {
        onQueueChanged onqueuechanged = this.setMax;
        return onqueuechanged != null && onqueuechanged.getMin();
    }
}
