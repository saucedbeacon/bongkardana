package o;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;
import o.warmup;

@RequiresApi(26)
public class newSession {

    public interface length extends warmup.setMax {
        void setMax(@NonNull String str, @NonNull Bundle bundle);

        void setMin(@NonNull String str, List<?> list, @NonNull Bundle bundle);
    }

    public static Object getMin(length length2) {
        return new getMax(length2);
    }

    static class getMax<T extends length> extends warmup.getMin<T> {
        getMax(T t) {
            super(t);
        }

        public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            ((length) this.setMin).setMin(str, list, bundle);
        }

        public void onError(@NonNull String str, @NonNull Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            ((length) this.setMin).setMax(str, bundle);
        }
    }
}
