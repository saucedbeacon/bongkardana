package o;

import id.dana.base.BaseRichView;

public final class Junction implements Runnable {
    private final BaseRichView length;

    public Junction(BaseRichView baseRichView) {
        this.length = baseRichView;
    }

    public final void run() {
        this.length.toIntRange = null;
    }
}
