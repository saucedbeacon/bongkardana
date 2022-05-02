package o;

import com.google.android.gms.location.LocationServices;

public abstract class initProductInfo<T> extends realAppendLog<T> {
    public initProductInfo(updateTimeZone updatetimezone) {
        super(updatetimezone, LocationServices.API);
    }
}
