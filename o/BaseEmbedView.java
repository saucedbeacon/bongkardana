package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class BaseEmbedView {
    private static int numCounter;

    /* renamed from: o.BaseEmbedView$1  reason: invalid class name */
    public interface AnonymousClass1 {
        TitleBarRightButtonView.AnonymousClass1<generateStartToken> getPocketNumInfoEntity(long j);
    }

    public setBooleanConfig transform(generateStartToken generatestarttoken) {
        numCounter = 0;
        setBooleanConfig setbooleanconfig = new setBooleanConfig();
        uncheckAllItems.transform(setbooleanconfig, generatestarttoken);
        setbooleanconfig.setBadgeInfos(transform(generatestarttoken.badgeInfos));
        setbooleanconfig.setNumUpdated(numCounter);
        setbooleanconfig.setServerTimestamp(generatestarttoken.serverTimestamp);
        return setbooleanconfig;
    }

    private List<setStringConfig> transform(List<generate> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (generate transform : list) {
            arrayList.add(transform(transform));
        }
        return arrayList;
    }

    private setStringConfig transform(generate generate) {
        setStringConfig setstringconfig = new setStringConfig();
        setstringconfig.setKey(generate.getKey());
        setstringconfig.setNumUpdated(generate.getNumUpdated());
        countNumUpdated(setstringconfig.getNumUpdated());
        return setstringconfig;
    }

    private int countNumUpdated(int i) {
        int i2 = numCounter + i;
        numCounter = i2;
        return i2;
    }
}
