package o;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;
import java.util.List;

public final class onOptionsMenuClosed implements MediaDrm.OnKeyStatusChangeListener {
    private final ExoMediaDrm.OnKeyStatusChangeListener setMax;
    private final FrameworkMediaDrm setMin;

    public onOptionsMenuClosed(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
        this.setMin = frameworkMediaDrm;
        this.setMax = onKeyStatusChangeListener;
    }

    public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        this.setMin.lambda$setOnKeyStatusChangeListener$1(this.setMax, mediaDrm, bArr, list, z);
    }
}
