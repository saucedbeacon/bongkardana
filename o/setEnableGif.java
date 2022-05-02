package o;

import java.util.ArrayList;
import java.util.List;

public final class setEnableGif extends setSpeed<List<setDownloadListener>, List<getPhoto>> {
    public final /* synthetic */ Object map(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (setDownloadListener setdownloadlistener : (List) obj) {
            getPhoto getphoto = null;
            if (setdownloadlistener != null) {
                getphoto = new getPhoto();
                getphoto.getMin = setdownloadlistener.getExpiryNumber();
                getphoto.getMax(setdownloadlistener.getExpiryUnit());
                getphoto.getMax = setdownloadlistener.isExpiryDefault();
            }
            arrayList.add(getphoto);
        }
        return arrayList;
    }
}
