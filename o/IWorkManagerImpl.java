package o;

import kotlin.jvm.functions.Function1;
import o.ForceStopRunnable$BroadcastReceiver;
import o.b;

public final class IWorkManagerImpl implements getAdapterPosition<SystemForegroundService> {
    private final b.C0007b<isRegionStatePersistenceEnabled> IsOverlapping;
    private final b.C0007b<setDataRequestNotifier> equals;
    private final b.C0007b<PhotoContext> getMax;
    private final b.C0007b<APJsResult> getMin;
    private final b.C0007b<removeMonitoreNotifier> length;
    private final b.C0007b<ForceStopRunnable$BroadcastReceiver.length> setMax;
    private final b.C0007b<addDatas> setMin;
    private final b.C0007b<checkIfMainProcess> toIntRange;

    final class Default implements Function1 {
        public static final Default length = new Default();

        public final Object invoke(Object obj) {
            return IWorkManagerImplCallback.setMin();
        }
    }

    private IWorkManagerImpl(b.C0007b<PhotoContext> bVar, b.C0007b<removeMonitoreNotifier> bVar2, b.C0007b<APJsResult> bVar3, b.C0007b<ForceStopRunnable$BroadcastReceiver.length> bVar4, b.C0007b<addDatas> bVar5, b.C0007b<isRegionStatePersistenceEnabled> bVar6, b.C0007b<setDataRequestNotifier> bVar7, b.C0007b<checkIfMainProcess> bVar8) {
        this.getMax = bVar;
        this.length = bVar2;
        this.getMin = bVar3;
        this.setMax = bVar4;
        this.setMin = bVar5;
        this.IsOverlapping = bVar6;
        this.equals = bVar7;
        this.toIntRange = bVar8;
    }

    public static IWorkManagerImpl getMin(b.C0007b<PhotoContext> bVar, b.C0007b<removeMonitoreNotifier> bVar2, b.C0007b<APJsResult> bVar3, b.C0007b<ForceStopRunnable$BroadcastReceiver.length> bVar4, b.C0007b<addDatas> bVar5, b.C0007b<isRegionStatePersistenceEnabled> bVar6, b.C0007b<setDataRequestNotifier> bVar7, b.C0007b<checkIfMainProcess> bVar8) {
        return new IWorkManagerImpl(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public final /* synthetic */ Object get() {
        SystemForegroundService systemForegroundService = new SystemForegroundService(this.getMax.get(), this.length.get(), this.getMin.get(), this.setMax.get(), this.setMin.get(), this.IsOverlapping.get(), this.equals.get());
        enqueueContinuation.setMin(systemForegroundService, this.toIntRange.get());
        return systemForegroundService;
    }

    public final class Stub implements getBindingAdapter<cancelAllWorkByTag> {

        final class Proxy implements Function1 {
            private final IWorkManagerImplCallback getMin;

            public Proxy(IWorkManagerImplCallback iWorkManagerImplCallback) {
                this.getMin = iWorkManagerImplCallback;
            }

            public final Object invoke(Object obj) {
                return this.getMin.getMax.length(((Integer) obj).intValue());
            }
        }

        public static void setMax(cancelAllWorkByTag cancelallworkbytag, setGridListener setgridlistener, PhotoService photoService, getErrorUrl geterrorurl, getMonitoringNotifier getmonitoringnotifier, onPageLongClicked onpagelongclicked) {
            cancelallworkbytag.length = setgridlistener;
            cancelallworkbytag.setMin = photoService;
            cancelallworkbytag.setMax = getmonitoringnotifier;
            cancelallworkbytag.getMax = geterrorurl;
            cancelallworkbytag.IsOverlapping = onpagelongclicked;
        }
    }
}
