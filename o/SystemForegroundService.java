package o;

import id.dana.di.PerActivity;
import id.dana.model.PayMethodModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import o.ForceStopRunnable$BroadcastReceiver;

@PerActivity
public final class SystemForegroundService implements ForceStopRunnable$BroadcastReceiver.setMin {
    private final addDatas IsOverlapping;
    /* access modifiers changed from: private */
    public final PhotoContext getMax;
    private final removeMonitoreNotifier getMin;
    /* access modifiers changed from: private */
    public final ForceStopRunnable$BroadcastReceiver.length isInside;
    private final isRegionStatePersistenceEnabled length;
    private final APJsResult setMax;
    checkIfMainProcess setMin;
    private final setDataRequestNotifier toIntRange;

    @Inject
    SystemForegroundService(PhotoContext photoContext, removeMonitoreNotifier removemonitorenotifier, APJsResult aPJsResult, ForceStopRunnable$BroadcastReceiver.length length2, addDatas adddatas, isRegionStatePersistenceEnabled isregionstatepersistenceenabled, setDataRequestNotifier setdatarequestnotifier) {
        this.getMax = photoContext;
        this.getMin = removemonitorenotifier;
        this.length = isregionstatepersistenceenabled;
        this.isInside = length2;
        this.IsOverlapping = adddatas;
        this.setMax = aPJsResult;
        this.toIntRange = setdatarequestnotifier;
    }

    public final void setMax() {
        this.setMax.dispose();
        this.getMin.dispose();
        this.length.dispose();
        this.setMin.dispose();
        this.toIntRange.dispose();
    }

    private static boolean getMax(String str, boolean z) {
        return "BALANCE".equals(str) && !z;
    }

    public final void getMin(final String str, final getDataFieldCount getdatafieldcount) {
        this.setMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                SystemForegroundService.length(SystemForegroundService.this, str, ((Boolean) obj).booleanValue(), getdatafieldcount);
            }
        });
    }

    public final void getMin() {
        this.setMax.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(Object obj) {
                SystemForegroundService.this.isInside.onGetDefaultCardSuccess((String) obj);
            }

            public final void onError(Throwable th) {
                SystemForegroundService.this.isInside.onGetDefaultCardError();
                super.onError(th);
            }
        });
    }

    static /* synthetic */ void length(SystemForegroundService systemForegroundService, String str, boolean z, getDataFieldCount getdatafieldcount) {
        GridAdapter gridAdapter;
        systemForegroundService.isInside.showProgress();
        if (getMax(str, z)) {
            systemForegroundService.isInside.showProgress();
            systemForegroundService.length.execute(new GriverAppVirtualHostProxy<getPowerCorrection>() {
                public final /* synthetic */ void onNext(Object obj) {
                    getPowerCorrection getpowercorrection = (getPowerCorrection) obj;
                    SystemForegroundService.this.isInside.onGetPayMethodListSuccess((List) SystemForegroundService.this.getMax.apply(getpowercorrection), getpowercorrection.getKyc().getLevel());
                    SystemForegroundService.this.isInside.dismissProgress();
                }

                public final void onError(Throwable th) {
                    SystemForegroundService.this.isInside.onGetPayMethodError();
                    SystemForegroundService.this.isInside.dismissProgress();
                    super.onError(th);
                }
            });
            return;
        }
        Iterator it = ((List) systemForegroundService.IsOverlapping.apply(getdatafieldcount)).iterator();
        while (true) {
            if (!it.hasNext()) {
                gridAdapter = null;
                break;
            }
            gridAdapter = (GridAdapter) it.next();
            if (str.equals(gridAdapter.setMax)) {
                break;
            }
        }
        if (gridAdapter != null) {
            systemForegroundService.toIntRange.execute(onReceivedIcon.INSTANCE, new getInstance(systemForegroundService, gridAdapter, getdatafieldcount), new DiagnosticsWorker(systemForegroundService));
        } else {
            systemForegroundService.isInside.onGetPayMethodError();
        }
        systemForegroundService.isInside.dismissProgress();
    }

    static /* synthetic */ Unit getMax(SystemForegroundService systemForegroundService, GridAdapter gridAdapter, getDataFieldCount getdatafieldcount, Boolean bool) {
        List<PayMethodModel> list = gridAdapter.setMin;
        boolean booleanValue = bool.booleanValue();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (PayMethodModel next : list) {
                if (next.equals() != 6) {
                    next.valueOf = booleanValue;
                    arrayList.add(next);
                }
            }
        }
        systemForegroundService.isInside.onGetPayMethodListSuccess(arrayList, getdatafieldcount.getKyc());
        return null;
    }
}
