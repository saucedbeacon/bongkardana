package o;

import java.util.ArrayList;

public final class showPopupWindowToast extends setSpeed<getSharedPreference, showTime> {
    public final /* synthetic */ Object map(Object obj) {
        ToastBridgeExtension toastBridgeExtension;
        getSharedPreference getsharedpreference = (getSharedPreference) obj;
        if (getsharedpreference == null) {
            return null;
        }
        showTime showtime = new showTime();
        showtime.setMax = getsharedpreference.isAuthenticationFeatureStatus();
        showtime.getMin = getsharedpreference.isAuthenticationStatus();
        ArrayList arrayList = new ArrayList();
        for (containNebulaAddcors next : getsharedpreference.getAuthenticationTypeOption()) {
            if (next != null) {
                toastBridgeExtension = new ToastBridgeExtension();
                toastBridgeExtension.getMin = next.getAuthenticationType();
            } else {
                toastBridgeExtension = null;
            }
            arrayList.add(toastBridgeExtension);
        }
        showtime.getMax = arrayList;
        return showtime;
    }
}
