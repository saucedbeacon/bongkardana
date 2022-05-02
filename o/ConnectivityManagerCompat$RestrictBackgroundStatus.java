package o;

import android.content.Context;
import android.os.Build;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentLifecycle;

public final class ConnectivityManagerCompat$RestrictBackgroundStatus extends isStopped {
    public final boolean getMax(isStopped isstopped, isStopped isstopped2) {
        return true;
    }

    public final boolean getMin(isStopped isstopped) {
        return this == isstopped;
    }

    public final int values() {
        return 45;
    }

    public final /* synthetic */ boolean length(Object obj) {
        return length((isStopped) obj);
    }

    protected ConnectivityManagerCompat$RestrictBackgroundStatus() {
        super("HostComponent");
    }

    public final Object getMax(Context context) {
        return new ComponentHost(context);
    }

    public final void getMin(Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        if (Build.VERSION.SDK_INT >= 11) {
            componentHost.setAlpha(1.0f);
        }
    }

    public final ComponentLifecycle.MountType equals() {
        return ComponentLifecycle.MountType.VIEW;
    }

    public static isStopped getMin() {
        return new ConnectivityManagerCompat$RestrictBackgroundStatus();
    }
}
