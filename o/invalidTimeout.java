package o;

import android.content.Context;
import id.dana.di.modules.SwitchAutoRouteModule;
import id.dana.richview.profile.switchautoroute.SwitchAutoRouteView;
import o.MediaInfo;
import o.PrepareException;
import o.b;

public final class invalidTimeout implements JSONWriter {
    private b.C0007b<getPictureSize> IsOverlapping;
    private b.C0007b<MediaInfo.getMin> getMax;
    private b.C0007b<enableCloseButton> getMin;
    private b.C0007b<onGeolocationPermissionsHidePrompt> length;
    private b.C0007b<getIconDrawable> setMax;
    private b.C0007b<CaptureParam> setMin;
    private b.C0007b<Context> toFloatRange;

    public /* synthetic */ invalidTimeout(SwitchAutoRouteModule switchAutoRouteModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(switchAutoRouteModule, r2);
    }

    private invalidTimeout(SwitchAutoRouteModule switchAutoRouteModule, PrepareException.AnonymousClass1 r4) {
        this.getMax = GriverH5JSAPIPermissionExtension.setMax(switchAutoRouteModule);
        getMax getmax = new getMax(r4);
        this.length = getmax;
        this.setMax = GriverBackButtonStyleExtension.create(getmax);
        showCloseButton create = showCloseButton.create(this.length);
        this.getMin = create;
        this.setMin = isScrap.getMin(isConvertPicture.length(this.getMax, this.setMax, create));
        length length2 = new length(r4);
        this.toFloatRange = length2;
        this.IsOverlapping = isScrap.getMin(setDefaultCameraFront.length(length2));
    }

    public static final class setMin {
        public PrepareException.AnonymousClass1 getMax;
        public SwitchAutoRouteModule getMin;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class getMax implements b.C0007b<onGeolocationPermissionsHidePrompt> {
        private final PrepareException.AnonymousClass1 setMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onGeolocationPermissionsHidePrompt onVolumeInfoChanged = this.setMin.onVolumeInfoChanged();
            if (onVolumeInfoChanged != null) {
                return onVolumeInfoChanged;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.getMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(SwitchAutoRouteView switchAutoRouteView) {
        CameraUtils.setMax(switchAutoRouteView, this.setMin.get());
        CameraUtils.setMax(switchAutoRouteView, this.IsOverlapping.get());
    }
}
