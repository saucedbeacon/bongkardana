package id.dana.ocr.views;

import java.util.TimerTask;
import kotlin.Metadata;
import o.updateActionSheetContent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/ocr/views/SnapReceiptService$shutdownIfThereArentAnyActiveTasks$1$1", "Ljava/util/TimerTask;", "run", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SnapReceiptService$shutdownIfThereArentAnyActiveTasks$$inlined$apply$lambda$1 extends TimerTask {
    final /* synthetic */ SnapReceiptService setMin;

    SnapReceiptService$shutdownIfThereArentAnyActiveTasks$$inlined$apply$lambda$1(SnapReceiptService snapReceiptService) {
        this.setMin = snapReceiptService;
    }

    public final void run() {
        updateActionSheetContent.i(SnapReceiptService.isInside, "Service is about to be stopped because idle timeout of 10s has been reached");
        this.setMin.stopSelf();
    }
}
