package o;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import o.addInternal;

@RequiresApi(26)
public class setCallback {
    static Field length;

    public interface setMax extends addInternal.getMin {
        void getMax(String str, getMin getmin, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            length = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public static Object getMin(Context context, setMax setmax) {
        return new setMin(context, setmax);
    }

    public static void setMin(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }

    public static Bundle length(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    public static class getMin {
        MediaBrowserService.Result setMax;

        getMin(MediaBrowserService.Result result) {
            this.setMax = result;
        }

        public void length(List<Parcel> list, int i) {
            try {
                setCallback.length.setInt(this.setMax, i);
            } catch (IllegalAccessException unused) {
            }
            this.setMax.sendResult(getMin(list));
        }

        /* access modifiers changed from: package-private */
        public List<MediaBrowser.MediaItem> getMin(List<Parcel> list) {
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

    static class setMin extends addInternal.getMax {
        setMin(Context context, setMax setmax) {
            super(context, setmax);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            ((setMax) this.length).getMax(str, new getMin(result), bundle);
        }
    }
}
