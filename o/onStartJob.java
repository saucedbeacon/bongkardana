package o;

import android.util.Base64;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.google.firebase.perf.metrics.resource.ResourceType;
import java.util.Iterator;
import java.util.List;
import o.access$getStartingWakeLock$cp;

public class onStartJob extends DANAJobIntentService implements access$getStartingWakeLock$cp {
    final List<access$getStartingWakeLockLock$cp> setMin;

    public String getId() {
        return ResourceType.NETWORK;
    }

    public onStartJob() {
        this((byte) 0);
    }

    private onStartJob(byte b) {
        this.setMin = null;
    }

    static String setMin(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(Base64.encode(bArr, 0));
    }

    /* access modifiers changed from: package-private */
    public static FlipperArray getMax(List<access$getStartingWakeLock$cp.getMin> list) {
        FlipperArray.getMax getmax = new FlipperArray.getMax();
        for (access$getStartingWakeLock$cp.getMin next : list) {
            getmax.getMax.put(new FlipperObject(new FlipperObject.setMax().getMax("key", next.setMax).getMax("value", next.getMax).getMax).setMax);
        }
        return new FlipperArray(getmax.getMax);
    }

    /* access modifiers changed from: private */
    public static boolean setMax(access$getStartingWakeLock$cp.setMin setmin) {
        access$getStartingWakeLock$cp.getMin getmin;
        Iterator<access$getStartingWakeLock$cp.getMin> it = setmin.getMax.iterator();
        while (true) {
            if (!it.hasNext()) {
                getmin = null;
                break;
            }
            getmin = it.next();
            if ("content-type".equalsIgnoreCase(getmin.setMax)) {
                break;
            }
        }
        if (getmin == null) {
            return false;
        }
        if (getmin.getMax.contains("image/") || getmin.getMax.contains("video/") || getmin.getMax.contains("application/zip")) {
            return true;
        }
        return false;
    }

    static /* synthetic */ String setMax(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(Base64.encode(bArr, 0));
    }
}
