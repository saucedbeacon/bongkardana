package o;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import o.stop;

public class hasText extends Lifecycle {
    private boolean IsOverlapping;
    private ArrayList<Lifecycle.State> equals;
    public Lifecycle.State getMax;
    private int getMin;
    private fastForward<showsIcon, setMin> length;
    private final WeakReference<setChecked> setMin;
    private final boolean toFloatRange;
    private boolean toIntRange;

    public hasText(@NonNull setChecked setchecked) {
        this(setchecked, (byte) 0);
    }

    private hasText(@NonNull setChecked setchecked, byte b) {
        this.length = new fastForward<>();
        this.getMin = 0;
        this.toIntRange = false;
        this.IsOverlapping = false;
        this.equals = new ArrayList<>();
        this.setMin = new WeakReference<>(setchecked);
        this.getMax = Lifecycle.State.INITIALIZED;
        this.toFloatRange = true;
    }

    public final void setMin(@NonNull Lifecycle.Event event) {
        getMin("handleLifecycleEvent");
        getMax(event.getTargetState());
    }

    public final void getMax(Lifecycle.State state) {
        if (this.getMax != state) {
            this.getMax = state;
            if (this.toIntRange || this.getMin != 0) {
                this.IsOverlapping = true;
                return;
            }
            this.toIntRange = true;
            setMax();
            this.toIntRange = false;
        }
    }

    private boolean getMin() {
        if (this.length.getMax == 0) {
            return true;
        }
        Lifecycle.State state = ((setMin) this.length.setMax.getValue()).getMin;
        Lifecycle.State state2 = ((setMin) this.length.length.getValue()).getMin;
        if (state == state2 && this.getMax == state2) {
            return true;
        }
        return false;
    }

    private Lifecycle.State getMin(showsIcon showsicon) {
        fastForward<showsIcon, setMin> fastforward = this.length;
        Lifecycle.State state = null;
        stop.getMin<K, V> getmin = fastforward.getMax(showsicon) ? fastforward.setMin.get(showsicon).length : null;
        Lifecycle.State state2 = getmin != null ? ((setMin) getmin.getValue()).getMin : null;
        if (!this.equals.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.equals;
            state = arrayList.get(arrayList.size() - 1);
        }
        Lifecycle.State state3 = this.getMax;
        if (state2 == null || state2.compareTo(state3) >= 0) {
            state2 = state3;
        }
        return (state == null || state.compareTo(state2) >= 0) ? state2 : state;
    }

    public final void setMax(@NonNull showsIcon showsicon) {
        setChecked setchecked;
        getMin("addObserver");
        setMin setmin = new setMin(showsicon, this.getMax == Lifecycle.State.DESTROYED ? Lifecycle.State.DESTROYED : Lifecycle.State.INITIALIZED);
        if (this.length.length(showsicon, setmin) == null && (setchecked = this.setMin.get()) != null) {
            boolean z = this.getMin != 0 || this.toIntRange;
            Lifecycle.State min = getMin(showsicon);
            this.getMin++;
            while (setmin.getMin.compareTo(min) < 0 && this.length.getMax(showsicon)) {
                this.equals.add(setmin.getMin);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(setmin.getMin);
                if (upFrom != null) {
                    setmin.length(setchecked, upFrom);
                    ArrayList<Lifecycle.State> arrayList = this.equals;
                    arrayList.remove(arrayList.size() - 1);
                    min = getMin(showsicon);
                } else {
                    StringBuilder sb = new StringBuilder("no event up from ");
                    sb.append(setmin.getMin);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (!z) {
                setMax();
            }
            this.getMin--;
        }
    }

    public final void length(@NonNull showsIcon showsicon) {
        getMin("removeObserver");
        this.length.length(showsicon);
    }

    @NonNull
    public final Lifecycle.State length() {
        return this.getMax;
    }

    private void length(setChecked setchecked) {
        fastForward<showsIcon, setMin> fastforward = this.length;
        stop.setMin setmin = new stop.setMin();
        fastforward.getMin.put(setmin, Boolean.FALSE);
        while (setmin.hasNext() && !this.IsOverlapping) {
            Map.Entry entry = (Map.Entry) setmin.next();
            setMin setmin2 = (setMin) entry.getValue();
            while (setmin2.getMin.compareTo(this.getMax) < 0 && !this.IsOverlapping && this.length.getMax(entry.getKey())) {
                this.equals.add(setmin2.getMin);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(setmin2.getMin);
                if (upFrom != null) {
                    setmin2.length(setchecked, upFrom);
                    ArrayList<Lifecycle.State> arrayList = this.equals;
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    StringBuilder sb = new StringBuilder("no event up from ");
                    sb.append(setmin2.getMin);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    private void setMin(setChecked setchecked) {
        fastForward<showsIcon, setMin> fastforward = this.length;
        stop.setMax setmax = new stop.setMax(fastforward.length, fastforward.setMax);
        fastforward.getMin.put(setmax, Boolean.FALSE);
        while (setmax.hasNext() && !this.IsOverlapping) {
            Map.Entry entry = (Map.Entry) setmax.next();
            setMin setmin = (setMin) entry.getValue();
            while (setmin.getMin.compareTo(this.getMax) > 0 && !this.IsOverlapping && this.length.getMax(entry.getKey())) {
                Lifecycle.Event downFrom = Lifecycle.Event.downFrom(setmin.getMin);
                if (downFrom != null) {
                    this.equals.add(downFrom.getTargetState());
                    setmin.length(setchecked, downFrom);
                    ArrayList<Lifecycle.State> arrayList = this.equals;
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    StringBuilder sb = new StringBuilder("no event down from ");
                    sb.append(setmin.getMin);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    private void setMax() {
        setChecked setchecked = this.setMin.get();
        if (setchecked != null) {
            while (!getMin()) {
                this.IsOverlapping = false;
                if (this.getMax.compareTo(((setMin) this.length.setMax.getValue()).getMin) < 0) {
                    setMin(setchecked);
                }
                stop.getMin<K, V> getmin = this.length.length;
                if (!this.IsOverlapping && getmin != null && this.getMax.compareTo(((setMin) getmin.getValue()).getMin) > 0) {
                    length(setchecked);
                }
            }
            this.IsOverlapping = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @SuppressLint({"RestrictedApi"})
    public final void getMin(String str) {
        if (this.toFloatRange && !skipToQueueItem.length().getMin()) {
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(str);
            sb.append(" must be called on the main thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    static Lifecycle.State length(@NonNull Lifecycle.State state, @Nullable Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    static class setMin {
        Lifecycle.State getMin;
        setPopupCallback setMax;

        setMin(showsIcon showsicon, Lifecycle.State state) {
            this.setMax = setExpandedFormat.setMin((Object) showsicon);
            this.getMin = state;
        }

        /* access modifiers changed from: package-private */
        public final void length(setChecked setchecked, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            this.getMin = hasText.length(this.getMin, targetState);
            this.setMax.setMax(setchecked, event);
            this.getMin = targetState;
        }
    }
}
