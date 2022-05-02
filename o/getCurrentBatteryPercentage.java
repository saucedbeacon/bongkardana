package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.media.exploredana.exoplayer.ExoPlayerActivity;
import o.SystemInfoBridgeExtension;

public final class getCurrentBatteryPercentage implements getBindingAdapter<ExoPlayerActivity> {
    @InjectedFieldSignature("id.dana.media.exploredana.exoplayer.ExoPlayerActivity.exoPlayerManager")
    public static void setMax(ExoPlayerActivity exoPlayerActivity, SystemInfoBridgeExtension.AnonymousClass1 r1) {
        exoPlayerActivity.exoPlayerManager = r1;
    }
}
