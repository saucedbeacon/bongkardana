package androidx.activity;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayDeque;
import java.util.Iterator;
import o.ICustomTabsService;
import o.receiveFile;
import o.setChecked;
import o.setPopupCallback;

public final class OnBackPressedDispatcher {
    @Nullable
    private final Runnable getMax;
    final ArrayDeque<receiveFile> setMin;

    public OnBackPressedDispatcher() {
        this((Runnable) null);
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this.setMin = new ArrayDeque<>();
        this.getMax = runnable;
    }

    @SuppressLint({"LambdaLast"})
    @MainThread
    public final void length(@NonNull setChecked setchecked, @NonNull receiveFile receivefile) {
        Lifecycle lifecycle = setchecked.getLifecycle();
        if (lifecycle.length() != Lifecycle.State.DESTROYED) {
            receivefile.setMax.add(new LifecycleOnBackPressedCancellable(lifecycle, receivefile));
        }
    }

    @MainThread
    public final void getMax() {
        Iterator<receiveFile> descendingIterator = this.setMin.descendingIterator();
        while (descendingIterator.hasNext()) {
            receiveFile next = descendingIterator.next();
            if (next.length()) {
                next.getMin();
                return;
            }
        }
        Runnable runnable = this.getMax;
        if (runnable != null) {
            runnable.run();
        }
    }

    class getMin implements ICustomTabsService.Default {
        private final receiveFile setMin;

        getMin(receiveFile receivefile) {
            this.setMin = receivefile;
        }

        public final void length() {
            OnBackPressedDispatcher.this.setMin.remove(this.setMin);
            this.setMin.setMax.remove(this);
        }
    }

    class LifecycleOnBackPressedCancellable implements setPopupCallback, ICustomTabsService.Default {
        private final receiveFile getMax;
        private final Lifecycle getMin;
        @Nullable
        private ICustomTabsService.Default setMin;

        LifecycleOnBackPressedCancellable(@NonNull Lifecycle lifecycle, @NonNull receiveFile receivefile) {
            this.getMin = lifecycle;
            this.getMax = receivefile;
            lifecycle.setMax(this);
        }

        public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                receiveFile receivefile = this.getMax;
                onBackPressedDispatcher.setMin.add(receivefile);
                getMin getmin = new getMin(receivefile);
                receivefile.setMax.add(getmin);
                this.setMin = getmin;
            } else if (event == Lifecycle.Event.ON_STOP) {
                ICustomTabsService.Default defaultR = this.setMin;
                if (defaultR != null) {
                    defaultR.length();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                length();
            }
        }

        public final void length() {
            this.getMin.length(this);
            this.getMax.setMax.remove(this);
            ICustomTabsService.Default defaultR = this.setMin;
            if (defaultR != null) {
                defaultR.length();
                this.setMin = null;
            }
        }
    }
}
