package o;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

public final class onDestroy {
    @Deprecated
    public static boolean length(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static boolean getMin(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof attachBaseContext) {
            return ((attachBaseContext) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStartNestedScroll");
                return false;
            }
        } else if (viewParent instanceof initDelegate) {
            return ((initDelegate) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    public static void length(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof attachBaseContext) {
            ((attachBaseContext) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScrollAccepted");
                }
            } else if (viewParent instanceof initDelegate) {
                ((initDelegate) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    public static void setMin(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof attachBaseContext) {
            ((attachBaseContext) viewParent).onStopNestedScroll(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStopNestedScroll");
                }
            } else if (viewParent instanceof initDelegate) {
                ((initDelegate) viewParent).onStopNestedScroll(view);
            }
        }
    }

    public static void setMax(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof setTheme) {
            ((setTheme) viewParent2).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof attachBaseContext) {
            ((attachBaseContext) viewParent2).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScroll");
                }
            } else if (viewParent2 instanceof initDelegate) {
                ((initDelegate) viewParent2).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    public static void getMin(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof attachBaseContext) {
            ((attachBaseContext) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedPreScroll");
                }
            } else if (viewParent instanceof initDelegate) {
                ((initDelegate) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static boolean length(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedFling");
                return false;
            }
        } else if (viewParent instanceof initDelegate) {
            return ((initDelegate) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    public static boolean getMin(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreFling");
                return false;
            }
        } else if (viewParent instanceof initDelegate) {
            return ((initDelegate) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }
}
