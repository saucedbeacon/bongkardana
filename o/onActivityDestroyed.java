package o;

import android.media.MediaPlayer;
import com.google.zxing.client.android.BeepManager;

public final class onActivityDestroyed implements MediaPlayer.OnErrorListener {
    public static final onActivityDestroyed setMax = new onActivityDestroyed();

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return BeepManager.lambda$playBeepSound$1(mediaPlayer, i, i2);
    }
}
