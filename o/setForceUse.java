package o;

import android.content.Context;
import id.dana.service.favorites.FavoriteServicesModule;
import id.dana.service.favorites.FavoriteServicesView;
import o.OrientationDetector;
import o.PrepareException;
import o.UpdateStep;
import o.setForceFullScreen;

public final class setForceUse implements UpdateStep.AnonymousClass1 {
    private final FavoriteServicesModule getMax;
    private final PrepareException.AnonymousClass1 getMin;

    public /* synthetic */ setForceUse(FavoriteServicesModule favoriteServicesModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(favoriteServicesModule, r2);
    }

    private setForceUse(FavoriteServicesModule favoriteServicesModule, PrepareException.AnonymousClass1 r2) {
        this.getMax = favoriteServicesModule;
        this.getMin = r2;
    }

    public static final class setMax {
        public FavoriteServicesModule setMax;
        public PrepareException.AnonymousClass1 setMin;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    public final void getMax(FavoriteServicesView favoriteServicesView) {
        FavoriteServicesModule favoriteServicesModule = this.getMax;
        setForceFullScreen.getMin min = setInitToMaxSquare.getMin(this.getMax);
        appxLoadFailed length = this.getMin.length();
        if (length != null) {
            appxLoadFailed appxloadfailed = length;
            getScheme min2 = this.getMin.getMin();
            if (min2 != null) {
                getScheme getscheme = min2;
                toUuidString requestPostMessageChannelWithExtras = this.getMin.requestPostMessageChannelWithExtras();
                if (requestPostMessageChannelWithExtras != null) {
                    toUuidString touuidstring = requestPostMessageChannelWithExtras;
                    onWebViewDestory MediaMetadataCompat$LongKey = this.getMin.MediaMetadataCompat$LongKey();
                    if (MediaMetadataCompat$LongKey != null) {
                        convertIntentsToCallbacks convertintentstocallbacks = new convertIntentsToCallbacks(appxloadfailed, getscheme, touuidstring, MediaMetadataCompat$LongKey);
                        appxLoadFailed length2 = this.getMin.length();
                        if (length2 != null) {
                            appxLoadFailed appxloadfailed2 = length2;
                            getScheme min3 = this.getMin.getMin();
                            if (min3 != null) {
                                getScheme getscheme2 = min3;
                                toUuidString requestPostMessageChannelWithExtras2 = this.getMin.requestPostMessageChannelWithExtras();
                                if (requestPostMessageChannelWithExtras2 != null) {
                                    BeaconDataFactory beaconDataFactory = new BeaconDataFactory(appxloadfailed2, getscheme2, requestPostMessageChannelWithExtras2);
                                    Context max = this.getMin.getMax();
                                    if (max != null) {
                                        setCropSquare.getMin(favoriteServicesView, setDisplayType.setMin(favoriteServicesModule, new setFitSpace(min, convertintentstocallbacks, beaconDataFactory, new parseBatteryPercentage(new OrientationDetector.OrientationListener(max)))));
                                        return;
                                    }
                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
