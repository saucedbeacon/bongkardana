package o;

import io.split.android.client.dtos.Split;
import io.split.android.client.dtos.SplitChange;
import io.split.android.client.dtos.Status;
import java.util.ArrayList;

public class noCaptchaForwardAuth {
    public getSecurityToken process(SplitChange splitChange) {
        SplitChange splitChange2 = splitChange;
        if (splitChange2 == null || splitChange2.splits == null) {
            return new getSecurityToken(new ArrayList(), new ArrayList(), -1, 0);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Split next : splitChange2.splits) {
            if (next.name != null) {
                if (next.status == Status.ACTIVE) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
        }
        return new getSecurityToken(arrayList, arrayList2, splitChange2.till, System.currentTimeMillis() / 100);
    }
}
