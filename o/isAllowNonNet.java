package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016J-\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\"\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lid/dana/data/saving/repository/source/local/DefaultConfigSavingCategoryEntityData;", "Lid/dana/data/saving/repository/SavingCategoryEntityData;", "context", "Landroid/content/Context;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/storage/Serializer;)V", "getContext", "()Landroid/content/Context;", "getSerializer", "()Lid/dana/data/storage/Serializer;", "getSavingCategories", "Lio/reactivex/Observable;", "", "Lid/dana/data/saving/model/SavingCategoryEntity;", "getSavingCategoriesByKeys", "keys", "", "", "([Ljava/lang/String;)Lio/reactivex/Observable;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isAllowNonNet implements timeout {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    private static final String DEFAULT_SAVING_CATEGORIES_JSON = "split/default-saving-categories-default.json";
    @NotNull
    private final Context context;
    @NotNull
    private final PluginInstallCallback serializer;

    @Inject
    public isAllowNonNet(@NotNull Context context2, @NotNull PluginInstallCallback pluginInstallCallback) {
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

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<access$702>> getSavingCategories() {
        TitleBarRightButtonView.AnonymousClass1<List<access$702>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …   } ?: emptyList()\n    }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<access$702>> getSavingCategoriesByKeys(@NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "keys");
        TitleBarRightButtonView.AnonymousClass1<List<access$702>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMax(this, strArr));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …   } ?: emptyList()\n    }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/saving/repository/source/local/DefaultConfigSavingCategoryEntityData$Companion;", "", "()V", "DEFAULT_SAVING_CATEGORIES_JSON", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lid/dana/data/saving/model/SavingCategoryEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<List<? extends access$702>> {
        final /* synthetic */ isAllowNonNet setMax;

        getMin(isAllowNonNet isallownonnet) {
            this.setMax = isallownonnet;
        }

        public final /* synthetic */ Object call() {
            String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.setMax.getContext(), isAllowNonNet.DEFAULT_SAVING_CATEGORIES_JSON);
            if (loadJSONFromAsset == null) {
                return CollectionsKt.emptyList();
            }
            Map<String, String> deserializeMap = this.setMax.getSerializer().deserializeMap(loadJSONFromAsset);
            Intrinsics.checkNotNullExpressionValue(deserializeMap, "defaultConfigMap");
            Collection arrayList = new ArrayList();
            for (Map.Entry next : deserializeMap.entrySet()) {
                access$702 access_702 = (access$702) this.setMax.getSerializer().deserialize((String) next.getValue(), access$702.class);
                if (access_702 != null) {
                    Object key = next.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "map.key");
                    String removePrefix = StringsKt.removePrefix((String) key, (CharSequence) "saving_");
                    Locale locale = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                    if (removePrefix != null) {
                        String upperCase = removePrefix.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                        access_702.setCategoryCode(upperCase);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    access_702 = null;
                }
                if (access_702 != null) {
                    arrayList.add(access_702);
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lid/dana/data/saving/model/SavingCategoryEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMax<V> implements Callable<List<? extends access$702>> {
        final /* synthetic */ String[] getMin;
        final /* synthetic */ isAllowNonNet setMin;

        getMax(isAllowNonNet isallownonnet, String[] strArr) {
            this.setMin = isallownonnet;
            this.getMin = strArr;
        }

        public final /* synthetic */ Object call() {
            access$702 access_702;
            String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.setMin.getContext(), isAllowNonNet.DEFAULT_SAVING_CATEGORIES_JSON);
            if (loadJSONFromAsset == null) {
                return CollectionsKt.emptyList();
            }
            Map<String, String> deserializeMap = this.setMin.getSerializer().deserializeMap(loadJSONFromAsset);
            String[] strArr = this.getMin;
            Collection arrayList = new ArrayList();
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                StringBuilder sb = new StringBuilder("saving_");
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                if (str != null) {
                    String lowerCase = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    sb.append(lowerCase);
                    String str2 = deserializeMap.get(sb.toString());
                    access$702 access_7022 = null;
                    if (!(str2 == null || (access_702 = (access$702) this.setMin.getSerializer().deserialize(str2, access$702.class)) == null)) {
                        access_702.setCategoryCode(str);
                        access_7022 = access_702;
                    }
                    if (access_7022 != null) {
                        arrayList.add(access_7022);
                    }
                    i++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return (List) arrayList;
        }
    }
}
