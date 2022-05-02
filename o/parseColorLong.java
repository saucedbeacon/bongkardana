package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVLogger;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
public class parseColorLong implements RVLogger.AnonymousClass1 {
    private static final String RECIPIENT_HOME_MENU_JSON = "json/amcs-sendmoney-home-menu-default.json";
    private static final String RECIPIENT_HOME_MENU_LIST = "json/amcs-sendmoney-home-menu-category.json";
    private final Context context;
    private final PluginInstallCallback serializer;

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$convertJsonToMenuItem$0(Map map, List list) throws Exception {
        return map;
    }

    @Inject
    public parseColorLong(Context context2, PluginInstallCallback pluginInstallCallback) {
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    private TitleBarRightButtonView.AnonymousClass1<Map<String, getExtension>> getSendMoneyMenuItems() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(getMenuItemsFromFile()).flatMap(convertJsonToMenuItem());
    }

    @NotNull
    private RedDotDrawable<Set<Map.Entry<String, String>>, TitleBarRightButtonView.AnonymousClass4<Map<String, getExtension>>> convertJsonToMenuItem() {
        return new array2String(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$convertJsonToMenuItem$1(Set set) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r3;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<List<getExtension>> list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(deserializeToSendMoneyHomeMenuEntity(hashMap)).toList();
        if (list instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new parseInt(hashMap));
    }

    @NotNull
    private RedDotDrawable<Map.Entry<String, String>, getExtension> deserializeToSendMoneyHomeMenuEntity(Map<String, getExtension> map) {
        return new parseDouble(this, map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ getExtension lambda$deserializeToSendMoneyHomeMenuEntity$2(Map map, Map.Entry entry) throws Exception {
        String str = (String) entry.getKey();
        getExtension getextension = (getExtension) this.serializer.deserialize((String) entry.getValue(), getExtension.class);
        getextension.key = str;
        map.put(str, getextension);
        return getextension;
    }

    @NotNull
    private Callable<Set<Map.Entry<String, String>>> getMenuItemsFromFile() {
        return new parseFloat(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getMenuItemsFromFile$3() throws Exception {
        return this.serializer.deserializeMap(getPositiveString.loadJSONFromAsset(this.context, RECIPIENT_HOME_MENU_JSON)).entrySet();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getExtension>> getSendMoneyHomeMenus() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(getMenuCategories()).flatMap(getMenuItemForEachCategory());
    }

    @NotNull
    private RedDotDrawable<List<String>, TitleBarRightButtonView.AnonymousClass4<List<getExtension>>> getMenuItemForEachCategory() {
        return new parseLong(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMenuItemForEachCategory$5(List list) throws Exception {
        return getSendMoneyMenuItems().flatMap(new UrlUtils(list));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMenuItemForEachCategory$4(List list, Map map) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getExtension getextension = (getExtension) map.get((String) it.next());
            if (getextension != null) {
                arrayList.add(getextension);
            }
        }
        return TitleBarRightButtonView.AnonymousClass1.just(arrayList);
    }

    @NotNull
    private Callable<List<String>> getMenuCategories() {
        return new matchAppIdRaw(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$getMenuCategories$6() throws Exception {
        String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.context, RECIPIENT_HOME_MENU_LIST);
        return this.serializer.deserializeList(this.serializer.deserializeMap(loadJSONFromAsset).get("send_money_scenarios"));
    }
}
