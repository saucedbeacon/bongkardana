package o;

import java.util.List;
import java.util.concurrent.Callable;

final class track implements Callable {
    private final List getMin;
    private final addData2Performance setMin;

    public track(addData2Performance adddata2performance, List list) {
        this.setMin = adddata2performance;
        this.getMin = list;
    }

    public final Object call() {
        return this.setMin.lambda$setDismissAll$1(this.getMin);
    }
}
