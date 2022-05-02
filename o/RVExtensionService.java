package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

public class RVExtensionService extends setSpeed<exists, UCUtils> {
    private List<addExtraDataParser> addPayMethods;
    private final getAppRegion payChannelResultMapper;
    private final getAppCurrency payOptionsResultMapper;

    @Inject
    RVExtensionService(getAppCurrency getappcurrency, getAppRegion getappregion) {
        this.payOptionsResultMapper = getappcurrency;
        this.payChannelResultMapper = getappregion;
    }

    /* access modifiers changed from: protected */
    public UCUtils map(exists exists) {
        if (exists == null) {
            return null;
        }
        UCUtils uCUtils = new UCUtils();
        uCUtils.setPayMethod(exists.payMethod);
        uCUtils.setPayCardOptionViews(this.payOptionsResultMapper.map(exists.payCardOptionViews));
        uCUtils.setPayChannelOptionViews(this.payChannelResultMapper.map(exists.payChannelOptionViews));
        List<addExtraDataParser> list = this.addPayMethods;
        if (list != null && !list.isEmpty()) {
            uCUtils.setAddPayMethods(checkAddPayMethod(exists));
        }
        return uCUtils;
    }

    private List<addExtraDataParser> checkAddPayMethod(exists exists) {
        ArrayList arrayList = new ArrayList();
        for (addExtraDataParser next : this.addPayMethods) {
            if (!TextUtils.isEmpty(next.getPayMethod())) {
                Iterator<checkPathValid> it = exists.payChannelOptionViews.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    checkPathValid next2 = it.next();
                    if (isAddPayMethodValid(next, next2)) {
                        next.setInstLocalName(next2.instLocalName);
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean isAddPayMethodValid(addExtraDataParser addextradataparser, checkPathValid checkpathvalid) {
        if (TextUtils.isEmpty(checkpathvalid.payMethod) || !checkpathvalid.enableStatus || !addextradataparser.getPayMethod().equals(checkpathvalid.payMethod)) {
            return false;
        }
        return addextradataparser.getInstId() == null || TextUtils.equals(addextradataparser.getInstId(), checkpathvalid.instId);
    }

    /* access modifiers changed from: package-private */
    public void setAddPayMethods(List<addExtraDataParser> list) {
        this.addPayMethods = list;
    }
}
