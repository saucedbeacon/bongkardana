package com.alibaba.griver.image.photo.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.widget.OverScroller;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

@TargetApi(9)
public class CompactScroller {
    private static boolean c = isVivoY11();

    /* renamed from: a  reason: collision with root package name */
    private OverScroller f10507a;
    private OverScrollerCopyed b;

    public CompactScroller(Context context) {
        if (c) {
            this.b = new OverScrollerCopyed(context);
        } else {
            this.f10507a = new OverScroller(context);
        }
    }

    public static boolean isVivoY11() {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        RVLogger.w("DecorScroller", "model: ".concat(String.valueOf(str)));
        RVLogger.w("DecorScroller", "manufacturer: ".concat(String.valueOf(str2)));
        return "BBK".equalsIgnoreCase(str2) && "vivo Y11t".equalsIgnoreCase(str);
    }

    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        OverScroller overScroller = this.f10507a;
        if (overScroller != null) {
            overScroller.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        } else {
            this.b.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        }
    }

    public final void forceFinished(boolean z) {
        OverScroller overScroller = this.f10507a;
        if (overScroller != null) {
            overScroller.forceFinished(z);
        } else {
            this.b.forceFinished(z);
        }
    }

    public final boolean isFinished() {
        OverScroller overScroller = this.f10507a;
        if (overScroller != null) {
            return overScroller.isFinished();
        }
        return this.b.isFinished();
    }

    public boolean computeScrollOffset() {
        OverScroller overScroller = this.f10507a;
        if (overScroller != null) {
            return overScroller.computeScrollOffset();
        }
        return this.b.computeScrollOffset();
    }

    public final int getCurrX() {
        OverScroller overScroller = this.f10507a;
        if (overScroller != null) {
            return overScroller.getCurrX();
        }
        return this.b.getCurrX();
    }

    public final int getCurrY() {
        OverScroller overScroller = this.f10507a;
        if (overScroller != null) {
            return overScroller.getCurrY();
        }
        return this.b.getCurrY();
    }
}
