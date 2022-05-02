package o;

import io.reactivex.annotations.Nullable;

public final class getLoadMoreFooter<T, U> extends setFooterView<T, U> {
    final RedDotDrawable<? super T, ? extends U> length;

    public getLoadMoreFooter(setBadgeData<T> setbadgedata, RedDotDrawable<? super T, ? extends U> redDotDrawable) {
        super(setbadgedata);
        this.length = redDotDrawable;
    }

    public final void setMax(getbEva<? super U> getbeva) {
        if (getbeva instanceof setSecondFloorView) {
            this.setMin.setMin(new getMax((setSecondFloorView) getbeva, this.length));
        } else {
            this.setMin.setMin(new setMax(getbeva, this.length));
        }
    }

    static final class setMax<T, U> extends getInterface<T, U> {
        final RedDotDrawable<? super T, ? extends U> length;

        setMax(getbEva<? super U> getbeva, RedDotDrawable<? super T, ? extends U> redDotDrawable) {
            super(getbeva);
            this.length = redDotDrawable;
        }

        public final void onNext(T t) {
            if (!this.getMin) {
                if (this.toIntRange != 0) {
                    this.setMax.onNext(null);
                    return;
                }
                try {
                    this.setMax.onNext(setRefreshAnimation.getMax(this.length.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    getMin(th);
                }
            }
        }

        public final int requestFusion(int i) {
            return getMin(i);
        }

        @Nullable
        public final U poll() throws Exception {
            Object poll = this.getMax.poll();
            if (poll != null) {
                return setRefreshAnimation.getMax(this.length.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    static final class getMax<T, U> extends getSGPluginManager<T, U> {
        final RedDotDrawable<? super T, ? extends U> setMax;

        getMax(setSecondFloorView<? super U> setsecondfloorview, RedDotDrawable<? super T, ? extends U> redDotDrawable) {
            super(setsecondfloorview);
            this.setMax = redDotDrawable;
        }

        public final void onNext(T t) {
            if (!this.getMin) {
                if (this.equals != 0) {
                    this.setMin.onNext(null);
                    return;
                }
                try {
                    this.setMin.onNext(setRefreshAnimation.getMax(this.setMax.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    length(th);
                }
            }
        }

        public final int requestFusion(int i) {
            return getMin(i);
        }

        @Nullable
        public final U poll() throws Exception {
            Object poll = this.length.poll();
            if (poll != null) {
                return setRefreshAnimation.getMax(this.setMax.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
