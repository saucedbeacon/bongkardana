package o;

import java.util.List;
import javax.inject.Inject;
import o.onExecuted;

public final class CombineContinuationsWorker implements onExecuted.getMin {
    /* access modifiers changed from: private */
    public final onExecuted.length getMax;
    private final zoomIn getMin;
    /* access modifiers changed from: private */
    public final setEnableGif setMin;

    @Inject
    public CombineContinuationsWorker(onExecuted.length length, zoomIn zoomin, setEnableGif setenablegif) {
        this.getMax = length;
        this.getMin = zoomin;
        this.setMin = setenablegif;
    }

    public final void getMax() {
        this.getMin.execute(new GriverAppVirtualHostProxy<List<setDownloadListener>>() {
            public final /* synthetic */ void onNext(Object obj) {
                CombineContinuationsWorker.this.getMax.setMax((List) CombineContinuationsWorker.this.setMin.apply((List) obj));
            }
        });
    }

    public final void setMax() {
        this.getMin.dispose();
    }
}
