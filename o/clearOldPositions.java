package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.video.encoding.EncoderThread;
import java.io.IOException;
import o.didChildRangeChange;
import o.markItemDecorInsetsDirty;

@RequiresApi(api = 18)
public abstract class clearOldPositions<C extends markItemDecorInsetsDirty> extends dispatchLayoutStep3 {
    private static final String getMin;
    private static final CameraLogger toIntRange;
    protected Surface IsOverlapping;
    protected int equals = -1;
    protected C isInside;
    private boolean toFloatRange = false;

    static {
        String simpleName = clearOldPositions.class.getSimpleName();
        getMin = simpleName;
        toIntRange = CameraLogger.setMin(simpleName);
    }

    clearOldPositions(@NonNull C c) {
        super("VideoEncoder");
        this.isInside = c;
    }

    /* access modifiers changed from: protected */
    @EncoderThread
    public void length(@NonNull didChildRangeChange.setMin setmin, long j) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.isInside.toDoubleRange, this.isInside.equals, this.isInside.isInside);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.isInside.toFloatRange);
        createVideoFormat.setInteger("frame-rate", this.isInside.hashCode);
        createVideoFormat.setInteger("i-frame-interval", 1);
        createVideoFormat.setInteger("rotation-degrees", this.isInside.values);
        try {
            if (this.isInside.FastBitmap$CoordinateSystem != null) {
                this.setMin = MediaCodec.createByCodecName(this.isInside.FastBitmap$CoordinateSystem);
            } else {
                this.setMin = MediaCodec.createEncoderByType(this.isInside.toDoubleRange);
            }
            this.setMin.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.IsOverlapping = this.setMin.createInputSurface();
            this.setMin.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @EncoderThread
    public final void setMax() {
        this.equals = 0;
    }

    /* access modifiers changed from: protected */
    @EncoderThread
    public final void setMin() {
        toIntRange.getMax(1, "onStop", "setting mFrameNumber to 1 and signaling the end of input stream.");
        this.equals = -1;
        this.setMin.signalEndOfInputStream();
        setMin(true);
    }

    /* access modifiers changed from: protected */
    public final void length(@NonNull getChangedHolderKey getchangedholderkey, @NonNull animateChange animatechange) {
        if (!this.toFloatRange) {
            toIntRange.getMax(2, "onWriteOutput:", "sync frame not found yet. Checking.");
            if ((animatechange.getMax.flags & 1) == 1) {
                toIntRange.getMax(2, "onWriteOutput:", "SYNC FRAME FOUND!");
                this.toFloatRange = true;
            } else {
                toIntRange.getMax(2, "onWriteOutput:", "DROPPING FRAME and requesting a sync frame soon.");
                if (Build.VERSION.SDK_INT >= 19) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("request-sync", 0);
                    this.setMin.setParameters(bundle);
                }
                getchangedholderkey.getMin(animatechange);
                return;
            }
        }
        super.length(getchangedholderkey, animatechange);
    }

    /* access modifiers changed from: protected */
    public final int getMin() {
        return this.isInside.toFloatRange;
    }

    /* access modifiers changed from: protected */
    public boolean setMax(long j) {
        if (j == 0 || this.equals < 0 || equals()) {
            return false;
        }
        this.equals++;
        return true;
    }
}
