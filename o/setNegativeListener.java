package o;

import java.util.List;
import javax.inject.Inject;

public class setNegativeListener extends setSpeed<getExtraBeaconDataTracker, sendNetworkResponse> {
    private String deeplinkUrl;
    private final PluginInstallCallback serializer;
    private String splitBillId;

    @Inject
    public setNegativeListener(PluginInstallCallback pluginInstallCallback) {
        this.serializer = pluginInstallCallback;
    }

    public void setSplitBillId(String str) {
        this.splitBillId = str;
    }

    public void setDeeplinkUrl(String str) {
        this.deeplinkUrl = str;
    }

    /* access modifiers changed from: protected */
    public sendNetworkResponse map(getExtraBeaconDataTracker getextrabeacondatatracker) {
        String totalAmount = getTotalAmount(getextrabeacondatatracker.getPayers());
        return new sendNetworkResponse(getextrabeacondatatracker.getComment(), this.deeplinkUrl, this.serializer.serialize(getextrabeacondatatracker.getPayers()), this.splitBillId, totalAmount, getBadgeList.getNowDateInEpoch());
    }

    private String getTotalAmount(List<setExtraBeaconDataTracker> list) {
        long j = 0;
        for (setExtraBeaconDataTracker fundAmount : list) {
            j += Long.valueOf(fundAmount.getFundAmount()).longValue();
        }
        return String.valueOf(j);
    }
}
