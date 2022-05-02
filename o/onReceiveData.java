package o;

import android.content.Context;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class onReceiveData implements setBufferSize {
    private static final String REFERRAL_CONFIG_JSON = "json/amcs-referral-config-default.json";
    private final Context context;
    private final PluginInstallCallback serializer;

    @Inject
    public onReceiveData(Context context2, PluginInstallCallback pluginInstallCallback) {
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<getBufferSize> getReferralConfig(String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new IBigDataChannelCallback(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ getBufferSize lambda$getReferralConfig$0(String str) throws Exception {
        String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.context, REFERRAL_CONFIG_JSON);
        return (getBufferSize) this.serializer.deserialize(this.serializer.deserializeMap(loadJSONFromAsset).get(str), getBufferSize.class);
    }
}
