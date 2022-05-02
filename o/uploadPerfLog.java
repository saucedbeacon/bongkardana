package o;

import java.util.List;
import java.util.concurrent.Callable;

final class uploadPerfLog implements Callable {
    private final addData2Performance setMax;
    private final List setMin;

    public uploadPerfLog(addData2Performance adddata2performance, List list) {
        this.setMax = adddata2performance;
        this.setMin = list;
    }

    public final Object call() {
        return this.setMax.lambda$checkExploreDanaPreferences$0(this.setMin);
    }
}
