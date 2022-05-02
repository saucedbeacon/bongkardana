package o;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class invokeMethod implements RVAccountService {
    private static final String DEFAULT_ADD_PAY_METHOD_JSON = "json/amcs-add-paymethod-default.json";
    private final Context context;
    private final PluginInstallCallback serializer;

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$createMapIterable$2(Map map, List list) throws Exception {
        return map;
    }

    @Inject
    public invokeMethod(Context context2, PluginInstallCallback pluginInstallCallback) {
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, addExtraDataParser>> getAddPayMethodConfig() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new invokeStaticMethod(this)).flatMap(new ReflectUtils(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getAddPayMethodConfig$0() throws Exception {
        return this.serializer.deserializeMap(getPositiveString.loadJSONFromAsset(this.context, DEFAULT_ADD_PAY_METHOD_JSON)).entrySet();
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Map<String, addExtraDataParser>> createMapIterable(Set<Map.Entry<String, String>> set) {
        TitleBarRightButtonView.AnonymousClass1 r3;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<List<R>> list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(new getField(this, hashMap)).toList();
        if (list instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new findMethod(hashMap));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ addExtraDataParser lambda$createMapIterable$1(Map map, Map.Entry entry) throws Exception {
        addExtraDataParser createAddPaymethodFromMap = createAddPaymethodFromMap(entry);
        map.put(createAddPaymethodFromMap.getKey(), createAddPaymethodFromMap);
        return createAddPaymethodFromMap;
    }

    private addExtraDataParser createAddPaymethodFromMap(Map.Entry<String, String> entry) {
        addExtraDataParser addextradataparser = (addExtraDataParser) this.serializer.deserialize(entry.getValue(), addExtraDataParser.class);
        addextradataparser.setKey(entry.getKey());
        return addextradataparser;
    }
}
