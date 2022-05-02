package o;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.TransportImpl;

public final class getFragmentManager implements TransportScheduleCallback {
    public static final getFragmentManager getMax = new getFragmentManager();

    public final void onSchedule(Exception exc) {
        TransportImpl.lambda$send$0(exc);
    }
}
