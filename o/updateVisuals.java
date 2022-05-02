package o;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
public class updateVisuals {

    public interface getMin {
        void getMin(int i, int i2, int i3, int i4, int i5);

        void getMin(List<?> list);

        void length(Object obj);

        void setMax();

        void setMin(Bundle bundle);

        void setMin(CharSequence charSequence);

        void setMin(Object obj);

        void setMin(String str, Bundle bundle);
    }

    public static Object getMax(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    public static Object length(getMin getmin) {
        return new setMin(getmin);
    }

    public static boolean length(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    public static void getMin(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    public static class length {
        public static AudioAttributes length(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        public static int setMin(Object obj) {
            return getMax(length(obj));
        }

        private static int getMax(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    static class setMin<T extends getMin> extends MediaController.Callback {
        protected final T length;

        public setMin(T t) {
            this.length = t;
        }

        public void onSessionDestroyed() {
            this.length.setMax();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            this.length.setMin(str, bundle);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.length.setMin((Object) playbackState);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.length.length(mediaMetadata);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.length.getMin(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.length.setMin(charSequence);
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            this.length.setMin(bundle);
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.length.getMin(playbackInfo.getPlaybackType(), length.setMin(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }
}
