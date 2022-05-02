package o;

final class bubbleFindNode implements RedDotDrawable {
    private final pushChild setMin;

    public bubbleFindNode(pushChild pushchild) {
        this.setMin = pushchild;
    }

    public final Object apply(Object obj) {
        return this.setMin.apply(obj);
    }
}
