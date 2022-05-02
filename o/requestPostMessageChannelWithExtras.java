package o;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import o.postMessage;

@RequiresApi(24)
public class requestPostMessageChannelWithExtras {

    public interface length extends postMessage.setMax {
        void IsOverlapping();

        void getMax(Uri uri, Bundle bundle);

        void getMax(String str, Bundle bundle);

        void length(String str, Bundle bundle);
    }

    public static Object getMin(length length2) {
        return new getMin(length2);
    }

    public static String setMin(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    static class getMin<T extends length> extends postMessage.length<T> {
        public getMin(T t) {
            super(t);
        }

        public void onPrepare() {
            ((length) this.setMin).IsOverlapping();
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            ((length) this.setMin).length(str, bundle);
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            ((length) this.setMin).getMax(str, bundle);
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            ((length) this.setMin).getMax(uri, bundle);
        }
    }
}
