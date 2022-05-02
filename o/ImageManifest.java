package o;

import kotlin.jvm.internal.Intrinsics;

public final class ImageManifest implements getBindingAdapter<GriverH5Utils> {
    public static void getMin(GriverH5Utils griverH5Utils, getGriverSectionConfig getgriversectionconfig, NetworkBridgeExtension networkBridgeExtension) {
        Intrinsics.checkNotNullParameter(getgriversectionconfig, "homeInfo");
        Intrinsics.checkNotNullParameter(networkBridgeExtension, "homeInfoMapper");
        griverH5Utils.setMin = getgriversectionconfig;
        griverH5Utils.setMax = networkBridgeExtension;
    }

    public static void setMin(GriverH5Utils griverH5Utils, setNetworkAvailable setnetworkavailable, u uVar) {
        Intrinsics.checkNotNullParameter(setnetworkavailable, "getRequestMoneyInfo");
        Intrinsics.checkNotNullParameter(uVar, "mapper");
        griverH5Utils.length = setnetworkavailable;
        griverH5Utils.getMax = uVar;
    }
}
