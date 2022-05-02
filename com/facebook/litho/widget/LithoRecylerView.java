package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import o.onEdgeTouched;

public class LithoRecylerView extends RecyclerView {
    @Nullable
    private onEdgeTouched length;
    @Nullable
    private TouchInterceptor setMax;

    public interface TouchInterceptor {

        public enum Result {
            INTERCEPT_TOUCH_EVENT,
            IGNORE_TOUCH_EVENT,
            CALL_SUPER
        }

        Result setMax();
    }

    public LithoRecylerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public LithoRecylerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LithoRecylerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setTouchInterceptor(@Nullable TouchInterceptor touchInterceptor) {
        this.setMax = touchInterceptor;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TouchInterceptor touchInterceptor = this.setMax;
        if (touchInterceptor == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        TouchInterceptor.Result max = touchInterceptor.setMax();
        int i = AnonymousClass4.getMax[max.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        throw new IllegalArgumentException("Unknown TouchInterceptor.Result: ".concat(String.valueOf(max)));
    }

    /* renamed from: com.facebook.litho.widget.LithoRecylerView$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.litho.widget.LithoRecylerView$TouchInterceptor$Result[] r0 = com.facebook.litho.widget.LithoRecylerView.TouchInterceptor.Result.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                com.facebook.litho.widget.LithoRecylerView$TouchInterceptor$Result r1 = com.facebook.litho.widget.LithoRecylerView.TouchInterceptor.Result.INTERCEPT_TOUCH_EVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.litho.widget.LithoRecylerView$TouchInterceptor$Result r1 = com.facebook.litho.widget.LithoRecylerView.TouchInterceptor.Result.IGNORE_TOUCH_EVENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.litho.widget.LithoRecylerView$TouchInterceptor$Result r1 = com.facebook.litho.widget.LithoRecylerView.TouchInterceptor.Result.CALL_SUPER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.LithoRecylerView.AnonymousClass4.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void setPostDispatchDrawListener(@Nullable onEdgeTouched onedgetouched) {
        this.length = onedgetouched;
    }
}
