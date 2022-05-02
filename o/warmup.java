package o;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
public class warmup {

    public interface length {
        void getMin();

        void length();

        void setMin();
    }

    public interface setMax {
        void length(@NonNull String str);

        void setMin(@NonNull String str, List<?> list);
    }

    public static Object getMin(length length2) {
        return new getMax(length2);
    }

    public static Object getMin(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static void getMin(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static void setMin(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    public static Bundle length(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static Object getMax(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    public static Object getMax(setMax setmax) {
        return new getMin(setmax);
    }

    static class getMax<T extends length> extends MediaBrowser.ConnectionCallback {
        protected final T getMin;

        public getMax(T t) {
            this.getMin = t;
        }

        public void onConnected() {
            this.getMin.getMin();
        }

        public void onConnectionSuspended() {
            this.getMin.length();
        }

        public void onConnectionFailed() {
            this.getMin.setMin();
        }
    }

    static class getMin<T extends setMax> extends MediaBrowser.SubscriptionCallback {
        protected final T setMin;

        public getMin(T t) {
            this.setMin = t;
        }

        public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
            this.setMin.setMin(str, list);
        }

        public void onError(@NonNull String str) {
            this.setMin.length(str);
        }
    }

    public static class setMin {
        public static int getMax(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }

        public static Object setMax(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }
    }
}
