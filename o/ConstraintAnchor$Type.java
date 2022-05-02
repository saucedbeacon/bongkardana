package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;

public final class ConstraintAnchor$Type<A, B> {
    public final getDependencies<getMin<A>, B> setMax;

    public ConstraintAnchor$Type() {
        this(250);
    }

    public ConstraintAnchor$Type(long j) {
        this.setMax = new getDependencies<getMin<A>, B>(j) {
            public final /* synthetic */ void getMin(@NonNull Object obj, @Nullable Object obj2) {
                getMin getmin = (getMin) obj;
                synchronized (getMin.length) {
                    getMin.length.offer(getmin);
                }
            }
        };
    }

    @Nullable
    public final B length(A a2) {
        getMin min = getMin.setMin(a2);
        B max = this.setMax.getMax(min);
        synchronized (getMin.length) {
            getMin.length.offer(min);
        }
        return max;
    }

    @VisibleForTesting
    public static final class getMin<A> {
        static final Queue<getMin<?>> length = getDependents.length(0);
        private A getMax;
        private int setMax;
        private int setMin;

        public static <A> getMin<A> setMin(A a2) {
            getMin<A> poll;
            synchronized (length) {
                poll = length.poll();
            }
            if (poll == null) {
                poll = new getMin<>();
            }
            poll.getMax = a2;
            poll.setMin = 0;
            poll.setMax = 0;
            return poll;
        }

        private getMin() {
        }

        public final boolean equals(Object obj) {
            if (obj instanceof getMin) {
                getMin getmin = (getMin) obj;
                if (this.setMin == getmin.setMin && this.setMax == getmin.setMax && this.getMax.equals(getmin.getMax)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.setMax * 31) + this.setMin) * 31) + this.getMax.hashCode();
        }
    }
}
