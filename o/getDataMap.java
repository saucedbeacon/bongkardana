package o;

import android.content.Context;
import id.dana.domain.featureswitch.KeyFeatureNonAMCS;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.IMtopProxy;
import o.TitleBarRightButtonView;

@Singleton
public class getDataMap implements IMtopProxy.Callback {
    private static final String FEATURE_NON_AMCS = "json/feature-non-amcs.json";
    private final Context context;
    private final PluginInstallCallback serializer;

    @Inject
    public getDataMap(Context context2, PluginInstallCallback pluginInstallCallback) {
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureNonAMCS(String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getParameterMap(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isFeatureNonAMCS$0(String str) throws Exception {
        String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.context, FEATURE_NON_AMCS);
        for (String equals : this.serializer.deserializeList(this.serializer.deserializeMap(loadJSONFromAsset).get(KeyFeatureNonAMCS.ALL))) {
            if (equals.equals(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
