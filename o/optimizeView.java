package o;

import android.content.Context;
import o.b;
import o.loadOriginalImage;

public final class optimizeView implements getAdapterPosition<GriverH5Utils> {
    private final b.C0007b<setNeedInitialFocus> IsOverlapping;
    private final b.C0007b<setNetworkAvailable> equals;
    private final b.C0007b<Context> getMax;
    private final b.C0007b<loadOriginalImage.setMin> getMin;
    private final b.C0007b<u> isInside;
    private final b.C0007b<BeforeGetMainPackageResourcePoint> length;
    private final b.C0007b<getMinimumLogicalFontSize> setMax;
    private final b.C0007b<getAppByUrl> setMin;
    private final b.C0007b<getGriverSectionConfig> toFloatRange;
    private final b.C0007b<NetworkBridgeExtension> toIntRange;

    public static GriverH5Utils setMin(Context context, getAppByUrl getappbyurl, BeforeGetMainPackageResourcePoint beforeGetMainPackageResourcePoint, loadOriginalImage.setMin setmin, getMinimumLogicalFontSize getminimumlogicalfontsize, setNeedInitialFocus setneedinitialfocus) {
        return new GriverH5Utils(context, getappbyurl, beforeGetMainPackageResourcePoint, setmin, getminimumlogicalfontsize, setneedinitialfocus);
    }

    public final /* synthetic */ Object get() {
        GriverH5Utils griverH5Utils = new GriverH5Utils(this.getMax.get(), this.setMin.get(), this.length.get(), this.getMin.get(), this.setMax.get(), this.IsOverlapping.get());
        ImageManifest.getMin(griverH5Utils, this.toFloatRange.get(), this.toIntRange.get());
        ImageManifest.setMin(griverH5Utils, this.equals.get(), this.isInside.get());
        return griverH5Utils;
    }
}
