package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u0015H\u0016J-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u00152\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0019\"\u00020\u0010H\u0016¢\u0006\u0002\u0010\u001aJ3\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0019\"\u00020\u0010¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001dH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001c\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\f \u001f*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00160\u0016H\u0002J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\n\u0010 \u001a\u0004\u0018\u00010!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/data/saving/repository/source/local/NetworkConfigSavingCategoryEntityData;", "Lid/dana/data/saving/repository/SavingCategoryEntityData;", "context", "Landroid/content/Context;", "amcsManager", "Lid/dana/data/foundation/amcs/AMCSManager;", "serializer", "Lid/dana/data/storage/Serializer;", "splitConfigEntityData", "Lid/dana/data/config/source/split/SplitConfigEntityData;", "(Landroid/content/Context;Lid/dana/data/foundation/amcs/AMCSManager;Lid/dana/data/storage/Serializer;Lid/dana/data/config/source/split/SplitConfigEntityData;)V", "deserialize", "Lid/dana/data/saving/model/SavingCategoryEntity;", "jsonObject", "", "key", "", "getKey", "removePrefix", "", "getSavingCategories", "Lio/reactivex/Observable;", "", "getSavingCategoriesByKeys", "keys", "", "([Ljava/lang/String;)Lio/reactivex/Observable;", "(Z[Ljava/lang/String;)Lio/reactivex/Observable;", "getSavingCategoriesFromAMCS", "", "getSavingCategoriesFromSplit", "kotlin.jvm.PlatformType", "getSavingSection", "Lorg/json/JSONObject;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isNeedSignature implements timeout {
    private final PluginInstallCallback serializer;
    private final AppUtils splitConfigEntityData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/data/saving/model/SavingCategoryEntity;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<List<? extends String>, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends access$702>>> {
        final /* synthetic */ isNeedSignature setMax;

        getMax(isNeedSignature isneedsignature) {
            this.setMax = isneedsignature;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            isNeedSignature isneedsignature = this.setMax;
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return isneedsignature.getSavingCategoriesByKeys(true, (String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/model/SavingCategoryEntity;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<Throwable, access$702> {
        final /* synthetic */ String getMin;
        final /* synthetic */ isNeedSignature length;

        setMax(isNeedSignature isneedsignature, String str) {
            this.length = isneedsignature;
            this.getMin = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return this.length.getSavingCategoriesFromAMCS(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/saving/model/SavingCategoryEntity;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<access$702, access$702> {
        final /* synthetic */ String getMin;
        final /* synthetic */ boolean length;

        setMin(boolean z, String str) {
            this.length = z;
            this.getMin = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Locale locale;
            String str;
            access$702 access_702 = (access$702) obj;
            Intrinsics.checkNotNullParameter(access_702, "it");
            if (this.length) {
                str = StringsKt.removePrefix(this.getMin, (CharSequence) "saving_");
                locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                str = this.getMin;
                locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            access_702.setCategoryCode(upperCase);
            return access_702;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/data/saving/model/SavingCategoryEntity;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<Throwable, List<? extends access$702>> {
        final /* synthetic */ isNeedSignature setMax;

        toIntRange(isNeedSignature isneedsignature) {
            this.setMax = isneedsignature;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return this.setMax.getSavingCategoriesFromAMCS();
        }
    }

    @Inject
    public isNeedSignature(@NotNull Context context, @NotNull AppPausePoint appPausePoint, @NotNull PluginInstallCallback pluginInstallCallback, @NotNull AppUtils appUtils) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appPausePoint, "amcsManager");
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        Intrinsics.checkNotNullParameter(appUtils, "splitConfigEntityData");
        this.serializer = pluginInstallCallback;
        this.splitConfigEntityData = appUtils;
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context, "prod");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<access$702>> getSavingCategories() {
        TitleBarRightButtonView.AnonymousClass1<List<access$702>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ngCategoriesFromSplit() }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<access$702>> getSavingCategoriesByKeys(@NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "keys");
        return getSavingCategoriesByKeys(false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<access$702>> getSavingCategoriesByKeys(boolean z, @NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "keys");
        TitleBarRightButtonView.AnonymousClass1<List<access$702>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new length(this, strArr, z));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …   savingCategories\n    }");
        return fromCallable;
    }

    /* access modifiers changed from: private */
    public final access$702 getSavingCategoriesFromAMCS(String str) {
        JSONObject savingSection = getSavingSection();
        if (savingSection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("saving_");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            Object obj = savingSection.get(sb.toString());
            Intrinsics.checkNotNullExpressionValue(obj, "it");
            return deserialize(obj, str);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* access modifiers changed from: private */
    public final access$702 getSavingCategoriesFromSplit(String str, boolean z) {
        try {
            return (access$702) this.splitConfigEntityData.getSavingCategoriesByKey(getKey(str, z)).map(new setMin(z, str)).onErrorReturn(new setMax(this, str)).blockingFirst();
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getKey(String str, boolean z) {
        if (z) {
            return str;
        }
        StringBuilder sb = new StringBuilder("saving_");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            return sb.toString();
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final access$702 deserialize(Object obj, String str) {
        access$702 access_702 = (access$702) this.serializer.deserialize(obj.toString(), access$702.class);
        if (access_702 == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        if (str != null) {
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            access_702.setCategoryCode(upperCase);
            return access_702;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* access modifiers changed from: private */
    public final List<access$702> getSavingCategoriesFromSplit() {
        return (List) this.splitConfigEntityData.getSavingCategories().flatMap(new getMax(this)).onErrorReturn(new toIntRange(this)).blockingFirst();
    }

    /* access modifiers changed from: private */
    public final List<access$702> getSavingCategoriesFromAMCS() {
        JSONObject jSONObjectSafe;
        access$702 access_702;
        JSONObject savingSection = getSavingSection();
        if (savingSection == null) {
            return null;
        }
        List<access$702> arrayList = new ArrayList<>();
        Iterator<String> keys = savingSection.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "config.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNullExpressionValue(next, "it");
            if (!(!StringsKt.contains$default((CharSequence) next, (CharSequence) "saving_", false, 2, (Object) null) || (jSONObjectSafe = getPositiveString.getJSONObjectSafe(savingSection, next)) == null || (access_702 = (access$702) this.serializer.deserialize(jSONObjectSafe.toString(), access$702.class)) == null)) {
                String removePrefix = StringsKt.removePrefix(next, (CharSequence) "saving_");
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                if (removePrefix != null) {
                    String upperCase = removePrefix.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                    access_702.setCategoryCode(upperCase);
                    arrayList.add(access_702);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        return arrayList;
    }

    private final JSONObject getSavingSection() {
        return fromString.getSection(DanaLogConstants.TAG.SAVING);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lid/dana/data/saving/model/SavingCategoryEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<List<? extends access$702>> {
        final /* synthetic */ isNeedSignature getMin;

        getMin(isNeedSignature isneedsignature) {
            this.getMin = isneedsignature;
        }

        public final /* synthetic */ Object call() {
            return this.getMin.getSavingCategoriesFromSplit();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lid/dana/data/saving/model/SavingCategoryEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<List<? extends access$702>> {
        final /* synthetic */ isNeedSignature getMax;
        final /* synthetic */ String[] setMax;
        final /* synthetic */ boolean setMin;

        length(isNeedSignature isneedsignature, String[] strArr, boolean z) {
            this.getMax = isneedsignature;
            this.setMax = strArr;
            this.setMin = z;
        }

        public final /* synthetic */ Object call() {
            List arrayList = new ArrayList();
            for (String access$getSavingCategoriesFromSplit : this.setMax) {
                access$702 access$getSavingCategoriesFromSplit2 = this.getMax.getSavingCategoriesFromSplit(access$getSavingCategoriesFromSplit, this.setMin);
                if (access$getSavingCategoriesFromSplit2 != null) {
                    arrayList.add(access$getSavingCategoriesFromSplit2);
                }
            }
            return arrayList;
        }
    }
}
