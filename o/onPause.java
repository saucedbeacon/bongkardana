package o;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;

public final class onPause implements MediaDrm.OnEventListener {
    private final FrameworkMediaDrm getMin;
    private final ExoMediaDrm.OnEventListener setMax;

    public onPause(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnEventListener onEventListener) {
        this.getMin = frameworkMediaDrm;
        this.setMax = onEventListener;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.getMin.lambda$setOnEventListener$0(this.setMax, mediaDrm, bArr, i, i2, bArr2);
    }
}
