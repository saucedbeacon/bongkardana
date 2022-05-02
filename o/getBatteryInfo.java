package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.stopMonitorMemoryWarning;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/onboarding/mixpanel/MixpanelEnablePresenter;", "Lid/dana/onboarding/mixpanel/MixpanelEnableContract$Presenter;", "checkMixpanelFeature", "Lid/dana/domain/featureswitch/interactor/mixpanel/CheckMixpanelFeature;", "(Lid/dana/domain/featureswitch/interactor/mixpanel/CheckMixpanelFeature;)V", "initializeMixpanelEnable", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBatteryInfo implements stopMonitorMemoryWarning.getMin {
    private final onFirstVisuallyRender setMin;

    @Inject
    public getBatteryInfo(@NotNull onFirstVisuallyRender onfirstvisuallyrender) {
        Intrinsics.checkNotNullParameter(onfirstvisuallyrender, "checkMixpanelFeature");
        this.setMin = onfirstvisuallyrender;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/onboarding/mixpanel/MixpanelEnablePresenter$initializeMixpanelEnable$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "isEnable", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<Boolean> {
        setMin() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            BlurProcess.getMax(((Boolean) obj).booleanValue());
        }
    }

    public final void length() {
        this.setMin.execute(new setMin());
    }

    public final void setMax() {
        this.setMin.dispose();
    }
}
