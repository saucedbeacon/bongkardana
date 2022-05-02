package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.List;
import javax.inject.Inject;
import o.SystemAlarmService;

public final class SystemJobService implements SystemAlarmService.setMin {
    private final stopRangingBeaconsInRegion getMin;
    /* access modifiers changed from: private */
    public final SystemAlarmService.getMin setMin;

    @Inject
    public SystemJobService(stopRangingBeaconsInRegion stoprangingbeaconsinregion, SystemAlarmService.getMin getmin) {
        this.getMin = stoprangingbeaconsinregion;
        this.setMin = getmin;
    }

    public final void length() {
        this.setMin.showProgress();
        this.getMin.execute(new GriverAppVirtualHostProxy<List<getDefaultProxy>>() {
            public final /* synthetic */ void onNext(Object obj) {
                List list = (List) obj;
                SystemJobService.this.setMin.dismissProgress();
                if (list != null) {
                    SystemJobService.this.setMin.setMax(list);
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                SystemJobService.this.setMin.dismissProgress();
                updateActionSheetContent.e(DanaLogConstants.BizType.TRANSFER_MONEY, th.getMessage());
            }
        });
    }

    public final void setMax() {
        this.getMin.dispose();
    }
}
