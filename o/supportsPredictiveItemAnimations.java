package o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class supportsPredictiveItemAnimations extends getSpeedPerPixel<Activity> {
    private final Map<String, List<getVerticalSnapPreference>> getMax = new HashMap();
    private final Handler length = new Handler(Looper.getMainLooper());
    private final Set<length> setMin = new HashSet();

    public final /* bridge */ /* synthetic */ void getMax(Object obj) {
        super.getMax((Activity) obj);
    }

    public final /* synthetic */ void setMin(Object obj) {
        super.setMin((Activity) obj);
        getMin();
    }

    public final void setMax(Activity activity) {
        super.setMin(activity);
        getMin();
    }

    public final void getMax(Activity activity) {
        super.getMax(activity);
    }

    public final void length(Map<String, List<getVerticalSnapPreference>> map) {
        synchronized (this.setMin) {
            for (length next : this.setMin) {
                next.getMax = true;
                next.setMax.post(next);
            }
            this.setMin.clear();
        }
        synchronized (this.getMax) {
            this.getMax.clear();
            this.getMax.putAll(map);
        }
        getMin();
    }

    private void getMin() {
        if (Thread.currentThread() == this.length.getLooper().getThread()) {
            setMin();
        } else {
            this.length.post(new Runnable() {
                public final void run() {
                    supportsPredictiveItemAnimations.this.setMin();
                }
            });
        }
    }

    private void getMax(View view, List<getVerticalSnapPreference> list) {
        synchronized (this.setMin) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.setMin.add(new length(view, list.get(i), this.length));
            }
        }
    }

    static class length implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {
        volatile boolean getMax = false;
        private final WeakReference<View> getMin;
        private boolean length = true;
        final Handler setMax;
        private final getVerticalSnapPreference setMin;

        public length(View view, getVerticalSnapPreference getverticalsnappreference, Handler handler) {
            this.setMin = getverticalsnappreference;
            this.getMin = new WeakReference<>(view);
            this.setMax = handler;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
            run();
        }

        public final void onGlobalLayout() {
            run();
        }

        public final void run() {
            if (this.length) {
                View view = this.getMin.get();
                if (view == null || this.getMax) {
                    if (this.length) {
                        View view2 = this.getMin.get();
                        if (view2 != null) {
                            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeGlobalOnLayoutListener(this);
                            }
                        }
                        this.setMin.setMax();
                    }
                    this.length = false;
                    return;
                }
                this.setMin.setMin(view);
                this.setMax.removeCallbacks(this);
                this.setMax.postDelayed(this, 1000);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        List list;
        List list2;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            for (T t : Collections.unmodifiableSet(this.setMax)) {
                String canonicalName = t.getClass().getCanonicalName();
                View rootView = t.getWindow().getDecorView().getRootView();
                synchronized (this.getMax) {
                    list = this.getMax.get(canonicalName);
                    list2 = this.getMax.get((Object) null);
                }
                if (list != null) {
                    getMax(rootView, list);
                }
                if (list2 != null) {
                    getMax(rootView, list2);
                }
            }
            return;
        }
        throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }
}
