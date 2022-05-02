package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.bottomsheet.ServicesBottomSheetDialog;
import o.getDuration;
import o.style;

public final class createInvalidationTracker implements getBindingAdapter<ServicesBottomSheetDialog> {
    @InjectedFieldSignature("id.dana.bottomsheet.ServicesBottomSheetDialog.presenter")
    public static void getMax(ServicesBottomSheetDialog servicesBottomSheetDialog, style.length length) {
        servicesBottomSheetDialog.presenter = length;
    }

    @InjectedFieldSignature("id.dana.bottomsheet.ServicesBottomSheetDialog.deviceInformationProvider")
    public static void setMin(ServicesBottomSheetDialog servicesBottomSheetDialog, getPerformanceTracker getperformancetracker) {
        servicesBottomSheetDialog.deviceInformationProvider = getperformancetracker;
    }

    @InjectedFieldSignature("id.dana.bottomsheet.ServicesBottomSheetDialog.readLinkPropertiesPresenter")
    public static void setMax(ServicesBottomSheetDialog servicesBottomSheetDialog, getDuration.length length) {
        servicesBottomSheetDialog.readLinkPropertiesPresenter = length;
    }
}
