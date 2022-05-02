package o;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
public class extraCommand {

    public interface length {
        void getMax(@NonNull String str);

        void setMin(Parcel parcel);
    }

    public static Object getMax(length length2) {
        return new setMin(length2);
    }

    static class setMin<T extends length> extends MediaBrowser.ItemCallback {
        protected final T setMin;

        public setMin(T t) {
            this.setMin = t;
        }

        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.setMin.setMin((Parcel) null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.setMin.setMin(obtain);
        }

        public void onError(@NonNull String str) {
            this.setMin.getMax(str);
        }
    }
}
