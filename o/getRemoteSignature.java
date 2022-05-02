package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class getRemoteSignature extends setSpeed<List<RemoteDebugUtils>, List<getErrorStatusPageUrl>> {
    /* access modifiers changed from: protected */
    public List<getErrorStatusPageUrl> map(List<RemoteDebugUtils> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RemoteDebugUtils map : list) {
            arrayList.add(map(map));
        }
        return arrayList;
    }

    private getErrorStatusPageUrl map(RemoteDebugUtils remoteDebugUtils) {
        getErrorStatusPageUrl geterrorstatuspageurl = new getErrorStatusPageUrl();
        geterrorstatuspageurl.setUserId(remoteDebugUtils.getUserId());
        geterrorstatuspageurl.setLastUpdated(remoteDebugUtils.getLastUpdated());
        geterrorstatuspageurl.setUserAvatar(remoteDebugUtils.getAvatar());
        if (!TextUtils.isEmpty(remoteDebugUtils.getUserNickname())) {
            geterrorstatuspageurl.setUserNickName(remoteDebugUtils.getUserNickname());
        } else {
            geterrorstatuspageurl.setUserNickName(remoteDebugUtils.getShownName());
        }
        if (!TextUtils.isEmpty(remoteDebugUtils.getUserPhoneNumber())) {
            geterrorstatuspageurl.setUserPhoneNumber(remoteDebugUtils.getUserPhoneNumber());
        } else {
            geterrorstatuspageurl.setUserPhoneNumber(remoteDebugUtils.getShownNumber());
        }
        return geterrorstatuspageurl;
    }
}
