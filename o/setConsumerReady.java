package o;

import android.content.Context;
import com.google.gson.Gson;
import com.iap.ac.config.lite.ConfigCenter;
import javax.inject.Inject;
import o.TitleBarRightButtonView;
import org.json.JSONObject;

public class setConsumerReady implements setBufferSize {
    private final PluginInstallCallback serializer;

    @Inject
    public setConsumerReady(Context context, AppPausePoint appPausePoint, PluginInstallCallback pluginInstallCallback) {
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context, "prod");
        }
        this.serializer = pluginInstallCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<getBufferSize> getReferralConfig(String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new enqueueBuffer(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ getBufferSize lambda$getReferralConfig$0(String str) throws Exception {
        Object obj;
        JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("FeatureReferral");
        if (sectionConfig == null || (obj = sectionConfig.get(str)) == null) {
            return null;
        }
        return (getBufferSize) this.serializer.deserialize(new Gson().toJson(obj), getBufferSize.class);
    }
}
