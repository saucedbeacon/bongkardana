package o;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.lang.ref.WeakReference;
import o.TitleBarRightButtonView;
import o.syncUploadCoreByCategoryDirectly;

public final class takeAndSync extends initProductInfo<Location> {
    private final LocationRequest getMax;
    private LocationListener length;

    public static TitleBarRightButtonView.AnonymousClass1<Location> getMin(updateTimeZone updatetimezone, syncUploadCoreByCategoryDirectly syncuploadcorebycategorydirectly, LocationRequest locationRequest) {
        TitleBarRightButtonView.AnonymousClass1<Location> compose = TitleBarRightButtonView.AnonymousClass1.create(new takeAndSync(updatetimezone, locationRequest)).compose(new syncUploadCoreByCategoryDirectly.getMax(syncuploadcorebycategorydirectly.setMin.getMin()));
        int numUpdates = locationRequest.getNumUpdates();
        return (numUpdates <= 0 || numUpdates >= Integer.MAX_VALUE) ? compose : compose.take((long) numUpdates);
    }

    private takeAndSync(updateTimeZone updatetimezone, LocationRequest locationRequest) {
        super(updatetimezone);
        this.getMax = locationRequest;
    }

    public final void getMin(GoogleApiClient googleApiClient, TitleBarRightButtonView.AnonymousClass2<? super Location> r4) {
        this.length = new getMax(r4);
        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, this.getMax, this.length);
    }

    public final void length(GoogleApiClient googleApiClient) {
        if (googleApiClient.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, this.length);
        }
    }

    static class getMax implements LocationListener {
        private final WeakReference<TitleBarRightButtonView.AnonymousClass2<? super Location>> getMax;

        getMax(TitleBarRightButtonView.AnonymousClass2<? super Location> r2) {
            this.getMax = new WeakReference<>(r2);
        }

        public final void onLocationChanged(Location location) {
            TitleBarRightButtonView.AnonymousClass2 r0 = this.getMax.get();
            if (r0 != null && !r0.isDisposed()) {
                r0.onNext(location);
            }
        }
    }
}
