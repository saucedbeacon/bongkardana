package o;

import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import o.getActionViewStatesKey;

@RequiresApi(28)
class removeItem extends restoreActionViewStates {

    static final class length implements getActionViewStatesKey.getMax {
        final MediaSessionManager.RemoteUserInfo length;

        length(String str, int i, int i2) {
            this.length = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        length(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.length = remoteUserInfo;
        }

        public final int hashCode() {
            return setNegativeButtonIcon.setMin(this.length);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            return this.length.equals(((length) obj).length);
        }
    }
}
