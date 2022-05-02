package o;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import o.requestPostMessageChannel;

@RequiresApi(23)
public class postMessage {

    public interface setMax extends requestPostMessageChannel.length {
        void length(Uri uri, Bundle bundle);
    }

    public static Object setMax(setMax setmax) {
        return new length(setmax);
    }

    static class length<T extends setMax> extends requestPostMessageChannel.getMin<T> {
        public length(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            ((setMax) this.setMin).length(uri, bundle);
        }
    }
}
