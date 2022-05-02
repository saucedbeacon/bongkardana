package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserServiceCompat$FastBitmap$CoordinateSystem implements MediaBrowserServiceCompat.values {
    final Messenger getMin;

    MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(Messenger messenger) {
        this.getMin = messenger;
    }

    public IBinder setMin() {
        return this.getMin.getBinder();
    }

    public void setMax(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("extra_service_version", 2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putParcelable("data_media_session_token", token);
        bundle2.putBundle("data_root_hints", bundle);
        getMin(1, bundle2);
    }

    public void setMax() throws RemoteException {
        getMin(2, (Bundle) null);
    }

    public void setMax(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
        }
        getMin(3, bundle3);
    }

    private void getMin(int i, Bundle bundle) throws RemoteException {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        this.getMin.send(obtain);
    }
}
