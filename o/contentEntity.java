package o;

final class contentEntity implements Runnable {
    private final order setMin;

    public contentEntity(order order) {
        this.setMin = order;
    }

    public final void run() {
        this.setMin.getMin = null;
    }
}
