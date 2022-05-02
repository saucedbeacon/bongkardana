package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class setOnConfirmClickListener extends setSpeed<List<supportRemoteDebug>, List<sendNetworkResponse>> {
    private final PluginInstallCallback serializer;

    @Inject
    public setOnConfirmClickListener(PluginInstallCallback pluginInstallCallback) {
        this.serializer = pluginInstallCallback;
    }

    /* access modifiers changed from: protected */
    public List<sendNetworkResponse> map(List<supportRemoteDebug> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (supportRemoteDebug next : list) {
                if (next != null) {
                    arrayList.add(map(next));
                }
            }
        }
        return arrayList;
    }

    private sendNetworkResponse map(supportRemoteDebug supportremotedebug) {
        sendNetworkResponse sendnetworkresponse = new sendNetworkResponse();
        sendnetworkresponse.setSplitBillId(supportremotedebug.getSplitBillId());
        sendnetworkresponse.setLastUpdated(getBadgeList.getNowDateInEpoch());
        sendnetworkresponse.setCreatedDate(supportremotedebug.getSplitBillDate());
        sendnetworkresponse.setStatus(supportremotedebug.getStatus());
        sendnetworkresponse.setComment(supportremotedebug.getComment());
        sendnetworkresponse.setPayers(mapAvatars(supportremotedebug.getAvatarPayersList()));
        sendnetworkresponse.setTotalAmount(supportremotedebug.getTotalAmount().getAmount());
        return sendnetworkresponse;
    }

    private String mapAvatars(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String setextrabeacondatatracker : list) {
                arrayList.add(new setExtraBeaconDataTracker(setextrabeacondatatracker));
            }
        }
        return this.serializer.serialize(arrayList);
    }
}
