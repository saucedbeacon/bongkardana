package o;

import android.media.MediaPlayer;
import com.google.zxing.client.android.BeepManager;

public final class onActivitySaveInstanceState implements MediaPlayer.OnCompletionListener {
    public static final onActivitySaveInstanceState getMin = new onActivitySaveInstanceState();

    public final void onCompletion(MediaPlayer mediaPlayer) {
        BeepManager.lambda$playBeepSound$0(mediaPlayer);
    }
}
