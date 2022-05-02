package o;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import com.facebook.litho.ComponentLifecycle;

public final class PermissionInfoCompat$Protection<T extends Drawable> extends isStopped {
    int b;
    onPerformActionForVirtualView<T> getMin;
    int onNavigationEvent;

    public final boolean toFloatRange() {
        return true;
    }

    public final /* synthetic */ boolean length(Object obj) {
        return length((isStopped) obj);
    }

    private PermissionInfoCompat$Protection(onPerformActionForVirtualView onperformactionforvirtualview) {
        super("DrawableComponent");
        this.getMin = onperformactionforvirtualview;
    }

    public final void setMin(NotificationCompat$GroupAlertBehavior notificationCompat$GroupAlertBehavior) {
        this.onNavigationEvent = notificationCompat$GroupAlertBehavior.setMax();
        this.b = notificationCompat$GroupAlertBehavior.setMin();
    }

    public final Object getMax(Context context) {
        return new ViewCompat$FocusRealDirection();
    }

    public final void getMin(Object obj) {
        ViewCompat$FocusRealDirection viewCompat$FocusRealDirection = (ViewCompat$FocusRealDirection) obj;
        T t = (Drawable) onPerformActionForVirtualView.setMin(this.getMin);
        if (viewCompat$FocusRealDirection.getMax != t) {
            boolean z = false;
            if (viewCompat$FocusRealDirection.getMax != null) {
                if (viewCompat$FocusRealDirection.getMax != null && viewCompat$FocusRealDirection.getMax.isVisible()) {
                    try {
                        viewCompat$FocusRealDirection.getMax.setVisible(false, false);
                    } catch (NullPointerException unused) {
                    }
                }
                viewCompat$FocusRealDirection.getMax.setCallback((Drawable.Callback) null);
            }
            viewCompat$FocusRealDirection.getMax = t;
            if (viewCompat$FocusRealDirection.getMax != null) {
                boolean isVisible = viewCompat$FocusRealDirection.isVisible();
                if (!(viewCompat$FocusRealDirection.getMax == null || viewCompat$FocusRealDirection.getMax.isVisible() == isVisible)) {
                    try {
                        viewCompat$FocusRealDirection.getMax.setVisible(isVisible, false);
                    } catch (NullPointerException unused2) {
                    }
                }
                viewCompat$FocusRealDirection.getMax.setCallback(viewCompat$FocusRealDirection);
            }
            viewCompat$FocusRealDirection.setMin = null;
            if ((viewCompat$FocusRealDirection.setMin != null && viewCompat$FocusRealDirection.setMin.setMax()) || ((Build.VERSION.SDK_INT < 11 && (viewCompat$FocusRealDirection.getMax instanceof ColorDrawable)) || (viewCompat$FocusRealDirection.getMax instanceof InsetDrawable))) {
                z = true;
            }
            viewCompat$FocusRealDirection.setMax = z;
            viewCompat$FocusRealDirection.invalidateSelf();
        }
    }

    public final void getMax(Object obj) {
        ViewCompat$FocusRealDirection viewCompat$FocusRealDirection = (ViewCompat$FocusRealDirection) obj;
        int i = this.onNavigationEvent;
        int i2 = this.b;
        viewCompat$FocusRealDirection.getMin = i;
        viewCompat$FocusRealDirection.length = i2;
        int i3 = viewCompat$FocusRealDirection.getMin;
        int i4 = viewCompat$FocusRealDirection.length;
        if (viewCompat$FocusRealDirection.getMax != null) {
            viewCompat$FocusRealDirection.getMax.setBounds(0, 0, i3, i4);
        }
    }

    public final void setMax(Object obj) {
        ViewCompat$FocusRealDirection viewCompat$FocusRealDirection = (ViewCompat$FocusRealDirection) obj;
        if (viewCompat$FocusRealDirection.getMax != null) {
            if (viewCompat$FocusRealDirection.getMax != null && viewCompat$FocusRealDirection.getMax.isVisible()) {
                try {
                    viewCompat$FocusRealDirection.getMax.setVisible(false, false);
                } catch (NullPointerException unused) {
                }
            }
            viewCompat$FocusRealDirection.getMax.setCallback((Drawable.Callback) null);
        }
        viewCompat$FocusRealDirection.getMax = null;
        viewCompat$FocusRealDirection.setMin = null;
        viewCompat$FocusRealDirection.setMax = false;
        viewCompat$FocusRealDirection.length = 0;
        viewCompat$FocusRealDirection.getMin = 0;
    }

    public final ComponentLifecycle.MountType equals() {
        return ComponentLifecycle.MountType.DRAWABLE;
    }

    public static PermissionInfoCompat$Protection getMin(onPerformActionForVirtualView<? extends Drawable> onperformactionforvirtualview) {
        return new PermissionInfoCompat$Protection(onperformactionforvirtualview);
    }

    public final boolean getMax(isStopped isstopped, isStopped isstopped2) {
        return onPerformActionForVirtualView.setMax(((PermissionInfoCompat$Protection) isstopped).getMin, ((PermissionInfoCompat$Protection) isstopped2).getMin);
    }

    public final boolean getMin(isStopped isstopped) {
        if (this == isstopped) {
            return true;
        }
        if (isstopped == null || getClass() != isstopped.getClass()) {
            return false;
        }
        return this.getMin.equals(((PermissionInfoCompat$Protection) isstopped).getMin);
    }
}
