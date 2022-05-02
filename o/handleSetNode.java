package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;

@Singleton
public class handleSetNode extends setSpeed<List<NodeAware>, List<getErrorStatusPageUrl>> {
    public List<getErrorStatusPageUrl> apply(List<NodeAware> list) {
        return map(list);
    }

    /* access modifiers changed from: protected */
    public List<getErrorStatusPageUrl> map(List<NodeAware> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NodeAware next : list) {
            getErrorStatusPageUrl geterrorstatuspageurl = new getErrorStatusPageUrl();
            geterrorstatuspageurl.setUserId(next.getUserId());
            geterrorstatuspageurl.setUserNickName(next.getUserNickName());
            geterrorstatuspageurl.setUserPhoneNumber(next.getUserPhoneNumber());
            geterrorstatuspageurl.setUserAvatar(next.getAvatar());
            geterrorstatuspageurl.setLastUpdated(next.getLastUpdated());
            arrayList.add(geterrorstatuspageurl);
        }
        return arrayList;
    }
}
