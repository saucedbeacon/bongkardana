package o;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.ui.PlayerNotificationManager;

public final class performDestroy implements Runnable {
    private final Bitmap getMax;
    private final PlayerNotificationManager.BitmapCallback getMin;

    public performDestroy(PlayerNotificationManager.BitmapCallback bitmapCallback, Bitmap bitmap) {
        this.getMin = bitmapCallback;
        this.getMax = bitmap;
    }

    public final void run() {
        this.getMin.lambda$onBitmap$0(this.getMax);
    }
}
