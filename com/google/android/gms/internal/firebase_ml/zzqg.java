package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public final class zzqg {
    private static final GmsLogger zzayb = new GmsLogger("StreamingFormatChecker", "");
    private final LinkedList<Long> zzbhn = new LinkedList<>();
    private long zzbho = -1;

    public final void zzb(zzqn zzqn) {
        if (zzqn.zzbhi.getBitmap() != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbhn.add(Long.valueOf(elapsedRealtime));
            if (this.zzbhn.size() > 5) {
                this.zzbhn.removeFirst();
            }
            if (this.zzbhn.size() == 5 && elapsedRealtime - this.zzbhn.peekFirst().longValue() < 5000) {
                long j = this.zzbho;
                if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5)) {
                    this.zzbho = elapsedRealtime;
                    zzayb.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
