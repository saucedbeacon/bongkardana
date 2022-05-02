package o;

import java.util.ArrayList;
import java.util.List;

public class DefaultAuthenticationProxyImpl extends setSpeed<setDialogContent, setLastScanStartTimeMillis> {
    /* access modifiers changed from: protected */
    public setLastScanStartTimeMillis map(setDialogContent setdialogcontent) {
        if (setdialogcontent == null) {
            return null;
        }
        setLastScanStartTimeMillis setlastscanstarttimemillis = new setLastScanStartTimeMillis();
        setlastscanstarttimemillis.setSplitBillId(setdialogcontent.getSplitBillId());
        setlastscanstarttimemillis.setComment(setdialogcontent.getComment());
        setlastscanstarttimemillis.setStatus(setdialogcontent.getStatus());
        setlastscanstarttimemillis.setDeeplink(setdialogcontent.getDeeplinkUrl());
        setlastscanstarttimemillis.setPayers(map(setdialogcontent.getPayersResult()));
        setlastscanstarttimemillis.setPayerIndex(setdialogcontent.getPayerIndex());
        setlastscanstarttimemillis.setPayeeIndex(setdialogcontent.getPayeeIndex());
        return setlastscanstarttimemillis;
    }

    private List<setExtraBeaconDataTracker> map(List<DefaultRemoteDebugProxyImpl> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DefaultRemoteDebugProxyImpl next : list) {
                if (next != null) {
                    arrayList.add(map(next));
                }
            }
        }
        return arrayList;
    }

    private setExtraBeaconDataTracker map(DefaultRemoteDebugProxyImpl defaultRemoteDebugProxyImpl) {
        setExtraBeaconDataTracker setextrabeacondatatracker = new setExtraBeaconDataTracker();
        setextrabeacondatatracker.setName(defaultRemoteDebugProxyImpl.getName());
        setextrabeacondatatracker.setStatus(defaultRemoteDebugProxyImpl.getStatus());
        setextrabeacondatatracker.setFundAmount(defaultRemoteDebugProxyImpl.getFundAmount());
        setextrabeacondatatracker.setLoginId(defaultRemoteDebugProxyImpl.getLoginId());
        setextrabeacondatatracker.setUserId(defaultRemoteDebugProxyImpl.getUserId());
        setextrabeacondatatracker.setImageUrl(defaultRemoteDebugProxyImpl.getAvatarUrl());
        return setextrabeacondatatracker;
    }
}
