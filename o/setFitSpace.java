package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.model.ThirdPartyService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.BeaconDataFactory;
import o.NullBeaconDataFactory;
import o.setForceFullScreen;

public final class setFitSpace implements setForceFullScreen.setMin {
    /* access modifiers changed from: private */
    public final setForceFullScreen.getMin getMax;
    private final BeaconDataFactory length;
    private final convertIntentsToCallbacks setMax;
    /* access modifiers changed from: private */
    public final parseBatteryPercentage setMin;

    @Inject
    public setFitSpace(setForceFullScreen.getMin getmin, convertIntentsToCallbacks convertintentstocallbacks, BeaconDataFactory beaconDataFactory, parseBatteryPercentage parsebatterypercentage) {
        this.getMax = getmin;
        this.setMax = convertintentstocallbacks;
        this.length = beaconDataFactory;
        this.setMin = parsebatterypercentage;
    }

    public final void length() {
        this.getMax.showProgress();
        this.setMax.execute(new GriverAppVirtualHostProxy<NullBeaconDataFactory.AnonymousClass1>() {
            public final /* synthetic */ void onNext(Object obj) {
                NullBeaconDataFactory.AnonymousClass1 r7 = (NullBeaconDataFactory.AnonymousClass1) obj;
                setFitSpace.this.getMax.dismissProgress();
                if (r7 != null && r7.getThirdPartyServices() != null) {
                    setForceFullScreen.getMin min = setFitSpace.this.getMax;
                    parseBatteryPercentage max = setFitSpace.this.setMin;
                    Intrinsics.checkNotNullParameter(r7, "thirdPartyCategoryService");
                    List arrayList = new ArrayList();
                    List<ThirdPartyServiceResponse> thirdPartyServices = r7.getThirdPartyServices();
                    if (thirdPartyServices != null) {
                        arrayList.add(max.setMax(r7, true));
                        Collection arrayList2 = new ArrayList();
                        for (ThirdPartyServiceResponse max2 : CollectionsKt.take(thirdPartyServices, 8)) {
                            ThirdPartyService max3 = parseBatteryPercentage.setMax(max2);
                            if (max3 != null) {
                                arrayList2.add(max3);
                            }
                        }
                        arrayList.addAll((List) arrayList2);
                    }
                    if (arrayList.size() <= 8) {
                        parseBatteryPercentage.getMin((List<ThirdPartyService>) arrayList);
                    }
                    ThirdPartyService.getMin getmin = new ThirdPartyService.getMin();
                    getmin.values = 5;
                    Intrinsics.checkNotNullParameter("edit", "key");
                    getmin.isInside = "edit";
                    getmin.b = true;
                    arrayList.add(getmin.setMin());
                    min.setMin(arrayList);
                }
            }

            public final void onError(Throwable th) {
                setFitSpace.this.getMax.dismissProgress();
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.FAVORITE_SERVICES_LIFESTYLE_PREFIX, DanaLogConstants.ExceptionType.LIFESTYLE_EXCEPTION, th);
            }
        });
    }

    public final void setMax() {
        this.setMax.dispose();
        this.length.dispose();
    }

    public final void setMax(List<String> list) {
        if (list.size() < 7) {
            int size = 7 - list.size();
            for (int i = 0; i < size; i++) {
                list.add("");
            }
        }
        this.getMax.showProgress();
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                setFitSpace.this.getMax.dismissProgress();
                setFitSpace.this.getMax.getMax(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                setFitSpace.this.getMax.dismissProgress();
                setFitSpace.this.getMax.getMax(false);
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.FAVORITE_SERVICES_LIFESTYLE_PREFIX, DanaLogConstants.ExceptionType.LIFESTYLE_EXCEPTION, th);
            }
        }, BeaconDataFactory.setMax.forFavoriteServices(list));
    }
}
