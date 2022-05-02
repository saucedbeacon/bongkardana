package o;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
public class createNewMenuItem {

    public interface length {
        setMax setMax(String str, int i, Bundle bundle);

        void setMin(String str, setMin<List<Parcel>> setmin);
    }

    public static Object setMin(Context context, length length2) {
        return new getMin(context, length2);
    }

    public static void getMax(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    public static IBinder getMax(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void setMin(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }

    public static void getMax(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    public static class setMin<T> {
        MediaBrowserService.Result getMax;

        setMin(MediaBrowserService.Result result) {
            this.getMax = result;
        }

        public void setMin(T t) {
            if (t instanceof List) {
                this.getMax.sendResult(setMax((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.getMax.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.getMax.sendResult((Object) null);
            }
        }

        /* access modifiers changed from: package-private */
        public List<MediaBrowser.MediaItem> setMax(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }
    }

    public static class setMax {
        final String getMax;
        final Bundle length;

        public setMax(String str, Bundle bundle) {
            this.getMax = str;
            this.length = bundle;
        }
    }

    static class getMin extends MediaBrowserService {
        final length length;

        getMin(Context context, length length2) {
            attachBaseContext(context);
            this.length = length2;
        }

        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            setMax max = this.length.setMax(str, i, bundle == null ? null : new Bundle(bundle));
            if (max == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(max.getMax, max.length);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.length.setMin(str, new setMin(result));
        }
    }
}
