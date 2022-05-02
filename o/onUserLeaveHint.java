package o;

import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import com.iap.ac.config.lite.listener.sectionconfig.ISectionConfigListener;
import org.json.JSONObject;

final class onUserLeaveHint implements ISectionConfigListener {
    private final handleMessage setMax;
    private final IComponent setMin;

    public onUserLeaveHint(handleMessage handlemessage, IComponent iComponent) {
        this.setMax = handlemessage;
        this.setMin = iComponent;
    }

    public final void onConfigChanged(String str, JSONObject jSONObject, ChangedDetails changedDetails) {
        this.setMax.lambda$observeMaintenanceBroadcast$8(this.setMin, str, jSONObject, changedDetails);
    }
}
