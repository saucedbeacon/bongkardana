package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.RVConfigService;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0002J\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0013H\u0016J.\u0010\u0016\u001a(\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00110\u0011\u0018\u0001 \u0018*\u0012\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\r0\u0017H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/DefaultDigitalMoneyEntityData;", "Lid/dana/data/sendmoney/DigitalMoneyEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getDigitalMoneyEntities", "Lkotlin/Function0;", "", "Lid/dana/data/sendmoney/model/DigitalMoneyEntity;", "getDigitalMoneyEntityFromFile", "prefixes", "", "getEWalletInnovConfig", "Lio/reactivex/Observable;", "Lid/dana/data/sendmoney/model/EWalletInnovConfigResult;", "getEWalletPrefix", "getPrefixes", "", "kotlin.jvm.PlatformType", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class map2String implements RVConfigService.OnConfigChangeListener {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    @NotNull
    public static final String DEFAULT_CATEGORIES_PREFIX_JSON = "json/amcs-ewallets-categories-prefix-default.json";
    @NotNull
    public static final String DEFAULT_EWALLET_PREFIX_JSON = "json/amcs-ewallets-prefix-default.json";
    @NotNull
    private final Context context;
    @NotNull
    private final PluginInstallCallback serializer;

    @Inject
    public map2String(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final PluginInstallCallback getSerializer() {
        return this.serializer;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [o.parseColorInt] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.TitleBarRightButtonView.AnonymousClass1<java.util.List<o.isInDomain>> getEWalletPrefix() {
        /*
            r2 = this;
            kotlin.jvm.functions.Function0 r0 = r2.getDigitalMoneyEntities()
            if (r0 == 0) goto L_0x000c
            o.parseColorInt r1 = new o.parseColorInt
            r1.<init>(r0)
            r0 = r1
        L_0x000c:
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            o.TitleBarRightButtonView$1 r0 = o.TitleBarRightButtonView.AnonymousClass1.fromCallable(r0)
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            o.TitleBarRightButtonView$1 r0 = r0.onErrorReturnItem(r1)
            java.lang.String r1 = "Observable.fromCallable(…orReturnItem(emptyList())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.map2String.getEWalletPrefix():o.TitleBarRightButtonView$1");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<currentThreadInArray> getEWalletInnovConfig() {
        TitleBarRightButtonView.AnonymousClass1<currentThreadInArray> just = TitleBarRightButtonView.AnonymousClass1.just(new currentThreadInArray("", "", "", "", false));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(EWalletI…t(\"\", \"\", \"\", \"\", false))");
        return just;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/data/sendmoney/model/DigitalMoneyEntity;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<List<? extends isInDomain>> {
        final /* synthetic */ map2String this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(map2String map2string) {
            super(0);
            this.this$0 = map2string;
        }

        @NotNull
        public final List<isInDomain> invoke() {
            List access$getPrefixes = this.this$0.getPrefixes();
            List<isInDomain> access$getDigitalMoneyEntityFromFile = access$getPrefixes != null ? this.this$0.getDigitalMoneyEntityFromFile(access$getPrefixes) : null;
            return access$getDigitalMoneyEntityFromFile == null ? CollectionsKt.emptyList() : access$getDigitalMoneyEntityFromFile;
        }
    }

    private final Function0<List<isInDomain>> getDigitalMoneyEntities() {
        return new setMax(this);
    }

    /* access modifiers changed from: private */
    public final List<String> getPrefixes() {
        String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.context, DEFAULT_EWALLET_PREFIX_JSON);
        if (loadJSONFromAsset != null) {
            Map<String, String> deserializeMap = this.serializer.deserializeMap(loadJSONFromAsset);
            String str = deserializeMap != null ? deserializeMap.get("ewallet_prefix_list") : null;
            if (str != null) {
                return this.serializer.deserializeList(str);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final List<isInDomain> getDigitalMoneyEntityFromFile(List<String> list) {
        Map<String, String> deserializeMap;
        isInDomain isindomain;
        String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.context, DEFAULT_CATEGORIES_PREFIX_JSON);
        if (loadJSONFromAsset == null || (deserializeMap = this.serializer.deserializeMap(loadJSONFromAsset)) == null) {
            return null;
        }
        Collection arrayList = new ArrayList();
        for (String str : list) {
            calculateSize calculatesize = (calculateSize) this.serializer.deserialize(deserializeMap.get("ewallet_".concat(String.valueOf(str))), calculateSize.class);
            if (calculatesize != null) {
                isindomain = removeOnMain.toDigitalMoneyEntity(calculatesize, str);
            } else {
                isindomain = null;
            }
            if (isindomain != null) {
                arrayList.add(isindomain);
            }
        }
        return (List) arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/DefaultDigitalMoneyEntityData$Companion;", "", "()V", "DEFAULT_CATEGORIES_PREFIX_JSON", "", "DEFAULT_EWALLET_PREFIX_JSON", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
