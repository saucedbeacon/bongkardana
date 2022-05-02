package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

public final class getMenuInflater implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final Runnable getMax;
    private final View length;
    private ViewTreeObserver setMin;

    private getMenuInflater(View view, Runnable runnable) {
        this.length = view;
        this.setMin = view.getViewTreeObserver();
        this.getMax = runnable;
    }

    @NonNull
    public static getMenuInflater getMin(@NonNull View view, @NonNull Runnable runnable) {
        if (view != null) {
            getMenuInflater getmenuinflater = new getMenuInflater(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(getmenuinflater);
            view.addOnAttachStateChangeListener(getmenuinflater);
            return getmenuinflater;
        }
        throw new NullPointerException("view == null");
    }

    public final boolean onPreDraw() {
        setMax();
        this.getMax.run();
        return true;
    }

    private void setMax() {
        if (this.setMin.isAlive()) {
            this.setMin.removeOnPreDrawListener(this);
        } else {
            this.length.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.length.removeOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(View view) {
        this.setMin = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        setMax();
    }
}
