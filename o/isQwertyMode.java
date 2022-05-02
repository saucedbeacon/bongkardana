package o;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import o.changeMenuMode;
import o.setShortcutsVisible;

public final class isQwertyMode<T> {
    private static final Executor toFloatRange = new length();
    int IsOverlapping;
    final stopDispatchingItemsChanged getMax;
    @NonNull
    public List<T> getMin;
    private final List<Object<T>> isInside;
    @Nullable
    List<T> length;
    final setShortcutsVisible<T> setMax;
    Executor setMin;

    static class length implements Executor {
        final Handler length = new Handler(Looper.getMainLooper());

        length() {
        }

        public final void execute(@NonNull Runnable runnable) {
            this.length.post(runnable);
        }
    }

    public isQwertyMode(@NonNull RecyclerView.Adapter adapter, @NonNull changeMenuMode.setMin<T> setmin) {
        this((stopDispatchingItemsChanged) new isShortcutKey(adapter), new setShortcutsVisible.setMax(setmin).setMin());
    }

    private isQwertyMode(@NonNull stopDispatchingItemsChanged stopdispatchingitemschanged, @NonNull setShortcutsVisible<T> setshortcutsvisible) {
        this.isInside = new CopyOnWriteArrayList();
        this.getMin = Collections.emptyList();
        this.getMax = stopdispatchingitemschanged;
        this.setMax = setshortcutsvisible;
        if (setshortcutsvisible.setMax != null) {
            this.setMin = setshortcutsvisible.setMax;
        } else {
            this.setMin = toFloatRange;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMin(@Nullable Runnable runnable) {
        Iterator<Object<T>> it = this.isInside.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void setMax(@Nullable final List<T> list) {
        final int i = this.IsOverlapping + 1;
        this.IsOverlapping = i;
        final List<T> list2 = this.length;
        if (list == list2) {
            return;
        }
        if (list2 == null) {
            this.length = list;
            this.getMin = Collections.unmodifiableList(list);
            this.getMax.setMax(0, list.size());
            setMin((Runnable) null);
            return;
        }
        this.setMax.setMin.execute(new Runnable() {
            final /* synthetic */ Runnable getMin = null;

            public final void run() {
                final changeMenuMode.getMin min = changeMenuMode.getMin(new changeMenuMode.setMax() {
                    public final int length() {
                        return list2.size();
                    }

                    public final int getMax() {
                        return list.size();
                    }

                    public final boolean length(int i, int i2) {
                        Object obj = list2.get(i);
                        Object obj2 = list.get(i2);
                        if (obj == null || obj2 == null) {
                            return obj == null && obj2 == null;
                        }
                        return isQwertyMode.this.setMax.getMin.setMax(obj, obj2);
                    }

                    public final boolean getMax(int i, int i2) {
                        Object obj = list2.get(i);
                        Object obj2 = list.get(i2);
                        if (obj != null && obj2 != null) {
                            return isQwertyMode.this.setMax.getMin.getMax(obj, obj2);
                        }
                        if (obj == null && obj2 == null) {
                            return true;
                        }
                        throw new AssertionError();
                    }

                    @Nullable
                    public final Object setMin(int i, int i2) {
                        Object obj = list2.get(i);
                        Object obj2 = list.get(i2);
                        if (obj != null && obj2 != null) {
                            return null;
                        }
                        throw new AssertionError();
                    }
                });
                isQwertyMode.this.setMin.execute(new Runnable() {
                    public final void run() {
                        if (isQwertyMode.this.IsOverlapping == i) {
                            isQwertyMode isqwertymode = isQwertyMode.this;
                            List<T> list = list;
                            changeMenuMode.getMin getmin = min;
                            Runnable runnable = AnonymousClass1.this.getMin;
                            isqwertymode.length = list;
                            isqwertymode.getMin = Collections.unmodifiableList(list);
                            getmin.getMax(isqwertymode.getMax);
                            isqwertymode.setMin(runnable);
                        }
                    }
                });
            }
        });
    }
}
