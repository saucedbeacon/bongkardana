package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import o.cancelAll;

class AppCompatDelegateImpl$FastBitmap$CoordinateSystem extends ContentFrameLayout {
    final /* synthetic */ AppCompatDelegateImpl length;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatDelegateImpl$FastBitmap$CoordinateSystem(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        super(context);
        this.length = appCompatDelegateImpl;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.length.getMax(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !getMin((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.length.isInside(0);
        return true;
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(cancelAll.getMin(getContext(), i));
    }

    private boolean getMin(int i, int i2) {
        return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
    }
}
