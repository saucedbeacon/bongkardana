package o;

final class ActionBarContainer implements Runnable {
    private final positionChild getMax;

    public ActionBarContainer(positionChild positionchild) {
        this.getMax = positionchild;
    }

    public final void run() {
        positionChild.setMin();
    }
}
