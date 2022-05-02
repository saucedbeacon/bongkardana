package o;

import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.TitleBarRightButtonView;

public final class onLoadMore<T> implements Iterable<T> {
    final T getMax;
    final TitleBarRightButtonView.AnonymousClass4<T> length;

    public onLoadMore(TitleBarRightButtonView.AnonymousClass4<T> r1, T t) {
        this.length = r1;
        this.getMax = t;
    }

    public final Iterator<T> iterator() {
        getMax getmax = new getMax(this.getMax);
        this.length.subscribe(getmax);
        return new getMax.setMax();
    }

    static final class getMax<T> extends atlasEncryptString<T> {
        volatile Object length;

        getMax(T t) {
            this.length = NotificationLite.next(t);
        }

        public final void onComplete() {
            this.length = NotificationLite.complete();
        }

        public final void onError(Throwable th) {
            this.length = NotificationLite.error(th);
        }

        public final void onNext(T t) {
            this.length = NotificationLite.next(t);
        }

        final class setMax implements Iterator<T> {
            private Object getMin;

            setMax() {
            }

            public final boolean hasNext() {
                Object obj = getMax.this.length;
                this.getMin = obj;
                return !NotificationLite.isComplete(obj);
            }

            public final T next() {
                Object obj = null;
                try {
                    if (this.getMin == null) {
                        obj = getMax.this.length;
                    }
                    if (NotificationLite.isComplete(this.getMin)) {
                        throw new NoSuchElementException();
                    } else if (!NotificationLite.isError(this.getMin)) {
                        T value = NotificationLite.getValue(this.getMin);
                        this.getMin = obj;
                        return value;
                    } else {
                        throw utAvaiable.getMin(NotificationLite.getError(this.getMin));
                    }
                } finally {
                    this.getMin = obj;
                }
            }

            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }
    }
}
