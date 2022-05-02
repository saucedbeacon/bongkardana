package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.reactivex.BackpressureStrategy;
import java.util.concurrent.Executor;
import o.TitleBarRightButtonView;
import o.removeItemAtInt;
import o.setExclusiveItemChecked;

public final class findItemIndex<Key, Value> {
    private hasCornerMarking IsOverlapping;
    private removeItemAtInt.length<Key, Value> getMax;
    private setExclusiveItemChecked.setMax getMin;
    private Executor length;
    private Key setMax;
    private setExclusiveItemChecked.getMin setMin;
    private hasCornerMarking toFloatRange;
    private Executor toIntRange;

    public findItemIndex(@NonNull removeItemAtInt.length<Key, Value> length2, @NonNull setExclusiveItemChecked.getMin getmin) {
        if (getmin == null) {
            throw new IllegalArgumentException("PagedList.Config must be provided");
        } else if (length2 != null) {
            this.getMax = length2;
            this.setMin = getmin;
        } else {
            throw new IllegalArgumentException("DataSource.Factory must be provided");
        }
    }

    static class setMin<Key, Value> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<setExclusiveItemChecked<Value>>, removeItemAtInt.getMin, setShowRedPoint, Runnable {
        @Nullable
        private setExclusiveItemChecked<Value> IsOverlapping;
        @Nullable
        private removeItemAtInt<Key, Value> equals;
        @Nullable
        private final setExclusiveItemChecked.setMax getMax;
        @NonNull
        private final setExclusiveItemChecked.getMin getMin;
        @NonNull
        private final Executor isInside;
        @NonNull
        private final removeItemAtInt.length<Key, Value> length;
        @Nullable
        private final Key setMax;
        @NonNull
        private final Executor setMin;
        private TitleBarRightButtonView.AnonymousClass2<setExclusiveItemChecked<Value>> toIntRange;

        setMin(@Nullable Key key, @NonNull setExclusiveItemChecked.getMin getmin, @Nullable setExclusiveItemChecked.setMax setmax, @NonNull removeItemAtInt.length<Key, Value> length2, @NonNull Executor executor, @NonNull Executor executor2) {
            this.setMax = key;
            this.getMin = getmin;
            this.getMax = setmax;
            this.length = length2;
            this.setMin = executor;
            this.isInside = executor2;
        }

        public final void subscribe(TitleBarRightButtonView.AnonymousClass2<setExclusiveItemChecked<Value>> r2) throws Exception {
            this.toIntRange = r2;
            r2.setCancellable(this);
            this.toIntRange.onNext(getMax());
        }

        public final void getMin() throws Exception {
            removeItemAtInt<Key, Value> removeitematint = this.equals;
            if (removeitematint != null) {
                removeitematint.getMin(this);
            }
        }

        public final void run() {
            this.toIntRange.onNext(getMax());
        }

        private setExclusiveItemChecked<Value> getMax() {
            setExclusiveItemChecked<Value> min;
            Key key = this.setMax;
            setExclusiveItemChecked<Value> setexclusiveitemchecked = this.IsOverlapping;
            if (setexclusiveitemchecked != null) {
                key = setexclusiveitemchecked.getMin();
            }
            do {
                removeItemAtInt<Key, Value> removeitematint = this.equals;
                if (removeitematint != null) {
                    removeitematint.getMin(this);
                }
                removeItemAtInt<Key, Value> min2 = this.length.setMin();
                this.equals = min2;
                min2.getMax(this);
                setExclusiveItemChecked.setMin setmin = new setExclusiveItemChecked.setMin(this.equals, this.getMin);
                setmin.getMin = this.setMin;
                setmin.getMax = this.isInside;
                setmin.setMax = this.getMax;
                setmin.setMin = key;
                min = setmin.getMin();
                this.IsOverlapping = min;
            } while (min.equals());
            return this.IsOverlapping;
        }
    }

    @NonNull
    public final setBadgeData<setExclusiveItemChecked<Value>> length(@NonNull BackpressureStrategy backpressureStrategy) {
        if (this.length == null) {
            Executor min = skipToQueueItem.setMin();
            this.length = min;
            this.IsOverlapping = getSecureSignatureComp.setMin(min);
        }
        if (this.toIntRange == null) {
            Executor max = skipToQueueItem.setMax();
            this.toIntRange = max;
            this.toFloatRange = getSecureSignatureComp.setMin(max);
        }
        return TitleBarRightButtonView.AnonymousClass1.create(new setMin(this.setMax, this.setMin, this.getMin, this.getMax, this.length, this.toIntRange)).observeOn(this.IsOverlapping).subscribeOn(this.toFloatRange).toFlowable(backpressureStrategy);
    }
}
