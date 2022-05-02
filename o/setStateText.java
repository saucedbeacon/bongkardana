package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.util.List;
import o.TitleBarRightButtonView;

public final class setStateText implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1 {
    private final List getMax;
    private final appendExtraInfo length$4aafb16f;
    private final int setMin;

    public setStateText(appendExtraInfo appendextrainfo, int i, List list) {
        this.length$4aafb16f = appendextrainfo;
        this.setMin = i;
        this.getMax = list;
    }

    public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r13) {
        appendExtraInfo appendextrainfo = this.length$4aafb16f;
        int i = this.setMin;
        List list = this.getMax;
        try {
            Object[] objArr = new Object[4];
            objArr[3] = r13;
            objArr[2] = list;
            objArr[1] = Integer.valueOf(i);
            objArr[0] = appendextrainfo;
            ((Class) setKeep.getMin((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9, TextUtils.lastIndexOf("", '0', 0, 0) + 22, (char) ((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) - 1))).getDeclaredMethod("getMin", new Class[]{(Class) setKeep.getMin((ViewConfiguration.getTouchSlop() >> 8) + 9, (ViewConfiguration.getEdgeSlop() >> 16) + 21, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Integer.TYPE, List.class, TitleBarRightButtonView.AnonymousClass2.class}).invoke((Object) null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
