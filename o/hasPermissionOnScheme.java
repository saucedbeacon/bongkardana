package o;

import java.util.List;
import javax.inject.Inject;

public class hasPermissionOnScheme extends setSpeed<setDialogContent, sendNetworkResponse> {
    private final PluginInstallCallback serializer;

    @Inject
    public hasPermissionOnScheme(PluginInstallCallback pluginInstallCallback) {
        this.serializer = pluginInstallCallback;
    }

    /* access modifiers changed from: protected */
    public sendNetworkResponse map(setDialogContent setdialogcontent) {
        if (setdialogcontent == null) {
            return null;
        }
        sendNetworkResponse sendnetworkresponse = new sendNetworkResponse();
        sendnetworkresponse.setStatus(setdialogcontent.getStatus());
        sendnetworkresponse.setComment(setdialogcontent.getComment());
        sendnetworkresponse.setSplitBillId(setdialogcontent.getSplitBillId());
        sendnetworkresponse.setPayeeIndex(Integer.valueOf(setdialogcontent.getPayeeIndex()).intValue());
        sendnetworkresponse.setPayerIndex(Integer.valueOf(setdialogcontent.getPayerIndex()).intValue());
        sendnetworkresponse.setTotalAmount(getTotalAmount(setdialogcontent.getPayersResult()));
        sendnetworkresponse.setPayers(this.serializer.serialize(setdialogcontent.getPayersResult()));
        sendnetworkresponse.setLastUpdated(getBadgeList.getNowDateInEpoch());
        return sendnetworkresponse;
    }

    private String getTotalAmount(List<DefaultRemoteDebugProxyImpl> list) {
        long j = 0;
        if (list != null) {
            for (DefaultRemoteDebugProxyImpl fundAmount : list) {
                j += Long.valueOf(fundAmount.getFundAmount()).longValue();
            }
        }
        return String.valueOf(j);
    }
}
