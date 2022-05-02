package o;

import android.media.MediaCodec;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

@RequiresApi(18)
final class findMinMaxChildLayoutPositions {
    final ByteBuffer[] getMax;
    ByteBuffer[] getMin;
    final MediaCodec setMax;

    findMinMaxChildLayoutPositions(MediaCodec mediaCodec) {
        this.setMax = mediaCodec;
        if (Build.VERSION.SDK_INT < 21) {
            this.getMax = mediaCodec.getInputBuffers();
            this.getMin = mediaCodec.getOutputBuffers();
            return;
        }
        this.getMin = null;
        this.getMax = null;
    }
}
