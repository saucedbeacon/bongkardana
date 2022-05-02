package o;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import o.ByteArrayPool;
import o.TitleBarRightButtonView;

public class poll implements getBuf {
    private static final String BUTTONS_JSON = "json/amcs-referral-widget-button-default.json";
    private final Context context;
    private final PluginInstallCallback serializer;

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReferralWidgets$2(Map map, List list) throws Exception {
        return map;
    }

    @Inject
    public poll(Context context2, PluginInstallCallback pluginInstallCallback) {
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, containsValue>> getReferralWidgets() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new offer(this)).flatMap(new ByteArrayPool.ConcurrentLinkedList(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getReferralWidgets$0() throws Exception {
        return this.serializer.deserializeMap(getPositiveString.loadJSONFromAsset(this.context, BUTTONS_JSON)).entrySet();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getReferralWidgets$3(Set set) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r3;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(new PoolingByteArrayOutputStream(this, hashMap)).toList();
        if (list instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new finalize(hashMap));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ containsValue lambda$getReferralWidgets$1(Map map, Map.Entry entry) throws Exception {
        String str = (String) entry.getKey();
        containsValue containsvalue = (containsValue) this.serializer.deserialize((String) entry.getValue(), containsValue.class);
        containsvalue.key = str;
        map.put(str, containsvalue);
        return containsvalue;
    }
}
