package o;

public abstract class isPointInChildBounds {
    /* access modifiers changed from: package-private */
    public abstract void getMax(boolean z);

    public abstract void setMax();

    /* synthetic */ isPointInChildBounds(byte b) {
        this();
    }

    private isPointInChildBounds() {
    }

    public static class length extends isPointInChildBounds {
        private volatile boolean getMin;

        public length() {
            super((byte) 0);
        }

        public final void setMax() {
            if (this.getMin) {
                throw new IllegalStateException("Already released");
            }
        }

        public final void getMax(boolean z) {
            this.getMin = z;
        }
    }
}
