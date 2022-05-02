package o;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.annotation.RequiresApi;
import o.createNewMenuItem;

@RequiresApi(23)
public class addInternal {

    public interface getMin extends createNewMenuItem.length {
        void length(String str, createNewMenuItem.setMin<Parcel> setmin);
    }

    public static Object length(Context context, getMin getmin) {
        return new getMax(context, getmin);
    }

    static class getMax extends createNewMenuItem.getMin {
        getMax(Context context, getMin getmin) {
            super(context, getmin);
        }

        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((getMin) this.length).length(str, new createNewMenuItem.setMin(result));
        }
    }
}
