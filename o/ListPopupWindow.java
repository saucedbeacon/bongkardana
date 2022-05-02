package o;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import o.LinearLayoutCompat;

public final class ListPopupWindow<T> {
    public static Executor length = Executors.newCachedThreadPool();
    private final Set<setHorizontalGravity<T>> getMax;
    private final Set<setHorizontalGravity<Throwable>> getMin;
    private final Handler setMax;
    /* access modifiers changed from: private */
    @Nullable
    public volatile LinearLayoutCompat.DividerMode<T> setMin;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ListPopupWindow(Callable<LinearLayoutCompat.DividerMode<T>> callable) {
        this(callable, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ListPopupWindow(Callable<LinearLayoutCompat.DividerMode<T>> callable, boolean z) {
        this.getMax = new LinkedHashSet(1);
        this.getMin = new LinkedHashSet(1);
        this.setMax = new Handler(Looper.getMainLooper());
        this.setMin = null;
        if (z) {
            try {
                LinearLayoutCompat.DividerMode<T> call = callable.call();
                if (this.setMin == null) {
                    this.setMin = call;
                    this.setMax.post(new Runnable() {
                        public final void run() {
                            if (ListPopupWindow.this.setMin != null) {
                                LinearLayoutCompat.DividerMode max = ListPopupWindow.this.setMin;
                                if (max.length != null) {
                                    ListPopupWindow.this.getMax(max.length);
                                } else {
                                    ListPopupWindow.this.setMax(max.getMax);
                                }
                            }
                        }
                    });
                    return;
                }
                throw new IllegalStateException("A task may only be set once.");
            } catch (Throwable th) {
                LinearLayoutCompat.DividerMode<T> dividerMode = new LinearLayoutCompat.DividerMode<>(th);
                if (this.setMin == null) {
                    this.setMin = dividerMode;
                    this.setMax.post(new Runnable() {
                        public final void run() {
                            if (ListPopupWindow.this.setMin != null) {
                                LinearLayoutCompat.DividerMode max = ListPopupWindow.this.setMin;
                                if (max.length != null) {
                                    ListPopupWindow.this.getMax(max.length);
                                } else {
                                    ListPopupWindow.this.setMax(max.getMax);
                                }
                            }
                        }
                    });
                    return;
                }
                throw new IllegalStateException("A task may only be set once.");
            }
        } else {
            length.execute(new getMin(callable));
        }
    }

    public final synchronized ListPopupWindow<T> length(setHorizontalGravity<T> sethorizontalgravity) {
        if (!(this.setMin == null || this.setMin.length == null)) {
            sethorizontalgravity.length(this.setMin.length);
        }
        this.getMax.add(sethorizontalgravity);
        return this;
    }

    public final synchronized ListPopupWindow<T> getMin(setHorizontalGravity<T> sethorizontalgravity) {
        this.getMax.remove(sethorizontalgravity);
        return this;
    }

    public final synchronized ListPopupWindow<T> getMax(setHorizontalGravity<Throwable> sethorizontalgravity) {
        if (!(this.setMin == null || this.setMin.getMax == null)) {
            sethorizontalgravity.length(this.setMin.getMax);
        }
        this.getMin.add(sethorizontalgravity);
        return this;
    }

    public final synchronized ListPopupWindow<T> setMax(setHorizontalGravity<Throwable> sethorizontalgravity) {
        this.getMin.remove(sethorizontalgravity);
        return this;
    }

    /* access modifiers changed from: private */
    public synchronized void getMax(T t) {
        for (setHorizontalGravity length2 : new ArrayList(this.getMax)) {
            length2.length(t);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void setMax(Throwable th) {
        ArrayList<setHorizontalGravity> arrayList = new ArrayList<>(this.getMin);
        if (arrayList.isEmpty()) {
            setTitleMargin.setMin("Lottie encountered an error but no failure listener was added:");
            return;
        }
        for (setHorizontalGravity length2 : arrayList) {
            length2.length(th);
        }
    }

    class getMin extends FutureTask<LinearLayoutCompat.DividerMode<T>> {
        getMin(Callable<LinearLayoutCompat.DividerMode<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public final void done() {
            if (!isCancelled()) {
                try {
                    ListPopupWindow.getMax(ListPopupWindow.this, (LinearLayoutCompat.DividerMode) get());
                } catch (InterruptedException | ExecutionException e) {
                    ListPopupWindow.getMax(ListPopupWindow.this, new LinearLayoutCompat.DividerMode(e));
                }
            }
        }
    }

    static /* synthetic */ void getMax(ListPopupWindow listPopupWindow, LinearLayoutCompat.DividerMode dividerMode) {
        if (listPopupWindow.setMin == null) {
            listPopupWindow.setMin = dividerMode;
            listPopupWindow.setMax.post(new Runnable() {
                public final void run() {
                    if (ListPopupWindow.this.setMin != null) {
                        LinearLayoutCompat.DividerMode max = ListPopupWindow.this.setMin;
                        if (max.length != null) {
                            ListPopupWindow.this.getMax(max.length);
                        } else {
                            ListPopupWindow.this.setMax(max.getMax);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
