package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;

@Singleton
public class getClassName extends setSpeed<List<getErrorStatusPageUrl>, List<getMonitorToken>> {
    /* access modifiers changed from: protected */
    public List<getMonitorToken> map(List<getErrorStatusPageUrl> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (getErrorStatusPageUrl map : list) {
            arrayList.add(map(map));
        }
        return arrayList;
    }

    private getMonitorToken map(getErrorStatusPageUrl geterrorstatuspageurl) {
        if (geterrorstatuspageurl == null) {
            return null;
        }
        getMonitorToken getmonitortoken = new getMonitorToken();
        getmonitortoken.setId(geterrorstatuspageurl.getUserId());
        getmonitortoken.setName(geterrorstatuspageurl.getUserNickName());
        getmonitortoken.setRecipientName(geterrorstatuspageurl.getUserNickName());
        getmonitortoken.setNumber(geterrorstatuspageurl.getUserPhoneNumber());
        getmonitortoken.setImageUrl(geterrorstatuspageurl.getUserAvatar());
        getmonitortoken.setLastUpdated(geterrorstatuspageurl.getLastUpdated());
        getmonitortoken.setType(0);
        return getmonitortoken;
    }
}
