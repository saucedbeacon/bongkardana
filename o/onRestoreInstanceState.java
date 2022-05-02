package o;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

public class onRestoreInstanceState<T> extends CascadingMenuPopup$HorizPosition<T> {
    private stop<LiveData<?>, length<?>> toIntRange = new stop<>();

    @MainThread
    public final <S> void setMax(@NonNull LiveData<S> liveData, @NonNull onMeasure<? super S> onmeasure) {
        length length2 = new length(liveData, onmeasure);
        length length3 = this.toIntRange.length(liveData, length2);
        if (length3 != null && length3.getMin != onmeasure) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (length3 == null && setMin()) {
            length2.setMin.setMin(length2);
        }
    }

    @CallSuper
    public final void getMax() {
        Iterator<Map.Entry<LiveData<?>, length<?>>> it = this.toIntRange.iterator();
        while (it.hasNext()) {
            length length2 = (length) it.next().getValue();
            length2.setMin.setMin(length2);
        }
    }

    @CallSuper
    public final void length() {
        Iterator<Map.Entry<LiveData<?>, length<?>>> it = this.toIntRange.iterator();
        while (it.hasNext()) {
            length length2 = (length) it.next().getValue();
            length2.setMin.length(length2);
        }
    }

    static class length<V> implements onMeasure<V> {
        final onMeasure<? super V> getMin;
        int setMax = -1;
        final LiveData<V> setMin;

        length(LiveData<V> liveData, onMeasure<? super V> onmeasure) {
            this.setMin = liveData;
            this.getMin = onmeasure;
        }

        public final void onChanged(@Nullable V v) {
            if (this.setMax != this.setMin.equals) {
                this.setMax = this.setMin.equals;
                this.getMin.onChanged(v);
            }
        }
    }
}
