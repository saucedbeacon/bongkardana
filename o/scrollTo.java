package o;

import java.util.concurrent.CopyOnWriteArrayList;

abstract class scrollTo implements AbsSavedState {
    private CopyOnWriteArrayList<fling> setMin = new CopyOnWriteArrayList<>();

    scrollTo() {
    }

    public final void getMax(fling fling) {
        this.setMin.add(fling);
    }

    public final void setMax(fling fling) {
        this.setMin.remove(fling);
    }

    /* access modifiers changed from: package-private */
    public final boolean length() {
        for (int size = this.setMin.size() - 1; size >= 0; size--) {
            if (!this.setMin.get(size).getMax(this)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void getMin() {
        for (int size = this.setMin.size() - 1; size >= 0; size--) {
            this.setMin.get(size).setMax(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void isInside() {
        for (int size = this.setMin.size() - 1; size >= 0; size--) {
            this.setMin.get(size).getMin(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void toIntRange() {
        for (int size = this.setMin.size() - 1; size >= 0; size--) {
            this.setMin.get(size).setMin(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void equals() {
        for (int size = this.setMin.size() - 1; size >= 0; size--) {
            this.setMin.get(size).length(this);
        }
    }
}
