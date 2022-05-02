package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.IOException;

@RequiresApi(api = 28)
public final class MotionTelltales extends setBrightness<Bitmap> {
    private final rebuildScene setMax = new rebuildMotion();

    public final fireTrigger<Bitmap> getMax(ImageDecoder.Source source, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new getType(decodeBitmap, this.setMax);
    }
}
